package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a8;
public final class j2 extends q2 {
    public final t2 I;

    public j2(t2 t2Var, Context context) {
        super(t2Var, context);
        this.I = t2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.I.Z(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Exception e10) {
            a8.g(e10, true);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new ai.y(7));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        t2 t2Var = this.I;
        t2Var.h = null;
        t2Var.f28589c.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }
}
