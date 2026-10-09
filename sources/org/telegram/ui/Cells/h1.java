package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.PhotoViewer;
public final class h1 extends OldVideoPlayerRewinder {
    public final int f22189a;
    public final Object f22190b;

    public h1(Object obj, int i10) {
        this.f22189a = i10;
        this.f22190b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f22189a) {
            case 0:
                u1 u1Var = (u1) this.f22190b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22190b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f34092z1.f(false);
                gh0.f26700p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f22189a) {
            case 0:
                u1 u1Var = (u1) this.f22190b;
                b81 b81Var = u1Var.Gd;
                b81Var.f24943n = new l2.f(this, 8);
                b81Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22190b;
                photoViewer.f34092z1.e(false);
                photoViewer.f34092z1.d(!z10);
                photoViewer.f34092z1.f(true);
                photoViewer.f33904e0.invalidate();
                gh0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.f22189a) {
            case 0:
                u1 u1Var = (u1) this.f22190b;
                u1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    u1Var.f23458y7.audioProgress = f7;
                    u1Var.q4();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22190b;
                photoViewer.f34092z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f34010q3.h(f7, false);
                    photoViewer.f34019r3.invalidate();
                }
                gh0 gh0Var = gh0.f26700p0;
                gh0Var.Q.g(0L);
                if (z10) {
                    gh0Var.Z = f7;
                    ai.o4 o4Var = gh0Var.f26704b0;
                    if (o4Var != null) {
                        o4Var.invalidate();
                    }
                    fh0 fh0Var = gh0Var.h;
                    if (fh0Var != null) {
                        fh0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
