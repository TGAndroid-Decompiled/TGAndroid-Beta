package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t60 extends l61 {
    public float f28097f;
    public float h;
    public final Paint f28098n;
    public float f28099r;
    public n7.a1 f28100s;
    public final c70 v;

    public t60(c70 c70Var, Context context) {
        super(c70Var, context);
        this.v = c70Var;
        this.f28098n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        c70 c70Var = this.v;
        int i11 = c70Var.f26362y;
        i10 = ((org.telegram.ui.ActionBar.f3) c70Var).backgroundPaddingTop;
        c70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = c70Var.f22964o0 + c70Var.f22970u0;
        xw0 xw0Var = c70Var.f26359s;
        if (xw0Var.getVisibility() != 0) {
            this.f28097f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f28099r = (f7 - this.f28097f) * 0.10666667f;
        }
        float f10 = this.f28097f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f28099r;
            float f13 = f10 + f12;
            this.f28097f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f28097f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f28097f = f11;
            } else {
                invalidate();
            }
        }
        xw0Var.setTranslationY(c70Var.f26362y + this.f28097f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        c70 c70Var = this.v;
        if (view == c70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + c70Var.f22961k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false), (int) (c70Var.f22958h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18790d7, false), (int) (c70Var.f22958h0 * 255.0f));
            Paint paint = this.f28098n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + c70Var.f22961k0, getMeasuredWidth(), view.getY() + c70Var.f22961k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.a1 a1Var = this.f28100s;
        if (a1Var != null) {
            ((q61) a1Var.f15083b).f27244b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f22969t0 && this.f28100s == null) {
            this.f28100s = new n7.a1(view);
        }
    }
}
