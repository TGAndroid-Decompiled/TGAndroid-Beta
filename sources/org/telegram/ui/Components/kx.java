package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kx extends FrameLayout {
    public final mz f25877a;

    public kx(mz mzVar, Context context) {
        super(context);
        this.f25877a = mzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        mz mzVar = this.f25877a;
        px pxVar = mzVar.I;
        mw mwVar = mzVar.V;
        xx xxVar = mzVar.P;
        if (view != xxVar && view != mwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = pxVar.getY() + pxVar.getMeasuredHeight() + 1.0f;
        if (view == xxVar && mwVar != null) {
            y3 = Math.max(y3, mwVar.getY() + mwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * mzVar.f26568b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
