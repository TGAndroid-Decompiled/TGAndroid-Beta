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
public final class g70 extends Drawable {
    public static final Paint f33816k = new Paint();
    public static TextPaint f33817l;
    public static TextPaint f33818m;
    public static TextPaint f33819n;
    public StaticLayout f33821b;
    public float f33822c;
    public float d;
    public float f33823e;
    public final int f33825g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.h6 f33827j;
    public final RectF f33820a = new RectF();
    public final StringBuilder f33824f = new StringBuilder(5);
    public float f33826i = 1.0f;

    public g70(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f33825g = i7;
        this.f33827j = h6Var;
        if (i7 == 0) {
            if (f33817l == null) {
                f33817l = new TextPaint(1);
            }
            f33817l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f33816k.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28274xi, h6Var));
            f33817l.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yi, h6Var));
            this.h = f33817l;
        } else if (i7 == 1) {
            if (f33818m == null) {
                f33818m = new TextPaint(1);
            }
            f33818m.setColor(-1);
            f33818m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f33818m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33818m;
        } else {
            if (f33819n == null) {
                f33819n = new TextPaint(1);
            }
            f33819n.setColor(-1);
            f33819n.setTextSize(org.telegram.ui.ActionBar.m6.f27887d3.getTextSize() * 0.75f);
            f33819n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33819n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f33824f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f33821b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f33823e = this.f33821b.getLineLeft(0);
                    this.f33822c = this.f33821b.getLineWidth(0);
                    this.d = this.f33821b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f33821b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f33825g == 0) {
            int i7 = org.telegram.ui.ActionBar.m6.f28274xi;
            org.telegram.ui.ActionBar.h6 h6Var = this.f33827j;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            Paint paint = f33816k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yi, h6Var));
            RectF rectF = this.f33820a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f33826i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f33821b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.recaptcha.internal.a.A(width, this.f33822c, 2.0f, bounds.left) - this.f33823e, com.google.android.recaptcha.internal.a.A(width, this.d, 2.0f, bounds.top));
            this.f33821b.draw(canvas);
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
        f33816k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
