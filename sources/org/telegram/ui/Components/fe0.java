package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class fe0 extends TextView {
    public final ge0 f26341a;

    public fe0(ge0 ge0Var, Context context, int i10) {
        super(context);
        this.f26341a = ge0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ge0 ge0Var = this.f26341a;
        if (ge0Var.f26703e.getAdapter() instanceof ee0) {
            ((ee0) ge0Var.f26703e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        ge0 ge0Var = this.f26341a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.h6.C1(background, ge0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(ge0Var.c(f7));
    }
}
