package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class pb0 extends TextView {
    public final qb0 f36884a;

    public pb0(qb0 qb0Var, Context context, int i7) {
        super(context);
        this.f36884a = qb0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qb0 qb0Var = this.f36884a;
        if (qb0Var.f37235e.getAdapter() instanceof zw) {
            ((zw) qb0Var.f37235e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z9) {
        float f10;
        float f11;
        super.setSelected(z9);
        Drawable background = getBackground();
        qb0 qb0Var = this.f36884a;
        if (background != null) {
            if (z9) {
                f11 = 0.1f;
            } else {
                f11 = 0.05f;
            }
            org.telegram.ui.ActionBar.m6.H1(background, qb0Var.c(f11), true);
        }
        if (z9) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        setTextColor(qb0Var.c(f10));
    }
}
