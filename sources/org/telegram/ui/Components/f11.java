package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class f11 extends FrameLayout {
    public final q9 f35054a;
    public final Paint f35055b;
    public final RectF f35056c;
    public final d6 d;
    public e11 f35057e;
    public String f35058f;
    public p5 h;
    public int f35059n;
    public boolean f35060r;
    public final h11 f35061s;

    public f11(h11 h11Var, Context context) {
        super(context);
        this.f35061s = h11Var;
        this.f35055b = new Paint(1);
        this.f35056c = new RectF();
        this.d = new d6(this, 0L, 260L, nr.h);
        setWillNotDraw(false);
        c8.ra.a(this);
        q9 q9Var = new q9(context);
        this.f35054a = q9Var;
        addView(q9Var, c8.ma.d(20, 20.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f11.a(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f35060r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.d.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.m6.tk;
        h11 h11Var = this.f35061s;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h11Var.f35733e);
        float width = getWidth() - org.telegram.messenger.g0.L(3.0f);
        int height = getHeight();
        RectF rectF = this.f35056c;
        rectF.set(org.telegram.messenger.g0.L(3.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, width, (org.telegram.messenger.g0.L(28.0f) + height) / 2.0f);
        int f11 = i0.a.f(e10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, h11Var.f35733e), w02);
        Paint paint = this.f35055b;
        paint.setColor(f11);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        int f12 = i0.a.f(e10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h11Var.f35733e), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wk, h11Var.f35733e));
        p5 p5Var = this.h;
        if (p5Var != null && this.f35059n != f12) {
            this.f35059n = f12;
            p5Var.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.SRC_IN));
            this.f35054a.invalidate();
        }
        if (this.f35058f != null) {
            h11Var.f35742l0.setColor(f12);
            canvas.drawText(this.f35058f, org.telegram.messenger.g0.L(15.0f), rectF.centerY() - ((h11Var.f35742l0.ascent() + h11Var.f35742l0.descent()) / 2.0f), h11Var.f35742l0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        if (this.f35058f == null) {
            L = org.telegram.messenger.g0.L(44.0f);
        } else {
            L = org.telegram.messenger.g0.L(15.0f) + org.telegram.messenger.g0.L(15.0f) + ((int) Math.ceil(this.f35061s.f35742l0.measureText(this.f35058f)));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), i10);
    }
}
