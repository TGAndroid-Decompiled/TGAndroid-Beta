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
public final class jt0 extends AnimatorListenerAdapter {
    public final int f40743a;
    public final PhotoViewer f40744b;

    public jt0(PhotoViewer photoViewer, int i10) {
        this.f40744b = photoViewer;
        this.f40743a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f40744b;
        fu0 fu0Var = photoViewer.X4;
        org.telegram.ui.Components.h81 h81Var = null;
        photoViewer.f35753q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f35721n0.setVisibility(8);
        photoViewer.f35644e1.setVisibility(8);
        photoViewer.f35654f1.setVisibility(8);
        photoViewer.f35662g1.setVisibility(8);
        photoViewer.f35731o1.setVisibility(8);
        photoViewer.f35731o1.setAlpha(0.0f);
        photoViewer.f35731o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f35731o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f35680i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f35627c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.u3();
        }
        if (photoViewer.f35627c2 == 11) {
            photoViewer.f35684i6 = photoViewer.Y5;
            photoViewer.f35675h6 = photoViewer.X5;
            photoViewer.f35693j6 = photoViewer.f35611a6;
            photoViewer.f35702k6 = photoViewer.f35621b6;
            photoViewer.f35659f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f35758r1) {
            org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f35627c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            ng.g gVar = photoViewer.D1;
            if (photoViewer.f35758r1) {
                h81Var = (org.telegram.ui.Components.h81) photoViewer.B2;
            }
            of0Var.b(bitmap, orientation, z10, false, gVar, h81Var, fu0Var.f39472c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = fu0Var.f39472c;
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
            float min = Math.min(photoViewer.l1(photoViewer.f35788u4) / f7, photoViewer.j1() / f10);
            float min2 = Math.min(photoViewer.l1(1) / f7, photoViewer.i1(1, false) / f10);
            if (photoViewer.f35627c2 == 1) {
                float min3 = Math.min(photoViewer.l1(1), photoViewer.i1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f35649e6 = min2 / min;
            Rect rect = photoViewer.f35768s2;
            photoViewer.f35631c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f35765s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f35640d6 = i13 + i10;
            photoViewer.f35727n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f35745p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.v6.f33580g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f35745p6.setDuration(200L);
        photoViewer.f35745p6.addListener(new i50(this, 11));
        photoViewer.f35745p6.start();
    }
}
