package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class zd0 extends TextView {
    public final ae0 f33203a;

    public zd0(ae0 ae0Var, Context context, int i10) {
        super(context);
        this.f33203a = ae0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ae0 ae0Var = this.f33203a;
        if (ae0Var.e.getAdapter() instanceof yd0) {
            ((yd0) ae0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        ae0 ae0Var = this.f33203a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.k6.E1(background, ae0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(ae0Var.c(f7));
    }
}
