package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class hp0 extends AnimatorListenerAdapter {
    public final int f48507a;
    public final PhotoViewer f48508b;

    public hp0(PhotoViewer photoViewer, int i7) {
        this.f48507a = i7;
        this.f48508b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ui uiVar;
        int i7 = this.f48507a;
        PhotoViewer photoViewer = this.f48508b;
        switch (i7) {
            case 0:
                photoViewer.f43343p6 = null;
                org.telegram.ui.Components.rd0 rd0Var = photoViewer.D1;
                if (rd0Var != null) {
                    if (rd0Var.f39163b.j()) {
                        org.telegram.ui.ActionBar.t6.s(photoViewer.f43216b1, org.telegram.ui.ActionBar.m6.f29630qg, photoViewer.f43403w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f43216b1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f43268g6 = 0.0f;
                    photoViewer.f43253f0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f43377t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.e3();
                return;
            case 3:
                photoViewer.M1.m0(false);
                vp0 vp0Var = photoViewer.M1;
                vp0Var.f57912e1.setTypeface(sg.k0.e(vp0Var.f57946z1).f57313j);
                vp0Var.J0.setVisibility(0);
                vp0Var.G0.setVisibility(0);
                vp0Var.H0.setVisibility(0);
                org.telegram.ui.Components.ec0 ec0Var = photoViewer.f43425y4;
                int childCount = ec0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    ec0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.f43343p6 = null;
                photoViewer.f43386u4 = 3;
                hi.o3 o3Var = photoViewer.b1().M;
                if (photoViewer.f43386u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o3Var.b(z10);
                hi.o3 o3Var2 = photoViewer.L1;
                if (o3Var2 != null) {
                    if (photoViewer.f43386u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    o3Var2.b(z11);
                }
                photoViewer.f43334o6 = -1;
                float p22 = photoViewer.p2(false);
                photoViewer.f43211a6 = p22;
                photoViewer.f43249e6 = p22;
                photoViewer.f43231c6 = 0.0f;
                photoViewer.f43239d6 = 0.0f;
                photoViewer.u3(p22);
                photoViewer.f43384u2 = true;
                photoViewer.f43253f0.invalidate();
                uq0 uq0Var = photoViewer.d;
                if (uq0Var == null || !uq0Var.P()) {
                    photoViewer.Q1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.C1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f43338p1.setVisibility(8);
                    photoViewer.C1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.g3(new hf0(this, 24));
                return;
            case 6:
                photoViewer.f43317m6 = 1.0f;
                Runnable runnable = photoViewer.f43341p4;
                if (runnable != null) {
                    bn bnVar = photoViewer.f43307l4;
                    if (bnVar == null && (uiVar = photoViewer.f43217b2) != null) {
                        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40367a2;
                        if (g2Var instanceof bn) {
                            bnVar = (bn) g2Var;
                        }
                    }
                    if (bnVar != null) {
                        bnVar.y8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f43341p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f43343p6 = null;
                photoViewer.f43253f0.invalidate();
                return;
            case 8:
                photoViewer.f43424y3[0].setTag(null);
                return;
            default:
                photoViewer.f43424y3[0].setTag(null);
                return;
        }
    }
}
