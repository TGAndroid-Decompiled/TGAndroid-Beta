package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class lr0 implements Runnable {
    public final PhotoViewer f38843a;
    public final View f38844b;
    public final os0 f38845c;
    public final float d;
    public final float f38846e;
    public final AnimatorSet f38847f;

    public lr0(PhotoViewer photoViewer, View view, os0 os0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f38843a = photoViewer;
        this.f38844b = view;
        this.f38845c = os0Var;
        this.d = f10;
        this.f38846e = f11;
        this.f38847f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Q8;
        View view = this.f38844b;
        os0 os0Var = this.f38845c;
        view.setOutlineProvider(os0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f38843a;
        photoViewer.f34404u3.setOutlineProvider(os0Var);
        photoViewer.f34404u3.setClipToOutline(true);
        cu0 cu0Var = photoViewer.B2;
        if (cu0Var != null) {
            cu0Var.setOutlineProvider(os0Var);
            photoViewer.B2.setClipToOutline(true);
        }
        photoViewer.f34404u3.setTranslationY(this.d);
        float f10 = this.f38846e;
        view.setTranslationY(f10);
        cu0 cu0Var2 = photoViewer.B2;
        if (cu0Var2 != null) {
            cu0Var2.setTranslationY(f10);
        }
        photoViewer.V5 = 0.0f;
        photoViewer.f34230b0.invalidate();
        this.f38847f.start();
    }
}
