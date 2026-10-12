package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cy extends FrameLayout {
    public final d00 f25050a;

    public cy(d00 d00Var, Context context) {
        super(context);
        this.f25050a = d00Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        d00 d00Var = this.f25050a;
        hy hyVar = d00Var.I;
        cx cxVar = d00Var.V;
        py pyVar = d00Var.P;
        if (view != pyVar && view != cxVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = hyVar.getY() + hyVar.getMeasuredHeight() + 1.0f;
        if (view == pyVar && cxVar != null) {
            y3 = Math.max(y3, cxVar.getY() + cxVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * d00Var.f25074b.f16087e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
