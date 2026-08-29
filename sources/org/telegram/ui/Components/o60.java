package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o60 extends d61 {
    public float f31270f;
    public float h;
    public final Paint f31271n;
    public float f31272r;
    public oc.i f31273s;
    public final x60 v;

    public o60(x60 x60Var, Context context) {
        super(x60Var, context);
        this.v = x60Var;
        this.f31271n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        x60 x60Var = this.v;
        int i11 = x60Var.f28337y;
        i10 = ((org.telegram.ui.ActionBar.f3) x60Var).backgroundPaddingTop;
        x60Var.R.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f9 = x60Var.f34614k0 + x60Var.f34619q0;
        qw0 qw0Var = x60Var.f28334s;
        if (qw0Var.getVisibility() != 0) {
            this.f31270f = f9;
            this.h = f9;
        } else if (this.h != f9) {
            this.h = f9;
            this.f31272r = (f9 - this.f31270f) * 0.10666667f;
        }
        float f10 = this.f31270f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f31272r;
            float f13 = f10 + f12;
            this.f31270f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f31270f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f31270f = f11;
            } else {
                invalidate();
            }
        }
        qw0Var.setTranslationY(x60Var.f28337y + this.f31270f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x60 x60Var = this.v;
        if (view == x60Var.R) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + x60Var.f34610g0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false), (int) (x60Var.f34607d0 * 255.0f)));
            int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23063d7, false), (int) (x60Var.f34607d0 * 255.0f));
            Paint paint = this.f31271n;
            paint.setColor(k9);
            canvas.drawRect(0.0f, view.getY() + x60Var.f34610g0, getMeasuredWidth(), view.getY() + x60Var.f34610g0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oc.i iVar = this.f31273s;
        if (iVar != null) {
            ((i61) iVar.f19483b).f29329b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f34618p0 && this.f31273s == null) {
            this.f31273s = new oc.i(view);
        }
    }
}
