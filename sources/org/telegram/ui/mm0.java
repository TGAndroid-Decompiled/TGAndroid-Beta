package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class mm0 extends FrameLayout {
    public final Paint f39573a;
    public float f39574b;
    public o1.j f39575c;
    public final qm0 d;

    public mm0(qm0 qm0Var, Context context) {
        super(context);
        this.d = qm0Var;
        this.f39573a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        o1.j jVar = this.f39575c;
        if (jVar != null) {
            jVar.d();
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z11) {
            float f11 = this.f39574b;
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
            jVar2.f13958m = kVar;
            this.f39575c = jVar2;
            jVar2.b(new ic0(this, 1));
            this.f39575c.a(new m9(this, 1));
            this.f39575c.h();
            return;
        }
        this.f39574b = f7;
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
        qm0 qm0Var = this.d;
        canvas.drawColor(qm0Var.getThemedColor(i10));
        int themedColor = qm0Var.getThemedColor(org.telegram.ui.ActionBar.t6.Si);
        Paint paint = this.f39573a;
        paint.setColor(themedColor);
        if (org.telegram.messenger.dd.X) {
            L = getWidth() - org.telegram.messenger.i0.L(28.0f);
        } else {
            L = org.telegram.messenger.i0.L(28.0f);
        }
        canvas.drawCircle(L, -org.telegram.messenger.i0.L(28.0f), Math.max(getWidth(), getHeight()) * this.f39574b, paint);
    }
}
