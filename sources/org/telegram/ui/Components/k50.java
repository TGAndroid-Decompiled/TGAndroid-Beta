package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class k50 extends t41 {
    public float f35317f;
    public float h;
    public final Paint f35318n;
    public float f35319r;
    public k4.j f35320s;
    public final t50 f35321w;

    public k50(t50 t50Var, Context context) {
        super(t50Var, context);
        this.f35321w = t50Var;
        this.f35318n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        t50 t50Var = this.f35321w;
        t50Var.N1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (t50Var.f39003v1 - t50Var.f28617t0));
        float f10 = t50Var.f38293g2 + t50Var.f38299m2;
        zu0 zu0Var = t50Var.f38999r1;
        if (zu0Var.getVisibility() != 0) {
            this.f35317f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f35319r = (f10 - this.f35317f) * 0.10666667f;
        }
        float f11 = this.f35317f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f35319r;
            float f14 = f11 + f13;
            this.f35317f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f35317f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f35317f = f12;
            } else {
                invalidate();
            }
        }
        zu0Var.setTranslationY(t50Var.f39003v1 + this.f35317f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t50 t50Var = this.f35321w;
        if (view == t50Var.N1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + t50Var.c2 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false), (int) (t50Var.Z1 * 255.0f)));
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27879d7, false), (int) (t50Var.Z1 * 255.0f));
            Paint paint = this.f35318n;
            paint.setColor(o10);
            canvas.drawRect(0.0f, view.getY() + t50Var.c2, getMeasuredWidth(), view.getY() + t50Var.c2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k4.j jVar = this.f35320s;
        if (jVar != null) {
            ((y41) jVar.f16869a).f40615b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.f35321w.f38298l2 && this.f35320s == null) {
            this.f35320s = new k4.j(view);
        }
    }
}
