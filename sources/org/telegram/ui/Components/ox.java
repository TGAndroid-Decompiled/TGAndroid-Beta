package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ox extends FrameLayout {
    public final rz f25928a;

    public ox(rz rzVar, Context context) {
        super(context);
        this.f25928a = rzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        rz rzVar = this.f25928a;
        ow owVar = rzVar.I;
        pw pwVar = rzVar.V;
        px pxVar = rzVar.P;
        if (view != pxVar && view != pwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = owVar.getY() + owVar.getMeasuredHeight() + 1.0f;
        if (view == pxVar && pwVar != null) {
            y3 = Math.max(y3, pwVar.getY() + pwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * rzVar.f26799b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
