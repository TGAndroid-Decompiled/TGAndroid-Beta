package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m70 extends h71 {
    public float f28456f;
    public float h;
    public final Paint f28457n;
    public float f28458r;
    public m.g3 f28459s;
    public final v70 v;

    public m70(v70 v70Var, Context context) {
        super(v70Var, context);
        this.v = v70Var;
        this.f28457n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        v70 v70Var = this.v;
        int i11 = v70Var.f27437y;
        i10 = ((org.telegram.ui.ActionBar.f3) v70Var).backgroundPaddingTop;
        v70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = v70Var.f31206o0 + v70Var.f31212u0;
        rx0 rx0Var = v70Var.f27434s;
        if (rx0Var.getVisibility() != 0) {
            this.f28456f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f28458r = (f7 - this.f28456f) * 0.10666667f;
        }
        float f10 = this.f28456f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f28458r;
            float f13 = f10 + f12;
            this.f28456f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f28456f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f28456f = f11;
            } else {
                invalidate();
            }
        }
        rx0Var.setTranslationY(v70Var.f27437y + this.f28456f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        v70 v70Var = this.v;
        if (view == v70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + v70Var.f31203k0 + 1.0f);
            canvas.drawColor(i0.b.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false), (int) (v70Var.f31200h0 * 255.0f)));
            int o10 = i0.b.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d7, false), (int) (v70Var.f31200h0 * 255.0f));
            Paint paint = this.f28457n;
            paint.setColor(o10);
            canvas.drawRect(0.0f, view.getY() + v70Var.f31203k0, getMeasuredWidth(), view.getY() + v70Var.f31203k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.g3 g3Var = this.f28459s;
        if (g3Var != null) {
            ((m71) g3Var.f16196b).f28461b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f31211t0 && this.f28459s == null) {
            this.f28459s = new m.g3(view);
        }
    }
}
