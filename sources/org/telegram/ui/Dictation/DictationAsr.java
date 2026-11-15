package org.telegram.ui.Dictation;

import a3.h;
import a8.p0;
import ai.f1;
import ai.j;
import ai.j1;
import ai.k;
import ai.l;
import ai.o;
import ai.p;
import ai.q;
import ai.t;
import ai.u;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ki.r1;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.g0;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
public abstract class DictationAsr {
    public static boolean f42581c;
    public static volatile t[] f42579a = new t[0];
    public static volatile String[] f42580b = new String[0];
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final ExecutorService f42582e = Executors.newSingleThreadExecutor();
    public static final ExecutorService f42583f = Executors.newSingleThreadExecutor();
    public static final ArrayList f42584g = new ArrayList();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();

    public static boolean A() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = j1.d;
        if (j3 == 0 || elapsedRealtime - j3 > 60000) {
            j1.d = elapsedRealtime;
            if (j1.d()) {
                j1.e();
            }
        }
        ArrayList a10 = j1.a();
        if (a10 != null) {
            int size = a10.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = a10.get(i7);
                i7++;
                TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
                if (!tL_transcriptionModel.languages.isEmpty() && !tL_transcriptionModel.languages.contains("tinylid") && !tL_transcriptionModel.languages.contains("silero-vad")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean B() {
        if (A()) {
            for (t tVar : I()) {
                if (w(tVar)) {
                    return true;
                }
            }
            if (j1.b()) {
                return true;
            }
        }
        return false;
    }

    public static String[] C() {
        if (!f42581c) {
            L();
        }
        return f42580b;
    }

    public static void D(t tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(r(), tVar.a());
        File file2 = new File(r(), "silero_vad.onnx");
        try {
            long nativeLoad = nativeLoad(file.getAbsolutePath(), file2.getAbsolutePath());
            if (nativeLoad == 0) {
                Log.e("Dictation", "tinyasr: " + tVar.f1539a + " rejected (" + file.length() + " + " + file2.length() + " bytes)");
                file.delete();
                j1.g(file);
                SharedPreferences.Editor edit = np.e1().edit();
                StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
                sb2.append(tVar.f1539a);
                edit.remove(sb2.toString()).apply();
                tVar.f1544g = false;
                if (tVar.d == 0) {
                    g0.h3(new q(false, tVar));
                }
                o();
                return;
            }
            synchronized (tVar) {
                long j3 = tVar.d;
                tVar.d = nativeLoad;
                if (j3 != 0) {
                    if (tVar.f1542e > 0) {
                        tVar.f1543f.add(Long.valueOf(j3));
                    } else {
                        nativeFree(j3);
                    }
                }
            }
            Log.d("Dictation", "tinyasr: " + tVar.f1539a + " loaded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            g0.h3(new q(true, tVar));
        } catch (Throwable th2) {
            Log.e("Dictation", "tinyasr: load failed", th2);
            tVar.f1544g = false;
            g0.h3(new q(false, tVar));
        }
    }

    public static void E(String str) {
        if (h.remove(str) != null) {
            o();
        }
    }

    public static boolean F(long[] jArr) {
        ConcurrentHashMap concurrentHashMap;
        long j3 = 0;
        long j10 = 0;
        for (long[] jArr2 : h.values()) {
            long j11 = jArr2[0];
            j3 += j11;
            j10 += Math.max(j11, jArr2[1]);
        }
        jArr[0] = j3;
        jArr[1] = j10;
        return !concurrentHashMap.isEmpty();
    }

    public static t G(String str, a0 a0Var, boolean z10, boolean z11) {
        List list;
        t[] I;
        List list2;
        if (z10) {
            list = null;
        } else {
            list = (List) a0Var.d;
        }
        t tVar = (t) a0Var.f1713b;
        if (tVar.b(str) && m(str, tVar, list)) {
            return tVar;
        }
        for (t tVar2 : I()) {
            if (tVar2.b(str) && w(tVar2) && m(str, tVar2, list)) {
                return tVar2;
            }
        }
        t H = H(str);
        if (H == null || (((list2 = (List) a0Var.d) == null || !list2.contains(str)) && (!z11 || !m(str, H, list)))) {
            return null;
        }
        return H;
    }

    public static t H(String str) {
        t[] I;
        for (t tVar : I()) {
            if (tVar.b(str)) {
                return tVar;
            }
        }
        return null;
    }

    public static t[] I() {
        if (!f42581c) {
            L();
        }
        return f42579a;
    }

    public static void J() {
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
    }

    public static void K(r1 r1Var, boolean[] zArr, String str, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        g0.h3(new j(zArr, r1Var, str, iArr, z10, 0));
    }

    public static synchronized void L() {
        synchronized (DictationAsr.class) {
            try {
                f42581c = true;
                t[] tVarArr = f42579a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                File[] listFiles = r().listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        String name = file.getName();
                        if (name.endsWith(".tzf")) {
                            arrayList2.add(name.substring(0, name.length() - 4).split("-"));
                        }
                    }
                }
                ArrayList a10 = j1.a();
                if (a10 != null) {
                    int size = a10.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = a10.get(i7);
                        i7++;
                        TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
                        if (!tL_transcriptionModel.languages.isEmpty() && !tL_transcriptionModel.languages.contains("tinylid") && !tL_transcriptionModel.languages.contains("silero-vad")) {
                            String[] strArr = (String[]) tL_transcriptionModel.languages.toArray(new String[0]);
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            String[] strArr2 = strArr;
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                String[] strArr3 = (String[]) obj2;
                                String[] strArr4 = (String[]) strArr3.clone();
                                String[] strArr5 = (String[]) strArr.clone();
                                Arrays.sort(strArr4);
                                Arrays.sort(strArr5);
                                if (Arrays.equals(strArr4, strArr5)) {
                                    strArr2 = strArr3;
                                }
                            }
                            l(arrayList, tVarArr, strArr2, tL_transcriptionModel.document.size);
                        }
                    }
                }
                int size3 = arrayList2.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    String[] strArr6 = (String[]) obj3;
                    int size4 = arrayList.size();
                    boolean z10 = false;
                    int i12 = 0;
                    while (i12 < size4) {
                        Object obj4 = arrayList.get(i12);
                        i12++;
                        String[] strArr7 = (String[]) ((t) obj4).f1540b.clone();
                        String[] strArr8 = (String[]) strArr6.clone();
                        Arrays.sort(strArr7);
                        Arrays.sort(strArr8);
                        z10 |= Arrays.equals(strArr7, strArr8);
                    }
                    if (!z10) {
                        l(arrayList, tVarArr, strArr6, new File(r(), TextUtils.join("-", strArr6) + ".tzf").length());
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size5 = arrayList.size();
                int i13 = 0;
                while (i13 < size5) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    Collections.addAll(linkedHashSet, ((t) obj5).f1540b);
                }
                f42579a = (t[]) arrayList.toArray(new t[0]);
                f42580b = (String[]) linkedHashSet.toArray(new String[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void M(t tVar) {
        synchronized (tVar) {
            try {
                int i7 = tVar.f1542e - 1;
                tVar.f1542e = i7;
                if (i7 > 0) {
                    return;
                }
                ArrayList arrayList = tVar.f1543f;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    nativeFree(((Long) obj).longValue());
                }
                tVar.f1543f.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void N(Runnable runnable) {
        f42584g.remove(runnable);
    }

    public static a0 O(String str, ArrayList arrayList, ArrayList arrayList2) {
        t[] I;
        t H = H(str);
        int i7 = 0;
        if (H != null) {
            char c10 = 65535;
            for (t tVar : I()) {
                if (tVar.b(str)) {
                    int w10 = w(tVar);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        String str2 = (String) obj;
                        if (!str.equals(str2) && tVar.b(str2)) {
                            w10 += 10;
                        }
                    }
                    if (w10 > c10) {
                        H = tVar;
                        c10 = w10;
                    }
                }
            }
        }
        t tVar2 = H;
        StringBuilder sb2 = new StringBuilder(str);
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            String str3 = (String) obj2;
            if (!str3.equals(str) && tVar2.b(str3)) {
                sb2.append(',');
                sb2.append(str3);
            }
        }
        return new a0(tVar2, sb2.toString(), arrayList2, false, 7);
    }

    public static a0 P(ArrayList arrayList, boolean z10) {
        t tVar;
        String[] C;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String language = Locale.forLanguageTag((String) obj).getLanguage();
            if (!TextUtils.isEmpty(language) && !arrayList2.contains(language)) {
                arrayList2.add(language);
            }
        }
        if (!v()) {
            ArrayList arrayList3 = new ArrayList();
            for (String str : C()) {
                if (y(str)) {
                    arrayList3.add(str);
                }
            }
            if (!arrayList3.isEmpty()) {
                String str2 = (String) arrayList3.get(0);
                int size2 = arrayList2.size();
                while (true) {
                    if (i7 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i7);
                    i7++;
                    String str3 = (String) obj2;
                    if (arrayList3.contains(str3)) {
                        str2 = str3;
                        break;
                    }
                }
                return O(str2, arrayList3, arrayList2);
            }
        }
        if (z10 && x() && (arrayList2.isEmpty() || H((String) arrayList2.get(0)) == null)) {
            return null;
        }
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            String str4 = (String) obj3;
            if (H(str4) != null) {
                return O(str4, arrayList2, arrayList2);
            }
        }
        t[] I = I();
        if (I.length == 0) {
            CountDownLatch e10 = j1.e();
            if (e10 != null) {
                new Thread(new f1(e10, 0), "DictationModels").start();
            }
            return null;
        }
        t tVar2 = I[0];
        int length = I.length;
        while (true) {
            if (i7 < length) {
                t tVar3 = I[i7];
                if (w(tVar3)) {
                    tVar = tVar3;
                    break;
                }
                i7++;
            } else {
                tVar = tVar2;
                break;
            }
        }
        return new a0(tVar, TextUtils.join(",", tVar.f1540b), arrayList2, false, 7);
    }

    public static a0 Q(String[] strArr, float[] fArr, a0 a0Var, boolean z10) {
        if (strArr != null && fArr != null && strArr.length == fArr.length) {
            t[] I = I();
            if (I.length != 0) {
                t[] tVarArr = new t[fArr.length];
                float[] fArr2 = new float[I.length];
                for (int i7 = 0; i7 < fArr.length; i7++) {
                    if (fArr[i7] >= 0.1f) {
                        t G = G(strArr[i7], a0Var, z10, false);
                        tVarArr[i7] = G;
                        if (G != null) {
                            for (int i10 = 0; i10 < I.length; i10++) {
                                if (I[i10] == tVarArr[i7]) {
                                    fArr2[i10] = fArr2[i10] + fArr[i7];
                                }
                            }
                        }
                    }
                }
                int i11 = 0;
                for (int i12 = 1; i12 < I.length; i12++) {
                    if (fArr2[i12] > fArr2[i11]) {
                        i11 = i12;
                    }
                }
                if (fArr2[i11] != 0.0f) {
                    t tVar = I[i11];
                    StringBuilder sb2 = new StringBuilder();
                    int length = fArr.length;
                    Integer[] numArr = new Integer[length];
                    for (int i13 = 0; i13 < length; i13++) {
                        numArr[i13] = Integer.valueOf(i13);
                    }
                    Arrays.sort(numArr, new k(0, fArr));
                    for (int i14 = 0; i14 < length; i14++) {
                        int intValue = numArr[i14].intValue();
                        if (fArr[intValue] >= 0.1f && tVarArr[intValue] == tVar) {
                            if (sb2.length() > 0) {
                                sb2.append(',');
                            }
                            sb2.append(strArr[intValue]);
                        }
                    }
                    String i15 = a0Var.i();
                    if (tVar.b(i15)) {
                        if (!("," + ((Object) sb2) + ",").contains("," + i15 + ",")) {
                            sb2.append(',');
                            sb2.append(i15);
                        }
                    }
                    return new a0(tVar, sb2.toString(), (List) a0Var.d, false, 7);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static a0 R(String str, a0 a0Var, boolean z10) {
        t G = G(str, a0Var, z10, true);
        if (G == null) {
            return null;
        }
        return new a0(G, str, (List) a0Var.d, false, 7);
    }

    public static void S(String str) {
        np.e1().edit().putBoolean("asr_auto", false).putString("asr_langs", str).apply();
    }

    public static void T(boolean z10) {
        np.e1().edit().putBoolean("asr_auto", z10).apply();
    }

    public static String U() {
        String[] C;
        if (v()) {
            return null;
        }
        String str = null;
        for (String str2 : C()) {
            if (y(str2)) {
                if (str != null) {
                    return null;
                }
                str = str2;
            }
        }
        return str;
    }

    public static void V(t tVar, u uVar) {
        if (tVar.d != 0) {
            uVar.a(true);
        } else if (!w(tVar) && !j1.b()) {
            uVar.a(false);
        } else {
            tVar.f1546j.add(uVar);
            if (w(tVar)) {
                if (tVar.f1544g) {
                    return;
                }
                tVar.f1544g = true;
                d.execute(new p(tVar, 0));
                return;
            }
            t(tVar);
        }
    }

    public static void a(java.lang.String r18, boolean[] r19, ki.r1 r20, android.support.v4.media.session.a0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Dictation.DictationAsr.a(java.lang.String, boolean[], ki.r1, android.support.v4.media.session.a0):void");
    }

    public static void b(float[] fArr, a0 a0Var, r1 r1Var, boolean[] zArr) {
        long nativeFileNew;
        String nativeFileNext;
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
        t tVar = (t) a0Var.f1713b;
        long k10 = k(tVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = (k10 > 0L ? 1 : (k10 == 0L ? 0 : -1));
        if (i7 == 0) {
            nativeFileNew = 0;
        } else {
            nativeFileNew = nativeFileNew(k10, fArr, (String) a0Var.f1714c);
        }
        if (nativeFileNew == 0) {
            if (i7 != 0) {
                M(tVar);
            }
            Log.d("Dictation", "tinyasr: can't transcribe");
            g0.h3(new l(zArr, r1Var, 1));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (!zArr[0] && (nativeFileNext = nativeFileNext(nativeFileNew)) != null) {
            try {
                try {
                    n(sb2, new JSONArray(nativeFileNext), arrayList);
                } catch (Exception e10) {
                    Log.e("Dictation", "tinyasr: words " + nativeFileNext, e10);
                }
                K(r1Var, zArr, sb2.toString(), arrayList, false);
            } catch (Throwable th2) {
                nativeFileFree(nativeFileNew);
                M(tVar);
                throw th2;
            }
        }
        Log.d("Dictation", "tinyasr: file " + a0Var + " in " + nativeFileLang(nativeFileNew) + ", " + sb2.length() + " chars in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        nativeFileFree(nativeFileNew);
        M(tVar);
        K(r1Var, zArr, sb2.toString(), arrayList, true);
    }

    public static boolean h(JSONArray jSONArray, JSONArray jSONArray2) {
        JSONObject jSONObject;
        if (jSONArray == null || jSONArray.length() <= 0) {
            jSONArray = jSONArray2;
        }
        if (jSONArray != null) {
            jSONObject = jSONArray.optJSONObject(0);
        } else {
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.optBoolean("join")) {
            return false;
        }
        return true;
    }

    public static String j(long j3, byte[] bArr, int i7, int i10) {
        return nativeSessionPush(j3, bArr, i7, i10);
    }

    public static long k(t tVar) {
        long j3;
        synchronized (tVar) {
            if (tVar.d != 0) {
                tVar.f1542e++;
            }
            j3 = tVar.d;
        }
        return j3;
    }

    public static void l(ArrayList arrayList, t[] tVarArr, String[] strArr, long j3) {
        String join = TextUtils.join("-", strArr);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((t) obj).f1539a.equals(join)) {
                return;
            }
        }
        for (t tVar : tVarArr) {
            if (tVar.f1539a.equals(join)) {
                if (j3 > 0) {
                    tVar.f1541c = j3;
                }
                arrayList.add(tVar);
                return;
            }
        }
        arrayList.add(new t(join, strArr, j3));
    }

    public static boolean m(String str, t tVar, List list) {
        if (list == null || "en".equals(str) || list.contains(str) || (!v() && y(str))) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!"en".equals(str2) && tVar.b(str2)) {
                return false;
            }
        }
        return true;
    }

    public static void n(StringBuilder sb2, JSONArray jSONArray, ArrayList arrayList) {
        String str;
        if (jSONArray != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                if (optJSONObject != null) {
                    str = optJSONObject.optString("text");
                } else {
                    str = "";
                }
                if (!str.isEmpty()) {
                    if (sb2.length() > 0 && !optJSONObject.optBoolean("join")) {
                        sb2.append(' ');
                    }
                    if (arrayList != null) {
                        arrayList.add(Integer.valueOf(sb2.length()));
                        arrayList.add(Integer.valueOf(str.length() + sb2.length()));
                        arrayList.add(Integer.valueOf(Math.round(((float) optJSONObject.optDouble("start")) * 1000.0f)));
                        arrayList.add(Integer.valueOf(Math.round(((float) optJSONObject.optDouble("end")) * 1000.0f)));
                    }
                    sb2.append(str);
                }
            }
        }
    }

    private static native float[] nativeDecode(String str);

    public static native void nativeFileFree(long j3);

    private static native String nativeFileLang(long j3);

    public static native long nativeFileNew(long j3, float[] fArr, String str);

    public static native String nativeFileNext(long j3);

    private static native void nativeFree(long j3);

    private static native long nativeLoad(String str, String str2);

    private static native void nativePinFast();

    public static native String nativeSessionFinish(long j3);

    public static native void nativeSessionFree(long j3);

    public static native long nativeSessionNew(long j3, String str, String str2);

    public static native String nativeSessionPush(long j3, byte[] bArr, int i7, int i10);

    public static void o() {
        g0.h3(new o(0));
    }

    public static String p(String str, String str2, boolean z10) {
        if (str.isEmpty()) {
            return str2;
        }
        if (str2.isEmpty()) {
            return str;
        }
        if (z10) {
            return str.concat(str2);
        }
        return p0.E(str, " ", str2);
    }

    public static void q() {
        t[] I;
        for (t tVar : I()) {
            synchronized (tVar) {
                try {
                    if (tVar.d != 0) {
                        if (tVar.f1542e > 0) {
                            tVar.f1543f.add(Long.valueOf(tVar.d));
                        } else {
                            nativeFree(tVar.d);
                        }
                        tVar.d = 0L;
                    }
                    tVar.f1544g = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        File[] listFiles = r().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        Context context = t0.f26609b;
        ExecutorService executorService = DictationLid.f42585a;
        File file2 = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        file2.delete();
        j1.g(file2);
        np.e1().edit().remove("tinylid_etag").remove("tinylid_checked").apply();
        DictationLid.f42588e = false;
        DictationLid.f42585a.execute(new o(2));
        SharedPreferences.Editor edit = np.e1().edit();
        for (String str : np.e1().getAll().keySet()) {
            if (str.startsWith("tinyasr_etag_") || str.startsWith("tinyasr_checked_")) {
                edit.remove(str);
            }
        }
        edit.apply();
        SharedPreferences.Editor edit2 = np.e1().edit();
        for (String str2 : np.e1().getAll().keySet()) {
            if (str2.startsWith("speech_doc_")) {
                edit2.remove(str2);
            }
        }
        edit2.apply();
        L();
        Log.d("Dictation", "tinyasr: models, VAD and tinylid deleted");
        o();
    }

    public static File r() {
        return new File(t0.f26609b.getFilesDir(), "tinyasr");
    }

    public static void s(t tVar) {
        if (tVar != null && !w(tVar)) {
            t(tVar);
        }
    }

    public static void t(t tVar) {
        long j3;
        long j10;
        if (tVar.h) {
            return;
        }
        tVar.h = true;
        tVar.f1545i = 0.0f;
        if (!new File(r(), "silero_vad.onnx").exists()) {
            TLRPC.TL_transcriptionModel f10 = j1.f(j1.a(), "silero-vad");
            if (f10 != null) {
                j3 = f10.document.size;
            } else {
                j3 = 0;
            }
            if (j3 > 0) {
                TLRPC.TL_transcriptionModel f11 = j1.f(j1.a(), "silero-vad");
                if (f11 != null) {
                    j10 = f11.document.size;
                } else {
                    j10 = 0;
                }
            } else {
                j10 = 2300000;
            }
            h.putIfAbsent("silero_vad.onnx", new long[]{0, j10});
            o();
        }
        if (!new File(r(), tVar.a()).exists()) {
            h.putIfAbsent(tVar.a(), new long[]{0, tVar.f1541c});
            o();
        }
        o();
        f42582e.execute(new p(tVar, 1));
    }

    public static int u(String str, TLRPC.TL_transcriptionModel tL_transcriptionModel, t tVar) {
        File file = new File(r(), str);
        if (tL_transcriptionModel == null && !file.exists()) {
            Log.d("Dictation", "tinyasr: " + str + " isn't on the server");
        }
        try {
            return j1.c(tL_transcriptionModel, file, new h(str, tVar, new long[]{0}));
        } finally {
            E(str);
        }
    }

    public static boolean v() {
        return np.e1().getBoolean("asr_auto", true);
    }

    public static boolean w(t tVar) {
        if (tVar != null && new File(r(), tVar.a()).exists() && new File(r(), "silero_vad.onnx").exists()) {
            return true;
        }
        return false;
    }

    public static boolean x() {
        return np.e1().getBoolean("asr_google", false);
    }

    public static boolean y(String str) {
        t[] I;
        String string = np.e1().getString("asr_langs", null);
        if (string == null) {
            for (t tVar : I()) {
                if (tVar.b(str) && w(tVar)) {
                    return true;
                }
            }
            return false;
        }
        return p0.p(",", string, ",").contains("," + str + ",");
    }

    public static boolean z(int i7) {
        String str;
        SharedPreferences e12 = np.e1();
        if (m10.i(i7).q()) {
            str = "asr_local_premium";
        } else {
            str = "asr_local_free";
        }
        return e12.getBoolean(str, !m10.i(i7).q());
    }
}
