package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class os0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.v71, org.telegram.ui.Components.f81, org.telegram.ui.Components.ff0 {
    public final PhotoViewer f39287a;

    public os0(PhotoViewer photoViewer) {
        this.f39287a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f39287a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.tr.f31215f).setDuration(150L).withEndAction(new org.telegram.ui.Components.fs0(8, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        du0 du0Var;
        PhotoViewer photoViewer = this.f39287a;
        if (photoViewer.F2 == null && ((du0Var = photoViewer.f33923f0) == null || !du0Var.f25784x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f33878a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f34057u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f39287a;
        if (photoViewer.f33977l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d(float f7) {
        ht0 ht0Var;
        ht0 ht0Var2;
        PhotoViewer photoViewer = this.f39287a;
        du0 du0Var = photoViewer.f33923f0;
        if (du0Var != null && du0Var.f25784x && (ht0Var2 = photoViewer.f34039s3) != null) {
            int i10 = photoViewer.f34020q3.h - org.telegram.ui.Components.g81.S;
            ht0Var2.N = du0Var;
            if (ht0Var2.W != 0) {
                ht0Var2.W = 0L;
                ht0Var2.f28409f0 = null;
                ht0Var2.f28407e0 = null;
                ht0Var2.f28405d0 = null;
                ht0Var2.b(-1);
            }
            if (i10 != 0) {
                ht0Var2.f28412r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ht0Var2.f28411n != i11) {
                    ht0Var2.f28411n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((du0Var.getVideoDuration() * f7) / 1000));
            ht0Var2.f28416y = formatShortDuration;
            ht0Var2.E = (int) Math.ceil(ht0Var2.F.measureText(formatShortDuration));
            ht0Var2.invalidate();
            if (ht0Var2.f28408f != null) {
                Utilities.globalQueue.cancelRunnable(ht0Var2.f28408f);
            }
            double videoDuration = (f7 * du0Var.getVideoDuration()) / 1000.0d;
            ht0Var2.O = videoDuration;
            String c10 = du0Var.c((int) videoDuration);
            if (c10 != null) {
                ht0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ht0Var = photoViewer.f34039s3) != null) {
            ht0Var.e(photoViewer.T4, f7, photoViewer.f34020q3.h - org.telegram.ui.Components.g81.S);
        }
        this.f39287a.b3(true);
        PhotoViewer.W(this.f39287a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f39287a;
        if (photoViewer.f33977l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f34085x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f39287a;
        org.telegram.ui.Components.e81 e81Var = photoViewer.F2;
        if (e81Var == null) {
            return;
        }
        e81Var.K(((float) e81Var.p()) * photoViewer.f34081w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f34081w8);
        photoViewer.u0();
        nl0 nl0Var = new nl0(this, 19);
        photoViewer.I2 = nl0Var;
        AndroidUtilities.runOnUIThread(nl0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f39287a.f33914e0.invalidate();
    }
}
