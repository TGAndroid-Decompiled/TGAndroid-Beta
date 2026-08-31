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
    public final int f36684a;
    public final PhotoViewer f36685b;

    public et0(PhotoViewer photoViewer, int i10) {
        this.f36685b = photoViewer;
        this.f36684a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f36685b;
        photoViewer.f34344n6 = null;
        photoViewer.M0.setVisibility(8);
        photoViewer.P0.setVisibility(8);
        photoViewer.f34312k0.setVisibility(8);
        photoViewer.C.setVisibility(8);
        photoViewer.f34231b1.setVisibility(8);
        photoViewer.f34241c1.setVisibility(8);
        photoViewer.f34249d1.setVisibility(8);
        org.telegram.ui.Components.af0 af0Var = photoViewer.f34450z1;
        if (af0Var != null) {
            af0Var.setVisibility(4);
        }
        photoViewer.l1.setVisibility(8);
        photoViewer.l1.setAlpha(0.0f);
        photoViewer.l1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.L0.setRotationX(0.0f);
        photoViewer.l1.setEnabled(false);
        photoViewer.H = false;
        if (photoViewer.f34269f2) {
            photoViewer.N1.setVisibility(4);
        }
        int i12 = photoViewer.Z1;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f34255d7.size() > 1)) {
            photoViewer.K0.setVisibility(8);
            photoViewer.L0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.z4.getBitmap();
        if (photoViewer.Z1 == 11) {
            photoViewer.f34273f6 = photoViewer.V5;
            photoViewer.e6 = photoViewer.U5;
            photoViewer.f34282g6 = photoViewer.X5;
            photoViewer.f34291h6 = photoViewer.Y5;
            photoViewer.f34245c6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.z4.getBitmapWidth();
            float bitmapHeight = photoViewer.z4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.Z1 == 1) {
                photoViewer.f34226a6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f34384s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f34226a6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.U4.f43995c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f34379r4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f34379r4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f34236b6 = min2 / min;
            Rect rect = photoViewer.f34358p2;
            photoViewer.Z5 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f34318k6 = System.currentTimeMillis();
            photoViewer.O6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f34334m6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.n6.f29416g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.F1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f34334m6.setDuration(200L);
        photoViewer.f34334m6.addListener(new ns0(this, 2));
        photoViewer.f34334m6.start();
    }
}
