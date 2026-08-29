package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pr0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.m61, org.telegram.ui.Components.y61, org.telegram.ui.Components.oe0 {
    public final PhotoViewer f41455a;

    public pr0(PhotoViewer photoViewer) {
        this.f41455a = photoViewer;
    }

    public void a(boolean z10) {
        float f9;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f41455a;
        if (photoViewer.R0.isClickable() != z11) {
            photoViewer.R0.setClickable(z11);
            photoViewer.R0.setVisibility(0);
            photoViewer.R0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.R0.animate();
            if (!z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            animate.alpha(f9).setInterpolator(org.telegram.ui.Components.jr.f29800f).setDuration(150L).withEndAction(new org.telegram.ui.Components.p90(11, photoViewer, z11));
        }
    }

    @Override
    public void b() {
        PhotoViewer photoViewer = this.f41455a;
        if (photoViewer.f35714h3 && photoViewer.L3) {
            photoViewer.s2();
        }
    }

    @Override
    public void c(float f9) {
        et0 et0Var;
        PhotoViewer photoViewer = this.f41455a;
        if (photoViewer.B2 == null && ((et0Var = photoViewer.f35656b0) == null || !et0Var.f30680x)) {
            return;
        }
        if (!photoViewer.f35854w8 && photoViewer.M7.getVisibility() == 0) {
            f9 = ((photoViewer.N7.getRightProgress() - photoViewer.N7.getLeftProgress()) * f9) + photoViewer.N7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.W2 = f9;
        } else {
            photoViewer.t2((int) (f9 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f35794q3 = false;
    }

    @Override
    public void d(float f9) {
        is0 is0Var;
        is0 is0Var2;
        PhotoViewer photoViewer = this.f41455a;
        et0 et0Var = photoViewer.f35656b0;
        if (et0Var != null && et0Var.f30680x && (is0Var2 = photoViewer.f35776o3) != null) {
            int i10 = photoViewer.f35757m3.h - org.telegram.ui.Components.z61.S;
            is0Var2.J = et0Var;
            if (is0Var2.S != 0) {
                is0Var2.S = 0L;
                is0Var2.f27689b0 = null;
                is0Var2.f27687a0 = null;
                is0Var2.W = null;
                is0Var2.b(-1);
            }
            if (i10 != 0) {
                is0Var2.f27695r = i10;
                int i11 = ((int) (i10 * f9)) / 5;
                if (is0Var2.f27694n != i11) {
                    is0Var2.f27694n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((et0Var.getVideoDuration() * f9) / 1000));
            is0Var2.f27699y = formatShortDuration;
            is0Var2.A = (int) Math.ceil(is0Var2.B.measureText(formatShortDuration));
            is0Var2.invalidate();
            if (is0Var2.f27693f != null) {
                Utilities.globalQueue.cancelRunnable(is0Var2.f27693f);
            }
            double videoDuration = (f9 * et0Var.getVideoDuration()) / 1000.0d;
            is0Var2.K = videoDuration;
            String c3 = et0Var.c((int) videoDuration);
            if (c3 != null) {
                is0Var2.M.setImage(c3, null, null, null, 0L);
            }
        } else if (photoViewer.B2 != null && (is0Var = photoViewer.f35776o3) != null) {
            is0Var.e(photoViewer.P4, f9, photoViewer.f35757m3.h - org.telegram.ui.Components.z61.S);
        }
        this.f41455a.b3(true);
        PhotoViewer.X(this.f41455a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f41455a;
        if (photoViewer.f35714h3 && photoViewer.L3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f35820t2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f41455a;
        org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
        if (x61Var == null) {
            return;
        }
        x61Var.L(((float) x61Var.q()) * photoViewer.f35807r8);
        photoViewer.B2.C();
        photoViewer.N7.setProgress(photoViewer.f35807r8);
        photoViewer.u0();
        vk0 vk0Var = new vk0(this, 19);
        photoViewer.E2 = vk0Var;
        AndroidUtilities.runOnUIThread(vk0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f41455a.f35647a0.invalidate();
    }
}
