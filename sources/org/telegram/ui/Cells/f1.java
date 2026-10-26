package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.PhotoViewer;
public final class f1 extends OldVideoPlayerRewinder {
    public final int f24056a;
    public final Object f24057b;

    public f1(Object obj, int i10) {
        this.f24056a = i10;
        this.f24057b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f24056a) {
            case 0:
                s1 s1Var = (s1) this.f24057b;
                s1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                s1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24057b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f35835z1.f(false);
                ch0.f27159p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f24056a) {
            case 0:
                s1 s1Var = (s1) this.f24057b;
                j81 j81Var = s1Var.Gd;
                j81Var.f29526n = new jg.s0(this, 15);
                j81Var.e(false);
                s1Var.Gd.d(!z10);
                s1Var.Gd.f(true);
                s1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24057b;
                photoViewer.f35835z1.e(false);
                photoViewer.f35835z1.d(!z10);
                photoViewer.f35835z1.f(true);
                photoViewer.f35646e0.invalidate();
                ch0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.f24056a) {
            case 0:
                s1 s1Var = (s1) this.f24057b;
                s1Var.Gd.g(Math.abs(j10));
                if (z10) {
                    s1Var.f25365y7.audioProgress = f7;
                    s1Var.s4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24057b;
                photoViewer.f35835z1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f35754q3.h(f7, false);
                    photoViewer.f35763r3.invalidate();
                }
                ch0 ch0Var = ch0.f27159p0;
                ch0Var.Q.g(0L);
                if (z10) {
                    ch0Var.Z = f7;
                    di.h3 h3Var = ch0Var.f27163b0;
                    if (h3Var != null) {
                        h3Var.invalidate();
                    }
                    bh0 bh0Var = ch0Var.h;
                    if (bh0Var != null) {
                        bh0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
