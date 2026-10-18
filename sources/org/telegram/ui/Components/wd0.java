package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class wd0 extends TextView {
    public final xd0 f32115a;

    public wd0(xd0 xd0Var, Context context, int i10) {
        super(context);
        this.f32115a = xd0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        xd0 xd0Var = this.f32115a;
        if (xd0Var.e.getAdapter() instanceof vd0) {
            ((vd0) xd0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        xd0 xd0Var = this.f32115a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.h6.C1(background, xd0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(xd0Var.c(f7));
    }
}
