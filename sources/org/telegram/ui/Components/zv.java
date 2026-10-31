package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class zv extends FrameLayout {
    public final boolean f33248a;
    public final vy f33249b;

    public zv(vy vyVar, Context context, boolean z10) {
        super(context);
        this.f33249b = vyVar;
        this.f33248a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        vy vyVar = this.f33249b;
        gw gwVar = vyVar.B0;
        bw bwVar = vyVar.D0;
        fw fwVar = vyVar.G0;
        if (!this.f33248a && (view == bwVar || view == fwVar)) {
            canvas.save();
            float y3 = gwVar.getY() + gwVar.getMeasuredHeight() + 1.0f;
            if (view == bwVar) {
                y3 = Math.max(y3, fwVar.getY() + fwVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (org.telegram.messenger.i0.L(16.0f) * vyVar.f31856a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vy vyVar = this.f33249b;
        vyVar.K0 = true;
        vyVar.Z();
        mw mwVar = vyVar.T0;
        if (mwVar != null) {
            mwVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vy vyVar = this.f33249b;
        vyVar.K0 = false;
        vyVar.Z();
        mw mwVar = vyVar.T0;
        if (mwVar != null) {
            mwVar.a();
        }
    }
}
