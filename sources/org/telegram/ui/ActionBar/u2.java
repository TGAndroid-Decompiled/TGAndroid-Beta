package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ic;
public final class u2 extends f3 {
    public final h3 E;

    public u2(h3 h3Var, Context context) {
        super(h3Var, context);
        this.E = h3Var;
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
        } catch (Exception e6) {
            FileLog.e(e6);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this, new hg.w(4));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        h3 h3Var = this.E;
        h3Var.lastInsets = null;
        h3Var.container.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this);
    }
}
