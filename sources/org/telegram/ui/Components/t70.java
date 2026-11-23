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
public final class t70 extends Drawable {
    public static final Paint f39840k = new Paint();
    public static TextPaint f39841l;
    public static TextPaint f39842m;
    public static TextPaint f39843n;
    public StaticLayout f39845b;
    public float f39846c;
    public float d;
    public float f39847e;
    public final int f39849g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.i6 f39851j;
    public final RectF f39844a = new RectF();
    public final StringBuilder f39848f = new StringBuilder(5);
    public float f39850i = 1.0f;

    public t70(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f39849g = i7;
        this.f39851j = i6Var;
        if (i7 == 0) {
            if (f39841l == null) {
                f39841l = new TextPaint(1);
            }
            f39841l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f39840k.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ai, i6Var));
            f39841l.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bi, i6Var));
            this.h = f39841l;
        } else if (i7 == 1) {
            if (f39842m == null) {
                f39842m = new TextPaint(1);
            }
            f39842m.setColor(-1);
            f39842m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f39842m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f39842m;
        } else {
            if (f39843n == null) {
                f39843n = new TextPaint(1);
            }
            f39843n.setColor(-1);
            f39843n.setTextSize(org.telegram.ui.ActionBar.n6.f29448d3.getTextSize() * 0.75f);
            f39843n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f39843n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f39848f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f39845b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f39847e = this.f39845b.getLineLeft(0);
                    this.f39846c = this.f39845b.getLineWidth(0);
                    this.d = this.f39845b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f39845b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f39849g == 0) {
            int i7 = org.telegram.ui.ActionBar.n6.Ai;
            org.telegram.ui.ActionBar.i6 i6Var = this.f39851j;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
            Paint paint = f39840k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bi, i6Var));
            RectF rectF = this.f39844a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f39850i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f39845b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f39846c, 2.0f, bounds.left) - this.f39847e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f39845b.draw(canvas);
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
        f39840k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
