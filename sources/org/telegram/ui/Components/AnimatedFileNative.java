package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AnimatedFileDrawableStream;
public class AnimatedFileNative {
    public final int[] a;
    public long b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public AnimatedFileNative(long j, int[] iArr) {
        this.b = j;
        this.a = iArr;
    }

    public static AnimatedFileNative a(String str, int[] iArr, int i, long j, AnimatedFileDrawableStream animatedFileDrawableStream, boolean z) {
        Trace.beginSection("AnimatedFileNative#createDecoder");
        try {
            long nCreateDecoder = nCreateDecoder(str, iArr, i, j, animatedFileDrawableStream, z);
            Trace.endSection();
            if (nCreateDecoder == 0) {
                return null;
            }
            return new AnimatedFileNative(nCreateDecoder, iArr);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static void d(String str, int[] iArr, long j) {
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

    public final int b(long j, Bitmap bitmap) {
        this.c.get();
        long j2 = this.b;
        int[] iArr = this.a;
        Trace.beginSection("AnimatedFileNative#getFrameAtTime");
        try {
            return nGetFrameAtTime(j2, j, bitmap, iArr);
        } finally {
            Trace.endSection();
        }
    }

    public final int c(Bitmap bitmap, boolean z, float f, float f2, boolean z2) {
        this.c.get();
        long j = this.b;
        int[] iArr = this.a;
        Trace.beginSection("AnimatedFileNative#getVideoFrame");
        try {
            return nGetVideoFrame(j, bitmap, iArr, z, f, f2, z2);
        } finally {
            Trace.endSection();
        }
    }

    public final void e() {
        this.c.get();
        long j = this.b;
        Trace.beginSection("AnimatedFileNative#prepareToSeek");
        try {
            nPrepareToSeek(j);
        } finally {
            Trace.endSection();
        }
    }

    public final void f() {
        if (this.c.compareAndSet(false, true)) {
            long j = this.b;
            this.b = 0L;
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

    public final void finalize() {
        try {
            if (!this.c.get()) {
                f();
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(long j, boolean z) {
        this.c.get();
        long j2 = this.b;
        int[] iArr = this.a;
        Trace.beginSection("AnimatedFileNative#seekToMs");
        try {
            nSeekToMs(j2, j, iArr, z);
        } finally {
            Trace.endSection();
        }
    }

    public final void h() {
        this.c.get();
        long j = this.b;
        Trace.beginSection("AnimatedFileNative#stopDecoder");
        try {
            nStopDecoder(j);
        } finally {
            Trace.endSection();
        }
    }
}
