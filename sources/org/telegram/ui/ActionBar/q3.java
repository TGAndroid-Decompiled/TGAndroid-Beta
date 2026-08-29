package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class q3 extends AnimatorListenerAdapter {
    public final l3 f23757a;
    public final s3 f23758b;
    public final v3 f23759c;

    public q3(v3 v3Var, l3 l3Var, s3 s3Var) {
        this.f23759c = v3Var;
        this.f23757a = l3Var;
        this.f23758b = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        l3 l3Var = this.f23757a;
        ViewGroup viewGroup = l3Var.f23642b;
        if (viewGroup == null) {
            viewGroup = l3Var.f23643c;
        }
        v3 v3Var = this.f23759c;
        s3 s3Var = this.f23758b;
        if (viewGroup != null && l3Var.f23649k == null && (i10 = l3Var.f23644e) > 0 && (i11 = l3Var.f23645f) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                v3.g(viewGroup, -l3Var.f23646g, new ih.b1(19, l3Var, s3Var));
                v3Var.f23875b = null;
                v3Var.invalidate();
                return;
            }
            l3Var.f23649k = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(l3Var.f23649k);
            canvas.translate(0.0f, -l3Var.f23646g);
            viewGroup.draw(canvas);
        }
        s3Var.mo37getWindowView().setDrawingFromOverlay(false);
        s3Var.release();
        v3Var.f23875b = null;
        v3Var.invalidate();
    }
}
