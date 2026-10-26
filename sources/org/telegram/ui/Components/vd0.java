package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class vd0 extends TextView {
    public final wd0 f33638a;

    public vd0(wd0 wd0Var, Context context, int i10) {
        super(context);
        this.f33638a = wd0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        wd0 wd0Var = this.f33638a;
        if (wd0Var.e.getAdapter() instanceof ud0) {
            ((ud0) wd0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        wd0 wd0Var = this.f33638a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.y6.E1(background, wd0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(wd0Var.c(f7));
    }
}
