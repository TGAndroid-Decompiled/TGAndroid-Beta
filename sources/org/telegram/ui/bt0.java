package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class bt0 extends AnimatorListenerAdapter {
    public final int f32176a;
    public final PhotoViewer f32177b;

    public bt0(PhotoViewer photoViewer, int i10) {
        this.f32176a = i10;
        this.f32177b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.wi wiVar;
        int i10 = this.f32176a;
        PhotoViewer photoViewer = this.f32177b;
        switch (i10) {
            case 0:
                photoViewer.f31008p6 = null;
                org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
                if (ue0Var != null) {
                    if (ue0Var.f28468b.j()) {
                        photoViewer.f30872a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f19198zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f30872a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f30931g6 = 0.0f;
                    photoViewer.f30908e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f31042t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.f3();
                return;
            case 3:
                photoViewer.L1.o0(false);
                tt0 tt0Var = photoViewer.L1;
                tt0Var.f41499u1.setTypeface(pg.t0.e(tt0Var.P1).f40958j);
                tt0Var.Z0.setVisibility(0);
                tt0Var.W0.setVisibility(0);
                tt0Var.X0.setVisibility(0);
                org.telegram.ui.Components.fd0 fd0Var = photoViewer.f31090y4;
                int childCount = fd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    fd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f31008p6 = null;
                photoViewer.f31052u4 = 3;
                ci.i4 i4Var = photoViewer.f1().L;
                if (photoViewer.f31052u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i4Var.b(z10);
                ci.i4 i4Var2 = photoViewer.K1;
                if (i4Var2 != null) {
                    if (photoViewer.f31052u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i4Var2.b(z11);
                }
                photoViewer.f31000o6 = -1;
                float q22 = photoViewer.q2(false);
                photoViewer.f30876a6 = q22;
                photoViewer.f30914e6 = q22;
                photoViewer.f30896c6 = 0.0f;
                photoViewer.f30905d6 = 0.0f;
                photoViewer.v3(q22);
                photoViewer.f31041t2 = true;
                photoViewer.f30908e0.invalidate();
                uu0 uu0Var = photoViewer.d;
                if (uu0Var == null || !uu0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f30995o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new jl0(this, 20));
                return;
            case 6:
                photoViewer.f30981m6 = 1.0f;
                Runnable runnable = photoViewer.f31007p4;
                if (runnable != null) {
                    xn xnVar = photoViewer.l4;
                    if (xnVar == null && (wiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
                        if (n2Var instanceof xn) {
                            xnVar = (xn) n2Var;
                        }
                    }
                    if (xnVar != null) {
                        xnVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f31007p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f31008p6 = null;
                photoViewer.f30908e0.invalidate();
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
