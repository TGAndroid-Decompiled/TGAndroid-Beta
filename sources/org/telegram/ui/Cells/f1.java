package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.PhotoViewer;

public final class f1 extends OldVideoPlayerRewinder {

    public final int f24325a;

    public final Object f24326b;

    public f1(Object obj, int i10) {
        this.f24325a = i10;
        this.f24326b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f24325a) {
            case 0:
                s1 s1Var = (s1) this.f24326b;
                s1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                s1Var.Cd.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24326b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f35774v1.f(false);
                sf0.f32415l0.M.f(false);
                break;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f24325a) {
            case 0:
                s1 s1Var = (s1) this.f24326b;
                c61 c61Var = s1Var.Cd;
                c61Var.f27341n = new o0.b(this, 3);
                c61Var.e(false);
                s1Var.Cd.d(!z10);
                s1Var.Cd.f(true);
                s1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24326b;
                photoViewer.f35774v1.e(false);
                photoViewer.f35774v1.d(!z10);
                photoViewer.f35774v1.f(true);
                photoViewer.f35583a0.invalidate();
                sf0.v(z10);
                break;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        switch (this.f24325a) {
            case 0:
                s1 s1Var = (s1) this.f24326b;
                s1Var.Cd.g(Math.abs(j10));
                if (z10) {
                    s1Var.f25546u7.audioProgress = f10;
                    s1Var.p4();
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24326b;
                photoViewer.f35774v1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f35694m3.h(f10, false);
                    photoViewer.f35704n3.invalidate();
                }
                sf0 sf0Var = sf0.f32415l0;
                sf0Var.M.g(0L);
                if (z10) {
                    sf0Var.V = f10;
                    jh.a3 a3Var = sf0Var.X;
                    if (a3Var != null) {
                        a3Var.invalidate();
                    }
                    rf0 rf0Var = sf0Var.h;
                    if (rf0Var != null) {
                        rf0Var.invalidate();
                    }
                }
                break;
        }
    }
}
