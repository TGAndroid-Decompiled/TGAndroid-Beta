package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class pp0 extends AnimatorListenerAdapter {
    public final int f50324a;
    public final PhotoViewer f50325b;

    public pp0(PhotoViewer photoViewer, int i7) {
        this.f50325b = photoViewer;
        this.f50324a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i7;
        PhotoViewer photoViewer = this.f50325b;
        lq0 lq0Var = photoViewer.X4;
        org.telegram.ui.Components.k51 k51Var = null;
        photoViewer.f42862q6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.f42839o0.setVisibility(8);
        photoViewer.f42764f1.setVisibility(8);
        photoViewer.f42773g1.setVisibility(8);
        photoViewer.f42782h1.setVisibility(8);
        photoViewer.f42848p1.setVisibility(8);
        photoViewer.f42848p1.setAlpha(0.0f);
        photoViewer.f42848p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.f42848p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.f42799j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i10 = photoViewer.d2;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f42779g7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.q3();
        }
        if (photoViewer.d2 == 11) {
            photoViewer.f42795i6 = photoViewer.Y5;
            photoViewer.f42787h6 = photoViewer.X5;
            photoViewer.f42802j6 = photoViewer.f42721a6;
            photoViewer.f42811k6 = photoViewer.f42731b6;
            photoViewer.f42769f6 = 0.0f;
        }
        Bitmap n10 = photoViewer.C4.n();
        if (n10 != null || photoViewer.f42877s1) {
            org.telegram.ui.Components.gd0 gd0Var = photoViewer.D1;
            int i11 = photoViewer.C4.V;
            if (photoViewer.d2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            og.g gVar = photoViewer.E1;
            if (photoViewer.f42877s1) {
                k51Var = (org.telegram.ui.Components.k51) photoViewer.C2;
            }
            gd0Var.b(n10, i11, z10, false, gVar, k51Var, lq0Var.f49023c);
            photoViewer.D1.a();
            int q10 = photoViewer.C4.q();
            int o4 = photoViewer.C4.o();
            org.telegram.messenger.xe xeVar = lq0Var.f49023c;
            if (xeVar != null) {
                int i12 = xeVar.f27496k;
                if (i12 == 90 || i12 == 270) {
                    o4 = q10;
                    q10 = o4;
                }
                q10 = (int) (q10 * xeVar.f27492e);
                o4 = (int) (o4 * xeVar.f27493f);
            }
            float f10 = q10;
            float f11 = o4;
            float min = Math.min(photoViewer.g1(photoViewer.f42896u4) / f10, photoViewer.e1() / f11);
            float min2 = Math.min(photoViewer.g1(1) / f10, photoViewer.d1(1, false) / f11);
            if (photoViewer.d2 == 1) {
                float min3 = Math.min(photoViewer.g1(1), photoViewer.d1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.f42759e6 = min2 / min;
            Rect rect = photoViewer.f42886t2;
            photoViewer.f42741c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -org.telegram.messenger.g0.L(56.0f);
            if (!photoViewer.f42875s) {
                i7 = org.telegram.messenger.g0.f23605m / 2;
            } else {
                i7 = 0;
            }
            photoViewer.f42749d6 = i13 + i7;
            photoViewer.f42836n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f42853p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.V0, View.TRANSLATION_Y, org.telegram.messenger.g0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.k6.f36292g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.D1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f42853p6.setDuration(200L);
        photoViewer.f42853p6.addListener(new xx(this, 12));
        photoViewer.f42853p6.start();
    }
}
