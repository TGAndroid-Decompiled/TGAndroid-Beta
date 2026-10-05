package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mx extends FrameLayout {
    public final nz f28858a;

    public mx(nz nzVar, Context context) {
        super(context);
        this.f28858a = nzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        nz nzVar = this.f28858a;
        rx rxVar = nzVar.I;
        nw nwVar = nzVar.V;
        zx zxVar = nzVar.P;
        if (view != zxVar && view != nwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = rxVar.getY() + rxVar.getMeasuredHeight() + 1.0f;
        if (view == zxVar && nwVar != null) {
            y3 = Math.max(y3, nwVar.getY() + nwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * nzVar.f29188b.f15436e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
