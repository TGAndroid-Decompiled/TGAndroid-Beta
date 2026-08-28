package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class gs0 extends AnimatorListenerAdapter {
    public final float f38598a;
    public final Runnable f38599b;
    public final PhotoViewer f38600c;

    public gs0(PhotoViewer photoViewer, float f10, Runnable runnable) {
        this.f38600c = photoViewer;
        this.f38598a = f10;
        this.f38599b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f38600c;
        photoViewer.f35686l6 = null;
        photoViewer.f35594b6 = 0.0f;
        photoViewer.X5 = 0.0f;
        photoViewer.f35604c6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f35584a6 = r22;
        photoViewer.W5 = r22;
        photoViewer.f35580a0.invalidate();
        CropAreaView cropAreaView = photoViewer.f35799y1.f27183b.f47904a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f26361j0 = 0.0f;
        cropAreaView.f26362k0 = r23;
        cropAreaView.f26363l0 = 0.0f;
        cropAreaView.m0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.f35799y1.f27184c.setRotated(false);
        float f10 = this.f38598a;
        if (Math.abs(f10) > 0.0f) {
            org.telegram.ui.Components.be0 be0Var = photoViewer.f35799y1;
            tf.e eVar = be0Var.f27184c;
            if (eVar != null) {
                eVar.b(0.0f);
                eVar.setRotated(false);
            }
            if (be0Var.f27183b.m(f10)) {
                photoViewer.X0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.f6.f23395zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.X0.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.T4.f42197c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f38599b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
