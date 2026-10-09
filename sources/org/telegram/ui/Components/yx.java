package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yx extends FrameLayout {
    public final a00 f33380a;

    public yx(a00 a00Var, Context context) {
        super(context);
        this.f33380a = a00Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        a00 a00Var = this.f33380a;
        ey eyVar = a00Var.I;
        zw zwVar = a00Var.V;
        my myVar = a00Var.P;
        if (view != myVar && view != zwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = eyVar.getY() + eyVar.getMeasuredHeight() + 1.0f;
        if (view == myVar && zwVar != null) {
            y3 = Math.max(y3, zwVar.getY() + zwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * a00Var.f24395b.f16337e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
