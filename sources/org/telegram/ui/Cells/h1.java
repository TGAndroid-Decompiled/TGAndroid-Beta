package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f20965a;
    public final Object f20966b;

    public h1(Object obj, int i10) {
        this.f20965a = i10;
        this.f20966b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f20965a) {
            case 0:
                u1 u1Var = (u1) this.f20966b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20966b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f32117z1.f(false);
                fh0.f24733p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f20965a) {
            case 0:
                u1 u1Var = (u1) this.f20966b;
                a81 a81Var = u1Var.Gd;
                a81Var.f23166n = new m.l(this);
                a81Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20966b;
                photoViewer.f32117z1.e(false);
                photoViewer.f32117z1.d(!z10);
                photoViewer.f32117z1.f(true);
                photoViewer.f31928e0.invalidate();
                fh0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.f20965a) {
            case 0:
                u1 u1Var = (u1) this.f20966b;
                u1Var.Gd.g(Math.abs(j10));
                if (z10) {
                    u1Var.f22197y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f20966b;
                photoViewer.f32117z1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f32035q3.h(f7, false);
                    photoViewer.f32044r3.invalidate();
                }
                fh0 fh0Var = fh0.f24733p0;
                fh0Var.Q.g(0L);
                if (z10) {
                    fh0Var.Z = f7;
                    bi.d4 d4Var = fh0Var.f24737b0;
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
