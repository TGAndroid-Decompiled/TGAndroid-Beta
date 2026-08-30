package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class ed0 extends TextView {
    public final fd0 f24555a;

    public ed0(fd0 fd0Var, Context context, int i10) {
        super(context);
        this.f24555a = fd0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fd0 fd0Var = this.f24555a;
        if (fd0Var.e.getAdapter() instanceof dd0) {
            ((dd0) fd0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z4) {
        float f10;
        float f11;
        super.setSelected(z4);
        Drawable background = getBackground();
        fd0 fd0Var = this.f24555a;
        if (background != null) {
            if (z4) {
                f11 = 0.1f;
            } else {
                f11 = 0.05f;
            }
            org.telegram.ui.ActionBar.j6.B1(background, fd0Var.c(f11), true);
        }
        if (z4) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        setTextColor(fd0Var.c(f10));
    }
}
