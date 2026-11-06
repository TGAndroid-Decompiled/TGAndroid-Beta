package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ao0 implements Runnable {
    public final PhotoViewer f44064a;
    public final View f44065b;
    public final fp0 f44066c;
    public final float d;
    public final float f44067e;
    public final AnimatorSet f44068f;

    public ao0(PhotoViewer photoViewer, View view, fp0 fp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f44064a = photoViewer;
        this.f44065b = view;
        this.f44066c = fp0Var;
        this.d = f10;
        this.f44067e = f11;
        this.f44068f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Y8;
        View view = this.f44065b;
        fp0 fp0Var = this.f44066c;
        view.setOutlineProvider(fp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f44064a;
        photoViewer.f41542w3.setOutlineProvider(fp0Var);
        photoViewer.f41542w3.setClipToOutline(true);
        oq0 oq0Var = photoViewer.E2;
        if (oq0Var != null) {
            oq0Var.setOutlineProvider(fp0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f41542w3.setTranslationY(this.d);
        float f10 = this.f44067e;
        view.setTranslationY(f10);
        oq0 oq0Var2 = photoViewer.E2;
        if (oq0Var2 != null) {
            oq0Var2.setTranslationY(f10);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.f41381e0.invalidate();
        this.f44068f.start();
    }
}
