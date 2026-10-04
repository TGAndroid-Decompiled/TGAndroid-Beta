package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.v71;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f22197a;
    public final Object f22198b;

    public h1(Object obj, int i10) {
        this.f22197a = i10;
        this.f22198b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f22197a) {
            case 0:
                u1 u1Var = (u1) this.f22198b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22198b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f34089z1.f(false);
                rg0.f30384p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f22197a) {
            case 0:
                u1 u1Var = (u1) this.f22198b;
                v71 v71Var = u1Var.Gd;
                v71Var.f31600n = new n2.c(this, 3);
                v71Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22198b;
                photoViewer.f34089z1.e(false);
                photoViewer.f34089z1.d(!z10);
                photoViewer.f34089z1.f(true);
                photoViewer.f33901e0.invalidate();
                rg0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f22197a) {
            case 0:
                u1 u1Var = (u1) this.f22198b;
                u1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    u1Var.f23474y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22198b;
                photoViewer.f34089z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f34007q3.h(f7, false);
                    photoViewer.f34016r3.invalidate();
                }
                rg0 rg0Var = rg0.f30384p0;
                rg0Var.Q.g(0L);
                if (z10) {
                    rg0Var.Z = f7;
                    ai.n4 n4Var = rg0Var.f30388b0;
                    if (n4Var != null) {
                        n4Var.invalidate();
                    }
                    qg0 qg0Var = rg0Var.h;
                    if (qg0Var != null) {
                        qg0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
