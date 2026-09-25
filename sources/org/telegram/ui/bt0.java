package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class bt0 extends AnimatorListenerAdapter {
    public final float f32482a;
    public final Runnable f32483b;
    public final PhotoViewer f32484c;

    public bt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f32484c = photoViewer;
        this.f32482a = f7;
        this.f32483b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f32484c;
        photoViewer.f31324p6 = null;
        photoViewer.f31239f6 = 0.0f;
        photoViewer.f31202b6 = 0.0f;
        photoViewer.f31247g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f31230e6 = q22;
        photoViewer.f31192a6 = q22;
        photoViewer.f31224e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f23948b.f14323a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f22243n0 = 0.0f;
        cropAreaView.f22244o0 = q23;
        cropAreaView.f22245p0 = 0.0f;
        cropAreaView.f22246q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f23949c.setRotated(false);
        float f7 = this.f32482a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
            lg.f fVar = ef0Var.f23949c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ef0Var.f23948b.m(f7)) {
                photoViewer.f31197b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f19471zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f31197b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f35175c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f32483b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
