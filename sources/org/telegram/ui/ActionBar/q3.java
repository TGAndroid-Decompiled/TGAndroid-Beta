package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class q3 extends AnimatorListenerAdapter {
    public final l3 f21227a;
    public final s3 f21228b;
    public final v3 f21229c;

    public q3(v3 v3Var, l3 l3Var, s3 s3Var) {
        this.f21229c = v3Var;
        this.f21227a = l3Var;
        this.f21228b = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        l3 l3Var = this.f21227a;
        ViewGroup viewGroup = l3Var.f21106b;
        if (viewGroup == null) {
            viewGroup = l3Var.f21107c;
        }
        v3 v3Var = this.f21229c;
        s3 s3Var = this.f21228b;
        if (viewGroup != null && l3Var.f21115m == null && (i10 = l3Var.f21110g) > 0 && (i11 = l3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                v3.g(viewGroup, -l3Var.f21111i, new ai.h3(25, l3Var, s3Var));
                v3Var.f21381b = null;
                v3Var.invalidate();
                return;
            }
            l3Var.f21115m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(l3Var.f21115m);
            canvas.translate(0.0f, -l3Var.f21111i);
            viewGroup.draw(canvas);
        }
        s3Var.mo36getWindowView().setDrawingFromOverlay(false);
        s3Var.release();
        v3Var.f21381b = null;
        v3Var.invalidate();
    }
}
