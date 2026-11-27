package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
public final class RLottieNative {
    public final int[] a;
    public long b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public RLottieNative(long j, int[] iArr) {
        this.b = j;
        this.a = iArr;
    }

    public static RLottieNative a(String str, String str2, int[] iArr, int[] iArr2, int i, HashMap hashMap) {
        String[] strArr;
        int[] iArr3;
        String str3;
        int[] iArr4;
        int i2;
        String str4;
        int[] iArr5 = new int[3];
        Trace.beginSection("RLottieNative#create");
        if (hashMap == null) {
            strArr = null;
        } else {
            try {
                strArr = (String[]) hashMap.keySet().toArray(new String[0]);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashMap == null) {
            iArr3 = null;
            str4 = str;
            str3 = str2;
            iArr4 = iArr2;
            i2 = i;
        } else {
            int[] iArr6 = new int[strArr.length];
            for (int i3 = 0; i3 < strArr.length; i3++) {
                iArr6[i3] = ((Integer) hashMap.get(strArr[i3])).intValue();
            }
            iArr3 = iArr6;
            str3 = str2;
            iArr4 = iArr2;
            i2 = i;
            str4 = str;
        }
        long nCreate = nCreate(str4, str3, iArr5, iArr4, i2, strArr, iArr3);
        Trace.endSection();
        if (nCreate == 0) {
            return null;
        }
        if (iArr != null && iArr.length == 3) {
            System.arraycopy(iArr5, 0, iArr, 0, 3);
        }
        return new RLottieNative(nCreate, iArr5);
    }

    public static RLottieNative b(String str, int[] iArr, int[] iArr2, HashMap hashMap) {
        String[] strArr;
        int[] iArr3;
        if (str != null && !str.isEmpty()) {
            int[] iArr4 = new int[3];
            if (hashMap == null) {
                strArr = null;
                iArr3 = null;
            } else {
                strArr = (String[]) hashMap.keySet().toArray(new String[0]);
                iArr3 = new int[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    iArr3[i] = ((Integer) hashMap.get(strArr[i])).intValue();
                }
            }
            Trace.beginSection("RLottieNative#createWithJson");
            try {
                long nCreateWithJson = nCreateWithJson(str, iArr4, iArr2, strArr, iArr3);
                Trace.endSection();
                if (nCreateWithJson != 0) {
                    if (iArr != null && iArr.length == 3) {
                        System.arraycopy(iArr4, 0, iArr, 0, 3);
                    }
                    return new RLottieNative(nCreateWithJson, iArr4);
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        return null;
    }

    private static native long nCreate(String str, String str2, int[] iArr, int[] iArr2, int i, String[] strArr, int[] iArr3);

    private static native long nCreateWithJson(String str, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3);

    private static native void nDestroy(long j);

    private static native int nGetFrame(long j, int i, Bitmap bitmap, boolean z);

    public final int c(int i, Bitmap bitmap, boolean z) {
        if (!this.c.get()) {
            long j = this.b;
            Trace.beginSection("RLottieNative#getFrame");
            try {
                return nGetFrame(j, i, bitmap, z);
            } finally {
                Trace.endSection();
            }
        }
        grb.i("Called method on a recycled RLottie instance");
        return 0;
    }

    public final void d() {
        if (this.c.compareAndSet(false, true)) {
            long j = this.b;
            this.b = 0L;
            if (j != 0) {
                Trace.beginSection("RLottieNative#destroy");
                try {
                    nDestroy(j);
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public final void finalize() {
        try {
            if (!this.c.get()) {
                d();
            }
        } finally {
            super.finalize();
        }
    }
}
