package org.telegram.ui.Dictation;

import ai.a1;
import ai.c1;
import ai.e1;
import ai.f1;
import ai.l1;
import ai.x0;
import ai.y0;
import ai.z0;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.g0;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public abstract class DictationLid {
    public static volatile long f43073c;
    public static volatile String[] d;
    public static boolean f43074e;
    public static volatile boolean f43075f;
    public static volatile boolean f43076g;
    public static final ExecutorService f43071a = Executors.newSingleThreadExecutor(new a1(0));
    public static final ExecutorService f43072b = Executors.newSingleThreadExecutor();
    public static final Object h = new Object();
    public static final String[][] f43077i = {new String[]{"ru", "uk", "be", "pl", "cs", "sk", "bg", "sr", "hr", "bs", "sl", "mk"}, new String[]{"sv", "no", "nb", "nn", "da"}, new String[]{"es", "pt", "ca", "gl", "it"}, new String[]{"nl", "de", "af"}, new String[]{"ms", "id"}, new String[]{"hi", "ur"}};
    public static final int[] f43078j = {1000, 2000, 5000, 10000, 20000};

    public static float[] a(byte[] bArr, int[] iArr) {
        byte[] m10 = m(bArr);
        iArr[0] = m10.length / 32;
        long j3 = f43073c;
        if (iArr[0] >= 500 && j3 != 0) {
            float[] fArr = new float[d.length];
            if (nativePredict(j3, m10, 0, m10.length, false, fArr)) {
                return fArr;
            }
            return null;
        }
        return null;
    }

    public static void b() {
        long j3 = f43073c;
        f43073c = 0L;
        if (j3 != 0) {
            nativeFree(j3);
        }
    }

    public static void c(byte[] bArr, int i7, e1 e1Var) {
        long j3 = f43073c;
        if (j3 == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        byte[] m10 = m(bArr);
        int length = m10.length / 32;
        if (length < i7) {
            g0.g3(new y0(e1Var, length, 0));
            return;
        }
        float[] fArr = new float[d.length];
        g0.g3(new z0(e1Var, nativePredict(j3, m10, 0, m10.length, false, fArr), fArr, SystemClock.elapsedRealtime() - elapsedRealtime, length));
    }

    public static void d(Context context) {
        boolean z10;
        long j3;
        Context applicationContext = context.getApplicationContext();
        File file = new File(applicationContext.getFilesDir(), "tinylid.bin");
        if (System.currentTimeMillis() - mp.g1().getLong("tinylid_checked", 0L) > 86400000) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (file.exists()) {
            k(applicationContext);
        }
        if (file.exists() || l1.b()) {
            if ((file.exists() && !z10) || f43075f) {
                return;
            }
            f43075f = true;
            File file2 = new File(applicationContext.getFilesDir(), "tinylid.bin");
            if (!file2.exists()) {
                TLRPC.TL_transcriptionModel f10 = l1.f(l1.a(), "tinylid");
                if (f10 != null) {
                    j3 = f10.document.size;
                } else {
                    j3 = 0;
                }
                DictationAsr.h.putIfAbsent("tinylid.bin", new long[]{0, Math.max(j3, 4400000L)});
                DictationAsr.p();
            }
            f43072b.execute(new x0(file2, 0));
        }
    }

    public static boolean e(ArrayList arrayList) {
        String[][] strArr;
        if (arrayList != null) {
            for (String[] strArr2 : f43077i) {
                int size = arrayList.size();
                int i7 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    String language = Locale.forLanguageTag((String) obj).getLanguage();
                    int length = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        } else if (strArr2[i11].equals(language)) {
                            i7++;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (i7 >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f() {
        if (f43073c != 0) {
            return true;
        }
        return false;
    }

    public static void g(File file) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            int i7 = 0;
            while (i7 < length) {
                int read = fileInputStream.read(bArr, i7, length - i7);
                if (read <= 0) {
                    break;
                }
                i7 += read;
            }
            long nativeLoad = nativeLoad(bArr);
            if (nativeLoad == 0) {
                Log.e("Dictation", "tinylid: model rejected (" + file.length() + " bytes)");
            } else {
                long j3 = f43073c;
                d = nativeLanguages(nativeLoad);
                f43073c = nativeLoad;
                if (j3 != 0) {
                    nativeFree(j3);
                }
                Log.d("Dictation", "tinylid: loaded " + d.length + " classes in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            }
            fileInputStream.close();
        } catch (Throwable th2) {
            try {
                Log.e("Dictation", "tinylid: load failed", th2);
            } finally {
                f43076g = false;
                h();
            }
        }
    }

    public static void h() {
        Object obj = h;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public static float i(int i7) {
        if (i7 < 1000) {
            return 2.0f;
        }
        if (i7 < 2000) {
            return 0.85f;
        }
        if (i7 < 5000) {
            return 0.75f;
        }
        if (i7 < 10000) {
            return 0.6f;
        }
        return 0.5f;
    }

    public static void j(byte[] bArr, int i7, e1 e1Var) {
        if (f43073c == 0) {
            return;
        }
        f43071a.execute(new c1(bArr, i7, e1Var, 0));
    }

    public static void k(Context context) {
        if (!f43074e) {
            File file = new File(context.getApplicationContext().getFilesDir(), "tinylid.bin");
            if (!file.exists()) {
                return;
            }
            f43074e = true;
            f43076g = true;
            f43071a.execute(new x0(file, 1));
        }
    }

    public static void l(String str) {
        if (str != null && !str.equals(mp.g1().getString("tinylid_lang", null))) {
            mp.g1().edit().putString("tinylid_lang", str).apply();
        }
    }

    public static byte[] m(byte[] bArr) {
        int i7;
        int length = bArr.length / 960;
        if (length == 0) {
            return new byte[0];
        }
        float[] fArr = new float[length];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 * 960;
            double d2 = 0.0d;
            while (true) {
                i7 = i10 + 1;
                if (i11 < i7 * 960) {
                    float f10 = ((short) ((bArr[i11] & 255) | (bArr[i11 + 1] << 8))) / 32768.0f;
                    d2 += f10 * f10;
                    i11 += 2;
                }
            }
            fArr[i10] = (float) (Math.log10((d2 / 480.0d) + 1.0E-12d) * 10.0d);
            i10 = i7;
        }
        float[] fArr2 = (float[]) fArr.clone();
        Arrays.sort(fArr2);
        float max = Math.max(fArr2[(int) (length * 0.1f)] + 12.0f, -55.0f);
        int round = Math.round(6.666667f);
        boolean[] zArr = new boolean[length];
        for (int i12 = 0; i12 < length; i12++) {
            if (fArr[i12] > max) {
                for (int max2 = Math.max(0, i12 - round); max2 <= Math.min(length - 1, i12 + round); max2++) {
                    zArr[max2] = true;
                }
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (zArr[i14]) {
                i13++;
            }
        }
        byte[] bArr2 = new byte[i13 * 960];
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            if (zArr[i16]) {
                System.arraycopy(bArr, i16 * 960, bArr2, i15, 960);
                i15 += 960;
            }
        }
        return bArr2;
    }

    public static f1 n(float f10, float[] fArr) {
        boolean z10;
        String[] strArr = d;
        if (fArr != null && strArr != null && strArr.length == fArr.length) {
            boolean z11 = false;
            int i7 = 0;
            for (int i10 = 1; i10 < fArr.length; i10++) {
                if (fArr[i10] > fArr[i7]) {
                    i7 = i10;
                }
            }
            String str = strArr[i7];
            if (!"other".equals(str) && !"nospeech".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = fArr[i7];
            if (z10 && f11 >= f10) {
                z11 = true;
            }
            return new f1(str, f11, z11);
        }
        return null;
    }

    private static native void nativeFree(long j3);

    private static native String[] nativeLanguages(long j3);

    private static native long nativeLoad(byte[] bArr);

    private static native boolean nativePredict(long j3, byte[] bArr, int i7, int i10, boolean z10, float[] fArr);
}
