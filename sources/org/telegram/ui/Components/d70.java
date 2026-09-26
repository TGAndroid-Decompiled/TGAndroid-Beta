package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d70 extends z61 {
    public float f23513f;
    public float h;
    public final Paint f23514n;
    public float f23515r;
    public n7.z0 f23516s;
    public final m70 v;

    public d70(m70 m70Var, Context context) {
        super(m70Var, context);
        this.v = m70Var;
        this.f23514n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        m70 m70Var = this.v;
        int i11 = m70Var.f22921y;
        i10 = ((org.telegram.ui.ActionBar.e3) m70Var).backgroundPaddingTop;
        m70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = m70Var.f26388o0 + m70Var.f26394u0;
        ix0 ix0Var = m70Var.f22918s;
        if (ix0Var.getVisibility() != 0) {
            this.f23513f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f23515r = (f7 - this.f23513f) * 0.10666667f;
        }
        float f10 = this.f23513f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f23515r;
            float f13 = f10 + f12;
            this.f23513f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f23513f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f23513f = f11;
            } else {
                invalidate();
            }
        }
        ix0Var.setTranslationY(m70Var.f22921y + this.f23513f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        m70 m70Var = this.v;
        if (view == m70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + m70Var.f26385k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false), (int) (m70Var.f26382h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d7, false), (int) (m70Var.f26382h0 * 255.0f));
            Paint paint = this.f23514n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + m70Var.f26385k0, getMeasuredWidth(), view.getY() + m70Var.f26385k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.f23516s;
        if (z0Var != null) {
            ((e71) z0Var.f15410b).f23854b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f26393t0 && this.f23516s == null) {
            this.f23516s = new n7.z0(view);
        }
    }
}
