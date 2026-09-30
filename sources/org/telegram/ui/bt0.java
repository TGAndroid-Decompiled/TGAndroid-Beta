package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class bt0 extends AnimatorListenerAdapter {
    public final float f32483a;
    public final Runnable f32484b;
    public final PhotoViewer f32485c;

    public bt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f32485c = photoViewer;
        this.f32483a = f7;
        this.f32484b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f32485c;
        photoViewer.f31325p6 = null;
        photoViewer.f31240f6 = 0.0f;
        photoViewer.f31203b6 = 0.0f;
        photoViewer.f31248g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f31231e6 = r22;
        photoViewer.f31193a6 = r22;
        photoViewer.f31225e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f24542b.f14324a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f22244n0 = 0.0f;
        cropAreaView.f22245o0 = r23;
        cropAreaView.f22246p0 = 0.0f;
        cropAreaView.f22247q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f24543c.setRotated(false);
        float f7 = this.f32483a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.gf0 gf0Var = photoViewer.C1;
            lg.f fVar = gf0Var.f24543c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (gf0Var.f24542b.m(f7)) {
                photoViewer.f31198b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f19472zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f31198b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f35157c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f32484b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
