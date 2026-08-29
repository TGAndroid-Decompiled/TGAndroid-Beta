package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class yc0 extends TextView {
    public final zc0 f35044a;

    public yc0(zc0 zc0Var, Context context, int i10) {
        super(context);
        this.f35044a = zc0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        zc0 zc0Var = this.f35044a;
        if (zc0Var.f35316e.getAdapter() instanceof xc0) {
            ((xc0) zc0Var.f35316e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f9;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        zc0 zc0Var = this.f35044a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.g6.B1(background, zc0Var.c(f10), true);
        }
        if (z10) {
            f9 = 0.8f;
        } else {
            f9 = 0.6f;
        }
        setTextColor(zc0Var.c(f9));
    }
}
