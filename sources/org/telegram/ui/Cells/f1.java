package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.PhotoViewer;
public final class f1 extends OldVideoPlayerRewinder {
    public final int f21013a;
    public final Object f21014b;

    public f1(Object obj, int i10) {
        this.f21013a = i10;
        this.f21014b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f21013a) {
            case 0:
                s1 s1Var = (s1) this.f21014b;
                s1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                s1Var.Dd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21014b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f31869w1.f(false);
                mg0.m0.N.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z4) {
        switch (this.f21013a) {
            case 0:
                s1 s1Var = (s1) this.f21014b;
                y61 y61Var = s1Var.Dd;
                y61Var.f30925n = new ja.c(this, 26);
                y61Var.e(false);
                s1Var.Dd.d(!z4);
                s1Var.Dd.f(true);
                s1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21014b;
                photoViewer.f31869w1.e(false);
                photoViewer.f31869w1.d(!z4);
                photoViewer.f31869w1.f(true);
                photoViewer.f31679b0.invalidate();
                mg0.v(z4);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z4) {
        switch (this.f21013a) {
            case 0:
                s1 s1Var = (s1) this.f21014b;
                s1Var.Dd.g(Math.abs(j10));
                if (z4) {
                    s1Var.f22210v7.audioProgress = f10;
                    s1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21014b;
                photoViewer.f31869w1.g(Math.abs(j10));
                if (z4) {
                    photoViewer.f31789n3.h(f10, false);
                    photoViewer.f31798o3.invalidate();
                }
                mg0 mg0Var = mg0.m0;
                mg0Var.N.g(0L);
                if (z4) {
                    mg0Var.W = f10;
                    nh.a3 a3Var = mg0Var.Y;
                    if (a3Var != null) {
                        a3Var.invalidate();
                    }
                    lg0 lg0Var = mg0Var.h;
                    if (lg0Var != null) {
                        lg0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
