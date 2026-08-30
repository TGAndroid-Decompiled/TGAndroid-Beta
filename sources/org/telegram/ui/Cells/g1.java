package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.PhotoViewer;
public final class g1 extends OldVideoPlayerRewinder {
    public final int f21082a;
    public final Object f21083b;

    public g1(Object obj, int i10) {
        this.f21082a = i10;
        this.f21083b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f21082a) {
            case 0:
                t1 t1Var = (t1) this.f21083b;
                t1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                t1Var.Dd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21083b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f31895w1.f(false);
                lg0.m0.N.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z4) {
        switch (this.f21082a) {
            case 0:
                t1 t1Var = (t1) this.f21083b;
                y61 y61Var = t1Var.Dd;
                y61Var.f30903n = new f1(this, 0);
                y61Var.e(false);
                t1Var.Dd.d(!z4);
                t1Var.Dd.f(true);
                t1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21083b;
                photoViewer.f31895w1.e(false);
                photoViewer.f31895w1.d(!z4);
                photoViewer.f31895w1.f(true);
                photoViewer.f31705b0.invalidate();
                lg0.v(z4);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z4) {
        switch (this.f21082a) {
            case 0:
                t1 t1Var = (t1) this.f21083b;
                t1Var.Dd.g(Math.abs(j10));
                if (z4) {
                    t1Var.f22273v7.audioProgress = f10;
                    t1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21083b;
                photoViewer.f31895w1.g(Math.abs(j10));
                if (z4) {
                    photoViewer.f31815n3.h(f10, false);
                    photoViewer.f31824o3.invalidate();
                }
                lg0 lg0Var = lg0.m0;
                lg0Var.N.g(0L);
                if (z4) {
                    lg0Var.W = f10;
                    nh.a3 a3Var = lg0Var.Y;
                    if (a3Var != null) {
                        a3Var.invalidate();
                    }
                    kg0 kg0Var = lg0Var.h;
                    if (kg0Var != null) {
                        kg0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
