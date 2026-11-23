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
    public static final Paint f41678k = new Paint();
    public static TextPaint f41679l;
    public static TextPaint f41680m;
    public static TextPaint f41681n;
    public StaticLayout f41683b;
    public float f41684c;
    public float d;
    public float f41685e;
    public final int f41687g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.h6 f41689j;
    public final RectF f41682a = new RectF();
    public final StringBuilder f41686f = new StringBuilder(5);
    public float f41688i = 1.0f;

    public w70(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f41687g = i7;
        this.f41689j = h6Var;
        if (i7 == 0) {
            if (f41679l == null) {
                f41679l = new TextPaint(1);
            }
            f41679l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f41678k.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ai, h6Var));
            f41679l.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bi, h6Var));
            this.h = f41679l;
        } else if (i7 == 1) {
            if (f41680m == null) {
                f41680m = new TextPaint(1);
            }
            f41680m.setColor(-1);
            f41680m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f41680m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f41680m;
        } else {
            if (f41681n == null) {
                f41681n = new TextPaint(1);
            }
            f41681n.setColor(-1);
            f41681n.setTextSize(org.telegram.ui.ActionBar.m6.f29378d3.getTextSize() * 0.75f);
            f41681n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f41681n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f41686f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f41683b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f41685e = this.f41683b.getLineLeft(0);
                    this.f41684c = this.f41683b.getLineWidth(0);
                    this.d = this.f41683b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f41683b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f41687g == 0) {
            int i7 = org.telegram.ui.ActionBar.m6.Ai;
            org.telegram.ui.ActionBar.h6 h6Var = this.f41689j;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            Paint paint = f41678k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bi, h6Var));
            RectF rectF = this.f41682a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f41688i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f41683b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f41684c, 2.0f, bounds.left) - this.f41685e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f41683b.draw(canvas);
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
        f41678k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
