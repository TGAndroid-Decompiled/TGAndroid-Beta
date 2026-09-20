package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class ld0 extends TextView {
    public final md0 f26117a;

    public ld0(md0 md0Var, Context context, int i10) {
        super(context);
        this.f26117a = md0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        md0 md0Var = this.f26117a;
        if (md0Var.e.getAdapter() instanceof kd0) {
            ((kd0) md0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        md0 md0Var = this.f26117a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.j6.B1(background, md0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(md0Var.c(f7));
    }
}
