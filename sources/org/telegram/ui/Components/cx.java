package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class cx extends FrameLayout {
    public final b00 f25486a;

    public cx(b00 b00Var, Context context) {
        super(context);
        this.f25486a = b00Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        b00 b00Var = this.f25486a;
        gx gxVar = b00Var.f24725o0;
        if (view == b00Var.f24705h0) {
            canvas.save();
            canvas.clipRect(0.0f, gxVar.getY() + gxVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
