package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p70 extends z71 {
    public float f31460f;
    public float h;
    public final Paint f31461n;
    public float f31462r;
    public k6.c f31463s;
    public final y70 v;

    public p70(y70 y70Var, Context context) {
        super(y70Var, context);
        this.v = y70Var;
        this.f31461n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        y70 y70Var = this.v;
        int i11 = y70Var.f26784y;
        i10 = ((org.telegram.ui.ActionBar.k3) y70Var).backgroundPaddingTop;
        y70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = y70Var.f34954o0 + y70Var.f34960u0;
        ey0 ey0Var = y70Var.f26781s;
        if (ey0Var.getVisibility() != 0) {
            this.f31460f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f31462r = (f7 - this.f31460f) * 0.10666667f;
        }
        float f10 = this.f31460f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f31462r;
            float f13 = f10 + f12;
            this.f31460f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f31460f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f31460f = f11;
            } else {
                invalidate();
            }
        }
        ey0Var.setTranslationY(y70Var.f26784y + this.f31460f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        y70 y70Var = this.v;
        if (view == y70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + y70Var.f34951k0 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false), (int) (y70Var.f34948h0 * 255.0f)));
            int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23355d7, false), (int) (y70Var.f34948h0 * 255.0f));
            Paint paint = this.f31461n;
            paint.setColor(o10);
            canvas.drawRect(0.0f, view.getY() + y70Var.f34951k0, getMeasuredWidth(), view.getY() + y70Var.f34951k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k6.c cVar = this.f31463s;
        if (cVar != null) {
            ((e81) cVar.f16406b).f27757b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f34959t0 && this.f31463s == null) {
            this.f31463s = new k6.c(view);
        }
    }
}
