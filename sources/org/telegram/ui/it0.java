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
    public final int f34681a;
    public final PhotoViewer f34682b;

    public it0(PhotoViewer photoViewer, int i10) {
        this.f34681a = i10;
        this.f34682b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.vi viVar;
        int i10 = this.f34681a;
        PhotoViewer photoViewer = this.f34682b;
        switch (i10) {
            case 0:
                photoViewer.f31321p6 = null;
                org.telegram.ui.Components.cf0 cf0Var = photoViewer.C1;
                if (cf0Var != null) {
                    if (cf0Var.f23278b.j()) {
                        photoViewer.f31185a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f19505zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f31185a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f31244g6 = 0.0f;
                    photoViewer.f31221e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f31355t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.f3();
                return;
            case 3:
                photoViewer.L1.n0(false);
                au0 au0Var = photoViewer.L1;
                au0Var.f41816u1.setTypeface(pg.u0.e(au0Var.P1).f41309j);
                au0Var.Z0.setVisibility(0);
                au0Var.W0.setVisibility(0);
                au0Var.X0.setVisibility(0);
                org.telegram.ui.Components.od0 od0Var = photoViewer.f31403y4;
                int childCount = od0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    od0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f31321p6 = null;
                photoViewer.f31365u4 = 3;
                ci.j4 j4Var = photoViewer.f1().L;
                if (photoViewer.f31365u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j4Var.b(z10);
                ci.j4 j4Var2 = photoViewer.K1;
                if (j4Var2 != null) {
                    if (photoViewer.f31365u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j4Var2.b(z11);
                }
                photoViewer.f31313o6 = -1;
                float q22 = photoViewer.q2(false);
                photoViewer.f31189a6 = q22;
                photoViewer.f31227e6 = q22;
                photoViewer.f31209c6 = 0.0f;
                photoViewer.f31218d6 = 0.0f;
                photoViewer.v3(q22);
                photoViewer.f31354t2 = true;
                photoViewer.f31221e0.invalidate();
                bv0 bv0Var = photoViewer.d;
                if (bv0Var == null || !bv0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f31308o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new sl0(this, 20));
                return;
            case 6:
                photoViewer.f31294m6 = 1.0f;
                Runnable runnable = photoViewer.f31320p4;
                if (runnable != null) {
                    zn znVar = photoViewer.l4;
                    if (znVar == null && (viVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = viVar.f29098f0;
                        if (n2Var instanceof zn) {
                            znVar = (zn) n2Var;
                        }
                    }
                    if (znVar != null) {
                        znVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f31320p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f31321p6 = null;
                photoViewer.f31221e0.invalidate();
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
