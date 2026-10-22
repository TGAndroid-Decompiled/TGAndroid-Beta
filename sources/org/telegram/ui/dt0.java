package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class dt0 extends AnimatorListenerAdapter {
    public final int f36451a;
    public final PhotoViewer f36452b;

    public dt0(PhotoViewer photoViewer, int i10) {
        this.f36452b = photoViewer;
        this.f36451a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f36452b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33360n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f33283e1.setVisibility(8);
        photoViewer.f33292f1.setVisibility(8);
        photoViewer.f33300g1.setVisibility(8);
        org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
        if (of0Var != null) {
            of0Var.setVisibility(4);
        }
        photoViewer.f33370o1.setVisibility(8);
        photoViewer.f33370o1.setAlpha(0.0f);
        photoViewer.f33370o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33370o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33319i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f33266c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f33306g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.u3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f33266c2 == 11) {
            photoViewer.f33323i6 = photoViewer.Y5;
            photoViewer.f33314h6 = photoViewer.X5;
            photoViewer.f33332j6 = photoViewer.f33250a6;
            photoViewer.f33341k6 = photoViewer.f33260b6;
            photoViewer.f33297f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.l1(2) / bitmapWidth, photoViewer.i1(2, false) / bitmapHeight);
            if (photoViewer.f33266c2 == 1) {
                photoViewer.f33279d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.m1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f33404s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f33279d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f43554c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.l1(photoViewer.f33427u4) / bitmapHeight, photoViewer.j1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.l1(photoViewer.f33427u4) / bitmapWidth, photoViewer.j1() / bitmapHeight);
                }
            }
            photoViewer.f33288e6 = min2 / min;
            Rect rect = photoViewer.f33407s2;
            photoViewer.f33270c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f33366n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33383p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.t6.f30451g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f33383p6.setDuration(200L);
        photoViewer.f33383p6.addListener(new zb0(this, 9));
        photoViewer.f33383p6.start();
    }
}
