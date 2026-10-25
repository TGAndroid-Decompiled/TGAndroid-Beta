package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class w3 extends AnimatorListenerAdapter {
    public final r3 f23206a;
    public final y3 f23207b;
    public final b4 f23208c;

    public w3(b4 b4Var, r3 r3Var, y3 y3Var) {
        this.f23208c = b4Var;
        this.f23206a = r3Var;
        this.f23207b = y3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        r3 r3Var = this.f23206a;
        ViewGroup viewGroup = r3Var.f23003b;
        if (viewGroup == null) {
            viewGroup = r3Var.f23004c;
        }
        b4 b4Var = this.f23208c;
        y3 y3Var = this.f23207b;
        if (viewGroup != null && r3Var.f23011m == null && (i10 = r3Var.f23006g) > 0 && (i11 = r3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                b4.g(viewGroup, -r3Var.f23007i, new li.s2(3, r3Var, y3Var));
                b4Var.f22430b = null;
                b4Var.invalidate();
                return;
            }
            r3Var.f23011m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(r3Var.f23011m);
            canvas.translate(0.0f, -r3Var.f23007i);
            viewGroup.draw(canvas);
        }
        y3Var.mo36getWindowView().setDrawingFromOverlay(false);
        y3Var.release();
        b4Var.f22430b = null;
        b4Var.invalidate();
    }
}
