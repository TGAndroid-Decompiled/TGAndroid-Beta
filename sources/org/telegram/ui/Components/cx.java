package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cx extends FrameLayout {
    public final fz f27582a;

    public cx(fz fzVar, Context context) {
        super(context);
        this.f27582a = fzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        fz fzVar = this.f27582a;
        bw bwVar = fzVar.E;
        cw cwVar = fzVar.R;
        dx dxVar = fzVar.L;
        if (view != dxVar && view != cwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y8 = bwVar.getY() + bwVar.getMeasuredHeight() + 1.0f;
        if (view == dxVar && cwVar != null) {
            y8 = Math.max(y8, cwVar.getY() + cwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y8 - (AndroidUtilities.dp(16.0f) * fzVar.f28577b.f49505e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
