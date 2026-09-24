package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d70 extends z61 {
    public float f23505f;
    public float h;
    public final Paint f23506n;
    public float f23507r;
    public n7.z0 f23508s;
    public final m70 v;

    public d70(m70 m70Var, Context context) {
        super(m70Var, context);
        this.v = m70Var;
        this.f23506n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        m70 m70Var = this.v;
        int i11 = m70Var.f22913y;
        i10 = ((org.telegram.ui.ActionBar.e3) m70Var).backgroundPaddingTop;
        m70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = m70Var.f26381o0 + m70Var.f26387u0;
        ix0 ix0Var = m70Var.f22910s;
        if (ix0Var.getVisibility() != 0) {
            this.f23505f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f23507r = (f7 - this.f23505f) * 0.10666667f;
        }
        float f10 = this.f23505f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f23507r;
            float f13 = f10 + f12;
            this.f23505f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f23505f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f23505f = f11;
            } else {
                invalidate();
            }
        }
        ix0Var.setTranslationY(m70Var.f22913y + this.f23505f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        m70 m70Var = this.v;
        if (view == m70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + m70Var.f26378k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false), (int) (m70Var.f26375h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19046d7, false), (int) (m70Var.f26375h0 * 255.0f));
            Paint paint = this.f23506n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + m70Var.f26378k0, getMeasuredWidth(), view.getY() + m70Var.f26378k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.f23508s;
        if (z0Var != null) {
            ((e71) z0Var.f15395b).f23827b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f26386t0 && this.f23508s == null) {
            this.f23508s = new n7.z0(view);
        }
    }
}
