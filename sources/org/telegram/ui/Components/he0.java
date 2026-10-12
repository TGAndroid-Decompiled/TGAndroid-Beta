package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class he0 extends TextView {
    public final ie0 f26764a;

    public he0(ie0 ie0Var, Context context, int i10) {
        super(context);
        this.f26764a = ie0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ie0 ie0Var = this.f26764a;
        if (ie0Var.f27151e.getAdapter() instanceof ge0) {
            ((ge0) ie0Var.f27151e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        ie0 ie0Var = this.f26764a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.h6.C1(background, ie0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(ie0Var.c(f7));
    }
}
