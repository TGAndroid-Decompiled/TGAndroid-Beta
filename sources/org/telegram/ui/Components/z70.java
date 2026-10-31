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
public final class z70 extends Drawable {
    public static final Paint f32954k = new Paint();
    public static TextPaint f32955l;
    public static TextPaint f32956m;
    public static TextPaint f32957n;
    public StaticLayout f32959b;
    public float f32960c;
    public float d;
    public float e;
    public final int f32962g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.p6 f32964j;
    public final RectF f32958a = new RectF();
    public final StringBuilder f32961f = new StringBuilder(5);
    public float f32963i = 1.0f;

    public z70(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f32962g = i10;
        this.f32964j = p6Var;
        if (i10 == 0) {
            if (f32955l == null) {
                f32955l = new TextPaint(1);
            }
            f32955l.setTextSize(org.telegram.messenger.i0.L(28.0f));
            f32954k.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.xi, p6Var));
            f32955l.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.yi, p6Var));
            this.h = f32955l;
        } else if (i10 == 1) {
            if (f32956m == null) {
                f32956m = new TextPaint(1);
            }
            f32956m.setColor(-1);
            f32956m.setTextSize(org.telegram.messenger.i0.L(13.0f));
            f32956m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f32956m;
        } else {
            if (f32957n == null) {
                f32957n = new TextPaint(1);
            }
            f32957n.setColor(-1);
            f32957n.setTextSize(org.telegram.ui.ActionBar.t6.f20926d3.getTextSize() * 0.75f);
            f32957n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f32957n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f32961f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.i0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f32959b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f32959b.getLineLeft(0);
                    this.f32960c = this.f32959b.getLineWidth(0);
                    this.d = this.f32959b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        this.f32959b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f32962g == 0) {
            int i10 = org.telegram.ui.ActionBar.t6.xi;
            org.telegram.ui.ActionBar.p6 p6Var = this.f32964j;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            Paint paint = f32954k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.yi, p6Var));
            RectF rectF = this.f32958a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        }
        canvas.save();
        float f7 = this.f32963i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f32959b != null) {
            float width = bounds.width();
            canvas.translate(c3.i0.B(width, this.f32960c, 2.0f, bounds.left) - this.e, c3.i0.B(width, this.d, 2.0f, bounds.top));
            this.f32959b.draw(canvas);
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
    public final void setAlpha(int i10) {
        this.h.setAlpha(i10);
        f32954k.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
