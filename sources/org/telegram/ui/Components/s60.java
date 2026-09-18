package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s60 extends n61 {
    public float f27782f;
    public float h;
    public final Paint f27783n;
    public float f27784r;
    public n7.a1 f27785s;
    public final b70 v;

    public s60(b70 b70Var, Context context) {
        super(b70Var, context);
        this.v = b70Var;
        this.f27783n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        b70 b70Var = this.v;
        int i11 = b70Var.f26949y;
        i10 = ((org.telegram.ui.ActionBar.g3) b70Var).backgroundPaddingTop;
        b70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = b70Var.f22638o0 + b70Var.f22644u0;
        zw0 zw0Var = b70Var.f26946s;
        if (zw0Var.getVisibility() != 0) {
            this.f27782f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f27784r = (f7 - this.f27782f) * 0.10666667f;
        }
        float f10 = this.f27782f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f27784r;
            float f13 = f10 + f12;
            this.f27782f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f27782f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f27782f = f11;
            } else {
                invalidate();
            }
        }
        zw0Var.setTranslationY(b70Var.f26949y + this.f27782f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        b70 b70Var = this.v;
        if (view == b70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + b70Var.f22635k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false), (int) (b70Var.f22632h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18864d7, false), (int) (b70Var.f22632h0 * 255.0f));
            Paint paint = this.f27783n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + b70Var.f22635k0, getMeasuredWidth(), view.getY() + b70Var.f22635k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.a1 a1Var = this.f27785s;
        if (a1Var != null) {
            ((s61) a1Var.f15118b).f27787b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f22643t0 && this.f27785s == null) {
            this.f27785s = new n7.a1(view);
        }
    }
}
