package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class r3 extends AnimatorListenerAdapter {
    public final m3 f19485a;
    public final t3 f19486b;
    public final w3 f19487c;

    public r3(w3 w3Var, m3 m3Var, t3 t3Var) {
        this.f19487c = w3Var;
        this.f19485a = m3Var;
        this.f19486b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        m3 m3Var = this.f19485a;
        ViewGroup viewGroup = m3Var.f19371b;
        if (viewGroup == null) {
            viewGroup = m3Var.f19372c;
        }
        w3 w3Var = this.f19487c;
        t3 t3Var = this.f19486b;
        if (viewGroup != null && m3Var.f19379m == null && (i10 = m3Var.f19374g) > 0 && (i11 = m3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                w3.g(viewGroup, -m3Var.f19375i, new ai.g3(25, m3Var, t3Var));
                w3Var.f19628b = null;
                w3Var.invalidate();
                return;
            }
            m3Var.f19379m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(m3Var.f19379m);
            canvas.translate(0.0f, -m3Var.f19375i);
            viewGroup.draw(canvas);
        }
        t3Var.mo37getWindowView().setDrawingFromOverlay(false);
        t3Var.release();
        w3Var.f19628b = null;
        w3Var.invalidate();
    }
}
