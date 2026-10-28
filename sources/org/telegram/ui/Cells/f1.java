package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.k81;
import org.telegram.ui.PhotoViewer;
public final class f1 extends OldVideoPlayerRewinder {
    public final int f24058a;
    public final Object f24059b;

    public f1(Object obj, int i10) {
        this.f24058a = i10;
        this.f24059b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f24058a) {
            case 0:
                s1 s1Var = (s1) this.f24059b;
                s1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                s1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24059b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f35859z1.f(false);
                dh0.f27444p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f24058a) {
            case 0:
                s1 s1Var = (s1) this.f24059b;
                k81 k81Var = s1Var.Gd;
                k81Var.f29897n = new jg.s0(this, 15);
                k81Var.e(false);
                s1Var.Gd.d(!z10);
                s1Var.Gd.f(true);
                s1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24059b;
                photoViewer.f35859z1.e(false);
                photoViewer.f35859z1.d(!z10);
                photoViewer.f35859z1.f(true);
                photoViewer.f35670e0.invalidate();
                dh0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.f24058a) {
            case 0:
                s1 s1Var = (s1) this.f24059b;
                s1Var.Gd.g(Math.abs(j10));
                if (z10) {
                    s1Var.f25367y7.audioProgress = f7;
                    s1Var.s4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24059b;
                photoViewer.f35859z1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f35778q3.h(f7, false);
                    photoViewer.f35787r3.invalidate();
                }
                dh0 dh0Var = dh0.f27444p0;
                dh0Var.Q.g(0L);
                if (z10) {
                    dh0Var.Z = f7;
                    di.h3 h3Var = dh0Var.f27448b0;
                    if (h3Var != null) {
                        h3Var.invalidate();
                    }
                    ch0 ch0Var = dh0Var.h;
                    if (ch0Var != null) {
                        ch0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
