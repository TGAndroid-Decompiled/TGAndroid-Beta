package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class kt0 extends VideoPlayerRewinder {
    public final PhotoViewer f35235a;

    public kt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f35235a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f35235a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f31409z1.f(false);
        org.telegram.ui.Components.og0.f26912p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f35235a;
        photoViewer.f31409z1.e(false);
        photoViewer.f31409z1.d(!z10);
        photoViewer.f31409z1.f(true);
        photoViewer.f31221e0.invalidate();
        org.telegram.ui.Components.og0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f35235a;
        photoViewer.f31409z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f31327q3.h(f7, false);
            photoViewer.f31336r3.invalidate();
        }
        org.telegram.ui.Components.og0 og0Var = org.telegram.ui.Components.og0.f26912p0;
        og0Var.Q.g(0L);
        if (z10) {
            og0Var.Z = f7;
            ai.n4 n4Var = og0Var.f26916b0;
            if (n4Var != null) {
                n4Var.invalidate();
            }
            org.telegram.ui.Components.ng0 ng0Var = og0Var.h;
            if (ng0Var != null) {
                ng0Var.invalidate();
            }
        }
    }
}
