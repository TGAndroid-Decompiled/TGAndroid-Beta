package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

public final class hs0 extends AnimatorListenerAdapter {

    public final float f38888a;

    public final Runnable f38889b;

    public final PhotoViewer f38890c;

    public hs0(PhotoViewer photoViewer, float f10, Runnable runnable) {
        this.f38890c = photoViewer;
        this.f38888a = f10;
        this.f38889b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f38890c;
        photoViewer.f35689l6 = null;
        photoViewer.f35597b6 = 0.0f;
        photoViewer.X5 = 0.0f;
        photoViewer.f35607c6 = 0.0f;
        float fR2 = photoViewer.r2(false);
        photoViewer.f35587a6 = fR2;
        photoViewer.W5 = fR2;
        photoViewer.f35583a0.invalidate();
        CropAreaView cropAreaView = photoViewer.f35802y1.f28602b.f48626a;
        float fR3 = photoViewer.r2(false);
        cropAreaView.f26357j0 = 0.0f;
        cropAreaView.f26358k0 = fR3;
        cropAreaView.f26359l0 = 0.0f;
        cropAreaView.m0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.f35802y1.f28603c.setRotated(false);
        float f10 = this.f38888a;
        if (Math.abs(f10) > 0.0f) {
            org.telegram.ui.Components.ge0 ge0Var = photoViewer.f35802y1;
            uf.e eVar = ge0Var.f28603c;
            if (eVar != null) {
                eVar.b(0.0f);
                eVar.setRotated(false);
            }
            if (ge0Var.f28602b.m(f10)) {
                photoViewer.X0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.f23449zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.X0.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.T4.f42331c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f38889b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
