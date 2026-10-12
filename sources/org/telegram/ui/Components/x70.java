package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x70 extends w71 {
    public float f32670f;
    public float h;
    public final Paint f32671n;
    public float f32672r;
    public m.f3 f32673s;
    public final g80 v;

    public x70(g80 g80Var, Context context) {
        super(g80Var, context);
        this.v = g80Var;
        this.f32671n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        g80 g80Var = this.v;
        int i11 = g80Var.f32971y;
        i10 = ((org.telegram.ui.ActionBar.e3) g80Var).backgroundPaddingTop;
        g80Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = g80Var.f26334o0 + g80Var.f26340u0;
        gy0 gy0Var = g80Var.f32968s;
        if (gy0Var.getVisibility() != 0) {
            this.f32670f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f32672r = (f7 - this.f32670f) * 0.10666667f;
        }
        float f10 = this.f32670f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f32672r;
            float f13 = f10 + f12;
            this.f32670f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f32670f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f32670f = f11;
            } else {
                invalidate();
            }
        }
        gy0Var.setTranslationY(g80Var.f32971y + this.f32670f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        g80 g80Var = this.v;
        if (view == g80Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + g80Var.f26331k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false), (int) (g80Var.f26328h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20561d7, false), (int) (g80Var.f26328h0 * 255.0f));
            Paint paint = this.f32671n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + g80Var.f26331k0, getMeasuredWidth(), view.getY() + g80Var.f26331k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.f3 f3Var = this.f32673s;
        if (f3Var != null) {
            ((b81) f3Var.f15424b).f24574b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f26339t0 && this.f32673s == null) {
            this.f32673s = new m.f3(view);
        }
    }
}
