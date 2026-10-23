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
public final class gt0 extends AnimatorListenerAdapter {
    public final int f37662a;
    public final PhotoViewer f37663b;

    public gt0(PhotoViewer photoViewer, int i10) {
        this.f37663b = photoViewer;
        this.f37662a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f37663b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33658n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f33581e1.setVisibility(8);
        photoViewer.f33590f1.setVisibility(8);
        photoViewer.f33598g1.setVisibility(8);
        org.telegram.ui.Components.rf0 rf0Var = photoViewer.C1;
        if (rf0Var != null) {
            rf0Var.setVisibility(4);
        }
        photoViewer.f33668o1.setVisibility(8);
        photoViewer.f33668o1.setAlpha(0.0f);
        photoViewer.f33668o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33668o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33617i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f33564c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f33604g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.u3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f33564c2 == 11) {
            photoViewer.f33621i6 = photoViewer.Y5;
            photoViewer.f33612h6 = photoViewer.X5;
            photoViewer.f33630j6 = photoViewer.f33548a6;
            photoViewer.f33639k6 = photoViewer.f33558b6;
            photoViewer.f33595f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.l1(2) / bitmapWidth, photoViewer.i1(2, false) / bitmapHeight);
            if (photoViewer.f33564c2 == 1) {
                photoViewer.f33577d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.m1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f33702s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f33577d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f36169c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.l1(photoViewer.f33725u4) / bitmapHeight, photoViewer.j1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.l1(photoViewer.f33725u4) / bitmapWidth, photoViewer.j1() / bitmapHeight);
                }
            }
            photoViewer.f33586e6 = min2 / min;
            Rect rect = photoViewer.f33705s2;
            photoViewer.f33568c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f33664n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33681p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.t6.f30653g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f33681p6.setDuration(200L);
        photoViewer.f33681p6.addListener(new v70(this, 10));
        photoViewer.f33681p6.start();
    }
}
