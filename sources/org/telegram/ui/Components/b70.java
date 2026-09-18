package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b70 extends b71 {
    public float f22870f;
    public float h;
    public final Paint f22871n;
    public float f22872r;
    public n7.z0 f22873s;
    public final k70 v;

    public b70(k70 k70Var, Context context) {
        super(k70Var, context);
        this.v = k70Var;
        this.f22871n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        k70 k70Var = this.v;
        int i11 = k70Var.f23477y;
        i10 = ((org.telegram.ui.ActionBar.f3) k70Var).backgroundPaddingTop;
        k70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = k70Var.f25613o0 + k70Var.f25619u0;
        kx0 kx0Var = k70Var.f23474s;
        if (kx0Var.getVisibility() != 0) {
            this.f22870f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f22872r = (f7 - this.f22870f) * 0.10666667f;
        }
        float f10 = this.f22870f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f22872r;
            float f13 = f10 + f12;
            this.f22870f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f22870f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f22870f = f11;
            } else {
                invalidate();
            }
        }
        kx0Var.setTranslationY(k70Var.f23477y + this.f22870f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        k70 k70Var = this.v;
        if (view == k70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + k70Var.f25610k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false), (int) (k70Var.f25607h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19063d7, false), (int) (k70Var.f25607h0 * 255.0f));
            Paint paint = this.f22871n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + k70Var.f25610k0, getMeasuredWidth(), view.getY() + k70Var.f25610k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.f22873s;
        if (z0Var != null) {
            ((g71) z0Var.f15367b).f24327b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f25618t0 && this.f22873s == null) {
            this.f22873s = new n7.z0(view);
        }
    }
}
