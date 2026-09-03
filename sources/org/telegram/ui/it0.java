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
    public final int f37777a;
    public final PhotoViewer f37778b;

    public it0(PhotoViewer photoViewer, int i10) {
        this.f37778b = photoViewer;
        this.f37777a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z4;
        int i10;
        PhotoViewer photoViewer = this.f37778b;
        eu0 eu0Var = photoViewer.U4;
        org.telegram.ui.Components.x61 x61Var = null;
        photoViewer.f34344n6 = null;
        photoViewer.M0.setVisibility(8);
        photoViewer.P0.setVisibility(8);
        photoViewer.f34312k0.setVisibility(8);
        photoViewer.f34231b1.setVisibility(8);
        photoViewer.f34241c1.setVisibility(8);
        photoViewer.f34249d1.setVisibility(8);
        photoViewer.l1.setVisibility(8);
        photoViewer.l1.setAlpha(0.0f);
        photoViewer.l1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.L0.setRotationX(0.0f);
        photoViewer.l1.setEnabled(false);
        photoViewer.H = false;
        if (photoViewer.f34269f2) {
            photoViewer.N1.setVisibility(4);
        }
        int i11 = photoViewer.Z1;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f34255d7.size() > 1)) {
            photoViewer.K0.setVisibility(8);
            photoViewer.L0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.Z1 == 11) {
            photoViewer.f34273f6 = photoViewer.V5;
            photoViewer.e6 = photoViewer.U5;
            photoViewer.f34282g6 = photoViewer.X5;
            photoViewer.f34291h6 = photoViewer.Y5;
            photoViewer.f34245c6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.z4.getBitmap();
        if (bitmap != null || photoViewer.f34348o1) {
            org.telegram.ui.Components.af0 af0Var = photoViewer.f34450z1;
            int orientation = photoViewer.z4.getOrientation();
            if (photoViewer.Z1 != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            zf.f fVar = photoViewer.A1;
            if (photoViewer.f34348o1) {
                x61Var = (org.telegram.ui.Components.x61) photoViewer.f34442y2;
            }
            af0Var.b(bitmap, orientation, z4, false, fVar, x61Var, eu0Var.f36590c);
            photoViewer.f34450z1.a();
            int bitmapWidth = photoViewer.z4.getBitmapWidth();
            int bitmapHeight = photoViewer.z4.getBitmapHeight();
            MediaController.CropState cropState = eu0Var.f36590c;
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
            float min = Math.min(photoViewer.k1(photoViewer.f34379r4) / f10, photoViewer.i1() / f11);
            float min2 = Math.min(photoViewer.k1(1) / f10, photoViewer.h1(1, false) / f11);
            if (photoViewer.Z1 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.f34236b6 = min2 / min;
            Rect rect = photoViewer.f34358p2;
            photoViewer.Z5 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f34384s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f34226a6 = i13 + i10;
            photoViewer.f34318k6 = System.currentTimeMillis();
            photoViewer.O6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f34334m6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.R0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.n6.f29399g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.f34450z1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f34334m6.setDuration(200L);
        photoViewer.f34334m6.addListener(new ss0(this, 1));
        photoViewer.f34334m6.start();
    }
}
