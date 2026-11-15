package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ep0 extends AnimatorListenerAdapter {
    public final int f46876a;
    public final PhotoViewer f46877b;

    public ep0(PhotoViewer photoViewer, int i7) {
        this.f46876a = i7;
        this.f46877b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ki kiVar;
        int i7 = this.f46876a;
        PhotoViewer photoViewer = this.f46877b;
        switch (i7) {
            case 0:
                photoViewer.f42853p6 = null;
                org.telegram.ui.Components.gd0 gd0Var = photoViewer.D1;
                if (gd0Var != null) {
                    if (gd0Var.f34907b.j()) {
                        org.telegram.ui.ActionBar.q6.s(photoViewer.f42726b1, org.telegram.ui.ActionBar.j6.f29098qg, photoViewer.f42913w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f42726b1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f42778g6 = 0.0f;
                    photoViewer.f42763f0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f42887t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.e3();
                return;
            case 3:
                photoViewer.M1.m0(false);
                tp0 tp0Var = photoViewer.M1;
                tp0Var.f57282e1.setTypeface(sg.k0.e(tp0Var.f57316z1).f56694j);
                tp0Var.J0.setVisibility(0);
                tp0Var.G0.setVisibility(0);
                tp0Var.H0.setVisibility(0);
                org.telegram.ui.Components.tb0 tb0Var = photoViewer.f42935y4;
                int childCount = tb0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    tb0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.f42853p6 = null;
                photoViewer.f42896u4 = 3;
                hi.p3 p3Var = photoViewer.b1().M;
                if (photoViewer.f42896u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p3Var.b(z10);
                hi.p3 p3Var2 = photoViewer.L1;
                if (p3Var2 != null) {
                    if (photoViewer.f42896u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p3Var2.b(z11);
                }
                photoViewer.f42844o6 = -1;
                float p22 = photoViewer.p2(false);
                photoViewer.f42721a6 = p22;
                photoViewer.f42759e6 = p22;
                photoViewer.f42741c6 = 0.0f;
                photoViewer.f42749d6 = 0.0f;
                photoViewer.u3(p22);
                photoViewer.f42894u2 = true;
                photoViewer.f42763f0.invalidate();
                sq0 sq0Var = photoViewer.d;
                if (sq0Var == null || !sq0Var.P()) {
                    photoViewer.Q1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.C1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f42848p1.setVisibility(8);
                    photoViewer.C1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new ef0(this, 24));
                return;
            case 6:
                photoViewer.f42827m6 = 1.0f;
                Runnable runnable = photoViewer.f42851p4;
                if (runnable != null) {
                    an anVar = photoViewer.f42817l4;
                    if (anVar == null && (kiVar = photoViewer.f42727b2) != null) {
                        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
                        if (e2Var instanceof an) {
                            anVar = (an) e2Var;
                        }
                    }
                    if (anVar != null) {
                        anVar.y8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f42851p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f42853p6 = null;
                photoViewer.f42763f0.invalidate();
                return;
            case 8:
                photoViewer.f42934y3[0].setTag(null);
                return;
            default:
                photoViewer.f42934y3[0].setTag(null);
                return;
        }
    }
}
