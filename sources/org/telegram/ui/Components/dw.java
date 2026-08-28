package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dw extends FrameLayout {
    public final boolean f27826a;
    public final wy f27827b;

    public dw(wy wyVar, Context context, boolean z10) {
        super(context);
        this.f27827b = wyVar;
        this.f27826a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wy wyVar = this.f27827b;
        jw jwVar = wyVar.f34459x0;
        fw fwVar = wyVar.f34466z0;
        iw iwVar = wyVar.C0;
        if (!this.f27826a && (view == fwVar || view == iwVar)) {
            canvas.save();
            float y10 = jwVar.getY() + jwVar.getMeasuredHeight() + 1.0f;
            if (view == fwVar) {
                y10 = Math.max(y10, iwVar.getY() + iwVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * wyVar.f34383a.f47775e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wy wyVar = this.f27827b;
        wyVar.G0 = true;
        wyVar.Z();
        of.b1 b1Var = wyVar.P0;
        if (b1Var != null) {
            b1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wy wyVar = this.f27827b;
        wyVar.G0 = false;
        wyVar.Z();
        of.b1 b1Var = wyVar.P0;
        if (b1Var != null) {
            b1Var.a();
        }
    }
}
