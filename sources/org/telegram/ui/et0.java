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
    public final int f36997a;
    public final PhotoViewer f36998b;

    public et0(PhotoViewer photoViewer, int i10) {
        this.f36998b = photoViewer;
        this.f36997a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f36998b;
        au0 au0Var = photoViewer.X4;
        org.telegram.ui.Components.y71 y71Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33660n0.setVisibility(8);
        photoViewer.f33583e1.setVisibility(8);
        photoViewer.f33592f1.setVisibility(8);
        photoViewer.f33600g1.setVisibility(8);
        photoViewer.f33670o1.setVisibility(8);
        photoViewer.f33670o1.setAlpha(0.0f);
        photoViewer.f33670o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33670o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33619i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f33566c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33606g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.u3();
        }
        if (photoViewer.f33566c2 == 11) {
            photoViewer.f33623i6 = photoViewer.Y5;
            photoViewer.f33614h6 = photoViewer.X5;
            photoViewer.f33632j6 = photoViewer.f33550a6;
            photoViewer.f33641k6 = photoViewer.f33560b6;
            photoViewer.f33597f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f33696r1) {
            org.telegram.ui.Components.qf0 qf0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f33566c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            mg.g gVar = photoViewer.D1;
            if (photoViewer.f33696r1) {
                y71Var = (org.telegram.ui.Components.y71) photoViewer.B2;
            }
            qf0Var.b(bitmap, orientation, z10, false, gVar, y71Var, au0Var.f35839c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = au0Var.f35839c;
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
            float min = Math.min(photoViewer.l1(photoViewer.f33727u4) / f7, photoViewer.j1() / f10);
            float min2 = Math.min(photoViewer.l1(1) / f7, photoViewer.i1(1, false) / f10);
            if (photoViewer.f33566c2 == 1) {
                float min3 = Math.min(photoViewer.l1(1), photoViewer.i1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f33588e6 = min2 / min;
            Rect rect = photoViewer.f33707s2;
            photoViewer.f33570c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f33704s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f33579d6 = i13 + i10;
            photoViewer.f33666n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33683p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.r6.f30077g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f33683p6.setDuration(200L);
        photoViewer.f33683p6.addListener(new v70(this, 9));
        photoViewer.f33683p6.start();
    }
}
