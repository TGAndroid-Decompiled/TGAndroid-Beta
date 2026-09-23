package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class rw extends FrameLayout {
    public final boolean f27735a;
    public final lz f27736b;

    public rw(lz lzVar, Context context, boolean z10) {
        super(context);
        this.f27736b = lzVar;
        this.f27735a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.f27736b;
        xw xwVar = lzVar.B0;
        tw twVar = lzVar.D0;
        ww wwVar = lzVar.G0;
        if (!this.f27735a && (view == twVar || view == wwVar)) {
            canvas.save();
            float y3 = xwVar.getY() + xwVar.getMeasuredHeight() + 1.0f;
            if (view == twVar) {
                y3 = Math.max(y3, wwVar.getY() + wwVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * lzVar.f25959a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lz lzVar = this.f27736b;
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
        lz lzVar = this.f27736b;
        lzVar.K0 = false;
        lzVar.Y();
        gg.g1 g1Var = lzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }
}
