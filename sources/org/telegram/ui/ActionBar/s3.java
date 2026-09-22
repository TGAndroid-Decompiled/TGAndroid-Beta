package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class s3 extends AnimatorListenerAdapter {
    public final n3 f19764a;
    public final u3 f19765b;
    public final x3 f19766c;

    public s3(x3 x3Var, n3 n3Var, u3 u3Var) {
        this.f19766c = x3Var;
        this.f19764a = n3Var;
        this.f19765b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        n3 n3Var = this.f19764a;
        ViewGroup viewGroup = n3Var.f19662b;
        if (viewGroup == null) {
            viewGroup = n3Var.f19663c;
        }
        x3 x3Var = this.f19766c;
        u3 u3Var = this.f19765b;
        if (viewGroup != null && n3Var.f19670m == null && (i10 = n3Var.f19665g) > 0 && (i11 = n3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                x3.g(viewGroup, -n3Var.f19666i, new ci.m2(24, n3Var, u3Var));
                x3Var.f19913b = null;
                x3Var.invalidate();
                return;
            }
            n3Var.f19670m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(n3Var.f19670m);
            canvas.translate(0.0f, -n3Var.f19666i);
            viewGroup.draw(canvas);
        }
        u3Var.mo37getWindowView().setDrawingFromOverlay(false);
        u3Var.release();
        x3Var.f19913b = null;
        x3Var.invalidate();
    }
}
