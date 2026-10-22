package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ps0 extends AnimatorListenerAdapter {
    public final float f40293a;
    public final Runnable f40294b;
    public final PhotoViewer f40295c;

    public ps0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f40295c = photoViewer;
        this.f40293a = f7;
        this.f40294b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f40295c;
        photoViewer.f33383p6 = null;
        photoViewer.f33297f6 = 0.0f;
        photoViewer.f33260b6 = 0.0f;
        photoViewer.f33305g6 = 0.0f;
        float t22 = photoViewer.t2(false);
        photoViewer.f33288e6 = t22;
        photoViewer.f33250a6 = t22;
        photoViewer.f33282e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f29040b.f16917a;
        float t23 = photoViewer.t2(false);
        cropAreaView.f24202n0 = 0.0f;
        cropAreaView.f24203o0 = t23;
        cropAreaView.f24204p0 = 0.0f;
        cropAreaView.f24205q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f29041c.setRotated(false);
        float f7 = this.f40293a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
            mg.f fVar = of0Var.f29041c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (of0Var.f29040b.m(f7)) {
                photoViewer.f33255b1.setColorFilter(new PorterDuffColorFilter(photoViewer.A1(org.telegram.ui.ActionBar.h6.f21406zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33255b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f43554c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f40294b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
