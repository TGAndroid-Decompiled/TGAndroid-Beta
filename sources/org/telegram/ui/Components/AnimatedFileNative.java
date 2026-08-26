package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AnimatedFileDrawableStream;

public class AnimatedFileNative {
    public final int[] mMetaData;
    public long mNativePtr;
    public final AtomicBoolean mRecycled = new AtomicBoolean(false);

    public AnimatedFileNative(long j, int[] iArr) {
        this.mNativePtr = j;
        this.mMetaData = iArr;
    }

    public static AnimatedFileNative createDecoderFrom(String str, int[] iArr, int i, long j, AnimatedFileDrawableStream animatedFileDrawableStream, boolean z) {
        Trace.beginSection("AnimatedFileNative#createDecoder");
        try {
            long jNCreateDecoder = nCreateDecoder(str, iArr, i, j, animatedFileDrawableStream, z);
            Trace.endSection();
            if (jNCreateDecoder == 0) {
                return null;
            }
            return new AnimatedFileNative(jNCreateDecoder, iArr);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static void getVideoInfo(String str, int[] iArr, long j) {
        Trace.beginSection("AnimatedFileNative#getVideoInfo");
        try {
            nGetVideoInfo(str, iArr, j);
        } finally {
            Trace.endSection();
        }
    }

    private static native long nCreateDecoder(String str, int[] iArr, int i, long j, Object obj, boolean z);

    private static native void nDestroyDecoder(long j);

    private static native int nGetFrameAtTime(long j, long j2, Bitmap bitmap, int[] iArr);

    private static native int nGetVideoFrame(long j, Bitmap bitmap, int[] iArr, boolean z, float f, float f2, boolean z2);

    private static native void nGetVideoInfo(String str, int[] iArr, long j);

    private static native void nPrepareToSeek(long j);

    private static native void nSeekToMs(long j, long j2, int[] iArr, boolean z);

    private static native void nStopDecoder(long j);

    public final void finalize() throws Throwable {
        try {
            if (!this.mRecycled.get()) {
                recycle();
            }
        } finally {
            super.finalize();
        }
    }

    public final int getFrameAtTime(Bitmap bitmap, long j) {
        this.mRecycled.get();
        long j2 = this.mNativePtr;
        int[] iArr = this.mMetaData;
        Trace.beginSection("AnimatedFileNative#getFrameAtTime");
        try {
            return nGetFrameAtTime(j2, j, bitmap, iArr);
        } finally {
            Trace.endSection();
        }
    }

    public final int getVideoFrame(Bitmap bitmap, boolean z, float f, float f2, boolean z2) {
        this.mRecycled.get();
        long j = this.mNativePtr;
        int[] iArr = this.mMetaData;
        Trace.beginSection("AnimatedFileNative#getVideoFrame");
        try {
            return nGetVideoFrame(j, bitmap, iArr, z, f, f2, z2);
        } finally {
            Trace.endSection();
        }
    }

    public final void prepareToSeek() {
        this.mRecycled.get();
        long j = this.mNativePtr;
        Trace.beginSection("AnimatedFileNative#prepareToSeek");
        try {
            nPrepareToSeek(j);
        } finally {
            Trace.endSection();
        }
    }

    public final void recycle() {
        if (this.mRecycled.compareAndSet(false, true)) {
            long j = this.mNativePtr;
            this.mNativePtr = 0L;
            if (j != 0) {
                Trace.beginSection("AnimatedFileNative#destroyDecoder");
                try {
                    nDestroyDecoder(j);
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public final void seekToMs(long j, boolean z) {
        this.mRecycled.get();
        long j2 = this.mNativePtr;
        int[] iArr = this.mMetaData;
        Trace.beginSection("AnimatedFileNative#seekToMs");
        try {
            nSeekToMs(j2, j, iArr, z);
        } finally {
            Trace.endSection();
        }
    }

    public final void stopDecoder() {
        this.mRecycled.get();
        long j = this.mNativePtr;
        Trace.beginSection("AnimatedFileNative#stopDecoder");
        try {
            nStopDecoder(j);
        } finally {
            Trace.endSection();
        }
    }
}
