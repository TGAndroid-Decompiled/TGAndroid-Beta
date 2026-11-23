package org.telegram.ui.Dictation;

import a3.h;
import a8.p0;
import ai.e;
import ai.f;
import ai.g1;
import ai.i;
import ai.j;
import ai.k;
import ai.o;
import ai.p;
import ai.q;
import android.content.Context;
import android.content.SharedPreferences;
import android.icu.util.ULocale;
import android.os.Build;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h21;
public abstract class DictationAsr {
    public static boolean f43035c;
    public static int f43039i;
    public static volatile p[] f43033a = new p[0];
    public static volatile String[] f43034b = new String[0];
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final ExecutorService f43036e = Executors.newSingleThreadExecutor();
    public static final ExecutorService f43037f = Executors.newSingleThreadExecutor();
    public static final ArrayList f43038g = new ArrayList();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();

    public static boolean A(int i7) {
        String str;
        SharedPreferences g12 = np.g1();
        if (k10.i(i7).q()) {
            str = "asr_local_premium";
        } else {
            str = "asr_local_free";
        }
        return g12.getBoolean(str, !k10.i(i7).q());
    }

    public static boolean B() {
        if (w(k10.f24932t0) && g1.h()) {
            return true;
        }
        return false;
    }

    public static boolean C() {
        if (B()) {
            for (p pVar : J()) {
                if (y(pVar)) {
                    return true;
                }
            }
            if (g1.b()) {
                return true;
            }
        }
        return false;
    }

    public static String[] D() {
        if (!f43035c) {
            O();
        }
        return f43034b;
    }

    public static void E(p pVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(s(), pVar.b());
        File file2 = new File(s(), "silero_vad.onnx");
        try {
            long nativeLoad = nativeLoad(file.getAbsolutePath(), file2.getAbsolutePath());
            if (nativeLoad == 0) {
                Log.e("Dictation", "tinyasr: " + pVar.f1442a + " rejected (" + file.length() + " + " + file2.length() + " bytes)");
                file.delete();
                g1.g(file);
                SharedPreferences.Editor edit = np.g1().edit();
                StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
                sb2.append(pVar.f1442a);
                edit.remove(sb2.toString()).apply();
                pVar.f1448i = false;
                if (pVar.f1446f == 0) {
                    g0.g3(new k(false, pVar, 1));
                }
                p();
                return;
            }
            String[] nativeLangs = nativeLangs(nativeLoad);
            if (nativeLangs != null && nativeLangs.length > 0) {
                pVar.d = nativeLangs;
            }
            synchronized (pVar) {
                long j3 = pVar.f1446f;
                pVar.f1446f = nativeLoad;
                if (j3 != 0) {
                    if (pVar.f1447g > 0) {
                        pVar.h.add(Long.valueOf(j3));
                    } else {
                        nativeFree(j3);
                    }
                }
            }
            Log.d("Dictation", "tinyasr: " + pVar.f1442a + " loaded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            g0.g3(new k(true, pVar, 1));
        } catch (Throwable th2) {
            Log.e("Dictation", "tinyasr: load failed", th2);
            pVar.f1448i = false;
            g0.g3(new k(false, pVar, 1));
        }
    }

    public static void F(String str) {
        if (h.remove(str) != null) {
            p();
        }
    }

    public static boolean G(long[] jArr) {
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

    public static p H(String str, a0 a0Var, boolean z10, boolean z11) {
        List list;
        p[] J;
        List list2;
        if (z10) {
            list = null;
        } else {
            list = (List) a0Var.d;
        }
        p pVar = (p) a0Var.f1675b;
        if (pVar.c(str) && m(str, pVar, list)) {
            return pVar;
        }
        for (p pVar2 : J()) {
            if (pVar2.c(str) && y(pVar2) && m(str, pVar2, list)) {
                return pVar2;
            }
        }
        p I = I(str);
        if (I == null || (((list2 = (List) a0Var.d) == null || !list2.contains(str)) && (!z11 || !m(str, I, list)))) {
            return null;
        }
        return I;
    }

    public static p I(String str) {
        p[] J;
        p pVar = null;
        for (p pVar2 : J()) {
            if (pVar2.c(str) && (pVar == null || N(pVar2, str) > N(pVar, str))) {
                pVar = pVar2;
            }
        }
        return pVar;
    }

    public static p[] J() {
        if (!f43035c) {
            O();
        }
        return f43033a;
    }

    public static String K(String[] strArr) {
        for (String str : strArr) {
            if (str.indexOf(45) >= 0) {
                return TextUtils.join("+", strArr);
            }
        }
        return TextUtils.join("-", strArr);
    }

    public static void L() {
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
    }

    public static void M(h21 h21Var, boolean[] zArr, String str, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        g0.g3(new e(zArr, h21Var, str, iArr, z10, 0));
    }

    public static int N(p pVar, String str) {
        int i7;
        String[] d2 = pVar.d(str);
        int i10 = 0;
        for (String str2 : d2) {
            if (str2.indexOf(45) >= 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            i10 |= i7;
        }
        return (d2.length * 2) + i10;
    }

    public static synchronized void O() {
        p pVar;
        int i7;
        boolean z10;
        int i10;
        String[] strArr;
        synchronized (DictationAsr.class) {
            try {
                f43035c = true;
                p[] pVarArr = f43033a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                File[] listFiles = s().listFiles();
                int i11 = 0;
                if (listFiles != null) {
                    for (File file : listFiles) {
                        String name = file.getName();
                        if (name.endsWith(".tzf")) {
                            String substring = name.substring(0, name.length() - 4);
                            if (substring.indexOf(43) >= 0) {
                                strArr = substring.split("\\+");
                            } else {
                                String[] split = substring.split("-");
                                int length = split.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 < length) {
                                        if (!split[i12].matches("[a-z]{2,3}")) {
                                            strArr = new String[]{substring};
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        strArr = split;
                                        break;
                                    }
                                }
                            }
                            arrayList2.add(strArr);
                        }
                    }
                }
                ArrayList a10 = g1.a();
                if (a10 != null) {
                    int size = a10.size();
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) a10.get(i13);
                        if (!tL_transcriptionModel.languages.isEmpty() && !tL_transcriptionModel.languages.contains("tinylid") && !tL_transcriptionModel.languages.contains("silero-vad")) {
                            String[] strArr2 = (String[]) tL_transcriptionModel.languages.toArray(new String[0]);
                            int size2 = arrayList2.size();
                            String[] strArr3 = strArr2;
                            int i15 = 0;
                            while (i15 < size2) {
                                Object obj = arrayList2.get(i15);
                                i15++;
                                String[] strArr4 = (String[]) obj;
                                if (V(strArr4, strArr2)) {
                                    strArr3 = strArr4;
                                }
                            }
                            l(arrayList, pVarArr, strArr3, strArr2, tL_transcriptionModel.document.size);
                        }
                        i13 = i14;
                    }
                }
                int size3 = arrayList2.size();
                int i16 = 0;
                while (i16 < size3) {
                    int i17 = i16 + 1;
                    String[] strArr5 = (String[]) arrayList2.get(i16);
                    int size4 = arrayList.size();
                    boolean z11 = false;
                    int i18 = 0;
                    while (i18 < size4) {
                        Object obj2 = arrayList.get(i18);
                        i18++;
                        z11 |= V(((p) obj2).f1444c, strArr5);
                    }
                    if (!z11) {
                        l(arrayList, pVarArr, strArr5, strArr5, new File(s(), K(strArr5) + ".tzf").length());
                    }
                    i16 = i17;
                }
                loop6: while (true) {
                    int size5 = arrayList.size();
                    int i19 = i11;
                    while (i19 < size5) {
                        Object obj3 = arrayList.get(i19);
                        i19++;
                        pVar = (p) obj3;
                        String[] strArr6 = pVar.f1443b;
                        int length2 = strArr6.length;
                        int i20 = i11;
                        int i21 = i20;
                        while (i20 < length2) {
                            String str = strArr6[i20];
                            int N = N(pVar, str);
                            int size6 = arrayList.size();
                            int i22 = i11;
                            int i23 = i22;
                            while (i23 < size6) {
                                Object obj4 = arrayList.get(i23);
                                i23++;
                                p pVar2 = (p) obj4;
                                if (pVar2 != pVar) {
                                    i22 = Math.max(i22, N(pVar2, str));
                                }
                            }
                            if (i22 >= N && i22 != 0) {
                                if (i22 > N) {
                                    i10 = 1;
                                } else {
                                    i10 = i11;
                                }
                                i21 |= i10;
                                i20++;
                            }
                            i7 = i11;
                            break;
                        }
                        i7 = 1;
                        int size7 = arrayList.size();
                        int i24 = i11;
                        while (i24 < size7) {
                            Object obj5 = arrayList.get(i24);
                            i24++;
                            p pVar3 = (p) obj5;
                            if (i21 == 0 && pVar3 != pVar) {
                                int length3 = pVar3.f1443b.length;
                                String[] strArr7 = pVar.f1443b;
                                if (length3 > strArr7.length) {
                                    int length4 = strArr7.length;
                                    boolean z12 = true;
                                    for (int i25 = i11; i25 < length4; i25++) {
                                        String str2 = strArr7[i25];
                                        if (N(pVar3, str2) >= N(pVar, str2)) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        z12 &= z10;
                                    }
                                    if (z12) {
                                        i7 = 1;
                                        i21 = 1;
                                    }
                                }
                            }
                            i11 = 0;
                        }
                        if (i7 == 0 || i21 == 0) {
                            i11 = 0;
                        }
                    }
                    arrayList.remove(pVar);
                    i11 = 0;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size8 = arrayList.size();
                int i26 = 0;
                while (i26 < size8) {
                    Object obj6 = arrayList.get(i26);
                    i26++;
                    Collections.addAll(linkedHashSet, ((p) obj6).f1443b);
                }
                f43033a = (p[]) arrayList.toArray(new p[0]);
                f43034b = (String[]) linkedHashSet.toArray(new String[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void P(p pVar) {
        synchronized (pVar) {
            try {
                int i7 = pVar.f1447g - 1;
                pVar.f1447g = i7;
                if (i7 > 0) {
                    return;
                }
                ArrayList arrayList = pVar.h;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    nativeFree(((Long) obj).longValue());
                }
                pVar.h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void Q(Runnable runnable) {
        f43038g.remove(runnable);
    }

    public static a0 R(String str, ArrayList arrayList, ArrayList arrayList2) {
        p[] J;
        p I = I(str);
        int i7 = 0;
        if (I != null) {
            int i10 = -1;
            for (p pVar : J()) {
                if (pVar.c(str)) {
                    int N = (y(pVar) ? 1 : 0) + (N(pVar, str) * 1000);
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        String str2 = (String) obj;
                        if (!str.equals(str2) && pVar.c(str2)) {
                            N += 10;
                        }
                    }
                    if (N > i10) {
                        I = pVar;
                        i10 = N;
                    }
                }
            }
        }
        p pVar2 = I;
        StringBuilder sb2 = new StringBuilder(str);
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            String str3 = (String) obj2;
            if (!str3.equals(str) && pVar2.c(str3)) {
                sb2.append(',');
                sb2.append(str3);
            }
        }
        return new a0(pVar2, sb2.toString(), arrayList2, false, 7);
    }

    public static a0 S(ArrayList arrayList) {
        p pVar;
        String[] D;
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
        if (!x()) {
            ArrayList arrayList3 = new ArrayList();
            for (String str : D()) {
                if (z(str)) {
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
                return R(str2, arrayList3, arrayList2);
            }
        }
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            String str4 = (String) obj3;
            if (I(str4) != null) {
                return R(str4, arrayList2, arrayList2);
            }
        }
        p[] J = J();
        if (J.length == 0) {
            g1.j();
            return null;
        }
        p pVar2 = J[0];
        int length = J.length;
        while (true) {
            if (i7 < length) {
                p pVar3 = J[i7];
                if (y(pVar3)) {
                    pVar = pVar3;
                    break;
                }
                i7++;
            } else {
                pVar = pVar2;
                break;
            }
        }
        return new a0(pVar, TextUtils.join(",", pVar.f1443b), arrayList2, false, 7);
    }

    public static a0 T(String[] strArr, float[] fArr, a0 a0Var, boolean z10) {
        if (strArr != null && fArr != null && strArr.length == fArr.length) {
            p[] J = J();
            if (J.length != 0) {
                p[] pVarArr = new p[fArr.length];
                float[] fArr2 = new float[J.length];
                for (int i7 = 0; i7 < fArr.length; i7++) {
                    if (fArr[i7] >= 0.1f) {
                        p H = H(strArr[i7], a0Var, z10, false);
                        pVarArr[i7] = H;
                        if (H != null) {
                            for (int i10 = 0; i10 < J.length; i10++) {
                                if (J[i10] == pVarArr[i7]) {
                                    fArr2[i10] = fArr2[i10] + fArr[i7];
                                }
                            }
                        }
                    }
                }
                int i11 = 0;
                for (int i12 = 1; i12 < J.length; i12++) {
                    if (fArr2[i12] > fArr2[i11]) {
                        i11 = i12;
                    }
                }
                if (fArr2[i11] != 0.0f) {
                    p pVar = J[i11];
                    StringBuilder sb2 = new StringBuilder();
                    int length = fArr.length;
                    Integer[] numArr = new Integer[length];
                    for (int i13 = 0; i13 < length; i13++) {
                        numArr[i13] = Integer.valueOf(i13);
                    }
                    Arrays.sort(numArr, new o(0, fArr));
                    for (int i14 = 0; i14 < length; i14++) {
                        int intValue = numArr[i14].intValue();
                        if (fArr[intValue] >= 0.1f && pVarArr[intValue] == pVar) {
                            if (sb2.length() > 0) {
                                sb2.append(',');
                            }
                            sb2.append(strArr[intValue]);
                        }
                    }
                    String i15 = a0Var.i();
                    if (pVar.c(i15)) {
                        if (!("," + ((Object) sb2) + ",").contains("," + i15 + ",")) {
                            sb2.append(',');
                            sb2.append(i15);
                        }
                    }
                    return new a0(pVar, sb2.toString(), (List) a0Var.d, false, 7);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static a0 U(String str, a0 a0Var, boolean z10) {
        p H = H(str, a0Var, z10, true);
        if (H == null) {
            return null;
        }
        return new a0(H, str, (List) a0Var.d, false, 7);
    }

    public static boolean V(String[] strArr, String[] strArr2) {
        String[] strArr3 = new String[strArr.length];
        String[] strArr4 = new String[strArr2.length];
        for (int i7 = 0; i7 < strArr.length; i7++) {
            strArr3[i7] = strArr[i7].toLowerCase(Locale.ROOT);
        }
        for (int i10 = 0; i10 < strArr2.length; i10++) {
            strArr4[i10] = strArr2[i10].toLowerCase(Locale.ROOT);
        }
        Arrays.sort(strArr3);
        Arrays.sort(strArr4);
        return Arrays.equals(strArr3, strArr4);
    }

    public static void W(String str) {
        np.g1().edit().putBoolean("asr_auto", false).putString("asr_langs", str).apply();
    }

    public static void X(boolean z10) {
        np.g1().edit().putBoolean("asr_auto", z10).apply();
    }

    public static void Y(String str, String str2) {
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putString("asr_variant_" + str, str2).apply();
    }

    public static String Z() {
        String[] D;
        if (x()) {
            return null;
        }
        String str = null;
        for (String str2 : D()) {
            if (z(str2)) {
                if (str != null) {
                    return null;
                }
                str = str2;
            }
        }
        return str;
    }

    public static void a(java.lang.String r19, boolean[] r20, org.telegram.ui.Components.h21 r21, android.support.v4.media.session.a0 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Dictation.DictationAsr.a(java.lang.String, boolean[], org.telegram.ui.Components.h21, android.support.v4.media.session.a0):void");
    }

    public static void a0(float[] fArr, a0 a0Var, h21 h21Var, boolean[] zArr) {
        int i7;
        long nativeFileNew;
        String nativeFileNext;
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
        p pVar = (p) a0Var.f1675b;
        long k10 = k(pVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = (k10 > 0L ? 1 : (k10 == 0L ? 0 : -1));
        if (i10 == 0) {
            nativeFileNew = 0;
        } else {
            String a10 = pVar.a((String) a0Var.f1676c);
            if (cz.o() == 0) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            nativeFileNew = nativeFileNew(k10, fArr, a10, i7);
        }
        if (nativeFileNew == 0) {
            if (i10 != 0) {
                P(pVar);
            }
            Log.d("Dictation", "tinyasr: can't transcribe");
            g0.g3(new f(zArr, h21Var, 2));
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
                M(h21Var, zArr, sb2.toString(), arrayList, false);
            } catch (Throwable th2) {
                nativeFileFree(nativeFileNew);
                P(pVar);
                throw th2;
            }
        }
        Log.d("Dictation", "tinyasr: file " + a0Var + " in " + nativeFileLang(nativeFileNew) + ", " + sb2.length() + " chars in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        nativeFileFree(nativeFileNew);
        P(pVar);
        M(h21Var, zArr, sb2.toString(), arrayList, true);
    }

    public static String b(ArrayList arrayList) {
        if (arrayList.size() >= 2 && Build.VERSION.SDK_INT >= 24) {
            int i7 = 0;
            String script = ULocale.addLikelySubtags(new ULocale(o((String) arrayList.get(0)))).getScript();
            if (!TextUtils.isEmpty(script)) {
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    String str = (String) obj;
                    String[] split = str.split("-");
                    if (split.length == 2 && split[1].equalsIgnoreCase(script)) {
                        return str;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static p b0(String str) {
        p[] J;
        for (p pVar : J()) {
            if (pVar.c(str) && y(pVar)) {
                ArrayList a10 = g1.a();
                if (g1.i(g1.f(a10, pVar.f1444c), new File(s(), pVar.b())) || g1.i(g1.f(a10, "silero-vad"), new File(s(), "silero_vad.onnx"))) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public static String c0(p pVar, String str) {
        String[] d2 = pVar.d(str);
        if (d2.length == 0) {
            return str;
        }
        SharedPreferences g12 = np.g1();
        String string = g12.getString("asr_variant_" + str, null);
        int length = d2.length;
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = d2[i7];
            if (str2.equalsIgnoreCase(string)) {
                return str2;
            }
        }
        return d2[0];
    }

    public static int d0() {
        if (f43039i == 0) {
            try {
                f43039i = nativeVersion();
            } catch (Throwable unused) {
                f43039i = 1;
            }
        }
        return f43039i;
    }

    public static void e0(p pVar, q qVar) {
        if (pVar.f1446f != 0) {
            qVar.a(true);
        } else if (!y(pVar) && !g1.b()) {
            qVar.a(false);
        } else {
            pVar.f1451l.add(qVar);
            if (y(pVar)) {
                if (pVar.f1448i) {
                    return;
                }
                pVar.f1448i = true;
                d.execute(new j(pVar, 0));
                return;
            }
            u(pVar, false);
        }
    }

    public static boolean j(JSONArray jSONArray, JSONArray jSONArray2) {
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

    public static long k(p pVar) {
        long j3;
        synchronized (pVar) {
            if (pVar.f1446f != 0) {
                pVar.f1447g++;
            }
            j3 = pVar.f1446f;
        }
        return j3;
    }

    public static void l(ArrayList arrayList, p[] pVarArr, String[] strArr, String[] strArr2, long j3) {
        String K = K(strArr);
        List<String> asList = Arrays.asList(strArr2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : asList) {
            linkedHashSet.add(o(str));
        }
        String[] strArr3 = (String[]) linkedHashSet.toArray(new String[0]);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((p) obj).f1442a.equals(K)) {
                return;
            }
        }
        for (p pVar : pVarArr) {
            if (pVar.f1442a.equals(K)) {
                if (j3 > 0) {
                    pVar.f1445e = j3;
                }
                pVar.f1444c = strArr2;
                arrayList.add(pVar);
                return;
            }
        }
        arrayList.add(new p(K, strArr3, strArr2, j3));
    }

    public static boolean m(String str, p pVar, List list) {
        if (list == null || "en".equals(str) || list.contains(str) || (!x() && z(str))) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!"en".equals(str2) && pVar.c(str2)) {
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

    public static native long nativeFileNew(long j3, float[] fArr, String str, int i7);

    public static native String nativeFileNext(long j3);

    private static native void nativeFree(long j3);

    private static native String[] nativeLangs(long j3);

    private static native long nativeLoad(String str, String str2);

    private static native void nativePinFast();

    public static native String nativeSessionFinish(long j3);

    public static native void nativeSessionFree(long j3);

    public static native long nativeSessionNew(long j3, String str, String str2, int i7);

    public static native String nativeSessionPush(long j3, byte[] bArr, int i7, int i10);

    private static native int nativeVersion();

    public static String o(String str) {
        int indexOf = str.indexOf(45);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.toLowerCase(Locale.ROOT);
    }

    public static void p() {
        g0.g3(new i(0));
    }

    public static String q(String str, String str2, boolean z10) {
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

    public static void r() {
        p[] J;
        for (p pVar : J()) {
            synchronized (pVar) {
                try {
                    if (pVar.f1446f != 0) {
                        if (pVar.f1447g > 0) {
                            pVar.h.add(Long.valueOf(pVar.f1446f));
                        } else {
                            nativeFree(pVar.f1446f);
                        }
                        pVar.f1446f = 0L;
                    }
                    pVar.f1448i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        File[] listFiles = s().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        Context context = t0.f26895b;
        ExecutorService executorService = DictationLid.f43040a;
        File file2 = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        file2.delete();
        g1.g(file2);
        np.g1().edit().remove("tinylid_etag").remove("tinylid_checked").apply();
        DictationLid.f43043e = false;
        DictationLid.f43040a.execute(new i(2));
        SharedPreferences.Editor edit = np.g1().edit();
        for (String str : np.g1().getAll().keySet()) {
            if (str.startsWith("tinyasr_etag_") || str.startsWith("tinyasr_checked_")) {
                edit.remove(str);
            }
        }
        edit.apply();
        SharedPreferences.Editor edit2 = np.g1().edit();
        for (String str2 : np.g1().getAll().keySet()) {
            if (str2.startsWith("speech_doc_")) {
                edit2.remove(str2);
            }
        }
        edit2.apply();
        O();
        Log.d("Dictation", "tinyasr: models, VAD and tinylid deleted");
        p();
    }

    public static File s() {
        return new File(t0.f26895b.getFilesDir(), "tinyasr");
    }

    public static void t(p pVar) {
        if (pVar != null && !y(pVar)) {
            u(pVar, false);
        }
    }

    public static void u(p pVar, boolean z10) {
        long j3;
        long j10;
        if (pVar.f1449j) {
            return;
        }
        pVar.f1449j = true;
        pVar.f1450k = 0.0f;
        if (!new File(s(), "silero_vad.onnx").exists()) {
            TLRPC.TL_transcriptionModel f10 = g1.f(g1.a(), "silero-vad");
            if (f10 != null) {
                j3 = f10.document.size;
            } else {
                j3 = 0;
            }
            if (j3 > 0) {
                TLRPC.TL_transcriptionModel f11 = g1.f(g1.a(), "silero-vad");
                if (f11 != null) {
                    j10 = f11.document.size;
                } else {
                    j10 = 0;
                }
            } else {
                j10 = 2300000;
            }
            h.putIfAbsent("silero_vad.onnx", new long[]{0, j10});
            p();
        }
        if (!new File(s(), pVar.b()).exists()) {
            h.putIfAbsent(pVar.b(), new long[]{0, pVar.f1445e});
            p();
        }
        p();
        f43036e.execute(new k(z10, pVar, 0));
    }

    public static int v(String str, TLRPC.TL_transcriptionModel tL_transcriptionModel, p pVar, boolean z10) {
        File file = new File(s(), str);
        if (tL_transcriptionModel == null && !file.exists()) {
            Log.d("Dictation", "tinyasr: " + str + " isn't on the server");
        }
        try {
            return g1.c(tL_transcriptionModel, file, z10, new h(str, pVar, new long[]{0}));
        } finally {
            F(str);
        }
    }

    public static boolean w(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Dictation.DictationAsr.w(int):boolean");
    }

    public static boolean x() {
        return np.g1().getBoolean("asr_auto", true);
    }

    public static boolean y(p pVar) {
        if (pVar != null && new File(s(), pVar.b()).exists() && new File(s(), "silero_vad.onnx").exists()) {
            return true;
        }
        return false;
    }

    public static boolean z(String str) {
        p[] J;
        String string = np.g1().getString("asr_langs", null);
        if (string == null) {
            for (p pVar : J()) {
                if (pVar.c(str) && y(pVar)) {
                    return true;
                }
            }
            return false;
        }
        return p0.p(",", string, ",").contains("," + str + ",");
    }
}
