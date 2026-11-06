package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class fp0 extends AnimatorListenerAdapter {
    public final int f45682a;
    public final PhotoViewer f45683b;

    public fp0(PhotoViewer photoViewer, int i7) {
        this.f45682a = i7;
        this.f45683b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        boolean z10;
        org.telegram.ui.Components.di diVar;
        int i7 = this.f45682a;
        PhotoViewer photoViewer = this.f45683b;
        switch (i7) {
            case 0:
                photoViewer.f41447o6 = null;
                org.telegram.ui.Components.fd0 fd0Var = photoViewer.C1;
                if (fd0Var != null) {
                    if (fd0Var.f33564b.j()) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.f41319a1, org.telegram.ui.ActionBar.k6.f28039ng, photoViewer.f41506v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f41319a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f41372f6 = 0.0f;
                    photoViewer.f41356e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f41482s3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.d3();
                return;
            case 3:
                photoViewer.L1.m0(false);
                tp0 tp0Var = photoViewer.L1;
                tp0Var.f55552d1.setTypeface(sg.l0.e(tp0Var.f55586y1).f55017j);
                tp0Var.I0.setVisibility(0);
                tp0Var.F0.setVisibility(0);
                tp0Var.G0.setVisibility(0);
                org.telegram.ui.Components.sb0 sb0Var = photoViewer.f41528x4;
                int childCount = sb0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    sb0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.f41447o6 = null;
                photoViewer.f41491t4 = 3;
                fi.q3 q3Var = photoViewer.a1().L;
                if (photoViewer.f41491t4 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q3Var.b(z9);
                fi.q3 q3Var2 = photoViewer.K1;
                if (q3Var2 != null) {
                    if (photoViewer.f41491t4 != 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q3Var2.b(z10);
                }
                photoViewer.f41439n6 = -1;
                float o22 = photoViewer.o2(false);
                photoViewer.Z5 = o22;
                photoViewer.f41352d6 = o22;
                photoViewer.f41334b6 = 0.0f;
                photoViewer.f41344c6 = 0.0f;
                photoViewer.t3(o22);
                photoViewer.f41489t2 = true;
                photoViewer.f41356e0.invalidate();
                tq0 tq0Var = photoViewer.d;
                if (tq0Var == null || !tq0Var.P()) {
                    photoViewer.Q1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f41443o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new ef0(this, 24));
                return;
            case 6:
                photoViewer.f41422l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    an anVar = photoViewer.f41412k4;
                    if (anVar == null && (diVar = photoViewer.f41320a2) != null) {
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
                photoViewer.f41447o6 = null;
                photoViewer.f41356e0.invalidate();
                return;
            case 8:
                photoViewer.f41527x3[0].setTag(null);
                return;
            default:
                photoViewer.f41527x3[0].setTag(null);
                return;
        }
    }
}
