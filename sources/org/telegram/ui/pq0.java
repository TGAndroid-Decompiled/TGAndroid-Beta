package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class pq0 extends VideoPlayerRewinder {
    public final PhotoViewer f40524a;

    public pq0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f40524a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f40524a;
        PhotoViewer.d(photoViewer, obtain);
        photoViewer.f33666z1.f(false);
        org.telegram.ui.Components.jf0.f27400p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f40524a;
        photoViewer.f33666z1.e(false);
        photoViewer.f33666z1.d(!z10);
        photoViewer.f33666z1.f(true);
        photoViewer.f33477e0.invalidate();
        org.telegram.ui.Components.jf0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f40524a;
        photoViewer.f33666z1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f33584q3.h(false, f7);
            photoViewer.f33593r3.invalidate();
        }
        org.telegram.ui.Components.jf0 jf0Var = org.telegram.ui.Components.jf0.f27400p0;
        jf0Var.Q.g(0L);
        if (z10) {
            jf0Var.Z = f7;
            ih.c cVar = jf0Var.f27404b0;
            if (cVar != null) {
                cVar.invalidate();
            }
            org.telegram.ui.Components.if0 if0Var = jf0Var.h;
            if (if0Var != null) {
                if0Var.invalidate();
            }
        }
    }
}
