package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class e11 extends FrameLayout {
    public final q9 f34647a;
    public final Paint f34648b;
    public final RectF f34649c;
    public final d6 d;
    public d11 f34650e;
    public String f34651f;
    public p5 h;
    public int f34652n;
    public boolean f34653r;
    public final g11 f34654s;

    public e11(g11 g11Var, Context context) {
        super(context);
        this.f34654s = g11Var;
        this.f34648b = new Paint(1);
        this.f34649c = new RectF();
        this.d = new d6(this, 0L, 260L, nr.h);
        setWillNotDraw(false);
        c8.ra.a(this);
        q9 q9Var = new q9(context);
        this.f34647a = q9Var;
        addView(q9Var, c8.ma.d(20, 20.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e11.a(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f34653r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.d.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.m6.tk;
        g11 g11Var = this.f34654s;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, g11Var.f35372e);
        float width = getWidth() - org.telegram.messenger.g0.L(3.0f);
        int height = getHeight();
        RectF rectF = this.f34649c;
        rectF.set(org.telegram.messenger.g0.L(3.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, width, (org.telegram.messenger.g0.L(28.0f) + height) / 2.0f);
        int f11 = i0.a.f(e10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, g11Var.f35372e), w02);
        Paint paint = this.f34648b;
        paint.setColor(f11);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        int f12 = i0.a.f(e10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, g11Var.f35372e), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wk, g11Var.f35372e));
        p5 p5Var = this.h;
        if (p5Var != null && this.f34652n != f12) {
            this.f34652n = f12;
            p5Var.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.SRC_IN));
            this.f34647a.invalidate();
        }
        if (this.f34651f != null) {
            g11Var.f35381l0.setColor(f12);
            canvas.drawText(this.f34651f, org.telegram.messenger.g0.L(15.0f), rectF.centerY() - ((g11Var.f35381l0.ascent() + g11Var.f35381l0.descent()) / 2.0f), g11Var.f35381l0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        if (this.f34651f == null) {
            L = org.telegram.messenger.g0.L(44.0f);
        } else {
            L = org.telegram.messenger.g0.L(15.0f) + org.telegram.messenger.g0.L(15.0f) + ((int) Math.ceil(this.f34654s.f35381l0.measureText(this.f34651f)));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), i10);
    }
}
