package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class de0 extends TextView {
    public final ee0 f25695a;

    public de0(ee0 ee0Var, Context context, int i10) {
        super(context);
        this.f25695a = ee0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ee0 ee0Var = this.f25695a;
        if (ee0Var.f26070e.getAdapter() instanceof ce0) {
            ((ce0) ee0Var.f26070e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        ee0 ee0Var = this.f25695a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.i6.C1(background, ee0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(ee0Var.c(f7));
    }
}
