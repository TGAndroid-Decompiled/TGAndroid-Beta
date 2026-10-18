package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f22326a;
    public final Object f22327b;

    public h1(Object obj, int i10) {
        this.f22326a = i10;
        this.f22327b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f22326a) {
            case 0:
                u1 u1Var = (u1) this.f22327b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22327b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f33462z1.f(false);
                zg0.f32912p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f22326a) {
            case 0:
                u1 u1Var = (u1) this.f22327b;
                r71 r71Var = u1Var.Gd;
                r71Var.f29879n = new ki.t1(this, 11);
                r71Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22327b;
                photoViewer.f33462z1.e(false);
                photoViewer.f33462z1.d(!z10);
                photoViewer.f33462z1.f(true);
                photoViewer.f33273e0.invalidate();
                zg0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.f22326a) {
            case 0:
                u1 u1Var = (u1) this.f22327b;
                u1Var.Gd.g(Math.abs(j10));
                if (z10) {
                    u1Var.f23571y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22327b;
                photoViewer.f33462z1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f33380q3.h(f7, false);
                    photoViewer.f33389r3.invalidate();
                }
                zg0 zg0Var = zg0.f32912p0;
                zg0Var.Q.g(0L);
                if (z10) {
                    zg0Var.Z = f7;
                    ci.i3 i3Var = zg0Var.f32916b0;
                    if (i3Var != null) {
                        i3Var.invalidate();
                    }
                    yg0 yg0Var = zg0Var.h;
                    if (yg0Var != null) {
                        yg0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
