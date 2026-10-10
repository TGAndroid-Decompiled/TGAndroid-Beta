package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class jt0 extends AnimatorListenerAdapter {
    public final float f39065a;
    public final Runnable f39066b;
    public final PhotoViewer f39067c;

    public jt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f39067c = photoViewer;
        this.f39065a = f7;
        this.f39066b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f39067c;
        photoViewer.f34042p6 = null;
        photoViewer.f33957f6 = 0.0f;
        photoViewer.f33919b6 = 0.0f;
        photoViewer.f33965g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33948e6 = r22;
        photoViewer.f33909a6 = r22;
        photoViewer.f33942e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f32908b.f15576a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24153n0 = 0.0f;
        cropAreaView.f24154o0 = r23;
        cropAreaView.f24155p0 = 0.0f;
        cropAreaView.f24156q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f32909c.setRotated(false);
        float f7 = this.f39065a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.xf0 xf0Var = photoViewer.C1;
            lg.f fVar = xf0Var.f32909c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (xf0Var.f32908b.m(f7)) {
                photoViewer.f33914b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f21212zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33914b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f42170c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f39066b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
