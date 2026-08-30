package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t60 extends o61 {
    public float f28908f;
    public float h;
    public final Paint f28909n;
    public float f28910r;
    public n7.qa f28911s;
    public final c70 v;

    public t60(c70 c70Var, Context context) {
        super(c70Var, context);
        this.v = c70Var;
        this.f28909n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        c70 c70Var = this.v;
        int i11 = c70Var.f28074y;
        i10 = ((org.telegram.ui.ActionBar.g3) c70Var).backgroundPaddingTop;
        c70Var.S.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f10 = c70Var.f23874l0 + c70Var.f23879r0;
        zw0 zw0Var = c70Var.f28071s;
        if (zw0Var.getVisibility() != 0) {
            this.f28908f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f28910r = (f10 - this.f28908f) * 0.10666667f;
        }
        float f11 = this.f28908f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f28910r;
            float f14 = f11 + f13;
            this.f28908f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f28908f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f28908f = f12;
            } else {
                invalidate();
            }
        }
        zw0Var.setTranslationY(c70Var.f28074y + this.f28908f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        c70 c70Var = this.v;
        if (view == c70Var.S) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + c70Var.f23870h0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false), (int) (c70Var.f23867e0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19907d7, false), (int) (c70Var.f23867e0 * 255.0f));
            Paint paint = this.f28909n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + c70Var.f23870h0, getMeasuredWidth(), view.getY() + c70Var.f23870h0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.qa qaVar = this.f28911s;
        if (qaVar != null) {
            ((t61) qaVar.f14702b).f28913b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f23878q0 && this.f28911s == null) {
            this.f28911s = new n7.qa(view);
        }
    }
}
