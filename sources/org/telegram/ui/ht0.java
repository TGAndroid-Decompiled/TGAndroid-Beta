package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ht0 extends AnimatorListenerAdapter {
    public final int f38504a;
    public final PhotoViewer f38505b;

    public ht0(PhotoViewer photoViewer, int i10) {
        this.f38504a = i10;
        this.f38505b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.yi yiVar;
        int i10 = this.f38504a;
        PhotoViewer photoViewer = this.f38505b;
        switch (i10) {
            case 0:
                photoViewer.f34032p6 = null;
                org.telegram.ui.Components.xf0 xf0Var = photoViewer.C1;
                if (xf0Var != null) {
                    if (xf0Var.f32884b.j()) {
                        photoViewer.f33895a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f21198zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f33895a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f33955g6 = 0.0f;
                    photoViewer.f33932e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f34066t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.L1.o0(false);
                au0 au0Var = photoViewer.L1;
                au0Var.f46487u1.setTypeface(pg.u0.e(au0Var.P1).f45841j);
                au0Var.Z0.setVisibility(0);
                au0Var.W0.setVisibility(0);
                au0Var.X0.setVisibility(0);
                org.telegram.ui.Components.ie0 ie0Var = photoViewer.f34114y4;
                int childCount = ie0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ie0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f34032p6 = null;
                photoViewer.f34076u4 = 3;
                ci.h4 h4Var = photoViewer.f1().L;
                if (photoViewer.f34076u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.b(z10);
                ci.h4 h4Var2 = photoViewer.K1;
                if (h4Var2 != null) {
                    if (photoViewer.f34076u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h4Var2.b(z11);
                }
                photoViewer.f34024o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.f33899a6 = r22;
                photoViewer.f33938e6 = r22;
                photoViewer.f33919c6 = 0.0f;
                photoViewer.f33928d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f34065t2 = true;
                photoViewer.f33932e0.invalidate();
                bv0 bv0Var = photoViewer.d;
                if (bv0Var == null || !bv0Var.O()) {
                    photoViewer.S1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f34019o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new sk0(this, 21));
                return;
            case 6:
                photoViewer.f34005m6 = 1.0f;
                Runnable runnable = photoViewer.f34031p4;
                if (runnable != null) {
                    zn znVar = photoViewer.l4;
                    if (znVar == null && (yiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33216f0;
                        if (m2Var instanceof zn) {
                            znVar = (zn) m2Var;
                        }
                    }
                    if (znVar != null) {
                        znVar.k8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f34031p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f34032p6 = null;
                photoViewer.f33932e0.invalidate();
                return;
            case 8:
                photoViewer.y3[0].setTag(null);
                return;
            default:
                photoViewer.y3[0].setTag(null);
                return;
        }
    }
}
