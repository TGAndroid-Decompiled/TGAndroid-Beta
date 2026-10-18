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
public final class et0 extends AnimatorListenerAdapter {
    public final int f36612a;
    public final PhotoViewer f36613b;

    public et0(PhotoViewer photoViewer, int i10) {
        this.f36613b = photoViewer;
        this.f36612a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f36613b;
        au0 au0Var = photoViewer.X4;
        org.telegram.ui.Components.p71 p71Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33351n0.setVisibility(8);
        photoViewer.f33274e1.setVisibility(8);
        photoViewer.f33283f1.setVisibility(8);
        photoViewer.f33291g1.setVisibility(8);
        photoViewer.f33361o1.setVisibility(8);
        photoViewer.f33361o1.setAlpha(0.0f);
        photoViewer.f33361o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33361o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33310i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f33257c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33297g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.f33257c2 == 11) {
            photoViewer.f33314i6 = photoViewer.Y5;
            photoViewer.f33305h6 = photoViewer.X5;
            photoViewer.f33323j6 = photoViewer.f33241a6;
            photoViewer.f33332k6 = photoViewer.f33251b6;
            photoViewer.f33288f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f33387r1) {
            org.telegram.ui.Components.nf0 nf0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f33257c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            mg.g gVar = photoViewer.D1;
            if (photoViewer.f33387r1) {
                p71Var = (org.telegram.ui.Components.p71) photoViewer.B2;
            }
            nf0Var.b(bitmap, orientation, z10, false, gVar, p71Var, au0Var.f35519c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = au0Var.f35519c;
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
            float min = Math.min(photoViewer.k1(photoViewer.f33418u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f33257c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f33279e6 = min2 / min;
            Rect rect = photoViewer.f33398s2;
            photoViewer.f33261c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f33395s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f33270d6 = i13 + i10;
            photoViewer.f33357n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33374p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.t6.f30482g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f33374p6.setDuration(200L);
        photoViewer.f33374p6.addListener(new bc0(this, 8));
        photoViewer.f33374p6.start();
    }
}
