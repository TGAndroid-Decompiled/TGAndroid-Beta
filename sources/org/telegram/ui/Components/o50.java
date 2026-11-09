package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class o50 extends a51 {
    public float f36652f;
    public float h;
    public final Paint f36653n;
    public float f36654r;
    public h6.m f36655s;
    public final y50 f36656w;

    public o50(y50 y50Var, Context context) {
        super(y50Var, context);
        this.f36656w = y50Var;
        this.f36653n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y50 y50Var = this.f36656w;
        y50Var.M1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (y50Var.f32538u1 - y50Var.f28653s0));
        float f10 = y50Var.f40604f2 + y50Var.f40610l2;
        cv0 cv0Var = y50Var.f32534q1;
        if (cv0Var.getVisibility() != 0) {
            this.f36652f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f36654r = (f10 - this.f36652f) * 0.10666667f;
        }
        float f11 = this.f36652f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f36654r;
            float f14 = f11 + f13;
            this.f36652f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f36652f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f36652f = f12;
            } else {
                invalidate();
            }
        }
        cv0Var.setTranslationY(y50Var.f32538u1 + this.f36652f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        y50 y50Var = this.f36656w;
        if (view == y50Var.M1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + y50Var.f40601b2 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false), (int) (y50Var.Y1 * 255.0f)));
            int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27866d7, false), (int) (y50Var.Y1 * 255.0f));
            Paint paint = this.f36653n;
            paint.setColor(o4);
            canvas.drawRect(0.0f, view.getY() + y50Var.f40601b2, getMeasuredWidth(), view.getY() + y50Var.f40601b2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.f36655s;
        if (mVar != null) {
            ((f51) mVar.f14264b).f33585b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.f36656w.f40609k2 && this.f36655s == null) {
            this.f36655s = new h6.m(view);
        }
    }
}
