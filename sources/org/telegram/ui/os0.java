package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class os0 extends AnimatorListenerAdapter {
    public final float f36972a;
    public final Runnable f36973b;
    public final PhotoViewer f36974c;

    public os0(PhotoViewer photoViewer, float f10, Runnable runnable) {
        this.f36974c = photoViewer;
        this.f36972a = f10;
        this.f36973b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f36974c;
        photoViewer.f31808m6 = null;
        photoViewer.f31720c6 = 0.0f;
        photoViewer.Y5 = 0.0f;
        photoViewer.f31729d6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f31711b6 = r22;
        photoViewer.X5 = r22;
        photoViewer.f31705b0.invalidate();
        CropAreaView cropAreaView = photoViewer.f31924z1.f31004b.f47246a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f23010k0 = 0.0f;
        cropAreaView.f23011l0 = r23;
        cropAreaView.m0 = 0.0f;
        cropAreaView.f23013n0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.f31924z1.f31005c.setRotated(false);
        float f10 = this.f36972a;
        if (Math.abs(f10) > 0.0f) {
            org.telegram.ui.Components.ye0 ye0Var = photoViewer.f31924z1;
            yf.e eVar = ye0Var.f31005c;
            if (eVar != null) {
                eVar.b(0.0f);
                eVar.setRotated(false);
            }
            if (ye0Var.f31004b.m(f10)) {
                photoViewer.Y0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f20304zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.Y0.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.U4.f40304c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f36973b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
