package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class et0 extends AnimatorListenerAdapter {
    public final float f36088a;
    public final Runnable f36089b;
    public final PhotoViewer f36090c;

    public et0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f36090c = photoViewer;
        this.f36088a = f7;
        this.f36089b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f36090c;
        photoViewer.f33995p6 = null;
        photoViewer.f33910f6 = 0.0f;
        photoViewer.f33872b6 = 0.0f;
        photoViewer.f33918g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33901e6 = r22;
        photoViewer.f33862a6 = r22;
        photoViewer.f33895e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f26851b.f15575a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24146n0 = 0.0f;
        cropAreaView.f24147o0 = r23;
        cropAreaView.f24148p0 = 0.0f;
        cropAreaView.f24149q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f26852c.setRotated(false);
        float f7 = this.f36088a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.gf0 gf0Var = photoViewer.C1;
            lg.f fVar = gf0Var.f26852c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (gf0Var.f26851b.m(f7)) {
                photoViewer.f33867b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f21233zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33867b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f39041c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f36089b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
