package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
public final class RLottieNative {
    public final int[] f26465a;
    public long f26466b;
    public final AtomicBoolean f26467c = new AtomicBoolean(false);

    public RLottieNative(long j10, int[] iArr) {
        this.f26466b = j10;
        this.f26465a = iArr;
    }

    public static RLottieNative a(String str, String str2, int i9, int i10, int[] iArr, boolean z10, int[] iArr2, boolean z11, int i11, HashMap hashMap) {
        String[] strArr;
        int[] iArr3;
        String str3;
        int i12;
        int i13;
        boolean z12;
        int[] iArr4;
        boolean z13;
        int i14;
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
            i12 = i9;
            i13 = i10;
            z12 = z10;
            iArr4 = iArr2;
            z13 = z11;
            i14 = i11;
        } else {
            int[] iArr6 = new int[strArr.length];
            for (int i15 = 0; i15 < strArr.length; i15++) {
                iArr6[i15] = ((Integer) hashMap.get(strArr[i15])).intValue();
            }
            iArr3 = iArr6;
            str3 = str2;
            i12 = i9;
            i13 = i10;
            z12 = z10;
            iArr4 = iArr2;
            z13 = z11;
            i14 = i11;
            str4 = str;
        }
        long nCreate = nCreate(str4, str3, i12, i13, iArr5, z12, iArr4, z13, i14, strArr, iArr3);
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
                for (int i9 = 0; i9 < strArr.length; i9++) {
                    iArr5[i9] = ((Integer) hashMap.get(strArr[i9])).intValue();
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
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        return null;
    }

    private static native long nCreate(String str, String str2, int i9, int i10, int[] iArr, boolean z10, int[] iArr2, boolean z11, int i11, String[] strArr, int[] iArr3);

    private static native long nCreateWithJson(String str, String str2, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3);

    private static native void nDestroy(long j10);

    private static native int nGetFrame(long j10, int i9, Bitmap bitmap, boolean z10);

    public final int c(int i9, Bitmap bitmap, boolean z10) {
        if (!this.f26467c.get()) {
            long j10 = this.f26466b;
            Trace.beginSection("RLottieNative#getFrame");
            try {
                return nGetFrame(j10, i9, bitmap, z10);
            } finally {
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Called method on a recycled RLottie instance");
    }

    public final void d() {
        if (this.f26467c.compareAndSet(false, true)) {
            long j10 = this.f26466b;
            this.f26466b = 0L;
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
            if (!this.f26467c.get()) {
                d();
            }
        } finally {
            super.finalize();
        }
    }
}
