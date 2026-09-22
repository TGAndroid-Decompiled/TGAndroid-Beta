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
    public final int f34706a;
    public final PhotoViewer f34707b;

    public it0(PhotoViewer photoViewer, int i10) {
        this.f34706a = i10;
        this.f34707b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.vi viVar;
        int i10 = this.f34706a;
        PhotoViewer photoViewer = this.f34707b;
        switch (i10) {
            case 0:
                photoViewer.f31342p6 = null;
                org.telegram.ui.Components.ff0 ff0Var = photoViewer.C1;
                if (ff0Var != null) {
                    if (ff0Var.f24217b.j()) {
                        photoViewer.f31206a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f19520zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f31206a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f31265g6 = 0.0f;
                    photoViewer.f31242e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f31376t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.f3();
                return;
            case 3:
                photoViewer.L1.n0(false);
                au0 au0Var = photoViewer.L1;
                au0Var.f41837u1.setTypeface(pg.u0.e(au0Var.P1).f41329j);
                au0Var.Z0.setVisibility(0);
                au0Var.W0.setVisibility(0);
                au0Var.X0.setVisibility(0);
                org.telegram.ui.Components.rd0 rd0Var = photoViewer.f31424y4;
                int childCount = rd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    rd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f31342p6 = null;
                photoViewer.f31386u4 = 3;
                ci.j4 j4Var = photoViewer.f1().L;
                if (photoViewer.f31386u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j4Var.b(z10);
                ci.j4 j4Var2 = photoViewer.K1;
                if (j4Var2 != null) {
                    if (photoViewer.f31386u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j4Var2.b(z11);
                }
                photoViewer.f31334o6 = -1;
                float q22 = photoViewer.q2(false);
                photoViewer.f31210a6 = q22;
                photoViewer.f31248e6 = q22;
                photoViewer.f31230c6 = 0.0f;
                photoViewer.f31239d6 = 0.0f;
                photoViewer.v3(q22);
                photoViewer.f31375t2 = true;
                photoViewer.f31242e0.invalidate();
                bv0 bv0Var = photoViewer.d;
                if (bv0Var == null || !bv0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f31329o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new sl0(this, 20));
                return;
            case 6:
                photoViewer.f31315m6 = 1.0f;
                Runnable runnable = photoViewer.f31341p4;
                if (runnable != null) {
                    zn znVar = photoViewer.l4;
                    if (znVar == null && (viVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = viVar.f29096f0;
                        if (n2Var instanceof zn) {
                            znVar = (zn) n2Var;
                        }
                    }
                    if (znVar != null) {
                        znVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f31341p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f31342p6 = null;
                photoViewer.f31242e0.invalidate();
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
