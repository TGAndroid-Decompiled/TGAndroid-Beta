package org.telegram.ui.Dictation;

import a3.h;
import a8.p0;
import ai.e;
import ai.f;
import ai.g;
import ai.h1;
import ai.k;
import ai.l;
import ai.m;
import ai.o;
import ai.p;
import ai.q;
import ai.r;
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
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g21;
public abstract class DictationAsr {
    public static boolean f43145c;
    public static int f43149i;
    public static volatile q[] f43143a = new q[0];
    public static volatile String[] f43144b = new String[0];
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final ExecutorService f43146e = Executors.newSingleThreadExecutor();
    public static final ExecutorService f43147f = Executors.newSingleThreadExecutor();
    public static final ArrayList f43148g = new ArrayList();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();

    public static boolean A(q qVar) {
        if (qVar != null && new File(u(), qVar.b()).exists() && new File(u(), "silero_vad.onnx").exists()) {
            return true;
        }
        return false;
    }

    public static boolean B(String str) {
        q[] N;
        String string = mp.g1().getString("asr_langs", null);
        if (string == null) {
            for (q qVar : N()) {
                if (qVar.c(str) && A(qVar)) {
                    return true;
                }
            }
            return false;
        }
        return p0.p(",", string, ",").contains("," + str + ",");
    }

    public static boolean C(q qVar) {
        if (qVar != null && qVar.f1458f != 0) {
            return true;
        }
        return false;
    }

    public static boolean D(int i7) {
        String str;
        SharedPreferences g12 = mp.g1();
        if (i10.i(i7).q()) {
            str = "asr_local_premium";
        } else {
            str = "asr_local_free";
        }
        return g12.getBoolean(str, !i10.i(i7).q());
    }

    public static boolean E(int i7) {
        if (y(i7) && h1.h()) {
            return true;
        }
        return false;
    }

    public static boolean F() {
        if (y(i10.f24637t0) && h1.h()) {
            return true;
        }
        return false;
    }

    public static boolean G() {
        if (F()) {
            for (q qVar : N()) {
                if (A(qVar)) {
                    return true;
                }
            }
            if (h1.b()) {
                return true;
            }
        }
        return false;
    }

    public static String[] H() {
        if (!f43145c) {
            S();
        }
        return f43144b;
    }

    public static void I(q qVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(u(), qVar.b());
        File file2 = new File(u(), "silero_vad.onnx");
        try {
            long nativeLoad = nativeLoad(file.getAbsolutePath(), file2.getAbsolutePath());
            if (nativeLoad == 0) {
                Log.e("Dictation", "tinyasr: " + qVar.f1454a + " rejected (" + file.length() + " + " + file2.length() + " bytes)");
                file.delete();
                h1.g(file);
                SharedPreferences.Editor edit = mp.g1().edit();
                StringBuilder sb2 = new StringBuilder("tinyasr_checked_");
                sb2.append(qVar.f1454a);
                edit.remove(sb2.toString()).apply();
                qVar.f1460i = false;
                if (qVar.f1458f == 0) {
                    g0.g3(new m(false, qVar, 1));
                }
                q();
                return;
            }
            String[] nativeLangs = nativeLangs(nativeLoad);
            if (nativeLangs != null && nativeLangs.length > 0) {
                qVar.d = nativeLangs;
            }
            synchronized (qVar) {
                long j3 = qVar.f1458f;
                qVar.f1458f = nativeLoad;
                if (j3 != 0) {
                    if (qVar.f1459g > 0) {
                        qVar.h.add(Long.valueOf(j3));
                    } else {
                        nativeFree(j3);
                    }
                }
            }
            Log.d("Dictation", "tinyasr: " + qVar.f1454a + " loaded in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            g0.g3(new m(true, qVar, 1));
        } catch (Throwable th2) {
            Log.e("Dictation", "tinyasr: load failed", th2);
            qVar.f1460i = false;
            g0.g3(new m(false, qVar, 1));
        }
    }

    public static void J(String str) {
        if (h.remove(str) != null) {
            q();
        }
    }

    public static boolean K(long[] jArr) {
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

    public static q L(String str, a0 a0Var, boolean z10, boolean z11) {
        List list;
        q[] N;
        List list2;
        if (z10) {
            list = null;
        } else {
            list = (List) a0Var.d;
        }
        q qVar = (q) a0Var.f1676b;
        if (qVar.c(str) && n(str, qVar, list)) {
            return qVar;
        }
        for (q qVar2 : N()) {
            if (qVar2.c(str) && A(qVar2) && n(str, qVar2, list)) {
                return qVar2;
            }
        }
        q M = M(str);
        if (M == null || (((list2 = (List) a0Var.d) == null || !list2.contains(str)) && (!z11 || !n(str, M, list)))) {
            return null;
        }
        return M;
    }

    public static q M(String str) {
        q[] N;
        q qVar = null;
        for (q qVar2 : N()) {
            if (qVar2.c(str) && (qVar == null || R(qVar2, str) > R(qVar, str))) {
                qVar = qVar2;
            }
        }
        return qVar;
    }

    public static q[] N() {
        if (!f43145c) {
            S();
        }
        return f43143a;
    }

    public static String O(String[] strArr) {
        for (String str : strArr) {
            if (str.indexOf(45) >= 0) {
                return TextUtils.join("+", strArr);
            }
        }
        return TextUtils.join("-", strArr);
    }

    public static void P() {
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
    }

    public static void Q(p pVar, boolean[] zArr, String str, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        g0.g3(new e(zArr, pVar, str, iArr, z10, 0));
    }

    public static int R(q qVar, String str) {
        int i7;
        String[] d2 = qVar.d(str);
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

    public static synchronized void S() {
        q qVar;
        int i7;
        boolean z10;
        int i10;
        String[] strArr;
        synchronized (DictationAsr.class) {
            try {
                f43145c = true;
                q[] qVarArr = f43143a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                File[] listFiles = u().listFiles();
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
                ArrayList a10 = h1.a();
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
                                if (Z(strArr4, strArr2)) {
                                    strArr3 = strArr4;
                                }
                            }
                            m(arrayList, qVarArr, strArr3, strArr2, tL_transcriptionModel.document.size);
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
                        z11 |= Z(((q) obj2).f1456c, strArr5);
                    }
                    if (!z11) {
                        m(arrayList, qVarArr, strArr5, strArr5, new File(u(), O(strArr5) + ".tzf").length());
                    }
                    i16 = i17;
                }
                loop6: while (true) {
                    int size5 = arrayList.size();
                    int i19 = i11;
                    while (i19 < size5) {
                        Object obj3 = arrayList.get(i19);
                        i19++;
                        qVar = (q) obj3;
                        String[] strArr6 = qVar.f1455b;
                        int length2 = strArr6.length;
                        int i20 = i11;
                        int i21 = i20;
                        while (i20 < length2) {
                            String str = strArr6[i20];
                            int R = R(qVar, str);
                            int size6 = arrayList.size();
                            int i22 = i11;
                            int i23 = i22;
                            while (i23 < size6) {
                                Object obj4 = arrayList.get(i23);
                                i23++;
                                q qVar2 = (q) obj4;
                                if (qVar2 != qVar) {
                                    i22 = Math.max(i22, R(qVar2, str));
                                }
                            }
                            if (i22 >= R && i22 != 0) {
                                if (i22 > R) {
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
                            q qVar3 = (q) obj5;
                            if (i21 == 0 && qVar3 != qVar) {
                                int length3 = qVar3.f1455b.length;
                                String[] strArr7 = qVar.f1455b;
                                if (length3 > strArr7.length) {
                                    int length4 = strArr7.length;
                                    boolean z12 = true;
                                    for (int i25 = i11; i25 < length4; i25++) {
                                        String str2 = strArr7[i25];
                                        if (R(qVar3, str2) >= R(qVar, str2)) {
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
                    arrayList.remove(qVar);
                    i11 = 0;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size8 = arrayList.size();
                int i26 = 0;
                while (i26 < size8) {
                    Object obj6 = arrayList.get(i26);
                    i26++;
                    Collections.addAll(linkedHashSet, ((q) obj6).f1455b);
                }
                f43143a = (q[]) arrayList.toArray(new q[0]);
                f43144b = (String[]) linkedHashSet.toArray(new String[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void T(q qVar) {
        synchronized (qVar) {
            try {
                int i7 = qVar.f1459g - 1;
                qVar.f1459g = i7;
                if (i7 > 0) {
                    return;
                }
                ArrayList arrayList = qVar.h;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    nativeFree(((Long) obj).longValue());
                }
                qVar.h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void U(Runnable runnable) {
        f43148g.remove(runnable);
    }

    public static a0 V(String str, ArrayList arrayList, ArrayList arrayList2) {
        q[] N;
        q M = M(str);
        int i7 = 0;
        if (M != null) {
            int i10 = -1;
            for (q qVar : N()) {
                if (qVar.c(str)) {
                    int R = (A(qVar) ? 1 : 0) + (R(qVar, str) * 1000);
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        String str2 = (String) obj;
                        if (!str.equals(str2) && qVar.c(str2)) {
                            R += 10;
                        }
                    }
                    if (R > i10) {
                        M = qVar;
                        i10 = R;
                    }
                }
            }
        }
        q qVar2 = M;
        StringBuilder sb2 = new StringBuilder(str);
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            String str3 = (String) obj2;
            if (!str3.equals(str) && qVar2.c(str3)) {
                sb2.append(',');
                sb2.append(str3);
            }
        }
        return new a0(qVar2, sb2.toString(), arrayList2, false, 7);
    }

    public static a0 W(ArrayList arrayList) {
        String[] H;
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String language = Locale.forLanguageTag((String) obj).getLanguage();
                if (!TextUtils.isEmpty(language) && !arrayList2.contains(language)) {
                    arrayList2.add(language);
                }
            }
        }
        if (!z()) {
            ArrayList arrayList3 = new ArrayList();
            for (String str : H()) {
                if (B(str)) {
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
                return V(str2, arrayList3, arrayList2);
            }
        }
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            String str4 = (String) obj3;
            if (M(str4) != null) {
                return V(str4, arrayList2, arrayList2);
            }
        }
        q[] N = N();
        if (N.length == 0) {
            h1.j();
            return null;
        }
        q qVar = N[0];
        int length = N.length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            q qVar2 = N[i7];
            if (A(qVar2)) {
                qVar = qVar2;
                break;
            }
            i7++;
        }
        return new a0(qVar, TextUtils.join(",", qVar.f1455b), arrayList2, false, 7);
    }

    public static a0 X(String[] strArr, float[] fArr, a0 a0Var, boolean z10) {
        if (strArr != null && fArr != null && strArr.length == fArr.length) {
            q[] N = N();
            if (N.length != 0) {
                q[] qVarArr = new q[fArr.length];
                float[] fArr2 = new float[N.length];
                for (int i7 = 0; i7 < fArr.length; i7++) {
                    if (fArr[i7] >= 0.1f) {
                        q L = L(strArr[i7], a0Var, z10, false);
                        qVarArr[i7] = L;
                        if (L != null) {
                            for (int i10 = 0; i10 < N.length; i10++) {
                                if (N[i10] == qVarArr[i7]) {
                                    fArr2[i10] = fArr2[i10] + fArr[i7];
                                }
                            }
                        }
                    }
                }
                int i11 = 0;
                for (int i12 = 1; i12 < N.length; i12++) {
                    if (fArr2[i12] > fArr2[i11]) {
                        i11 = i12;
                    }
                }
                if (fArr2[i11] != 0.0f) {
                    q qVar = N[i11];
                    StringBuilder sb2 = new StringBuilder();
                    int length = fArr.length;
                    Integer[] numArr = new Integer[length];
                    for (int i13 = 0; i13 < length; i13++) {
                        numArr[i13] = Integer.valueOf(i13);
                    }
                    Arrays.sort(numArr, new o(0, fArr));
                    for (int i14 = 0; i14 < length; i14++) {
                        int intValue = numArr[i14].intValue();
                        if (fArr[intValue] >= 0.1f && qVarArr[intValue] == qVar) {
                            if (sb2.length() > 0) {
                                sb2.append(',');
                            }
                            sb2.append(strArr[intValue]);
                        }
                    }
                    String i15 = a0Var.i();
                    if (qVar.c(i15)) {
                        if (!("," + ((Object) sb2) + ",").contains("," + i15 + ",")) {
                            sb2.append(',');
                            sb2.append(i15);
                        }
                    }
                    return new a0(qVar, sb2.toString(), (List) a0Var.d, false, 7);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static a0 Y(String str, a0 a0Var, boolean z10) {
        q L = L(str, a0Var, z10, true);
        if (L == null) {
            return null;
        }
        return new a0(L, str, (List) a0Var.d, false, 7);
    }

    public static boolean Z(String[] strArr, String[] strArr2) {
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

    public static void a(String str, boolean[] zArr, g21 g21Var, a0 a0Var) {
        float[] fArr;
        try {
            fArr = nativeDecode(str);
        } catch (Throwable th2) {
            Log.e("Dictation", "tinyasr: decode failed", th2);
            fArr = null;
        }
        if (fArr == null) {
            Log.d("Dictation", "tinyasr: can't decode " + str);
            g0.g3(new f(zArr, g21Var, 0));
            return;
        }
        if (!zArr[0]) {
            a0Var = t(fArr, a0Var);
        }
        g0.g3(new g(zArr, a0Var, g21Var, fArr));
    }

    public static void a0(String str) {
        mp.g1().edit().putBoolean("asr_auto", false).putString("asr_langs", str).apply();
    }

    public static String b(ArrayList arrayList) {
        if (arrayList.size() >= 2 && Build.VERSION.SDK_INT >= 24) {
            int i7 = 0;
            String script = ULocale.addLikelySubtags(new ULocale(p((String) arrayList.get(0)))).getScript();
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

    public static void b0(boolean z10) {
        mp.g1().edit().putBoolean("asr_auto", z10).apply();
    }

    public static void c0(String str, String str2) {
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putString("asr_variant_" + str, str2).apply();
    }

    public static String d0() {
        String[] H;
        if (z()) {
            return null;
        }
        String str = null;
        for (String str2 : H()) {
            if (B(str2)) {
                if (str != null) {
                    return null;
                }
                str = str2;
            }
        }
        return str;
    }

    public static void e0(float[] fArr, a0 a0Var, p pVar, boolean[] zArr) {
        int i7;
        long nativeFileNew;
        String nativeFileNext;
        try {
            nativePinFast();
        } catch (Throwable unused) {
        }
        q qVar = (q) a0Var.f1676b;
        long k10 = k(qVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = (k10 > 0L ? 1 : (k10 == 0L ? 0 : -1));
        if (i10 == 0) {
            nativeFileNew = 0;
        } else {
            String a10 = qVar.a((String) a0Var.f1677c);
            if (bz.o() == 0) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            nativeFileNew = nativeFileNew(k10, fArr, a10, i7);
        }
        if (nativeFileNew == 0) {
            if (i10 != 0) {
                T(qVar);
            }
            Log.d("Dictation", "tinyasr: can't transcribe");
            g0.g3(new a1.e(10, zArr, pVar));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (!zArr[0] && (nativeFileNext = nativeFileNext(nativeFileNew)) != null) {
            try {
                try {
                    o(sb2, new JSONArray(nativeFileNext), arrayList);
                } catch (Exception e10) {
                    Log.e("Dictation", "tinyasr: words " + nativeFileNext, e10);
                }
                Q(pVar, zArr, sb2.toString(), arrayList, false);
            } catch (Throwable th2) {
                nativeFileFree(nativeFileNew);
                T(qVar);
                throw th2;
            }
        }
        Log.d("Dictation", "tinyasr: file " + a0Var + " in " + nativeFileLang(nativeFileNew) + ", " + sb2.length() + " chars in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        nativeFileFree(nativeFileNew);
        T(qVar);
        Q(pVar, zArr, sb2.toString(), arrayList, true);
    }

    public static q f0(String str) {
        q[] N;
        for (q qVar : N()) {
            if (qVar.c(str) && A(qVar)) {
                ArrayList a10 = h1.a();
                if (h1.i(h1.f(a10, qVar.f1456c), new File(u(), qVar.b())) || h1.i(h1.f(a10, "silero-vad"), new File(u(), "silero_vad.onnx"))) {
                    return qVar;
                }
            }
        }
        return null;
    }

    public static String g0(q qVar, String str) {
        String[] d2 = qVar.d(str);
        if (d2.length == 0) {
            return str;
        }
        SharedPreferences g12 = mp.g1();
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

    public static int h0() {
        if (f43149i == 0) {
            try {
                f43149i = nativeVersion();
            } catch (Throwable unused) {
                f43149i = 1;
            }
        }
        return f43149i;
    }

    public static void i0(q qVar, boolean z10, r rVar) {
        if (qVar.f1458f != 0) {
            rVar.a(true);
        } else if (!A(qVar) && !z10 && !h1.b()) {
            rVar.a(false);
        } else {
            qVar.f1463l.add(rVar);
            if (A(qVar)) {
                if (qVar.f1460i) {
                    return;
                }
                qVar.f1460i = true;
                d.execute(new l(qVar, 0));
                return;
            }
            w(qVar, false);
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

    public static long k(q qVar) {
        long j3;
        synchronized (qVar) {
            if (qVar.f1458f != 0) {
                qVar.f1459g++;
            }
            j3 = qVar.f1458f;
        }
        return j3;
    }

    public static void l(Runnable runnable) {
        f43148g.add(runnable);
    }

    public static void m(ArrayList arrayList, q[] qVarArr, String[] strArr, String[] strArr2, long j3) {
        String O = O(strArr);
        List<String> asList = Arrays.asList(strArr2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : asList) {
            linkedHashSet.add(p(str));
        }
        String[] strArr3 = (String[]) linkedHashSet.toArray(new String[0]);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((q) obj).f1454a.equals(O)) {
                return;
            }
        }
        for (q qVar : qVarArr) {
            if (qVar.f1454a.equals(O)) {
                if (j3 > 0) {
                    qVar.f1457e = j3;
                }
                qVar.f1456c = strArr2;
                arrayList.add(qVar);
                return;
            }
        }
        arrayList.add(new q(O, strArr3, strArr2, j3));
    }

    public static boolean n(String str, q qVar, List list) {
        if (list == null || "en".equals(str) || list.contains(str) || (!z() && B(str))) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!"en".equals(str2) && qVar.c(str2)) {
                return false;
            }
        }
        return true;
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

    public static void o(StringBuilder sb2, JSONArray jSONArray, ArrayList arrayList) {
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

    public static String p(String str) {
        int indexOf = str.indexOf(45);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.toLowerCase(Locale.ROOT);
    }

    public static void q() {
        g0.g3(new k(0));
    }

    public static String r(String str, String str2, boolean z10) {
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

    public static void s() {
        q[] N;
        for (q qVar : N()) {
            synchronized (qVar) {
                try {
                    if (qVar.f1458f != 0) {
                        if (qVar.f1459g > 0) {
                            qVar.h.add(Long.valueOf(qVar.f1458f));
                        } else {
                            nativeFree(qVar.f1458f);
                        }
                        qVar.f1458f = 0L;
                    }
                    qVar.f1460i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        File[] listFiles = u().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        Context context = t0.f27013b;
        ExecutorService executorService = DictationLid.f43150a;
        File file2 = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
        file2.delete();
        h1.g(file2);
        mp.g1().edit().remove("tinylid_etag").remove("tinylid_checked").apply();
        DictationLid.f43153e = false;
        DictationLid.f43150a.execute(new k(2));
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
        S();
        Log.d("Dictation", "tinyasr: models, VAD and tinylid deleted");
        q();
    }

    public static android.support.v4.media.session.a0 t(float[] r13, android.support.v4.media.session.a0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Dictation.DictationAsr.t(float[], android.support.v4.media.session.a0):android.support.v4.media.session.a0");
    }

    public static File u() {
        return new File(t0.f27013b.getFilesDir(), "tinyasr");
    }

    public static void v(q qVar) {
        if (qVar != null && !A(qVar)) {
            w(qVar, false);
        }
    }

    public static void w(q qVar, boolean z10) {
        long j3;
        long j10;
        if (qVar.f1461j) {
            return;
        }
        qVar.f1461j = true;
        qVar.f1462k = 0.0f;
        if (!new File(u(), "silero_vad.onnx").exists()) {
            TLRPC.TL_transcriptionModel f10 = h1.f(h1.a(), "silero-vad");
            if (f10 != null) {
                j3 = f10.document.size;
            } else {
                j3 = 0;
            }
            if (j3 > 0) {
                TLRPC.TL_transcriptionModel f11 = h1.f(h1.a(), "silero-vad");
                if (f11 != null) {
                    j10 = f11.document.size;
                } else {
                    j10 = 0;
                }
            } else {
                j10 = 2300000;
            }
            h.putIfAbsent("silero_vad.onnx", new long[]{0, j10});
            q();
        }
        if (!new File(u(), qVar.b()).exists()) {
            h.putIfAbsent(qVar.b(), new long[]{0, qVar.f1457e});
            q();
        }
        q();
        f43146e.execute(new m(z10, qVar, 0));
    }

    public static int x(String str, TLRPC.TL_transcriptionModel tL_transcriptionModel, q qVar, boolean z10) {
        File file = new File(u(), str);
        if (tL_transcriptionModel == null && !file.exists()) {
            Log.d("Dictation", "tinyasr: " + str + " isn't on the server");
        }
        try {
            return h1.c(tL_transcriptionModel, file, z10, new h(str, qVar, new long[]{0}));
        } finally {
            J(str);
        }
    }

    public static boolean y(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Dictation.DictationAsr.y(int):boolean");
    }

    public static boolean z() {
        return mp.g1().getBoolean("asr_auto", true);
    }
}
