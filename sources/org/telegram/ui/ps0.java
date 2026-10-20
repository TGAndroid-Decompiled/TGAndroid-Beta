package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ps0 extends AnimatorListenerAdapter {
    public final float f40290a;
    public final Runnable f40291b;
    public final PhotoViewer f40292c;

    public ps0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f40292c = photoViewer;
        this.f40290a = f7;
        this.f40291b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f40292c;
        photoViewer.f33379p6 = null;
        photoViewer.f33293f6 = 0.0f;
        photoViewer.f33256b6 = 0.0f;
        photoViewer.f33301g6 = 0.0f;
        float t22 = photoViewer.t2(false);
        photoViewer.f33284e6 = t22;
        photoViewer.f33246a6 = t22;
        photoViewer.f33278e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f29036b.f16917a;
        float t23 = photoViewer.t2(false);
        cropAreaView.f24199n0 = 0.0f;
        cropAreaView.f24200o0 = t23;
        cropAreaView.f24201p0 = 0.0f;
        cropAreaView.f24202q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f29037c.setRotated(false);
        float f7 = this.f40290a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
            mg.f fVar = of0Var.f29037c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (of0Var.f29036b.m(f7)) {
                photoViewer.f33251b1.setColorFilter(new PorterDuffColorFilter(photoViewer.A1(org.telegram.ui.ActionBar.h6.f21403zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33251b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f43551c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f40291b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
