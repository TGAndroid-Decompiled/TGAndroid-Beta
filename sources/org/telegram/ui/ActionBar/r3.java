package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class r3 extends AnimatorListenerAdapter {
    public final m3 f20539a;
    public final t3 f20540b;
    public final w3 f20541c;

    public r3(w3 w3Var, m3 m3Var, t3 t3Var) {
        this.f20541c = w3Var;
        this.f20539a = m3Var;
        this.f20540b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        m3 m3Var = this.f20539a;
        ViewGroup viewGroup = m3Var.f20424b;
        if (viewGroup == null) {
            viewGroup = m3Var.f20425c;
        }
        w3 w3Var = this.f20541c;
        t3 t3Var = this.f20540b;
        if (viewGroup != null && m3Var.f20432m == null && (i10 = m3Var.f20427g) > 0 && (i11 = m3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                w3.g(viewGroup, -m3Var.f20428i, new kh.a1(11, m3Var, t3Var));
                w3Var.f20656b = null;
                w3Var.invalidate();
                return;
            }
            m3Var.f20432m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(m3Var.f20432m);
            canvas.translate(0.0f, -m3Var.f20428i);
            viewGroup.draw(canvas);
        }
        t3Var.mo37getWindowView().setDrawingFromOverlay(false);
        t3Var.release();
        w3Var.f20656b = null;
        w3Var.invalidate();
    }
}
