package org.telegram.ui.Dictation;

import a8.p0;
import ai.i;
import ai.j1;
import ai.l;
import ai.n;
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
import ii.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
public abstract class DictationAsr {
    public static boolean f43025c;
    public static int f43029i;
    public static volatile t[] f43023a = new t[0];
    public static volatile String[] f43024b = new String[0];
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final ExecutorService f43026e = Executors.newSingleThreadExecutor();
    public static final ExecutorService f43027f = Executors.newSingleThreadExecutor();
    public static final ArrayList f43028g = new ArrayList();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();

    public static boolean A() {
        if (u(j10.f24773t0) && j1.h()) {
            return true;
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
        if (!f43025c) {
            L();
        }
        return f43024b;
    }

    public static void D(t tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(q(), tVar.a());
        File file2 = new File(q(), "silero_vad.onnx");
        try {
            long nativeLoad = nativeLoad(file.getAbsolutePath(), file2.getAbsolutePath());
            if (nativeLoad == 0) {
                Log.e("Dictation", "tinyasr: " + tVar.f1530a + " rejected (" + file.length() + " + " + file2.length() + " bytes)");
                file.delete();
                j1.g(file);
                SharedPreferences.Editor edit = mp.g1().edit();
                StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
                sb2.append(tVar.f1530a);
                edit.remove(sb2.toString()).apply();
                tVar.f1535g = false;
                if (tVar.d == 0) {
                    g0.g3(new q(false, tVar, 1));
                }
                n();
                return;
            }
            synchronized (tVar) {
                long j3 = tVar.d;
                tVar.d = nativeLoad;
                if (j3 != 0) {
                    if (tVar.f1533e > 0) {
                        tVar.f1534f.add(Long.valueOf(j3));
                    } else {
                        nativeFree(j3);
                    }
                }
            }
            Log.d("Dictation", "tinyasr: " + tVar.f1530a + " loaded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            g0.g3(new q(true, tVar, 1));
        } catch (Throwable th2) {
            Log.e("Dictation", "tinyasr: load failed", th2);
            tVar.f1535g = false;
            g0.g3(new q(false, tVar, 1));
        }
    }

    public static void E(String str) {
        if (h.remove(str) != null) {
            n();
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
        t tVar = (t) a0Var.f1704b;
        if (tVar.b(str) && l(str, tVar, list)) {
            return tVar;
        }
        for (t tVar2 : I()) {
            if (tVar2.b(str) && w(tVar2) && l(str, tVar2, list)) {
                return tVar2;
            }
        }
        t H = H(str);
        if (H == null || (((list2 = (List) a0Var.d) == null || !list2.contains(str)) && (!z11 || !l(str, H, list)))) {
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
        if (!f43025c) {
            L();
        }
        return f43023a;
    }

    public static void J() {
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
    }

    public static void K(h hVar, boolean[] zArr, String str, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        g0.g3(new n(zArr, hVar, str, iArr, z10, 0));
    }

    public static synchronized void L() {
        synchronized (DictationAsr.class) {
            try {
                f43025c = true;
                t[] tVarArr = f43023a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                File[] listFiles = q().listFiles();
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
                            k(arrayList, tVarArr, strArr2, tL_transcriptionModel.document.size);
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
                        String[] strArr7 = (String[]) ((t) obj4).f1531b.clone();
                        String[] strArr8 = (String[]) strArr6.clone();
                        Arrays.sort(strArr7);
                        Arrays.sort(strArr8);
                        z10 |= Arrays.equals(strArr7, strArr8);
                    }
                    if (!z10) {
                        k(arrayList, tVarArr, strArr6, new File(q(), TextUtils.join("-", strArr6) + ".tzf").length());
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size5 = arrayList.size();
                int i13 = 0;
                while (i13 < size5) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    Collections.addAll(linkedHashSet, ((t) obj5).f1531b);
                }
                f43023a = (t[]) arrayList.toArray(new t[0]);
                f43024b = (String[]) linkedHashSet.toArray(new String[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void M(t tVar) {
        synchronized (tVar) {
            try {
                int i7 = tVar.f1533e - 1;
                tVar.f1533e = i7;
                if (i7 > 0) {
                    return;
                }
                ArrayList arrayList = tVar.f1534f;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    nativeFree(((Long) obj).longValue());
                }
                tVar.f1534f.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void N(Runnable runnable) {
        f43028g.remove(runnable);
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
            j1.j();
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
        return new a0(tVar, TextUtils.join(",", tVar.f1531b), arrayList2, false, 7);
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
                    Arrays.sort(numArr, new l(0, fArr));
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
        mp.g1().edit().putBoolean("asr_auto", false).putString("asr_langs", str).apply();
    }

    public static void T(boolean z10) {
        mp.g1().edit().putBoolean("asr_auto", z10).apply();
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

    public static void V(float[] fArr, a0 a0Var, h hVar, boolean[] zArr) {
        int i7;
        long nativeFileNew;
        String nativeFileNext;
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
        t tVar = (t) a0Var.f1704b;
        long j3 = j(tVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0) {
            nativeFileNew = 0;
        } else {
            String str = (String) a0Var.f1705c;
            if (bz.o() == 0) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            nativeFileNew = nativeFileNew(j3, fArr, str, i7);
        }
        if (nativeFileNew == 0) {
            if (i10 != 0) {
                M(tVar);
            }
            Log.d("Dictation", "tinyasr: can't transcribe");
            g0.g3(new i(zArr, hVar, 0));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (!zArr[0] && (nativeFileNext = nativeFileNext(nativeFileNew)) != null) {
            try {
                try {
                    m(sb2, new JSONArray(nativeFileNext), arrayList);
                } catch (Exception e10) {
                    Log.e("Dictation", "tinyasr: words " + nativeFileNext, e10);
                }
                K(hVar, zArr, sb2.toString(), arrayList, false);
            } catch (Throwable th2) {
                nativeFileFree(nativeFileNew);
                M(tVar);
                throw th2;
            }
        }
        Log.d("Dictation", "tinyasr: file " + a0Var + " in " + nativeFileLang(nativeFileNew) + ", " + sb2.length() + " chars in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        nativeFileFree(nativeFileNew);
        M(tVar);
        K(hVar, zArr, sb2.toString(), arrayList, true);
    }

    public static t W(String str) {
        t[] I;
        for (t tVar : I()) {
            if (tVar.b(str) && w(tVar)) {
                ArrayList a10 = j1.a();
                if (j1.i(j1.f(a10, tVar.f1531b), new File(q(), tVar.a())) || j1.i(j1.f(a10, "silero-vad"), new File(q(), "silero_vad.onnx"))) {
                    return tVar;
                }
            }
        }
        return null;
    }

    public static int X() {
        if (f43029i == 0) {
            try {
                f43029i = nativeVersion();
            } catch (Throwable unused) {
                f43029i = 1;
            }
        }
        return f43029i;
    }

    public static void Y(t tVar, u uVar) {
        if (tVar.d != 0) {
            uVar.a(true);
        } else if (!w(tVar) && !j1.b()) {
            uVar.a(false);
        } else {
            tVar.f1537j.add(uVar);
            if (w(tVar)) {
                if (tVar.f1535g) {
                    return;
                }
                tVar.f1535g = true;
                d.execute(new p(tVar, 0));
                return;
            }
            s(tVar, false);
        }
    }

    public static void a(java.lang.String r19, boolean[] r20, ii.h r21, android.support.v4.media.session.a0 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Dictation.DictationAsr.a(java.lang.String, boolean[], ii.h, android.support.v4.media.session.a0):void");
    }

    public static boolean g(JSONArray jSONArray, JSONArray jSONArray2) {
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

    public static String i(long j3, byte[] bArr, int i7, int i10) {
        return nativeSessionPush(j3, bArr, i7, i10);
    }

    public static long j(t tVar) {
        long j3;
        synchronized (tVar) {
            if (tVar.d != 0) {
                tVar.f1533e++;
            }
            j3 = tVar.d;
        }
        return j3;
    }

    public static void k(ArrayList arrayList, t[] tVarArr, String[] strArr, long j3) {
        String join = TextUtils.join("-", strArr);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((t) obj).f1530a.equals(join)) {
                return;
            }
        }
        for (t tVar : tVarArr) {
            if (tVar.f1530a.equals(join)) {
                if (j3 > 0) {
                    tVar.f1532c = j3;
                }
                arrayList.add(tVar);
                return;
            }
        }
        arrayList.add(new t(join, strArr, j3));
    }

    public static boolean l(String str, t tVar, List list) {
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

    public static void m(StringBuilder sb2, JSONArray jSONArray, ArrayList arrayList) {
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

    public static void n() {
        g0.g3(new o(0));
    }

    private static native float[] nativeDecode(String str);

    public static native void nativeFileFree(long j3);

    private static native String nativeFileLang(long j3);

    public static native long nativeFileNew(long j3, float[] fArr, String str, int i7);

    public static native String nativeFileNext(long j3);

    private static native void nativeFree(long j3);

    private static native long nativeLoad(String str, String str2);

    private static native void nativePinFast();

    public static native String nativeSessionFinish(long j3);

    public static native void nativeSessionFree(long j3);

    public static native long nativeSessionNew(long j3, String str, String str2, int i7);

    public static native String nativeSessionPush(long j3, byte[] bArr, int i7, int i10);

    private static native int nativeVersion();

    public static String o(String str, String str2, boolean z10) {
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

    public static void p() {
        t[] I;
        for (t tVar : I()) {
            synchronized (tVar) {
                try {
                    if (tVar.d != 0) {
                        if (tVar.f1533e > 0) {
                            tVar.f1534f.add(Long.valueOf(tVar.d));
                        } else {
                            nativeFree(tVar.d);
                        }
                        tVar.d = 0L;
                    }
                    tVar.f1535g = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        File[] listFiles = q().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        Context context = t0.f26915b;
        ExecutorService executorService = DictationLid.f43030a;
        File file2 = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        file2.delete();
        j1.g(file2);
        mp.g1().edit().remove("tinylid_etag").remove("tinylid_checked").apply();
        DictationLid.f43033e = false;
        DictationLid.f43030a.execute(new o(2));
        SharedPreferences.Editor edit = mp.g1().edit();
        for (String str : mp.g1().getAll().keySet()) {
            if (str.startsWith("tinyasr_etag_") || str.startsWith("tinyasr_checked_")) {
                edit.remove(str);
            }
        }
        edit.apply();
        SharedPreferences.Editor edit2 = mp.g1().edit();
        for (String str2 : mp.g1().getAll().keySet()) {
            if (str2.startsWith("speech_doc_")) {
                edit2.remove(str2);
            }
        }
        edit2.apply();
        L();
        Log.d("Dictation", "tinyasr: models, VAD and tinylid deleted");
        n();
    }

    public static File q() {
        return new File(t0.f26915b.getFilesDir(), "tinyasr");
    }

    public static void r(t tVar) {
        if (tVar != null && !w(tVar)) {
            s(tVar, false);
        }
    }

    public static void s(t tVar, boolean z10) {
        long j3;
        long j10;
        if (tVar.h) {
            return;
        }
        tVar.h = true;
        tVar.f1536i = 0.0f;
        if (!new File(q(), "silero_vad.onnx").exists()) {
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
            n();
        }
        if (!new File(q(), tVar.a()).exists()) {
            h.putIfAbsent(tVar.a(), new long[]{0, tVar.f1532c});
            n();
        }
        n();
        f43026e.execute(new q(z10, tVar, 0));
    }

    public static int t(String str, TLRPC.TL_transcriptionModel tL_transcriptionModel, t tVar, boolean z10) {
        File file = new File(q(), str);
        if (tL_transcriptionModel == null && !file.exists()) {
            Log.d("Dictation", "tinyasr: " + str + " isn't on the server");
        }
        try {
            return j1.c(tL_transcriptionModel, file, z10, new a3.h(str, tVar, new long[]{0}));
        } finally {
            E(str);
        }
    }

    public static boolean u(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Dictation.DictationAsr.u(int):boolean");
    }

    public static boolean v() {
        return mp.g1().getBoolean("asr_auto", true);
    }

    public static boolean w(t tVar) {
        if (tVar != null && new File(q(), tVar.a()).exists() && new File(q(), "silero_vad.onnx").exists()) {
            return true;
        }
        return false;
    }

    public static boolean x() {
        return mp.g1().getBoolean("asr_google", false);
    }

    public static boolean y(String str) {
        t[] I;
        String string = mp.g1().getString("asr_langs", null);
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
        SharedPreferences g12 = mp.g1();
        if (j10.i(i7).q()) {
            str = "asr_local_premium";
        } else {
            str = "asr_local_free";
        }
        return g12.getBoolean(str, !j10.i(i7).q());
    }
}
