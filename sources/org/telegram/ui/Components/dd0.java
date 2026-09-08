package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class dd0 extends TextView {
    public final ed0 f25398a;

    public dd0(ed0 ed0Var, Context context, int i10) {
        super(context);
        this.f25398a = ed0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ed0 ed0Var = this.f25398a;
        if (ed0Var.f25684e.getAdapter() instanceof cd0) {
            ((cd0) ed0Var.f25684e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        ed0 ed0Var = this.f25398a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.j6.B1(background, ed0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(ed0Var.c(f7));
    }
}
