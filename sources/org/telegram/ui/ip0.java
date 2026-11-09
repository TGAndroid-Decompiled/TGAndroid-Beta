package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ip0 extends AnimatorListenerAdapter {
    public final int f46740a;
    public final PhotoViewer f46741b;

    public ip0(PhotoViewer photoViewer, int i7) {
        this.f46740a = i7;
        this.f46741b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        boolean z10;
        org.telegram.ui.Components.di diVar;
        int i7 = this.f46740a;
        PhotoViewer photoViewer = this.f46741b;
        switch (i7) {
            case 0:
                photoViewer.f41482o6 = null;
                org.telegram.ui.Components.gd0 gd0Var = photoViewer.C1;
                if (gd0Var != null) {
                    if (gd0Var.f33932b.j()) {
                        org.telegram.ui.ActionBar.s6.s(photoViewer.f41354a1, org.telegram.ui.ActionBar.l6.f28056ng, photoViewer.f41541v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f41354a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f41407f6 = 0.0f;
                    photoViewer.f41391e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f41517s3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.d3();
                return;
            case 3:
                photoViewer.L1.m0(false);
                wp0 wp0Var = photoViewer.L1;
                wp0Var.f55681d1.setTypeface(sg.l0.e(wp0Var.f55715y1).f55144j);
                wp0Var.I0.setVisibility(0);
                wp0Var.F0.setVisibility(0);
                wp0Var.G0.setVisibility(0);
                org.telegram.ui.Components.tb0 tb0Var = photoViewer.f41563x4;
                int childCount = tb0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    tb0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.f41482o6 = null;
                photoViewer.f41526t4 = 3;
                fi.q3 q3Var = photoViewer.a1().L;
                if (photoViewer.f41526t4 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q3Var.b(z9);
                fi.q3 q3Var2 = photoViewer.K1;
                if (q3Var2 != null) {
                    if (photoViewer.f41526t4 != 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q3Var2.b(z10);
                }
                photoViewer.f41474n6 = -1;
                float o22 = photoViewer.o2(false);
                photoViewer.Z5 = o22;
                photoViewer.f41387d6 = o22;
                photoViewer.f41369b6 = 0.0f;
                photoViewer.f41379c6 = 0.0f;
                photoViewer.t3(o22);
                photoViewer.f41524t2 = true;
                photoViewer.f41391e0.invalidate();
                wq0 wq0Var = photoViewer.d;
                if (wq0Var == null || !wq0Var.P()) {
                    photoViewer.Q1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f41478o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new gf0(this, 24));
                return;
            case 6:
                photoViewer.f41457l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    cn cnVar = photoViewer.f41447k4;
                    if (cnVar == null && (diVar = photoViewer.f41355a2) != null) {
                        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                        if (f2Var instanceof cn) {
                            cnVar = (cn) f2Var;
                        }
                    }
                    if (cnVar != null) {
                        cnVar.x8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.o4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f41482o6 = null;
                photoViewer.f41391e0.invalidate();
                return;
            case 8:
                photoViewer.f41562x3[0].setTag(null);
                return;
            default:
                photoViewer.f41562x3[0].setTag(null);
                return;
        }
    }
}
