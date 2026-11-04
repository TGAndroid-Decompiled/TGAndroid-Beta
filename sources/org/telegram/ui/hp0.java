package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class hp0 extends AnimatorListenerAdapter {
    public final int f45962a;
    public final PhotoViewer f45963b;

    public hp0(PhotoViewer photoViewer, int i3) {
        this.f45963b = photoViewer;
        this.f45962a = i3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i3;
        PhotoViewer photoViewer = this.f45963b;
        dq0 dq0Var = photoViewer.Y4;
        org.telegram.ui.Components.b51 b51Var = null;
        photoViewer.f41528r6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.f41495o0.setVisibility(8);
        photoViewer.f41421f1.setVisibility(8);
        photoViewer.f41430g1.setVisibility(8);
        photoViewer.f41438h1.setVisibility(8);
        photoViewer.f41505p1.setVisibility(8);
        photoViewer.f41505p1.setAlpha(0.0f);
        photoViewer.f41505p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.f41505p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.f41455j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i10 = photoViewer.f41402d2;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.h7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.v3();
        }
        if (photoViewer.f41402d2 == 11) {
            photoViewer.f41459j6 = photoViewer.Z5;
            photoViewer.f41450i6 = photoViewer.Y5;
            photoViewer.f41467k6 = photoViewer.f41388b6;
            photoViewer.f41476l6 = photoViewer.f41397c6;
            photoViewer.f41435g6 = 0.0f;
        }
        Bitmap n4 = photoViewer.D4.n();
        if (n4 != null || photoViewer.f41533s1) {
            org.telegram.ui.Components.ad0 ad0Var = photoViewer.D1;
            int i11 = photoViewer.D4.V;
            if (photoViewer.f41402d2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            pg.f fVar = photoViewer.E1;
            if (photoViewer.f41533s1) {
                b51Var = (org.telegram.ui.Components.b51) photoViewer.C2;
            }
            ad0Var.b(n4, i11, z10, false, fVar, b51Var, dq0Var.f44797c);
            photoViewer.D1.a();
            int q10 = photoViewer.D4.q();
            int o10 = photoViewer.D4.o();
            org.telegram.messenger.re reVar = dq0Var.f44797c;
            if (reVar != null) {
                int i12 = reVar.f25117k;
                if (i12 == 90 || i12 == 270) {
                    o10 = q10;
                    q10 = o10;
                }
                q10 = (int) (q10 * reVar.f25113e);
                o10 = (int) (o10 * reVar.f25114f);
            }
            float f10 = q10;
            float f11 = o10;
            float min = Math.min(photoViewer.m1(photoViewer.f41562v4) / f10, photoViewer.k1() / f11);
            float min2 = Math.min(photoViewer.m1(1) / f10, photoViewer.j1(1, false) / f11);
            if (photoViewer.f41402d2 == 1) {
                float min3 = Math.min(photoViewer.m1(1), photoViewer.j1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.f41426f6 = min2 / min;
            Rect rect = photoViewer.f41542t2;
            photoViewer.f41406d6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -org.telegram.messenger.g0.L(56.0f);
            if (!photoViewer.f41531s) {
                i3 = org.telegram.messenger.g0.f22602m / 2;
            } else {
                i3 = 0;
            }
            photoViewer.f41416e6 = i13 + i3;
            photoViewer.f41501o6 = System.currentTimeMillis();
            photoViewer.S6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f41519q6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.V0, View.TRANSLATION_Y, org.telegram.messenger.g0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.k6.f35327g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.D1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f41519q6.setDuration(200L);
        photoViewer.f41519q6.addListener(new y20(this, 11));
        photoViewer.f41519q6.start();
    }
}
