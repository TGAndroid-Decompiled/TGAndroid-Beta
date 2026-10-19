package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class r3 extends AnimatorListenerAdapter {
    public final m3 f21683a;
    public final t3 f21684b;
    public final w3 f21685c;

    public r3(w3 w3Var, m3 m3Var, t3 t3Var) {
        this.f21685c = w3Var;
        this.f21683a = m3Var;
        this.f21684b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        m3 m3Var = this.f21683a;
        ViewGroup viewGroup = m3Var.f21580b;
        if (viewGroup == null) {
            viewGroup = m3Var.f21581c;
        }
        w3 w3Var = this.f21685c;
        t3 t3Var = this.f21684b;
        if (viewGroup != null && m3Var.f21588m == null && (i10 = m3Var.f21583g) > 0 && (i11 = m3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                w3.g(viewGroup, -m3Var.f21584i, new j3(m3Var, t3Var));
                w3Var.f21832b = null;
                w3Var.invalidate();
                return;
            }
            m3Var.f21588m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(m3Var.f21588m);
            canvas.translate(0.0f, -m3Var.f21584i);
            viewGroup.draw(canvas);
        }
        t3Var.mo36getWindowView().setDrawingFromOverlay(false);
        t3Var.release();
        w3Var.f21832b = null;
        w3Var.invalidate();
    }
}
