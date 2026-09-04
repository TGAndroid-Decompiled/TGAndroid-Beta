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
    public final int f37107a;
    public final PhotoViewer f37108b;

    public ht0(PhotoViewer photoViewer, int i10) {
        this.f37107a = i10;
        this.f37108b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.vi viVar;
        int i10 = this.f37107a;
        PhotoViewer photoViewer = this.f37108b;
        switch (i10) {
            case 0:
                photoViewer.f33649p6 = null;
                org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
                if (ue0Var != null) {
                    if (ue0Var.f30869b.j()) {
                        photoViewer.f33512a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f21070zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f33512a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f33572g6 = 0.0f;
                    photoViewer.f33549e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f33683t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.L1.n0(false);
                zt0 zt0Var = photoViewer.L1;
                zt0Var.f45370u1.setTypeface(qg.s0.e(zt0Var.P1).f44573j);
                zt0Var.Z0.setVisibility(0);
                zt0Var.W0.setVisibility(0);
                zt0Var.X0.setVisibility(0);
                org.telegram.ui.Components.gd0 gd0Var = photoViewer.f33731y4;
                int childCount = gd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    gd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f33649p6 = null;
                photoViewer.f33693u4 = 3;
                di.j4 j4Var = photoViewer.f1().L;
                if (photoViewer.f33693u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j4Var.b(z10);
                di.j4 j4Var2 = photoViewer.K1;
                if (j4Var2 != null) {
                    if (photoViewer.f33693u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j4Var2.b(z11);
                }
                photoViewer.f33641o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.f33516a6 = r22;
                photoViewer.f33555e6 = r22;
                photoViewer.f33536c6 = 0.0f;
                photoViewer.f33545d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f33682t2 = true;
                photoViewer.f33549e0.invalidate();
                av0 av0Var = photoViewer.d;
                if (av0Var == null || !av0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f33636o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new rl0(this, 20));
                return;
            case 6:
                photoViewer.f33622m6 = 1.0f;
                Runnable runnable = photoViewer.f33648p4;
                if (runnable != null) {
                    co coVar = photoViewer.l4;
                    if (coVar == null && (viVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31279f0;
                        if (n2Var instanceof co) {
                            coVar = (co) n2Var;
                        }
                    }
                    if (coVar != null) {
                        coVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f33648p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f33649p6 = null;
                photoViewer.f33549e0.invalidate();
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
