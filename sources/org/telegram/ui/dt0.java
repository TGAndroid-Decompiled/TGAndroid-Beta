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
    public final int f35833a;
    public final PhotoViewer f35834b;

    public dt0(PhotoViewer photoViewer, int i10) {
        this.f35833a = i10;
        this.f35834b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.xi xiVar;
        int i10 = this.f35833a;
        PhotoViewer photoViewer = this.f35834b;
        switch (i10) {
            case 0:
                photoViewer.f33994p6 = null;
                org.telegram.ui.Components.gf0 gf0Var = photoViewer.C1;
                if (gf0Var != null) {
                    if (gf0Var.f26850b.j()) {
                        photoViewer.f33857a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f21232zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f33857a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f33917g6 = 0.0f;
                    photoViewer.f33894e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f34028t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.L1.o0(false);
                vt0 vt0Var = photoViewer.L1;
                vt0Var.f45187u1.setTypeface(pg.u0.e(vt0Var.P1).f44646j);
                vt0Var.Z0.setVisibility(0);
                vt0Var.W0.setVisibility(0);
                vt0Var.X0.setVisibility(0);
                org.telegram.ui.Components.sd0 sd0Var = photoViewer.f34076y4;
                int childCount = sd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    sd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f33994p6 = null;
                photoViewer.f34038u4 = 3;
                ci.i4 i4Var = photoViewer.f1().L;
                if (photoViewer.f34038u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i4Var.b(z10);
                ci.i4 i4Var2 = photoViewer.K1;
                if (i4Var2 != null) {
                    if (photoViewer.f34038u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i4Var2.b(z11);
                }
                photoViewer.f33986o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.f33861a6 = r22;
                photoViewer.f33900e6 = r22;
                photoViewer.f33881c6 = 0.0f;
                photoViewer.f33890d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f34027t2 = true;
                photoViewer.f33894e0.invalidate();
                wu0 wu0Var = photoViewer.d;
                if (wu0Var == null || !wu0Var.O()) {
                    photoViewer.S1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f33981o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new nl0(this, 21));
                return;
            case 6:
                photoViewer.f33967m6 = 1.0f;
                Runnable runnable = photoViewer.f33993p4;
                if (runnable != null) {
                    yn ynVar = photoViewer.l4;
                    if (ynVar == null && (xiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32812f0;
                        if (n2Var instanceof yn) {
                            ynVar = (yn) n2Var;
                        }
                    }
                    if (ynVar != null) {
                        ynVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f33993p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f33994p6 = null;
                photoViewer.f33894e0.invalidate();
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
