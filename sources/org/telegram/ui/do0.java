package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class do0 implements Runnable {
    public final PhotoViewer f45025a;
    public final View f45026b;
    public final ip0 f45027c;
    public final float d;
    public final float f45028e;
    public final AnimatorSet f45029f;

    public do0(PhotoViewer photoViewer, View view, ip0 ip0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f45025a = photoViewer;
        this.f45026b = view;
        this.f45027c = ip0Var;
        this.d = f10;
        this.f45028e = f11;
        this.f45029f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Y8;
        View view = this.f45026b;
        ip0 ip0Var = this.f45027c;
        view.setOutlineProvider(ip0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f45025a;
        photoViewer.f41543w3.setOutlineProvider(ip0Var);
        photoViewer.f41543w3.setClipToOutline(true);
        rq0 rq0Var = photoViewer.E2;
        if (rq0Var != null) {
            rq0Var.setOutlineProvider(ip0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f41543w3.setTranslationY(this.d);
        float f10 = this.f45028e;
        view.setTranslationY(f10);
        rq0 rq0Var2 = photoViewer.E2;
        if (rq0Var2 != null) {
            rq0Var2.setTranslationY(f10);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.f41382e0.invalidate();
        this.f45029f.start();
    }
}
