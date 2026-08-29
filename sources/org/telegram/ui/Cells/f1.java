package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.PhotoViewer;
public final class f1 extends OldVideoPlayerRewinder {
    public final int f24304a;
    public final Object f24305b;

    public f1(Object obj, int i10) {
        this.f24304a = i10;
        this.f24305b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f24304a) {
            case 0:
                s1 s1Var = (s1) this.f24305b;
                s1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                s1Var.Cd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24305b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f35837v1.f(false);
                bg0.f27076l0.M.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f24304a) {
            case 0:
                s1 s1Var = (s1) this.f24305b;
                n61 n61Var = s1Var.Cd;
                n61Var.f30914n = new o1.a(this, 4);
                n61Var.e(false);
                s1Var.Cd.d(!z10);
                s1Var.Cd.f(true);
                s1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24305b;
                photoViewer.f35837v1.e(false);
                photoViewer.f35837v1.d(!z10);
                photoViewer.f35837v1.f(true);
                photoViewer.f35647a0.invalidate();
                bg0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f9, boolean z10) {
        switch (this.f24304a) {
            case 0:
                s1 s1Var = (s1) this.f24305b;
                s1Var.Cd.g(Math.abs(j10));
                if (z10) {
                    s1Var.f25556u7.audioProgress = f9;
                    s1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f24305b;
                photoViewer.f35837v1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f35757m3.h(f9, false);
                    photoViewer.f35767n3.invalidate();
                }
                bg0 bg0Var = bg0.f27076l0;
                bg0Var.M.g(0L);
                if (z10) {
                    bg0Var.V = f9;
                    lh.z2 z2Var = bg0Var.X;
                    if (z2Var != null) {
                        z2Var.invalidate();
                    }
                    ag0 ag0Var = bg0Var.h;
                    if (ag0Var != null) {
                        ag0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
