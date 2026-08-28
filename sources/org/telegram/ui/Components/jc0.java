package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class jc0 extends TextView {
    public final kc0 f29716a;

    public jc0(kc0 kc0Var, Context context, int i9) {
        super(context);
        this.f29716a = kc0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        kc0 kc0Var = this.f29716a;
        if (kc0Var.f30056e.getAdapter() instanceof ic0) {
            ((ic0) kc0Var.f30056e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f10;
        float f11;
        super.setSelected(z10);
        Drawable background = getBackground();
        kc0 kc0Var = this.f29716a;
        if (background != null) {
            if (z10) {
                f11 = 0.1f;
            } else {
                f11 = 0.05f;
            }
            org.telegram.ui.ActionBar.f6.B1(background, kc0Var.c(f11), true);
        }
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        setTextColor(kc0Var.c(f10));
    }
}
