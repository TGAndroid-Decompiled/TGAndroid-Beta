package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;

public final class q3 extends AnimatorListenerAdapter {

    public final l3 f23740a;

    public final s3 f23741b;

    public final v3 f23742c;

    public q3(v3 v3Var, l3 l3Var, s3 s3Var) {
        this.f23742c = v3Var;
        this.f23740a = l3Var;
        this.f23741b = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        l3 l3Var = this.f23740a;
        ViewGroup viewGroup = l3Var.f23624b;
        if (viewGroup == null) {
            viewGroup = l3Var.f23625c;
        }
        v3 v3Var = this.f23742c;
        s3 s3Var = this.f23741b;
        if (viewGroup != null && l3Var.f23631k == null && (i10 = l3Var.f23626e) > 0 && (i11 = l3Var.f23627f) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                v3.g(viewGroup, -l3Var.f23628g, new gh.d1(26, l3Var, s3Var));
                v3Var.f23885b = null;
                v3Var.invalidate();
                return;
            } else {
                l3Var.f23631k = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(l3Var.f23631k);
                canvas.translate(0.0f, -l3Var.f23628g);
                viewGroup.draw(canvas);
            }
        }
        s3Var.mo37getWindowView().setDrawingFromOverlay(false);
        s3Var.release();
        v3Var.f23885b = null;
        v3Var.invalidate();
    }
}
