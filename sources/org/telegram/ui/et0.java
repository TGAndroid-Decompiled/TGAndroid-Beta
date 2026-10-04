package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class et0 extends AnimatorListenerAdapter {
    public final float f36087a;
    public final Runnable f36088b;
    public final PhotoViewer f36089c;

    public et0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f36089c = photoViewer;
        this.f36087a = f7;
        this.f36088b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f36089c;
        photoViewer.f33994p6 = null;
        photoViewer.f33909f6 = 0.0f;
        photoViewer.f33871b6 = 0.0f;
        photoViewer.f33917g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33900e6 = r22;
        photoViewer.f33861a6 = r22;
        photoViewer.f33894e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f26850b.f15574a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24145n0 = 0.0f;
        cropAreaView.f24146o0 = r23;
        cropAreaView.f24147p0 = 0.0f;
        cropAreaView.f24148q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f26851c.setRotated(false);
        float f7 = this.f36087a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.gf0 gf0Var = photoViewer.C1;
            lg.f fVar = gf0Var.f26851c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (gf0Var.f26850b.m(f7)) {
                photoViewer.f33866b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f21232zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33866b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f39040c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f36088b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
