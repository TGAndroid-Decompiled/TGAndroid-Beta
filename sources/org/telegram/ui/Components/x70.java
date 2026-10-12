package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x70 extends w71 {
    public float f32671f;
    public float h;
    public final Paint f32672n;
    public float f32673r;
    public m.f3 f32674s;
    public final g80 v;

    public x70(g80 g80Var, Context context) {
        super(g80Var, context);
        this.v = g80Var;
        this.f32672n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        g80 g80Var = this.v;
        int i11 = g80Var.f32978y;
        i10 = ((org.telegram.ui.ActionBar.e3) g80Var).backgroundPaddingTop;
        g80Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = g80Var.f26336o0 + g80Var.f26342u0;
        gy0 gy0Var = g80Var.f32975s;
        if (gy0Var.getVisibility() != 0) {
            this.f32671f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f32673r = (f7 - this.f32671f) * 0.10666667f;
        }
        float f10 = this.f32671f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f32673r;
            float f13 = f10 + f12;
            this.f32671f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f32671f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f32671f = f11;
            } else {
                invalidate();
            }
        }
        gy0Var.setTranslationY(g80Var.f32978y + this.f32671f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        g80 g80Var = this.v;
        if (view == g80Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + g80Var.f26333k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false), (int) (g80Var.f26330h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d7, false), (int) (g80Var.f26330h0 * 255.0f));
            Paint paint = this.f32672n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + g80Var.f26333k0, getMeasuredWidth(), view.getY() + g80Var.f26333k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.f3 f3Var = this.f32674s;
        if (f3Var != null) {
            ((b81) f3Var.f15423b).f24586b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f26341t0 && this.f32674s == null) {
            this.f32674s = new m.f3(view);
        }
    }
}
