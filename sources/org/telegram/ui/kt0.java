package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class kt0 extends AnimatorListenerAdapter {
    public final int f35368a;
    public final PhotoViewer f35369b;

    public kt0(PhotoViewer photoViewer, int i10) {
        this.f35368a = i10;
        this.f35369b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.vi viVar;
        int i10 = this.f35368a;
        PhotoViewer photoViewer = this.f35369b;
        switch (i10) {
            case 0:
                photoViewer.f31054p6 = null;
                org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
                if (ue0Var != null) {
                    if (ue0Var.f28372b.j()) {
                        photoViewer.f30918a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f19273zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f30918a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f30977g6 = 0.0f;
                    photoViewer.f30954e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f31088t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.f3();
                return;
            case 3:
                photoViewer.L1.n0(false);
                cu0 cu0Var = photoViewer.L1;
                cu0Var.f41574u1.setTypeface(pg.s0.e(cu0Var.P1).f41025j);
                cu0Var.Z0.setVisibility(0);
                cu0Var.W0.setVisibility(0);
                cu0Var.X0.setVisibility(0);
                org.telegram.ui.Components.fd0 fd0Var = photoViewer.f31136y4;
                int childCount = fd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    fd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f31054p6 = null;
                photoViewer.f31098u4 = 3;
                ci.j4 j4Var = photoViewer.f1().L;
                if (photoViewer.f31098u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j4Var.b(z10);
                ci.j4 j4Var2 = photoViewer.K1;
                if (j4Var2 != null) {
                    if (photoViewer.f31098u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j4Var2.b(z11);
                }
                photoViewer.f31046o6 = -1;
                float q22 = photoViewer.q2(false);
                photoViewer.f30922a6 = q22;
                photoViewer.f30960e6 = q22;
                photoViewer.f30942c6 = 0.0f;
                photoViewer.f30951d6 = 0.0f;
                photoViewer.v3(q22);
                photoViewer.f31087t2 = true;
                photoViewer.f30954e0.invalidate();
                dv0 dv0Var = photoViewer.d;
                if (dv0Var == null || !dv0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f31041o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new sl0(this, 20));
                return;
            case 6:
                photoViewer.f31027m6 = 1.0f;
                Runnable runnable = photoViewer.f31053p4;
                if (runnable != null) {
                    bo boVar = photoViewer.l4;
                    if (boVar == null && (viVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.o2 o2Var = viVar.f28745f0;
                        if (o2Var instanceof bo) {
                            boVar = (bo) o2Var;
                        }
                    }
                    if (boVar != null) {
                        boVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f31053p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f31054p6 = null;
                photoViewer.f30954e0.invalidate();
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
