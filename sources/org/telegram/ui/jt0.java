package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class jt0 extends AnimatorListenerAdapter {
    public final float f39021a;
    public final Runnable f39022b;
    public final PhotoViewer f39023c;

    public jt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f39023c = photoViewer;
        this.f39021a = f7;
        this.f39022b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f39023c;
        photoViewer.f34004p6 = null;
        photoViewer.f33919f6 = 0.0f;
        photoViewer.f33881b6 = 0.0f;
        photoViewer.f33927g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33910e6 = r22;
        photoViewer.f33871a6 = r22;
        photoViewer.f33904e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f31768b.f15572a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24149n0 = 0.0f;
        cropAreaView.f24150o0 = r23;
        cropAreaView.f24151p0 = 0.0f;
        cropAreaView.f24152q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f31769c.setRotated(false);
        float f7 = this.f39021a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.vf0 vf0Var = photoViewer.C1;
            lg.f fVar = vf0Var.f31769c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (vf0Var.f31768b.m(f7)) {
                photoViewer.f33876b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f21208zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33876b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f42126c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f39022b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
