package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class kb0 extends TextView {
    public final lb0 f35361a;

    public kb0(lb0 lb0Var, Context context, int i3) {
        super(context);
        this.f35361a = lb0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        lb0 lb0Var = this.f35361a;
        if (lb0Var.f35679e.getAdapter() instanceof yw) {
            ((yw) lb0Var.f35679e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f10;
        float f11;
        super.setSelected(z10);
        Drawable background = getBackground();
        lb0 lb0Var = this.f35361a;
        if (background != null) {
            if (z10) {
                f11 = 0.1f;
            } else {
                f11 = 0.05f;
            }
            org.telegram.ui.ActionBar.k6.H1(background, lb0Var.c(f11), true);
        }
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        setTextColor(lb0Var.c(f10));
    }
}
