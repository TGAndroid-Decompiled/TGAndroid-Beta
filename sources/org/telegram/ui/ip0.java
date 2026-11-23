package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ip0 extends AnimatorListenerAdapter {
    public final int f48814a;
    public final PhotoViewer f48815b;

    public ip0(PhotoViewer photoViewer, int i7) {
        this.f48814a = i7;
        this.f48815b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ui uiVar;
        int i7 = this.f48814a;
        PhotoViewer photoViewer = this.f48815b;
        switch (i7) {
            case 0:
                photoViewer.f43308p6 = null;
                org.telegram.ui.Components.rd0 rd0Var = photoViewer.D1;
                if (rd0Var != null) {
                    if (rd0Var.f39118b.j()) {
                        org.telegram.ui.ActionBar.t6.s(photoViewer.f43181b1, org.telegram.ui.ActionBar.m6.f29596qg, photoViewer.f43368w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f43181b1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f43233g6 = 0.0f;
                    photoViewer.f43218f0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f43342t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.e3();
                return;
            case 3:
                photoViewer.M1.m0(false);
                wp0 wp0Var = photoViewer.M1;
                wp0Var.f57877e1.setTypeface(sg.k0.e(wp0Var.f57911z1).f57278j);
                wp0Var.J0.setVisibility(0);
                wp0Var.G0.setVisibility(0);
                wp0Var.H0.setVisibility(0);
                org.telegram.ui.Components.ec0 ec0Var = photoViewer.f43390y4;
                int childCount = ec0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    ec0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.f43308p6 = null;
                photoViewer.f43351u4 = 3;
                hi.o3 o3Var = photoViewer.b1().M;
                if (photoViewer.f43351u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o3Var.b(z10);
                hi.o3 o3Var2 = photoViewer.L1;
                if (o3Var2 != null) {
                    if (photoViewer.f43351u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    o3Var2.b(z11);
                }
                photoViewer.f43299o6 = -1;
                float p22 = photoViewer.p2(false);
                photoViewer.f43176a6 = p22;
                photoViewer.f43214e6 = p22;
                photoViewer.f43196c6 = 0.0f;
                photoViewer.f43204d6 = 0.0f;
                photoViewer.u3(p22);
                photoViewer.f43349u2 = true;
                photoViewer.f43218f0.invalidate();
                vq0 vq0Var = photoViewer.d;
                if (vq0Var == null || !vq0Var.P()) {
                    photoViewer.Q1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.C1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f43303p1.setVisibility(8);
                    photoViewer.C1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.g3(new hf0(this, 24));
                return;
            case 6:
                photoViewer.f43282m6 = 1.0f;
                Runnable runnable = photoViewer.f43306p4;
                if (runnable != null) {
                    bn bnVar = photoViewer.f43272l4;
                    if (bnVar == null && (uiVar = photoViewer.f43182b2) != null) {
                        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40352a2;
                        if (g2Var instanceof bn) {
                            bnVar = (bn) g2Var;
                        }
                    }
                    if (bnVar != null) {
                        bnVar.y8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f43306p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f43308p6 = null;
                photoViewer.f43218f0.invalidate();
                return;
            case 8:
                photoViewer.f43389y3[0].setTag(null);
                return;
            default:
                photoViewer.f43389y3[0].setTag(null);
                return;
        }
    }
}
