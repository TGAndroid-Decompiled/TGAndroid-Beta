package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class it0 extends AnimatorListenerAdapter {
    public final int f34720a;
    public final PhotoViewer f34721b;

    public it0(PhotoViewer photoViewer, int i10) {
        this.f34720a = i10;
        this.f34721b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.vi viVar;
        int i10 = this.f34720a;
        PhotoViewer photoViewer = this.f34721b;
        switch (i10) {
            case 0:
                photoViewer.f31034p6 = null;
                org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
                if (ue0Var != null) {
                    if (ue0Var.f28379b.j()) {
                        photoViewer.f30898a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f19243zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f30898a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f30957g6 = 0.0f;
                    photoViewer.f30934e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f31068t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.f3();
                return;
            case 3:
                photoViewer.L1.o0(false);
                au0 au0Var = photoViewer.L1;
                au0Var.f41543u1.setTypeface(pg.s0.e(au0Var.P1).f40994j);
                au0Var.Z0.setVisibility(0);
                au0Var.W0.setVisibility(0);
                au0Var.X0.setVisibility(0);
                org.telegram.ui.Components.fd0 fd0Var = photoViewer.f31116y4;
                int childCount = fd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    fd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f31034p6 = null;
                photoViewer.f31078u4 = 3;
                ci.j4 j4Var = photoViewer.f1().L;
                if (photoViewer.f31078u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j4Var.b(z10);
                ci.j4 j4Var2 = photoViewer.K1;
                if (j4Var2 != null) {
                    if (photoViewer.f31078u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j4Var2.b(z11);
                }
                photoViewer.f31026o6 = -1;
                float q22 = photoViewer.q2(false);
                photoViewer.f30902a6 = q22;
                photoViewer.f30940e6 = q22;
                photoViewer.f30922c6 = 0.0f;
                photoViewer.f30931d6 = 0.0f;
                photoViewer.v3(q22);
                photoViewer.f31067t2 = true;
                photoViewer.f30934e0.invalidate();
                bv0 bv0Var = photoViewer.d;
                if (bv0Var == null || !bv0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f31021o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new pl0(this, 20));
                return;
            case 6:
                photoViewer.f31007m6 = 1.0f;
                Runnable runnable = photoViewer.f31033p4;
                if (runnable != null) {
                    bo boVar = photoViewer.l4;
                    if (boVar == null && (viVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = viVar.f28747f0;
                        if (n2Var instanceof bo) {
                            boVar = (bo) n2Var;
                        }
                    }
                    if (boVar != null) {
                        boVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f31033p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f31034p6 = null;
                photoViewer.f30934e0.invalidate();
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
