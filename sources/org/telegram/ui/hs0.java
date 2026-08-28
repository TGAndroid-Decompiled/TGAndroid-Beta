package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class hs0 extends VideoPlayerRewinder {
    public final PhotoViewer f38906a;

    public hs0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f38906a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f38906a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f35771v1.f(false);
        org.telegram.ui.Components.pf0.f31622l0.M.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f38906a;
        photoViewer.f35771v1.e(false);
        photoViewer.f35771v1.d(!z10);
        photoViewer.f35771v1.f(true);
        photoViewer.f35580a0.invalidate();
        org.telegram.ui.Components.pf0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        PhotoViewer photoViewer = this.f38906a;
        photoViewer.f35771v1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f35691m3.h(f10, false);
            photoViewer.f35701n3.invalidate();
        }
        org.telegram.ui.Components.pf0 pf0Var = org.telegram.ui.Components.pf0.f31622l0;
        pf0Var.M.g(0L);
        if (z10) {
            pf0Var.V = f10;
            ih.b3 b3Var = pf0Var.X;
            if (b3Var != null) {
                b3Var.invalidate();
            }
            org.telegram.ui.Components.of0 of0Var = pf0Var.h;
            if (of0Var != null) {
                of0Var.invalidate();
            }
        }
    }
}
