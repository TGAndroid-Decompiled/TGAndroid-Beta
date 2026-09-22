package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class jt0 extends AnimatorListenerAdapter {
    public final float f34982a;
    public final Runnable f34983b;
    public final PhotoViewer f34984c;

    public jt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f34984c = photoViewer;
        this.f34982a = f7;
        this.f34983b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f34984c;
        photoViewer.f31034p6 = null;
        photoViewer.f30949f6 = 0.0f;
        photoViewer.f30912b6 = 0.0f;
        photoViewer.f30957g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f30940e6 = q22;
        photoViewer.f30902a6 = q22;
        photoViewer.f30934e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f28379b.f14098a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f22017n0 = 0.0f;
        cropAreaView.f22018o0 = q23;
        cropAreaView.f22019p0 = 0.0f;
        cropAreaView.f22020q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f28380c.setRotated(false);
        float f7 = this.f34982a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            lg.f fVar = ue0Var.f28380c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ue0Var.f28379b.m(f7)) {
                photoViewer.f30907b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f19243zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f30907b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f37490c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f34983b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
