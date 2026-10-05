package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class et0 extends AnimatorListenerAdapter {
    public final float f36114a;
    public final Runnable f36115b;
    public final PhotoViewer f36116c;

    public et0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f36116c = photoViewer;
        this.f36114a = f7;
        this.f36115b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f36116c;
        photoViewer.f34014p6 = null;
        photoViewer.f33929f6 = 0.0f;
        photoViewer.f33891b6 = 0.0f;
        photoViewer.f33937g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33920e6 = r22;
        photoViewer.f33881a6 = r22;
        photoViewer.f33914e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f26905b.f15576a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24153n0 = 0.0f;
        cropAreaView.f24154o0 = r23;
        cropAreaView.f24155p0 = 0.0f;
        cropAreaView.f24156q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f26906c.setRotated(false);
        float f7 = this.f36114a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.gf0 gf0Var = photoViewer.C1;
            lg.f fVar = gf0Var.f26906c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (gf0Var.f26905b.m(f7)) {
                photoViewer.f33886b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f21242zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33886b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f39035c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f36115b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
