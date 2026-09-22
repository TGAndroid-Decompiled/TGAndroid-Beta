package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class kt0 extends VideoPlayerRewinder {
    public final PhotoViewer f35253a;

    public kt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f35253a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f35253a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f31430z1.f(false);
        org.telegram.ui.Components.rg0.f27960p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f35253a;
        photoViewer.f31430z1.e(false);
        photoViewer.f31430z1.d(!z10);
        photoViewer.f31430z1.f(true);
        photoViewer.f31242e0.invalidate();
        org.telegram.ui.Components.rg0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f35253a;
        photoViewer.f31430z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f31348q3.h(f7, false);
            photoViewer.f31357r3.invalidate();
        }
        org.telegram.ui.Components.rg0 rg0Var = org.telegram.ui.Components.rg0.f27960p0;
        rg0Var.Q.g(0L);
        if (z10) {
            rg0Var.Z = f7;
            ai.n4 n4Var = rg0Var.f27964b0;
            if (n4Var != null) {
                n4Var.invalidate();
            }
            org.telegram.ui.Components.qg0 qg0Var = rg0Var.h;
            if (qg0Var != null) {
                qg0Var.invalidate();
            }
        }
    }
}
