package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class lt0 extends AnimatorListenerAdapter {
    public final float f39840a;
    public final Runnable f39841b;
    public final PhotoViewer f39842c;

    public lt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f39842c = photoViewer;
        this.f39840a = f7;
        this.f39841b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f39842c;
        photoViewer.f33841p6 = null;
        photoViewer.f33756f6 = 0.0f;
        photoViewer.f33718b6 = 0.0f;
        photoViewer.f33764g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33747e6 = r22;
        photoViewer.f33708a6 = r22;
        photoViewer.f33741e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f33342b.f15318a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f23926n0 = 0.0f;
        cropAreaView.f23927o0 = r23;
        cropAreaView.f23928p0 = 0.0f;
        cropAreaView.f23929q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f33343c.setRotated(false);
        float f7 = this.f39840a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.zf0 zf0Var = photoViewer.C1;
            lg.f fVar = zf0Var.f33343c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (zf0Var.f33342b.m(f7)) {
                photoViewer.f33713b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f20972zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33713b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f42854c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f39841b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
