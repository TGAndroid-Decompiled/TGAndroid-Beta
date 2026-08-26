package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RLottieNative {
    public final int[] mMetaData;
    public long mNativePtr;
    public final AtomicBoolean mRecycled = new AtomicBoolean(false);

    public RLottieNative(long j, int[] iArr) {
        this.mNativePtr = j;
        this.mMetaData = iArr;
    }

    public static RLottieNative createFromFile(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3, HashMap map) {
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
            for (int i4 = 0; i4 < strArr.length; i4++) {
                iArr5[i4] = ((Integer) map.get(strArr[i4])).intValue();
            }
            iArr3 = iArr5;
        }
        long jNCreate = nCreate(str, str2, i, i2, iArr4, z, iArr2, z2, i3, strArr, iArr3);
        Trace.endSection();
        if (jNCreate == 0) {
            return null;
        }
        if (iArr != null && iArr.length == 3) {
            System.arraycopy(iArr4, 0, iArr, 0, 3);
        }
        return new RLottieNative(jNCreate, iArr4);
    }

    public static RLottieNative createFromRawJson(String str, String str2, int[] iArr, int[] iArr2, HashMap map) {
        int[] iArr3;
        if (str != null && !str.isEmpty()) {
            int[] iArr4 = new int[3];
            String[] strArr = map == null ? null : (String[]) map.keySet().toArray(new String[0]);
            if (map == null) {
                iArr3 = null;
            } else {
                int[] iArr5 = new int[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    iArr5[i] = ((Integer) map.get(strArr[i])).intValue();
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

    private static native long nCreate(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3, String[] strArr, int[] iArr3);

    private static native long nCreateWithJson(String str, String str2, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3);

    private static native void nDestroy(long j);

    private static native int nGetFrame(long j, int i, Bitmap bitmap, boolean z);

    public final void finalize() throws Throwable {
        try {
            if (!this.mRecycled.get()) {
                recycle();
            }
        } finally {
            super.finalize();
        }
    }

    public final int getFrame(int i, Bitmap bitmap, boolean z) {
        if (this.mRecycled.get()) {
            throw new IllegalStateException("Called method on a recycled RLottie instance");
        }
        long j = this.mNativePtr;
        Trace.beginSection("RLottieNative#getFrame");
        try {
            return nGetFrame(j, i, bitmap, z);
        } finally {
            Trace.endSection();
        }
    }

    public final void recycle() {
        if (this.mRecycled.compareAndSet(false, true)) {
            long j = this.mNativePtr;
            this.mNativePtr = 0L;
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
}
