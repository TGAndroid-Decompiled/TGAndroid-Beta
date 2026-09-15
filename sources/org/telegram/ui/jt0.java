package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class jt0 extends AnimatorListenerAdapter {
    public final float f34970a;
    public final Runnable f34971b;
    public final PhotoViewer f34972c;

    public jt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f34972c = photoViewer;
        this.f34970a = f7;
        this.f34971b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f34972c;
        photoViewer.f31036p6 = null;
        photoViewer.f30951f6 = 0.0f;
        photoViewer.f30914b6 = 0.0f;
        photoViewer.f30959g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f30942e6 = r22;
        photoViewer.f30904a6 = r22;
        photoViewer.f30936e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f28382b.f14097a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f22020n0 = 0.0f;
        cropAreaView.f22021o0 = r23;
        cropAreaView.f22022p0 = 0.0f;
        cropAreaView.f22023q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f28383c.setRotated(false);
        float f7 = this.f34970a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            lg.f fVar = ue0Var.f28383c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ue0Var.f28382b.m(f7)) {
                photoViewer.f30909b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f19246zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f30909b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f37481c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f34971b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
