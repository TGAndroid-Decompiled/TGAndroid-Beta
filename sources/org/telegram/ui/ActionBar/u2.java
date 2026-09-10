package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import bi.fa;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.pc;
public final class u2 extends f3 {
    public final h3 H;

    public u2(h3 h3Var, Context context) {
        super(h3Var, context);
        this.H = h3Var;
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
        pc.a(this, new fa(5));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        h3 h3Var = this.H;
        h3Var.lastInsets = null;
        h3Var.container.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pc.h(this);
    }
}
