package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hx extends FrameLayout {
    public final boolean f27091a;
    public final b00 f27092b;

    public hx(b00 b00Var, Context context, boolean z10) {
        super(context);
        this.f27092b = b00Var;
        this.f27091a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        b00 b00Var = this.f27092b;
        nx nxVar = b00Var.B0;
        jx jxVar = b00Var.D0;
        mx mxVar = b00Var.G0;
        if (!this.f27091a && (view == jxVar || view == mxVar)) {
            canvas.save();
            float y3 = nxVar.getY() + nxVar.getMeasuredHeight() + 1.0f;
            if (view == jxVar) {
                y3 = Math.max(y3, mxVar.getY() + mxVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * b00Var.f24653a.f16365e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b00 b00Var = this.f27092b;
        b00Var.K0 = true;
        b00Var.Y();
        gg.f1 f1Var = b00Var.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b00 b00Var = this.f27092b;
        b00Var.K0 = false;
        b00Var.Y();
        gg.f1 f1Var = b00Var.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
