package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ww extends FrameLayout {
    public final boolean f32422a;
    public final rz f32423b;

    public ww(rz rzVar, Context context, boolean z10) {
        super(context);
        this.f32423b = rzVar;
        this.f32422a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        rz rzVar = this.f32423b;
        cx cxVar = rzVar.B0;
        yw ywVar = rzVar.D0;
        bx bxVar = rzVar.G0;
        if (!this.f32422a && (view == ywVar || view == bxVar)) {
            canvas.save();
            float y3 = cxVar.getY() + cxVar.getMeasuredHeight() + 1.0f;
            if (view == ywVar) {
                y3 = Math.max(y3, bxVar.getY() + bxVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * rzVar.f30301a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rz rzVar = this.f32423b;
        rzVar.K0 = true;
        rzVar.Y();
        hg.f1 f1Var = rzVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rz rzVar = this.f32423b;
        rzVar.K0 = false;
        rzVar.Y();
        hg.f1 f1Var = rzVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
