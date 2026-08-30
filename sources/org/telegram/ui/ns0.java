package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ns0 extends AnimatorListenerAdapter {
    public final int f36725a;
    public final PhotoViewer f36726b;

    public ns0(PhotoViewer photoViewer, int i10) {
        this.f36725a = i10;
        this.f36726b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z4;
        boolean z10;
        org.telegram.ui.Components.li liVar;
        int i10 = this.f36725a;
        PhotoViewer photoViewer = this.f36726b;
        switch (i10) {
            case 0:
                photoViewer.f31808m6 = null;
                org.telegram.ui.Components.ye0 ye0Var = photoViewer.f31924z1;
                if (ye0Var != null) {
                    if (ye0Var.f31004b.j()) {
                        photoViewer.X0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f20304zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.X0.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f31729d6 = 0.0f;
                    photoViewer.f31705b0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f31842q3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.I1.n0(false);
                ft0 ft0Var = photoViewer.I1;
                ft0Var.f4484r1.setTypeface(cg.f1.e(ft0Var.M1).f2398j);
                ft0Var.W0.setVisibility(0);
                ft0Var.T0.setVisibility(0);
                ft0Var.U0.setVisibility(0);
                org.telegram.ui.Components.hd0 hd0Var = photoViewer.f31888v4;
                int childCount = hd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    hd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f31808m6 = null;
                photoViewer.f31853r4 = 3;
                ph.i3 i3Var = photoViewer.f1().I;
                if (photoViewer.f31853r4 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i3Var.b(z4);
                ph.i3 i3Var2 = photoViewer.H1;
                if (i3Var2 != null) {
                    if (photoViewer.f31853r4 != 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i3Var2.b(z10);
                }
                photoViewer.f31800l6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.X5 = r22;
                photoViewer.f31711b6 = r22;
                photoViewer.Z5 = 0.0f;
                photoViewer.f31701a6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f31841q2 = true;
                photoViewer.f31705b0.invalidate();
                hu0 hu0Var = photoViewer.d;
                if (hu0Var == null || !hu0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.f31915y1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.l1.setVisibility(8);
                    photoViewer.f31915y1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new el0(this, 21));
                return;
            case 6:
                photoViewer.f31783j6 = 1.0f;
                Runnable runnable = photoViewer.f31806m4;
                if (runnable != null) {
                    xn xnVar = photoViewer.f31772i4;
                    if (xnVar == null && (liVar = photoViewer.X1) != null) {
                        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
                        if (p2Var instanceof xn) {
                            xnVar = (xn) p2Var;
                        }
                    }
                    if (xnVar != null) {
                        xnVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f31806m4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f31808m6 = null;
                photoViewer.f31705b0.invalidate();
                return;
            case 8:
                photoViewer.f31887v3[0].setTag(null);
                return;
            default:
                photoViewer.f31887v3[0].setTag(null);
                return;
        }
    }
}
