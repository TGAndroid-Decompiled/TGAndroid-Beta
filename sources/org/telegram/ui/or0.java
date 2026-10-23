package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class or0 implements Runnable {
    public final PhotoViewer f40248a;
    public final View f40249b;
    public final qs0 f40250c;
    public final float d;
    public final float e;
    public final AnimatorSet f40251f;

    public or0(PhotoViewer photoViewer, View view, qs0 qs0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f40248a = photoViewer;
        this.f40249b = view;
        this.f40250c = qs0Var;
        this.d = f7;
        this.e = f10;
        this.f40251f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f40249b;
        qs0 qs0Var = this.f40250c;
        view.setOutlineProvider(qs0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f40248a;
        photoViewer.f33753x3.setOutlineProvider(qs0Var);
        photoViewer.f33753x3.setClipToOutline(true);
        du0 du0Var = photoViewer.E2;
        if (du0Var != null) {
            du0Var.setOutlineProvider(qs0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f33753x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        du0 du0Var2 = photoViewer.E2;
        if (du0Var2 != null) {
            du0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33580e0.invalidate();
        this.f40251f.start();
    }
}
