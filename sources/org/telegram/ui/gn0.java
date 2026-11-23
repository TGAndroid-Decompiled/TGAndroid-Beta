package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class gn0 implements Runnable {
    public final PhotoViewer f48332a;
    public final View f48333b;
    public final fp0 f48334c;
    public final float d;
    public final float f48335e;
    public final AnimatorSet f48336f;

    public gn0(PhotoViewer photoViewer, View view, fp0 fp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f48332a = photoViewer;
        this.f48333b = view;
        this.f48334c = fp0Var;
        this.d = f10;
        this.f48335e = f11;
        this.f48336f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.f43272f9;
        View view = this.f48333b;
        fp0 fp0Var = this.f48334c;
        view.setOutlineProvider(fp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f48332a;
        photoViewer.f43495x3.setOutlineProvider(fp0Var);
        photoViewer.f43495x3.setClipToOutline(true);
        pq0 pq0Var = photoViewer.F2;
        if (pq0Var != null) {
            pq0Var.setOutlineProvider(fp0Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.f43495x3.setTranslationY(this.d);
        float f10 = this.f48335e;
        view.setTranslationY(f10);
        pq0 pq0Var2 = photoViewer.F2;
        if (pq0Var2 != null) {
            pq0Var2.setTranslationY(f10);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f43334f0.invalidate();
        this.f48336f.start();
    }
}
