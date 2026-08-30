package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class ps0 extends VideoPlayerRewinder {
    public final PhotoViewer f37508a;

    public ps0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f37508a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f37508a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f31895w1.f(false);
        org.telegram.ui.Components.lg0.m0.N.f(false);
    }

    @Override
    public final void onRewindStart(boolean z4) {
        PhotoViewer photoViewer = this.f37508a;
        photoViewer.f31895w1.e(false);
        photoViewer.f31895w1.d(!z4);
        photoViewer.f31895w1.f(true);
        photoViewer.f31705b0.invalidate();
        org.telegram.ui.Components.lg0.v(z4);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z4) {
        PhotoViewer photoViewer = this.f37508a;
        photoViewer.f31895w1.g(Math.abs(j10));
        if (z4) {
            photoViewer.f31815n3.h(f10, false);
            photoViewer.f31824o3.invalidate();
        }
        org.telegram.ui.Components.lg0 lg0Var = org.telegram.ui.Components.lg0.m0;
        lg0Var.N.g(0L);
        if (z4) {
            lg0Var.W = f10;
            nh.a3 a3Var = lg0Var.Y;
            if (a3Var != null) {
                a3Var.invalidate();
            }
            org.telegram.ui.Components.kg0 kg0Var = lg0Var.h;
            if (kg0Var != null) {
                kg0Var.invalidate();
            }
        }
    }
}
