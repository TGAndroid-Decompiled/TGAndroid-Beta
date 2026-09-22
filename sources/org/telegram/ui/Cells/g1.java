package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.PhotoViewer;
public final class g1 extends OldVideoPlayerRewinder {
    public final int f20108a;
    public final Object f20109b;

    public g1(Object obj, int i10) {
        this.f20108a = i10;
        this.f20109b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f20108a) {
            case 0:
                t1 t1Var = (t1) this.f20109b;
                t1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                t1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20109b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f31122z1.f(false);
                eg0.f23635p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f20108a) {
            case 0:
                t1 t1Var = (t1) this.f20109b;
                w61 w61Var = t1Var.Gd;
                w61Var.f29631n = new k2.c0(this, 9);
                w61Var.e(false);
                t1Var.Gd.d(!z10);
                t1Var.Gd.f(true);
                t1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20109b;
                photoViewer.f31122z1.e(false);
                photoViewer.f31122z1.d(!z10);
                photoViewer.f31122z1.f(true);
                photoViewer.f30934e0.invalidate();
                eg0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f20108a) {
            case 0:
                t1 t1Var = (t1) this.f20109b;
                t1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    t1Var.f21305y7.audioProgress = f7;
                    t1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20109b;
                photoViewer.f31122z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f31040q3.h(f7, false);
                    photoViewer.f31049r3.invalidate();
                }
                eg0 eg0Var = eg0.f23635p0;
                eg0Var.Q.g(0L);
                if (z10) {
                    eg0Var.Z = f7;
                    ai.n4 n4Var = eg0Var.f23639b0;
                    if (n4Var != null) {
                        n4Var.invalidate();
                    }
                    dg0 dg0Var = eg0Var.h;
                    if (dg0Var != null) {
                        dg0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
