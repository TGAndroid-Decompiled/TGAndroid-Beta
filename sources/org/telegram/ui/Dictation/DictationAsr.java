package org.telegram.ui.Dictation;

import a3.h;
import a8.p0;
import ai.i;
import ai.j;
import ai.l;
import ai.m1;
import ai.n;
import ai.o;
import ai.p;
import ai.t;
import ai.u;
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
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h21;
public abstract class DictationAsr {
    public static boolean f43070c;
    public static int f43074i;
    public static volatile t[] f43068a = new t[0];
    public static volatile String[] f43069b = new String[0];
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final ExecutorService f43071e = Executors.newSingleThreadExecutor();
    public static final ExecutorService f43072f = Executors.newSingleThreadExecutor();
    public static final ArrayList f43073g = new ArrayList();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();

    public static boolean A(String str) {
        t[] K;
        String string = np.g1().getString("asr_langs", null);
        if (string == null) {
            for (t tVar : K()) {
                if (tVar.c(str) && y(tVar)) {
                    return true;
                }
            }
            return false;
        }
        return p0.p(",", string, ",").contains("," + str + ",");
    }

    public static boolean B(int i7) {
        String str;
        SharedPreferences g12 = np.g1();
        if (k10.i(i7).q()) {
            str = "asr_local_premium";
        } else {
            str = "asr_local_free";
        }
        return g12.getBoolean(str, !k10.i(i7).q());
    }

    public static boolean C() {
        if (w(k10.f24968t0) && m1.h()) {
            return true;
        }
        return false;
    }

    public static boolean D() {
        if (C()) {
            for (t tVar : K()) {
                if (y(tVar)) {
                    return true;
                }
            }
            if (m1.b()) {
                return true;
            }
        }
        return false;
    }

    public static String[] E() {
        if (!f43070c) {
            P();
        }
        return f43069b;
    }

    public static void F(t tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(s(), tVar.b());
        File file2 = new File(s(), "silero_vad.onnx");
        try {
            long nativeLoad = nativeLoad(file.getAbsolutePath(), file2.getAbsolutePath());
            if (nativeLoad == 0) {
                Log.e("Dictation", "tinyasr: " + tVar.f1516a + " rejected (" + file.length() + " + " + file2.length() + " bytes)");
                file.delete();
                m1.g(file);
                SharedPreferences.Editor edit = np.g1().edit();
                StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
                sb2.append(tVar.f1516a);
                edit.remove(sb2.toString()).apply();
                tVar.f1522i = false;
                if (tVar.f1520f == 0) {
                    g0.g3(new p(false, tVar, 1));
                }
                p();
                return;
            }
            String[] nativeLangs = nativeLangs(nativeLoad);
            if (nativeLangs != null && nativeLangs.length > 0) {
                tVar.d = nativeLangs;
            }
            synchronized (tVar) {
                long j3 = tVar.f1520f;
                tVar.f1520f = nativeLoad;
                if (j3 != 0) {
                    if (tVar.f1521g > 0) {
                        tVar.h.add(Long.valueOf(j3));
                    } else {
                        nativeFree(j3);
                    }
                }
            }
            Log.d("Dictation", "tinyasr: " + tVar.f1516a + " loaded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            g0.g3(new p(true, tVar, 1));
        } catch (Throwable th2) {
            Log.e("Dictation", "tinyasr: load failed", th2);
            tVar.f1522i = false;
            g0.g3(new p(false, tVar, 1));
        }
    }

    public static void G(String str) {
        if (h.remove(str) != null) {
            p();
        }
    }

    public static boolean H(long[] jArr) {
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

    public static t I(String str, a0 a0Var, boolean z10, boolean z11) {
        List list;
        t[] K;
        List list2;
        if (z10) {
            list = null;
        } else {
            list = (List) a0Var.d;
        }
        t tVar = (t) a0Var.f1724b;
        if (tVar.c(str) && m(str, tVar, list)) {
            return tVar;
        }
        for (t tVar2 : K()) {
            if (tVar2.c(str) && y(tVar2) && m(str, tVar2, list)) {
                return tVar2;
            }
        }
        t J = J(str);
        if (J == null || (((list2 = (List) a0Var.d) == null || !list2.contains(str)) && (!z11 || !m(str, J, list)))) {
            return null;
        }
        return J;
    }

    public static t J(String str) {
        t[] K;
        t tVar = null;
        for (t tVar2 : K()) {
            if (tVar2.c(str) && (tVar == null || O(tVar2, str) > O(tVar, str))) {
                tVar = tVar2;
            }
        }
        return tVar;
    }

    public static t[] K() {
        if (!f43070c) {
            P();
        }
        return f43068a;
    }

    public static String L(String[] strArr) {
        for (String str : strArr) {
            if (str.indexOf(45) >= 0) {
                return TextUtils.join("+", strArr);
            }
        }
        return TextUtils.join("-", strArr);
    }

    public static void M() {
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
    }

    public static void N(h21 h21Var, boolean[] zArr, String str, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        g0.g3(new i(zArr, h21Var, str, iArr, z10, 0));
    }

    public static int O(t tVar, String str) {
        int i7;
        String[] d2 = tVar.d(str);
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

    public static synchronized void P() {
        t tVar;
        int i7;
        boolean z10;
        int i10;
        String[] strArr;
        synchronized (DictationAsr.class) {
            try {
                f43070c = true;
                t[] tVarArr = f43068a;
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
                ArrayList a10 = m1.a();
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
                                if (W(strArr4, strArr2)) {
                                    strArr3 = strArr4;
                                }
                            }
                            l(arrayList, tVarArr, strArr3, strArr2, tL_transcriptionModel.document.size);
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
                        z11 |= W(((t) obj2).f1518c, strArr5);
                    }
                    if (!z11) {
                        l(arrayList, tVarArr, strArr5, strArr5, new File(s(), L(strArr5) + ".tzf").length());
                    }
                    i16 = i17;
                }
                loop6: while (true) {
                    int size5 = arrayList.size();
                    int i19 = i11;
                    while (i19 < size5) {
                        Object obj3 = arrayList.get(i19);
                        i19++;
                        tVar = (t) obj3;
                        String[] strArr6 = tVar.f1517b;
                        int length2 = strArr6.length;
                        int i20 = i11;
                        int i21 = i20;
                        while (i20 < length2) {
                            String str = strArr6[i20];
                            int O = O(tVar, str);
                            int size6 = arrayList.size();
                            int i22 = i11;
                            int i23 = i22;
                            while (i23 < size6) {
                                Object obj4 = arrayList.get(i23);
                                i23++;
                                t tVar2 = (t) obj4;
                                if (tVar2 != tVar) {
                                    i22 = Math.max(i22, O(tVar2, str));
                                }
                            }
                            if (i22 >= O && i22 != 0) {
                                if (i22 > O) {
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
                            t tVar3 = (t) obj5;
                            if (i21 == 0 && tVar3 != tVar) {
                                int length3 = tVar3.f1517b.length;
                                String[] strArr7 = tVar.f1517b;
                                if (length3 > strArr7.length) {
                                    int length4 = strArr7.length;
                                    boolean z12 = true;
                                    for (int i25 = i11; i25 < length4; i25++) {
                                        String str2 = strArr7[i25];
                                        if (O(tVar3, str2) >= O(tVar, str2)) {
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
                    arrayList.remove(tVar);
                    i11 = 0;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size8 = arrayList.size();
                int i26 = 0;
                while (i26 < size8) {
                    Object obj6 = arrayList.get(i26);
                    i26++;
                    Collections.addAll(linkedHashSet, ((t) obj6).f1517b);
                }
                f43068a = (t[]) arrayList.toArray(new t[0]);
                f43069b = (String[]) linkedHashSet.toArray(new String[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void Q(t tVar) {
        synchronized (tVar) {
            try {
                int i7 = tVar.f1521g - 1;
                tVar.f1521g = i7;
                if (i7 > 0) {
                    return;
                }
                ArrayList arrayList = tVar.h;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    nativeFree(((Long) obj).longValue());
                }
                tVar.h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void R(Runnable runnable) {
        f43073g.remove(runnable);
    }

    public static a0 S(String str, ArrayList arrayList, ArrayList arrayList2) {
        t[] K;
        t J = J(str);
        int i7 = 0;
        if (J != null) {
            int i10 = -1;
            for (t tVar : K()) {
                if (tVar.c(str)) {
                    int O = (y(tVar) ? 1 : 0) + (O(tVar, str) * 1000);
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        String str2 = (String) obj;
                        if (!str.equals(str2) && tVar.c(str2)) {
                            O += 10;
                        }
                    }
                    if (O > i10) {
                        J = tVar;
                        i10 = O;
                    }
                }
            }
        }
        t tVar2 = J;
        StringBuilder sb2 = new StringBuilder(str);
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            String str3 = (String) obj2;
            if (!str3.equals(str) && tVar2.c(str3)) {
                sb2.append(',');
                sb2.append(str3);
            }
        }
        return new a0(tVar2, sb2.toString(), arrayList2, false, 7);
    }

    public static a0 T(ArrayList arrayList, boolean z10) {
        t tVar;
        String[] E;
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
            for (String str : E()) {
                if (A(str)) {
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
                return S(str2, arrayList3, arrayList2);
            }
        }
        if (z10 && np.g1().getBoolean("asr_google", false) && (arrayList2.isEmpty() || J((String) arrayList2.get(0)) == null)) {
            return null;
        }
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            String str4 = (String) obj3;
            if (J(str4) != null) {
                return S(str4, arrayList2, arrayList2);
            }
        }
        t[] K = K();
        if (K.length == 0) {
            m1.j();
            return null;
        }
        t tVar2 = K[0];
        int length = K.length;
        while (true) {
            if (i7 < length) {
                t tVar3 = K[i7];
                if (y(tVar3)) {
                    tVar = tVar3;
                    break;
                }
                i7++;
            } else {
                tVar = tVar2;
                break;
            }
        }
        return new a0(tVar, TextUtils.join(",", tVar.f1517b), arrayList2, false, 7);
    }

    public static a0 U(String[] strArr, float[] fArr, a0 a0Var, boolean z10) {
        if (strArr != null && fArr != null && strArr.length == fArr.length) {
            t[] K = K();
            if (K.length != 0) {
                t[] tVarArr = new t[fArr.length];
                float[] fArr2 = new float[K.length];
                for (int i7 = 0; i7 < fArr.length; i7++) {
                    if (fArr[i7] >= 0.1f) {
                        t I = I(strArr[i7], a0Var, z10, false);
                        tVarArr[i7] = I;
                        if (I != null) {
                            for (int i10 = 0; i10 < K.length; i10++) {
                                if (K[i10] == tVarArr[i7]) {
                                    fArr2[i10] = fArr2[i10] + fArr[i7];
                                }
                            }
                        }
                    }
                }
                int i11 = 0;
                for (int i12 = 1; i12 < K.length; i12++) {
                    if (fArr2[i12] > fArr2[i11]) {
                        i11 = i12;
                    }
                }
                if (fArr2[i11] != 0.0f) {
                    t tVar = K[i11];
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
                    if (tVar.c(i15)) {
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

    public static a0 V(String str, a0 a0Var, boolean z10) {
        t I = I(str, a0Var, z10, true);
        if (I == null) {
            return null;
        }
        return new a0(I, str, (List) a0Var.d, false, 7);
    }

    public static boolean W(String[] strArr, String[] strArr2) {
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

    public static void X(String str) {
        np.g1().edit().putBoolean("asr_auto", false).putString("asr_langs", str).apply();
    }

    public static void Y(boolean z10) {
        np.g1().edit().putBoolean("asr_auto", z10).apply();
    }

    public static void Z(String str, String str2) {
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putString("asr_variant_" + str, str2).apply();
    }

    public static void a(java.lang.String r19, boolean[] r20, org.telegram.ui.Components.h21 r21, android.support.v4.media.session.a0 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Dictation.DictationAsr.a(java.lang.String, boolean[], org.telegram.ui.Components.h21, android.support.v4.media.session.a0):void");
    }

    public static String a0() {
        String[] E;
        if (x()) {
            return null;
        }
        String str = null;
        for (String str2 : E()) {
            if (A(str2)) {
                if (str != null) {
                    return null;
                }
                str = str2;
            }
        }
        return str;
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

    public static void b0(float[] fArr, a0 a0Var, h21 h21Var, boolean[] zArr) {
        int i7;
        long nativeFileNew;
        String nativeFileNext;
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
        t tVar = (t) a0Var.f1724b;
        long k10 = k(tVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = (k10 > 0L ? 1 : (k10 == 0L ? 0 : -1));
        if (i10 == 0) {
            nativeFileNew = 0;
        } else {
            String a10 = tVar.a((String) a0Var.f1725c);
            if (cz.o() == 0) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            nativeFileNew = nativeFileNew(k10, fArr, a10, i7);
        }
        if (nativeFileNew == 0) {
            if (i10 != 0) {
                Q(tVar);
            }
            Log.d("Dictation", "tinyasr: can't transcribe");
            g0.g3(new j(zArr, h21Var, 2));
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
                N(h21Var, zArr, sb2.toString(), arrayList, false);
            } catch (Throwable th2) {
                nativeFileFree(nativeFileNew);
                Q(tVar);
                throw th2;
            }
        }
        Log.d("Dictation", "tinyasr: file " + a0Var + " in " + nativeFileLang(nativeFileNew) + ", " + sb2.length() + " chars in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        nativeFileFree(nativeFileNew);
        Q(tVar);
        N(h21Var, zArr, sb2.toString(), arrayList, true);
    }

    public static t c0(String str) {
        t[] K;
        for (t tVar : K()) {
            if (tVar.c(str) && y(tVar)) {
                ArrayList a10 = m1.a();
                if (m1.i(m1.f(a10, tVar.f1518c), new File(s(), tVar.b())) || m1.i(m1.f(a10, "silero-vad"), new File(s(), "silero_vad.onnx"))) {
                    return tVar;
                }
            }
        }
        return null;
    }

    public static String d0(t tVar, String str) {
        String[] d2 = tVar.d(str);
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

    public static int e0() {
        if (f43074i == 0) {
            try {
                f43074i = nativeVersion();
            } catch (Throwable unused) {
                f43074i = 1;
            }
        }
        return f43074i;
    }

    public static void f0(t tVar, u uVar) {
        if (tVar.f1520f != 0) {
            uVar.a(true);
        } else if (!y(tVar) && !m1.b()) {
            uVar.a(false);
        } else {
            tVar.f1525l.add(uVar);
            if (y(tVar)) {
                if (tVar.f1522i) {
                    return;
                }
                tVar.f1522i = true;
                d.execute(new o(tVar, 0));
                return;
            }
            u(tVar, false);
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

    public static long k(t tVar) {
        long j3;
        synchronized (tVar) {
            if (tVar.f1520f != 0) {
                tVar.f1521g++;
            }
            j3 = tVar.f1520f;
        }
        return j3;
    }

    public static void l(ArrayList arrayList, t[] tVarArr, String[] strArr, String[] strArr2, long j3) {
        String L = L(strArr);
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
            if (((t) obj).f1516a.equals(L)) {
                return;
            }
        }
        for (t tVar : tVarArr) {
            if (tVar.f1516a.equals(L)) {
                if (j3 > 0) {
                    tVar.f1519e = j3;
                }
                tVar.f1518c = strArr2;
                arrayList.add(tVar);
                return;
            }
        }
        arrayList.add(new t(L, strArr3, strArr2, j3));
    }

    public static boolean m(String str, t tVar, List list) {
        if (list == null || "en".equals(str) || list.contains(str) || (!x() && A(str))) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!"en".equals(str2) && tVar.c(str2)) {
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
        g0.g3(new n(0));
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
        t[] K;
        for (t tVar : K()) {
            synchronized (tVar) {
                try {
                    if (tVar.f1520f != 0) {
                        if (tVar.f1521g > 0) {
                            tVar.h.add(Long.valueOf(tVar.f1520f));
                        } else {
                            nativeFree(tVar.f1520f);
                        }
                        tVar.f1520f = 0L;
                    }
                    tVar.f1522i = false;
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
        Context context = t0.f26931b;
        ExecutorService executorService = DictationLid.f43075a;
        File file2 = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        file2.delete();
        m1.g(file2);
        np.g1().edit().remove("tinylid_etag").remove("tinylid_checked").apply();
        DictationLid.f43078e = false;
        DictationLid.f43075a.execute(new n(2));
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
        P();
        Log.d("Dictation", "tinyasr: models, VAD and tinylid deleted");
        p();
    }

    public static File s() {
        return new File(t0.f26931b.getFilesDir(), "tinyasr");
    }

    public static void t(t tVar) {
        if (tVar != null && !y(tVar)) {
            u(tVar, false);
        }
    }

    public static void u(t tVar, boolean z10) {
        long j3;
        long j10;
        if (tVar.f1523j) {
            return;
        }
        tVar.f1523j = true;
        tVar.f1524k = 0.0f;
        if (!new File(s(), "silero_vad.onnx").exists()) {
            TLRPC.TL_transcriptionModel f10 = m1.f(m1.a(), "silero-vad");
            if (f10 != null) {
                j3 = f10.document.size;
            } else {
                j3 = 0;
            }
            if (j3 > 0) {
                TLRPC.TL_transcriptionModel f11 = m1.f(m1.a(), "silero-vad");
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
        if (!new File(s(), tVar.b()).exists()) {
            h.putIfAbsent(tVar.b(), new long[]{0, tVar.f1519e});
            p();
        }
        p();
        f43071e.execute(new p(z10, tVar, 0));
    }

    public static int v(String str, TLRPC.TL_transcriptionModel tL_transcriptionModel, t tVar, boolean z10) {
        File file = new File(s(), str);
        if (tL_transcriptionModel == null && !file.exists()) {
            Log.d("Dictation", "tinyasr: " + str + " isn't on the server");
        }
        try {
            return m1.c(tL_transcriptionModel, file, z10, new h(str, tVar, new long[]{0}));
        } finally {
            G(str);
        }
    }

    public static boolean w(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Dictation.DictationAsr.w(int):boolean");
    }

    public static boolean x() {
        return np.g1().getBoolean("asr_auto", true);
    }

    public static boolean y(t tVar) {
        if (tVar != null && new File(s(), tVar.b()).exists() && new File(s(), "silero_vad.onnx").exists()) {
            return true;
        }
        return false;
    }

    public static boolean z(long j3) {
        if (n5.C(j3) || !np.g1().getBoolean("asr_google", false)) {
            return false;
        }
        return true;
    }
}
