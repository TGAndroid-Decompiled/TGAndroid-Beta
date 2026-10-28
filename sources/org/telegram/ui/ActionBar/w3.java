package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class w3 extends AnimatorListenerAdapter {
    public final r3 f23209a;
    public final y3 f23210b;
    public final b4 f23211c;

    public w3(b4 b4Var, r3 r3Var, y3 y3Var) {
        this.f23211c = b4Var;
        this.f23209a = r3Var;
        this.f23210b = y3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        r3 r3Var = this.f23209a;
        ViewGroup viewGroup = r3Var.f23006b;
        if (viewGroup == null) {
            viewGroup = r3Var.f23007c;
        }
        b4 b4Var = this.f23211c;
        y3 y3Var = this.f23210b;
        if (viewGroup != null && r3Var.f23014m == null && (i10 = r3Var.f23009g) > 0 && (i11 = r3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                b4.g(viewGroup, -r3Var.f23010i, new li.s2(3, r3Var, y3Var));
                b4Var.f22433b = null;
                b4Var.invalidate();
                return;
            }
            r3Var.f23014m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(r3Var.f23014m);
            canvas.translate(0.0f, -r3Var.f23010i);
            viewGroup.draw(canvas);
        }
        y3Var.mo36getWindowView().setDrawingFromOverlay(false);
        y3Var.release();
        b4Var.f22433b = null;
        b4Var.invalidate();
    }
}
