package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class fs0 extends AnimatorListenerAdapter {
    public final float f38230a;
    public final Runnable f38231b;
    public final PhotoViewer f38232c;

    public fs0(PhotoViewer photoViewer, float f9, Runnable runnable) {
        this.f38232c = photoViewer;
        this.f38230a = f9;
        this.f38231b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f38232c;
        photoViewer.f35752l6 = null;
        photoViewer.f35662b6 = 0.0f;
        photoViewer.X5 = 0.0f;
        photoViewer.c6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f35652a6 = r22;
        photoViewer.W5 = r22;
        photoViewer.f35647a0.invalidate();
        CropAreaView cropAreaView = photoViewer.f35866y1.f31657b.f49953a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f26372j0 = 0.0f;
        cropAreaView.f26373k0 = r23;
        cropAreaView.f26374l0 = 0.0f;
        cropAreaView.m0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.f35866y1.f31658c.setRotated(false);
        float f9 = this.f38230a;
        if (Math.abs(f9) > 0.0f) {
            org.telegram.ui.Components.pe0 pe0Var = photoViewer.f35866y1;
            wf.e eVar = pe0Var.f31658c;
            if (eVar != null) {
                eVar.b(0.0f);
                eVar.setRotated(false);
            }
            if (pe0Var.f31657b.m(f9)) {
                photoViewer.X0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.f23459zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.X0.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.T4.f41222c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f38231b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
