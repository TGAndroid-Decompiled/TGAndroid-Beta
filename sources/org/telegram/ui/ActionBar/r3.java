package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class r3 extends AnimatorListenerAdapter {
    public final m3 f21685a;
    public final t3 f21686b;
    public final w3 f21687c;

    public r3(w3 w3Var, m3 m3Var, t3 t3Var) {
        this.f21687c = w3Var;
        this.f21685a = m3Var;
        this.f21686b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        m3 m3Var = this.f21685a;
        ViewGroup viewGroup = m3Var.f21582b;
        if (viewGroup == null) {
            viewGroup = m3Var.f21583c;
        }
        w3 w3Var = this.f21687c;
        t3 t3Var = this.f21686b;
        if (viewGroup != null && m3Var.f21590m == null && (i10 = m3Var.f21585g) > 0 && (i11 = m3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                w3.g(viewGroup, -m3Var.f21586i, new j3(m3Var, t3Var));
                w3Var.f21834b = null;
                w3Var.invalidate();
                return;
            }
            m3Var.f21590m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(m3Var.f21590m);
            canvas.translate(0.0f, -m3Var.f21586i);
            viewGroup.draw(canvas);
        }
        t3Var.mo36getWindowView().setDrawingFromOverlay(false);
        t3Var.release();
        w3Var.f21834b = null;
        w3Var.invalidate();
    }
}
