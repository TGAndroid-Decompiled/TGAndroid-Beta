package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class gs0 extends AnimatorListenerAdapter {

    public final int f38469a;

    public final PhotoViewer f38470b;

    public gs0(PhotoViewer photoViewer, int i10) {
        this.f38469a = i10;
        this.f38470b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.gi giVar;
        int i10 = this.f38469a;
        PhotoViewer photoViewer = this.f38470b;
        switch (i10) {
            case 0:
                photoViewer.f35689l6 = null;
                org.telegram.ui.Components.ge0 ge0Var = photoViewer.f35802y1;
                if (ge0Var != null) {
                    if (ge0Var.f28602b.j()) {
                        photoViewer.W0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.f23449zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.W0.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f35607c6 = 0.0f;
                    photoViewer.f35583a0.invalidate();
                    break;
                }
                break;
            case 1:
                photoViewer.f35722p3 = null;
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.g3();
                break;
            case 3:
                photoViewer.H1.n0(false);
                ys0 ys0Var = photoViewer.H1;
                ys0Var.f50529q1.setTypeface(yf.r0.e(ys0Var.L1).f50061j);
                ys0Var.V0.setVisibility(0);
                ys0Var.S0.setVisibility(0);
                ys0Var.T0.setVisibility(0);
                org.telegram.ui.Components.rc0 rc0Var = photoViewer.f35768u4;
                int childCount = rc0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    rc0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f35689l6 = null;
                photoViewer.f35731q4 = 3;
                photoViewer.f1().H.b(photoViewer.f35731q4 != 0);
                lh.a4 a4Var = photoViewer.G1;
                if (a4Var != null) {
                    a4Var.b(photoViewer.f35731q4 != 3);
                }
                photoViewer.f35681k6 = -1;
                float fR2 = photoViewer.r2(false);
                photoViewer.W5 = fR2;
                photoViewer.f35587a6 = fR2;
                photoViewer.Y5 = 0.0f;
                photoViewer.Z5 = 0.0f;
                photoViewer.w3(fR2);
                photoViewer.f35721p2 = true;
                photoViewer.f35583a0.invalidate();
                au0 au0Var = photoViewer.d;
                if (au0Var == null || !au0Var.O()) {
                    photoViewer.R1();
                }
                break;
            case 4:
                AnimatorSet animatorSet = photoViewer.f35793x1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f35676k1.setVisibility(8);
                    photoViewer.f35793x1 = null;
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new zk0(this, 21));
                break;
            case 6:
                photoViewer.f35663i6 = 1.0f;
                Runnable runnable = photoViewer.f35687l4;
                if (runnable != null) {
                    rn rnVar = photoViewer.f35652h4;
                    if (rnVar == null && (giVar = photoViewer.W1) != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
                        if (n2Var instanceof rn) {
                            rnVar = (rn) n2Var;
                        }
                    }
                    if (rnVar != null) {
                        rnVar.h8(runnable);
                    } else {
                        runnable.run();
                        photoViewer.f35687l4 = null;
                    }
                }
                break;
            case 7:
                photoViewer.f35689l6 = null;
                photoViewer.f35583a0.invalidate();
                break;
            case 8:
                photoViewer.f35767u3[0].setTag(null);
                break;
            default:
                photoViewer.f35767u3[0].setTag(null);
                break;
        }
    }
}
