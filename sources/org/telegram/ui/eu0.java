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
public final class eu0 extends AnimatorListenerAdapter {
    public final int f35674a;
    public final PhotoViewer f35675b;

    public eu0(PhotoViewer photoViewer, int i10) {
        this.f35675b = photoViewer;
        this.f35674a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f35675b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f32304n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f32227e1.setVisibility(8);
        photoViewer.f32236f1.setVisibility(8);
        photoViewer.f32244g1.setVisibility(8);
        org.telegram.ui.Components.tf0 tf0Var = photoViewer.C1;
        if (tf0Var != null) {
            tf0Var.setVisibility(4);
        }
        photoViewer.f32314o1.setVisibility(8);
        photoViewer.f32314o1.setAlpha(0.0f);
        photoViewer.f32314o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f32314o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f32263i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f32210c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f32250g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f32210c2 == 11) {
            photoViewer.f32267i6 = photoViewer.Y5;
            photoViewer.f32258h6 = photoViewer.X5;
            photoViewer.f32276j6 = photoViewer.f32194a6;
            photoViewer.f32285k6 = photoViewer.f32204b6;
            photoViewer.f32241f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f32210c2 == 1) {
                photoViewer.f32223d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f32348s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f32223d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f42716c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f32371u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f32371u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f32232e6 = min2 / min;
            Rect rect = photoViewer.f32351s2;
            photoViewer.f32214c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f32310n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f32327p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.v6.f29903g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f32327p6.setDuration(200L);
        photoViewer.f32327p6.addListener(new lj0(this, 7));
        photoViewer.f32327p6.start();
    }
}
