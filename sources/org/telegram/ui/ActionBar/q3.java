package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class q3 extends AnimatorListenerAdapter {
    public final l3 f19713a;
    public final s3 f19714b;
    public final v3 f19715c;

    public q3(v3 v3Var, l3 l3Var, s3 s3Var) {
        this.f19715c = v3Var;
        this.f19713a = l3Var;
        this.f19714b = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        l3 l3Var = this.f19713a;
        ViewGroup viewGroup = l3Var.f19599b;
        if (viewGroup == null) {
            viewGroup = l3Var.f19600c;
        }
        v3 v3Var = this.f19715c;
        s3 s3Var = this.f19714b;
        if (viewGroup != null && l3Var.f19607m == null && (i10 = l3Var.f19602g) > 0 && (i11 = l3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                v3.g(viewGroup, -l3Var.f19603i, new ai.g3(25, l3Var, s3Var));
                v3Var.f19856b = null;
                v3Var.invalidate();
                return;
            }
            l3Var.f19607m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(l3Var.f19607m);
            canvas.translate(0.0f, -l3Var.f19603i);
            viewGroup.draw(canvas);
        }
        s3Var.mo37getWindowView().setDrawingFromOverlay(false);
        s3Var.release();
        v3Var.f19856b = null;
        v3Var.invalidate();
    }
}
