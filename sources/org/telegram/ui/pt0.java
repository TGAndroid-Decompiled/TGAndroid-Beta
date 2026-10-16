package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class pt0 extends AnimatorListenerAdapter {
    public final float f39009a;
    public final Runnable f39010b;
    public final PhotoViewer f39011c;

    public pt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f39011c = photoViewer;
        this.f39009a = f7;
        this.f39010b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f39011c;
        photoViewer.f32029p6 = null;
        photoViewer.f31943f6 = 0.0f;
        photoViewer.f31906b6 = 0.0f;
        photoViewer.f31951g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f31934e6 = r22;
        photoViewer.f31896a6 = r22;
        photoViewer.f31928e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f29367b.f15559a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f22840n0 = 0.0f;
        cropAreaView.f22841o0 = r23;
        cropAreaView.f22842p0 = 0.0f;
        cropAreaView.f22843q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f29368c.setRotated(false);
        float f7 = this.f39009a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.uf0 uf0Var = photoViewer.C1;
            mg.f fVar = uf0Var.f29368c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (uf0Var.f29367b.m(f7)) {
                photoViewer.f31901b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.f20013zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f31901b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f41960c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f39010b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
