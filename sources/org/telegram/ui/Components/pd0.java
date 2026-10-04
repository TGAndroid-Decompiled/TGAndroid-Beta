package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class pd0 extends TextView {
    public final qd0 f29636a;

    public pd0(qd0 qd0Var, Context context, int i10) {
        super(context);
        this.f29636a = qd0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qd0 qd0Var = this.f29636a;
        if (qd0Var.f30009e.getAdapter() instanceof od0) {
            ((od0) qd0Var.f30009e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        float f7;
        float f10;
        super.setSelected(z10);
        Drawable background = getBackground();
        qd0 qd0Var = this.f29636a;
        if (background != null) {
            if (z10) {
                f10 = 0.1f;
            } else {
                f10 = 0.05f;
            }
            org.telegram.ui.ActionBar.i6.B1(background, qd0Var.c(f10), true);
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.6f;
        }
        setTextColor(qd0Var.c(f7));
    }
}
