package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b70 extends z61 {
    public float f21740f;
    public float h;
    public final Paint f21741n;
    public float f21742r;
    public og.u0 f21743s;
    public final k70 v;

    public b70(k70 k70Var, Context context) {
        super(k70Var, context);
        this.v = k70Var;
        this.f21741n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        k70 k70Var = this.v;
        int i11 = k70Var.f21752y;
        i10 = ((org.telegram.ui.ActionBar.h3) k70Var).backgroundPaddingTop;
        k70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = k70Var.f24639o0 + k70Var.f24645u0;
        jx0 jx0Var = k70Var.f21749s;
        if (jx0Var.getVisibility() != 0) {
            this.f21740f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f21742r = (f7 - this.f21740f) * 0.10666667f;
        }
        float f10 = this.f21740f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f21742r;
            float f13 = f10 + f12;
            this.f21740f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f21740f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f21740f = f11;
            } else {
                invalidate();
            }
        }
        jx0Var.setTranslationY(k70Var.f21752y + this.f21740f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        k70 k70Var = this.v;
        if (view == k70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + k70Var.f24636k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false), (int) (k70Var.f24633h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17929d7, false), (int) (k70Var.f24633h0 * 255.0f));
            Paint paint = this.f21741n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + k70Var.f24636k0, getMeasuredWidth(), view.getY() + k70Var.f24636k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        og.u0 u0Var = this.f21743s;
        if (u0Var != null) {
            ((e71) u0Var.f14497b).f22609b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f24644t0 && this.f21743s == null) {
            this.f21743s = new og.u0(view);
        }
    }
}
