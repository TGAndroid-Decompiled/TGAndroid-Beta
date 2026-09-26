package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class bt0 extends AnimatorListenerAdapter {
    public final float f32480a;
    public final Runnable f32481b;
    public final PhotoViewer f32482c;

    public bt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f32482c = photoViewer;
        this.f32480a = f7;
        this.f32481b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f32482c;
        photoViewer.f31322p6 = null;
        photoViewer.f31237f6 = 0.0f;
        photoViewer.f31200b6 = 0.0f;
        photoViewer.f31245g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f31228e6 = q22;
        photoViewer.f31190a6 = q22;
        photoViewer.f31222e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f24262b.f14323a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f22242n0 = 0.0f;
        cropAreaView.f22243o0 = q23;
        cropAreaView.f22244p0 = 0.0f;
        cropAreaView.f22245q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f24263c.setRotated(false);
        float f7 = this.f32480a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ff0 ff0Var = photoViewer.C1;
            lg.f fVar = ff0Var.f24263c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ff0Var.f24262b.m(f7)) {
                photoViewer.f31195b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f19470zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f31195b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f35173c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f32481b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
