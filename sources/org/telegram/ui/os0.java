package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class os0 extends AnimatorListenerAdapter {
    public final int f39976a;
    public final PhotoViewer f39977b;

    public os0(PhotoViewer photoViewer, int i10) {
        this.f39976a = i10;
        this.f39977b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ti tiVar;
        int i10 = this.f39976a;
        PhotoViewer photoViewer = this.f39977b;
        switch (i10) {
            case 0:
                photoViewer.f33384p6 = null;
                org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
                if (of0Var != null) {
                    if (of0Var.f29041b.j()) {
                        photoViewer.f33247a1.setColorFilter(new PorterDuffColorFilter(photoViewer.A1(org.telegram.ui.ActionBar.h6.f21407zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f33247a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f33306g6 = 0.0f;
                    photoViewer.f33283e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f33418t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.i3();
                return;
            case 3:
                photoViewer.L1.o0(false);
                gt0 gt0Var = photoViewer.L1;
                gt0Var.f45509u1.setTypeface(qg.v0.e(gt0Var.P1).f44687j);
                gt0Var.Z0.setVisibility(0);
                gt0Var.W0.setVisibility(0);
                gt0Var.X0.setVisibility(0);
                org.telegram.ui.Components.zd0 zd0Var = photoViewer.f33466y4;
                int childCount = zd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    zd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f33384p6 = null;
                photoViewer.f33428u4 = 3;
                ei.b4 b4Var = photoViewer.g1().L;
                if (photoViewer.f33428u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b4Var.b(z10);
                ei.b4 b4Var2 = photoViewer.K1;
                if (b4Var2 != null) {
                    if (photoViewer.f33428u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b4Var2.b(z11);
                }
                photoViewer.f33376o6 = -1;
                float t22 = photoViewer.t2(false);
                photoViewer.f33251a6 = t22;
                photoViewer.f33289e6 = t22;
                photoViewer.f33271c6 = 0.0f;
                photoViewer.f33280d6 = 0.0f;
                photoViewer.y3(t22);
                photoViewer.f33417t2 = true;
                photoViewer.f33283e0.invalidate();
                hu0 hu0Var = photoViewer.d;
                if (hu0Var == null || !hu0Var.P()) {
                    photoViewer.U1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f33371o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ck0(this, 21));
                return;
            case 6:
                photoViewer.f33357m6 = 1.0f;
                Runnable runnable = photoViewer.f33383p4;
                if (runnable != null) {
                    qn qnVar = photoViewer.l4;
                    if (qnVar == null && (tiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30550f0;
                        if (n2Var instanceof qn) {
                            qnVar = (qn) n2Var;
                        }
                    }
                    if (qnVar != null) {
                        qnVar.k8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f33383p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f33384p6 = null;
                photoViewer.f33283e0.invalidate();
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
