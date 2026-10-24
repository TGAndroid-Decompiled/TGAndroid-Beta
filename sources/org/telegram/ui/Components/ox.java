package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ox extends FrameLayout {
    public final rz f29421a;

    public ox(rz rzVar, Context context) {
        super(context);
        this.f29421a = rzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        rz rzVar = this.f29421a;
        tx txVar = rzVar.I;
        pw pwVar = rzVar.V;
        cy cyVar = rzVar.P;
        if (view != cyVar && view != pwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = txVar.getY() + txVar.getMeasuredHeight() + 1.0f;
        if (view == cyVar && pwVar != null) {
            y3 = Math.max(y3, pwVar.getY() + pwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * rzVar.f30304b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
