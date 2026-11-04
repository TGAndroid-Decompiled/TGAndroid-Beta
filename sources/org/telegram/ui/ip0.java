package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class ip0 extends AnimatorListenerAdapter {
    public final int f46362a;
    public final PhotoViewer f46363b;

    public ip0(PhotoViewer photoViewer, int i3) {
        this.f46363b = photoViewer;
        this.f46362a = i3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        float min;
        int i10;
        PhotoViewer photoViewer = this.f46363b;
        photoViewer.f41528r6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.f41495o0.setVisibility(8);
        photoViewer.G.setVisibility(8);
        photoViewer.f41421f1.setVisibility(8);
        photoViewer.f41430g1.setVisibility(8);
        photoViewer.f41438h1.setVisibility(8);
        org.telegram.ui.Components.ad0 ad0Var = photoViewer.D1;
        if (ad0Var != null) {
            ad0Var.setVisibility(4);
        }
        photoViewer.f41505p1.setVisibility(8);
        photoViewer.f41505p1.setAlpha(0.0f);
        photoViewer.f41505p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.f41505p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.f41455j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i11 = photoViewer.f41402d2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.h7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.v3();
        }
        Bitmap n4 = photoViewer.D4.n();
        if (photoViewer.f41402d2 == 11) {
            photoViewer.f41459j6 = photoViewer.Z5;
            photoViewer.f41450i6 = photoViewer.Y5;
            photoViewer.f41467k6 = photoViewer.f41388b6;
            photoViewer.f41476l6 = photoViewer.f41397c6;
            photoViewer.f41435g6 = 0.0f;
        }
        if (n4 != null) {
            float q10 = photoViewer.D4.q();
            float o10 = photoViewer.D4.o();
            float min2 = Math.min(photoViewer.m1(2) / q10, photoViewer.j1(2, false) / o10);
            if (photoViewer.f41402d2 == 1) {
                photoViewer.f41416e6 = -org.telegram.messenger.g0.L(36.0f);
                min = photoViewer.n1(false);
            } else {
                int i12 = -org.telegram.messenger.g0.L(93.0f);
                if (!photoViewer.f41531s) {
                    i3 = org.telegram.messenger.g0.f22602m / 2;
                } else {
                    i3 = 0;
                }
                photoViewer.f41416e6 = i12 + i3;
                org.telegram.messenger.re reVar = photoViewer.Y4.f44797c;
                if (reVar != null && ((i10 = reVar.f25117k) == 90 || i10 == 270)) {
                    min = Math.min(photoViewer.m1(photoViewer.f41562v4) / o10, photoViewer.k1() / q10);
                } else {
                    min = Math.min(photoViewer.m1(photoViewer.f41562v4) / q10, photoViewer.k1() / o10);
                }
            }
            photoViewer.f41426f6 = min2 / min;
            Rect rect = photoViewer.f41542t2;
            photoViewer.f41406d6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f41501o6 = System.currentTimeMillis();
            photoViewer.S6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f41519q6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.k6.f35327g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.J1.getToolsView(), View.TRANSLATION_Y, org.telegram.messenger.g0.L(186.0f), 0.0f));
        photoViewer.f41519q6.setDuration(200L);
        photoViewer.f41519q6.addListener(new y20(this, 12));
        photoViewer.f41519q6.start();
    }
}
