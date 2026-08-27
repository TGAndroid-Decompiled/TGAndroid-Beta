package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class vw extends FrameLayout {

    public final yy f34061a;

    public vw(yy yyVar, Context context) {
        super(context);
        this.f34061a = yyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        yy yyVar = this.f34061a;
        uv uvVar = yyVar.E;
        vv vvVar = yyVar.R;
        ww wwVar = yyVar.L;
        if (view != wwVar && view != vvVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = uvVar.getY() + uvVar.getMeasuredHeight() + 1.0f;
        if (view == wwVar && vvVar != null) {
            y10 = Math.max(y10, vvVar.getY() + vvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * yyVar.f34979b.f48497e), getMeasuredWidth(), getMeasuredHeight());
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }
}
