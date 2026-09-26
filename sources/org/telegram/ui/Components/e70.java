package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e70 extends a71 {
    public float f23860f;
    public float h;
    public final Paint f23861n;
    public float f23862r;
    public n7.z0 f23863s;
    public final n70 v;

    public e70(n70 n70Var, Context context) {
        super(n70Var, context);
        this.v = n70Var;
        this.f23861n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        n70 n70Var = this.v;
        int i11 = n70Var.f23265y;
        i10 = ((org.telegram.ui.ActionBar.e3) n70Var).backgroundPaddingTop;
        n70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = n70Var.f26701o0 + n70Var.f26707u0;
        jx0 jx0Var = n70Var.f23262s;
        if (jx0Var.getVisibility() != 0) {
            this.f23860f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f23862r = (f7 - this.f23860f) * 0.10666667f;
        }
        float f10 = this.f23860f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f23862r;
            float f13 = f10 + f12;
            this.f23860f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f23860f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f23860f = f11;
            } else {
                invalidate();
            }
        }
        jx0Var.setTranslationY(n70Var.f23265y + this.f23860f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        n70 n70Var = this.v;
        if (view == n70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + n70Var.f26698k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false), (int) (n70Var.f26695h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d7, false), (int) (n70Var.f26695h0 * 255.0f));
            Paint paint = this.f23861n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + n70Var.f26698k0, getMeasuredWidth(), view.getY() + n70Var.f26698k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.f23863s;
        if (z0Var != null) {
            ((f71) z0Var.f15410b).f24154b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f26706t0 && this.f23863s == null) {
            this.f23863s = new n7.z0(view);
        }
    }
}
