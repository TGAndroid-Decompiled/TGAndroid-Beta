package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ls0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.k71, org.telegram.ui.Components.u71, org.telegram.ui.Components.ef0 {
    public final PhotoViewer f35408a;

    public ls0(PhotoViewer photoViewer) {
        this.f35408a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f35408a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.sr.f28339f).setDuration(150L).withEndAction(new org.telegram.ui.Components.zr0(8, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        au0 au0Var;
        PhotoViewer photoViewer = this.f35408a;
        if (photoViewer.F2 == null && ((au0Var = photoViewer.f31231f0) == null || !au0Var.f23012x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f31187a3 = f7;
        } else {
            photoViewer.s2((int) (f7 * ((float) A1)));
        }
        photoViewer.a3(false);
        photoViewer.f31365u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f35408a;
        if (photoViewer.f31285l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override
    public void d(float f7) {
        et0 et0Var;
        et0 et0Var2;
        PhotoViewer photoViewer = this.f35408a;
        au0 au0Var = photoViewer.f31231f0;
        if (au0Var != null && au0Var.f23012x && (et0Var2 = photoViewer.f31347s3) != null) {
            int i10 = photoViewer.f31328q3.h - org.telegram.ui.Components.v71.S;
            et0Var2.N = au0Var;
            if (et0Var2.W != 0) {
                et0Var2.W = 0L;
                et0Var2.f22921f0 = null;
                et0Var2.f22919e0 = null;
                et0Var2.f22918d0 = null;
                et0Var2.b(-1);
            }
            if (i10 != 0) {
                et0Var2.f22924r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (et0Var2.f22923n != i11) {
                    et0Var2.f22923n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((au0Var.getVideoDuration() * f7) / 1000));
            et0Var2.f22928y = formatShortDuration;
            et0Var2.E = (int) Math.ceil(et0Var2.F.measureText(formatShortDuration));
            et0Var2.invalidate();
            if (et0Var2.f22920f != null) {
                Utilities.globalQueue.cancelRunnable(et0Var2.f22920f);
            }
            double videoDuration = (f7 * au0Var.getVideoDuration()) / 1000.0d;
            et0Var2.O = videoDuration;
            String c10 = au0Var.c((int) videoDuration);
            if (c10 != null) {
                et0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (et0Var = photoViewer.f31347s3) != null) {
            et0Var.e(photoViewer.T4, f7, photoViewer.f31328q3.h - org.telegram.ui.Components.v71.S);
        }
        this.f35408a.a3(true);
        PhotoViewer.X(this.f35408a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f35408a;
        if (photoViewer.f31285l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f31393x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f35408a;
        org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
        if (t71Var == null) {
            return;
        }
        t71Var.K(((float) t71Var.p()) * photoViewer.f31389w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f31389w8);
        photoViewer.u0();
        il0 il0Var = new il0(this, 18);
        photoViewer.I2 = il0Var;
        AndroidUtilities.runOnUIThread(il0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f35408a.f31222e0.invalidate();
    }
}
