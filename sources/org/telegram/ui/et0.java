package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class et0 extends AnimatorListenerAdapter {
    public final float f36093a;
    public final Runnable f36094b;
    public final PhotoViewer f36095c;

    public et0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f36095c = photoViewer;
        this.f36093a = f7;
        this.f36094b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f36095c;
        photoViewer.f34001p6 = null;
        photoViewer.f33916f6 = 0.0f;
        photoViewer.f33878b6 = 0.0f;
        photoViewer.f33924g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33907e6 = r22;
        photoViewer.f33868a6 = r22;
        photoViewer.f33901e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f26856b.f15576a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24150n0 = 0.0f;
        cropAreaView.f24151o0 = r23;
        cropAreaView.f24152p0 = 0.0f;
        cropAreaView.f24153q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f26857c.setRotated(false);
        float f7 = this.f36093a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.gf0 gf0Var = photoViewer.C1;
            lg.f fVar = gf0Var.f26857c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (gf0Var.f26856b.m(f7)) {
                photoViewer.f33873b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f21237zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33873b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f39046c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f36094b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
