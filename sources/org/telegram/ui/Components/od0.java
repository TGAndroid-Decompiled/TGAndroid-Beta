package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class od0 extends TextView {
    public final pd0 f27057a;

    public od0(pd0 pd0Var, Context context, int i10) {
        super(context);
        this.f27057a = pd0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pd0 pd0Var = this.f27057a;
        if (pd0Var.e.getAdapter() instanceof nd0) {
            ((nd0) pd0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        pd0 pd0Var = this.f27057a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.j6.B1(background, pd0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(pd0Var.c(f7));
    }
}
