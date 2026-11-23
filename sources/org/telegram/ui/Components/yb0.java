package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class yb0 extends TextView {
    public final zb0 f42408a;

    public yb0(zb0 zb0Var, Context context, int i7) {
        super(context);
        this.f42408a = zb0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        zb0 zb0Var = this.f42408a;
        if (zb0Var.f42816e.getAdapter() instanceof kx) {
            ((kx) zb0Var.f42816e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f10;
        float f11;
        super.setSelected(z10);
        Drawable background = getBackground();
        zb0 zb0Var = this.f42408a;
        if (background != null) {
            if (z10) {
                f11 = 0.1f;
            } else {
                f11 = 0.05f;
            }
            org.telegram.ui.ActionBar.n6.H1(background, zb0Var.c(f11), true);
        }
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        setTextColor(zb0Var.c(f10));
    }
}
