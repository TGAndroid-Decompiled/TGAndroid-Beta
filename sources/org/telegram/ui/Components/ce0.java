package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class ce0 extends TextView {
    public final de0 f24066a;

    public ce0(de0 de0Var, Context context, int i10) {
        super(context);
        this.f24066a = de0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        de0 de0Var = this.f24066a;
        if (de0Var.e.getAdapter() instanceof be0) {
            ((be0) de0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        de0 de0Var = this.f24066a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.g6.C1(background, de0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(de0Var.c(f7));
    }
}
