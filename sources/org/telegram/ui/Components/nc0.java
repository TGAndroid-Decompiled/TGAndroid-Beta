package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

public final class nc0 extends TextView {

    public final oc0 f30951a;

    public nc0(oc0 oc0Var, Context context, int i10) {
        super(context);
        this.f30951a = oc0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        oc0 oc0Var = this.f30951a;
        if (oc0Var.f31253e.getAdapter() instanceof mc0) {
            ((mc0) oc0Var.f31253e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        oc0 oc0Var = this.f30951a;
        if (background != null) {
            org.telegram.ui.ActionBar.g6.B1(background, oc0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(oc0Var.c(z10 ? 0.8f : 0.6f));
    }
}
