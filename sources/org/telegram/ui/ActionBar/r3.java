package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class r3 extends AnimatorListenerAdapter {
    public final m3 f21497a;
    public final t3 f21498b;
    public final w3 f21499c;

    public r3(w3 w3Var, m3 m3Var, t3 t3Var) {
        this.f21499c = w3Var;
        this.f21497a = m3Var;
        this.f21498b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        m3 m3Var = this.f21497a;
        ViewGroup viewGroup = m3Var.f21378b;
        if (viewGroup == null) {
            viewGroup = m3Var.f21379c;
        }
        w3 w3Var = this.f21499c;
        t3 t3Var = this.f21498b;
        if (viewGroup != null && m3Var.f21387m == null && (i10 = m3Var.f21382g) > 0 && (i11 = m3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                w3.g(viewGroup, -m3Var.f21383i, new ai.g3(25, m3Var, t3Var));
                w3Var.f21650b = null;
                w3Var.invalidate();
                return;
            }
            m3Var.f21387m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(m3Var.f21387m);
            canvas.translate(0.0f, -m3Var.f21383i);
            viewGroup.draw(canvas);
        }
        t3Var.mo37getWindowView().setDrawingFromOverlay(false);
        t3Var.release();
        w3Var.f21650b = null;
        w3Var.invalidate();
    }
}
