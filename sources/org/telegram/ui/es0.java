package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class es0 implements Runnable {
    public final PhotoViewer f33419a;
    public final View f33420b;
    public final ht0 f33421c;
    public final float d;
    public final float e;
    public final AnimatorSet f33422f;

    public es0(PhotoViewer photoViewer, View view, ht0 ht0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f33419a = photoViewer;
        this.f33420b = view;
        this.f33421c = ht0Var;
        this.d = f7;
        this.e = f10;
        this.f33422f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f33420b;
        ht0 ht0Var = this.f33421c;
        view.setOutlineProvider(ht0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f33419a;
        photoViewer.f31414x3.setOutlineProvider(ht0Var);
        photoViewer.f31414x3.setClipToOutline(true);
        uu0 uu0Var = photoViewer.E2;
        if (uu0Var != null) {
            uu0Var.setOutlineProvider(ht0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f31414x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        uu0 uu0Var2 = photoViewer.E2;
        if (uu0Var2 != null) {
            uu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f31242e0.invalidate();
        this.f33422f.start();
    }
}
