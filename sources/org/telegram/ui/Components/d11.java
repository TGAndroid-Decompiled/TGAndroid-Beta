package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class d11 extends FrameLayout {
    public final p9 f34183a;
    public final Paint f34184b;
    public final RectF f34185c;
    public final c6 d;
    public c11 f34186e;
    public String f34187f;
    public o5 h;
    public int f34188n;
    public boolean f34189r;
    public final f11 f34190s;

    public d11(f11 f11Var, Context context) {
        super(context);
        this.f34190s = f11Var;
        this.f34184b = new Paint(1);
        this.f34185c = new RectF();
        this.d = new c6(this, 0L, 260L, kr.h);
        setWillNotDraw(false);
        c8.sa.a(this);
        p9 p9Var = new p9(context);
        this.f34183a = p9Var;
        addView(p9Var, c8.na.d(20, 20.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d11.a(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f34189r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.d.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.n6.tk;
        f11 f11Var = this.f34190s;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, f11Var.f34953e);
        float width = getWidth() - org.telegram.messenger.g0.L(3.0f);
        int height = getHeight();
        RectF rectF = this.f34185c;
        rectF.set(org.telegram.messenger.g0.L(3.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, width, (org.telegram.messenger.g0.L(28.0f) + height) / 2.0f);
        int f11 = i0.a.f(e10, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.O5, f11Var.f34953e), w02);
        Paint paint = this.f34184b;
        paint.setColor(f11);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        int f12 = i0.a.f(e10, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, f11Var.f34953e), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wk, f11Var.f34953e));
        o5 o5Var = this.h;
        if (o5Var != null && this.f34188n != f12) {
            this.f34188n = f12;
            o5Var.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.SRC_IN));
            this.f34183a.invalidate();
        }
        if (this.f34187f != null) {
            f11Var.f34962l0.setColor(f12);
            canvas.drawText(this.f34187f, org.telegram.messenger.g0.L(15.0f), rectF.centerY() - ((f11Var.f34962l0.ascent() + f11Var.f34962l0.descent()) / 2.0f), f11Var.f34962l0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        if (this.f34187f == null) {
            L = org.telegram.messenger.g0.L(44.0f);
        } else {
            L = org.telegram.messenger.g0.L(15.0f) + org.telegram.messenger.g0.L(15.0f) + ((int) Math.ceil(this.f34190s.f34962l0.measureText(this.f34187f)));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), i10);
    }
}
