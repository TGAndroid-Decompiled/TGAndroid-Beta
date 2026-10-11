package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class cs0 implements Runnable {
    public final PhotoViewer f36847a;
    public final View f36848b;
    public final gt0 f36849c;
    public final float d;
    public final float f36850e;
    public final AnimatorSet f36851f;

    public cs0(PhotoViewer photoViewer, View view, gt0 gt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f36847a = photoViewer;
        this.f36848b = view;
        this.f36849c = gt0Var;
        this.d = f7;
        this.f36850e = f10;
        this.f36851f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f36848b;
        gt0 gt0Var = this.f36849c;
        view.setOutlineProvider(gt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f36847a;
        photoViewer.f34138x3.setOutlineProvider(gt0Var);
        photoViewer.f34138x3.setClipToOutline(true);
        uu0 uu0Var = photoViewer.E2;
        if (uu0Var != null) {
            uu0Var.setOutlineProvider(gt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f34138x3.setTranslationY(this.d);
        float f7 = this.f36850e;
        view.setTranslationY(f7);
        uu0 uu0Var2 = photoViewer.E2;
        if (uu0Var2 != null) {
            uu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33966e0.invalidate();
        this.f36851f.start();
    }
}
