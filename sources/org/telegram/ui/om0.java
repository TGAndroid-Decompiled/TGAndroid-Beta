package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class om0 extends FrameLayout {
    public final Paint f40302a;
    public float f40303b;
    public o1.j f40304c;
    public final sm0 d;

    public om0(sm0 sm0Var, Context context) {
        super(context);
        this.d = sm0Var;
        this.f40302a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        o1.j jVar = this.f40304c;
        if (jVar != null) {
            jVar.d();
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z11) {
            float f11 = this.f40303b;
            if (f11 == f7) {
                return;
            }
            o1.j jVar2 = new o1.j(new o1.i(f11 * 100.0f));
            o1.k kVar = new o1.k(f7 * 100.0f);
            if (z10) {
                f10 = 500.0f;
            } else {
                f10 = 650.0f;
            }
            kVar.b(f10);
            kVar.a(1.0f);
            jVar2.f13957m = kVar;
            this.f40304c = jVar2;
            jVar2.b(new jc0(this, 1));
            this.f40304c.a(new m9(this, 1));
            this.f40304c.h();
            return;
        }
        this.f40303b = f7;
        TextView textView = this.d.U;
        if (textView != null) {
            textView.setAlpha((f7 * 0.2f) + 0.8f);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.t6.O6;
        sm0 sm0Var = this.d;
        canvas.drawColor(sm0Var.getThemedColor(i10));
        int themedColor = sm0Var.getThemedColor(org.telegram.ui.ActionBar.t6.Si);
        Paint paint = this.f40302a;
        paint.setColor(themedColor);
        if (org.telegram.messenger.cd.X) {
            L = getWidth() - org.telegram.messenger.i0.L(28.0f);
        } else {
            L = org.telegram.messenger.i0.L(28.0f);
        }
        canvas.drawCircle(L, -org.telegram.messenger.i0.L(28.0f), Math.max(getWidth(), getHeight()) * this.f40303b, paint);
    }
}
