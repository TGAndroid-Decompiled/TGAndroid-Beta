package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class es0 extends AnimatorListenerAdapter {
    public final int f37898a;
    public final PhotoViewer f37899b;

    public es0(PhotoViewer photoViewer, int i10) {
        this.f37898a = i10;
        this.f37899b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ni niVar;
        int i10 = this.f37898a;
        PhotoViewer photoViewer = this.f37899b;
        switch (i10) {
            case 0:
                photoViewer.f35752l6 = null;
                org.telegram.ui.Components.pe0 pe0Var = photoViewer.f35866y1;
                if (pe0Var != null) {
                    if (pe0Var.f31657b.j()) {
                        photoViewer.W0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.f23459zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.W0.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.c6 = 0.0f;
                    photoViewer.f35647a0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f35785p3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.H1.n0(false);
                ws0 ws0Var = photoViewer.H1;
                ws0Var.f2248q1.setTypeface(ag.h1.e(ws0Var.L1).f522j);
                ws0Var.V0.setVisibility(0);
                ws0Var.S0.setVisibility(0);
                ws0Var.T0.setVisibility(0);
                org.telegram.ui.Components.bd0 bd0Var = photoViewer.f35831u4;
                int childCount = bd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    bd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f35752l6 = null;
                photoViewer.f35795q4 = 3;
                nh.w3 w3Var = photoViewer.f1().H;
                if (photoViewer.f35795q4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w3Var.b(z10);
                nh.w3 w3Var2 = photoViewer.G1;
                if (w3Var2 != null) {
                    if (photoViewer.f35795q4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w3Var2.b(z11);
                }
                photoViewer.f35744k6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.W5 = r22;
                photoViewer.f35652a6 = r22;
                photoViewer.Y5 = 0.0f;
                photoViewer.Z5 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f35784p2 = true;
                photoViewer.f35647a0.invalidate();
                xt0 xt0Var = photoViewer.d;
                if (xt0Var == null || !xt0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.f35857x1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f35739k1.setVisibility(8);
                    photoViewer.f35857x1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new vk0(this, 21));
                return;
            case 6:
                photoViewer.f35726i6 = 1.0f;
                Runnable runnable = photoViewer.f35750l4;
                if (runnable != null) {
                    tn tnVar = photoViewer.f35715h4;
                    if (tnVar == null && (niVar = photoViewer.W1) != null) {
                        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
                        if (o2Var instanceof tn) {
                            tnVar = (tn) o2Var;
                        }
                    }
                    if (tnVar != null) {
                        tnVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f35750l4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f35752l6 = null;
                photoViewer.f35647a0.invalidate();
                return;
            case 8:
                photoViewer.f35830u3[0].setTag(null);
                return;
            default:
                photoViewer.f35830u3[0].setTag(null);
                return;
        }
    }
}
