package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ps0 extends AnimatorListenerAdapter {
    public final float f40294a;
    public final Runnable f40295b;
    public final PhotoViewer f40296c;

    public ps0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f40296c = photoViewer;
        this.f40294a = f7;
        this.f40295b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f40296c;
        photoViewer.f33384p6 = null;
        photoViewer.f33298f6 = 0.0f;
        photoViewer.f33261b6 = 0.0f;
        photoViewer.f33306g6 = 0.0f;
        float t22 = photoViewer.t2(false);
        photoViewer.f33289e6 = t22;
        photoViewer.f33251a6 = t22;
        photoViewer.f33283e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f29041b.f16917a;
        float t23 = photoViewer.t2(false);
        cropAreaView.f24203n0 = 0.0f;
        cropAreaView.f24204o0 = t23;
        cropAreaView.f24205p0 = 0.0f;
        cropAreaView.f24206q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f29042c.setRotated(false);
        float f7 = this.f40294a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
            mg.f fVar = of0Var.f29042c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (of0Var.f29041b.m(f7)) {
                photoViewer.f33256b1.setColorFilter(new PorterDuffColorFilter(photoViewer.A1(org.telegram.ui.ActionBar.h6.f21407zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33256b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f43555c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f40295b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
