package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class r3 extends AnimatorListenerAdapter {
    public final m3 f21500a;
    public final t3 f21501b;
    public final w3 f21502c;

    public r3(w3 w3Var, m3 m3Var, t3 t3Var) {
        this.f21502c = w3Var;
        this.f21500a = m3Var;
        this.f21501b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        m3 m3Var = this.f21500a;
        ViewGroup viewGroup = m3Var.f21376b;
        if (viewGroup == null) {
            viewGroup = m3Var.f21377c;
        }
        w3 w3Var = this.f21502c;
        t3 t3Var = this.f21501b;
        if (viewGroup != null && m3Var.f21385m == null && (i10 = m3Var.f21380g) > 0 && (i11 = m3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                w3.g(viewGroup, -m3Var.f21381i, new ai.h3(25, m3Var, t3Var));
                w3Var.f21649b = null;
                w3Var.invalidate();
                return;
            }
            m3Var.f21385m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(m3Var.f21385m);
            canvas.translate(0.0f, -m3Var.f21381i);
            viewGroup.draw(canvas);
        }
        t3Var.mo36getWindowView().setDrawingFromOverlay(false);
        t3Var.release();
        w3Var.f21649b = null;
        w3Var.invalidate();
    }
}
