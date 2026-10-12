package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f21258a;
    public final Object f21259b;

    public h1(Object obj, int i10) {
        this.f21258a = i10;
        this.f21259b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f21258a) {
            case 0:
                u1 u1Var = (u1) this.f21259b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21259b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f32415z1.f(false);
                fh0.f25035p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f21258a) {
            case 0:
                u1 u1Var = (u1) this.f21259b;
                z71 z71Var = u1Var.Gd;
                z71Var.f31801n = new ji.w4(this, 11);
                z71Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21259b;
                photoViewer.f32415z1.e(false);
                photoViewer.f32415z1.d(!z10);
                photoViewer.f32415z1.f(true);
                photoViewer.f32226e0.invalidate();
                fh0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.f21258a) {
            case 0:
                u1 u1Var = (u1) this.f21259b;
                u1Var.Gd.g(Math.abs(j10));
                if (z10) {
                    u1Var.f22488y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f21259b;
                photoViewer.f32415z1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f32333q3.h(f7, false);
                    photoViewer.f32342r3.invalidate();
                }
                fh0 fh0Var = fh0.f25035p0;
                fh0Var.Q.g(0L);
                if (z10) {
                    fh0Var.Z = f7;
                    bi.d4 d4Var = fh0Var.f25039b0;
                    if (d4Var != null) {
                        d4Var.invalidate();
                    }
                    eh0 eh0Var = fh0Var.h;
                    if (eh0Var != null) {
                        eh0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
