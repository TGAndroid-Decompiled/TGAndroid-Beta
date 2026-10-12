package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class mt0 extends VideoPlayerRewinder {
    public final PhotoViewer f40134a;

    public mt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f40134a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f40134a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f33931z1.f(false);
        org.telegram.ui.Components.jh0.f27497p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f40134a;
        photoViewer.f33931z1.e(false);
        photoViewer.f33931z1.d(!z10);
        photoViewer.f33931z1.f(true);
        photoViewer.f33743e0.invalidate();
        org.telegram.ui.Components.jh0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f40134a;
        photoViewer.f33931z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f33849q3.h(f7, false);
            photoViewer.f33858r3.invalidate();
        }
        org.telegram.ui.Components.jh0 jh0Var = org.telegram.ui.Components.jh0.f27497p0;
        jh0Var.Q.g(0L);
        if (z10) {
            jh0Var.Z = f7;
            ai.o4 o4Var = jh0Var.f27501b0;
            if (o4Var != null) {
                o4Var.invalidate();
            }
            org.telegram.ui.Components.ih0 ih0Var = jh0Var.h;
            if (ih0Var != null) {
                ih0Var.invalidate();
            }
        }
    }
}
