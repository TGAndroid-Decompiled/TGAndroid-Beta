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
public final class ot0 extends AnimatorListenerAdapter {
    public final int f36345a;
    public final PhotoViewer f36346b;

    public ot0(PhotoViewer photoViewer, int i10) {
        this.f36346b = photoViewer;
        this.f36345a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f36346b;
        ku0 ku0Var = photoViewer.X4;
        org.telegram.ui.Components.i71 i71Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f31301n0.setVisibility(8);
        photoViewer.f31225e1.setVisibility(8);
        photoViewer.f31234f1.setVisibility(8);
        photoViewer.f31242g1.setVisibility(8);
        photoViewer.f31311o1.setVisibility(8);
        photoViewer.f31311o1.setAlpha(0.0f);
        photoViewer.f31311o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f31311o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f31261i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f31208c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31248g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.r3();
        }
        if (photoViewer.f31208c2 == 11) {
            photoViewer.f31265i6 = photoViewer.Y5;
            photoViewer.f31256h6 = photoViewer.X5;
            photoViewer.f31273j6 = photoViewer.f31192a6;
            photoViewer.f31282k6 = photoViewer.f31202b6;
            photoViewer.f31239f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f31337r1) {
            org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f31208c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg.g gVar = photoViewer.D1;
            if (photoViewer.f31337r1) {
                i71Var = (org.telegram.ui.Components.i71) photoViewer.B2;
            }
            ef0Var.b(bitmap, orientation, z10, false, gVar, i71Var, ku0Var.f35175c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = ku0Var.f35175c;
            if (cropState != null) {
                int i12 = cropState.transformRotation;
                if (i12 == 90 || i12 == 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
                bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
            }
            float f7 = bitmapWidth;
            float f10 = bitmapHeight;
            float min = Math.min(photoViewer.k1(photoViewer.f31368u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f31208c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f31230e6 = min2 / min;
            Rect rect = photoViewer.f31348s2;
            photoViewer.f31212c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f31345s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f31221d6 = i13 + i10;
            photoViewer.f31307n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31324p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.s6.f28165g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f31324p6.setDuration(200L);
        photoViewer.f31324p6.addListener(new xo0(this, 3));
        photoViewer.f31324p6.start();
    }
}
