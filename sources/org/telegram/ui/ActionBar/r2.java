package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ec;

public final class r2 extends c3 {
    public final e3 D;

    public r2(e3 e3Var, Context context) {
        super(e3Var, context);
        this.D = e3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.D.mainContainerDispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Exception e9) {
            FileLog.e(e9);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ec.a(this, new cg.w(9));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        e3 e3Var = this.D;
        e3Var.lastInsets = null;
        e3Var.container.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ec.h(this);
    }
}
