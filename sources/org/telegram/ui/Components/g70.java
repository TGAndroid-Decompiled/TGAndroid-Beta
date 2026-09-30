package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g70 extends c71 {
    public float f24438f;
    public float h;
    public final Paint f24439n;
    public float f24440r;
    public n7.z0 f24441s;
    public final p70 v;

    public g70(p70 p70Var, Context context) {
        super(p70Var, context);
        this.v = p70Var;
        this.f24439n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        p70 p70Var = this.v;
        int i11 = p70Var.f23904y;
        i10 = ((org.telegram.ui.ActionBar.e3) p70Var).backgroundPaddingTop;
        p70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = p70Var.f27276o0 + p70Var.f27282u0;
        lx0 lx0Var = p70Var.f23901s;
        if (lx0Var.getVisibility() != 0) {
            this.f24438f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f24440r = (f7 - this.f24438f) * 0.10666667f;
        }
        float f10 = this.f24438f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f24440r;
            float f13 = f10 + f12;
            this.f24438f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f24438f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f24438f = f11;
            } else {
                invalidate();
            }
        }
        lx0Var.setTranslationY(p70Var.f23904y + this.f24438f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        p70 p70Var = this.v;
        if (view == p70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + p70Var.f27273k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19076d6, false), (int) (p70Var.f27270h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19077d7, false), (int) (p70Var.f27270h0 * 255.0f));
            Paint paint = this.f24439n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + p70Var.f27273k0, getMeasuredWidth(), view.getY() + p70Var.f27273k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.f24441s;
        if (z0Var != null) {
            ((h71) z0Var.f15426b).f24764b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f27281t0 && this.f24441s == null) {
            this.f24441s = new n7.z0(view);
        }
    }
}
