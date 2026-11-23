package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class bc0 extends TextView {
    public final cc0 f33802a;

    public bc0(cc0 cc0Var, Context context, int i7) {
        super(context);
        this.f33802a = cc0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        cc0 cc0Var = this.f33802a;
        if (cc0Var.f34140e.getAdapter() instanceof nx) {
            ((nx) cc0Var.f34140e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f10;
        float f11;
        super.setSelected(z10);
        Drawable background = getBackground();
        cc0 cc0Var = this.f33802a;
        if (background != null) {
            if (z10) {
                f11 = 0.1f;
            } else {
                f11 = 0.05f;
            }
            org.telegram.ui.ActionBar.m6.H1(background, cc0Var.c(f11), true);
        }
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        setTextColor(cc0Var.c(f10));
    }
}
