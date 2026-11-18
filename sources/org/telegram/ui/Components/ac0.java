package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class ac0 extends TextView {
    public final bc0 f33330a;

    public ac0(bc0 bc0Var, Context context, int i7) {
        super(context);
        this.f33330a = bc0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bc0 bc0Var = this.f33330a;
        if (bc0Var.f33656e.getAdapter() instanceof lx) {
            ((lx) bc0Var.f33656e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f10;
        float f11;
        super.setSelected(z10);
        Drawable background = getBackground();
        bc0 bc0Var = this.f33330a;
        if (background != null) {
            if (z10) {
                f11 = 0.1f;
            } else {
                f11 = 0.05f;
            }
            org.telegram.ui.ActionBar.n6.H1(background, bc0Var.c(f11), true);
        }
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        setTextColor(bc0Var.c(f10));
    }
}
