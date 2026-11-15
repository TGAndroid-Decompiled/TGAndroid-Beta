package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class fl0 extends FrameLayout {
    public final Paint f47155a;
    public float f47156b;
    public r1.g f47157c;
    public final jl0 d;

    public fl0(jl0 jl0Var, Context context) {
        super(context);
        this.d = jl0Var;
        this.f47155a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        float f11;
        r1.g gVar = this.f47157c;
        if (gVar != null) {
            gVar.d();
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z11) {
            float f12 = this.f47156b;
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
            gVar2.f55748m = hVar;
            this.f47157c = gVar2;
            gVar2.b(new ab0(this, 1));
            this.f47157c.a(new l9(this, 1));
            this.f47157c.h();
            return;
        }
        this.f47156b = f10;
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
        int i7 = org.telegram.ui.ActionBar.j6.O6;
        jl0 jl0Var = this.d;
        canvas.drawColor(jl0Var.getThemedColor(i7));
        int themedColor = jl0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Vi);
        Paint paint = this.f47155a;
        paint.setColor(themedColor);
        if (org.telegram.messenger.hd.f24101a0) {
            L = getWidth() - org.telegram.messenger.g0.L(28.0f);
        } else {
            L = org.telegram.messenger.g0.L(28.0f);
        }
        canvas.drawCircle(L, -org.telegram.messenger.g0.L(28.0f), Math.max(getWidth(), getHeight()) * this.f47156b, paint);
    }
}
