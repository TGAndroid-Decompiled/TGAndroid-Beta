package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ww extends FrameLayout {
    public final boolean f28853a;
    public final rz f28854b;

    public ww(rz rzVar, Context context, boolean z10) {
        super(context);
        this.f28854b = rzVar;
        this.f28853a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        rz rzVar = this.f28854b;
        cx cxVar = rzVar.B0;
        yw ywVar = rzVar.D0;
        bx bxVar = rzVar.G0;
        if (!this.f28853a && (view == ywVar || view == bxVar)) {
            canvas.save();
            float y3 = cxVar.getY() + cxVar.getMeasuredHeight() + 1.0f;
            if (view == ywVar) {
                y3 = Math.max(y3, bxVar.getY() + bxVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * rzVar.f26796a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rz rzVar = this.f28854b;
        rzVar.K0 = true;
        rzVar.a0();
        fg.h1 h1Var = rzVar.T0;
        if (h1Var != null) {
            h1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rz rzVar = this.f28854b;
        rzVar.K0 = false;
        rzVar.a0();
        fg.h1 h1Var = rzVar.T0;
        if (h1Var != null) {
            h1Var.a();
        }
    }
}
