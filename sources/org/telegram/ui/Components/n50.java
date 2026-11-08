package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class n50 extends z41 {
    public float f36249f;
    public float h;
    public final Paint f36250n;
    public float f36251r;
    public h6.m f36252s;
    public final x50 f36253w;

    public n50(x50 x50Var, Context context) {
        super(x50Var, context);
        this.f36253w = x50Var;
        this.f36250n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x50 x50Var = this.f36253w;
        x50Var.M1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (x50Var.f32051u1 - x50Var.f28648s0));
        float f10 = x50Var.f40216f2 + x50Var.f40222l2;
        av0 av0Var = x50Var.f32047q1;
        if (av0Var.getVisibility() != 0) {
            this.f36249f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f36251r = (f10 - this.f36249f) * 0.10666667f;
        }
        float f11 = this.f36249f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f36251r;
            float f14 = f11 + f13;
            this.f36249f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f36249f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f36249f = f12;
            } else {
                invalidate();
            }
        }
        av0Var.setTranslationY(x50Var.f32051u1 + this.f36249f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        x50 x50Var = this.f36253w;
        if (view == x50Var.M1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + x50Var.f40213b2 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false), (int) (x50Var.Y1 * 255.0f)));
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27853d7, false), (int) (x50Var.Y1 * 255.0f));
            Paint paint = this.f36250n;
            paint.setColor(o4);
            canvas.drawRect(0.0f, view.getY() + x50Var.f40213b2, getMeasuredWidth(), view.getY() + x50Var.f40213b2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.f36252s;
        if (mVar != null) {
            ((e51) mVar.f14264b).f33205b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.f36253w.f40221k2 && this.f36252s == null) {
            this.f36252s = new h6.m(view);
        }
    }
}
