package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class jt0 extends AnimatorListenerAdapter {
    public final float f34986a;
    public final Runnable f34987b;
    public final PhotoViewer f34988c;

    public jt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f34988c = photoViewer;
        this.f34986a = f7;
        this.f34987b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f34988c;
        photoViewer.f31321p6 = null;
        photoViewer.f31236f6 = 0.0f;
        photoViewer.f31199b6 = 0.0f;
        photoViewer.f31244g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f31227e6 = q22;
        photoViewer.f31189a6 = q22;
        photoViewer.f31221e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f23278b.f14292a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f22241n0 = 0.0f;
        cropAreaView.f22242o0 = q23;
        cropAreaView.f22243p0 = 0.0f;
        cropAreaView.f22244q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f23279c.setRotated(false);
        float f7 = this.f34986a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.cf0 cf0Var = photoViewer.C1;
            lg.f fVar = cf0Var.f23279c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (cf0Var.f23278b.m(f7)) {
                photoViewer.f31194b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f19505zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f31194b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f37554c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f34987b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
