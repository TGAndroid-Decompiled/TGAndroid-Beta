package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.PhotoViewer;
public final class g1 extends OldVideoPlayerRewinder {
    public final int f22397a;
    public final Object f22398b;

    public g1(Object obj, int i10) {
        this.f22397a = i10;
        this.f22398b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f22397a) {
            case 0:
                t1 t1Var = (t1) this.f22398b;
                t1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                t1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22398b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f33771z1.f(false);
                ch0.f25313p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f22397a) {
            case 0:
                t1 t1Var = (t1) this.f22398b;
                a81 a81Var = t1Var.Gd;
                a81Var.f24665n = new ki.t1(this, 11);
                a81Var.e(false);
                t1Var.Gd.d(!z10);
                t1Var.Gd.f(true);
                t1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22398b;
                photoViewer.f33771z1.e(false);
                photoViewer.f33771z1.d(!z10);
                photoViewer.f33771z1.f(true);
                photoViewer.f33582e0.invalidate();
                ch0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.f22397a) {
            case 0:
                t1 t1Var = (t1) this.f22398b;
                t1Var.Gd.g(Math.abs(j10));
                if (z10) {
                    t1Var.f23660y7.audioProgress = f7;
                    t1Var.p4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22398b;
                photoViewer.f33771z1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f33689q3.h(f7, false);
                    photoViewer.f33698r3.invalidate();
                }
                ch0 ch0Var = ch0.f25313p0;
                ch0Var.Q.g(0L);
                if (z10) {
                    ch0Var.Z = f7;
                    ci.h3 h3Var = ch0Var.f25317b0;
                    if (h3Var != null) {
                        h3Var.invalidate();
                    }
                    bh0 bh0Var = ch0Var.h;
                    if (bh0Var != null) {
                        bh0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
