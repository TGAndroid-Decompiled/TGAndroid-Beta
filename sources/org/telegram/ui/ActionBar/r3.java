package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class r3 extends AnimatorListenerAdapter {
    public final m3 f21493a;
    public final t3 f21494b;
    public final w3 f21495c;

    public r3(w3 w3Var, m3 m3Var, t3 t3Var) {
        this.f21495c = w3Var;
        this.f21493a = m3Var;
        this.f21494b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        m3 m3Var = this.f21493a;
        ViewGroup viewGroup = m3Var.f21374b;
        if (viewGroup == null) {
            viewGroup = m3Var.f21375c;
        }
        w3 w3Var = this.f21495c;
        t3 t3Var = this.f21494b;
        if (viewGroup != null && m3Var.f21383m == null && (i10 = m3Var.f21378g) > 0 && (i11 = m3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                w3.g(viewGroup, -m3Var.f21379i, new ai.g3(25, m3Var, t3Var));
                w3Var.f21646b = null;
                w3Var.invalidate();
                return;
            }
            m3Var.f21383m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(m3Var.f21383m);
            canvas.translate(0.0f, -m3Var.f21379i);
            viewGroup.draw(canvas);
        }
        t3Var.mo37getWindowView().setDrawingFromOverlay(false);
        t3Var.release();
        w3Var.f21646b = null;
        w3Var.invalidate();
    }
}
