package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f20385a;
    public final Object f20386b;

    public h1(Object obj, int i10) {
        this.f20385a = i10;
        this.f20386b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f20385a) {
            case 0:
                u1 u1Var = (u1) this.f20386b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20386b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f31410z1.f(false);
                pg0.f27353p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f20385a) {
            case 0:
                u1 u1Var = (u1) this.f20386b;
                l71 l71Var = u1Var.Gd;
                l71Var.f26000n = new n2.e(this, 3);
                l71Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20386b;
                photoViewer.f31410z1.e(false);
                photoViewer.f31410z1.d(!z10);
                photoViewer.f31410z1.f(true);
                photoViewer.f31222e0.invalidate();
                pg0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f20385a) {
            case 0:
                u1 u1Var = (u1) this.f20386b;
                u1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    u1Var.f21607y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20386b;
                photoViewer.f31410z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f31328q3.h(f7, false);
                    photoViewer.f31337r3.invalidate();
                }
                pg0 pg0Var = pg0.f27353p0;
                pg0Var.Q.g(0L);
                if (z10) {
                    pg0Var.Z = f7;
                    ai.n4 n4Var = pg0Var.f27357b0;
                    if (n4Var != null) {
                        n4Var.invalidate();
                    }
                    og0 og0Var = pg0Var.h;
                    if (og0Var != null) {
                        og0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
