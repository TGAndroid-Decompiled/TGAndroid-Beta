package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class kt0 extends VideoPlayerRewinder {
    public final PhotoViewer f39393a;

    public kt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f39393a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f39393a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f34130z1.f(false);
        org.telegram.ui.Components.hh0.f27011p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f39393a;
        photoViewer.f34130z1.e(false);
        photoViewer.f34130z1.d(!z10);
        photoViewer.f34130z1.f(true);
        photoViewer.f33942e0.invalidate();
        org.telegram.ui.Components.hh0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f39393a;
        photoViewer.f34130z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f34048q3.h(f7, false);
            photoViewer.f34057r3.invalidate();
        }
        org.telegram.ui.Components.hh0 hh0Var = org.telegram.ui.Components.hh0.f27011p0;
        hh0Var.Q.g(0L);
        if (z10) {
            hh0Var.Z = f7;
            ai.o4 o4Var = hh0Var.f27015b0;
            if (o4Var != null) {
                o4Var.invalidate();
            }
            org.telegram.ui.Components.gh0 gh0Var = hh0Var.h;
            if (gh0Var != null) {
                gh0Var.invalidate();
            }
        }
    }
}
