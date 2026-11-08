package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
public final class RLottieNative {
    public final int[] f31473a;
    public long f31474b;
    public final AtomicBoolean f31475c = new AtomicBoolean(false);

    public RLottieNative(long j3, int[] iArr) {
        this.f31474b = j3;
        this.f31473a = iArr;
    }

    public static RLottieNative a(String str, String str2, int[] iArr, int[] iArr2, int i7, HashMap hashMap) {
        String[] strArr;
        int[] iArr3;
        String str3;
        int[] iArr4;
        int i10;
        String str4;
        int[] iArr5 = new int[3];
        Trace.beginSection("RLottieNative#create");
        if (hashMap == null) {
            strArr = null;
        } else {
            try {
                strArr = (String[]) hashMap.keySet().toArray(new String[0]);
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashMap == null) {
            iArr3 = null;
            str4 = str;
            str3 = str2;
            iArr4 = iArr2;
            i10 = i7;
        } else {
            int[] iArr6 = new int[strArr.length];
            for (int i11 = 0; i11 < strArr.length; i11++) {
                iArr6[i11] = ((Integer) hashMap.get(strArr[i11])).intValue();
            }
            iArr3 = iArr6;
            str3 = str2;
            iArr4 = iArr2;
            i10 = i7;
            str4 = str;
        }
        long nCreate = nCreate(str4, str3, iArr5, iArr4, i10, strArr, iArr3);
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
            } else {
                strArr = (String[]) hashMap.keySet().toArray(new String[0]);
            }
            if (hashMap == null) {
                iArr3 = null;
            } else {
                iArr3 = new int[strArr.length];
                for (int i7 = 0; i7 < strArr.length; i7++) {
                    iArr3[i7] = ((Integer) hashMap.get(strArr[i7])).intValue();
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
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        return null;
    }

    private static native long nCreate(String str, String str2, int[] iArr, int[] iArr2, int i7, String[] strArr, int[] iArr3);

    private static native long nCreateWithJson(String str, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3);

    private static native void nDestroy(long j3);

    private static native int nGetFrame(long j3, int i7, Bitmap bitmap, boolean z9);

    public final int c(int i7, Bitmap bitmap, boolean z9) {
        if (!this.f31475c.get()) {
            long j3 = this.f31474b;
            Trace.beginSection("RLottieNative#getFrame");
            try {
                return nGetFrame(j3, i7, bitmap, z9);
            } finally {
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Called method on a recycled RLottie instance");
    }

    public final void d() {
        if (this.f31475c.compareAndSet(false, true)) {
            long j3 = this.f31474b;
            this.f31474b = 0L;
            if (j3 != 0) {
                Trace.beginSection("RLottieNative#destroy");
                try {
                    nDestroy(j3);
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public final void finalize() {
        try {
            if (!this.f31475c.get()) {
                d();
            }
        } finally {
            super.finalize();
        }
    }
}
