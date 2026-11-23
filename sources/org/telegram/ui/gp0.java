package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class gp0 extends AnimatorListenerAdapter {
    public final int f48338a;
    public final PhotoViewer f48339b;

    public gp0(PhotoViewer photoViewer, int i7) {
        this.f48338a = i7;
        this.f48339b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ti tiVar;
        int i7 = this.f48338a;
        PhotoViewer photoViewer = this.f48339b;
        switch (i7) {
            case 0:
                photoViewer.f43424p6 = null;
                org.telegram.ui.Components.qd0 qd0Var = photoViewer.D1;
                if (qd0Var != null) {
                    if (qd0Var.f38811b.j()) {
                        org.telegram.ui.ActionBar.u6.s(photoViewer.f43293b1, org.telegram.ui.ActionBar.n6.f29700qg, photoViewer.f43484w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f43293b1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f43349g6 = 0.0f;
                    photoViewer.f43334f0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f43458t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                photoViewer.f3();
                return;
            case 3:
                photoViewer.M1.p0(false);
                vp0 vp0Var = photoViewer.M1;
                vp0Var.f58028e1.setTypeface(sg.j0.e(vp0Var.f58062z1).f57383j);
                vp0Var.J0.setVisibility(0);
                vp0Var.G0.setVisibility(0);
                vp0Var.H0.setVisibility(0);
                org.telegram.ui.Components.cc0 cc0Var = photoViewer.f43506y4;
                cc0Var.f34020f = true;
                int childCount = cc0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    cc0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.f43424p6 = null;
                photoViewer.f43467u4 = 3;
                hi.x3 x3Var = photoViewer.b1().M;
                if (photoViewer.f43467u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x3Var.b(z10);
                hi.x3 x3Var2 = photoViewer.L1;
                if (x3Var2 != null) {
                    if (photoViewer.f43467u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    x3Var2.b(z11);
                }
                photoViewer.f43415o6 = -1;
                float q22 = photoViewer.q2(false);
                photoViewer.f43287a6 = q22;
                photoViewer.f43329e6 = q22;
                photoViewer.f43309c6 = 0.0f;
                photoViewer.f43318d6 = 0.0f;
                photoViewer.v3(q22);
                photoViewer.f43465u2 = true;
                photoViewer.f43334f0.invalidate();
                uq0 uq0Var = photoViewer.d;
                if (uq0Var == null || !uq0Var.P()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.C1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f43419p1.setVisibility(8);
                    photoViewer.C1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.g3(new gf0(this, 24));
                return;
            case 6:
                photoViewer.f43398m6 = 1.0f;
                Runnable runnable = photoViewer.f43422p4;
                if (runnable != null) {
                    bn bnVar = photoViewer.f43388l4;
                    if (bnVar == null && (tiVar = photoViewer.f43294b2) != null) {
                        org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
                        if (g2Var instanceof bn) {
                            bnVar = (bn) g2Var;
                        }
                    }
                    if (bnVar != null) {
                        bnVar.y8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f43422p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f43424p6 = null;
                photoViewer.f43334f0.invalidate();
                return;
            case 8:
                photoViewer.f43505y3[0].setTag(null);
                return;
            default:
                photoViewer.f43505y3[0].setTag(null);
                return;
        }
    }
}
