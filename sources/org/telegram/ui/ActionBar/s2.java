package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import di.c9;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.qc;
public final class s2 extends d3 {
    public final f3 H;

    public s2(f3 f3Var, Context context) {
        super(f3Var, context);
        this.H = f3Var;
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
        } catch (Exception e7) {
            FileLog.e(e7);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this, new c9(5));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        f3 f3Var = this.H;
        f3Var.lastInsets = null;
        f3Var.container.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }
}
