package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a8;
public final class n2 extends u2 {
    public final x2 I;

    public n2(x2 x2Var, Context context) {
        super(x2Var, context);
        this.I = x2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.I.Z(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        try {
            return super.drawChild(canvas, view, j3);
        } catch (Exception e10) {
            a8.g(e10, true);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new bi.t(7));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        x2 x2Var = this.I;
        x2Var.h = null;
        x2Var.f30193c.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }
}
