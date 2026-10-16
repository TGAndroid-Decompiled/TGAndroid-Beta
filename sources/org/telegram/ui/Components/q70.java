package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q70 extends p71 {
    public float f28217f;
    public float h;
    public final Paint f28218n;
    public float f28219r;
    public m.h3 f28220s;
    public final z70 v;

    public q70(z70 z70Var, Context context) {
        super(z70Var, context);
        this.v = z70Var;
        this.f28218n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        z70 z70Var = this.v;
        int i11 = z70Var.f28466y;
        i10 = ((org.telegram.ui.ActionBar.e3) z70Var).backgroundPaddingTop;
        z70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = z70Var.f31486o0 + z70Var.f31492u0;
        wx0 wx0Var = z70Var.f28463s;
        if (wx0Var.getVisibility() != 0) {
            this.f28217f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f28219r = (f7 - this.f28217f) * 0.10666667f;
        }
        float f10 = this.f28217f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f28219r;
            float f13 = f10 + f12;
            this.f28217f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f28217f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f28217f = f11;
            } else {
                invalidate();
            }
        }
        wx0Var.setTranslationY(z70Var.f28466y + this.f28217f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z70 z70Var = this.v;
        if (view == z70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + z70Var.f31483k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false), (int) (z70Var.f31480h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19602d7, false), (int) (z70Var.f31480h0 * 255.0f));
            Paint paint = this.f28218n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + z70Var.f31483k0, getMeasuredWidth(), view.getY() + z70Var.f31483k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.h3 h3Var = this.f28220s;
        if (h3Var != null) {
            ((u71) h3Var.f14850b).f29272b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f31491t0 && this.f28220s == null) {
            this.f28220s = new m.h3(view);
        }
    }
}
