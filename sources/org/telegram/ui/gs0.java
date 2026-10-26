package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gs0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.i81, org.telegram.ui.Components.t81, org.telegram.ui.Components.nf0 {
    public final PhotoViewer f39777a;

    public gs0(PhotoViewer photoViewer) {
        this.f39777a = photoViewer;
    }

    @Override
    public void a() {
        PhotoViewer photoViewer = this.f39777a;
        if (photoViewer.f35710l3 && photoViewer.P3) {
            photoViewer.u2();
        }
    }

    @Override
    public void b() {
        PhotoViewer photoViewer = this.f39777a;
        if (photoViewer.f35710l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f35818x2);
        }
    }

    @Override
    public void c(float f7) {
        vt0 vt0Var;
        PhotoViewer photoViewer = this.f39777a;
        if (photoViewer.F2 == null && ((vt0Var = photoViewer.f35656f0) == null || !vt0Var.f30582x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long B1 = photoViewer.B1();
        if (B1 == -9223372036854775807L) {
            photoViewer.f35611a3 = f7;
        } else {
            photoViewer.v2((int) (f7 * ((float) B1)));
        }
        photoViewer.d3(false);
        photoViewer.f35790u3 = false;
    }

    public void d(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f39777a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.ds.f27586f).setDuration(150L).withEndAction(new org.telegram.ui.Components.d60(14, photoViewer, z11));
        }
    }

    public void e() {
        PhotoViewer photoViewer = this.f39777a;
        org.telegram.ui.Components.s81 s81Var = photoViewer.F2;
        if (s81Var == null) {
            return;
        }
        s81Var.K(((float) s81Var.p()) * photoViewer.f35814w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f35814w8);
        photoViewer.v0();
        lj0 lj0Var = new lj0(this, 21);
        photoViewer.I2 = lj0Var;
        AndroidUtilities.runOnUIThread(lj0Var, 860L);
    }

    @Override
    public void f(float f7) {
        zs0 zs0Var;
        zs0 zs0Var2;
        PhotoViewer photoViewer = this.f39777a;
        vt0 vt0Var = photoViewer.f35656f0;
        if (vt0Var != null && vt0Var.f30582x && (zs0Var2 = photoViewer.f35772s3) != null) {
            int i10 = photoViewer.f35754q3.h - org.telegram.ui.Components.u81.S;
            zs0Var2.N = vt0Var;
            if (zs0Var2.W != 0) {
                zs0Var2.W = 0L;
                zs0Var2.f35254f0 = null;
                zs0Var2.f35252e0 = null;
                zs0Var2.f35251d0 = null;
                zs0Var2.b(-1);
            }
            if (i10 != 0) {
                zs0Var2.f35257r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (zs0Var2.f35256n != i11) {
                    zs0Var2.f35256n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((vt0Var.getVideoDuration() * f7) / 1000));
            zs0Var2.f35261y = formatShortDuration;
            zs0Var2.E = (int) Math.ceil(zs0Var2.F.measureText(formatShortDuration));
            zs0Var2.invalidate();
            if (zs0Var2.f35253f != null) {
                Utilities.globalQueue.cancelRunnable(zs0Var2.f35253f);
            }
            double videoDuration = (f7 * vt0Var.getVideoDuration()) / 1000.0d;
            zs0Var2.O = videoDuration;
            String c10 = vt0Var.c((int) videoDuration);
            if (c10 != null) {
                zs0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (zs0Var = photoViewer.f35772s3) != null) {
            zs0Var.e(photoViewer.T4, f7, photoViewer.f35754q3.h - org.telegram.ui.Components.u81.S);
        }
        this.f39777a.d3(true);
        PhotoViewer.Y(this.f39777a);
    }

    @Override
    public void invalidate() {
        this.f39777a.f35646e0.invalidate();
    }
}
