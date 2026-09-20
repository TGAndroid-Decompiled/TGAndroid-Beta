package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jx extends FrameLayout {
    public final kz f25547a;

    public jx(kz kzVar, Context context) {
        super(context);
        this.f25547a = kzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.f25547a;
        ox oxVar = kzVar.I;
        kw kwVar = kzVar.V;
        wx wxVar = kzVar.P;
        if (view != wxVar && view != kwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = oxVar.getY() + oxVar.getMeasuredHeight() + 1.0f;
        if (view == wxVar && kwVar != null) {
            y3 = Math.max(y3, kwVar.getY() + kwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * kzVar.f25892b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
