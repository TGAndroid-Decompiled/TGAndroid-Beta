package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import fi.r7;
import org.telegram.messenger.a8;
public final class l2 extends s2 {
    public final v2 H;

    public l2(v2 v2Var, Context context) {
        super(v2Var, context);
        this.H = v2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.Z(canvas);
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
        setTag(2131296351, new r7(6));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        v2 v2Var = this.H;
        v2Var.h = null;
        v2Var.f28627c.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }
}
