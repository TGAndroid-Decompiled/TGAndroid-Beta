package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RLottieNative {

    public final int[] f26461a;

    public long f26462b;

    public final AtomicBoolean f26463c = new AtomicBoolean(false);

    public RLottieNative(long j10, int[] iArr) {
        this.f26462b = j10;
        this.f26461a = iArr;
    }

    public static RLottieNative a(String str, String str2, int i10, int i11, int[] iArr, boolean z10, int[] iArr2, boolean z11, int i12, HashMap map) {
        String[] strArr;
        int[] iArr3;
        int[] iArr4 = new int[3];
        Trace.beginSection("RLottieNative#create");
        if (map == null) {
            strArr = null;
        } else {
            try {
                strArr = (String[]) map.keySet().toArray(new String[0]);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (map == null) {
            iArr3 = null;
        } else {
            int[] iArr5 = new int[strArr.length];
            for (int i13 = 0; i13 < strArr.length; i13++) {
                iArr5[i13] = ((Integer) map.get(strArr[i13])).intValue();
            }
            iArr3 = iArr5;
        }
        long jNCreate = nCreate(str, str2, i10, i11, iArr4, z10, iArr2, z11, i12, strArr, iArr3);
        Trace.endSection();
        if (jNCreate == 0) {
            return null;
        }
        if (iArr != null && iArr.length == 3) {
            System.arraycopy(iArr4, 0, iArr, 0, 3);
        }
        return new RLottieNative(jNCreate, iArr4);
    }

    public static RLottieNative b(String str, String str2, int[] iArr, int[] iArr2, HashMap map) {
        int[] iArr3;
        if (str != null && !str.isEmpty()) {
            int[] iArr4 = new int[3];
            String[] strArr = map == null ? null : (String[]) map.keySet().toArray(new String[0]);
            if (map == null) {
                iArr3 = null;
            } else {
                int[] iArr5 = new int[strArr.length];
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    iArr5[i10] = ((Integer) map.get(strArr[i10])).intValue();
                }
                iArr3 = iArr5;
            }
            Trace.beginSection("RLottieNative#createWithJson");
            try {
                long jNCreateWithJson = nCreateWithJson(str, str2, iArr4, iArr2, strArr, iArr3);
                Trace.endSection();
                if (jNCreateWithJson != 0) {
                    if (iArr != null && iArr.length == 3) {
                        System.arraycopy(iArr4, 0, iArr, 0, 3);
                    }
                    return new RLottieNative(jNCreateWithJson, iArr4);
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        return null;
    }

    private static native long nCreate(String str, String str2, int i10, int i11, int[] iArr, boolean z10, int[] iArr2, boolean z11, int i12, String[] strArr, int[] iArr3);

    private static native long nCreateWithJson(String str, String str2, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3);

    private static native void nDestroy(long j10);

    private static native int nGetFrame(long j10, int i10, Bitmap bitmap, boolean z10);

    public final int c(int i10, Bitmap bitmap, boolean z10) {
        if (this.f26463c.get()) {
            throw new IllegalStateException("Called method on a recycled RLottie instance");
        }
        long j10 = this.f26462b;
        Trace.beginSection("RLottieNative#getFrame");
        try {
            return nGetFrame(j10, i10, bitmap, z10);
        } finally {
            Trace.endSection();
        }
    }

    public final void d() {
        if (this.f26463c.compareAndSet(false, true)) {
            long j10 = this.f26462b;
            this.f26462b = 0L;
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

    public final void finalize() throws Throwable {
        try {
            if (!this.f26463c.get()) {
                d();
            }
        } finally {
            super.finalize();
        }
    }
}
