package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class jt0 extends AnimatorListenerAdapter {
    public final float f34941a;
    public final Runnable f34942b;
    public final PhotoViewer f34943c;

    public jt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f34943c = photoViewer;
        this.f34941a = f7;
        this.f34942b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f34943c;
        photoViewer.f31281p6 = null;
        photoViewer.f31196f6 = 0.0f;
        photoViewer.f31159b6 = 0.0f;
        photoViewer.f31204g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f31187e6 = q22;
        photoViewer.f31149a6 = q22;
        photoViewer.f31181e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f23571b.f14256a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f22206n0 = 0.0f;
        cropAreaView.f22207o0 = q23;
        cropAreaView.f22208p0 = 0.0f;
        cropAreaView.f22209q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f23572c.setRotated(false);
        float f7 = this.f34941a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.df0 df0Var = photoViewer.C1;
            lg.f fVar = df0Var.f23572c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (df0Var.f23571b.m(f7)) {
                photoViewer.f31154b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f19473zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f31154b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f37499c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f34942b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
