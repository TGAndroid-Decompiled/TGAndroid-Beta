package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f22323a;
    public final Object f22324b;

    public h1(Object obj, int i10) {
        this.f22323a = i10;
        this.f22324b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f22323a) {
            case 0:
                u1 u1Var = (u1) this.f22324b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22324b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f33468z1.f(false);
                ah0.f24598p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f22323a) {
            case 0:
                u1 u1Var = (u1) this.f22324b;
                t71 t71Var = u1Var.Gd;
                t71Var.f30470n = new ki.t1(this, 11);
                t71Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22324b;
                photoViewer.f33468z1.e(false);
                photoViewer.f33468z1.d(!z10);
                photoViewer.f33468z1.f(true);
                photoViewer.f33279e0.invalidate();
                ah0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.f22323a) {
            case 0:
                u1 u1Var = (u1) this.f22324b;
                u1Var.Gd.g(Math.abs(j10));
                if (z10) {
                    u1Var.f23568y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22324b;
                photoViewer.f33468z1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f33386q3.h(f7, false);
                    photoViewer.f33395r3.invalidate();
                }
                ah0 ah0Var = ah0.f24598p0;
                ah0Var.Q.g(0L);
                if (z10) {
                    ah0Var.Z = f7;
                    ci.i3 i3Var = ah0Var.f24602b0;
                    if (i3Var != null) {
                        i3Var.invalidate();
                    }
                    zg0 zg0Var = ah0Var.h;
                    if (zg0Var != null) {
                        zg0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
