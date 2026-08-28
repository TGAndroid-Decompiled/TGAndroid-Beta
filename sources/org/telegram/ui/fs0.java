package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class fs0 extends AnimatorListenerAdapter {
    public final int f38342a;
    public final PhotoViewer f38343b;

    public fs0(PhotoViewer photoViewer, int i9) {
        this.f38342a = i9;
        this.f38343b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ki kiVar;
        int i9 = this.f38342a;
        PhotoViewer photoViewer = this.f38343b;
        switch (i9) {
            case 0:
                photoViewer.f35686l6 = null;
                org.telegram.ui.Components.be0 be0Var = photoViewer.f35799y1;
                if (be0Var != null) {
                    if (be0Var.f27183b.j()) {
                        photoViewer.W0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.f6.f23395zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.W0.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f35604c6 = 0.0f;
                    photoViewer.f35580a0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f35718p3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.H1.n0(false);
                xs0 xs0Var = photoViewer.H1;
                xs0Var.f49951q1.setTypeface(xf.s0.e(xs0Var.L1).f49365j);
                xs0Var.V0.setVisibility(0);
                xs0Var.S0.setVisibility(0);
                xs0Var.T0.setVisibility(0);
                org.telegram.ui.Components.mc0 mc0Var = photoViewer.f35765u4;
                int childCount = mc0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    mc0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.f35686l6 = null;
                photoViewer.f35727q4 = 3;
                kh.b4 b4Var = photoViewer.f1().H;
                if (photoViewer.f35727q4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b4Var.b(z10);
                kh.b4 b4Var2 = photoViewer.G1;
                if (b4Var2 != null) {
                    if (photoViewer.f35727q4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b4Var2.b(z11);
                }
                photoViewer.f35678k6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.W5 = r22;
                photoViewer.f35584a6 = r22;
                photoViewer.Y5 = 0.0f;
                photoViewer.Z5 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f35717p2 = true;
                photoViewer.f35580a0.invalidate();
                zt0 zt0Var = photoViewer.d;
                if (zt0Var == null || !zt0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.f35789x1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f35673k1.setVisibility(8);
                    photoViewer.f35789x1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new zk0(this, 21));
                return;
            case 6:
                photoViewer.f35660i6 = 1.0f;
                Runnable runnable = photoViewer.f35684l4;
                if (runnable != null) {
                    qn qnVar = photoViewer.f35649h4;
                    if (qnVar == null && (kiVar = photoViewer.W1) != null) {
                        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
                        if (o2Var instanceof qn) {
                            qnVar = (qn) o2Var;
                        }
                    }
                    if (qnVar != null) {
                        qnVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f35684l4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f35686l6 = null;
                photoViewer.f35580a0.invalidate();
                return;
            case 8:
                photoViewer.f35764u3[0].setTag(null);
                return;
            default:
                photoViewer.f35764u3[0].setTag(null);
                return;
        }
    }
}
