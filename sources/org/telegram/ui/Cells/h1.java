package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f22217a;
    public final Object f22218b;

    public h1(Object obj, int i10) {
        this.f22217a = i10;
        this.f22218b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f22217a) {
            case 0:
                u1 u1Var = (u1) this.f22218b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22218b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f34154z1.f(false);
                hh0.f27101p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f22217a) {
            case 0:
                u1 u1Var = (u1) this.f22218b;
                d81 d81Var = u1Var.Gd;
                d81Var.f25692n = new l2.f(this, 8);
                d81Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22218b;
                photoViewer.f34154z1.e(false);
                photoViewer.f34154z1.d(!z10);
                photoViewer.f34154z1.f(true);
                photoViewer.f33966e0.invalidate();
                hh0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f22217a) {
            case 0:
                u1 u1Var = (u1) this.f22218b;
                u1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    u1Var.f23486y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22218b;
                photoViewer.f34154z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f34072q3.h(f7, false);
                    photoViewer.f34081r3.invalidate();
                }
                hh0 hh0Var = hh0.f27101p0;
                hh0Var.Q.g(0L);
                if (z10) {
                    hh0Var.Z = f7;
                    ai.o4 o4Var = hh0Var.f27105b0;
                    if (o4Var != null) {
                        o4Var.invalidate();
                    }
                    gh0 gh0Var = hh0Var.h;
                    if (gh0Var != null) {
                        gh0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
