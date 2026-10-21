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
    public final int f36448a;
    public final PhotoViewer f36449b;

    public dt0(PhotoViewer photoViewer, int i10) {
        this.f36449b = photoViewer;
        this.f36448a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f36449b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33357n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f33280e1.setVisibility(8);
        photoViewer.f33289f1.setVisibility(8);
        photoViewer.f33297g1.setVisibility(8);
        org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
        if (of0Var != null) {
            of0Var.setVisibility(4);
        }
        photoViewer.f33367o1.setVisibility(8);
        photoViewer.f33367o1.setAlpha(0.0f);
        photoViewer.f33367o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33367o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33316i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f33263c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f33303g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.u3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f33263c2 == 11) {
            photoViewer.f33320i6 = photoViewer.Y5;
            photoViewer.f33311h6 = photoViewer.X5;
            photoViewer.f33329j6 = photoViewer.f33247a6;
            photoViewer.f33338k6 = photoViewer.f33257b6;
            photoViewer.f33294f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.l1(2) / bitmapWidth, photoViewer.i1(2, false) / bitmapHeight);
            if (photoViewer.f33263c2 == 1) {
                photoViewer.f33276d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.m1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f33401s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f33276d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f43551c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.l1(photoViewer.f33424u4) / bitmapHeight, photoViewer.j1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.l1(photoViewer.f33424u4) / bitmapWidth, photoViewer.j1() / bitmapHeight);
                }
            }
            photoViewer.f33285e6 = min2 / min;
            Rect rect = photoViewer.f33404s2;
            photoViewer.f33267c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f33363n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33380p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.t6.f30448g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f33380p6.setDuration(200L);
        photoViewer.f33380p6.addListener(new zb0(this, 9));
        photoViewer.f33380p6.start();
    }
}
