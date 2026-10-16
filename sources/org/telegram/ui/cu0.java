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
public final class cu0 extends AnimatorListenerAdapter {
    public final int f34794a;
    public final PhotoViewer f34795b;

    public cu0(PhotoViewer photoViewer, int i10) {
        this.f34795b = photoViewer;
        this.f34794a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f34795b;
        yu0 yu0Var = photoViewer.X4;
        org.telegram.ui.Components.y71 y71Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f32006n0.setVisibility(8);
        photoViewer.f31929e1.setVisibility(8);
        photoViewer.f31938f1.setVisibility(8);
        photoViewer.f31946g1.setVisibility(8);
        photoViewer.f32016o1.setVisibility(8);
        photoViewer.f32016o1.setAlpha(0.0f);
        photoViewer.f32016o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f32016o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f31965i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f31912c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31952g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.f31912c2 == 11) {
            photoViewer.f31969i6 = photoViewer.Y5;
            photoViewer.f31960h6 = photoViewer.X5;
            photoViewer.f31978j6 = photoViewer.f31896a6;
            photoViewer.f31987k6 = photoViewer.f31906b6;
            photoViewer.f31943f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f32042r1) {
            org.telegram.ui.Components.uf0 uf0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f31912c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            mg.g gVar = photoViewer.D1;
            if (photoViewer.f32042r1) {
                y71Var = (org.telegram.ui.Components.y71) photoViewer.B2;
            }
            uf0Var.b(bitmap, orientation, z10, false, gVar, y71Var, yu0Var.f41960c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = yu0Var.f41960c;
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
            float min = Math.min(photoViewer.k1(photoViewer.f32073u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f31912c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f31934e6 = min2 / min;
            Rect rect = photoViewer.f32053s2;
            photoViewer.f31916c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f32050s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f31925d6 = i13 + i10;
            photoViewer.f32012n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f32029p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.v6.f29579g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f32029p6.setDuration(200L);
        photoViewer.f32029p6.addListener(new kj0(this, 6));
        photoViewer.f32029p6.start();
    }
}
