package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AnimatedFileDrawableStream;
public class AnimatedFileNative {
    public final int[] f24559a;
    public long f24560b;
    public final AtomicBoolean f24561c = new AtomicBoolean(false);

    public AnimatedFileNative(long j10, int[] iArr) {
        this.f24560b = j10;
        this.f24559a = iArr;
    }

    public static AnimatedFileNative a(String str, int[] iArr, int i10, long j10, AnimatedFileDrawableStream animatedFileDrawableStream, boolean z4) {
        Trace.beginSection("AnimatedFileNative#createDecoder");
        try {
            long nCreateDecoder = nCreateDecoder(str, iArr, i10, j10, animatedFileDrawableStream, z4);
            Trace.endSection();
            if (nCreateDecoder == 0) {
                return null;
            }
            return new AnimatedFileNative(nCreateDecoder, iArr);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static void d(String str, int[] iArr, long j10) {
        Trace.beginSection("AnimatedFileNative#getVideoInfo");
        try {
            nGetVideoInfo(str, iArr, j10);
        } finally {
            Trace.endSection();
        }
    }

    private static native long nCreateDecoder(String str, int[] iArr, int i10, long j10, Object obj, boolean z4);

    private static native void nDestroyDecoder(long j10);

    private static native int nGetFrameAtTime(long j10, long j11, Bitmap bitmap, int[] iArr);

    private static native int nGetVideoFrame(long j10, Bitmap bitmap, int[] iArr, boolean z4, float f10, float f11, boolean z10);

    private static native void nGetVideoInfo(String str, int[] iArr, long j10);

    private static native void nPrepareToSeek(long j10);

    private static native void nSeekToMs(long j10, long j11, int[] iArr, boolean z4);

    private static native void nStopDecoder(long j10);

    public final int b(Bitmap bitmap, long j10) {
        this.f24561c.get();
        long j11 = this.f24560b;
        int[] iArr = this.f24559a;
        Trace.beginSection("AnimatedFileNative#getFrameAtTime");
        try {
            return nGetFrameAtTime(j11, j10, bitmap, iArr);
        } finally {
            Trace.endSection();
        }
    }

    public final int c(Bitmap bitmap, boolean z4, float f10, float f11, boolean z10) {
        this.f24561c.get();
        long j10 = this.f24560b;
        int[] iArr = this.f24559a;
        Trace.beginSection("AnimatedFileNative#getVideoFrame");
        try {
            return nGetVideoFrame(j10, bitmap, iArr, z4, f10, f11, z10);
        } finally {
            Trace.endSection();
        }
    }

    public final void e() {
        this.f24561c.get();
        long j10 = this.f24560b;
        Trace.beginSection("AnimatedFileNative#prepareToSeek");
        try {
            nPrepareToSeek(j10);
        } finally {
            Trace.endSection();
        }
    }

    public final void f() {
        if (this.f24561c.compareAndSet(false, true)) {
            long j10 = this.f24560b;
            this.f24560b = 0L;
            if (j10 != 0) {
                Trace.beginSection("AnimatedFileNative#destroyDecoder");
                try {
                    nDestroyDecoder(j10);
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public final void finalize() {
        try {
            if (!this.f24561c.get()) {
                f();
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(long j10, boolean z4) {
        this.f24561c.get();
        long j11 = this.f24560b;
        int[] iArr = this.f24559a;
        Trace.beginSection("AnimatedFileNative#seekToMs");
        try {
            nSeekToMs(j11, j10, iArr, z4);
        } finally {
            Trace.endSection();
        }
    }

    public final void h() {
        this.f24561c.get();
        long j10 = this.f24560b;
        Trace.beginSection("AnimatedFileNative#stopDecoder");
        try {
            nStopDecoder(j10);
        } finally {
            Trace.endSection();
        }
    }
}
