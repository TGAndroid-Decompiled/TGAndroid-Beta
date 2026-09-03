package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u60 extends o61 {
    public float f29116f;
    public float h;
    public final Paint f29117n;
    public float f29118r;
    public n7.qa f29119s;
    public final d70 v;

    public u60(d70 d70Var, Context context) {
        super(d70Var, context);
        this.v = d70Var;
        this.f29117n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        d70 d70Var = this.v;
        int i11 = d70Var.f28098y;
        i10 = ((org.telegram.ui.ActionBar.g3) d70Var).backgroundPaddingTop;
        d70Var.S.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f10 = d70Var.f24199l0 + d70Var.f24204r0;
        zw0 zw0Var = d70Var.f28095s;
        if (zw0Var.getVisibility() != 0) {
            this.f29116f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f29118r = (f10 - this.f29116f) * 0.10666667f;
        }
        float f11 = this.f29116f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f29118r;
            float f14 = f11 + f13;
            this.f29116f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f29116f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f29116f = f12;
            } else {
                invalidate();
            }
        }
        zw0Var.setTranslationY(d70Var.f28098y + this.f29116f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        d70 d70Var = this.v;
        if (view == d70Var.S) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + d70Var.f24195h0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false), (int) (d70Var.f24192e0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19882d7, false), (int) (d70Var.f24192e0 * 255.0f));
            Paint paint = this.f29117n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + d70Var.f24195h0, getMeasuredWidth(), view.getY() + d70Var.f24195h0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.qa qaVar = this.f29119s;
        if (qaVar != null) {
            ((t61) qaVar.f14687b).f28925b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f24203q0 && this.f29119s == null) {
            this.f29119s = new n7.qa(view);
        }
    }
}
