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
    public final int f36449a;
    public final PhotoViewer f36450b;

    public ot0(PhotoViewer photoViewer, int i10) {
        this.f36450b = photoViewer;
        this.f36449a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f36450b;
        ku0 ku0Var = photoViewer.X4;
        org.telegram.ui.Components.l71 l71Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f31374n0.setVisibility(8);
        photoViewer.f31298e1.setVisibility(8);
        photoViewer.f31307f1.setVisibility(8);
        photoViewer.f31315g1.setVisibility(8);
        photoViewer.f31384o1.setVisibility(8);
        photoViewer.f31384o1.setAlpha(0.0f);
        photoViewer.f31384o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f31384o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f31334i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f31281c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31321g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.r3();
        }
        if (photoViewer.f31281c2 == 11) {
            photoViewer.f31338i6 = photoViewer.Y5;
            photoViewer.f31329h6 = photoViewer.X5;
            photoViewer.f31346j6 = photoViewer.f31265a6;
            photoViewer.f31355k6 = photoViewer.f31275b6;
            photoViewer.f31312f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f31410r1) {
            org.telegram.ui.Components.hf0 hf0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f31281c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg.g gVar = photoViewer.D1;
            if (photoViewer.f31410r1) {
                l71Var = (org.telegram.ui.Components.l71) photoViewer.B2;
            }
            hf0Var.b(bitmap, orientation, z10, false, gVar, l71Var, ku0Var.f35263c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = ku0Var.f35263c;
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
            float min = Math.min(photoViewer.k1(photoViewer.f31441u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f31281c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f31303e6 = min2 / min;
            Rect rect = photoViewer.f31421s2;
            photoViewer.f31285c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f31418s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f31294d6 = i13 + i10;
            photoViewer.f31380n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31397p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.s6.f28204g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f31397p6.setDuration(200L);
        photoViewer.f31397p6.addListener(new wo0(this, 3));
        photoViewer.f31397p6.start();
    }
}
