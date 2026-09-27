package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class dt0 extends AnimatorListenerAdapter {
    public final int f33032a;
    public final PhotoViewer f33033b;

    public dt0(PhotoViewer photoViewer, int i10) {
        this.f33032a = i10;
        this.f33033b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.wi wiVar;
        int i10 = this.f33032a;
        PhotoViewer photoViewer = this.f33033b;
        switch (i10) {
            case 0:
                photoViewer.f31325p6 = null;
                org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
                if (ef0Var != null) {
                    if (ef0Var.f24054b.j()) {
                        photoViewer.f31189a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f19470zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f31189a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f31248g6 = 0.0f;
                    photoViewer.f31225e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f31359t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.f3();
                return;
            case 3:
                photoViewer.L1.n0(false);
                vt0 vt0Var = photoViewer.L1;
                vt0Var.f41827u1.setTypeface(pg.u0.e(vt0Var.P1).f41278j);
                vt0Var.Z0.setVisibility(0);
                vt0Var.W0.setVisibility(0);
                vt0Var.X0.setVisibility(0);
                org.telegram.ui.Components.qd0 qd0Var = photoViewer.f31407y4;
                int childCount = qd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    qd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f31325p6 = null;
                photoViewer.f31369u4 = 3;
                ci.i4 i4Var = photoViewer.f1().L;
                if (photoViewer.f31369u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i4Var.b(z10);
                ci.i4 i4Var2 = photoViewer.K1;
                if (i4Var2 != null) {
                    if (photoViewer.f31369u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i4Var2.b(z11);
                }
                photoViewer.f31317o6 = -1;
                float q22 = photoViewer.q2(false);
                photoViewer.f31193a6 = q22;
                photoViewer.f31231e6 = q22;
                photoViewer.f31213c6 = 0.0f;
                photoViewer.f31222d6 = 0.0f;
                photoViewer.v3(q22);
                photoViewer.f31358t2 = true;
                photoViewer.f31225e0.invalidate();
                wu0 wu0Var = photoViewer.d;
                if (wu0Var == null || !wu0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f31312o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ml0(this, 20));
                return;
            case 6:
                photoViewer.f31298m6 = 1.0f;
                Runnable runnable = photoViewer.f31324p4;
                if (runnable != null) {
                    xn xnVar = photoViewer.l4;
                    if (xnVar == null && (wiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
                        if (o2Var instanceof xn) {
                            xnVar = (xn) o2Var;
                        }
                    }
                    if (xnVar != null) {
                        xnVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f31324p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f31325p6 = null;
                photoViewer.f31225e0.invalidate();
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
