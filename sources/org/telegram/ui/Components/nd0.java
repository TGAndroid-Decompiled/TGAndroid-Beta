package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class nd0 extends TextView {
    public final od0 f26714a;

    public nd0(od0 od0Var, Context context, int i10) {
        super(context);
        this.f26714a = od0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        od0 od0Var = this.f26714a;
        if (od0Var.e.getAdapter() instanceof md0) {
            ((md0) od0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        od0 od0Var = this.f26714a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.h6.B1(background, od0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(od0Var.c(f7));
    }
}
