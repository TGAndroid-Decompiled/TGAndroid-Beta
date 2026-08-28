package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.gc;
public final class s2 extends d3 {
    public final f3 D;

    public s2(f3 f3Var, Context context) {
        super(f3Var, context);
        this.D = f3Var;
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
        } catch (Exception e10) {
            FileLog.e(e10);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gc.a(this, new bg.z(9));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        f3 f3Var = this.D;
        f3Var.lastInsets = null;
        f3Var.container.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this);
    }
}
