package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class ex extends FrameLayout {
    public final d00 f25799a;

    public ex(d00 d00Var, Context context) {
        super(context);
        this.f25799a = d00Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        d00 d00Var = this.f25799a;
        ix ixVar = d00Var.f25116o0;
        if (view == d00Var.f25096h0) {
            canvas.save();
            canvas.clipRect(0.0f, ixVar.getY() + ixVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
