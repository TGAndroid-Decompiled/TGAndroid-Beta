package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class jt0 extends AnimatorListenerAdapter {
    public final float f35008a;
    public final Runnable f35009b;
    public final PhotoViewer f35010c;

    public jt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f35010c = photoViewer;
        this.f35008a = f7;
        this.f35009b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f35010c;
        photoViewer.f31342p6 = null;
        photoViewer.f31257f6 = 0.0f;
        photoViewer.f31220b6 = 0.0f;
        photoViewer.f31265g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f31248e6 = q22;
        photoViewer.f31210a6 = q22;
        photoViewer.f31242e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f24217b.f14307a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f22257n0 = 0.0f;
        cropAreaView.f22258o0 = q23;
        cropAreaView.f22259p0 = 0.0f;
        cropAreaView.f22260q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f24218c.setRotated(false);
        float f7 = this.f35008a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ff0 ff0Var = photoViewer.C1;
            lg.f fVar = ff0Var.f24218c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ff0Var.f24217b.m(f7)) {
                photoViewer.f31215b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f19520zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f31215b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f37578c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f35009b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
