package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class is0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.j81, org.telegram.ui.Components.u81, org.telegram.ui.Components.of0 {
    public final PhotoViewer f40267a;

    public is0(PhotoViewer photoViewer) {
        this.f40267a = photoViewer;
    }

    @Override
    public void a() {
        PhotoViewer photoViewer = this.f40267a;
        if (photoViewer.f35734l3 && photoViewer.P3) {
            photoViewer.v2();
        }
    }

    @Override
    public void b() {
        PhotoViewer photoViewer = this.f40267a;
        if (photoViewer.f35734l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f35842x2);
        }
    }

    @Override
    public void c(float f7) {
        xt0 xt0Var;
        PhotoViewer photoViewer = this.f40267a;
        if (photoViewer.F2 == null && ((xt0Var = photoViewer.f35680f0) == null || !xt0Var.f30914x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long C1 = photoViewer.C1();
        if (C1 == -9223372036854775807L) {
            photoViewer.f35635a3 = f7;
        } else {
            photoViewer.w2((int) (f7 * ((float) C1)));
        }
        photoViewer.e3(false);
        photoViewer.f35814u3 = false;
    }

    public void d(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f40267a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.ds.f27530f).setDuration(150L).withEndAction(new org.telegram.ui.Components.d60(14, photoViewer, z11));
        }
    }

    public void e() {
        PhotoViewer photoViewer = this.f40267a;
        org.telegram.ui.Components.t81 t81Var = photoViewer.F2;
        if (t81Var == null) {
            return;
        }
        t81Var.K(((float) t81Var.p()) * photoViewer.f35838w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f35838w8);
        photoViewer.v0();
        nj0 nj0Var = new nj0(this, 21);
        photoViewer.I2 = nj0Var;
        AndroidUtilities.runOnUIThread(nj0Var, 860L);
    }

    @Override
    public void f(float f7) {
        bt0 bt0Var;
        bt0 bt0Var2;
        PhotoViewer photoViewer = this.f40267a;
        xt0 xt0Var = photoViewer.f35680f0;
        if (xt0Var != null && xt0Var.f30914x && (bt0Var2 = photoViewer.f35796s3) != null) {
            int i10 = photoViewer.f35778q3.h - org.telegram.ui.Components.v81.S;
            bt0Var2.N = xt0Var;
            if (bt0Var2.W != 0) {
                bt0Var2.W = 0L;
                bt0Var2.f26474f0 = null;
                bt0Var2.f26472e0 = null;
                bt0Var2.f26471d0 = null;
                bt0Var2.b(-1);
            }
            if (i10 != 0) {
                bt0Var2.f26477r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (bt0Var2.f26476n != i11) {
                    bt0Var2.f26476n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((xt0Var.getVideoDuration() * f7) / 1000));
            bt0Var2.f26481y = formatShortDuration;
            bt0Var2.E = (int) Math.ceil(bt0Var2.F.measureText(formatShortDuration));
            bt0Var2.invalidate();
            if (bt0Var2.f26473f != null) {
                Utilities.globalQueue.cancelRunnable(bt0Var2.f26473f);
            }
            double videoDuration = (f7 * xt0Var.getVideoDuration()) / 1000.0d;
            bt0Var2.O = videoDuration;
            String c10 = xt0Var.c((int) videoDuration);
            if (c10 != null) {
                bt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (bt0Var = photoViewer.f35796s3) != null) {
            bt0Var.e(photoViewer.T4, f7, photoViewer.f35778q3.h - org.telegram.ui.Components.v81.S);
        }
        this.f40267a.e3(true);
        PhotoViewer.Y(this.f40267a);
    }

    @Override
    public void invalidate() {
        this.f40267a.f35670e0.invalidate();
    }
}
