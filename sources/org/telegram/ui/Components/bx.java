package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class bx extends FrameLayout {
    public final a00 f25178a;

    public bx(a00 a00Var, Context context) {
        super(context);
        this.f25178a = a00Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        a00 a00Var = this.f25178a;
        fx fxVar = a00Var.f24437o0;
        if (view == a00Var.f24417h0) {
            canvas.save();
            canvas.clipRect(0.0f, fxVar.getY() + fxVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
