package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ks0 implements Runnable {
    public final PhotoViewer f37509a;
    public final View f37510b;
    public final nt0 f37511c;
    public final float d;
    public final float e;
    public final AnimatorSet f37512f;

    public ks0(PhotoViewer photoViewer, View view, nt0 nt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f37509a = photoViewer;
        this.f37510b = view;
        this.f37511c = nt0Var;
        this.d = f7;
        this.e = f10;
        this.f37512f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f37510b;
        nt0 nt0Var = this.f37511c;
        view.setOutlineProvider(nt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f37509a;
        photoViewer.f32101x3.setOutlineProvider(nt0Var);
        photoViewer.f32101x3.setClipToOutline(true);
        av0 av0Var = photoViewer.E2;
        if (av0Var != null) {
            av0Var.setOutlineProvider(nt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f32101x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        av0 av0Var2 = photoViewer.E2;
        if (av0Var2 != null) {
            av0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f31928e0.invalidate();
        this.f37512f.start();
    }
}
