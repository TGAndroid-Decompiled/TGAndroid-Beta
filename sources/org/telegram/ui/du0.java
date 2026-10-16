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
public final class du0 extends AnimatorListenerAdapter {
    public final int f35140a;
    public final PhotoViewer f35141b;

    public du0(PhotoViewer photoViewer, int i10) {
        this.f35141b = photoViewer;
        this.f35140a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f35141b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f32006n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f31929e1.setVisibility(8);
        photoViewer.f31938f1.setVisibility(8);
        photoViewer.f31946g1.setVisibility(8);
        org.telegram.ui.Components.uf0 uf0Var = photoViewer.C1;
        if (uf0Var != null) {
            uf0Var.setVisibility(4);
        }
        photoViewer.f32016o1.setVisibility(8);
        photoViewer.f32016o1.setAlpha(0.0f);
        photoViewer.f32016o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f32016o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f31965i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f31912c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f31952g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f31912c2 == 11) {
            photoViewer.f31969i6 = photoViewer.Y5;
            photoViewer.f31960h6 = photoViewer.X5;
            photoViewer.f31978j6 = photoViewer.f31896a6;
            photoViewer.f31987k6 = photoViewer.f31906b6;
            photoViewer.f31943f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f31912c2 == 1) {
                photoViewer.f31925d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f32050s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f31925d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f41960c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f32073u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f32073u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f31934e6 = min2 / min;
            Rect rect = photoViewer.f32053s2;
            photoViewer.f31916c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f32012n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f32029p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.v6.f29579g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f32029p6.setDuration(200L);
        photoViewer.f32029p6.addListener(new kj0(this, 7));
        photoViewer.f32029p6.start();
    }
}
