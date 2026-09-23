package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ct0 extends AnimatorListenerAdapter {
    public final float f32403a;
    public final Runnable f32404b;
    public final PhotoViewer f32405c;

    public ct0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f32405c = photoViewer;
        this.f32403a = f7;
        this.f32404b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f32405c;
        photoViewer.f31008p6 = null;
        photoViewer.f30923f6 = 0.0f;
        photoViewer.f30886b6 = 0.0f;
        photoViewer.f30931g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f30914e6 = q22;
        photoViewer.f30876a6 = q22;
        photoViewer.f30908e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f28468b.f14088a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f21991n0 = 0.0f;
        cropAreaView.f21992o0 = q23;
        cropAreaView.f21993p0 = 0.0f;
        cropAreaView.f21994q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f28469c.setRotated(false);
        float f7 = this.f32403a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            lg.f fVar = ue0Var.f28469c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ue0Var.f28468b.m(f7)) {
                photoViewer.f30881b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f19198zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f30881b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f35092c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f32404b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
