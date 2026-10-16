package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ux extends FrameLayout {
    public final wz f29462a;

    public ux(wz wzVar, Context context) {
        super(context);
        this.f29462a = wzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wz wzVar = this.f29462a;
        zx zxVar = wzVar.I;
        vw vwVar = wzVar.V;
        iy iyVar = wzVar.P;
        if (view != iyVar && view != vwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = zxVar.getY() + zxVar.getMeasuredHeight() + 1.0f;
        if (view == iyVar && vwVar != null) {
            y3 = Math.max(y3, vwVar.getY() + vwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * wzVar.f30701b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
