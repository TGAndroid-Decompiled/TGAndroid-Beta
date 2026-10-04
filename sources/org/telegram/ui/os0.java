package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class os0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.u71, org.telegram.ui.Components.e81, org.telegram.ui.Components.ff0 {
    public final PhotoViewer f39271a;

    public os0(PhotoViewer photoViewer) {
        this.f39271a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f39271a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.tr.f31140f).setDuration(150L).withEndAction(new org.telegram.ui.Components.es0(8, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        du0 du0Var;
        PhotoViewer photoViewer = this.f39271a;
        if (photoViewer.F2 == null && ((du0Var = photoViewer.f33903f0) == null || !du0Var.f25723x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f33858a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f34037u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f39271a;
        if (photoViewer.f33957l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d(float f7) {
        ht0 ht0Var;
        ht0 ht0Var2;
        PhotoViewer photoViewer = this.f39271a;
        du0 du0Var = photoViewer.f33903f0;
        if (du0Var != null && du0Var.f25723x && (ht0Var2 = photoViewer.f34019s3) != null) {
            int i10 = photoViewer.f34000q3.h - org.telegram.ui.Components.f81.S;
            ht0Var2.N = du0Var;
            if (ht0Var2.W != 0) {
                ht0Var2.W = 0L;
                ht0Var2.f28017f0 = null;
                ht0Var2.f28015e0 = null;
                ht0Var2.f28013d0 = null;
                ht0Var2.b(-1);
            }
            if (i10 != 0) {
                ht0Var2.f28020r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ht0Var2.f28019n != i11) {
                    ht0Var2.f28019n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((du0Var.getVideoDuration() * f7) / 1000));
            ht0Var2.f28024y = formatShortDuration;
            ht0Var2.E = (int) Math.ceil(ht0Var2.F.measureText(formatShortDuration));
            ht0Var2.invalidate();
            if (ht0Var2.f28016f != null) {
                Utilities.globalQueue.cancelRunnable(ht0Var2.f28016f);
            }
            double videoDuration = (f7 * du0Var.getVideoDuration()) / 1000.0d;
            ht0Var2.O = videoDuration;
            String c10 = du0Var.c((int) videoDuration);
            if (c10 != null) {
                ht0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ht0Var = photoViewer.f34019s3) != null) {
            ht0Var.e(photoViewer.T4, f7, photoViewer.f34000q3.h - org.telegram.ui.Components.f81.S);
        }
        this.f39271a.b3(true);
        PhotoViewer.W(this.f39271a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f39271a;
        if (photoViewer.f33957l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f34065x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f39271a;
        org.telegram.ui.Components.d81 d81Var = photoViewer.F2;
        if (d81Var == null) {
            return;
        }
        d81Var.K(((float) d81Var.p()) * photoViewer.f34061w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f34061w8);
        photoViewer.u0();
        nl0 nl0Var = new nl0(this, 19);
        photoViewer.I2 = nl0Var;
        AndroidUtilities.runOnUIThread(nl0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f39271a.f33894e0.invalidate();
    }
}
