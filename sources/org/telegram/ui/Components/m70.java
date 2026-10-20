package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m70 extends j71 {
    public float f28442f;
    public float h;
    public final Paint f28443n;
    public float f28444r;
    public m.g3 f28445s;
    public final v70 v;

    public m70(v70 v70Var, Context context) {
        super(v70Var, context);
        this.v = v70Var;
        this.f28443n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        v70 v70Var = this.v;
        int i11 = v70Var.f28096y;
        i10 = ((org.telegram.ui.ActionBar.f3) v70Var).backgroundPaddingTop;
        v70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = v70Var.f31180o0 + v70Var.f31186u0;
        tx0 tx0Var = v70Var.f28093s;
        if (tx0Var.getVisibility() != 0) {
            this.f28442f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f28444r = (f7 - this.f28442f) * 0.10666667f;
        }
        float f10 = this.f28442f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f28444r;
            float f13 = f10 + f12;
            this.f28442f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f28442f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f28442f = f11;
            } else {
                invalidate();
            }
        }
        tx0Var.setTranslationY(v70Var.f28096y + this.f28442f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        v70 v70Var = this.v;
        if (view == v70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + v70Var.f31177k0 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false), (int) (v70Var.f31174h0 * 255.0f)));
            int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20991d7, false), (int) (v70Var.f31174h0 * 255.0f));
            Paint paint = this.f28443n;
            paint.setColor(o10);
            canvas.drawRect(0.0f, view.getY() + v70Var.f31177k0, getMeasuredWidth(), view.getY() + v70Var.f31177k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.g3 g3Var = this.f28445s;
        if (g3Var != null) {
            ((o71) g3Var.f16202b).f28959b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f31185t0 && this.f28445s == null) {
            this.f28445s = new m.g3(view);
        }
    }
}
