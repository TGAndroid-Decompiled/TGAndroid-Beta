package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s60 extends m61 {
    public float f30228f;
    public float h;
    public final Paint f30229n;
    public float f30230r;
    public n7.z0 f30231s;
    public final b70 v;

    public s60(b70 b70Var, Context context) {
        super(b70Var, context);
        this.v = b70Var;
        this.f30229n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        b70 b70Var = this.v;
        int i11 = b70Var.f29011y;
        i10 = ((org.telegram.ui.ActionBar.f3) b70Var).backgroundPaddingTop;
        b70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = b70Var.f24607o0 + b70Var.f24613u0;
        xw0 xw0Var = b70Var.f29008s;
        if (xw0Var.getVisibility() != 0) {
            this.f30228f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f30230r = (f7 - this.f30228f) * 0.10666667f;
        }
        float f10 = this.f30228f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f30230r;
            float f13 = f10 + f12;
            this.f30228f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f30228f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f30228f = f11;
            } else {
                invalidate();
            }
        }
        xw0Var.setTranslationY(b70Var.f29011y + this.f30228f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        b70 b70Var = this.v;
        if (view == b70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + b70Var.f24604k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false), (int) (b70Var.f24601h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20691d7, false), (int) (b70Var.f24601h0 * 255.0f));
            Paint paint = this.f30229n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + b70Var.f24604k0, getMeasuredWidth(), view.getY() + b70Var.f24604k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.f30231s;
        if (z0Var != null) {
            ((r61) z0Var.f16730b).f29990b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f24612t0 && this.f30231s == null) {
            this.f30231s = new n7.z0(view);
        }
    }
}
