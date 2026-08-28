package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class br0 implements Runnable {
    public final PhotoViewer f36963a;
    public final View f36964b;
    public final es0 f36965c;
    public final float d;
    public final float f36966e;
    public final AnimatorSet f36967f;

    public br0(PhotoViewer photoViewer, View view, es0 es0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f36963a = photoViewer;
        this.f36964b = view;
        this.f36965c = es0Var;
        this.d = f10;
        this.f36966e = f11;
        this.f36967f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.P8;
        View view = this.f36964b;
        es0 es0Var = this.f36965c;
        view.setOutlineProvider(es0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f36963a;
        photoViewer.f35755t3.setOutlineProvider(es0Var);
        photoViewer.f35755t3.setClipToOutline(true);
        st0 st0Var = photoViewer.A2;
        if (st0Var != null) {
            st0Var.setOutlineProvider(es0Var);
            photoViewer.A2.setClipToOutline(true);
        }
        photoViewer.f35755t3.setTranslationY(this.d);
        float f10 = this.f36966e;
        view.setTranslationY(f10);
        st0 st0Var2 = photoViewer.A2;
        if (st0Var2 != null) {
            st0Var2.setTranslationY(f10);
        }
        photoViewer.U5 = 0.0f;
        photoViewer.f35580a0.invalidate();
        this.f36967f.start();
    }
}
