package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.PhotoViewer;
public final class g1 extends OldVideoPlayerRewinder {
    public final int f22396a;
    public final Object f22397b;

    public g1(Object obj, int i10) {
        this.f22396a = i10;
        this.f22397b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f22396a) {
            case 0:
                t1 t1Var = (t1) this.f22397b;
                t1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                t1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22397b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f33769z1.f(false);
                dh0.f25631p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f22396a) {
            case 0:
                t1 t1Var = (t1) this.f22397b;
                b81 b81Var = t1Var.Gd;
                b81Var.f24992n = new ki.t1(this, 11);
                b81Var.e(false);
                t1Var.Gd.d(!z10);
                t1Var.Gd.f(true);
                t1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22397b;
                photoViewer.f33769z1.e(false);
                photoViewer.f33769z1.d(!z10);
                photoViewer.f33769z1.f(true);
                photoViewer.f33580e0.invalidate();
                dh0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.f22396a) {
            case 0:
                t1 t1Var = (t1) this.f22397b;
                t1Var.Gd.g(Math.abs(j10));
                if (z10) {
                    t1Var.f23659y7.audioProgress = f7;
                    t1Var.p4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22397b;
                photoViewer.f33769z1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f33687q3.h(f7, false);
                    photoViewer.f33696r3.invalidate();
                }
                dh0 dh0Var = dh0.f25631p0;
                dh0Var.Q.g(0L);
                if (z10) {
                    dh0Var.Z = f7;
                    ci.h3 h3Var = dh0Var.f25635b0;
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
