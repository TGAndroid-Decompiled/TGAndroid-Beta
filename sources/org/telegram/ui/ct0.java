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
public final class ct0 extends AnimatorListenerAdapter {
    public final int f33427a;
    public final PhotoViewer f33428b;

    public ct0(PhotoViewer photoViewer, int i10) {
        this.f33428b = photoViewer;
        this.f33427a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f33428b;
        photoViewer.f31818n6 = null;
        photoViewer.M0.setVisibility(8);
        photoViewer.P0.setVisibility(8);
        photoViewer.f31786k0.setVisibility(8);
        photoViewer.C.setVisibility(8);
        photoViewer.f31706b1.setVisibility(8);
        photoViewer.f31716c1.setVisibility(8);
        photoViewer.f31724d1.setVisibility(8);
        org.telegram.ui.Components.ye0 ye0Var = photoViewer.f31924z1;
        if (ye0Var != null) {
            ye0Var.setVisibility(4);
        }
        photoViewer.l1.setVisibility(8);
        photoViewer.l1.setAlpha(0.0f);
        photoViewer.l1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.L0.setRotationX(0.0f);
        photoViewer.l1.setEnabled(false);
        photoViewer.H = false;
        if (photoViewer.f31743f2) {
            photoViewer.N1.setVisibility(4);
        }
        int i12 = photoViewer.Z1;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f31730d7.size() > 1)) {
            photoViewer.K0.setVisibility(8);
            photoViewer.L0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.z4.getBitmap();
        if (photoViewer.Z1 == 11) {
            photoViewer.f31747f6 = photoViewer.V5;
            photoViewer.e6 = photoViewer.U5;
            photoViewer.f31756g6 = photoViewer.X5;
            photoViewer.f31765h6 = photoViewer.Y5;
            photoViewer.f31720c6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.z4.getBitmapWidth();
            float bitmapHeight = photoViewer.z4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.Z1 == 1) {
                photoViewer.f31701a6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f31858s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f31701a6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.U4.f40304c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f31853r4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f31853r4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f31711b6 = min2 / min;
            Rect rect = photoViewer.f31832p2;
            photoViewer.Z5 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f31792k6 = System.currentTimeMillis();
            photoViewer.O6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31808m6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.n6.f27203g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.F1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f31808m6.setDuration(200L);
        photoViewer.f31808m6.addListener(new ls0(this, 2));
        photoViewer.f31808m6.start();
    }
}
