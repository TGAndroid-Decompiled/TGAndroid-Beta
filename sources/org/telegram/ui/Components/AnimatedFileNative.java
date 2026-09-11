package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AnimatedFileDrawableStream;
public class AnimatedFileNative {
    public final int[] f23650a;
    public long f23651b;
    public final AtomicBoolean f23652c = new AtomicBoolean(false);

    public AnimatedFileNative(long j3, int[] iArr) {
        this.f23651b = j3;
        this.f23650a = iArr;
    }

    public static AnimatedFileNative a(String str, int[] iArr, int i10, long j3, AnimatedFileDrawableStream animatedFileDrawableStream, boolean z10) {
        Trace.beginSection("AnimatedFileNative#createDecoder");
        try {
            long nCreateDecoder = nCreateDecoder(str, iArr, i10, j3, animatedFileDrawableStream, z10);
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

    public static void d(String str, int[] iArr, long j3) {
        Trace.beginSection("AnimatedFileNative#getVideoInfo");
        try {
            nGetVideoInfo(str, iArr, j3);
        } finally {
            Trace.endSection();
        }
    }

    private static native long nCreateDecoder(String str, int[] iArr, int i10, long j3, Object obj, boolean z10);

    private static native void nDestroyDecoder(long j3);

    private static native int nGetFrameAtTime(long j3, long j10, Bitmap bitmap, int[] iArr);

    private static native int nGetVideoFrame(long j3, Bitmap bitmap, int[] iArr, boolean z10, float f7, float f10, boolean z11);

    private static native void nGetVideoInfo(String str, int[] iArr, long j3);

    private static native void nPrepareToSeek(long j3);

    private static native void nSeekToMs(long j3, long j10, int[] iArr, boolean z10);

    private static native void nStopDecoder(long j3);

    public final int b(Bitmap bitmap, long j3) {
        this.f23652c.get();
        long j10 = this.f23651b;
        int[] iArr = this.f23650a;
        Trace.beginSection("AnimatedFileNative#getFrameAtTime");
        try {
            return nGetFrameAtTime(j10, j3, bitmap, iArr);
        } finally {
            Trace.endSection();
        }
    }

    public final int c(Bitmap bitmap, boolean z10, float f7, float f10, boolean z11) {
        this.f23652c.get();
        long j3 = this.f23651b;
        int[] iArr = this.f23650a;
        Trace.beginSection("AnimatedFileNative#getVideoFrame");
        try {
            return nGetVideoFrame(j3, bitmap, iArr, z10, f7, f10, z11);
        } finally {
            Trace.endSection();
        }
    }

    public final void e() {
        this.f23652c.get();
        long j3 = this.f23651b;
        Trace.beginSection("AnimatedFileNative#prepareToSeek");
        try {
            nPrepareToSeek(j3);
        } finally {
            Trace.endSection();
        }
    }

    public final void f() {
        if (this.f23652c.compareAndSet(false, true)) {
            long j3 = this.f23651b;
            this.f23651b = 0L;
            if (j3 != 0) {
                Trace.beginSection("AnimatedFileNative#destroyDecoder");
                try {
                    nDestroyDecoder(j3);
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public final void finalize() {
        try {
            if (!this.f23652c.get()) {
                f();
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(long j3, boolean z10) {
        this.f23652c.get();
        long j10 = this.f23651b;
        int[] iArr = this.f23650a;
        Trace.beginSection("AnimatedFileNative#seekToMs");
        try {
            nSeekToMs(j10, j3, iArr, z10);
        } finally {
            Trace.endSection();
        }
    }

    public final void h() {
        this.f23652c.get();
        long j3 = this.f23651b;
        Trace.beginSection("AnimatedFileNative#stopDecoder");
        try {
            nStopDecoder(j3);
        } finally {
            Trace.endSection();
        }
    }
}
