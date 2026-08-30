package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hx extends FrameLayout {
    public final kz f25511a;

    public hx(kz kzVar, Context context) {
        super(context);
        this.f25511a = kzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        kz kzVar = this.f25511a;
        fw fwVar = kzVar.F;
        gw gwVar = kzVar.S;
        ix ixVar = kzVar.M;
        if (view != ixVar && view != gwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = fwVar.getY() + fwVar.getMeasuredHeight() + 1.0f;
        if (view == ixVar && gwVar != null) {
            y10 = Math.max(y10, gwVar.getY() + gwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * kzVar.f26412b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
