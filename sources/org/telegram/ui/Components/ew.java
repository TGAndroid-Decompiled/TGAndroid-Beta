package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class ew extends FrameLayout {
    public final ey f33479a;

    public ew(ey eyVar, Context context) {
        super(context);
        this.f33479a = eyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ey eyVar = this.f33479a;
        jw jwVar = eyVar.J;
        gv gvVar = eyVar.W;
        rw rwVar = eyVar.Q;
        if (view != rwVar && view != gvVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y9 = jwVar.getY() + jwVar.getMeasuredHeight() + 1.0f;
        if (view == rwVar && gvVar != null) {
            y9 = Math.max(y9, gvVar.getY() + gvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y9 - (org.telegram.messenger.g0.L(16.0f) * eyVar.f33521b.f53840e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
