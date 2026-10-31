package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class d60 extends c61 {
    public float f25345f;
    public float h;
    public final Paint f25346n;
    public float f25347r;
    public li.k f25348s;
    public final m60 f25349w;

    public d60(m60 m60Var, Context context) {
        super(m60Var, context);
        this.f25349w = m60Var;
        this.f25346n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m60 m60Var = this.f25349w;
        m60Var.M1.setTranslationY(org.telegram.messenger.i0.L(64.0f) + org.telegram.messenger.i0.L(6.0f) + (m60Var.f25728u1 - m60Var.f21614s0));
        float f7 = m60Var.f28301f2 + m60Var.f28307l2;
        dw0 dw0Var = m60Var.f25724q1;
        if (dw0Var.getVisibility() != 0) {
            this.f25345f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f25347r = (f7 - this.f25345f) * 0.10666667f;
        }
        float f10 = this.f25345f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f25347r;
            float f13 = f10 + f12;
            this.f25345f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f25345f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f25345f = f11;
            } else {
                invalidate();
            }
        }
        dw0Var.setTranslationY(m60Var.f25728u1 + this.f25345f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        m60 m60Var = this.f25349w;
        if (view == m60Var.M1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), view.getY() + m60Var.f28297b2 + 1.0f);
            canvas.drawColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false), (int) (m60Var.Y1 * 255.0f)));
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d7, false), (int) (m60Var.Y1 * 255.0f));
            Paint paint = this.f25346n;
            paint.setColor(o10);
            canvas.drawRect(0.0f, view.getY() + m60Var.f28297b2, getMeasuredWidth(), view.getY() + m60Var.f28297b2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        li.k kVar = this.f25348s;
        if (kVar != null) {
            ((h61) kVar.f12100b).f26634b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.f25349w.f28306k2 && this.f25348s == null) {
            this.f25348s = new li.k(view);
        }
    }
}
