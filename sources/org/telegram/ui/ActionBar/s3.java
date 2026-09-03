package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class s3 extends AnimatorListenerAdapter {
    public final n3 f22283a;
    public final u3 f22284b;
    public final x3 f22285c;

    public s3(x3 x3Var, n3 n3Var, u3 u3Var) {
        this.f22285c = x3Var;
        this.f22283a = n3Var;
        this.f22284b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        n3 n3Var = this.f22283a;
        ViewGroup viewGroup = n3Var.f22163b;
        if (viewGroup == null) {
            viewGroup = n3Var.f22164c;
        }
        x3 x3Var = this.f22285c;
        u3 u3Var = this.f22284b;
        if (viewGroup != null && n3Var.f22170k == null && (i10 = n3Var.f22165e) > 0 && (i11 = n3Var.f22166f) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                x3.g(viewGroup, -n3Var.f22167g, new lh.a1(11, n3Var, u3Var));
                x3Var.f22409b = null;
                x3Var.invalidate();
                return;
            }
            n3Var.f22170k = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(n3Var.f22170k);
            canvas.translate(0.0f, -n3Var.f22167g);
            viewGroup.draw(canvas);
        }
        u3Var.mo36getWindowView().setDrawingFromOverlay(false);
        u3Var.release();
        x3Var.f22409b = null;
        x3Var.invalidate();
    }
}
