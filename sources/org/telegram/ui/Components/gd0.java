package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class gd0 extends TextView {
    public final hd0 f27167a;

    public gd0(hd0 hd0Var, Context context, int i10) {
        super(context);
        this.f27167a = hd0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hd0 hd0Var = this.f27167a;
        if (hd0Var.f27464e.getAdapter() instanceof fd0) {
            ((fd0) hd0Var.f27464e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z4) {
        float f10;
        float f11;
        super.setSelected(z4);
        Drawable background = getBackground();
        hd0 hd0Var = this.f27167a;
        if (background != null) {
            if (z4) {
                f11 = 0.1f;
            } else {
                f11 = 0.05f;
            }
            org.telegram.ui.ActionBar.k6.B1(background, hd0Var.c(f11), true);
        }
        if (z4) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        setTextColor(hd0Var.c(f10));
    }
}
