package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nw extends FrameLayout {
    public final boolean f27391a;
    public final kz f27392b;

    public nw(kz kzVar, Context context, boolean z4) {
        super(context);
        this.f27392b = kzVar;
        this.f27391a = z4;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        kz kzVar = this.f27392b;
        tw twVar = kzVar.f26500y0;
        pw pwVar = kzVar.A0;
        sw swVar = kzVar.D0;
        if (!this.f27391a && (view == pwVar || view == swVar)) {
            canvas.save();
            float y10 = twVar.getY() + twVar.getMeasuredHeight() + 1.0f;
            if (view == pwVar) {
                y10 = Math.max(y10, swVar.getY() + swVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * kzVar.f26421a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kz kzVar = this.f27392b;
        kzVar.H0 = true;
        kzVar.a0();
        zw zwVar = kzVar.Q0;
        if (zwVar != null) {
            zwVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kz kzVar = this.f27392b;
        kzVar.H0 = false;
        kzVar.a0();
        zw zwVar = kzVar.Q0;
        if (zwVar != null) {
            zwVar.a();
        }
    }
}
