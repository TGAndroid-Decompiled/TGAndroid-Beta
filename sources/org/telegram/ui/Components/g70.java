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
    public static final Paint f33862k = new Paint();
    public static TextPaint f33863l;
    public static TextPaint f33864m;
    public static TextPaint f33865n;
    public StaticLayout f33867b;
    public float f33868c;
    public float d;
    public float f33869e;
    public final int f33871g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.f6 f33873j;
    public final RectF f33866a = new RectF();
    public final StringBuilder f33870f = new StringBuilder(5);
    public float f33872i = 1.0f;

    public g70(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f33871g = i7;
        this.f33873j = f6Var;
        if (i7 == 0) {
            if (f33863l == null) {
                f33863l = new TextPaint(1);
            }
            f33863l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f33862k.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28236xi, f6Var));
            f33863l.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yi, f6Var));
            this.h = f33863l;
        } else if (i7 == 1) {
            if (f33864m == null) {
                f33864m = new TextPaint(1);
            }
            f33864m.setColor(-1);
            f33864m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f33864m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33864m;
        } else {
            if (f33865n == null) {
                f33865n = new TextPaint(1);
            }
            f33865n.setColor(-1);
            f33865n.setTextSize(org.telegram.ui.ActionBar.k6.f27849d3.getTextSize() * 0.75f);
            f33865n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33865n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f33870f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f33867b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f33869e = this.f33867b.getLineLeft(0);
                    this.f33868c = this.f33867b.getLineWidth(0);
                    this.d = this.f33867b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f33867b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f33871g == 0) {
            int i7 = org.telegram.ui.ActionBar.k6.f28236xi;
            org.telegram.ui.ActionBar.f6 f6Var = this.f33873j;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            Paint paint = f33862k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yi, f6Var));
            RectF rectF = this.f33866a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f33872i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f33867b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.recaptcha.internal.a.A(width, this.f33868c, 2.0f, bounds.left) - this.f33869e, com.google.android.recaptcha.internal.a.A(width, this.d, 2.0f, bounds.top));
            this.f33867b.draw(canvas);
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
        f33862k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
