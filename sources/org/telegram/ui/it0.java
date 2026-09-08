package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class it0 extends AnimatorListenerAdapter {
    public final float f37461a;
    public final Runnable f37462b;
    public final PhotoViewer f37463c;

    public it0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f37463c = photoViewer;
        this.f37461a = f7;
        this.f37462b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f37463c;
        photoViewer.f33676p6 = null;
        photoViewer.f33591f6 = 0.0f;
        photoViewer.f33553b6 = 0.0f;
        photoViewer.f33599g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33582e6 = r22;
        photoViewer.f33543a6 = r22;
        photoViewer.f33576e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f30896b.f16330a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f23986n0 = 0.0f;
        cropAreaView.f23987o0 = r23;
        cropAreaView.f23988p0 = 0.0f;
        cropAreaView.f23989q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f30897c.setRotated(false);
        float f7 = this.f37461a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            mg.f fVar = ue0Var.f30897c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ue0Var.f30896b.m(f7)) {
                photoViewer.f33548b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f21097zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33548b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f40267c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f37462b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
