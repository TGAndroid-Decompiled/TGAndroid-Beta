package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.PhotoViewer;
public final class j1 extends OldVideoPlayerRewinder {
    public final int f22060a;
    public final Object f22061b;

    public j1(Object obj, int i10) {
        this.f22060a = i10;
        this.f22061b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        switch (this.f22060a) {
            case 0:
                q1 q1Var = (q1) this.f22061b;
                q1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                q1Var.Mb.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22061b;
                PhotoViewer.d(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f33659z1.f(false);
                jf0.f27345p0.Q.f(false);
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        switch (this.f22060a) {
            case 0:
                q1 q1Var = (q1) this.f22061b;
                m61 m61Var = q1Var.Mb;
                m61Var.f28324n = new m2.t(this, 7);
                m61Var.e(false);
                q1Var.Mb.d(!z10);
                q1Var.Mb.f(true);
                q1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22061b;
                photoViewer.f33659z1.e(false);
                photoViewer.f33659z1.d(!z10);
                photoViewer.f33659z1.f(true);
                photoViewer.f33470e0.invalidate();
                jf0.v(z10);
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.f22060a) {
            case 0:
                q1 q1Var = (q1) this.f22061b;
                q1Var.Mb.g(Math.abs(j10));
                if (z10) {
                    q1Var.O5.f16299b0 = f7;
                    q1Var.O3();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f22061b;
                photoViewer.f33659z1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.f33577q3.h(false, f7);
                    photoViewer.f33586r3.invalidate();
                }
                jf0 jf0Var = jf0.f27345p0;
                jf0Var.Q.g(0L);
                if (z10) {
                    jf0Var.Z = f7;
                    ih.c cVar = jf0Var.f27349b0;
                    if (cVar != null) {
                        cVar.invalidate();
                    }
                    if0 if0Var = jf0Var.h;
                    if (if0Var != null) {
                        if0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
