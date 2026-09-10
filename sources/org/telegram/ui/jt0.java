package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class jt0 extends VideoPlayerRewinder {
    public final PhotoViewer f34161a;

    public jt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f34161a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f34161a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f30237z1.f(false);
        org.telegram.ui.Components.og0.f25781p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f34161a;
        photoViewer.f30237z1.e(false);
        photoViewer.f30237z1.d(!z10);
        photoViewer.f30237z1.f(true);
        photoViewer.f30049e0.invalidate();
        org.telegram.ui.Components.og0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f34161a;
        photoViewer.f30237z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f30155q3.h(f7, false);
            photoViewer.f30164r3.invalidate();
        }
        org.telegram.ui.Components.og0 og0Var = org.telegram.ui.Components.og0.f25781p0;
        og0Var.Q.g(0L);
        if (z10) {
            og0Var.Z = f7;
            u7 u7Var = og0Var.f25785b0;
            if (u7Var != null) {
                u7Var.invalidate();
            }
            org.telegram.ui.Components.ng0 ng0Var = og0Var.h;
            if (ng0Var != null) {
                ng0Var.invalidate();
            }
        }
    }
}
