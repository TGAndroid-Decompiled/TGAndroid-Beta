package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lx extends FrameLayout {
    public final mz f26173a;

    public lx(mz mzVar, Context context) {
        super(context);
        this.f26173a = mzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        mz mzVar = this.f26173a;
        qx qxVar = mzVar.I;
        mw mwVar = mzVar.V;
        yx yxVar = mzVar.P;
        if (view != yxVar && view != mwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = qxVar.getY() + qxVar.getMeasuredHeight() + 1.0f;
        if (view == yxVar && mwVar != null) {
            y3 = Math.max(y3, mwVar.getY() + mwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * mzVar.f26525b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
