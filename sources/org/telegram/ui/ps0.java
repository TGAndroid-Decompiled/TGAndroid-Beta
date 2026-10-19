package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ps0 extends AnimatorListenerAdapter {
    public final float f40284a;
    public final Runnable f40285b;
    public final PhotoViewer f40286c;

    public ps0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f40286c = photoViewer;
        this.f40284a = f7;
        this.f40285b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f40286c;
        photoViewer.f33373p6 = null;
        photoViewer.f33287f6 = 0.0f;
        photoViewer.f33250b6 = 0.0f;
        photoViewer.f33295g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33278e6 = r22;
        photoViewer.f33240a6 = r22;
        photoViewer.f33272e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f28763b.f16917a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24196n0 = 0.0f;
        cropAreaView.f24197o0 = r23;
        cropAreaView.f24198p0 = 0.0f;
        cropAreaView.f24199q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f28764c.setRotated(false);
        float f7 = this.f40284a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.nf0 nf0Var = photoViewer.C1;
            mg.f fVar = nf0Var.f28764c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (nf0Var.f28763b.m(f7)) {
                photoViewer.f33245b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f21400zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33245b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f43545c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f40285b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
