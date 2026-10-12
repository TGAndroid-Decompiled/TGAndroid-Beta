package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f21955a;
    public final Object f21956b;

    public h1(Object obj, int i10) {
        this.f21955a = i10;
        this.f21956b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f21955a) {
            case 0:
                u1 u1Var = (u1) this.f21956b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21956b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f33929z1.f(false);
                jh0.f27503p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f21955a) {
            case 0:
                u1 u1Var = (u1) this.f21956b;
                h81 h81Var = u1Var.Gd;
                h81Var.f26696n = new m.y0(this, 5);
                h81Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21956b;
                photoViewer.f33929z1.e(false);
                photoViewer.f33929z1.d(!z10);
                photoViewer.f33929z1.f(true);
                photoViewer.f33741e0.invalidate();
                jh0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f21955a) {
            case 0:
                u1 u1Var = (u1) this.f21956b;
                u1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    u1Var.f23230y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21956b;
                photoViewer.f33929z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f33847q3.h(f7, false);
                    photoViewer.f33856r3.invalidate();
                }
                jh0 jh0Var = jh0.f27503p0;
                jh0Var.Q.g(0L);
                if (z10) {
                    jh0Var.Z = f7;
                    ai.o4 o4Var = jh0Var.f27507b0;
                    if (o4Var != null) {
                        o4Var.invalidate();
                    }
                    ih0 ih0Var = jh0Var.h;
                    if (ih0Var != null) {
                        ih0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
