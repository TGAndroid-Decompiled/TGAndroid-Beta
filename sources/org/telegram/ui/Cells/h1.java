package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f20386a;
    public final Object f20387b;

    public h1(Object obj, int i10) {
        this.f20386a = i10;
        this.f20387b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f20386a) {
            case 0:
                u1 u1Var = (u1) this.f20387b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20387b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f31412z1.f(false);
                og0.f27047p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f20386a) {
            case 0:
                u1 u1Var = (u1) this.f20387b;
                k71 k71Var = u1Var.Gd;
                k71Var.f25689n = new n2.e(this, 3);
                k71Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20387b;
                photoViewer.f31412z1.e(false);
                photoViewer.f31412z1.d(!z10);
                photoViewer.f31412z1.f(true);
                photoViewer.f31224e0.invalidate();
                og0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f20386a) {
            case 0:
                u1 u1Var = (u1) this.f20387b;
                u1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    u1Var.f21608y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20387b;
                photoViewer.f31412z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f31330q3.h(f7, false);
                    photoViewer.f31339r3.invalidate();
                }
                og0 og0Var = og0.f27047p0;
                og0Var.Q.g(0L);
                if (z10) {
                    og0Var.Z = f7;
                    ai.n4 n4Var = og0Var.f27051b0;
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
