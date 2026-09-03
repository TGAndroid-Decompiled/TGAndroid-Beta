package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v60 extends p61 {
    public float f31802f;
    public float h;
    public final Paint f31803n;
    public float f31804r;
    public n7.qa f31805s;
    public final e70 v;

    public v60(e70 e70Var, Context context) {
        super(e70Var, context);
        this.v = e70Var;
        this.f31803n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        e70 e70Var = this.v;
        int i11 = e70Var.f30673y;
        i10 = ((org.telegram.ui.ActionBar.h3) e70Var).backgroundPaddingTop;
        e70Var.S.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f10 = e70Var.f26478l0 + e70Var.f26483r0;
        zw0 zw0Var = e70Var.f30670s;
        if (zw0Var.getVisibility() != 0) {
            this.f31802f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f31804r = (f10 - this.f31802f) * 0.10666667f;
        }
        float f11 = this.f31802f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f31804r;
            float f14 = f11 + f13;
            this.f31802f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f31802f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f31802f = f12;
            } else {
                invalidate();
            }
        }
        zw0Var.setTranslationY(e70Var.f30673y + this.f31802f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        e70 e70Var = this.v;
        if (view == e70Var.S) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + e70Var.f26474h0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false), (int) (e70Var.f26471e0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21662d7, false), (int) (e70Var.f26471e0 * 255.0f));
            Paint paint = this.f31803n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + e70Var.f26474h0, getMeasuredWidth(), view.getY() + e70Var.f26474h0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.qa qaVar = this.f31805s;
        if (qaVar != null) {
            ((u61) qaVar.f15701b).f31527b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f26482q0 && this.f31805s == null) {
            this.f31805s = new n7.qa(view);
        }
    }
}
