package org.telegram.ui.Dictation;

import android.content.Context;
import android.content.SharedPreferences;
import android.icu.util.ULocale;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public abstract class DictationAsr {
    public static boolean c;
    public static int i;
    public static volatile nm3[] a = new nm3[0];
    public static volatile String[] b = new String[0];
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final ExecutorService e = Executors.newSingleThreadExecutor();
    public static final ExecutorService f = Executors.newSingleThreadExecutor();
    public static final ArrayList g = new ArrayList();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();

    public static boolean A(String str) {
        nm3[] O;
        String string = uc7.e1().getString("asr_langs", null);
        if (string == null) {
            for (nm3 nm3Var : O()) {
                if (nm3Var.c(str) && z(nm3Var)) {
                    return true;
                }
            }
            return false;
        }
        return qd4.y(",", string, ",").contains("," + str + ",");
    }

    public static boolean B(nm3 nm3Var) {
        if (nm3Var != null && nm3Var.f != 0) {
            return true;
        }
        return false;
    }

    public static boolean C(int i2) {
        if (!yac.h(i2).p()) {
            return true;
        }
        return uc7.e1().getBoolean("asr_local_premium", false);
    }

    public static boolean D(nm3 nm3Var) {
        if (nm3Var != null) {
            SharedPreferences e1 = uc7.e1();
            if (e1.getBoolean("tinyasr_manual_" + nm3Var.a, false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E() {
        boolean z = f11.a;
        if (!uc7.e1().getBoolean("asr_show_detected", false)) {
            return false;
        }
        return true;
    }

    public static boolean F() {
        if (x(yac.t0) && qn3.h()) {
            return true;
        }
        return false;
    }

    public static boolean G() {
        if (F()) {
            if (l() || qn3.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void H(String str, boolean[] zArr, s2c s2cVar, pm3 pm3Var) {
        float[] fArr;
        try {
            fArr = nativeDecode(str);
        } catch (Throwable th) {
            Log.e("Dictation", "tinyasr: decode failed", th);
            fArr = null;
        }
        if (fArr == null) {
            Log.d("Dictation", "tinyasr: can't decode " + str);
            hl.c3(new em3(zArr, s2cVar, (byte) 0));
            return;
        }
        if (!zArr[0]) {
            pm3Var = r(fArr, pm3Var);
        }
        hl.c3(new fm3(zArr, pm3Var, s2cVar, fArr));
    }

    public static String[] I() {
        if (!c) {
            T();
        }
        return b;
    }

    public static void J(nm3 nm3Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(s(), nm3Var.b());
        File file2 = new File(s(), "silero_vad.onnx");
        try {
            long nativeLoad = nativeLoad(file.getAbsolutePath(), file2.getAbsolutePath());
            if (nativeLoad == 0) {
                Log.e("Dictation", "tinyasr: " + nm3Var.a + " rejected (" + file.length() + " + " + file2.length() + " bytes)");
                file.delete();
                qn3.g(file);
                SharedPreferences.Editor edit = uc7.e1().edit();
                StringBuilder sb = new StringBuilder("tinyasr_checked_");
                sb.append(nm3Var.a);
                edit.remove(sb.toString()).apply();
                nm3Var.i = false;
                if (nm3Var.f == 0) {
                    hl.c3(new hm3(false, nm3Var, (byte) 0));
                }
                o();
                return;
            }
            String[] nativeLangs = nativeLangs(nativeLoad);
            if (nativeLangs != null && nativeLangs.length > 0) {
                nm3Var.d = nativeLangs;
            }
            synchronized (nm3Var) {
                long j = nm3Var.f;
                nm3Var.f = nativeLoad;
                if (j != 0) {
                    if (nm3Var.g > 0) {
                        nm3Var.h.add(Long.valueOf(j));
                    } else {
                        nativeFree(j);
                    }
                }
            }
            Log.d("Dictation", "tinyasr: " + nm3Var.a + " loaded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            hl.c3(new hm3(true, nm3Var, (byte) 0));
        } catch (Throwable th) {
            Log.e("Dictation", "tinyasr: load failed", th);
            nm3Var.i = false;
            hl.c3(new hm3(false, nm3Var, (byte) 0));
        }
    }

    public static void K(String str) {
        if (h.remove(str) != null) {
            o();
        }
    }

    public static boolean L(long[] jArr) {
        ConcurrentHashMap concurrentHashMap;
        long j = 0;
        long j2 = 0;
        for (long[] jArr2 : h.values()) {
            long j3 = jArr2[0];
            j += j3;
            j2 += Math.max(j3, jArr2[1]);
        }
        jArr[0] = j;
        jArr[1] = j2;
        return !concurrentHashMap.isEmpty();
    }

    public static nm3 M(String str, pm3 pm3Var, boolean z, boolean z2) {
        ArrayList arrayList;
        boolean z3;
        nm3[] O;
        ArrayList arrayList2;
        if (z) {
            arrayList = null;
        } else {
            arrayList = (ArrayList) pm3Var.d;
        }
        nm3 nm3Var = (nm3) pm3Var.b;
        if (nm3Var.c(str) && k(str, nm3Var, arrayList)) {
            return nm3Var;
        }
        if (!z && !z2 && ((arrayList == null || !arrayList.contains(str)) && (y() || !A(str)))) {
            z3 = false;
        } else {
            z3 = true;
        }
        for (nm3 nm3Var2 : O()) {
            if (nm3Var2.c(str) && z(nm3Var2) && ((z3 || D(nm3Var2)) && k(str, nm3Var2, arrayList))) {
                return nm3Var2;
            }
        }
        nm3 N = N(str);
        if (N == null || (((arrayList2 = (ArrayList) pm3Var.d) == null || !arrayList2.contains(str)) && (!z2 || !k(str, N, arrayList)))) {
            return null;
        }
        return N;
    }

    public static nm3 N(String str) {
        nm3[] O;
        nm3 nm3Var = null;
        for (nm3 nm3Var2 : O()) {
            if (nm3Var2.c(str) && (nm3Var == null || S(nm3Var2, str) > S(nm3Var, str))) {
                nm3Var = nm3Var2;
            }
        }
        return nm3Var;
    }

    public static nm3[] O() {
        if (!c) {
            T();
        }
        return a;
    }

    public static String P(String[] strArr) {
        for (String str : strArr) {
            if (str.indexOf(45) >= 0) {
                return TextUtils.join("+", strArr);
            }
        }
        return TextUtils.join("-", strArr);
    }

    public static void Q() {
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
    }

    public static void R(mm3 mm3Var, boolean[] zArr, String str, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        hl.c3(new va7(zArr, mm3Var, str, iArr, z, (byte) 9));
    }

    public static int S(nm3 nm3Var, String str) {
        String[] d2 = nm3Var.d(str);
        int length = d2.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 < length) {
                if (d2[i2].indexOf(45) < 0) {
                    i4 = 0;
                }
                i3 |= i4;
                i2++;
            } else {
                return (d2.length << 1) + i3;
            }
        }
    }

    public static synchronized void T() {
        nm3 nm3Var;
        int i2;
        boolean z;
        int i3;
        String[] strArr;
        synchronized (DictationAsr.class) {
            c = true;
            nm3[] nm3VarArr = a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            File[] listFiles = s().listFiles();
            int i4 = 0;
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
                            int i5 = 0;
                            while (true) {
                                if (i5 < length) {
                                    if (!split[i5].matches("[a-z]{2,3}")) {
                                        strArr = new String[]{substring};
                                        break;
                                    }
                                    i5++;
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
            ArrayList a2 = qn3.a();
            if (a2 != null) {
                int size = a2.size();
                int i6 = 0;
                while (i6 < size) {
                    int i7 = i6 + 1;
                    TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) a2.get(i6);
                    if (!tL_transcriptionModel.languages.isEmpty() && !tL_transcriptionModel.languages.contains("tinylid") && !tL_transcriptionModel.languages.contains("silero-vad")) {
                        String[] strArr2 = (String[]) tL_transcriptionModel.languages.toArray(new String[0]);
                        int size2 = arrayList2.size();
                        String[] strArr3 = strArr2;
                        int i8 = 0;
                        while (i8 < size2) {
                            Object obj = arrayList2.get(i8);
                            i8++;
                            String[] strArr4 = (String[]) obj;
                            if (a0(strArr4, strArr2)) {
                                strArr3 = strArr4;
                            }
                        }
                        j(arrayList, nm3VarArr, strArr3, strArr2, tL_transcriptionModel.document.size);
                    }
                    i6 = i7;
                }
            }
            int size3 = arrayList2.size();
            int i9 = 0;
            while (i9 < size3) {
                int i10 = i9 + 1;
                String[] strArr5 = (String[]) arrayList2.get(i9);
                int size4 = arrayList.size();
                boolean z2 = false;
                int i11 = 0;
                while (i11 < size4) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    z2 |= a0(((nm3) obj2).c, strArr5);
                }
                if (!z2) {
                    j(arrayList, nm3VarArr, strArr5, strArr5, new File(s(), P(strArr5) + ".tzf").length());
                }
                i9 = i10;
            }
            loop6: while (true) {
                int size5 = arrayList.size();
                int i12 = i4;
                while (i12 < size5) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    nm3Var = (nm3) obj3;
                    String[] strArr6 = nm3Var.b;
                    int length2 = strArr6.length;
                    int i13 = i4;
                    int i14 = i13;
                    while (i13 < length2) {
                        String str = strArr6[i13];
                        int S = S(nm3Var, str);
                        int size6 = arrayList.size();
                        int i15 = i4;
                        int i16 = i15;
                        while (i16 < size6) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            nm3 nm3Var2 = (nm3) obj4;
                            if (nm3Var2 != nm3Var) {
                                i15 = Math.max(i15, S(nm3Var2, str));
                            }
                        }
                        if (i15 >= S && i15 != 0) {
                            if (i15 > S) {
                                i3 = 1;
                            } else {
                                i3 = i4;
                            }
                            i14 |= i3;
                            i13++;
                        } else {
                            i2 = i4;
                            break;
                        }
                    }
                    i2 = 1;
                    int size7 = arrayList.size();
                    int i17 = i4;
                    while (i17 < size7) {
                        Object obj5 = arrayList.get(i17);
                        i17++;
                        nm3 nm3Var3 = (nm3) obj5;
                        if (i14 == 0 && nm3Var3 != nm3Var) {
                            int length3 = nm3Var3.b.length;
                            String[] strArr7 = nm3Var.b;
                            if (length3 > strArr7.length) {
                                int length4 = strArr7.length;
                                boolean z3 = true;
                                for (int i18 = i4; i18 < length4; i18++) {
                                    String str2 = strArr7[i18];
                                    if (S(nm3Var3, str2) >= S(nm3Var, str2)) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    z3 &= z;
                                }
                                if (z3) {
                                    i2 = 1;
                                    i14 = 1;
                                }
                            }
                        }
                        i4 = 0;
                    }
                    if (i2 == 0 || i14 == 0) {
                        i4 = 0;
                    }
                }
                arrayList.remove(nm3Var);
                i4 = 0;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size8 = arrayList.size();
            int i19 = 0;
            while (i19 < size8) {
                Object obj6 = arrayList.get(i19);
                i19++;
                Collections.addAll(linkedHashSet, ((nm3) obj6).b);
            }
            a = (nm3[]) arrayList.toArray(new nm3[0]);
            b = (String[]) linkedHashSet.toArray(new String[0]);
        }
    }

    public static void U(nm3 nm3Var) {
        synchronized (nm3Var) {
            int i2 = nm3Var.g - 1;
            nm3Var.g = i2;
            if (i2 > 0) {
                return;
            }
            ArrayList arrayList = nm3Var.h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                nativeFree(((Long) obj).longValue());
            }
            nm3Var.h.clear();
        }
    }

    public static void V(Runnable runnable) {
        g.remove(runnable);
    }

    public static pm3 W(String str, ArrayList arrayList, ArrayList arrayList2) {
        nm3[] O;
        nm3 N = N(str);
        if (N != null) {
            int i2 = -1;
            for (nm3 nm3Var : O()) {
                if (nm3Var.c(str)) {
                    int S = (z(nm3Var) ? 1 : 0) + (S(nm3Var, str) * 1000);
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        String str2 = (String) obj;
                        if (!str.equals(str2) && nm3Var.c(str2)) {
                            S += 10;
                        }
                    }
                    if (S > i2) {
                        N = nm3Var;
                        i2 = S;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder(str);
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            String str3 = (String) obj2;
            if (!str3.equals(str) && N.c(str3)) {
                sb.append(',');
                sb.append(str3);
            }
        }
        return new pm3(N, sb.toString(), arrayList2, (byte) 0);
    }

    public static pm3 X(ArrayList arrayList) {
        String[] I;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                String language = Locale.forLanguageTag((String) obj).getLanguage();
                if (!TextUtils.isEmpty(language) && !arrayList2.contains(language)) {
                    arrayList2.add(language);
                }
            }
        }
        if (!y()) {
            ArrayList arrayList3 = new ArrayList();
            for (String str : I()) {
                if (A(str)) {
                    arrayList3.add(str);
                }
            }
            if (!arrayList3.isEmpty()) {
                String str2 = (String) arrayList3.get(0);
                int size2 = arrayList2.size();
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    String str3 = (String) obj2;
                    if (arrayList3.contains(str3)) {
                        str2 = str3;
                        break;
                    }
                }
                return W(str2, arrayList3, arrayList2);
            }
        }
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            String str4 = (String) obj3;
            if (N(str4) != null) {
                return W(str4, arrayList2, arrayList2);
            }
        }
        nm3[] O = O();
        nm3 nm3Var = null;
        if (O.length == 0) {
            qn3.j();
            return null;
        }
        int length = O.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            nm3 nm3Var2 = O[i5];
            if (z(nm3Var2) && D(nm3Var2)) {
                nm3Var = nm3Var2;
                break;
            }
            i5++;
        }
        for (nm3 nm3Var3 : O) {
            if (nm3Var == null && z(nm3Var3)) {
                nm3Var = nm3Var3;
            }
        }
        if (nm3Var == null) {
            nm3Var = O[0];
        }
        return new pm3(nm3Var, TextUtils.join(",", nm3Var.b), arrayList2, (byte) 0);
    }

    public static pm3 Y(String[] strArr, float[] fArr, pm3 pm3Var, boolean z) {
        if (strArr != null && fArr != null && strArr.length == fArr.length) {
            nm3[] O = O();
            if (O.length != 0) {
                nm3[] nm3VarArr = new nm3[fArr.length];
                float[] fArr2 = new float[O.length];
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    if (fArr[i2] >= 0.1f) {
                        nm3 M = M(strArr[i2], pm3Var, z, false);
                        nm3VarArr[i2] = M;
                        if (M != null) {
                            for (int i3 = 0; i3 < O.length; i3++) {
                                if (O[i3] == nm3VarArr[i2]) {
                                    fArr2[i3] = fArr2[i3] + fArr[i2];
                                }
                            }
                        }
                    }
                }
                int i4 = 0;
                for (int i5 = 1; i5 < O.length; i5++) {
                    if (fArr2[i5] > fArr2[i4]) {
                        i4 = i5;
                    }
                }
                if (fArr2[i4] != 0.0f) {
                    nm3 nm3Var = O[i4];
                    StringBuilder sb = new StringBuilder();
                    int length = fArr.length;
                    Integer[] numArr = new Integer[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        numArr[i6] = Integer.valueOf(i6);
                    }
                    Arrays.sort(numArr, new gm3(fArr, (byte) 0));
                    for (int i7 = 0; i7 < length; i7++) {
                        int intValue = numArr[i7].intValue();
                        if (fArr[intValue] >= 0.1f && nm3VarArr[intValue] == nm3Var) {
                            if (sb.length() > 0) {
                                sb.append(',');
                            }
                            sb.append(strArr[intValue]);
                        }
                    }
                    String t = pm3Var.t();
                    if (nm3Var.c(t)) {
                        if (!("," + ((Object) sb) + ",").contains("," + t + ",")) {
                            sb.append(',');
                            sb.append(t);
                        }
                    }
                    return new pm3(nm3Var, sb.toString(), (ArrayList) pm3Var.d, (byte) 0);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static pm3 Z(String str, pm3 pm3Var, boolean z) {
        nm3 M = M(str, pm3Var, z, true);
        if (M == null) {
            return null;
        }
        return new pm3(M, str, (ArrayList) pm3Var.d, (byte) 0);
    }

    public static boolean a0(String[] strArr, String[] strArr2) {
        String[] strArr3 = new String[strArr.length];
        String[] strArr4 = new String[strArr2.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr3[i2] = strArr[i2].toLowerCase(Locale.ROOT);
        }
        for (int i3 = 0; i3 < strArr2.length; i3++) {
            strArr4[i3] = strArr2[i3].toLowerCase(Locale.ROOT);
        }
        Arrays.sort(strArr3);
        Arrays.sort(strArr4);
        return Arrays.equals(strArr3, strArr4);
    }

    public static void b0(String str) {
        uc7.e1().edit().putBoolean("asr_auto", false).putString("asr_langs", str).apply();
    }

    public static void c0(boolean z) {
        uc7.e1().edit().putBoolean("asr_auto", z).apply();
    }

    public static void d0(String str, String str2) {
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putString("asr_variant_" + str, str2).apply();
    }

    public static String e0() {
        String[] I;
        if (y()) {
            return null;
        }
        String str = null;
        for (String str2 : I()) {
            if (A(str2)) {
                if (str != null) {
                    return null;
                }
                str = str2;
            }
        }
        return str;
    }

    public static void f0(float[] fArr, pm3 pm3Var, mm3 mm3Var, boolean[] zArr) {
        int i2;
        long nativeFileNew;
        String nativeFileNext;
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
        nm3 nm3Var = (nm3) pm3Var.b;
        long h2 = h(nm3Var);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = (h2 > 0L ? 1 : (h2 == 0L ? 0 : -1));
        if (i3 == 0) {
            nativeFileNew = 0;
        } else {
            String a2 = nm3Var.a((String) pm3Var.c);
            if (xea.o() == 0) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            nativeFileNew = nativeFileNew(h2, fArr, a2, i2);
        }
        if (nativeFileNew == 0) {
            if (i3 != 0) {
                U(nm3Var);
            }
            Log.d("Dictation", "tinyasr: can't transcribe");
            hl.c3(new wd3(zArr, mm3Var, (byte) 14));
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (!zArr[0] && (nativeFileNext = nativeFileNext(nativeFileNew)) != null) {
            try {
                try {
                    m(sb, new JSONArray(nativeFileNext), arrayList);
                } catch (Exception e2) {
                    Log.e("Dictation", "tinyasr: words " + nativeFileNext, e2);
                }
                R(mm3Var, zArr, sb.toString(), arrayList, false);
            } catch (Throwable th) {
                nativeFileFree(nativeFileNew);
                U(nm3Var);
                throw th;
            }
        }
        Log.d("Dictation", "tinyasr: file " + pm3Var + " in " + nativeFileLang(nativeFileNew) + ", " + sb.length() + " chars in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        nativeFileFree(nativeFileNew);
        U(nm3Var);
        R(mm3Var, zArr, sb.toString(), arrayList, true);
    }

    public static nm3 g0(String str) {
        nm3[] O;
        for (nm3 nm3Var : O()) {
            if (nm3Var.c(str) && z(nm3Var)) {
                ArrayList a2 = qn3.a();
                if (qn3.i(qn3.f(a2, nm3Var.c), new File(s(), nm3Var.b())) || qn3.i(qn3.f(a2, "silero-vad"), new File(s(), "silero_vad.onnx"))) {
                    return nm3Var;
                }
            }
        }
        return null;
    }

    public static long h(nm3 nm3Var) {
        long j;
        synchronized (nm3Var) {
            if (nm3Var.f != 0) {
                nm3Var.g++;
            }
            j = nm3Var.f;
        }
        return j;
    }

    public static String h0(ArrayList arrayList) {
        if (arrayList.size() >= 2 && Build.VERSION.SDK_INT >= 24) {
            int i2 = 0;
            String script = ULocale.addLikelySubtags(a3.a(n((String) arrayList.get(0)))).getScript();
            if (!TextUtils.isEmpty(script)) {
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
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

    public static void i(Runnable runnable) {
        g.add(runnable);
    }

    public static String i0(nm3 nm3Var, String str) {
        String[] d2 = nm3Var.d(str);
        if (d2.length == 0) {
            return str;
        }
        SharedPreferences e1 = uc7.e1();
        String string = e1.getString("asr_variant_" + str, null);
        int length = d2.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = d2[i2];
            if (str2.equalsIgnoreCase(string)) {
                return str2;
            }
        }
        return d2[0];
    }

    public static void j(ArrayList arrayList, nm3[] nm3VarArr, String[] strArr, String[] strArr2, long j) {
        String P = P(strArr);
        List<String> asList = Arrays.asList(strArr2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : asList) {
            linkedHashSet.add(n(str));
        }
        String[] strArr3 = (String[]) linkedHashSet.toArray(new String[0]);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((nm3) obj).a.equals(P)) {
                return;
            }
        }
        for (nm3 nm3Var : nm3VarArr) {
            if (nm3Var.a.equals(P)) {
                if (j > 0) {
                    nm3Var.e = j;
                }
                nm3Var.c = strArr2;
                arrayList.add(nm3Var);
                return;
            }
        }
        arrayList.add(new nm3(P, strArr3, strArr2, j));
    }

    public static int j0() {
        int i2 = i;
        if (i2 == 0) {
            try {
                int nativeVersion = nativeVersion();
                i = nativeVersion;
                return nativeVersion;
            } catch (Throwable unused) {
                i = 1;
                return 1;
            }
        }
        return i2;
    }

    public static boolean k(String str, nm3 nm3Var, ArrayList arrayList) {
        if (arrayList != null && !"en".equals(str) && !arrayList.contains(str)) {
            if (y() || !A(str)) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    String str2 = (String) obj;
                    if (!"en".equals(str2) && nm3Var.c(str2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static void k0(nm3 nm3Var, boolean z, om3 om3Var) {
        if (nm3Var.f != 0) {
            om3Var.a(true);
        } else if (!z(nm3Var) && !z && !qn3.b()) {
            om3Var.a(false);
        } else {
            nm3Var.l.add(om3Var);
            if (z(nm3Var)) {
                if (nm3Var.i) {
                    return;
                }
                nm3Var.i = true;
                d.execute(new km3(nm3Var, (byte) 0));
                return;
            }
            u(nm3Var, false);
        }
    }

    public static boolean l() {
        for (nm3 nm3Var : O()) {
            if (z(nm3Var)) {
                return true;
            }
        }
        return false;
    }

    public static void m(StringBuilder sb, JSONArray jSONArray, ArrayList arrayList) {
        String str;
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    str = optJSONObject.optString("text");
                } else {
                    str = "";
                }
                if (!str.isEmpty()) {
                    if (sb.length() > 0 && !optJSONObject.optBoolean("join")) {
                        sb.append(' ');
                    }
                    if (arrayList != null) {
                        arrayList.add(Integer.valueOf(sb.length()));
                        arrayList.add(Integer.valueOf(str.length() + sb.length()));
                        arrayList.add(Integer.valueOf(Math.round(((float) optJSONObject.optDouble("start")) * 1000.0f)));
                        arrayList.add(Integer.valueOf(Math.round(((float) optJSONObject.optDouble("end")) * 1000.0f)));
                    }
                    sb.append(str);
                }
            }
        }
    }

    public static String n(String str) {
        int indexOf = str.indexOf(45);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.toLowerCase(Locale.ROOT);
    }

    private static native float[] nativeDecode(String str);

    public static native void nativeFileFree(long j);

    private static native String nativeFileLang(long j);

    public static native long nativeFileNew(long j, float[] fArr, String str, int i2);

    public static native String nativeFileNext(long j);

    private static native void nativeFree(long j);

    private static native String[] nativeLangs(long j);

    private static native long nativeLoad(String str, String str2);

    private static native void nativePinFast();

    public static native String nativeSessionFinish(long j);

    public static native void nativeSessionFree(long j);

    public static native long nativeSessionNew(long j, String str, String str2, int i2);

    public static native String nativeSessionPush(long j, byte[] bArr, int i2, int i3);

    private static native int nativeVersion();

    public static void o() {
        hl.c3(new jm3((byte) 0));
    }

    public static String p(String str, String str2, boolean z) {
        if (str.isEmpty()) {
            return str2;
        }
        if (str2.isEmpty()) {
            return str;
        }
        if (z) {
            return str.concat(str2);
        }
        return qd4.y(str, " ", str2);
    }

    public static void q() {
        nm3[] O;
        for (nm3 nm3Var : O()) {
            synchronized (nm3Var) {
                if (nm3Var.f != 0) {
                    if (nm3Var.g > 0) {
                        nm3Var.h.add(Long.valueOf(nm3Var.f));
                    } else {
                        nativeFree(nm3Var.f);
                    }
                    nm3Var.f = 0L;
                }
                nm3Var.i = false;
            }
        }
        File[] listFiles = s().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        Context context = a.b;
        ExecutorService executorService = DictationLid.a;
        File file2 = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        file2.delete();
        qn3.g(file2);
        uc7.e1().edit().remove("tinylid_etag").remove("tinylid_checked").remove("tinylid_lang").apply();
        DictationLid.e = false;
        DictationLid.a.execute(new jm3((byte) 2));
        SharedPreferences.Editor edit = uc7.e1().edit();
        for (String str : uc7.e1().getAll().keySet()) {
            if (str.startsWith("tinyasr_etag_") || str.startsWith("tinyasr_checked_") || str.startsWith("tinyasr_manual_")) {
                edit.remove(str);
            }
        }
        edit.apply();
        SharedPreferences.Editor edit2 = uc7.e1().edit();
        for (String str2 : uc7.e1().getAll().keySet()) {
            if (str2.startsWith("speech_doc_")) {
                edit2.remove(str2);
            }
        }
        edit2.apply();
        T();
        Log.d("Dictation", "tinyasr: models, VAD and tinylid deleted");
        o();
    }

    public static defpackage.pm3 r(float[] r13, defpackage.pm3 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Dictation.DictationAsr.r(float[], pm3):pm3");
    }

    public static File s() {
        return new File(a.b.getFilesDir(), "tinyasr");
    }

    public static void t(nm3 nm3Var) {
        if (nm3Var != null && !z(nm3Var)) {
            SharedPreferences.Editor edit = uc7.e1().edit();
            edit.putBoolean("tinyasr_manual_" + nm3Var.a, true).apply();
            u(nm3Var, false);
        }
    }

    public static void u(nm3 nm3Var, boolean z) {
        long j;
        long j2;
        if (nm3Var.j) {
            return;
        }
        nm3Var.j = true;
        nm3Var.k = 0.0f;
        if (!new File(s(), "silero_vad.onnx").exists()) {
            TLRPC.TL_transcriptionModel f2 = qn3.f(qn3.a(), "silero-vad");
            if (f2 != null) {
                j = f2.document.size;
            } else {
                j = 0;
            }
            if (j > 0) {
                TLRPC.TL_transcriptionModel f3 = qn3.f(qn3.a(), "silero-vad");
                if (f3 != null) {
                    j2 = f3.document.size;
                } else {
                    j2 = 0;
                }
            } else {
                j2 = 2300000;
            }
            h.putIfAbsent("silero_vad.onnx", new long[]{0, j2});
            o();
        }
        if (!new File(s(), nm3Var.b()).exists()) {
            h.putIfAbsent(nm3Var.b(), new long[]{0, nm3Var.e});
            o();
        }
        o();
        e.execute(new hm3(z, nm3Var, (byte) 1));
    }

    public static int v(String str, TLRPC.TL_transcriptionModel tL_transcriptionModel, nm3 nm3Var, boolean z) {
        File file = new File(s(), str);
        if (tL_transcriptionModel == null && !file.exists()) {
            Log.d("Dictation", "tinyasr: " + str + " isn't on the server");
        }
        try {
            return qn3.c(tL_transcriptionModel, file, z, new fu2(str, nm3Var, new long[]{0}, (byte) 7));
        } finally {
            K(str);
        }
    }

    public static boolean w(JSONArray jSONArray, JSONArray jSONArray2) {
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

    public static boolean x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Dictation.DictationAsr.x(int):boolean");
    }

    public static boolean y() {
        return uc7.e1().getBoolean("asr_auto", true);
    }

    public static boolean z(nm3 nm3Var) {
        if (nm3Var != null && new File(s(), nm3Var.b()).exists() && new File(s(), "silero_vad.onnx").exists()) {
            return true;
        }
        return false;
    }
}
