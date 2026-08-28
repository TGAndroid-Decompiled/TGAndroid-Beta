package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b60 extends q51 {
    public float f27052f;
    public float h;
    public final Paint f27053n;
    public float f27054r;
    public org.telegram.ui.Cells.e3 f27055s;
    public final k60 v;

    public b60(k60 k60Var, Context context) {
        super(k60Var, context);
        this.v = k60Var;
        this.f27053n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        k60 k60Var = this.v;
        int i10 = k60Var.f32378y;
        i9 = ((org.telegram.ui.ActionBar.f3) k60Var).backgroundPaddingTop;
        k60Var.R.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i10 - i9));
        float f10 = k60Var.f29984k0 + k60Var.f29989q0;
        gw0 gw0Var = k60Var.f32375s;
        if (gw0Var.getVisibility() != 0) {
            this.f27052f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f27054r = (f10 - this.f27052f) * 0.10666667f;
        }
        float f11 = this.f27052f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f27054r;
            float f14 = f11 + f13;
            this.f27052f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f27052f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f27052f = f12;
            } else {
                invalidate();
            }
        }
        gw0Var.setTranslationY(k60Var.f32378y + this.f27052f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        k60 k60Var = this.v;
        if (view == k60Var.R) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + k60Var.f29980g0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false), (int) (k60Var.f29977d0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23002d7, false), (int) (k60Var.f29977d0 * 255.0f));
            Paint paint = this.f27053n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + k60Var.f29980g0, getMeasuredWidth(), view.getY() + k60Var.f29980g0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.e3 e3Var = this.f27055s;
        if (e3Var != null) {
            ((v51) e3Var.f24286b).f33267b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f29988p0 && this.f27055s == null) {
            this.f27055s = new org.telegram.ui.Cells.e3(view);
        }
    }
}
