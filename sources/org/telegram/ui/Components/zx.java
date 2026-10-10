package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class zx extends FrameLayout {
    public final b00 f33703a;

    public zx(b00 b00Var, Context context) {
        super(context);
        this.f33703a = b00Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        b00 b00Var = this.f33703a;
        fy fyVar = b00Var.I;
        ax axVar = b00Var.V;
        ny nyVar = b00Var.P;
        if (view != nyVar && view != axVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = fyVar.getY() + fyVar.getMeasuredHeight() + 1.0f;
        if (view == nyVar && axVar != null) {
            y3 = Math.max(y3, axVar.getY() + axVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * b00Var.f24683b.f16341e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
