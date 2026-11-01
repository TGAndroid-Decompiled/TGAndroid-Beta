package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.f8;
public final class p2 extends w2 {
    public final z2 H;

    public p2(z2 z2Var, Context context) {
        super(z2Var, context);
        this.H = z2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.Z(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Exception e) {
            f8.g(e, true);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new mg.u(3));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        z2 z2Var = this.H;
        z2Var.h = null;
        z2Var.f21590c.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }
}
