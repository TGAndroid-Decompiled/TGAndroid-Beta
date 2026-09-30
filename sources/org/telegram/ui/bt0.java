package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class bt0 extends AnimatorListenerAdapter {
    public final float f32564a;
    public final Runnable f32565b;
    public final PhotoViewer f32566c;

    public bt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f32566c = photoViewer;
        this.f32564a = f7;
        this.f32565b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f32566c;
        photoViewer.f31397p6 = null;
        photoViewer.f31312f6 = 0.0f;
        photoViewer.f31275b6 = 0.0f;
        photoViewer.f31320g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f31303e6 = q22;
        photoViewer.f31265a6 = q22;
        photoViewer.f31297e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f24856b.f14339a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f22264n0 = 0.0f;
        cropAreaView.f22265o0 = q23;
        cropAreaView.f22266p0 = 0.0f;
        cropAreaView.f22267q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f24857c.setRotated(false);
        float f7 = this.f32564a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.hf0 hf0Var = photoViewer.C1;
            lg.f fVar = hf0Var.f24857c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (hf0Var.f24856b.m(f7)) {
                photoViewer.f31270b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f19487zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f31270b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f35263c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f32565b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
