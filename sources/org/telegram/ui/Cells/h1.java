package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f20366a;
    public final Object f20367b;

    public h1(Object obj, int i10) {
        this.f20366a = i10;
        this.f20367b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f20366a) {
            case 0:
                u1 u1Var = (u1) this.f20367b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20367b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f31409z1.f(false);
                og0.f26912p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f20366a) {
            case 0:
                u1 u1Var = (u1) this.f20367b;
                k71 k71Var = u1Var.Gd;
                k71Var.f25698n = new n2.e(this, 3);
                k71Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20367b;
                photoViewer.f31409z1.e(false);
                photoViewer.f31409z1.d(!z10);
                photoViewer.f31409z1.f(true);
                photoViewer.f31221e0.invalidate();
                og0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f20366a) {
            case 0:
                u1 u1Var = (u1) this.f20367b;
                u1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    u1Var.f21575y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20367b;
                photoViewer.f31409z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f31327q3.h(f7, false);
                    photoViewer.f31336r3.invalidate();
                }
                og0 og0Var = og0.f26912p0;
                og0Var.Q.g(0L);
                if (z10) {
                    og0Var.Z = f7;
                    ai.n4 n4Var = og0Var.f26916b0;
                    if (n4Var != null) {
                        n4Var.invalidate();
                    }
                    ng0 ng0Var = og0Var.h;
                    if (ng0Var != null) {
                        ng0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
