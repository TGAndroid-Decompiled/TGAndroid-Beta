package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xw extends FrameLayout {
    public final boolean f34837a;
    public final sz f34838b;

    public xw(sz szVar, Context context, boolean z10) {
        super(context);
        this.f34838b = szVar;
        this.f34837a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        sz szVar = this.f34838b;
        dx dxVar = szVar.B0;
        zw zwVar = szVar.D0;
        cx cxVar = szVar.G0;
        if (!this.f34837a && (view == zwVar || view == cxVar)) {
            canvas.save();
            float y3 = dxVar.getY() + dxVar.getMeasuredHeight() + 1.0f;
            if (view == zwVar) {
                y3 = Math.max(y3, cxVar.getY() + cxVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * szVar.f32710a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sz szVar = this.f34838b;
        szVar.K0 = true;
        szVar.Y();
        ig.f1 f1Var = szVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sz szVar = this.f34838b;
        szVar.K0 = false;
        szVar.Y();
        ig.f1 f1Var = szVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
