package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class es0 implements Runnable {
    public final PhotoViewer f37373a;
    public final View f37374b;
    public final ht0 f37375c;
    public final float d;
    public final float f37376e;
    public final AnimatorSet f37377f;

    public es0(PhotoViewer photoViewer, View view, ht0 ht0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f37373a = photoViewer;
        this.f37374b = view;
        this.f37375c = ht0Var;
        this.d = f7;
        this.f37376e = f10;
        this.f37377f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f37374b;
        ht0 ht0Var = this.f37375c;
        view.setOutlineProvider(ht0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f37373a;
        photoViewer.f34114x3.setOutlineProvider(ht0Var);
        photoViewer.f34114x3.setClipToOutline(true);
        vu0 vu0Var = photoViewer.E2;
        if (vu0Var != null) {
            vu0Var.setOutlineProvider(ht0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f34114x3.setTranslationY(this.d);
        float f7 = this.f37376e;
        view.setTranslationY(f7);
        vu0 vu0Var2 = photoViewer.E2;
        if (vu0Var2 != null) {
            vu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33942e0.invalidate();
        this.f37377f.start();
    }
}
