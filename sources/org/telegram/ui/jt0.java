package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class jt0 extends VideoPlayerRewinder {
    public final PhotoViewer f39121a;

    public jt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f39121a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f39121a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f34120z1.f(false);
        org.telegram.ui.Components.ih0.f27325p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f39121a;
        photoViewer.f34120z1.e(false);
        photoViewer.f34120z1.d(!z10);
        photoViewer.f34120z1.f(true);
        photoViewer.f33932e0.invalidate();
        org.telegram.ui.Components.ih0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f39121a;
        photoViewer.f34120z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f34038q3.h(f7, false);
            photoViewer.f34047r3.invalidate();
        }
        org.telegram.ui.Components.ih0 ih0Var = org.telegram.ui.Components.ih0.f27325p0;
        ih0Var.Q.g(0L);
        if (z10) {
            ih0Var.Z = f7;
            ai.o4 o4Var = ih0Var.f27329b0;
            if (o4Var != null) {
                o4Var.invalidate();
            }
            org.telegram.ui.Components.hh0 hh0Var = ih0Var.h;
            if (hh0Var != null) {
                hh0Var.invalidate();
            }
        }
    }
}
