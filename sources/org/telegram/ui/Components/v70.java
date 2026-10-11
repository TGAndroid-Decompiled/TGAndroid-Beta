package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v70 extends t71 {
    public float f31689f;
    public float h;
    public final Paint f31690n;
    public float f31691r;
    public la.h f31692s;
    public final e80 v;

    public v70(e80 e80Var, Context context) {
        super(e80Var, context);
        this.v = e80Var;
        this.f31690n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        e80 e80Var = this.v;
        int i11 = e80Var.f31702y;
        i10 = ((org.telegram.ui.ActionBar.e3) e80Var).backgroundPaddingTop;
        e80Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = e80Var.f25911o0 + e80Var.f25917u0;
        cy0 cy0Var = e80Var.f31699s;
        if (cy0Var.getVisibility() != 0) {
            this.f31689f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f31691r = (f7 - this.f31689f) * 0.10666667f;
        }
        float f10 = this.f31689f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f31691r;
            float f13 = f10 + f12;
            this.f31689f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f31689f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f31689f = f11;
            } else {
                invalidate();
            }
        }
        cy0Var.setTranslationY(e80Var.f31702y + this.f31689f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        e80 e80Var = this.v;
        if (view == e80Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + e80Var.f25908k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false), (int) (e80Var.f25905h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20787d7, false), (int) (e80Var.f25905h0 * 255.0f));
            Paint paint = this.f31690n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + e80Var.f25908k0, getMeasuredWidth(), view.getY() + e80Var.f25908k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        la.h hVar = this.f31692s;
        if (hVar != null) {
            ((y71) hVar.f15465b).f33106b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f25916t0 && this.f31692s == null) {
            this.f31692s = new la.h(view);
        }
    }
}
