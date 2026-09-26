package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class bt0 extends AnimatorListenerAdapter {
    public final float f32481a;
    public final Runnable f32482b;
    public final PhotoViewer f32483c;

    public bt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f32483c = photoViewer;
        this.f32481a = f7;
        this.f32482b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f32483c;
        photoViewer.f31323p6 = null;
        photoViewer.f31238f6 = 0.0f;
        photoViewer.f31201b6 = 0.0f;
        photoViewer.f31246g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f31229e6 = q22;
        photoViewer.f31191a6 = q22;
        photoViewer.f31223e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f23947b.f14323a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f22242n0 = 0.0f;
        cropAreaView.f22243o0 = q23;
        cropAreaView.f22244p0 = 0.0f;
        cropAreaView.f22245q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f23948c.setRotated(false);
        float f7 = this.f32481a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
            lg.f fVar = ef0Var.f23948c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ef0Var.f23947b.m(f7)) {
                photoViewer.f31196b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f19470zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f31196b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f35174c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f32482b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
