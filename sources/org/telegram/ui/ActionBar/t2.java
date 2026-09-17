package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import ci.d9;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.oc;
public final class t2 extends e3 {
    public final g3 H;

    public t2(g3 g3Var, Context context) {
        super(g3Var, context);
        this.H = g3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.mainContainerDispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        try {
            return super.drawChild(canvas, view, j3);
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oc.a(this, new d9(5));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        g3 g3Var = this.H;
        g3Var.lastInsets = null;
        g3Var.container.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oc.h(this);
    }
}
