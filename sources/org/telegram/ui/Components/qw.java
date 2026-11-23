package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class qw extends FrameLayout {
    public final qy f39005a;

    public qw(qy qyVar, Context context) {
        super(context);
        this.f39005a = qyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        qy qyVar = this.f39005a;
        vw vwVar = qyVar.J;
        sv svVar = qyVar.W;
        dx dxVar = qyVar.Q;
        if (view != dxVar && view != svVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = vwVar.getY() + vwVar.getMeasuredHeight() + 1.0f;
        if (view == dxVar && svVar != null) {
            y10 = Math.max(y10, svVar.getY() + svVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * qyVar.f39038b.f57779e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
