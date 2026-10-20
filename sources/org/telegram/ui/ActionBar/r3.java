package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class r3 extends AnimatorListenerAdapter {
    public final m3 f21686a;
    public final t3 f21687b;
    public final w3 f21688c;

    public r3(w3 w3Var, m3 m3Var, t3 t3Var) {
        this.f21688c = w3Var;
        this.f21686a = m3Var;
        this.f21687b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        m3 m3Var = this.f21686a;
        ViewGroup viewGroup = m3Var.f21583b;
        if (viewGroup == null) {
            viewGroup = m3Var.f21584c;
        }
        w3 w3Var = this.f21688c;
        t3 t3Var = this.f21687b;
        if (viewGroup != null && m3Var.f21591m == null && (i10 = m3Var.f21586g) > 0 && (i11 = m3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                w3.g(viewGroup, -m3Var.f21587i, new j3(m3Var, t3Var));
                w3Var.f21835b = null;
                w3Var.invalidate();
                return;
            }
            m3Var.f21591m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(m3Var.f21591m);
            canvas.translate(0.0f, -m3Var.f21587i);
            viewGroup.draw(canvas);
        }
        t3Var.mo36getWindowView().setDrawingFromOverlay(false);
        t3Var.release();
        w3Var.f21835b = null;
        w3Var.invalidate();
    }
}
