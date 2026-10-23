package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class u3 extends AnimatorListenerAdapter {
    public final p3 f21908a;
    public final w3 f21909b;
    public final z3 f21910c;

    public u3(z3 z3Var, p3 p3Var, w3 w3Var) {
        this.f21910c = z3Var;
        this.f21908a = p3Var;
        this.f21909b = w3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        p3 p3Var = this.f21908a;
        ViewGroup viewGroup = p3Var.f21755b;
        if (viewGroup == null) {
            viewGroup = p3Var.f21756c;
        }
        z3 z3Var = this.f21910c;
        w3 w3Var = this.f21909b;
        if (viewGroup != null && p3Var.f21763m == null && (i10 = p3Var.f21758g) > 0 && (i11 = p3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                z3.g(viewGroup, -p3Var.f21759i, new m3(p3Var, w3Var));
                z3Var.f22024b = null;
                z3Var.invalidate();
                return;
            }
            p3Var.f21763m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(p3Var.f21763m);
            canvas.translate(0.0f, -p3Var.f21759i);
            viewGroup.draw(canvas);
        }
        w3Var.mo36getWindowView().setDrawingFromOverlay(false);
        w3Var.release();
        z3Var.f22024b = null;
        z3Var.invalidate();
    }
}
