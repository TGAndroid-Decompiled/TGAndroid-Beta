package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class ar0 extends AnimatorListenerAdapter {
    public final int f35700a;
    public final PhotoViewer f35701b;

    public ar0(PhotoViewer photoViewer, int i10) {
        this.f35701b = photoViewer;
        this.f35700a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f35701b;
        xr0 xr0Var = photoViewer.X4;
        org.telegram.ui.Components.k61 k61Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33548n0.setVisibility(8);
        photoViewer.f33471e1.setVisibility(8);
        photoViewer.f33480f1.setVisibility(8);
        photoViewer.f33488g1.setVisibility(8);
        photoViewer.f33558o1.setVisibility(8);
        photoViewer.f33558o1.setAlpha(0.0f);
        photoViewer.f33558o1.setTranslationY(-org.telegram.messenger.i0.L(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33558o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33507i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f33454c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33494g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.v3();
        }
        if (photoViewer.f33454c2 == 11) {
            photoViewer.f33511i6 = photoViewer.Y5;
            photoViewer.f33502h6 = photoViewer.X5;
            photoViewer.f33520j6 = photoViewer.f33438a6;
            photoViewer.f33529k6 = photoViewer.f33448b6;
            photoViewer.f33485f6 = 0.0f;
        }
        Bitmap n10 = photoViewer.C4.n();
        if (n10 != null || photoViewer.f33584r1) {
            org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
            int i12 = photoViewer.C4.U;
            if (photoViewer.f33454c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            eg.g gVar = photoViewer.D1;
            if (photoViewer.f33584r1) {
                k61Var = (org.telegram.ui.Components.k61) photoViewer.B2;
            }
            be0Var.b(n10, i12, z10, false, gVar, k61Var, xr0Var.f43638c);
            photoViewer.C1.a();
            int q6 = photoViewer.C4.q();
            int o10 = photoViewer.C4.o();
            org.telegram.messenger.ye yeVar = xr0Var.f43638c;
            if (yeVar != null) {
                int i13 = yeVar.f19370k;
                if (i13 == 90 || i13 == 270) {
                    o10 = q6;
                    q6 = o10;
                }
                q6 = (int) (q6 * yeVar.e);
                o10 = (int) (o10 * yeVar.f19367f);
            }
            float f7 = q6;
            float f10 = o10;
            float min = Math.min(photoViewer.m1(photoViewer.f33615u4) / f7, photoViewer.k1() / f10);
            float min2 = Math.min(photoViewer.m1(1) / f7, photoViewer.j1(1, false) / f10);
            if (photoViewer.f33454c2 == 1) {
                float min3 = Math.min(photoViewer.m1(1), photoViewer.j1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f33476e6 = min2 / min;
            Rect rect = photoViewer.f33595s2;
            photoViewer.f33458c6 = (rect.left / 2) - (rect.right / 2);
            int i14 = -org.telegram.messenger.i0.L(56.0f);
            if (!photoViewer.f33592s) {
                i10 = org.telegram.messenger.i0.f16020m / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f33467d6 = i14 + i10;
            photoViewer.f33554n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33571p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, org.telegram.messenger.i0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.i6.f26891g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f33571p6.setDuration(200L);
        photoViewer.f33571p6.addListener(new org.telegram.ui.Components.voip.h2(this, 22));
        photoViewer.f33571p6.start();
    }
}
