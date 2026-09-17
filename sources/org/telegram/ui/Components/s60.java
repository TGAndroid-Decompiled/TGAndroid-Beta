package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s60 extends m61 {
    public float f30229f;
    public float h;
    public final Paint f30230n;
    public float f30231r;
    public n7.z0 f30232s;
    public final b70 v;

    public s60(b70 b70Var, Context context) {
        super(b70Var, context);
        this.v = b70Var;
        this.f30230n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        b70 b70Var = this.v;
        int i11 = b70Var.f29012y;
        i10 = ((org.telegram.ui.ActionBar.f3) b70Var).backgroundPaddingTop;
        b70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = b70Var.f24608o0 + b70Var.f24614u0;
        xw0 xw0Var = b70Var.f29009s;
        if (xw0Var.getVisibility() != 0) {
            this.f30229f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f30231r = (f7 - this.f30229f) * 0.10666667f;
        }
        float f10 = this.f30229f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f30231r;
            float f13 = f10 + f12;
            this.f30229f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f30229f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f30229f = f11;
            } else {
                invalidate();
            }
        }
        xw0Var.setTranslationY(b70Var.f29012y + this.f30229f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        b70 b70Var = this.v;
        if (view == b70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + b70Var.f24605k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20691d6, false), (int) (b70Var.f24602h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20692d7, false), (int) (b70Var.f24602h0 * 255.0f));
            Paint paint = this.f30230n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + b70Var.f24605k0, getMeasuredWidth(), view.getY() + b70Var.f24605k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.f30232s;
        if (z0Var != null) {
            ((r61) z0Var.f16730b).f29991b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f24613t0 && this.f30232s == null) {
            this.f30232s = new n7.z0(view);
        }
    }
}
