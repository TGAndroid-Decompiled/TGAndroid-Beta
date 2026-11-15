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
public final class j70 extends Drawable {
    public static final Paint f35900k = new Paint();
    public static TextPaint f35901l;
    public static TextPaint f35902m;
    public static TextPaint f35903n;
    public StaticLayout f35905b;
    public float f35906c;
    public float d;
    public float f35907e;
    public final int f35909g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.e6 f35911j;
    public final RectF f35904a = new RectF();
    public final StringBuilder f35908f = new StringBuilder(5);
    public float f35910i = 1.0f;

    public j70(int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f35909g = i7;
        this.f35911j = e6Var;
        if (i7 == 0) {
            if (f35901l == null) {
                f35901l = new TextPaint(1);
            }
            f35901l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f35900k.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ai, e6Var));
            f35901l.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bi, e6Var));
            this.h = f35901l;
        } else if (i7 == 1) {
            if (f35902m == null) {
                f35902m = new TextPaint(1);
            }
            f35902m.setColor(-1);
            f35902m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f35902m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f35902m;
        } else {
            if (f35903n == null) {
                f35903n = new TextPaint(1);
            }
            f35903n.setColor(-1);
            f35903n.setTextSize(org.telegram.ui.ActionBar.j6.f28846d3.getTextSize() * 0.75f);
            f35903n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f35903n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f35908f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f35905b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f35907e = this.f35905b.getLineLeft(0);
                    this.f35906c = this.f35905b.getLineWidth(0);
                    this.d = this.f35905b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f35905b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f35909g == 0) {
            int i7 = org.telegram.ui.ActionBar.j6.Ai;
            org.telegram.ui.ActionBar.e6 e6Var = this.f35911j;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
            Paint paint = f35900k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bi, e6Var));
            RectF rectF = this.f35904a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f35910i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f35905b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f35906c, 2.0f, bounds.left) - this.f35907e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f35905b.draw(canvas);
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
        f35900k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
