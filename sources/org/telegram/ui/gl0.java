package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class gl0 extends FrameLayout {
    public final Paint f46112a;
    public float f46113b;
    public r1.g f46114c;
    public final kl0 d;

    public gl0(kl0 kl0Var, Context context) {
        super(context);
        this.d = kl0Var;
        this.f46112a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z9, boolean z10) {
        float f10;
        float f11;
        r1.g gVar = this.f46114c;
        if (gVar != null) {
            gVar.d();
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            float f12 = this.f46113b;
            if (f12 == f10) {
                return;
            }
            r1.g gVar2 = new r1.g(new r1.f(f12 * 100.0f));
            r1.h hVar = new r1.h(f10 * 100.0f);
            if (z9) {
                f11 = 500.0f;
            } else {
                f11 = 650.0f;
            }
            hVar.b(f11);
            hVar.a(1.0f);
            gVar2.f54279m = hVar;
            this.f46114c = gVar2;
            gVar2.b(new db0(this, 1));
            this.f46114c.a(new l9(this, 1));
            this.f46114c.h();
            return;
        }
        this.f46113b = f10;
        TextView textView = this.d.U;
        if (textView != null) {
            textView.setAlpha((f10 * 0.2f) + 0.8f);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        super.onDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.m6.O6;
        kl0 kl0Var = this.d;
        canvas.drawColor(kl0Var.getThemedColor(i7));
        int themedColor = kl0Var.getThemedColor(org.telegram.ui.ActionBar.m6.Si);
        Paint paint = this.f46112a;
        paint.setColor(themedColor);
        if (org.telegram.messenger.id.f23161a0) {
            L = getWidth() - org.telegram.messenger.g0.L(28.0f);
        } else {
            L = org.telegram.messenger.g0.L(28.0f);
        }
        canvas.drawCircle(L, -org.telegram.messenger.g0.L(28.0f), Math.max(getWidth(), getHeight()) * this.f46113b, paint);
    }
}
