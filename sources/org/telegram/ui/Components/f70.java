package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f70 extends b71 {
    public float f24145f;
    public float h;
    public final Paint f24146n;
    public float f24147r;
    public n7.z0 f24148s;
    public final o70 v;

    public f70(o70 o70Var, Context context) {
        super(o70Var, context);
        this.v = o70Var;
        this.f24146n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        o70 o70Var = this.v;
        int i11 = o70Var.f23581y;
        i10 = ((org.telegram.ui.ActionBar.e3) o70Var).backgroundPaddingTop;
        o70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = o70Var.f26991o0 + o70Var.f26997u0;
        kx0 kx0Var = o70Var.f23578s;
        if (kx0Var.getVisibility() != 0) {
            this.f24145f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f24147r = (f7 - this.f24145f) * 0.10666667f;
        }
        float f10 = this.f24145f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f24147r;
            float f13 = f10 + f12;
            this.f24145f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f24145f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f24145f = f11;
            } else {
                invalidate();
            }
        }
        kx0Var.setTranslationY(o70Var.f23581y + this.f24145f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        o70 o70Var = this.v;
        if (view == o70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + o70Var.f26988k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false), (int) (o70Var.f26985h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19061d7, false), (int) (o70Var.f26985h0 * 255.0f));
            Paint paint = this.f24146n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + o70Var.f26988k0, getMeasuredWidth(), view.getY() + o70Var.f26988k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.f24148s;
        if (z0Var != null) {
            ((g71) z0Var.f15411b).f24444b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f26996t0 && this.f24148s == null) {
            this.f24148s = new n7.z0(view);
        }
    }
}
