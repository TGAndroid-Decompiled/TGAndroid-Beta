package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class at0 extends AnimatorListenerAdapter {
    public final int f32232a;
    public final PhotoViewer f32233b;

    public at0(PhotoViewer photoViewer, int i10) {
        this.f32232a = i10;
        this.f32233b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.wi wiVar;
        int i10 = this.f32232a;
        PhotoViewer photoViewer = this.f32233b;
        switch (i10) {
            case 0:
                photoViewer.f31323p6 = null;
                org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
                if (ef0Var != null) {
                    if (ef0Var.f23947b.j()) {
                        photoViewer.f31187a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f19470zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f31187a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f31246g6 = 0.0f;
                    photoViewer.f31223e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f31357t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.f3();
                return;
            case 3:
                photoViewer.L1.o0(false);
                st0 st0Var = photoViewer.L1;
                st0Var.f41802u1.setTypeface(pg.u0.e(st0Var.P1).f41280j);
                st0Var.Z0.setVisibility(0);
                st0Var.W0.setVisibility(0);
                st0Var.X0.setVisibility(0);
                org.telegram.ui.Components.qd0 qd0Var = photoViewer.f31405y4;
                int childCount = qd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    qd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f31323p6 = null;
                photoViewer.f31367u4 = 3;
                ci.i4 i4Var = photoViewer.f1().L;
                if (photoViewer.f31367u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i4Var.b(z10);
                ci.i4 i4Var2 = photoViewer.K1;
                if (i4Var2 != null) {
                    if (photoViewer.f31367u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i4Var2.b(z11);
                }
                photoViewer.f31315o6 = -1;
                float q22 = photoViewer.q2(false);
                photoViewer.f31191a6 = q22;
                photoViewer.f31229e6 = q22;
                photoViewer.f31211c6 = 0.0f;
                photoViewer.f31220d6 = 0.0f;
                photoViewer.v3(q22);
                photoViewer.f31356t2 = true;
                photoViewer.f31223e0.invalidate();
                tu0 tu0Var = photoViewer.d;
                if (tu0Var == null || !tu0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f31310o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new il0(this, 20));
                return;
            case 6:
                photoViewer.f31296m6 = 1.0f;
                Runnable runnable = photoViewer.f31322p4;
                if (runnable != null) {
                    wn wnVar = photoViewer.l4;
                    if (wnVar == null && (wiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
                        if (m2Var instanceof wn) {
                            wnVar = (wn) m2Var;
                        }
                    }
                    if (wnVar != null) {
                        wnVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f31322p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f31323p6 = null;
                photoViewer.f31223e0.invalidate();
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
