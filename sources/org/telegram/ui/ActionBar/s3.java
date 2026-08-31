package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class s3 extends AnimatorListenerAdapter {
    public final n3 f22281a;
    public final u3 f22282b;
    public final x3 f22283c;

    public s3(x3 x3Var, n3 n3Var, u3 u3Var) {
        this.f22283c = x3Var;
        this.f22281a = n3Var;
        this.f22282b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        n3 n3Var = this.f22281a;
        ViewGroup viewGroup = n3Var.f22161b;
        if (viewGroup == null) {
            viewGroup = n3Var.f22162c;
        }
        x3 x3Var = this.f22283c;
        u3 u3Var = this.f22282b;
        if (viewGroup != null && n3Var.f22168k == null && (i10 = n3Var.f22163e) > 0 && (i11 = n3Var.f22164f) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                x3.g(viewGroup, -n3Var.f22165g, new lh.a1(11, n3Var, u3Var));
                x3Var.f22407b = null;
                x3Var.invalidate();
                return;
            }
            n3Var.f22168k = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(n3Var.f22168k);
            canvas.translate(0.0f, -n3Var.f22165g);
            viewGroup.draw(canvas);
        }
        u3Var.mo36getWindowView().setDrawingFromOverlay(false);
        u3Var.release();
        x3Var.f22407b = null;
        x3Var.invalidate();
    }
}
