package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ix extends FrameLayout {
    public final kz f25043a;

    public ix(kz kzVar, Context context) {
        super(context);
        this.f25043a = kzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.f25043a;
        nx nxVar = kzVar.I;
        jw jwVar = kzVar.V;
        vx vxVar = kzVar.P;
        if (view != vxVar && view != jwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = nxVar.getY() + nxVar.getMeasuredHeight() + 1.0f;
        if (view == vxVar && jwVar != null) {
            y3 = Math.max(y3, jwVar.getY() + jwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * kzVar.f25707b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
