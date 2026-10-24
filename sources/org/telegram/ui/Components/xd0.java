package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class xd0 extends TextView {
    public final yd0 f32563a;

    public xd0(yd0 yd0Var, Context context, int i10) {
        super(context);
        this.f32563a = yd0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yd0 yd0Var = this.f32563a;
        if (yd0Var.e.getAdapter() instanceof wd0) {
            ((wd0) yd0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        yd0 yd0Var = this.f32563a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.k6.E1(background, yd0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(yd0Var.c(f7));
    }
}
