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
public final class it0 extends AnimatorListenerAdapter {
    public final int f35025a;
    public final PhotoViewer f35026b;

    public it0(PhotoViewer photoViewer, int i10) {
        this.f35026b = photoViewer;
        this.f35025a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z4;
        int i10;
        PhotoViewer photoViewer = this.f35026b;
        eu0 eu0Var = photoViewer.U4;
        org.telegram.ui.Components.w61 w61Var = null;
        photoViewer.f31792n6 = null;
        photoViewer.M0.setVisibility(8);
        photoViewer.P0.setVisibility(8);
        photoViewer.f31760k0.setVisibility(8);
        photoViewer.f31680b1.setVisibility(8);
        photoViewer.f31690c1.setVisibility(8);
        photoViewer.f31698d1.setVisibility(8);
        photoViewer.l1.setVisibility(8);
        photoViewer.l1.setAlpha(0.0f);
        photoViewer.l1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.L0.setRotationX(0.0f);
        photoViewer.l1.setEnabled(false);
        photoViewer.H = false;
        if (photoViewer.f31717f2) {
            photoViewer.N1.setVisibility(4);
        }
        int i11 = photoViewer.Z1;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31704d7.size() > 1)) {
            photoViewer.K0.setVisibility(8);
            photoViewer.L0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.Z1 == 11) {
            photoViewer.f31721f6 = photoViewer.V5;
            photoViewer.e6 = photoViewer.U5;
            photoViewer.f31730g6 = photoViewer.X5;
            photoViewer.f31739h6 = photoViewer.Y5;
            photoViewer.f31694c6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.z4.getBitmap();
        if (bitmap != null || photoViewer.f31796o1) {
            org.telegram.ui.Components.ze0 ze0Var = photoViewer.f31898z1;
            int orientation = photoViewer.z4.getOrientation();
            if (photoViewer.Z1 != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            yf.f fVar = photoViewer.A1;
            if (photoViewer.f31796o1) {
                w61Var = (org.telegram.ui.Components.w61) photoViewer.f31890y2;
            }
            ze0Var.b(bitmap, orientation, z4, false, fVar, w61Var, eu0Var.f33855c);
            photoViewer.f31898z1.a();
            int bitmapWidth = photoViewer.z4.getBitmapWidth();
            int bitmapHeight = photoViewer.z4.getBitmapHeight();
            MediaController.CropState cropState = eu0Var.f33855c;
            if (cropState != null) {
                int i12 = cropState.transformRotation;
                if (i12 == 90 || i12 == 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
                bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
            }
            float f10 = bitmapWidth;
            float f11 = bitmapHeight;
            float min = Math.min(photoViewer.k1(photoViewer.f31827r4) / f10, photoViewer.i1() / f11);
            float min2 = Math.min(photoViewer.k1(1) / f10, photoViewer.h1(1, false) / f11);
            if (photoViewer.Z1 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.f31685b6 = min2 / min;
            Rect rect = photoViewer.f31806p2;
            photoViewer.Z5 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f31832s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f31675a6 = i13 + i10;
            photoViewer.f31766k6 = System.currentTimeMillis();
            photoViewer.O6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31782m6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.R0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.n6.f27199g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.f31898z1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f31782m6.setDuration(200L);
        photoViewer.f31782m6.addListener(new ss0(this, 1));
        photoViewer.f31782m6.start();
    }
}
