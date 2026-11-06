package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ao0 implements Runnable {
    public final PhotoViewer f44063a;
    public final View f44064b;
    public final fp0 f44065c;
    public final float d;
    public final float f44066e;
    public final AnimatorSet f44067f;

    public ao0(PhotoViewer photoViewer, View view, fp0 fp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f44063a = photoViewer;
        this.f44064b = view;
        this.f44065c = fp0Var;
        this.d = f10;
        this.f44066e = f11;
        this.f44067f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Y8;
        View view = this.f44064b;
        fp0 fp0Var = this.f44065c;
        view.setOutlineProvider(fp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f44063a;
        photoViewer.f41541w3.setOutlineProvider(fp0Var);
        photoViewer.f41541w3.setClipToOutline(true);
        oq0 oq0Var = photoViewer.E2;
        if (oq0Var != null) {
            oq0Var.setOutlineProvider(fp0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f41541w3.setTranslationY(this.d);
        float f10 = this.f44066e;
        view.setTranslationY(f10);
        oq0 oq0Var2 = photoViewer.E2;
        if (oq0Var2 != null) {
            oq0Var2.setTranslationY(f10);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.f41380e0.invalidate();
        this.f44067f.start();
    }
}
