package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
public final class t3 extends AnimatorListenerAdapter {
    public final o3 f19558a;
    public final v3 f19559b;
    public final y3 f19560c;

    public t3(y3 y3Var, o3 o3Var, v3 v3Var) {
        this.f19560c = y3Var;
        this.f19558a = o3Var;
        this.f19559b = v3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        o3 o3Var = this.f19558a;
        ViewGroup viewGroup = o3Var.f19455b;
        if (viewGroup == null) {
            viewGroup = o3Var.f19456c;
        }
        y3 y3Var = this.f19560c;
        v3 v3Var = this.f19559b;
        if (viewGroup != null && o3Var.f19463m == null && (i10 = o3Var.f19458g) > 0 && (i11 = o3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                y3.g(viewGroup, -o3Var.f19459i, new ci.m2(24, o3Var, v3Var));
                y3Var.f19707b = null;
                y3Var.invalidate();
                return;
            }
            o3Var.f19463m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(o3Var.f19463m);
            canvas.translate(0.0f, -o3Var.f19459i);
            viewGroup.draw(canvas);
        }
        v3Var.mo37getWindowView().setDrawingFromOverlay(false);
        v3Var.release();
        y3Var.f19707b = null;
        y3Var.invalidate();
    }
}
