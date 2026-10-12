package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class fs0 implements Runnable {
    public final PhotoViewer f37838a;
    public final View f37839b;
    public final jt0 f37840c;
    public final float d;
    public final float f37841e;
    public final AnimatorSet f37842f;

    public fs0(PhotoViewer photoViewer, View view, jt0 jt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f37838a = photoViewer;
        this.f37839b = view;
        this.f37840c = jt0Var;
        this.d = f7;
        this.f37841e = f10;
        this.f37842f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f37839b;
        jt0 jt0Var = this.f37840c;
        view.setOutlineProvider(jt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f37838a;
        photoViewer.f33913x3.setOutlineProvider(jt0Var);
        photoViewer.f33913x3.setClipToOutline(true);
        xu0 xu0Var = photoViewer.E2;
        if (xu0Var != null) {
            xu0Var.setOutlineProvider(jt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f33913x3.setTranslationY(this.d);
        float f7 = this.f37841e;
        view.setTranslationY(f7);
        xu0 xu0Var2 = photoViewer.E2;
        if (xu0Var2 != null) {
            xu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33741e0.invalidate();
        this.f37842f.start();
    }
}
