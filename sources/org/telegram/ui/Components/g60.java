package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class g60 extends s51 {

    public float f28537f;
    public float h;

    public final Paint f28538n;

    public float f28539r;

    public org.telegram.ui.i6 f28540s;
    public final p60 v;

    public g60(p60 p60Var, Context context) {
        super(p60Var, context);
        this.v = p60Var;
        this.f28538n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        p60 p60Var = this.v;
        p60Var.R.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (p60Var.f32986y - ((org.telegram.ui.ActionBar.e3) p60Var).backgroundPaddingTop));
        float f10 = p60Var.f31524k0 + p60Var.f31529q0;
        iw0 iw0Var = p60Var.f32983s;
        if (iw0Var.getVisibility() != 0) {
            this.f28537f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f28539r = (f10 - this.f28537f) * 0.10666667f;
        }
        float f11 = this.f28537f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f28539r;
            float f14 = f11 + f13;
            this.f28537f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f28537f = f12;
            } else if (f13 >= 0.0f || f14 >= f12) {
                invalidate();
            } else {
                this.f28537f = f12;
            }
        }
        iw0Var.setTranslationY(p60Var.f32986y + this.f28537f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        p60 p60Var = this.v;
        if (view != p60Var.R) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + p60Var.f31520g0 + 1.0f);
        canvas.drawColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false), (int) (p60Var.f31517d0 * 255.0f)));
        int iK = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23054d7, false), (int) (p60Var.f31517d0 * 255.0f));
        Paint paint = this.f28538n;
        paint.setColor(iK);
        canvas.drawRect(0.0f, view.getY() + p60Var.f31520g0, getMeasuredWidth(), view.getY() + p60Var.f31520g0 + 1.0f, paint);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.i6 i6Var = this.f28540s;
        if (i6Var != null) {
            ((x51) i6Var.f38984b).f34506b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f31528p0 && this.f28540s == null) {
            this.f28540s = new org.telegram.ui.i6(view);
        }
    }
}
