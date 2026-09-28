package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f70 extends b71 {
    public float f24144f;
    public float h;
    public final Paint f24145n;
    public float f24146r;
    public n7.z0 f24147s;
    public final o70 v;

    public f70(o70 o70Var, Context context) {
        super(o70Var, context);
        this.v = o70Var;
        this.f24145n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        o70 o70Var = this.v;
        int i11 = o70Var.f23580y;
        i10 = ((org.telegram.ui.ActionBar.e3) o70Var).backgroundPaddingTop;
        o70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = o70Var.f26990o0 + o70Var.f26996u0;
        kx0 kx0Var = o70Var.f23577s;
        if (kx0Var.getVisibility() != 0) {
            this.f24144f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f24146r = (f7 - this.f24144f) * 0.10666667f;
        }
        float f10 = this.f24144f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f24146r;
            float f13 = f10 + f12;
            this.f24144f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f24144f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f24144f = f11;
            } else {
                invalidate();
            }
        }
        kx0Var.setTranslationY(o70Var.f23580y + this.f24144f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        o70 o70Var = this.v;
        if (view == o70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + o70Var.f26987k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false), (int) (o70Var.f26984h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d7, false), (int) (o70Var.f26984h0 * 255.0f));
            Paint paint = this.f24145n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + o70Var.f26987k0, getMeasuredWidth(), view.getY() + o70Var.f26987k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.f24147s;
        if (z0Var != null) {
            ((g71) z0Var.f15410b).f24443b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f26995t0 && this.f24147s == null) {
            this.f24147s = new n7.z0(view);
        }
    }
}
