package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d70 extends c71 {
    public float f23578f;
    public float h;
    public final Paint f23579n;
    public float f23580r;
    public org.telegram.ui.Cells.f3 f23581s;
    public final m70 v;

    public d70(m70 m70Var, Context context) {
        super(m70Var, context);
        this.v = m70Var;
        this.f23579n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        m70 m70Var = this.v;
        int i11 = m70Var.f23882y;
        i10 = ((org.telegram.ui.ActionBar.f3) m70Var).backgroundPaddingTop;
        m70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = m70Var.f26363o0 + m70Var.f26369u0;
        lx0 lx0Var = m70Var.f23879s;
        if (lx0Var.getVisibility() != 0) {
            this.f23578f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f23580r = (f7 - this.f23578f) * 0.10666667f;
        }
        float f10 = this.f23578f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f23580r;
            float f13 = f10 + f12;
            this.f23578f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f23578f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f23578f = f11;
            } else {
                invalidate();
            }
        }
        lx0Var.setTranslationY(m70Var.f23882y + this.f23578f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        m70 m70Var = this.v;
        if (view == m70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + m70Var.f26360k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false), (int) (m70Var.f26357h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19110d7, false), (int) (m70Var.f26357h0 * 255.0f));
            Paint paint = this.f23579n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + m70Var.f26360k0, getMeasuredWidth(), view.getY() + m70Var.f26360k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.f3 f3Var = this.f23581s;
        if (f3Var != null) {
            ((h71) f3Var.f20284b).f24706b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f26368t0 && this.f23581s == null) {
            this.f23581s = new org.telegram.ui.Cells.f3(view);
        }
    }
}
