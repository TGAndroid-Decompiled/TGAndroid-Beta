package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ao0 implements Runnable {
    public final PhotoViewer f44069a;
    public final View f44070b;
    public final fp0 f44071c;
    public final float d;
    public final float f44072e;
    public final AnimatorSet f44073f;

    public ao0(PhotoViewer photoViewer, View view, fp0 fp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f44069a = photoViewer;
        this.f44070b = view;
        this.f44071c = fp0Var;
        this.d = f10;
        this.f44072e = f11;
        this.f44073f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Y8;
        View view = this.f44070b;
        fp0 fp0Var = this.f44071c;
        view.setOutlineProvider(fp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f44069a;
        photoViewer.f41545w3.setOutlineProvider(fp0Var);
        photoViewer.f41545w3.setClipToOutline(true);
        oq0 oq0Var = photoViewer.E2;
        if (oq0Var != null) {
            oq0Var.setOutlineProvider(fp0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f41545w3.setTranslationY(this.d);
        float f10 = this.f44072e;
        view.setTranslationY(f10);
        oq0 oq0Var2 = photoViewer.E2;
        if (oq0Var2 != null) {
            oq0Var2.setTranslationY(f10);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.f41384e0.invalidate();
        this.f44073f.start();
    }
}
