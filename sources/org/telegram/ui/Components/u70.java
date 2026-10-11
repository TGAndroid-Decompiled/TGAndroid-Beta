package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u70 extends s71 {
    public float f31462f;
    public float h;
    public final Paint f31463n;
    public float f31464r;
    public la.h f31465s;
    public final d80 v;

    public u70(d80 d80Var, Context context) {
        super(d80Var, context);
        this.v = d80Var;
        this.f31463n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        d80 d80Var = this.v;
        int i11 = d80Var.f31475y;
        i10 = ((org.telegram.ui.ActionBar.e3) d80Var).backgroundPaddingTop;
        d80Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = d80Var.f25668o0 + d80Var.f25674u0;
        by0 by0Var = d80Var.f31472s;
        if (by0Var.getVisibility() != 0) {
            this.f31462f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f31464r = (f7 - this.f31462f) * 0.10666667f;
        }
        float f10 = this.f31462f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f31464r;
            float f13 = f10 + f12;
            this.f31462f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f31462f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f31462f = f11;
            } else {
                invalidate();
            }
        }
        by0Var.setTranslationY(d80Var.f31475y + this.f31462f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        d80 d80Var = this.v;
        if (view == d80Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + d80Var.f25665k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false), (int) (d80Var.f25662h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20823d7, false), (int) (d80Var.f25662h0 * 255.0f));
            Paint paint = this.f31463n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + d80Var.f25665k0, getMeasuredWidth(), view.getY() + d80Var.f25665k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        la.h hVar = this.f31465s;
        if (hVar != null) {
            ((x71) hVar.f15501b).f32884b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f25673t0 && this.f31465s == null) {
            this.f31465s = new la.h(view);
        }
    }
}
