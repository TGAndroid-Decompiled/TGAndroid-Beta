package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class jr0 implements Runnable {
    public final PhotoViewer f35477a;
    public final View f35478b;
    public final ms0 f35479c;
    public final float d;
    public final float e;
    public final AnimatorSet f35480f;

    public jr0(PhotoViewer photoViewer, View view, ms0 ms0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f35477a = photoViewer;
        this.f35478b = view;
        this.f35479c = ms0Var;
        this.d = f10;
        this.e = f11;
        this.f35480f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Q8;
        View view = this.f35478b;
        ms0 ms0Var = this.f35479c;
        view.setOutlineProvider(ms0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f35477a;
        photoViewer.f31878u3.setOutlineProvider(ms0Var);
        photoViewer.f31878u3.setClipToOutline(true);
        au0 au0Var = photoViewer.B2;
        if (au0Var != null) {
            au0Var.setOutlineProvider(ms0Var);
            photoViewer.B2.setClipToOutline(true);
        }
        photoViewer.f31878u3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        au0 au0Var2 = photoViewer.B2;
        if (au0Var2 != null) {
            au0Var2.setTranslationY(f10);
        }
        photoViewer.V5 = 0.0f;
        photoViewer.f31705b0.invalidate();
        this.f35480f.start();
    }
}
