package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class cd0 extends TextView {
    public final dd0 f23027a;

    public cd0(dd0 dd0Var, Context context, int i10) {
        super(context);
        this.f23027a = dd0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        dd0 dd0Var = this.f23027a;
        if (dd0Var.e.getAdapter() instanceof bd0) {
            ((bd0) dd0Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        dd0 dd0Var = this.f23027a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.j6.B1(background, dd0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(dd0Var.c(f7));
    }
}
