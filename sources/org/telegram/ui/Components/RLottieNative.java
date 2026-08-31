package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
public final class RLottieNative {
    public final int[] f24963a;
    public long f24964b;
    public final AtomicBoolean f24965c = new AtomicBoolean(false);

    public RLottieNative(long j10, int[] iArr) {
        this.f24964b = j10;
        this.f24963a = iArr;
    }

    public static RLottieNative a(String str, String str2, int i10, int i11, int[] iArr, boolean z4, int[] iArr2, boolean z10, int i12, HashMap hashMap) {
        String[] strArr;
        int[] iArr3;
        String str3;
        int i13;
        int i14;
        boolean z11;
        int[] iArr4;
        boolean z12;
        int i15;
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
            i13 = i10;
            i14 = i11;
            z11 = z4;
            iArr4 = iArr2;
            z12 = z10;
            i15 = i12;
        } else {
            int[] iArr6 = new int[strArr.length];
            for (int i16 = 0; i16 < strArr.length; i16++) {
                iArr6[i16] = ((Integer) hashMap.get(strArr[i16])).intValue();
            }
            iArr3 = iArr6;
            str3 = str2;
            i13 = i10;
            i14 = i11;
            z11 = z4;
            iArr4 = iArr2;
            z12 = z10;
            i15 = i12;
            str4 = str;
        }
        long nCreate = nCreate(str4, str3, i13, i14, iArr5, z11, iArr4, z12, i15, strArr, iArr3);
        Trace.endSection();
        if (nCreate == 0) {
            return null;
        }
        if (iArr != null && iArr.length == 3) {
            System.arraycopy(iArr5, 0, iArr, 0, 3);
        }
        return new RLottieNative(nCreate, iArr5);
    }

    public static RLottieNative b(String str, String str2, int[] iArr, int[] iArr2, HashMap hashMap) {
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
                int[] iArr5 = new int[strArr.length];
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    iArr5[i10] = ((Integer) hashMap.get(strArr[i10])).intValue();
                }
                iArr3 = iArr5;
            }
            Trace.beginSection("RLottieNative#createWithJson");
            try {
                long nCreateWithJson = nCreateWithJson(str, str2, iArr4, iArr2, strArr, iArr3);
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

    private static native long nCreate(String str, String str2, int i10, int i11, int[] iArr, boolean z4, int[] iArr2, boolean z10, int i12, String[] strArr, int[] iArr3);

    private static native long nCreateWithJson(String str, String str2, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3);

    private static native void nDestroy(long j10);

    private static native int nGetFrame(long j10, int i10, Bitmap bitmap, boolean z4);

    public final int c(int i10, Bitmap bitmap, boolean z4) {
        if (!this.f24965c.get()) {
            long j10 = this.f24964b;
            Trace.beginSection("RLottieNative#getFrame");
            try {
                return nGetFrame(j10, i10, bitmap, z4);
            } finally {
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Called method on a recycled RLottie instance");
    }

    public final void d() {
        if (this.f24965c.compareAndSet(false, true)) {
            long j10 = this.f24964b;
            this.f24964b = 0L;
            if (j10 != 0) {
                Trace.beginSection("RLottieNative#destroy");
                try {
                    nDestroy(j10);
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public final void finalize() {
        try {
            if (!this.f24965c.get()) {
                d();
            }
        } finally {
            super.finalize();
        }
    }
}
