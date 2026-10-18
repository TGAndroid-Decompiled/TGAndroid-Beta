package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qx extends FrameLayout {
    public final tz f29773a;

    public qx(tz tzVar, Context context) {
        super(context);
        this.f29773a = tzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tz tzVar = this.f29773a;
        vx vxVar = tzVar.I;
        rw rwVar = tzVar.V;
        ey eyVar = tzVar.P;
        if (view != eyVar && view != rwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = vxVar.getY() + vxVar.getMeasuredHeight() + 1.0f;
        if (view == eyVar && rwVar != null) {
            y3 = Math.max(y3, rwVar.getY() + rwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * tzVar.f30741b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
