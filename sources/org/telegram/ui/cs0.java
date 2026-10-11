package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class cs0 implements Runnable {
    public final PhotoViewer f36813a;
    public final View f36814b;
    public final gt0 f36815c;
    public final float d;
    public final float f36816e;
    public final AnimatorSet f36817f;

    public cs0(PhotoViewer photoViewer, View view, gt0 gt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f36813a = photoViewer;
        this.f36814b = view;
        this.f36815c = gt0Var;
        this.d = f7;
        this.f36816e = f10;
        this.f36817f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f36814b;
        gt0 gt0Var = this.f36815c;
        view.setOutlineProvider(gt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f36813a;
        photoViewer.f34104x3.setOutlineProvider(gt0Var);
        photoViewer.f34104x3.setClipToOutline(true);
        uu0 uu0Var = photoViewer.E2;
        if (uu0Var != null) {
            uu0Var.setOutlineProvider(gt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f34104x3.setTranslationY(this.d);
        float f7 = this.f36816e;
        view.setTranslationY(f7);
        uu0 uu0Var2 = photoViewer.E2;
        if (uu0Var2 != null) {
            uu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33932e0.invalidate();
        this.f36817f.start();
    }
}
