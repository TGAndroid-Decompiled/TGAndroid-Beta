package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ic;
public final class t2 extends e3 {
    public final g3 E;

    public t2(g3 g3Var, Context context) {
        super(g3Var, context);
        this.E = g3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.E.mainContainerDispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this, new gg.w(4));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        g3 g3Var = this.E;
        g3Var.lastInsets = null;
        g3Var.container.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this);
    }
}
