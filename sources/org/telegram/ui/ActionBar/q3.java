package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class q3 extends AnimatorListenerAdapter {
    public final l3 f20598a;
    public final s3 f20599b;
    public final v3 f20600c;

    public q3(v3 v3Var, l3 l3Var, s3 s3Var) {
        this.f20600c = v3Var;
        this.f20598a = l3Var;
        this.f20599b = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        l3 l3Var = this.f20598a;
        ViewGroup viewGroup = l3Var.f20486b;
        if (viewGroup == null) {
            viewGroup = l3Var.f20487c;
        }
        v3 v3Var = this.f20600c;
        s3 s3Var = this.f20599b;
        if (viewGroup != null && l3Var.f20494m == null && (i10 = l3Var.f20489g) > 0 && (i11 = l3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                v3.g(viewGroup, -l3Var.f20490i, new bi.v2(25, l3Var, s3Var));
                v3Var.f20742b = null;
                v3Var.invalidate();
                return;
            }
            l3Var.f20494m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(l3Var.f20494m);
            canvas.translate(0.0f, -l3Var.f20490i);
            viewGroup.draw(canvas);
        }
        s3Var.mo36getWindowView().setDrawingFromOverlay(false);
        s3Var.release();
        v3Var.f20742b = null;
        v3Var.invalidate();
    }
}
