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
    public final int f38752a;
    public final PhotoViewer f38753b;

    public it0(PhotoViewer photoViewer, int i10) {
        this.f38752a = i10;
        this.f38753b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.yi yiVar;
        int i10 = this.f38752a;
        PhotoViewer photoViewer = this.f38753b;
        switch (i10) {
            case 0:
                photoViewer.f34004p6 = null;
                org.telegram.ui.Components.vf0 vf0Var = photoViewer.C1;
                if (vf0Var != null) {
                    if (vf0Var.f31768b.j()) {
                        photoViewer.f33867a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f21208zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f33867a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f33927g6 = 0.0f;
                    photoViewer.f33904e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f34038t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.L1.o0(false);
                bu0 bu0Var = photoViewer.L1;
                bu0Var.f46390u1.setTypeface(pg.u0.e(bu0Var.P1).f45805j);
                bu0Var.Z0.setVisibility(0);
                bu0Var.W0.setVisibility(0);
                bu0Var.X0.setVisibility(0);
                org.telegram.ui.Components.he0 he0Var = photoViewer.f34086y4;
                int childCount = he0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    he0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f34004p6 = null;
                photoViewer.f34048u4 = 3;
                ci.h4 h4Var = photoViewer.f1().L;
                if (photoViewer.f34048u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.b(z10);
                ci.h4 h4Var2 = photoViewer.K1;
                if (h4Var2 != null) {
                    if (photoViewer.f34048u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h4Var2.b(z11);
                }
                photoViewer.f33996o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.f33871a6 = r22;
                photoViewer.f33910e6 = r22;
                photoViewer.f33891c6 = 0.0f;
                photoViewer.f33900d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f34037t2 = true;
                photoViewer.f33904e0.invalidate();
                cv0 cv0Var = photoViewer.d;
                if (cv0Var == null || !cv0Var.O()) {
                    photoViewer.S1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f33991o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new tk0(this, 21));
                return;
            case 6:
                photoViewer.f33977m6 = 1.0f;
                Runnable runnable = photoViewer.f34003p4;
                if (runnable != null) {
                    zn znVar = photoViewer.l4;
                    if (znVar == null && (yiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33228f0;
                        if (n2Var instanceof zn) {
                            znVar = (zn) n2Var;
                        }
                    }
                    if (znVar != null) {
                        znVar.k8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f34003p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f34004p6 = null;
                photoViewer.f33904e0.invalidate();
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
