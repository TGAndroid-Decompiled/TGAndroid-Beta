package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class es0 implements Runnable {
    public final PhotoViewer f37327a;
    public final View f37328b;
    public final ht0 f37329c;
    public final float d;
    public final float f37330e;
    public final AnimatorSet f37331f;

    public es0(PhotoViewer photoViewer, View view, ht0 ht0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f37327a = photoViewer;
        this.f37328b = view;
        this.f37329c = ht0Var;
        this.d = f7;
        this.f37330e = f10;
        this.f37331f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f37328b;
        ht0 ht0Var = this.f37329c;
        view.setOutlineProvider(ht0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f37327a;
        photoViewer.f34076x3.setOutlineProvider(ht0Var);
        photoViewer.f34076x3.setClipToOutline(true);
        vu0 vu0Var = photoViewer.E2;
        if (vu0Var != null) {
            vu0Var.setOutlineProvider(ht0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f34076x3.setTranslationY(this.d);
        float f7 = this.f37330e;
        view.setTranslationY(f7);
        vu0 vu0Var2 = photoViewer.E2;
        if (vu0Var2 != null) {
            vu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33904e0.invalidate();
        this.f37331f.start();
    }
}
