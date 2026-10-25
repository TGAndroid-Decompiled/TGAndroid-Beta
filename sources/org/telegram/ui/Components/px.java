package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class px extends FrameLayout {
    public final sz f31729a;

    public px(sz szVar, Context context) {
        super(context);
        this.f31729a = szVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        sz szVar = this.f31729a;
        ux uxVar = szVar.I;
        rw rwVar = szVar.V;
        dy dyVar = szVar.P;
        if (view != dyVar && view != rwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = uxVar.getY() + uxVar.getMeasuredHeight() + 1.0f;
        if (view == dyVar && rwVar != null) {
            y3 = Math.max(y3, rwVar.getY() + rwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * szVar.f32710b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
