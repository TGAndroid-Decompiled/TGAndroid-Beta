package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class q3 extends AnimatorListenerAdapter {
    public final l3 f19698a;
    public final s3 f19699b;
    public final v3 f19700c;

    public q3(v3 v3Var, l3 l3Var, s3 s3Var) {
        this.f19700c = v3Var;
        this.f19698a = l3Var;
        this.f19699b = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        l3 l3Var = this.f19698a;
        ViewGroup viewGroup = l3Var.f19584b;
        if (viewGroup == null) {
            viewGroup = l3Var.f19585c;
        }
        v3 v3Var = this.f19700c;
        s3 s3Var = this.f19699b;
        if (viewGroup != null && l3Var.f19592m == null && (i10 = l3Var.f19587g) > 0 && (i11 = l3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                v3.g(viewGroup, -l3Var.f19588i, new ai.g3(25, l3Var, s3Var));
                v3Var.f19841b = null;
                v3Var.invalidate();
                return;
            }
            l3Var.f19592m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(l3Var.f19592m);
            canvas.translate(0.0f, -l3Var.f19588i);
            viewGroup.draw(canvas);
        }
        s3Var.mo37getWindowView().setDrawingFromOverlay(false);
        s3Var.release();
        v3Var.f19841b = null;
        v3Var.invalidate();
    }
}
