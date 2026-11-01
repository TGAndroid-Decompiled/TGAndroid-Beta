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
    public static final Paint f33055k = new Paint();
    public static TextPaint f33056l;
    public static TextPaint f33057m;
    public static TextPaint f33058n;
    public StaticLayout f33060b;
    public float f33061c;
    public float d;
    public float e;
    public final int f33063g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.p6 f33065j;
    public final RectF f33059a = new RectF();
    public final StringBuilder f33062f = new StringBuilder(5);
    public float f33064i = 1.0f;

    public z70(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f33063g = i10;
        this.f33065j = p6Var;
        if (i10 == 0) {
            if (f33056l == null) {
                f33056l = new TextPaint(1);
            }
            f33056l.setTextSize(org.telegram.messenger.i0.L(28.0f));
            f33055k.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.xi, p6Var));
            f33056l.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.yi, p6Var));
            this.h = f33056l;
        } else if (i10 == 1) {
            if (f33057m == null) {
                f33057m = new TextPaint(1);
            }
            f33057m.setColor(-1);
            f33057m.setTextSize(org.telegram.messenger.i0.L(13.0f));
            f33057m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33057m;
        } else {
            if (f33058n == null) {
                f33058n = new TextPaint(1);
            }
            f33058n.setColor(-1);
            f33058n.setTextSize(org.telegram.ui.ActionBar.t6.f20927d3.getTextSize() * 0.75f);
            f33058n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33058n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f33062f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.i0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f33060b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f33060b.getLineLeft(0);
                    this.f33061c = this.f33060b.getLineWidth(0);
                    this.d = this.f33060b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        this.f33060b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f33063g == 0) {
            int i10 = org.telegram.ui.ActionBar.t6.xi;
            org.telegram.ui.ActionBar.p6 p6Var = this.f33065j;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            Paint paint = f33055k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.yi, p6Var));
            RectF rectF = this.f33059a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        }
        canvas.save();
        float f7 = this.f33064i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f33060b != null) {
            float width = bounds.width();
            canvas.translate(c3.i0.B(width, this.f33061c, 2.0f, bounds.left) - this.e, c3.i0.B(width, this.d, 2.0f, bounds.top));
            this.f33060b.draw(canvas);
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
        f33055k.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
