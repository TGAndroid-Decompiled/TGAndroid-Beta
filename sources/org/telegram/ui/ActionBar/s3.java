package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class s3 extends AnimatorListenerAdapter {
    public final n3 f19749a;
    public final u3 f19750b;
    public final x3 f19751c;

    public s3(x3 x3Var, n3 n3Var, u3 u3Var) {
        this.f19751c = x3Var;
        this.f19749a = n3Var;
        this.f19750b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        n3 n3Var = this.f19749a;
        ViewGroup viewGroup = n3Var.f19647b;
        if (viewGroup == null) {
            viewGroup = n3Var.f19648c;
        }
        x3 x3Var = this.f19751c;
        u3 u3Var = this.f19750b;
        if (viewGroup != null && n3Var.f19655m == null && (i10 = n3Var.f19650g) > 0 && (i11 = n3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                x3.g(viewGroup, -n3Var.f19651i, new ci.m2(24, n3Var, u3Var));
                x3Var.f19898b = null;
                x3Var.invalidate();
                return;
            }
            n3Var.f19655m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(n3Var.f19655m);
            canvas.translate(0.0f, -n3Var.f19651i);
            viewGroup.draw(canvas);
        }
        u3Var.mo37getWindowView().setDrawingFromOverlay(false);
        u3Var.release();
        x3Var.f19898b = null;
        x3Var.invalidate();
    }
}
