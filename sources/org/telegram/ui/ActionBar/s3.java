package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class s3 extends AnimatorListenerAdapter {
    public final n3 f21326a;
    public final u3 f21327b;
    public final x3 f21328c;

    public s3(x3 x3Var, n3 n3Var, u3 u3Var) {
        this.f21328c = x3Var;
        this.f21326a = n3Var;
        this.f21327b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        n3 n3Var = this.f21326a;
        ViewGroup viewGroup = n3Var.f21217b;
        if (viewGroup == null) {
            viewGroup = n3Var.f21218c;
        }
        x3 x3Var = this.f21328c;
        u3 u3Var = this.f21327b;
        if (viewGroup != null && n3Var.f21226m == null && (i10 = n3Var.f21221g) > 0 && (i11 = n3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                x3.g(viewGroup, -n3Var.f21222i, new di.m2(24, n3Var, u3Var));
                x3Var.f21485b = null;
                x3Var.invalidate();
                return;
            }
            n3Var.f21226m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(n3Var.f21226m);
            canvas.translate(0.0f, -n3Var.f21222i);
            viewGroup.draw(canvas);
        }
        u3Var.mo37getWindowView().setDrawingFromOverlay(false);
        u3Var.release();
        x3Var.f21485b = null;
        x3Var.invalidate();
    }
}
