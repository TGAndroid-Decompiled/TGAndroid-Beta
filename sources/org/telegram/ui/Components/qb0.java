package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class qb0 extends TextView {
    public final rb0 f37285a;

    public qb0(rb0 rb0Var, Context context, int i7) {
        super(context);
        this.f37285a = rb0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        rb0 rb0Var = this.f37285a;
        if (rb0Var.f37644e.getAdapter() instanceof ax) {
            ((ax) rb0Var.f37644e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z9) {
        float f10;
        float f11;
        super.setSelected(z9);
        Drawable background = getBackground();
        rb0 rb0Var = this.f37285a;
        if (background != null) {
            if (z9) {
                f11 = 0.1f;
            } else {
                f11 = 0.05f;
            }
            org.telegram.ui.ActionBar.l6.H1(background, rb0Var.c(f11), true);
        }
        if (z9) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        setTextColor(rb0Var.c(f10));
    }
}
