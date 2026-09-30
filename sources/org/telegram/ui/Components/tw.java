package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class tw extends FrameLayout {
    public final boolean f28668a;
    public final nz f28669b;

    public tw(nz nzVar, Context context, boolean z10) {
        super(context);
        this.f28669b = nzVar;
        this.f28668a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        nz nzVar = this.f28669b;
        ax axVar = nzVar.B0;
        vw vwVar = nzVar.D0;
        zw zwVar = nzVar.G0;
        if (!this.f28668a && (view == vwVar || view == zwVar)) {
            canvas.save();
            float y3 = axVar.getY() + axVar.getMeasuredHeight() + 1.0f;
            if (view == vwVar) {
                y3 = Math.max(y3, zwVar.getY() + zwVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * nzVar.f26809a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nz nzVar = this.f28669b;
        nzVar.K0 = true;
        nzVar.Y();
        gg.g1 g1Var = nzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nz nzVar = this.f28669b;
        nzVar.K0 = false;
        nzVar.Y();
        gg.g1 g1Var = nzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }
}
