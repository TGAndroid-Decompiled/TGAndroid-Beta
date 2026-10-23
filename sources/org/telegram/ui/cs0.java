package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class cs0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.a81, org.telegram.ui.Components.k81, org.telegram.ui.Components.qf0 {
    public final PhotoViewer f36422a;

    public cs0(PhotoViewer photoViewer) {
        this.f36422a = photoViewer;
    }

    @Override
    public void a(float f7) {
        rt0 rt0Var;
        PhotoViewer photoViewer = this.f36422a;
        if (photoViewer.F2 == null && ((rt0Var = photoViewer.f33589f0) == null || !rt0Var.f29558x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long B1 = photoViewer.B1();
        if (B1 == -9223372036854775807L) {
            photoViewer.f33545a3 = f7;
        } else {
            photoViewer.v2((int) (f7 * ((float) B1)));
        }
        photoViewer.d3(false);
        photoViewer.f33724u3 = false;
    }

    @Override
    public void b(float f7) {
        vs0 vs0Var;
        vs0 vs0Var2;
        PhotoViewer photoViewer = this.f36422a;
        rt0 rt0Var = photoViewer.f33589f0;
        if (rt0Var != null && rt0Var.f29558x && (vs0Var2 = photoViewer.f33706s3) != null) {
            int i10 = photoViewer.f33687q3.h - org.telegram.ui.Components.l81.S;
            vs0Var2.N = rt0Var;
            if (vs0Var2.W != 0) {
                vs0Var2.W = 0L;
                vs0Var2.f29797f0 = null;
                vs0Var2.f29795e0 = null;
                vs0Var2.f29794d0 = null;
                vs0Var2.b(-1);
            }
            if (i10 != 0) {
                vs0Var2.f29800r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (vs0Var2.f29799n != i11) {
                    vs0Var2.f29799n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((rt0Var.getVideoDuration() * f7) / 1000));
            vs0Var2.f29804y = formatShortDuration;
            vs0Var2.E = (int) Math.ceil(vs0Var2.F.measureText(formatShortDuration));
            vs0Var2.invalidate();
            if (vs0Var2.f29796f != null) {
                Utilities.globalQueue.cancelRunnable(vs0Var2.f29796f);
            }
            double videoDuration = (f7 * rt0Var.getVideoDuration()) / 1000.0d;
            vs0Var2.O = videoDuration;
            String c10 = rt0Var.c((int) videoDuration);
            if (c10 != null) {
                vs0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (vs0Var = photoViewer.f33706s3) != null) {
            vs0Var.e(photoViewer.T4, f7, photoViewer.f33687q3.h - org.telegram.ui.Components.l81.S);
        }
        this.f36422a.d3(true);
        PhotoViewer.Y(this.f36422a);
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f36422a;
        if (photoViewer.f33644l3 && photoViewer.P3) {
            photoViewer.u2();
        }
    }

    @Override
    public void d() {
        PhotoViewer photoViewer = this.f36422a;
        if (photoViewer.f33644l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f33752x2);
        }
    }

    public void e(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f36422a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.V0.animate();
            if (!z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.bs.f25133f).setDuration(150L).withEndAction(new org.telegram.ui.Components.b60(13, photoViewer, z11));
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f36422a;
        org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
        if (j81Var == null) {
            return;
        }
        j81Var.K(((float) j81Var.p()) * photoViewer.f33748w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f33748w8);
        photoViewer.v0();
        oj0 oj0Var = new oj0(this, 20);
        photoViewer.I2 = oj0Var;
        AndroidUtilities.runOnUIThread(oj0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f36422a.f33580e0.invalidate();
    }
}
