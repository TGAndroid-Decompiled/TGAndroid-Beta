package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class md0 extends TextView {
    public final nd0 f25221a;

    public md0(nd0 nd0Var, Context context, int i10) {
        super(context);
        this.f25221a = nd0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        nd0 nd0Var = this.f25221a;
        if (nd0Var.e.getAdapter() instanceof kd0) {
            ((kd0) nd0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        nd0 nd0Var = this.f25221a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.j6.B1(background, nd0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(nd0Var.c(f7));
    }
}
