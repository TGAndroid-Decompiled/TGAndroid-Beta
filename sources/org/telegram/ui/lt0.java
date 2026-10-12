package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class lt0 extends AnimatorListenerAdapter {
    public final float f39843a;
    public final Runnable f39844b;
    public final PhotoViewer f39845c;

    public lt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f39845c = photoViewer;
        this.f39843a = f7;
        this.f39844b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f39845c;
        photoViewer.f33843p6 = null;
        photoViewer.f33758f6 = 0.0f;
        photoViewer.f33720b6 = 0.0f;
        photoViewer.f33766g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33749e6 = r22;
        photoViewer.f33710a6 = r22;
        photoViewer.f33743e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f33350b.f15319a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f23927n0 = 0.0f;
        cropAreaView.f23928o0 = r23;
        cropAreaView.f23929p0 = 0.0f;
        cropAreaView.f23930q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f33351c.setRotated(false);
        float f7 = this.f39843a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.zf0 zf0Var = photoViewer.C1;
            lg.f fVar = zf0Var.f33351c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (zf0Var.f33350b.m(f7)) {
                photoViewer.f33715b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f20973zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33715b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f42856c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f39844b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
