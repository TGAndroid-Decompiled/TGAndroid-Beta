package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import ci.a9;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.qc;
public final class r2 extends c3 {
    public final e3 H;

    public r2(e3 e3Var, Context context) {
        super(e3Var, context);
        this.H = e3Var;
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
        qc.a(this, new a9(5));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        e3 e3Var = this.H;
        e3Var.lastInsets = null;
        e3Var.container.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }
}
