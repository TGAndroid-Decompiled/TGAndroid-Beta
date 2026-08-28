package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.PhotoViewer;
public final class g1 extends OldVideoPlayerRewinder {
    public final int f24368a;
    public final Object f24369b;

    public g1(Object obj, int i9) {
        this.f24368a = i9;
        this.f24369b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f24368a) {
            case 0:
                t1 t1Var = (t1) this.f24369b;
                t1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                t1Var.Cd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24369b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f35771v1.f(false);
                pf0.f31622l0.M.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f24368a) {
            case 0:
                t1 t1Var = (t1) this.f24369b;
                a61 a61Var = t1Var.Cd;
                a61Var.f26706n = new m5.c0(this, 10);
                a61Var.e(false);
                t1Var.Cd.d(!z10);
                t1Var.Cd.f(true);
                t1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24369b;
                photoViewer.f35771v1.e(false);
                photoViewer.f35771v1.d(!z10);
                photoViewer.f35771v1.f(true);
                photoViewer.f35580a0.invalidate();
                pf0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        switch (this.f24368a) {
            case 0:
                t1 t1Var = (t1) this.f24369b;
                t1Var.Cd.g(Math.abs(j10));
                if (z10) {
                    t1Var.f25593u7.audioProgress = f10;
                    t1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24369b;
                photoViewer.f35771v1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f35691m3.h(f10, false);
                    photoViewer.f35701n3.invalidate();
                }
                pf0 pf0Var = pf0.f31622l0;
                pf0Var.M.g(0L);
                if (z10) {
                    pf0Var.V = f10;
                    ih.b3 b3Var = pf0Var.X;
                    if (b3Var != null) {
                        b3Var.invalidate();
                    }
                    of0 of0Var = pf0Var.h;
                    if (of0Var != null) {
                        of0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
