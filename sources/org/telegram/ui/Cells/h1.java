package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f20402a;
    public final Object f20403b;

    public h1(Object obj, int i10) {
        this.f20402a = i10;
        this.f20403b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f20402a) {
            case 0:
                u1 u1Var = (u1) this.f20403b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20403b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f31485z1.f(false);
                rg0.f27987p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f20402a) {
            case 0:
                u1 u1Var = (u1) this.f20403b;
                n71 n71Var = u1Var.Gd;
                n71Var.f26615n = new n2.e(this, 3);
                n71Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20403b;
                photoViewer.f31485z1.e(false);
                photoViewer.f31485z1.d(!z10);
                photoViewer.f31485z1.f(true);
                photoViewer.f31297e0.invalidate();
                rg0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f20402a) {
            case 0:
                u1 u1Var = (u1) this.f20403b;
                u1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    u1Var.f21629y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20403b;
                photoViewer.f31485z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f31403q3.h(f7, false);
                    photoViewer.f31412r3.invalidate();
                }
                rg0 rg0Var = rg0.f27987p0;
                rg0Var.Q.g(0L);
                if (z10) {
                    rg0Var.Z = f7;
                    ai.n4 n4Var = rg0Var.f27991b0;
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
