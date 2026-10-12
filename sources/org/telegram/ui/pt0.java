package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class pt0 extends AnimatorListenerAdapter {
    public final int f39289a;
    public final PhotoViewer f39290b;

    public pt0(PhotoViewer photoViewer, int i10) {
        this.f39289a = i10;
        this.f39290b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.vi viVar;
        int i10 = this.f39289a;
        PhotoViewer photoViewer = this.f39290b;
        switch (i10) {
            case 0:
                photoViewer.f32327p6 = null;
                org.telegram.ui.Components.tf0 tf0Var = photoViewer.C1;
                if (tf0Var != null) {
                    if (tf0Var.f29369b.j()) {
                        photoViewer.f32190a1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.f20313zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.f32190a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f32249g6 = 0.0f;
                    photoViewer.f32226e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f32361t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.L1.o0(false);
                hu0 hu0Var = photoViewer.L1;
                hu0Var.f44432u1.setTypeface(qg.s0.e(hu0Var.P1).f43571j);
                hu0Var.Z0.setVisibility(0);
                hu0Var.W0.setVisibility(0);
                hu0Var.X0.setVisibility(0);
                org.telegram.ui.Components.fe0 fe0Var = photoViewer.f32409y4;
                int childCount = fe0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    fe0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f32327p6 = null;
                photoViewer.f32371u4 = 3;
                di.h4 h4Var = photoViewer.f1().L;
                if (photoViewer.f32371u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.b(z10);
                di.h4 h4Var2 = photoViewer.K1;
                if (h4Var2 != null) {
                    if (photoViewer.f32371u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h4Var2.b(z11);
                }
                photoViewer.f32319o6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.f32194a6 = r22;
                photoViewer.f32232e6 = r22;
                photoViewer.f32214c6 = 0.0f;
                photoViewer.f32223d6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f32360t2 = true;
                photoViewer.f32226e0.invalidate();
                iv0 iv0Var = photoViewer.d;
                if (iv0Var == null || !iv0Var.O()) {
                    photoViewer.S1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f32314o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new yk0(this, 21));
                return;
            case 6:
                photoViewer.f32300m6 = 1.0f;
                Runnable runnable = photoViewer.f32326p4;
                if (runnable != null) {
                    fo foVar = photoViewer.l4;
                    if (foVar == null && (viVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
                        if (m2Var instanceof fo) {
                            foVar = (fo) m2Var;
                        }
                    }
                    if (foVar != null) {
                        foVar.k8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f32326p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f32327p6 = null;
                photoViewer.f32226e0.invalidate();
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
