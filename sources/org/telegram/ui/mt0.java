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
public final class mt0 extends AnimatorListenerAdapter {
    public final int f41568a;
    public final PhotoViewer f41569b;

    public mt0(PhotoViewer photoViewer, int i10) {
        this.f41569b = photoViewer;
        this.f41568a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f41569b;
        photoViewer.f35780q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f35748n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f35671e1.setVisibility(8);
        photoViewer.f35681f1.setVisibility(8);
        photoViewer.f35689g1.setVisibility(8);
        org.telegram.ui.Components.pf0 pf0Var = photoViewer.C1;
        if (pf0Var != null) {
            pf0Var.setVisibility(4);
        }
        photoViewer.f35758o1.setVisibility(8);
        photoViewer.f35758o1.setAlpha(0.0f);
        photoViewer.f35758o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f35758o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f35707i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f35654c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.v3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f35654c2 == 11) {
            photoViewer.f35711i6 = photoViewer.Y5;
            photoViewer.f35702h6 = photoViewer.X5;
            photoViewer.f35720j6 = photoViewer.f35638a6;
            photoViewer.f35729k6 = photoViewer.f35648b6;
            photoViewer.f35686f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.m1(2) / bitmapWidth, photoViewer.j1(2, false) / bitmapHeight);
            if (photoViewer.f35654c2 == 1) {
                photoViewer.f35667d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.n1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f35792s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f35667d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f39990c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.m1(photoViewer.f35815u4) / bitmapHeight, photoViewer.k1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.m1(photoViewer.f35815u4) / bitmapWidth, photoViewer.k1() / bitmapHeight);
                }
            }
            photoViewer.f35676e6 = min2 / min;
            Rect rect = photoViewer.f35795s2;
            photoViewer.f35658c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f35754n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f35772p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.v6.f33573g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f35772p6.setDuration(200L);
        photoViewer.f35772p6.addListener(new k50(this, 12));
        photoViewer.f35772p6.start();
    }
}
