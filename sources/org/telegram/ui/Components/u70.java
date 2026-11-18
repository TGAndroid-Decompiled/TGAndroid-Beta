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
public final class u70 extends Drawable {
    public static final Paint f40237k = new Paint();
    public static TextPaint f40238l;
    public static TextPaint f40239m;
    public static TextPaint f40240n;
    public StaticLayout f40242b;
    public float f40243c;
    public float d;
    public float f40244e;
    public final int f40246g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.i6 f40248j;
    public final RectF f40241a = new RectF();
    public final StringBuilder f40245f = new StringBuilder(5);
    public float f40247i = 1.0f;

    public u70(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f40246g = i7;
        this.f40248j = i6Var;
        if (i7 == 0) {
            if (f40238l == null) {
                f40238l = new TextPaint(1);
            }
            f40238l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f40237k.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ai, i6Var));
            f40238l.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bi, i6Var));
            this.h = f40238l;
        } else if (i7 == 1) {
            if (f40239m == null) {
                f40239m = new TextPaint(1);
            }
            f40239m.setColor(-1);
            f40239m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f40239m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f40239m;
        } else {
            if (f40240n == null) {
                f40240n = new TextPaint(1);
            }
            f40240n.setColor(-1);
            f40240n.setTextSize(org.telegram.ui.ActionBar.n6.f29393d3.getTextSize() * 0.75f);
            f40240n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f40240n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f40245f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f40242b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f40244e = this.f40242b.getLineLeft(0);
                    this.f40243c = this.f40242b.getLineWidth(0);
                    this.d = this.f40242b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f40242b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f40246g == 0) {
            int i7 = org.telegram.ui.ActionBar.n6.Ai;
            org.telegram.ui.ActionBar.i6 i6Var = this.f40248j;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
            Paint paint = f40237k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bi, i6Var));
            RectF rectF = this.f40241a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f40247i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f40242b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f40243c, 2.0f, bounds.left) - this.f40244e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f40242b.draw(canvas);
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
        f40237k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
