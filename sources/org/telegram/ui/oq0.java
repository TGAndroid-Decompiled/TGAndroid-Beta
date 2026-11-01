package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class oq0 extends AnimatorListenerAdapter {
    public final int f40249a;
    public final PhotoViewer f40250b;

    public oq0(PhotoViewer photoViewer, int i10) {
        this.f40249a = i10;
        this.f40250b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.bi biVar;
        int i10 = this.f40249a;
        PhotoViewer photoViewer = this.f40250b;
        switch (i10) {
            case 0:
                photoViewer.f33578p6 = null;
                org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
                if (be0Var != null) {
                    if (be0Var.f24715b.j()) {
                        org.telegram.ui.ActionBar.a7.t(photoViewer.f33441a1, org.telegram.ui.ActionBar.t6.f21126ng, photoViewer.f33629v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f33441a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f33500g6 = 0.0f;
                    photoViewer.f33477e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f33612t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.j3();
                return;
            case 3:
                photoViewer.L1.m0(false);
                cr0 cr0Var = photoViewer.L1;
                cr0Var.f10167d1.setTypeface(ig.s0.e(cr0Var.f10202y1).f8458j);
                cr0Var.I0.setVisibility(0);
                cr0Var.F0.setVisibility(0);
                cr0Var.G0.setVisibility(0);
                org.telegram.ui.Components.lc0 lc0Var = photoViewer.f33660y4;
                int childCount = lc0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    lc0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f33578p6 = null;
                photoViewer.f33622u4 = 3;
                vh.r2 r2Var = photoViewer.h1().L;
                if (photoViewer.f33622u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r2Var.b(z10);
                vh.r2 r2Var2 = photoViewer.K1;
                if (r2Var2 != null) {
                    if (photoViewer.f33622u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r2Var2.b(z11);
                }
                photoViewer.f33570o6 = -1;
                float u22 = photoViewer.u2(false);
                photoViewer.f33445a6 = u22;
                photoViewer.f33483e6 = u22;
                photoViewer.f33465c6 = 0.0f;
                photoViewer.f33474d6 = 0.0f;
                photoViewer.z3(u22);
                photoViewer.f33611t2 = true;
                photoViewer.f33477e0.invalidate();
                ds0 ds0Var = photoViewer.d;
                if (ds0Var == null || !ds0Var.P()) {
                    photoViewer.V1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f33565o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.i0.g3(new kg0(this, 24));
                return;
            case 6:
                photoViewer.f33551m6 = 1.0f;
                Runnable runnable = photoViewer.f33577p4;
                if (runnable != null) {
                    un unVar = photoViewer.l4;
                    if (unVar == null && (biVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                        if (k2Var instanceof un) {
                            unVar = (un) k2Var;
                        }
                    }
                    if (unVar != null) {
                        unVar.t8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f33577p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f33578p6 = null;
                photoViewer.f33477e0.invalidate();
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
