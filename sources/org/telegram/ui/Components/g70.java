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
    public static final Paint f33836k = new Paint();
    public static TextPaint f33837l;
    public static TextPaint f33838m;
    public static TextPaint f33839n;
    public StaticLayout f33841b;
    public float f33842c;
    public float d;
    public float f33843e;
    public final int f33845g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.f6 f33847j;
    public final RectF f33840a = new RectF();
    public final StringBuilder f33844f = new StringBuilder(5);
    public float f33846i = 1.0f;

    public g70(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f33845g = i7;
        this.f33847j = f6Var;
        if (i7 == 0) {
            if (f33837l == null) {
                f33837l = new TextPaint(1);
            }
            f33837l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f33836k.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28233xi, f6Var));
            f33837l.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yi, f6Var));
            this.h = f33837l;
        } else if (i7 == 1) {
            if (f33838m == null) {
                f33838m = new TextPaint(1);
            }
            f33838m.setColor(-1);
            f33838m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f33838m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33838m;
        } else {
            if (f33839n == null) {
                f33839n = new TextPaint(1);
            }
            f33839n.setColor(-1);
            f33839n.setTextSize(org.telegram.ui.ActionBar.k6.f27846d3.getTextSize() * 0.75f);
            f33839n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33839n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f33844f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f33841b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f33843e = this.f33841b.getLineLeft(0);
                    this.f33842c = this.f33841b.getLineWidth(0);
                    this.d = this.f33841b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f33841b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f33845g == 0) {
            int i7 = org.telegram.ui.ActionBar.k6.f28233xi;
            org.telegram.ui.ActionBar.f6 f6Var = this.f33847j;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            Paint paint = f33836k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yi, f6Var));
            RectF rectF = this.f33840a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f33846i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f33841b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.recaptcha.internal.a.A(width, this.f33842c, 2.0f, bounds.left) - this.f33843e, com.google.android.recaptcha.internal.a.A(width, this.d, 2.0f, bounds.top));
            this.f33841b.draw(canvas);
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
        f33836k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
