package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s60 extends m61 {
    public float f30201f;
    public float h;
    public final Paint f30202n;
    public float f30203r;
    public n7.z0 f30204s;
    public final b70 v;

    public s60(b70 b70Var, Context context) {
        super(b70Var, context);
        this.v = b70Var;
        this.f30202n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        b70 b70Var = this.v;
        int i11 = b70Var.f28984y;
        i10 = ((org.telegram.ui.ActionBar.f3) b70Var).backgroundPaddingTop;
        b70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = b70Var.f24580o0 + b70Var.f24586u0;
        xw0 xw0Var = b70Var.f28981s;
        if (xw0Var.getVisibility() != 0) {
            this.f30201f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f30203r = (f7 - this.f30201f) * 0.10666667f;
        }
        float f10 = this.f30201f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f30203r;
            float f13 = f10 + f12;
            this.f30201f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f30201f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f30201f = f11;
            } else {
                invalidate();
            }
        }
        xw0Var.setTranslationY(b70Var.f28984y + this.f30201f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        b70 b70Var = this.v;
        if (view == b70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + b70Var.f24577k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false), (int) (b70Var.f24574h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d7, false), (int) (b70Var.f24574h0 * 255.0f));
            Paint paint = this.f30202n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + b70Var.f24577k0, getMeasuredWidth(), view.getY() + b70Var.f24577k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.f30204s;
        if (z0Var != null) {
            ((r61) z0Var.f16703b).f29963b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f24585t0 && this.f30204s == null) {
            this.f30204s = new n7.z0(view);
        }
    }
}
