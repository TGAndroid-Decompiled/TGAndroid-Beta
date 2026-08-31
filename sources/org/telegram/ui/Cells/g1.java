package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.PhotoViewer;
public final class g1 extends OldVideoPlayerRewinder {
    public final int f22829a;
    public final Object f22830b;

    public g1(Object obj, int i10) {
        this.f22829a = i10;
        this.f22830b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f22829a) {
            case 0:
                t1 t1Var = (t1) this.f22830b;
                t1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                t1Var.Dd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22830b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f34421w1.f(false);
                ng0.m0.N.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z4) {
        switch (this.f22829a) {
            case 0:
                t1 t1Var = (t1) this.f22830b;
                a71 a71Var = t1Var.Dd;
                a71Var.f25188n = new f1(this, 0);
                a71Var.e(false);
                t1Var.Dd.d(!z4);
                t1Var.Dd.f(true);
                t1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22830b;
                photoViewer.f34421w1.e(false);
                photoViewer.f34421w1.d(!z4);
                photoViewer.f34421w1.f(true);
                photoViewer.f34230b0.invalidate();
                ng0.v(z4);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z4) {
        switch (this.f22829a) {
            case 0:
                t1 t1Var = (t1) this.f22830b;
                t1Var.Dd.g(Math.abs(j10));
                if (z4) {
                    t1Var.f24073v7.audioProgress = f10;
                    t1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22830b;
                photoViewer.f34421w1.g(Math.abs(j10));
                if (z4) {
                    photoViewer.f34341n3.h(f10, false);
                    photoViewer.f34350o3.invalidate();
                }
                ng0 ng0Var = ng0.m0;
                ng0Var.N.g(0L);
                if (z4) {
                    ng0Var.W = f10;
                    oh.b3 b3Var = ng0Var.Y;
                    if (b3Var != null) {
                        b3Var.invalidate();
                    }
                    mg0 mg0Var = ng0Var.h;
                    if (mg0Var != null) {
                        mg0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
