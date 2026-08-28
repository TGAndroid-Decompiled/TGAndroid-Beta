package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class q3 extends AnimatorListenerAdapter {
    public final l3 f23735a;
    public final s3 f23736b;
    public final v3 f23737c;

    public q3(v3 v3Var, l3 l3Var, s3 s3Var) {
        this.f23737c = v3Var;
        this.f23735a = l3Var;
        this.f23736b = s3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        int i10;
        l3 l3Var = this.f23735a;
        ViewGroup viewGroup = l3Var.f23620b;
        if (viewGroup == null) {
            viewGroup = l3Var.f23621c;
        }
        v3 v3Var = this.f23737c;
        s3 s3Var = this.f23736b;
        if (viewGroup != null && l3Var.f23627k == null && (i9 = l3Var.f23622e) > 0 && (i10 = l3Var.f23623f) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                v3.g(viewGroup, -l3Var.f23624g, new fh.f1(26, l3Var, s3Var));
                v3Var.f23855b = null;
                v3Var.invalidate();
                return;
            }
            l3Var.f23627k = Bitmap.createBitmap(i9, i10, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(l3Var.f23627k);
            canvas.translate(0.0f, -l3Var.f23624g);
            viewGroup.draw(canvas);
        }
        s3Var.mo37getWindowView().setDrawingFromOverlay(false);
        s3Var.release();
        v3Var.f23855b = null;
        v3Var.invalidate();
    }
}
