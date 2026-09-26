package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lx extends FrameLayout {
    public final mz f26195a;

    public lx(mz mzVar, Context context) {
        super(context);
        this.f26195a = mzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        mz mzVar = this.f26195a;
        qx qxVar = mzVar.I;
        lw lwVar = mzVar.V;
        yx yxVar = mzVar.P;
        if (view != yxVar && view != lwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = qxVar.getY() + qxVar.getMeasuredHeight() + 1.0f;
        if (view == yxVar && lwVar != null) {
            y3 = Math.max(y3, lwVar.getY() + lwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * mzVar.f26542b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
