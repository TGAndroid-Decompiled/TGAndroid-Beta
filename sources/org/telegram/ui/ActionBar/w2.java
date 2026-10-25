package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import fi.k8;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.qc;
public final class w2 extends h3 {
    public final k3 H;

    public w2(k3 k3Var, Context context) {
        super(k3Var, context);
        this.H = k3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.mainContainerDispatchDraw(canvas);
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
        qc.a(this, new k8(5));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        k3 k3Var = this.H;
        k3Var.lastInsets = null;
        k3Var.container.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }
}
