package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class kt0 extends AnimatorListenerAdapter {
    public final int f39577a;
    public final PhotoViewer f39578b;

    public kt0(PhotoViewer photoViewer, int i10) {
        this.f39577a = i10;
        this.f39578b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.aj ajVar;
        int i10 = this.f39577a;
        PhotoViewer photoViewer = this.f39578b;
        switch (i10) {
            case 0:
                photoViewer.f33843p6 = null;
                org.telegram.ui.Components.zf0 zf0Var = photoViewer.C1;
                if (zf0Var != null) {
                    if (zf0Var.f33350b.j()) {
                        photoViewer.f33706a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f20973zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f33706a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f33766g6 = 0.0f;
                    photoViewer.f33743e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f33877t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.L1.o0(false);
                cu0 cu0Var = photoViewer.L1;
                cu0Var.f46337u1.setTypeface(pg.t0.e(cu0Var.P1).f45691j);
                cu0Var.Z0.setVisibility(0);
                cu0Var.W0.setVisibility(0);
                cu0Var.X0.setVisibility(0);
                org.telegram.ui.Components.le0 le0Var = photoViewer.f33925y4;
                int childCount = le0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    le0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f33843p6 = null;
                photoViewer.f33887u4 = 3;
                ci.h4 h4Var = photoViewer.f1().L;
                if (photoViewer.f33887u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.b(z10);
                ci.h4 h4Var2 = photoViewer.K1;
                if (h4Var2 != null) {
                    if (photoViewer.f33887u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h4Var2.b(z11);
                }
                photoViewer.f33835o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.f33710a6 = r22;
                photoViewer.f33749e6 = r22;
                photoViewer.f33730c6 = 0.0f;
                photoViewer.f33739d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f33876t2 = true;
                photoViewer.f33743e0.invalidate();
                ev0 ev0Var = photoViewer.d;
                if (ev0Var == null || !ev0Var.O()) {
                    photoViewer.S1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f33830o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new uk0(this, 21));
                return;
            case 6:
                photoViewer.f33816m6 = 1.0f;
                Runnable runnable = photoViewer.f33842p4;
                if (runnable != null) {
                    eo eoVar = photoViewer.l4;
                    if (eoVar == null && (ajVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24338f0;
                        if (m2Var instanceof eo) {
                            eoVar = (eo) m2Var;
                        }
                    }
                    if (eoVar != null) {
                        eoVar.k8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f33842p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f33843p6 = null;
                photoViewer.f33743e0.invalidate();
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
