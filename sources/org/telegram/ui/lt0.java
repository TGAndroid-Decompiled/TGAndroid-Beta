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
public final class lt0 extends AnimatorListenerAdapter {
    public final int f41261a;
    public final PhotoViewer f41262b;

    public lt0(PhotoViewer photoViewer, int i10) {
        this.f41262b = photoViewer;
        this.f41261a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f41262b;
        hu0 hu0Var = photoViewer.X4;
        org.telegram.ui.Components.i81 i81Var = null;
        photoViewer.f35780q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f35748n0.setVisibility(8);
        photoViewer.f35671e1.setVisibility(8);
        photoViewer.f35681f1.setVisibility(8);
        photoViewer.f35689g1.setVisibility(8);
        photoViewer.f35758o1.setVisibility(8);
        photoViewer.f35758o1.setAlpha(0.0f);
        photoViewer.f35758o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f35758o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f35707i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f35654c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.v3();
        }
        if (photoViewer.f35654c2 == 11) {
            photoViewer.f35711i6 = photoViewer.Y5;
            photoViewer.f35702h6 = photoViewer.X5;
            photoViewer.f35720j6 = photoViewer.f35638a6;
            photoViewer.f35729k6 = photoViewer.f35648b6;
            photoViewer.f35686f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f35785r1) {
            org.telegram.ui.Components.pf0 pf0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f35654c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            ng.g gVar = photoViewer.D1;
            if (photoViewer.f35785r1) {
                i81Var = (org.telegram.ui.Components.i81) photoViewer.B2;
            }
            pf0Var.b(bitmap, orientation, z10, false, gVar, i81Var, hu0Var.f39990c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = hu0Var.f39990c;
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
            float min = Math.min(photoViewer.m1(photoViewer.f35815u4) / f7, photoViewer.k1() / f10);
            float min2 = Math.min(photoViewer.m1(1) / f7, photoViewer.j1(1, false) / f10);
            if (photoViewer.f35654c2 == 1) {
                float min3 = Math.min(photoViewer.m1(1), photoViewer.j1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f35676e6 = min2 / min;
            Rect rect = photoViewer.f35795s2;
            photoViewer.f35658c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f35792s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f35667d6 = i13 + i10;
            photoViewer.f35754n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f35772p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.v6.f33573g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f35772p6.setDuration(200L);
        photoViewer.f35772p6.addListener(new k50(this, 11));
        photoViewer.f35772p6.start();
    }
}
