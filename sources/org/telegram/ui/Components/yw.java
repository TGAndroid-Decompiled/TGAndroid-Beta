package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yw extends FrameLayout {
    public final boolean f32740a;
    public final tz f32741b;

    public yw(tz tzVar, Context context, boolean z10) {
        super(context);
        this.f32741b = tzVar;
        this.f32740a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tz tzVar = this.f32741b;
        ex exVar = tzVar.B0;
        ax axVar = tzVar.D0;
        dx dxVar = tzVar.G0;
        if (!this.f32740a && (view == axVar || view == dxVar)) {
            canvas.save();
            float y3 = exVar.getY() + exVar.getMeasuredHeight() + 1.0f;
            if (view == axVar) {
                y3 = Math.max(y3, dxVar.getY() + dxVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * tzVar.f30714a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tz tzVar = this.f32741b;
        tzVar.K0 = true;
        tzVar.Y();
        hg.f1 f1Var = tzVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tz tzVar = this.f32741b;
        tzVar.K0 = false;
        tzVar.Y();
        hg.f1 f1Var = tzVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
