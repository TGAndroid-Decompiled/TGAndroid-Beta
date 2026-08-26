package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RLottieNative {
    private final int[] mMetaData;
    private long mNativePtr;
    private final AtomicBoolean mRecycled = new AtomicBoolean(false);

    private RLottieNative(long j, int[] iArr) {
        this.mNativePtr = j;
        this.mMetaData = iArr;
    }

    private void checkNotRecycled() {
        if (this.mRecycled.get()) {
            throw new IllegalStateException("Called method on a recycled RLottie instance");
        }
    }

    public static long create(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3) {
        return create(str, str2, i, i2, iArr, z, iArr2, z2, i3, null);
    }

    public static RLottieNative createFromFile(String str, String str2, int i, int i2, boolean z, int[] iArr, boolean z2, int i3) {
        return createFromFile(str, str2, i, i2, null, z, iArr, z2, i3, null);
    }

    public static RLottieNative createFromRawJson(String str, String str2, int[] iArr) {
        return createFromRawJson(str, str2, null, iArr);
    }

    private static long createWithJson(String str, String str2, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3) {
        Trace.beginSection("RLottieNative#createWithJson");
        try {
            return nCreateWithJson(str, str2, iArr, iArr2, strArr, iArr3);
        } finally {
            Trace.endSection();
        }
    }

    public static void destroy(long j) {
        Trace.beginSection("RLottieNative#destroy");
        try {
            nDestroy(j);
        } finally {
            Trace.endSection();
        }
    }

    public static double getDuration(String str, String str2) {
        RLottieNative rLottieNativeCreateFromFile = createFromFile(str, str2, 0, 0, false, null, false, 0);
        if (rLottieNativeCreateFromFile == null) {
            return 0.0d;
        }
        int frameCount = rLottieNativeCreateFromFile.getFrameCount();
        int fps = rLottieNativeCreateFromFile.getFps();
        rLottieNativeCreateFromFile.recycle();
        return ((double) frameCount) / ((double) fps);
    }

    public static long getFramesCount(String str, String str2) {
        RLottieNative rLottieNativeCreateFromFile = createFromFile(str, str2, 0, 0, false, null, false, 0);
        if (rLottieNativeCreateFromFile == null) {
            return 0L;
        }
        int frameCount = rLottieNativeCreateFromFile.getFrameCount();
        rLottieNativeCreateFromFile.recycle();
        return frameCount;
    }

    private static int[] layerNamesToColors(String[] strArr, Map<String, Integer> map) {
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = map.get(strArr[i]).intValue();
        }
        return iArr;
    }

    private static native long nCreate(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3, String[] strArr, int[] iArr3);

    private static native long nCreateWithJson(String str, String str2, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3);

    private static native void nDestroy(long j);

    private static native int nGetFrame(long j, int i, Bitmap bitmap, boolean z);

    public void finalize() throws Throwable {
        try {
            if (!this.mRecycled.get()) {
                recycle();
            }
        } finally {
            super.finalize();
        }
    }

    public int getFps() {
        return this.mMetaData[1];
    }

    public int getFrame(int i, Bitmap bitmap, boolean z) {
        checkNotRecycled();
        return getFrame(this.mNativePtr, i, bitmap, z);
    }

    public int getFrameCount() {
        return this.mMetaData[0];
    }

    public boolean isRecycled() {
        return this.mRecycled.get();
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

    private static long create(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3, Map<String, Integer> map) {
        String[] strArr;
        Trace.beginSection("RLottieNative#create");
        if (map == null) {
            strArr = null;
        } else {
            try {
                strArr = (String[]) map.keySet().toArray(new String[0]);
            } finally {
                Trace.endSection();
            }
        }
        return nCreate(str, str2, i, i2, iArr, z, iArr2, z2, i3, strArr, map != null ? layerNamesToColors(strArr, map) : null);
    }

    public static RLottieNative createFromFile(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3, Map<String, Integer> map) {
        int[] iArr3 = new int[3];
        long jCreate = create(str, str2, i, i2, iArr3, z, iArr2, z2, i3, map);
        if (jCreate == 0) {
            return null;
        }
        if (iArr != null && iArr.length == 3) {
            System.arraycopy(iArr3, 0, iArr, 0, 3);
        }
        return new RLottieNative(jCreate, iArr3);
    }

    public static RLottieNative createFromRawJson(String str, String str2, int[] iArr, int[] iArr2) {
        return createFromRawJson(str, str2, iArr, iArr2, null);
    }

    public static RLottieNative createFromRawJson(String str, String str2, int[] iArr, int[] iArr2, Map<String, Integer> map) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        int[] iArr3 = new int[3];
        String[] strArr = map == null ? null : (String[]) map.keySet().toArray(new String[0]);
        long jCreateWithJson = createWithJson(str, str2, iArr3, iArr2, strArr, map == null ? null : layerNamesToColors(strArr, map));
        if (jCreateWithJson == 0) {
            return null;
        }
        if (iArr != null && iArr.length == 3) {
            System.arraycopy(iArr3, 0, iArr, 0, 3);
        }
        return new RLottieNative(jCreateWithJson, iArr3);
    }

    public static int getFrame(long j, int i, Bitmap bitmap, boolean z) {
        Trace.beginSection("RLottieNative#getFrame");
        try {
            return nGetFrame(j, i, bitmap, z);
        } finally {
            Trace.endSection();
        }
    }
}
