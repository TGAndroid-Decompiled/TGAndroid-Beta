package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.PhotoViewer;
public final class j1 extends OldVideoPlayerRewinder {
    public final int f29416a;
    public final Object f29417b;

    public j1(Object obj, int i3) {
        this.f29416a = i3;
        this.f29417b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f29416a) {
            case 0:
                q1 q1Var = (q1) this.f29417b;
                q1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                q1Var.Nb.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f29417b;
                PhotoViewer.d(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.A1.f(false);
                ie0.f34683q0.R.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f29416a) {
            case 0:
                q1 q1Var = (q1) this.f29417b;
                d51 d51Var = q1Var.Nb;
                d51Var.f32948n = new hi.d(this, 27);
                d51Var.e(false);
                q1Var.Nb.d(!z10);
                q1Var.Nb.f(true);
                q1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f29417b;
                photoViewer.A1.e(false);
                photoViewer.A1.d(!z10);
                photoViewer.A1.f(true);
                photoViewer.f41420f0.invalidate();
                ie0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        switch (this.f29416a) {
            case 0:
                q1 q1Var = (q1) this.f29417b;
                q1Var.Nb.g(Math.abs(j10));
                if (z10) {
                    q1Var.P5.f26828b0 = f10;
                    q1Var.Q3();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f29417b;
                photoViewer.A1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f41526r3.h(false, f10);
                    photoViewer.f41535s3.invalidate();
                }
                ie0 ie0Var = ie0.f34683q0;
                ie0Var.R.g(0L);
                if (z10) {
                    ie0Var.f34685a0 = f10;
                    ei.e3 e3Var = ie0Var.f34689c0;
                    if (e3Var != null) {
                        e3Var.invalidate();
                    }
                    ge0 ge0Var = ie0Var.h;
                    if (ge0Var != null) {
                        ge0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
