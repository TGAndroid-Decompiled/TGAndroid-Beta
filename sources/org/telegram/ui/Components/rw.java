package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class rw extends FrameLayout {
    public final boolean f28052a;
    public final lz f28053b;

    public rw(lz lzVar, Context context, boolean z10) {
        super(context);
        this.f28053b = lzVar;
        this.f28052a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.f28053b;
        yw ywVar = lzVar.B0;
        tw twVar = lzVar.D0;
        xw xwVar = lzVar.G0;
        if (!this.f28052a && (view == twVar || view == xwVar)) {
            canvas.save();
            float y3 = ywVar.getY() + ywVar.getMeasuredHeight() + 1.0f;
            if (view == twVar) {
                y3 = Math.max(y3, xwVar.getY() + xwVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * lzVar.f26227a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lz lzVar = this.f28053b;
        lzVar.K0 = true;
        lzVar.Y();
        gg.g1 g1Var = lzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lz lzVar = this.f28053b;
        lzVar.K0 = false;
        lzVar.Y();
        gg.g1 g1Var = lzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }
}
