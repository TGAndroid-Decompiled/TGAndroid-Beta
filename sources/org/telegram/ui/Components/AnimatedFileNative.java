package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AnimatedFileDrawableStream;
public class AnimatedFileNative {
    public final int[] f26074a;
    public long f26075b;
    public final AtomicBoolean f26076c = new AtomicBoolean(false);

    public AnimatedFileNative(long j10, int[] iArr) {
        this.f26075b = j10;
        this.f26074a = iArr;
    }

    public static AnimatedFileNative a(String str, int[] iArr, int i10, long j10, AnimatedFileDrawableStream animatedFileDrawableStream, boolean z10) {
        Trace.beginSection("AnimatedFileNative#createDecoder");
        try {
            long nCreateDecoder = nCreateDecoder(str, iArr, i10, j10, animatedFileDrawableStream, z10);
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

    private static native long nCreateDecoder(String str, int[] iArr, int i10, long j10, Object obj, boolean z10);

    private static native void nDestroyDecoder(long j10);

    private static native int nGetFrameAtTime(long j10, long j11, Bitmap bitmap, int[] iArr);

    private static native int nGetVideoFrame(long j10, Bitmap bitmap, int[] iArr, boolean z10, float f9, float f10, boolean z11);

    private static native void nGetVideoInfo(String str, int[] iArr, long j10);

    private static native void nPrepareToSeek(long j10);

    private static native void nSeekToMs(long j10, long j11, int[] iArr, boolean z10);

    private static native void nStopDecoder(long j10);

    public final int b(Bitmap bitmap, long j10) {
        this.f26076c.get();
        long j11 = this.f26075b;
        int[] iArr = this.f26074a;
        Trace.beginSection("AnimatedFileNative#getFrameAtTime");
        try {
            return nGetFrameAtTime(j11, j10, bitmap, iArr);
        } finally {
            Trace.endSection();
        }
    }

    public final int c(Bitmap bitmap, boolean z10, float f9, float f10, boolean z11) {
        this.f26076c.get();
        long j10 = this.f26075b;
        int[] iArr = this.f26074a;
        Trace.beginSection("AnimatedFileNative#getVideoFrame");
        try {
            return nGetVideoFrame(j10, bitmap, iArr, z10, f9, f10, z11);
        } finally {
            Trace.endSection();
        }
    }

    public final void e() {
        this.f26076c.get();
        long j10 = this.f26075b;
        Trace.beginSection("AnimatedFileNative#prepareToSeek");
        try {
            nPrepareToSeek(j10);
        } finally {
            Trace.endSection();
        }
    }

    public final void f() {
        if (this.f26076c.compareAndSet(false, true)) {
            long j10 = this.f26075b;
            this.f26075b = 0L;
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
            if (!this.f26076c.get()) {
                f();
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(long j10, boolean z10) {
        this.f26076c.get();
        long j11 = this.f26075b;
        int[] iArr = this.f26074a;
        Trace.beginSection("AnimatedFileNative#seekToMs");
        try {
            nSeekToMs(j11, j10, iArr, z10);
        } finally {
            Trace.endSection();
        }
    }

    public final void h() {
        this.f26076c.get();
        long j10 = this.f26075b;
        Trace.beginSection("AnimatedFileNative#stopDecoder");
        try {
            nStopDecoder(j10);
        } finally {
            Trace.endSection();
        }
    }
}
