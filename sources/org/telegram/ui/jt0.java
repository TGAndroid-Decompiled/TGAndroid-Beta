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
public final class jt0 extends AnimatorListenerAdapter {
    public final int f35367a;
    public final PhotoViewer f35368b;

    public jt0(PhotoViewer photoViewer, int i10) {
        this.f35368b = photoViewer;
        this.f35367a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f35368b;
        photoViewer.f31792n6 = null;
        photoViewer.M0.setVisibility(8);
        photoViewer.P0.setVisibility(8);
        photoViewer.f31760k0.setVisibility(8);
        photoViewer.C.setVisibility(8);
        photoViewer.f31680b1.setVisibility(8);
        photoViewer.f31690c1.setVisibility(8);
        photoViewer.f31698d1.setVisibility(8);
        org.telegram.ui.Components.ze0 ze0Var = photoViewer.f31898z1;
        if (ze0Var != null) {
            ze0Var.setVisibility(4);
        }
        photoViewer.l1.setVisibility(8);
        photoViewer.l1.setAlpha(0.0f);
        photoViewer.l1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.L0.setRotationX(0.0f);
        photoViewer.l1.setEnabled(false);
        photoViewer.H = false;
        if (photoViewer.f31717f2) {
            photoViewer.N1.setVisibility(4);
        }
        int i12 = photoViewer.Z1;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f31704d7.size() > 1)) {
            photoViewer.K0.setVisibility(8);
            photoViewer.L0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.z4.getBitmap();
        if (photoViewer.Z1 == 11) {
            photoViewer.f31721f6 = photoViewer.V5;
            photoViewer.e6 = photoViewer.U5;
            photoViewer.f31730g6 = photoViewer.X5;
            photoViewer.f31739h6 = photoViewer.Y5;
            photoViewer.f31694c6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.z4.getBitmapWidth();
            float bitmapHeight = photoViewer.z4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.Z1 == 1) {
                photoViewer.f31675a6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f31832s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f31675a6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.U4.f33855c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f31827r4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f31827r4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f31685b6 = min2 / min;
            Rect rect = photoViewer.f31806p2;
            photoViewer.Z5 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f31766k6 = System.currentTimeMillis();
            photoViewer.O6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31782m6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.n6.f27199g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.F1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f31782m6.setDuration(200L);
        photoViewer.f31782m6.addListener(new ss0(this, 2));
        photoViewer.f31782m6.start();
    }
}
