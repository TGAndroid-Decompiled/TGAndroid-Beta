package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class p01 extends FrameLayout {
    public final l9 f36718a;
    public final Paint f36719b;
    public final RectF f36720c;
    public final w5 d;
    public String f36721e;
    public String f36722f;
    public i5 h;
    public int f36723n;
    public boolean f36724r;
    public final r01 f36725s;

    public p01(r01 r01Var, Context context) {
        super(context);
        this.f36725s = r01Var;
        this.f36719b = new Paint(1);
        this.f36720c = new RectF();
        this.d = new w5(this, 0L, 260L, xq.h);
        this.f36722f = "";
        setWillNotDraw(false);
        c8.ka.a(this);
        l9 l9Var = new l9(context);
        this.f36718a = l9Var;
        addView(l9Var, c8.ha.d(20, 20.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z9) {
        boolean z10;
        float f10;
        String str = this.f36721e;
        if (str != null && str.equals(this.f36725s.S)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36724r = z10;
        if (!z9) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.d.e(true, f10);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f36724r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.d.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.k6.qk;
        r01 r01Var = this.f36725s;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, r01Var.f37460e);
        float width = getWidth() - org.telegram.messenger.g0.L(3.0f);
        int height = getHeight();
        RectF rectF = this.f36720c;
        rectF.set(org.telegram.messenger.g0.L(3.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, width, (org.telegram.messenger.g0.L(28.0f) + height) / 2.0f);
        int f11 = i0.a.f(e10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, r01Var.f37460e), w02);
        Paint paint = this.f36719b;
        paint.setColor(f11);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        int f12 = i0.a.f(e10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, r01Var.f37460e), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tk, r01Var.f37460e));
        r01Var.f37465h0.setColor(f12);
        i5 i5Var = this.h;
        if (i5Var != null && this.f36723n != f12) {
            this.f36723n = f12;
            i5Var.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.SRC_IN));
            this.f36718a.invalidate();
        }
        canvas.drawText(this.f36722f, org.telegram.messenger.g0.L(35.0f), rectF.centerY() - ((r01Var.f37465h0.ascent() + r01Var.f37465h0.descent()) / 2.0f), r01Var.f37465h0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(org.telegram.messenger.camera.q.B(13.0f, org.telegram.messenger.g0.L(35.0f) + ((int) Math.ceil(this.f36725s.f37465h0.measureText(this.f36722f))), 1073741824), i10);
    }
}
