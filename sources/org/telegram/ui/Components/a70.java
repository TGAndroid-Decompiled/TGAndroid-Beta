package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a70 extends a71 {
    public float f22575f;
    public float h;
    public final Paint f22576n;
    public float f22577r;
    public org.telegram.ui.Cells.f3 f22578s;
    public final j70 v;

    public a70(j70 j70Var, Context context) {
        super(j70Var, context);
        this.v = j70Var;
        this.f22576n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        j70 j70Var = this.v;
        int i11 = j70Var.f23192y;
        i10 = ((org.telegram.ui.ActionBar.f3) j70Var).backgroundPaddingTop;
        j70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = j70Var.f25262o0 + j70Var.f25268u0;
        jx0 jx0Var = j70Var.f23189s;
        if (jx0Var.getVisibility() != 0) {
            this.f22575f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f22577r = (f7 - this.f22575f) * 0.10666667f;
        }
        float f10 = this.f22575f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f22577r;
            float f13 = f10 + f12;
            this.f22575f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f22575f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f22575f = f11;
            } else {
                invalidate();
            }
        }
        jx0Var.setTranslationY(j70Var.f23192y + this.f22575f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        j70 j70Var = this.v;
        if (view == j70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + j70Var.f25259k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false), (int) (j70Var.f25256h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19095d7, false), (int) (j70Var.f25256h0 * 255.0f));
            Paint paint = this.f22576n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + j70Var.f25259k0, getMeasuredWidth(), view.getY() + j70Var.f25259k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.f3 f3Var = this.f22578s;
        if (f3Var != null) {
            ((f71) f3Var.f20269b).f24022b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f25267t0 && this.f22578s == null) {
            this.f22578s = new org.telegram.ui.Cells.f3(view);
        }
    }
}
