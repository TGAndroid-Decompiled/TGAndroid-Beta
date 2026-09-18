package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class es0 implements Runnable {
    public final PhotoViewer f33350a;
    public final View f33351b;
    public final ht0 f33352c;
    public final float d;
    public final float e;
    public final AnimatorSet f33353f;

    public es0(PhotoViewer photoViewer, View view, ht0 ht0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f33350a = photoViewer;
        this.f33351b = view;
        this.f33352c = ht0Var;
        this.d = f7;
        this.e = f10;
        this.f33353f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f33351b;
        ht0 ht0Var = this.f33352c;
        view.setOutlineProvider(ht0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f33350a;
        photoViewer.f31353x3.setOutlineProvider(ht0Var);
        photoViewer.f31353x3.setClipToOutline(true);
        uu0 uu0Var = photoViewer.E2;
        if (uu0Var != null) {
            uu0Var.setOutlineProvider(ht0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f31353x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        uu0 uu0Var2 = photoViewer.E2;
        if (uu0Var2 != null) {
            uu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f31181e0.invalidate();
        this.f33353f.start();
    }
}
