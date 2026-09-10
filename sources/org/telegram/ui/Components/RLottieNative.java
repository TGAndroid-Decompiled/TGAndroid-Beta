package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
public final class RLottieNative {
    public final int[] f21207a;
    public long f21208b;
    public final AtomicBoolean f21209c = new AtomicBoolean(false);

    public RLottieNative(long j3, int[] iArr) {
        this.f21208b = j3;
        this.f21207a = iArr;
    }

    public static RLottieNative a(String str, String str2, int[] iArr, int[] iArr2, int i10, HashMap hashMap) {
        String[] strArr;
        int[] iArr3;
        String str3;
        int[] iArr4;
        int i11;
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
            i11 = i10;
        } else {
            int[] iArr6 = new int[strArr.length];
            for (int i12 = 0; i12 < strArr.length; i12++) {
                iArr6[i12] = ((Integer) hashMap.get(strArr[i12])).intValue();
            }
            iArr3 = iArr6;
            str3 = str2;
            iArr4 = iArr2;
            i11 = i10;
            str4 = str;
        }
        long nCreate = nCreate(str4, str3, iArr5, iArr4, i11, strArr, iArr3);
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
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    iArr3[i10] = ((Integer) hashMap.get(strArr[i10])).intValue();
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

    private static native long nCreate(String str, String str2, int[] iArr, int[] iArr2, int i10, String[] strArr, int[] iArr3);

    private static native long nCreateWithJson(String str, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3);

    private static native void nDestroy(long j3);

    private static native int nGetFrame(long j3, int i10, Bitmap bitmap, boolean z10);

    public final int c(int i10, Bitmap bitmap, boolean z10) {
        if (!this.f21209c.get()) {
            long j3 = this.f21208b;
            Trace.beginSection("RLottieNative#getFrame");
            try {
                return nGetFrame(j3, i10, bitmap, z10);
            } finally {
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Called method on a recycled RLottie instance");
    }

    public final void d() {
        if (this.f21209c.compareAndSet(false, true)) {
            long j3 = this.f21208b;
            this.f21208b = 0L;
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
            if (!this.f21209c.get()) {
                d();
            }
        } finally {
            super.finalize();
        }
    }
}
