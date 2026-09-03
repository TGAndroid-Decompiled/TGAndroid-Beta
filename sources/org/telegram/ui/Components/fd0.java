package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class fd0 extends TextView {
    public final gd0 f24864a;

    public fd0(gd0 gd0Var, Context context, int i10) {
        super(context);
        this.f24864a = gd0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gd0 gd0Var = this.f24864a;
        if (gd0Var.e.getAdapter() instanceof ed0) {
            ((ed0) gd0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z4) {
        float f10;
        float f11;
        super.setSelected(z4);
        Drawable background = getBackground();
        gd0 gd0Var = this.f24864a;
        if (background != null) {
            if (z4) {
                f11 = 0.1f;
            } else {
                f11 = 0.05f;
            }
            org.telegram.ui.ActionBar.j6.B1(background, gd0Var.c(f11), true);
        }
        if (z4) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        setTextColor(gd0Var.c(f10));
    }
}
