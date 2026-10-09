package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class es0 implements Runnable {
    public final PhotoViewer f37329a;
    public final View f37330b;
    public final ht0 f37331c;
    public final float d;
    public final float f37332e;
    public final AnimatorSet f37333f;

    public es0(PhotoViewer photoViewer, View view, ht0 ht0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f37329a = photoViewer;
        this.f37330b = view;
        this.f37331c = ht0Var;
        this.d = f7;
        this.f37332e = f10;
        this.f37333f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f37330b;
        ht0 ht0Var = this.f37331c;
        view.setOutlineProvider(ht0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f37329a;
        photoViewer.f34076x3.setOutlineProvider(ht0Var);
        photoViewer.f34076x3.setClipToOutline(true);
        vu0 vu0Var = photoViewer.E2;
        if (vu0Var != null) {
            vu0Var.setOutlineProvider(ht0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f34076x3.setTranslationY(this.d);
        float f7 = this.f37332e;
        view.setTranslationY(f7);
        vu0 vu0Var2 = photoViewer.E2;
        if (vu0Var2 != null) {
            vu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33904e0.invalidate();
        this.f37333f.start();
    }
}
