package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f22181a;
    public final Object f22182b;

    public h1(Object obj, int i10) {
        this.f22181a = i10;
        this.f22182b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f22181a) {
            case 0:
                u1 u1Var = (u1) this.f22182b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22182b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f34120z1.f(false);
                ih0.f27325p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f22181a) {
            case 0:
                u1 u1Var = (u1) this.f22182b;
                d81 d81Var = u1Var.Gd;
                d81Var.f25488n = new l2.f(this, 8);
                d81Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22182b;
                photoViewer.f34120z1.e(false);
                photoViewer.f34120z1.d(!z10);
                photoViewer.f34120z1.f(true);
                photoViewer.f33932e0.invalidate();
                ih0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f22181a) {
            case 0:
                u1 u1Var = (u1) this.f22182b;
                u1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    u1Var.f23450y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22182b;
                photoViewer.f34120z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f34038q3.h(f7, false);
                    photoViewer.f34047r3.invalidate();
                }
                ih0 ih0Var = ih0.f27325p0;
                ih0Var.Q.g(0L);
                if (z10) {
                    ih0Var.Z = f7;
                    ai.o4 o4Var = ih0Var.f27329b0;
                    if (o4Var != null) {
                        o4Var.invalidate();
                    }
                    hh0 hh0Var = ih0Var.h;
                    if (hh0Var != null) {
                        hh0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
