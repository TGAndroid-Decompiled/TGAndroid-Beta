package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class n50 extends a51 {
    public float f36242f;
    public float h;
    public final Paint f36243n;
    public float f36244r;
    public h6.m f36245s;
    public final x50 f36246w;

    public n50(x50 x50Var, Context context) {
        super(x50Var, context);
        this.f36246w = x50Var;
        this.f36243n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x50 x50Var = this.f36246w;
        x50Var.P1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (x50Var.f32473x1 - x50Var.f28704s0));
        float f10 = x50Var.f40191i2 + x50Var.f40197o2;
        bv0 bv0Var = x50Var.f32469t1;
        if (bv0Var.getVisibility() != 0) {
            this.f36242f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f36244r = (f10 - this.f36242f) * 0.10666667f;
        }
        float f11 = this.f36242f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f36244r;
            float f14 = f11 + f13;
            this.f36242f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f36242f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f36242f = f12;
            } else {
                invalidate();
            }
        }
        bv0Var.setTranslationY(x50Var.f32473x1 + this.f36242f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        x50 x50Var = this.f36246w;
        if (view == x50Var.P1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + x50Var.f40187e2 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false), (int) (x50Var.f40185b2 * 255.0f)));
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27891d7, false), (int) (x50Var.f40185b2 * 255.0f));
            Paint paint = this.f36243n;
            paint.setColor(o4);
            canvas.drawRect(0.0f, view.getY() + x50Var.f40187e2, getMeasuredWidth(), view.getY() + x50Var.f40187e2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.f36245s;
        if (mVar != null) {
            ((f51) mVar.f14266b).f33473b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.f36246w.f40196n2 && this.f36245s == null) {
            this.f36245s = new h6.m(view);
        }
    }
}
