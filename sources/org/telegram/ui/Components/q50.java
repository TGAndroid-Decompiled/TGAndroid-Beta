package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class q50 extends c51 {
    public float f38525f;
    public float h;
    public final Paint f38526n;
    public float f38527r;
    public h6.m f38528s;
    public final a60 f38529w;

    public q50(a60 a60Var, Context context) {
        super(a60Var, context);
        this.f38529w = a60Var;
        this.f38526n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a60 a60Var = this.f38529w;
        a60Var.Q1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (a60Var.f34214y1 - a60Var.f29716t0));
        float f10 = a60Var.f32875j2 + a60Var.f32881p2;
        cv0 cv0Var = a60Var.f34210u1;
        if (cv0Var.getVisibility() != 0) {
            this.f38525f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f38527r = (f10 - this.f38525f) * 0.10666667f;
        }
        float f11 = this.f38525f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f38527r;
            float f14 = f11 + f13;
            this.f38525f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f38525f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f38525f = f12;
            } else {
                invalidate();
            }
        }
        cv0Var.setTranslationY(a60Var.f34214y1 + this.f38525f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        a60 a60Var = this.f38529w;
        if (view == a60Var.Q1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + a60Var.f32871f2 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false), (int) (a60Var.f32869c2 * 255.0f)));
            int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28850d7, false), (int) (a60Var.f32869c2 * 255.0f));
            Paint paint = this.f38526n;
            paint.setColor(o4);
            canvas.drawRect(0.0f, view.getY() + a60Var.f32871f2, getMeasuredWidth(), view.getY() + a60Var.f32871f2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.f38528s;
        if (mVar != null) {
            ((h51) mVar.f13624b).f35171b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.f38529w.f32880o2 && this.f38528s == null) {
            this.f38528s = new h6.m(view);
        }
    }
}
