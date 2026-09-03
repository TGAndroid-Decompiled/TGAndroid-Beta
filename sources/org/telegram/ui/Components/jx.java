package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jx extends FrameLayout {
    public final mz f28210a;

    public jx(mz mzVar, Context context) {
        super(context);
        this.f28210a = mzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mz mzVar = this.f28210a;
        hw hwVar = mzVar.F;
        iw iwVar = mzVar.S;
        kx kxVar = mzVar.M;
        if (view != kxVar && view != iwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = hwVar.getY() + hwVar.getMeasuredHeight() + 1.0f;
        if (view == kxVar && iwVar != null) {
            y10 = Math.max(y10, iwVar.getY() + iwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * mzVar.f29268b.f50541e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
