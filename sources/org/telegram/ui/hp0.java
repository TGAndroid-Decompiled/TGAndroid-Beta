package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class hp0 extends AnimatorListenerAdapter {
    public final int f48504a;
    public final PhotoViewer f48505b;

    public hp0(PhotoViewer photoViewer, int i7) {
        this.f48504a = i7;
        this.f48505b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.si siVar;
        int i7 = this.f48504a;
        PhotoViewer photoViewer = this.f48505b;
        switch (i7) {
            case 0:
                photoViewer.f43298p6 = null;
                org.telegram.ui.Components.qd0 qd0Var = photoViewer.D1;
                if (qd0Var != null) {
                    if (qd0Var.f38763b.j()) {
                        org.telegram.ui.ActionBar.u6.s(photoViewer.f43171b1, org.telegram.ui.ActionBar.n6.f29645qg, photoViewer.f43358w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f43171b1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f43223g6 = 0.0f;
                    photoViewer.f43208f0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f43332t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.e3();
                return;
            case 3:
                photoViewer.M1.m0(false);
                vp0 vp0Var = photoViewer.M1;
                vp0Var.f57854e1.setTypeface(sg.k0.e(vp0Var.f57888z1).f57268j);
                vp0Var.J0.setVisibility(0);
                vp0Var.G0.setVisibility(0);
                vp0Var.H0.setVisibility(0);
                org.telegram.ui.Components.dc0 dc0Var = photoViewer.f43380y4;
                int childCount = dc0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    dc0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.f43298p6 = null;
                photoViewer.f43341u4 = 3;
                hi.p3 p3Var = photoViewer.b1().M;
                if (photoViewer.f43341u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p3Var.b(z10);
                hi.p3 p3Var2 = photoViewer.L1;
                if (p3Var2 != null) {
                    if (photoViewer.f43341u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p3Var2.b(z11);
                }
                photoViewer.f43289o6 = -1;
                float p22 = photoViewer.p2(false);
                photoViewer.f43166a6 = p22;
                photoViewer.f43204e6 = p22;
                photoViewer.f43186c6 = 0.0f;
                photoViewer.f43194d6 = 0.0f;
                photoViewer.u3(p22);
                photoViewer.f43339u2 = true;
                photoViewer.f43208f0.invalidate();
                uq0 uq0Var = photoViewer.d;
                if (uq0Var == null || !uq0Var.P()) {
                    photoViewer.Q1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.C1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f43293p1.setVisibility(8);
                    photoViewer.C1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.g3(new hf0(this, 24));
                return;
            case 6:
                photoViewer.f43272m6 = 1.0f;
                Runnable runnable = photoViewer.f43296p4;
                if (runnable != null) {
                    bn bnVar = photoViewer.f43262l4;
                    if (bnVar == null && (siVar = photoViewer.f43172b2) != null) {
                        org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
                        if (h2Var instanceof bn) {
                            bnVar = (bn) h2Var;
                        }
                    }
                    if (bnVar != null) {
                        bnVar.y8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f43296p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f43298p6 = null;
                photoViewer.f43208f0.invalidate();
                return;
            case 8:
                photoViewer.f43379y3[0].setTag(null);
                return;
            default:
                photoViewer.f43379y3[0].setTag(null);
                return;
        }
    }
}
