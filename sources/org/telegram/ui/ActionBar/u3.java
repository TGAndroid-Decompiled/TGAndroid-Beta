package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class u3 extends AnimatorListenerAdapter {
    public final p3 f18650a;
    public final w3 f18651b;
    public final z3 f18652c;

    public u3(z3 z3Var, p3 p3Var, w3 w3Var) {
        this.f18652c = z3Var;
        this.f18650a = p3Var;
        this.f18651b = w3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        p3 p3Var = this.f18650a;
        ViewGroup viewGroup = p3Var.f18541b;
        if (viewGroup == null) {
            viewGroup = p3Var.f18542c;
        }
        z3 z3Var = this.f18652c;
        w3 w3Var = this.f18651b;
        if (viewGroup != null && p3Var.f18549m == null && (i10 = p3Var.f18544g) > 0 && (i11 = p3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                z3.g(viewGroup, -p3Var.f18545i, new bi.y2(24, p3Var, w3Var));
                z3Var.f18803b = null;
                z3Var.invalidate();
                return;
            }
            p3Var.f18549m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(p3Var.f18549m);
            canvas.translate(0.0f, -p3Var.f18545i);
            viewGroup.draw(canvas);
        }
        w3Var.mo37getWindowView().setDrawingFromOverlay(false);
        w3Var.release();
        z3Var.f18803b = null;
        z3Var.invalidate();
    }
}
