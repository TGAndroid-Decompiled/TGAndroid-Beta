package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class co0 implements Runnable {
    public final PhotoViewer f44726a;
    public final View f44727b;
    public final hp0 f44728c;
    public final float d;
    public final float f44729e;
    public final AnimatorSet f44730f;

    public co0(PhotoViewer photoViewer, View view, hp0 hp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f44726a = photoViewer;
        this.f44727b = view;
        this.f44728c = hp0Var;
        this.d = f10;
        this.f44729e = f11;
        this.f44730f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Y8;
        View view = this.f44727b;
        hp0 hp0Var = this.f44728c;
        view.setOutlineProvider(hp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f44726a;
        photoViewer.f41552w3.setOutlineProvider(hp0Var);
        photoViewer.f41552w3.setClipToOutline(true);
        qq0 qq0Var = photoViewer.E2;
        if (qq0Var != null) {
            qq0Var.setOutlineProvider(hp0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f41552w3.setTranslationY(this.d);
        float f10 = this.f44729e;
        view.setTranslationY(f10);
        qq0 qq0Var2 = photoViewer.E2;
        if (qq0Var2 != null) {
            qq0Var2.setTranslationY(f10);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.f41391e0.invalidate();
        this.f44730f.start();
    }
}
