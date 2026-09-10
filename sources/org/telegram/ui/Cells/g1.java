package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.PhotoViewer;
public final class g1 extends OldVideoPlayerRewinder {
    public final int f19180a;
    public final Object f19181b;

    public g1(Object obj, int i10) {
        this.f19180a = i10;
        this.f19181b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f19180a) {
            case 0:
                t1 t1Var = (t1) this.f19181b;
                t1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                t1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f19181b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f30237z1.f(false);
                og0.f25781p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f19180a) {
            case 0:
                t1 t1Var = (t1) this.f19181b;
                j71 j71Var = t1Var.Gd;
                j71Var.f24272n = new o0.b(this);
                j71Var.e(false);
                t1Var.Gd.d(!z10);
                t1Var.Gd.f(true);
                t1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f19181b;
                photoViewer.f30237z1.e(false);
                photoViewer.f30237z1.d(!z10);
                photoViewer.f30237z1.f(true);
                photoViewer.f30049e0.invalidate();
                og0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f19180a) {
            case 0:
                t1 t1Var = (t1) this.f19181b;
                t1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    t1Var.f20403y7.audioProgress = f7;
                    t1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f19181b;
                photoViewer.f30237z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f30155q3.h(f7, false);
                    photoViewer.f30164r3.invalidate();
                }
                og0 og0Var = og0.f25781p0;
                og0Var.Q.g(0L);
                if (z10) {
                    og0Var.Z = f7;
                    org.telegram.ui.u7 u7Var = og0Var.f25785b0;
                    if (u7Var != null) {
                        u7Var.invalidate();
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
