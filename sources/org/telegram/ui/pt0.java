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
public final class pt0 extends AnimatorListenerAdapter {
    public final int f36680a;
    public final PhotoViewer f36681b;

    public pt0(PhotoViewer photoViewer, int i10) {
        this.f36681b = photoViewer;
        this.f36680a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f36681b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f31301n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f31225e1.setVisibility(8);
        photoViewer.f31234f1.setVisibility(8);
        photoViewer.f31242g1.setVisibility(8);
        org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
        if (ef0Var != null) {
            ef0Var.setVisibility(4);
        }
        photoViewer.f31311o1.setVisibility(8);
        photoViewer.f31311o1.setAlpha(0.0f);
        photoViewer.f31311o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f31311o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f31261i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f31208c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f31248g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.r3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f31208c2 == 11) {
            photoViewer.f31265i6 = photoViewer.Y5;
            photoViewer.f31256h6 = photoViewer.X5;
            photoViewer.f31273j6 = photoViewer.f31192a6;
            photoViewer.f31282k6 = photoViewer.f31202b6;
            photoViewer.f31239f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f31208c2 == 1) {
                photoViewer.f31221d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f31345s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f31221d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f35175c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f31368u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f31368u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f31230e6 = min2 / min;
            Rect rect = photoViewer.f31348s2;
            photoViewer.f31212c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f31307n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31324p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.s6.f28165g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f31324p6.setDuration(200L);
        photoViewer.f31324p6.addListener(new xo0(this, 4));
        photoViewer.f31324p6.start();
    }
}
