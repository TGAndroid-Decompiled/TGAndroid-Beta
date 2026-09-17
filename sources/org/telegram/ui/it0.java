package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class it0 extends AnimatorListenerAdapter {
    public final float f37462a;
    public final Runnable f37463b;
    public final PhotoViewer f37464c;

    public it0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f37464c = photoViewer;
        this.f37462a = f7;
        this.f37463b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f37464c;
        photoViewer.f33677p6 = null;
        photoViewer.f33592f6 = 0.0f;
        photoViewer.f33554b6 = 0.0f;
        photoViewer.f33600g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33583e6 = r22;
        photoViewer.f33544a6 = r22;
        photoViewer.f33577e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f30897b.f16330a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f23987n0 = 0.0f;
        cropAreaView.f23988o0 = r23;
        cropAreaView.f23989p0 = 0.0f;
        cropAreaView.f23990q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f30898c.setRotated(false);
        float f7 = this.f37462a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            mg.f fVar = ue0Var.f30898c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ue0Var.f30897b.m(f7)) {
                photoViewer.f33549b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f21098zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33549b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f40268c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f37463b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
