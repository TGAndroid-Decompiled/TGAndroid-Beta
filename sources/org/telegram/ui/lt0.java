package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class lt0 extends AnimatorListenerAdapter {
    public final float f35625a;
    public final Runnable f35626b;
    public final PhotoViewer f35627c;

    public lt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f35627c = photoViewer;
        this.f35625a = f7;
        this.f35626b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f35627c;
        photoViewer.f31054p6 = null;
        photoViewer.f30969f6 = 0.0f;
        photoViewer.f30932b6 = 0.0f;
        photoViewer.f30977g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f30960e6 = q22;
        photoViewer.f30922a6 = q22;
        photoViewer.f30954e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f28372b.f14110a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f22033n0 = 0.0f;
        cropAreaView.f22034o0 = q23;
        cropAreaView.f22035p0 = 0.0f;
        cropAreaView.f22036q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f28373c.setRotated(false);
        float f7 = this.f35625a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            lg.f fVar = ue0Var.f28373c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ue0Var.f28372b.m(f7)) {
                photoViewer.f30927b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f19273zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f30927b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f38230c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f35626b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
