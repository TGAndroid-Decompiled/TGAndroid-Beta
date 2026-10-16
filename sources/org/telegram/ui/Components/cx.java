package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cx extends FrameLayout {
    public final boolean f23904a;
    public final wz f23905b;

    public cx(wz wzVar, Context context, boolean z10) {
        super(context);
        this.f23905b = wzVar;
        this.f23904a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wz wzVar = this.f23905b;
        ix ixVar = wzVar.B0;
        ex exVar = wzVar.D0;
        hx hxVar = wzVar.G0;
        if (!this.f23904a && (view == exVar || view == hxVar)) {
            canvas.save();
            float y3 = ixVar.getY() + ixVar.getMeasuredHeight() + 1.0f;
            if (view == exVar) {
                y3 = Math.max(y3, hxVar.getY() + hxVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * wzVar.f30698a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wz wzVar = this.f23905b;
        wzVar.K0 = true;
        wzVar.Y();
        hg.f1 f1Var = wzVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wz wzVar = this.f23905b;
        wzVar.K0 = false;
        wzVar.Y();
        hg.f1 f1Var = wzVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
