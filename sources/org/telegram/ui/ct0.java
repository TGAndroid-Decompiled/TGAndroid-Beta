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
    public final int f36055a;
    public final PhotoViewer f36056b;

    public ct0(PhotoViewer photoViewer, int i10) {
        this.f36056b = photoViewer;
        this.f36055a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f36056b;
        yt0 yt0Var = photoViewer.X4;
        org.telegram.ui.Components.r71 r71Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33361n0.setVisibility(8);
        photoViewer.f33284e1.setVisibility(8);
        photoViewer.f33293f1.setVisibility(8);
        photoViewer.f33301g1.setVisibility(8);
        photoViewer.f33371o1.setVisibility(8);
        photoViewer.f33371o1.setAlpha(0.0f);
        photoViewer.f33371o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33371o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33320i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f33267c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33307g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.u3();
        }
        if (photoViewer.f33267c2 == 11) {
            photoViewer.f33324i6 = photoViewer.Y5;
            photoViewer.f33315h6 = photoViewer.X5;
            photoViewer.f33333j6 = photoViewer.f33251a6;
            photoViewer.f33342k6 = photoViewer.f33261b6;
            photoViewer.f33298f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f33397r1) {
            org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f33267c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            mg.g gVar = photoViewer.D1;
            if (photoViewer.f33397r1) {
                r71Var = (org.telegram.ui.Components.r71) photoViewer.B2;
            }
            of0Var.b(bitmap, orientation, z10, false, gVar, r71Var, yt0Var.f43555c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = yt0Var.f43555c;
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
            float min = Math.min(photoViewer.l1(photoViewer.f33428u4) / f7, photoViewer.j1() / f10);
            float min2 = Math.min(photoViewer.l1(1) / f7, photoViewer.i1(1, false) / f10);
            if (photoViewer.f33267c2 == 1) {
                float min3 = Math.min(photoViewer.l1(1), photoViewer.i1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f33289e6 = min2 / min;
            Rect rect = photoViewer.f33408s2;
            photoViewer.f33271c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f33405s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f33280d6 = i13 + i10;
            photoViewer.f33367n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33384p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.t6.f30452g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f33384p6.setDuration(200L);
        photoViewer.f33384p6.addListener(new zb0(this, 8));
        photoViewer.f33384p6.start();
    }
}
