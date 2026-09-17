package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class lt0 extends AnimatorListenerAdapter {
    public final float f35620a;
    public final Runnable f35621b;
    public final PhotoViewer f35622c;

    public lt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f35622c = photoViewer;
        this.f35620a = f7;
        this.f35621b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f35622c;
        photoViewer.f31050p6 = null;
        photoViewer.f30965f6 = 0.0f;
        photoViewer.f30928b6 = 0.0f;
        photoViewer.f30973g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f30956e6 = r22;
        photoViewer.f30918a6 = r22;
        photoViewer.f30950e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f28369b.f14110a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f22030n0 = 0.0f;
        cropAreaView.f22031o0 = r23;
        cropAreaView.f22032p0 = 0.0f;
        cropAreaView.f22033q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f28370c.setRotated(false);
        float f7 = this.f35620a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            lg.f fVar = ue0Var.f28370c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ue0Var.f28369b.m(f7)) {
                photoViewer.f30923b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f19272zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f30923b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f38225c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f35621b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
