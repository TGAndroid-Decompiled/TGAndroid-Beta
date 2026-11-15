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
    public static final Paint f35887k = new Paint();
    public static TextPaint f35888l;
    public static TextPaint f35889m;
    public static TextPaint f35890n;
    public StaticLayout f35892b;
    public float f35893c;
    public float d;
    public float f35894e;
    public final int f35896g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.e6 f35898j;
    public final RectF f35891a = new RectF();
    public final StringBuilder f35895f = new StringBuilder(5);
    public float f35897i = 1.0f;

    public j70(int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f35896g = i7;
        this.f35898j = e6Var;
        if (i7 == 0) {
            if (f35888l == null) {
                f35888l = new TextPaint(1);
            }
            f35888l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f35887k.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ai, e6Var));
            f35888l.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bi, e6Var));
            this.h = f35888l;
        } else if (i7 == 1) {
            if (f35889m == null) {
                f35889m = new TextPaint(1);
            }
            f35889m.setColor(-1);
            f35889m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f35889m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f35889m;
        } else {
            if (f35890n == null) {
                f35890n = new TextPaint(1);
            }
            f35890n.setColor(-1);
            f35890n.setTextSize(org.telegram.ui.ActionBar.j6.f28846d3.getTextSize() * 0.75f);
            f35890n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f35890n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f35895f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f35892b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f35894e = this.f35892b.getLineLeft(0);
                    this.f35893c = this.f35892b.getLineWidth(0);
                    this.d = this.f35892b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f35892b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f35896g == 0) {
            int i7 = org.telegram.ui.ActionBar.j6.Ai;
            org.telegram.ui.ActionBar.e6 e6Var = this.f35898j;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
            Paint paint = f35887k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bi, e6Var));
            RectF rectF = this.f35891a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f35897i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f35892b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f35893c, 2.0f, bounds.left) - this.f35894e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f35892b.draw(canvas);
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
        f35887k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
