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
    public final int f36447a;
    public final PhotoViewer f36448b;

    public dt0(PhotoViewer photoViewer, int i10) {
        this.f36448b = photoViewer;
        this.f36447a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f36448b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33356n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f33279e1.setVisibility(8);
        photoViewer.f33288f1.setVisibility(8);
        photoViewer.f33296g1.setVisibility(8);
        org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
        if (of0Var != null) {
            of0Var.setVisibility(4);
        }
        photoViewer.f33366o1.setVisibility(8);
        photoViewer.f33366o1.setAlpha(0.0f);
        photoViewer.f33366o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33366o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33315i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f33262c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f33302g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.u3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f33262c2 == 11) {
            photoViewer.f33319i6 = photoViewer.Y5;
            photoViewer.f33310h6 = photoViewer.X5;
            photoViewer.f33328j6 = photoViewer.f33246a6;
            photoViewer.f33337k6 = photoViewer.f33256b6;
            photoViewer.f33293f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.l1(2) / bitmapWidth, photoViewer.i1(2, false) / bitmapHeight);
            if (photoViewer.f33262c2 == 1) {
                photoViewer.f33275d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.m1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f33400s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f33275d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f43551c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.l1(photoViewer.f33423u4) / bitmapHeight, photoViewer.j1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.l1(photoViewer.f33423u4) / bitmapWidth, photoViewer.j1() / bitmapHeight);
                }
            }
            photoViewer.f33284e6 = min2 / min;
            Rect rect = photoViewer.f33403s2;
            photoViewer.f33266c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f33362n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33379p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.t6.f30447g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f33379p6.setDuration(200L);
        photoViewer.f33379p6.addListener(new zb0(this, 9));
        photoViewer.f33379p6.start();
    }
}
