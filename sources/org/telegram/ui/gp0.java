package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class gp0 extends AnimatorListenerAdapter {
    public final int f46079a;
    public final PhotoViewer f46080b;

    public gp0(PhotoViewer photoViewer, int i7) {
        this.f46079a = i7;
        this.f46080b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        boolean z10;
        org.telegram.ui.Components.di diVar;
        int i7 = this.f46079a;
        PhotoViewer photoViewer = this.f46080b;
        switch (i7) {
            case 0:
                photoViewer.f41475o6 = null;
                org.telegram.ui.Components.fd0 fd0Var = photoViewer.C1;
                if (fd0Var != null) {
                    if (fd0Var.f33525b.j()) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.f41347a1, org.telegram.ui.ActionBar.k6.f28043ng, photoViewer.f41534v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f41347a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f41400f6 = 0.0f;
                    photoViewer.f41384e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f41510s3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.d3();
                return;
            case 3:
                photoViewer.L1.m0(false);
                up0 up0Var = photoViewer.L1;
                up0Var.f55668d1.setTypeface(sg.l0.e(up0Var.f55702y1).f55133j);
                up0Var.I0.setVisibility(0);
                up0Var.F0.setVisibility(0);
                up0Var.G0.setVisibility(0);
                org.telegram.ui.Components.sb0 sb0Var = photoViewer.f41556x4;
                int childCount = sb0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    sb0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.f41475o6 = null;
                photoViewer.f41519t4 = 3;
                fi.q3 q3Var = photoViewer.a1().L;
                if (photoViewer.f41519t4 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q3Var.b(z9);
                fi.q3 q3Var2 = photoViewer.K1;
                if (q3Var2 != null) {
                    if (photoViewer.f41519t4 != 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q3Var2.b(z10);
                }
                photoViewer.f41467n6 = -1;
                float o22 = photoViewer.o2(false);
                photoViewer.Z5 = o22;
                photoViewer.f41380d6 = o22;
                photoViewer.f41362b6 = 0.0f;
                photoViewer.f41372c6 = 0.0f;
                photoViewer.t3(o22);
                photoViewer.f41517t2 = true;
                photoViewer.f41384e0.invalidate();
                uq0 uq0Var = photoViewer.d;
                if (uq0Var == null || !uq0Var.P()) {
                    photoViewer.Q1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f41471o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new ef0(this, 24));
                return;
            case 6:
                photoViewer.f41450l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    an anVar = photoViewer.f41440k4;
                    if (anVar == null && (diVar = photoViewer.f41348a2) != null) {
                        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                        if (f2Var instanceof an) {
                            anVar = (an) f2Var;
                        }
                    }
                    if (anVar != null) {
                        anVar.w8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.o4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f41475o6 = null;
                photoViewer.f41384e0.invalidate();
                return;
            case 8:
                photoViewer.f41555x3[0].setTag(null);
                return;
            default:
                photoViewer.f41555x3[0].setTag(null);
                return;
        }
    }
}
