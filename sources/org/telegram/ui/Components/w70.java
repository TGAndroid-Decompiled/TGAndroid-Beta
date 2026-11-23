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
public final class w70 extends Drawable {
    public static final Paint f41679k = new Paint();
    public static TextPaint f41680l;
    public static TextPaint f41681m;
    public static TextPaint f41682n;
    public StaticLayout f41684b;
    public float f41685c;
    public float d;
    public float f41686e;
    public final int f41688g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.h6 f41690j;
    public final RectF f41683a = new RectF();
    public final StringBuilder f41687f = new StringBuilder(5);
    public float f41689i = 1.0f;

    public w70(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f41688g = i7;
        this.f41690j = h6Var;
        if (i7 == 0) {
            if (f41680l == null) {
                f41680l = new TextPaint(1);
            }
            f41680l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f41679k.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ai, h6Var));
            f41680l.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bi, h6Var));
            this.h = f41680l;
        } else if (i7 == 1) {
            if (f41681m == null) {
                f41681m = new TextPaint(1);
            }
            f41681m.setColor(-1);
            f41681m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f41681m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f41681m;
        } else {
            if (f41682n == null) {
                f41682n = new TextPaint(1);
            }
            f41682n.setColor(-1);
            f41682n.setTextSize(org.telegram.ui.ActionBar.m6.f29378d3.getTextSize() * 0.75f);
            f41682n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f41682n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f41687f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f41684b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f41686e = this.f41684b.getLineLeft(0);
                    this.f41685c = this.f41684b.getLineWidth(0);
                    this.d = this.f41684b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f41684b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f41688g == 0) {
            int i7 = org.telegram.ui.ActionBar.m6.Ai;
            org.telegram.ui.ActionBar.h6 h6Var = this.f41690j;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            Paint paint = f41679k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bi, h6Var));
            RectF rectF = this.f41683a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f41689i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f41684b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f41685c, 2.0f, bounds.left) - this.f41686e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f41684b.draw(canvas);
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
        f41679k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
