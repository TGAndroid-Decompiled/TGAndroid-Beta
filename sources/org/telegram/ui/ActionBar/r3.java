package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class r3 extends AnimatorListenerAdapter {
    public final m3 f20564a;
    public final t3 f20565b;
    public final w3 f20566c;

    public r3(w3 w3Var, m3 m3Var, t3 t3Var) {
        this.f20566c = w3Var;
        this.f20564a = m3Var;
        this.f20565b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        m3 m3Var = this.f20564a;
        ViewGroup viewGroup = m3Var.f20449b;
        if (viewGroup == null) {
            viewGroup = m3Var.f20450c;
        }
        w3 w3Var = this.f20566c;
        t3 t3Var = this.f20565b;
        if (viewGroup != null && m3Var.f20455k == null && (i10 = m3Var.e) > 0 && (i11 = m3Var.f20451f) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                w3.g(viewGroup, -m3Var.f20452g, new kh.a1(11, m3Var, t3Var));
                w3Var.f20681b = null;
                w3Var.invalidate();
                return;
            }
            m3Var.f20455k = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(m3Var.f20455k);
            canvas.translate(0.0f, -m3Var.f20452g);
            viewGroup.draw(canvas);
        }
        t3Var.mo37getWindowView().setDrawingFromOverlay(false);
        t3Var.release();
        w3Var.f20681b = null;
        w3Var.invalidate();
    }
}
