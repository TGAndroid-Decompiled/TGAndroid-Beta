package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class it0 extends AnimatorListenerAdapter {
    public final float f38778a;
    public final Runnable f38779b;
    public final PhotoViewer f38780c;

    public it0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f38780c = photoViewer;
        this.f38778a = f7;
        this.f38779b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f38780c;
        photoViewer.f34032p6 = null;
        photoViewer.f33947f6 = 0.0f;
        photoViewer.f33909b6 = 0.0f;
        photoViewer.f33955g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33938e6 = r22;
        photoViewer.f33899a6 = r22;
        photoViewer.f33932e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f32884b.f15575a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24141n0 = 0.0f;
        cropAreaView.f24142o0 = r23;
        cropAreaView.f24143p0 = 0.0f;
        cropAreaView.f24144q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f32885c.setRotated(false);
        float f7 = this.f38778a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.xf0 xf0Var = photoViewer.C1;
            lg.f fVar = xf0Var.f32885c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (xf0Var.f32884b.m(f7)) {
                photoViewer.f33904b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f21198zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33904b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f41859c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f38779b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
