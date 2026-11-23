package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class bw extends FrameLayout {
    public final boolean f33931a;
    public final ty f33932b;

    public bw(ty tyVar, Context context, boolean z10) {
        super(context);
        this.f33932b = tyVar;
        this.f33931a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ty tyVar = this.f33932b;
        hw hwVar = tyVar.C0;
        dw dwVar = tyVar.E0;
        gw gwVar = tyVar.H0;
        if (!this.f33931a && (view == dwVar || view == gwVar)) {
            canvas.save();
            float y10 = hwVar.getY() + hwVar.getMeasuredHeight() + 1.0f;
            if (view == dwVar) {
                y10 = Math.max(y10, gwVar.getY() + gwVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * tyVar.f40078a.f57700e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ty tyVar = this.f33932b;
        tyVar.L0 = true;
        tyVar.Z();
        jg.d1 d1Var = tyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ty tyVar = this.f33932b;
        tyVar.L0 = false;
        tyVar.Z();
        jg.d1 d1Var = tyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }
}
