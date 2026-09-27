package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class os0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.l71, org.telegram.ui.Components.v71, org.telegram.ui.Components.df0 {
    public final PhotoViewer f36249a;

    public os0(PhotoViewer photoViewer) {
        this.f36249a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f36249a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.sr.f28359f).setDuration(150L).withEndAction(new org.telegram.ui.Components.as0(8, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        du0 du0Var;
        PhotoViewer photoViewer = this.f36249a;
        if (photoViewer.F2 == null && ((du0Var = photoViewer.f31234f0) == null || !du0Var.f23018x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f31190a3 = f7;
        } else {
            photoViewer.s2((int) (f7 * ((float) A1)));
        }
        photoViewer.a3(false);
        photoViewer.f31368u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f36249a;
        if (photoViewer.f31288l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override
    public void d(float f7) {
        ht0 ht0Var;
        ht0 ht0Var2;
        PhotoViewer photoViewer = this.f36249a;
        du0 du0Var = photoViewer.f31234f0;
        if (du0Var != null && du0Var.f23018x && (ht0Var2 = photoViewer.f31350s3) != null) {
            int i10 = photoViewer.f31331q3.h - org.telegram.ui.Components.w71.S;
            ht0Var2.N = du0Var;
            if (ht0Var2.W != 0) {
                ht0Var2.W = 0L;
                ht0Var2.f23259f0 = null;
                ht0Var2.f23257e0 = null;
                ht0Var2.f23256d0 = null;
                ht0Var2.b(-1);
            }
            if (i10 != 0) {
                ht0Var2.f23262r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ht0Var2.f23261n != i11) {
                    ht0Var2.f23261n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((du0Var.getVideoDuration() * f7) / 1000));
            ht0Var2.f23266y = formatShortDuration;
            ht0Var2.E = (int) Math.ceil(ht0Var2.F.measureText(formatShortDuration));
            ht0Var2.invalidate();
            if (ht0Var2.f23258f != null) {
                Utilities.globalQueue.cancelRunnable(ht0Var2.f23258f);
            }
            double videoDuration = (f7 * du0Var.getVideoDuration()) / 1000.0d;
            ht0Var2.O = videoDuration;
            String c10 = du0Var.c((int) videoDuration);
            if (c10 != null) {
                ht0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ht0Var = photoViewer.f31350s3) != null) {
            ht0Var.e(photoViewer.T4, f7, photoViewer.f31331q3.h - org.telegram.ui.Components.w71.S);
        }
        this.f36249a.a3(true);
        PhotoViewer.X(this.f36249a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f36249a;
        if (photoViewer.f31288l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f31396x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f36249a;
        org.telegram.ui.Components.u71 u71Var = photoViewer.F2;
        if (u71Var == null) {
            return;
        }
        u71Var.K(((float) u71Var.p()) * photoViewer.f31392w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f31392w8);
        photoViewer.u0();
        ml0 ml0Var = new ml0(this, 18);
        photoViewer.I2 = ml0Var;
        AndroidUtilities.runOnUIThread(ml0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f36249a.f31225e0.invalidate();
    }
}
