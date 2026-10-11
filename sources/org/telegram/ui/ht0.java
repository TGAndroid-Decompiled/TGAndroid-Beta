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
    public final int f38538a;
    public final PhotoViewer f38539b;

    public ht0(PhotoViewer photoViewer, int i10) {
        this.f38538a = i10;
        this.f38539b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.yi yiVar;
        int i10 = this.f38538a;
        PhotoViewer photoViewer = this.f38539b;
        switch (i10) {
            case 0:
                photoViewer.f34066p6 = null;
                org.telegram.ui.Components.wf0 wf0Var = photoViewer.C1;
                if (wf0Var != null) {
                    if (wf0Var.f32682b.j()) {
                        photoViewer.f33929a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f21234zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f33929a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f33989g6 = 0.0f;
                    photoViewer.f33966e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f34100t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.L1.o0(false);
                au0 au0Var = photoViewer.L1;
                au0Var.f46521u1.setTypeface(pg.u0.e(au0Var.P1).f45875j);
                au0Var.Z0.setVisibility(0);
                au0Var.W0.setVisibility(0);
                au0Var.X0.setVisibility(0);
                org.telegram.ui.Components.he0 he0Var = photoViewer.f34148y4;
                int childCount = he0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    he0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f34066p6 = null;
                photoViewer.f34110u4 = 3;
                ci.h4 h4Var = photoViewer.f1().L;
                if (photoViewer.f34110u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.b(z10);
                ci.h4 h4Var2 = photoViewer.K1;
                if (h4Var2 != null) {
                    if (photoViewer.f34110u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h4Var2.b(z11);
                }
                photoViewer.f34058o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.f33933a6 = r22;
                photoViewer.f33972e6 = r22;
                photoViewer.f33953c6 = 0.0f;
                photoViewer.f33962d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f34099t2 = true;
                photoViewer.f33966e0.invalidate();
                bv0 bv0Var = photoViewer.d;
                if (bv0Var == null || !bv0Var.O()) {
                    photoViewer.S1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f34053o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new sk0(this, 21));
                return;
            case 6:
                photoViewer.f34039m6 = 1.0f;
                Runnable runnable = photoViewer.f34065p4;
                if (runnable != null) {
                    zn znVar = photoViewer.l4;
                    if (znVar == null && (yiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
                        if (m2Var instanceof zn) {
                            znVar = (zn) m2Var;
                        }
                    }
                    if (znVar != null) {
                        znVar.k8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f34065p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f34066p6 = null;
                photoViewer.f33966e0.invalidate();
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
