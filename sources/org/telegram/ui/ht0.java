package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ht0 extends AnimatorListenerAdapter {
    public final int f33458a;
    public final PhotoViewer f33459b;

    public ht0(PhotoViewer photoViewer, int i10) {
        this.f33458a = i10;
        this.f33459b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.yi yiVar;
        int i10 = this.f33458a;
        PhotoViewer photoViewer = this.f33459b;
        switch (i10) {
            case 0:
                photoViewer.f30149p6 = null;
                org.telegram.ui.Components.df0 df0Var = photoViewer.C1;
                if (df0Var != null) {
                    if (df0Var.f22405b.j()) {
                        photoViewer.f30013a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f18334zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f30013a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f30072g6 = 0.0f;
                    photoViewer.f30049e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f30183t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.L1.n0(false);
                zt0 zt0Var = photoViewer.L1;
                zt0Var.f40155u1.setTypeface(og.x0.e(zt0Var.P1).f14558j);
                zt0Var.Z0.setVisibility(0);
                zt0Var.W0.setVisibility(0);
                zt0Var.X0.setVisibility(0);
                org.telegram.ui.Components.pd0 pd0Var = photoViewer.f30231y4;
                int childCount = pd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    pd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f30149p6 = null;
                photoViewer.f30193u4 = 3;
                bi.b5 b5Var = photoViewer.f1().L;
                if (photoViewer.f30193u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b5Var.b(z10);
                bi.b5 b5Var2 = photoViewer.K1;
                if (b5Var2 != null) {
                    if (photoViewer.f30193u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b5Var2.b(z11);
                }
                photoViewer.f30141o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.f30017a6 = r22;
                photoViewer.f30055e6 = r22;
                photoViewer.f30037c6 = 0.0f;
                photoViewer.f30046d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f30182t2 = true;
                photoViewer.f30049e0.invalidate();
                cv0 cv0Var = photoViewer.d;
                if (cv0Var == null || !cv0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f30136o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ql0(this, 20));
                return;
            case 6:
                photoViewer.f30122m6 = 1.0f;
                Runnable runnable = photoViewer.f30148p4;
                if (runnable != null) {
                    eo eoVar = photoViewer.l4;
                    if (eoVar == null && (yiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
                        if (p2Var instanceof eo) {
                            eoVar = (eo) p2Var;
                        }
                    }
                    if (eoVar != null) {
                        eoVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f30148p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f30149p6 = null;
                photoViewer.f30049e0.invalidate();
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
