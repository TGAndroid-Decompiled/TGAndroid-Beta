package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.PhotoViewer;
public final class g1 extends OldVideoPlayerRewinder {
    public final int f20137a;
    public final Object f20138b;

    public g1(Object obj, int i10) {
        this.f20137a = i10;
        this.f20138b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f20137a) {
            case 0:
                t1 t1Var = (t1) this.f20138b;
                t1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                t1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20138b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f31138z1.f(false);
                fg0.f23911p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f20137a) {
            case 0:
                t1 t1Var = (t1) this.f20138b;
                x61 x61Var = t1Var.Gd;
                x61Var.f29872n = new k2.c0(this, 9);
                x61Var.e(false);
                t1Var.Gd.d(!z10);
                t1Var.Gd.f(true);
                t1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20138b;
                photoViewer.f31138z1.e(false);
                photoViewer.f31138z1.d(!z10);
                photoViewer.f31138z1.f(true);
                photoViewer.f30950e0.invalidate();
                fg0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f20137a) {
            case 0:
                t1 t1Var = (t1) this.f20138b;
                t1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    t1Var.f21332y7.audioProgress = f7;
                    t1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20138b;
                photoViewer.f31138z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f31056q3.h(f7, false);
                    photoViewer.f31065r3.invalidate();
                }
                fg0 fg0Var = fg0.f23911p0;
                fg0Var.Q.g(0L);
                if (z10) {
                    fg0Var.Z = f7;
                    ai.n4 n4Var = fg0Var.f23915b0;
                    if (n4Var != null) {
                        n4Var.invalidate();
                    }
                    eg0 eg0Var = fg0Var.h;
                    if (eg0Var != null) {
                        eg0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
