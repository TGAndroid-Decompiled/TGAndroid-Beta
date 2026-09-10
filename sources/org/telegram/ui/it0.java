package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class it0 extends AnimatorListenerAdapter {
    public final float f33794a;
    public final Runnable f33795b;
    public final PhotoViewer f33796c;

    public it0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f33796c = photoViewer;
        this.f33794a = f7;
        this.f33795b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f33796c;
        photoViewer.f30149p6 = null;
        photoViewer.f30064f6 = 0.0f;
        photoViewer.f30027b6 = 0.0f;
        photoViewer.f30072g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f30055e6 = r22;
        photoViewer.f30017a6 = r22;
        photoViewer.f30049e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f22405b.f12495a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f21105n0 = 0.0f;
        cropAreaView.f21106o0 = r23;
        cropAreaView.f21107p0 = 0.0f;
        cropAreaView.f21108q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f22406c.setRotated(false);
        float f7 = this.f33794a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.df0 df0Var = photoViewer.C1;
            kg.f fVar = df0Var.f22406c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (df0Var.f22405b.m(f7)) {
                photoViewer.f30022b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f18334zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f30022b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f36761c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f33795b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
