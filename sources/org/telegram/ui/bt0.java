package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class bt0 extends AnimatorListenerAdapter {
    public final float f32467a;
    public final Runnable f32468b;
    public final PhotoViewer f32469c;

    public bt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f32469c = photoViewer;
        this.f32467a = f7;
        this.f32468b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f32469c;
        photoViewer.f31309p6 = null;
        photoViewer.f31224f6 = 0.0f;
        photoViewer.f31187b6 = 0.0f;
        photoViewer.f31232g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f31215e6 = q22;
        photoViewer.f31177a6 = q22;
        photoViewer.f31209e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f23931b.f14308a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f22228n0 = 0.0f;
        cropAreaView.f22229o0 = q23;
        cropAreaView.f22230p0 = 0.0f;
        cropAreaView.f22231q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f23932c.setRotated(false);
        float f7 = this.f32467a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
            lg.f fVar = ef0Var.f23932c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ef0Var.f23931b.m(f7)) {
                photoViewer.f31182b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f19456zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f31182b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f35142c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f32468b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
