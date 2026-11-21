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
    public static final Paint f41685k = new Paint();
    public static TextPaint f41686l;
    public static TextPaint f41687m;
    public static TextPaint f41688n;
    public StaticLayout f41690b;
    public float f41691c;
    public float d;
    public float f41692e;
    public final int f41694g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.h6 f41696j;
    public final RectF f41689a = new RectF();
    public final StringBuilder f41693f = new StringBuilder(5);
    public float f41695i = 1.0f;

    public w70(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f41694g = i7;
        this.f41696j = h6Var;
        if (i7 == 0) {
            if (f41686l == null) {
                f41686l = new TextPaint(1);
            }
            f41686l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f41685k.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ai, h6Var));
            f41686l.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bi, h6Var));
            this.h = f41686l;
        } else if (i7 == 1) {
            if (f41687m == null) {
                f41687m = new TextPaint(1);
            }
            f41687m.setColor(-1);
            f41687m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f41687m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f41687m;
        } else {
            if (f41688n == null) {
                f41688n = new TextPaint(1);
            }
            f41688n.setColor(-1);
            f41688n.setTextSize(org.telegram.ui.ActionBar.m6.f29375d3.getTextSize() * 0.75f);
            f41688n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f41688n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f41693f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f41690b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f41692e = this.f41690b.getLineLeft(0);
                    this.f41691c = this.f41690b.getLineWidth(0);
                    this.d = this.f41690b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f41690b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f41694g == 0) {
            int i7 = org.telegram.ui.ActionBar.m6.Ai;
            org.telegram.ui.ActionBar.h6 h6Var = this.f41696j;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            Paint paint = f41685k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bi, h6Var));
            RectF rectF = this.f41689a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f41695i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f41690b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f41691c, 2.0f, bounds.left) - this.f41692e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f41690b.draw(canvas);
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
        f41685k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
