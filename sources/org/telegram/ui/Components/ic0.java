package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class ic0 extends TextView {
    public final jc0 f27080a;

    public ic0(jc0 jc0Var, Context context, int i10) {
        super(context);
        this.f27080a = jc0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        jc0 jc0Var = this.f27080a;
        if (jc0Var.e.getAdapter() instanceof ox) {
            ((ox) jc0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        jc0 jc0Var = this.f27080a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.t6.H1(background, jc0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(jc0Var.c(f7));
    }
}
