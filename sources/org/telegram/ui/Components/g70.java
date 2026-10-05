package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g70 extends m71 {
    public float f26712f;
    public float h;
    public final Paint f26713n;
    public float f26714r;
    public n7.z0 f26715s;
    public final p70 v;

    public g70(p70 p70Var, Context context) {
        super(p70Var, context);
        this.v = p70Var;
        this.f26713n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        p70 p70Var = this.v;
        int i11 = p70Var.f29397y;
        i10 = ((org.telegram.ui.ActionBar.f3) p70Var).backgroundPaddingTop;
        p70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = p70Var.f29630o0 + p70Var.f29636u0;
        ux0 ux0Var = p70Var.f29394s;
        if (ux0Var.getVisibility() != 0) {
            this.f26712f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f26714r = (f7 - this.f26712f) * 0.10666667f;
        }
        float f10 = this.f26712f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f26714r;
            float f13 = f10 + f12;
            this.f26712f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f26712f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f26712f = f11;
            } else {
                invalidate();
            }
        }
        ux0Var.setTranslationY(p70Var.f29397y + this.f26712f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        p70 p70Var = this.v;
        if (view == p70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + p70Var.f29627k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false), (int) (p70Var.f29624h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20828d7, false), (int) (p70Var.f29624h0 * 255.0f));
            Paint paint = this.f26713n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + p70Var.f29627k0, getMeasuredWidth(), view.getY() + p70Var.f29627k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.f26715s;
        if (z0Var != null) {
            ((r71) z0Var.f16856b).f30371b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f29635t0 && this.f26715s == null) {
            this.f26715s = new n7.z0(view);
        }
    }
}
