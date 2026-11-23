package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a8;
public final class m2 extends t2 {
    public final w2 I;

    public m2(w2 w2Var, Context context) {
        super(w2Var, context);
        this.I = w2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.I.Z(canvas);
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
        setTag(2131296353, new bi.t(7));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        w2 w2Var = this.I;
        w2Var.h = null;
        w2Var.f30179c.requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }
}
