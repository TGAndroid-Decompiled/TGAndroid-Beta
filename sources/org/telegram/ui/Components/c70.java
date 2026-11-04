package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public final class c70 extends Drawable {
    public static final Paint f32574k = new Paint();
    public static TextPaint f32575l;
    public static TextPaint f32576m;
    public static TextPaint f32577n;
    public StaticLayout f32579b;
    public float f32580c;
    public float d;
    public float f32581e;
    public final int f32583g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.e6 f32585j;
    public final RectF f32578a = new RectF();
    public final StringBuilder f32582f = new StringBuilder(5);
    public float f32584i = 1.0f;

    public c70(int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f32583g = i3;
        this.f32585j = e6Var;
        if (i3 == 0) {
            if (f32575l == null) {
                f32575l = new TextPaint(1);
            }
            f32575l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f32574k.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28265xi, e6Var));
            f32575l.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yi, e6Var));
            this.h = f32575l;
        } else if (i3 == 1) {
            if (f32576m == null) {
                f32576m = new TextPaint(1);
            }
            f32576m.setColor(-1);
            f32576m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f32576m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f32576m;
        } else {
            if (f32577n == null) {
                f32577n = new TextPaint(1);
            }
            f32577n.setColor(-1);
            f32577n.setTextSize(org.telegram.ui.ActionBar.k6.f27875d3.getTextSize() * 0.75f);
            f32577n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f32577n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f32582f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f32579b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f32581e = this.f32579b.getLineLeft(0);
                    this.f32580c = this.f32579b.getLineWidth(0);
                    this.d = this.f32579b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f32579b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f32583g == 0) {
            int i3 = org.telegram.ui.ActionBar.k6.f28265xi;
            org.telegram.ui.ActionBar.e6 e6Var = this.f32585j;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
            Paint paint = f32574k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yi, e6Var));
            RectF rectF = this.f32578a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f32584i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f32579b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.recaptcha.internal.a.z(width, this.f32580c, 2.0f, bounds.left) - this.f32581e, com.google.android.recaptcha.internal.a.z(width, this.d, 2.0f, bounds.top));
            this.f32579b.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.h.setAlpha(i3);
        f32574k.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
