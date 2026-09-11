package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class rw extends FrameLayout {
    public final boolean f30103a;
    public final kz f30104b;

    public rw(kz kzVar, Context context, boolean z10) {
        super(context);
        this.f30104b = kzVar;
        this.f30103a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.f30104b;
        xw xwVar = kzVar.B0;
        tw twVar = kzVar.D0;
        ww wwVar = kzVar.G0;
        if (!this.f30103a && (view == twVar || view == wwVar)) {
            canvas.save();
            float y3 = xwVar.getY() + xwVar.getMeasuredHeight() + 1.0f;
            if (view == twVar) {
                y3 = Math.max(y3, wwVar.getY() + wwVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * kzVar.f27923a.f15368e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kz kzVar = this.f30104b;
        kzVar.K0 = true;
        kzVar.a0();
        hg.g1 g1Var = kzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kz kzVar = this.f30104b;
        kzVar.K0 = false;
        kzVar.a0();
        hg.g1 g1Var = kzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }
}
