package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class ee0 extends TextView {
    public final fe0 f26036a;

    public ee0(fe0 fe0Var, Context context, int i10) {
        super(context);
        this.f26036a = fe0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fe0 fe0Var = this.f26036a;
        if (fe0Var.f26399e.getAdapter() instanceof de0) {
            ((de0) fe0Var.f26399e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        fe0 fe0Var = this.f26036a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.i6.C1(background, fe0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(fe0Var.c(f7));
    }
}
