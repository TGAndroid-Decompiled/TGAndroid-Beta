package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class et0 extends AnimatorListenerAdapter {
    public final float f33319a;
    public final Runnable f33320b;
    public final PhotoViewer f33321c;

    public et0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f33321c = photoViewer;
        this.f33319a = f7;
        this.f33320b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f33321c;
        photoViewer.f31325p6 = null;
        photoViewer.f31240f6 = 0.0f;
        photoViewer.f31203b6 = 0.0f;
        photoViewer.f31248g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.f31231e6 = q22;
        photoViewer.f31193a6 = q22;
        photoViewer.f31225e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f24054b.f14325a;
        float q23 = photoViewer.q2(false);
        cropAreaView.f22245n0 = 0.0f;
        cropAreaView.f22246o0 = q23;
        cropAreaView.f22247p0 = 0.0f;
        cropAreaView.f22248q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f24055c.setRotated(false);
        float f7 = this.f33319a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
            lg.f fVar = ef0Var.f24055c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (ef0Var.f24054b.m(f7)) {
                photoViewer.f31198b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.i6.f19470zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f31198b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f36087c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f33320b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
