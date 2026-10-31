package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class br0 extends AnimatorListenerAdapter {
    public final int f36297a;
    public final PhotoViewer f36298b;

    public br0(PhotoViewer photoViewer, int i10) {
        this.f36298b = photoViewer;
        this.f36297a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f36298b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33548n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f33471e1.setVisibility(8);
        photoViewer.f33480f1.setVisibility(8);
        photoViewer.f33488g1.setVisibility(8);
        org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
        if (be0Var != null) {
            be0Var.setVisibility(4);
        }
        photoViewer.f33558o1.setVisibility(8);
        photoViewer.f33558o1.setAlpha(0.0f);
        photoViewer.f33558o1.setTranslationY(-org.telegram.messenger.i0.L(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33558o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33507i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f33454c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f33494g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.v3();
        }
        Bitmap n10 = photoViewer.C4.n();
        if (photoViewer.f33454c2 == 11) {
            photoViewer.f33511i6 = photoViewer.Y5;
            photoViewer.f33502h6 = photoViewer.X5;
            photoViewer.f33520j6 = photoViewer.f33438a6;
            photoViewer.f33529k6 = photoViewer.f33448b6;
            photoViewer.f33485f6 = 0.0f;
        }
        if (n10 != null) {
            float q6 = photoViewer.C4.q();
            float o10 = photoViewer.C4.o();
            float min2 = Math.min(photoViewer.m1(2) / q6, photoViewer.j1(2, false) / o10);
            if (photoViewer.f33454c2 == 1) {
                photoViewer.f33467d6 = -org.telegram.messenger.i0.L(36.0f);
                min = photoViewer.n1(false);
            } else {
                int i13 = -org.telegram.messenger.i0.L(93.0f);
                if (!photoViewer.f33592s) {
                    i10 = org.telegram.messenger.i0.f16020m / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f33467d6 = i13 + i10;
                org.telegram.messenger.ye yeVar = photoViewer.X4.f43638c;
                if (yeVar != null && ((i11 = yeVar.f19370k) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.m1(photoViewer.f33615u4) / o10, photoViewer.k1() / q6);
                } else {
                    min = Math.min(photoViewer.m1(photoViewer.f33615u4) / q6, photoViewer.k1() / o10);
                }
            }
            photoViewer.f33476e6 = min2 / min;
            Rect rect = photoViewer.f33595s2;
            photoViewer.f33458c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f33554n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33571p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.i6.f26891g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, org.telegram.messenger.i0.L(186.0f), 0.0f));
        photoViewer.f33571p6.setDuration(200L);
        photoViewer.f33571p6.addListener(new org.telegram.ui.Components.voip.h2(this, 23));
        photoViewer.f33571p6.start();
    }
}
