package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class il0 extends FrameLayout {
    public final Paint f48772a;
    public float f48773b;
    public r1.g f48774c;
    public final ml0 d;

    public il0(ml0 ml0Var, Context context) {
        super(context);
        this.d = ml0Var;
        this.f48772a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        float f11;
        r1.g gVar = this.f48774c;
        if (gVar != null) {
            gVar.d();
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z11) {
            float f12 = this.f48773b;
            if (f12 == f10) {
                return;
            }
            r1.g gVar2 = new r1.g(new r1.f(f12 * 100.0f));
            r1.h hVar = new r1.h(f10 * 100.0f);
            if (z10) {
                f11 = 500.0f;
            } else {
                f11 = 650.0f;
            }
            hVar.b(f11);
            hVar.a(1.0f);
            gVar2.f56364m = hVar;
            this.f48774c = gVar2;
            gVar2.b(new bb0(this, 1));
            this.f48774c.a(new m9(this, 1));
            this.f48774c.h();
            return;
        }
        this.f48773b = f10;
        TextView textView = this.d.V;
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
        ml0 ml0Var = this.d;
        canvas.drawColor(ml0Var.getThemedColor(i7));
        int themedColor = ml0Var.getThemedColor(org.telegram.ui.ActionBar.m6.Vi);
        Paint paint = this.f48772a;
        paint.setColor(themedColor);
        if (org.telegram.messenger.gd.f24241a0) {
            L = getWidth() - org.telegram.messenger.g0.L(28.0f);
        } else {
            L = org.telegram.messenger.g0.L(28.0f);
        }
        canvas.drawCircle(L, -org.telegram.messenger.g0.L(28.0f), Math.max(getWidth(), getHeight()) * this.f48773b, paint);
    }
}
