package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class eo0 implements Runnable {
    public final PhotoViewer f47318a;
    public final View f47319b;
    public final hp0 f47320c;
    public final float d;
    public final float f47321e;
    public final AnimatorSet f47322f;

    public eo0(PhotoViewer photoViewer, View view, hp0 hp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f47318a = photoViewer;
        this.f47319b = view;
        this.f47320c = hp0Var;
        this.d = f10;
        this.f47321e = f11;
        this.f47322f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Z8;
        View view = this.f47319b;
        hp0 hp0Var = this.f47320c;
        view.setOutlineProvider(hp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f47318a;
        photoViewer.f43379x3.setOutlineProvider(hp0Var);
        photoViewer.f43379x3.setClipToOutline(true);
        qq0 qq0Var = photoViewer.F2;
        if (qq0Var != null) {
            qq0Var.setOutlineProvider(hp0Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.f43379x3.setTranslationY(this.d);
        float f10 = this.f47321e;
        view.setTranslationY(f10);
        qq0 qq0Var2 = photoViewer.F2;
        if (qq0Var2 != null) {
            qq0Var2.setTranslationY(f10);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f43218f0.invalidate();
        this.f47322f.start();
    }
}
