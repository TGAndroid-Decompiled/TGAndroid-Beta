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
    public static final Paint f33819k = new Paint();
    public static TextPaint f33820l;
    public static TextPaint f33821m;
    public static TextPaint f33822n;
    public StaticLayout f33824b;
    public float f33825c;
    public float d;
    public float f33826e;
    public final int f33828g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.f6 f33830j;
    public final RectF f33823a = new RectF();
    public final StringBuilder f33827f = new StringBuilder(5);
    public float f33829i = 1.0f;

    public g70(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f33828g = i7;
        this.f33830j = f6Var;
        if (i7 == 0) {
            if (f33820l == null) {
                f33820l = new TextPaint(1);
            }
            f33820l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f33819k.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28232xi, f6Var));
            f33820l.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yi, f6Var));
            this.h = f33820l;
        } else if (i7 == 1) {
            if (f33821m == null) {
                f33821m = new TextPaint(1);
            }
            f33821m.setColor(-1);
            f33821m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f33821m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33821m;
        } else {
            if (f33822n == null) {
                f33822n = new TextPaint(1);
            }
            f33822n.setColor(-1);
            f33822n.setTextSize(org.telegram.ui.ActionBar.k6.f27845d3.getTextSize() * 0.75f);
            f33822n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33822n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f33827f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f33824b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f33826e = this.f33824b.getLineLeft(0);
                    this.f33825c = this.f33824b.getLineWidth(0);
                    this.d = this.f33824b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f33824b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f33828g == 0) {
            int i7 = org.telegram.ui.ActionBar.k6.f28232xi;
            org.telegram.ui.ActionBar.f6 f6Var = this.f33830j;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            Paint paint = f33819k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yi, f6Var));
            RectF rectF = this.f33823a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f33829i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f33824b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.recaptcha.internal.a.A(width, this.f33825c, 2.0f, bounds.left) - this.f33826e, com.google.android.recaptcha.internal.a.A(width, this.d, 2.0f, bounds.top));
            this.f33824b.draw(canvas);
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
        f33819k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
