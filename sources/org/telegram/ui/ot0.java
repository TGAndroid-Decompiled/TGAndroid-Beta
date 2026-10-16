package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ot0 extends AnimatorListenerAdapter {
    public final int f38747a;
    public final PhotoViewer f38748b;

    public ot0(PhotoViewer photoViewer, int i10) {
        this.f38747a = i10;
        this.f38748b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.vi viVar;
        int i10 = this.f38747a;
        PhotoViewer photoViewer = this.f38748b;
        switch (i10) {
            case 0:
                photoViewer.f32029p6 = null;
                org.telegram.ui.Components.uf0 uf0Var = photoViewer.C1;
                if (uf0Var != null) {
                    if (uf0Var.f29367b.j()) {
                        photoViewer.f31892a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.f20013zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f31892a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f31951g6 = 0.0f;
                    photoViewer.f31928e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f32063t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.L1.o0(false);
                gu0 gu0Var = photoViewer.L1;
                gu0Var.f44191u1.setTypeface(qg.s0.e(gu0Var.P1).f43313j);
                gu0Var.Z0.setVisibility(0);
                gu0Var.W0.setVisibility(0);
                gu0Var.X0.setVisibility(0);
                org.telegram.ui.Components.fe0 fe0Var = photoViewer.f32111y4;
                int childCount = fe0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    fe0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f32029p6 = null;
                photoViewer.f32073u4 = 3;
                di.h4 h4Var = photoViewer.f1().L;
                if (photoViewer.f32073u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.b(z10);
                di.h4 h4Var2 = photoViewer.K1;
                if (h4Var2 != null) {
                    if (photoViewer.f32073u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h4Var2.b(z11);
                }
                photoViewer.f32021o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.f31896a6 = r22;
                photoViewer.f31934e6 = r22;
                photoViewer.f31916c6 = 0.0f;
                photoViewer.f31925d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f32062t2 = true;
                photoViewer.f31928e0.invalidate();
                hv0 hv0Var = photoViewer.d;
                if (hv0Var == null || !hv0Var.P()) {
                    photoViewer.S1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f32016o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new xk0(this, 21));
                return;
            case 6:
                photoViewer.f32002m6 = 1.0f;
                Runnable runnable = photoViewer.f32028p4;
                if (runnable != null) {
                    fo foVar = photoViewer.l4;
                    if (foVar == null && (viVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
                        if (m2Var instanceof fo) {
                            foVar = (fo) m2Var;
                        }
                    }
                    if (foVar != null) {
                        foVar.k8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f32028p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f32029p6 = null;
                photoViewer.f31928e0.invalidate();
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
