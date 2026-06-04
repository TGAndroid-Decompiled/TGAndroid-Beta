package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RLottieNative {
    private final int[] mMetaData;
    private long mNativePtr;
    private final AtomicBoolean mRecycled = new AtomicBoolean(false);

    private static native long nCreate(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3);

    private static native long nCreateWithJson(String str, String str2, int[] iArr, int[] iArr2);

    private static native void nDestroy(long j);

    private static native double nGetDuration(String str, String str2);

    private static native int nGetFrame(long j, int i, Bitmap bitmap, boolean z);

    private static native long nGetFramesCount(String str, String str2);

    private static native void nReplaceColors(long j, int[] iArr);

    private static native void nSetLayerColor(long j, String str, int i);

    private RLottieNative(long j, int[] iArr) {
        this.mNativePtr = j;
        this.mMetaData = iArr;
    }

    public static RLottieNative createFromRawJson(String str, String str2, int[] iArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        int[] iArr2 = new int[3];
        long jCreateWithJson = createWithJson(str, str2, iArr2, iArr);
        if (jCreateWithJson == 0) {
            return null;
        }
        return new RLottieNative(jCreateWithJson, iArr2);
    }

    public int getFrame(int i, Bitmap bitmap, boolean z) {
        checkNotRecycled();
        return getFrame(this.mNativePtr, i, bitmap, z);
    }

    public void recycle() {
        if (this.mRecycled.compareAndSet(false, true)) {
            long j = this.mNativePtr;
            this.mNativePtr = 0L;
            if (j != 0) {
                destroy(j);
            }
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (!this.mRecycled.get()) {
                recycle();
            }
        } finally {
            super.finalize();
        }
    }

    private void checkNotRecycled() {
        if (this.mRecycled.get()) {
            throw new IllegalStateException("Called method on a recycled RLottie instance");
        }
    }

    public static long create(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3) {
        Trace.beginSection("RLottieNative#create");
        try {
            return nCreate(str, str2, i, i2, iArr, z, iArr2, z2, i3);
        } finally {
            Trace.endSection();
        }
    }

    public static long createWithJson(String str, String str2, int[] iArr, int[] iArr2) {
        Trace.beginSection("RLottieNative#createWithJson");
        try {
            return nCreateWithJson(str, str2, iArr, iArr2);
        } finally {
            Trace.endSection();
        }
    }

    public static int getFrame(long j, int i, Bitmap bitmap, boolean z) {
        Trace.beginSection("RLottieNative#getFrame");
        try {
            return nGetFrame(j, i, bitmap, z);
        } finally {
            Trace.endSection();
        }
    }

    public static void setLayerColor(long j, String str, int i) {
        nSetLayerColor(j, str, i);
    }

    public static void replaceColors(long j, int[] iArr) {
        nReplaceColors(j, iArr);
    }

    public static void destroy(long j) {
        nDestroy(j);
    }

    public static long getFramesCount(String str, String str2) {
        return nGetFramesCount(str, str2);
    }

    public static double getDuration(String str, String str2) {
        return nGetDuration(str, str2);
    }
}
