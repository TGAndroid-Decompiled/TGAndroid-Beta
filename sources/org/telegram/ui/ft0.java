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
public final class ft0 extends AnimatorListenerAdapter {
    public final int f37416a;
    public final PhotoViewer f37417b;

    public ft0(PhotoViewer photoViewer, int i10) {
        this.f37417b = photoViewer;
        this.f37416a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f37417b;
        bu0 bu0Var = photoViewer.X4;
        org.telegram.ui.Components.z71 z71Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33658n0.setVisibility(8);
        photoViewer.f33581e1.setVisibility(8);
        photoViewer.f33590f1.setVisibility(8);
        photoViewer.f33598g1.setVisibility(8);
        photoViewer.f33668o1.setVisibility(8);
        photoViewer.f33668o1.setAlpha(0.0f);
        photoViewer.f33668o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33668o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33617i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f33564c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33604g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.u3();
        }
        if (photoViewer.f33564c2 == 11) {
            photoViewer.f33621i6 = photoViewer.Y5;
            photoViewer.f33612h6 = photoViewer.X5;
            photoViewer.f33630j6 = photoViewer.f33548a6;
            photoViewer.f33639k6 = photoViewer.f33558b6;
            photoViewer.f33595f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f33694r1) {
            org.telegram.ui.Components.rf0 rf0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f33564c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            mg.g gVar = photoViewer.D1;
            if (photoViewer.f33694r1) {
                z71Var = (org.telegram.ui.Components.z71) photoViewer.B2;
            }
            rf0Var.b(bitmap, orientation, z10, false, gVar, z71Var, bu0Var.f36169c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = bu0Var.f36169c;
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
            float min = Math.min(photoViewer.l1(photoViewer.f33725u4) / f7, photoViewer.j1() / f10);
            float min2 = Math.min(photoViewer.l1(1) / f7, photoViewer.i1(1, false) / f10);
            if (photoViewer.f33564c2 == 1) {
                float min3 = Math.min(photoViewer.l1(1), photoViewer.i1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f33586e6 = min2 / min;
            Rect rect = photoViewer.f33705s2;
            photoViewer.f33568c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f33702s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f33577d6 = i13 + i10;
            photoViewer.f33664n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33681p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.t6.f30653g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f33681p6.setDuration(200L);
        photoViewer.f33681p6.addListener(new v70(this, 9));
        photoViewer.f33681p6.start();
    }
}
