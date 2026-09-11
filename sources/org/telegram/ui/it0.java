package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class it0 extends AnimatorListenerAdapter {
    public final float f37434a;
    public final Runnable f37435b;
    public final PhotoViewer f37436c;

    public it0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f37436c = photoViewer;
        this.f37434a = f7;
        this.f37435b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f37436c;
        photoViewer.f33649p6 = null;
        photoViewer.f33564f6 = 0.0f;
        photoViewer.f33526b6 = 0.0f;
        photoViewer.f33572g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33555e6 = r22;
        photoViewer.f33516a6 = r22;
        photoViewer.f33549e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f30869b.f16303a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f23959n0 = 0.0f;
        cropAreaView.f23960o0 = r23;
        cropAreaView.f23961p0 = 0.0f;
        cropAreaView.f23962q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f30870c.setRotated(false);
        float f7 = this.f37434a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            mg.f fVar = ue0Var.f30870c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ue0Var.f30869b.m(f7)) {
                photoViewer.f33521b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f21070zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33521b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f40240c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f37435b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
