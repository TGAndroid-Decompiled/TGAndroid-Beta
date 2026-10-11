package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class it0 extends AnimatorListenerAdapter {
    public final float f38812a;
    public final Runnable f38813b;
    public final PhotoViewer f38814c;

    public it0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f38814c = photoViewer;
        this.f38812a = f7;
        this.f38813b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f38814c;
        photoViewer.f34066p6 = null;
        photoViewer.f33981f6 = 0.0f;
        photoViewer.f33943b6 = 0.0f;
        photoViewer.f33989g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33972e6 = r22;
        photoViewer.f33933a6 = r22;
        photoViewer.f33966e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f32682b.f15611a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24177n0 = 0.0f;
        cropAreaView.f24178o0 = r23;
        cropAreaView.f24179p0 = 0.0f;
        cropAreaView.f24180q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f32683c.setRotated(false);
        float f7 = this.f38812a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.wf0 wf0Var = photoViewer.C1;
            lg.f fVar = wf0Var.f32683c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (wf0Var.f32682b.m(f7)) {
                photoViewer.f33938b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f21234zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33938b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f41893c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f38813b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
