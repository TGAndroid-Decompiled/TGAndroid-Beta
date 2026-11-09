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
public final class h70 extends Drawable {
    public static final Paint f34216k = new Paint();
    public static TextPaint f34217l;
    public static TextPaint f34218m;
    public static TextPaint f34219n;
    public StaticLayout f34221b;
    public float f34222c;
    public float d;
    public float f34223e;
    public final int f34225g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.g6 f34227j;
    public final RectF f34220a = new RectF();
    public final StringBuilder f34224f = new StringBuilder(5);
    public float f34226i = 1.0f;

    public h70(int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f34225g = i7;
        this.f34227j = g6Var;
        if (i7 == 0) {
            if (f34217l == null) {
                f34217l = new TextPaint(1);
            }
            f34217l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f34216k.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28249xi, g6Var));
            f34217l.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.yi, g6Var));
            this.h = f34217l;
        } else if (i7 == 1) {
            if (f34218m == null) {
                f34218m = new TextPaint(1);
            }
            f34218m.setColor(-1);
            f34218m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f34218m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f34218m;
        } else {
            if (f34219n == null) {
                f34219n = new TextPaint(1);
            }
            f34219n.setColor(-1);
            f34219n.setTextSize(org.telegram.ui.ActionBar.l6.f27862d3.getTextSize() * 0.75f);
            f34219n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f34219n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f34224f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f34221b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f34223e = this.f34221b.getLineLeft(0);
                    this.f34222c = this.f34221b.getLineWidth(0);
                    this.d = this.f34221b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f34221b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f34225g == 0) {
            int i7 = org.telegram.ui.ActionBar.l6.f28249xi;
            org.telegram.ui.ActionBar.g6 g6Var = this.f34227j;
            int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
            Paint paint = f34216k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.yi, g6Var));
            RectF rectF = this.f34220a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f34226i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f34221b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.recaptcha.internal.a.A(width, this.f34222c, 2.0f, bounds.left) - this.f34223e, com.google.android.recaptcha.internal.a.A(width, this.d, 2.0f, bounds.top));
            this.f34221b.draw(canvas);
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
    public final void setAlpha(int i7) {
        this.h.setAlpha(i7);
        f34216k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
