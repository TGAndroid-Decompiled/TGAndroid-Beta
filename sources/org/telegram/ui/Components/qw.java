package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qw extends FrameLayout {
    public final boolean f27459a;
    public final kz f27460b;

    public qw(kz kzVar, Context context, boolean z10) {
        super(context);
        this.f27460b = kzVar;
        this.f27459a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.f27460b;
        ww wwVar = kzVar.B0;
        sw swVar = kzVar.D0;
        vw vwVar = kzVar.G0;
        if (!this.f27459a && (view == swVar || view == vwVar)) {
            canvas.save();
            float y3 = wwVar.getY() + wwVar.getMeasuredHeight() + 1.0f;
            if (view == swVar) {
                y3 = Math.max(y3, vwVar.getY() + vwVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * kzVar.f25691a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kz kzVar = this.f27460b;
        kzVar.K0 = true;
        kzVar.Y();
        gg.g1 g1Var = kzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kz kzVar = this.f27460b;
        kzVar.K0 = false;
        kzVar.Y();
        gg.g1 g1Var = kzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }
}
