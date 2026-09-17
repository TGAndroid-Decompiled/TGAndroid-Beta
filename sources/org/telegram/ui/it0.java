package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class it0 extends AnimatorListenerAdapter {
    public final float f37435a;
    public final Runnable f37436b;
    public final PhotoViewer f37437c;

    public it0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f37437c = photoViewer;
        this.f37435a = f7;
        this.f37436b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f37437c;
        photoViewer.f33650p6 = null;
        photoViewer.f33565f6 = 0.0f;
        photoViewer.f33527b6 = 0.0f;
        photoViewer.f33573g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33556e6 = r22;
        photoViewer.f33517a6 = r22;
        photoViewer.f33550e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f30870b.f16303a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f23960n0 = 0.0f;
        cropAreaView.f23961o0 = r23;
        cropAreaView.f23962p0 = 0.0f;
        cropAreaView.f23963q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f30871c.setRotated(false);
        float f7 = this.f37435a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            mg.f fVar = ue0Var.f30871c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ue0Var.f30870b.m(f7)) {
                photoViewer.f33522b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f21071zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33522b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f40241c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f37436b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
