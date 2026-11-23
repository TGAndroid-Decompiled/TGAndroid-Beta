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
    public static final Paint f41652k = new Paint();
    public static TextPaint f41653l;
    public static TextPaint f41654m;
    public static TextPaint f41655n;
    public StaticLayout f41657b;
    public float f41658c;
    public float d;
    public float f41659e;
    public final int f41661g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.h6 f41663j;
    public final RectF f41656a = new RectF();
    public final StringBuilder f41660f = new StringBuilder(5);
    public float f41662i = 1.0f;

    public w70(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f41661g = i7;
        this.f41663j = h6Var;
        if (i7 == 0) {
            if (f41653l == null) {
                f41653l = new TextPaint(1);
            }
            f41653l.setTextSize(org.telegram.messenger.g0.L(28.0f));
            f41652k.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ai, h6Var));
            f41653l.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bi, h6Var));
            this.h = f41653l;
        } else if (i7 == 1) {
            if (f41654m == null) {
                f41654m = new TextPaint(1);
            }
            f41654m.setColor(-1);
            f41654m.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f41654m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f41654m;
        } else {
            if (f41655n == null) {
                f41655n = new TextPaint(1);
            }
            f41655n.setColor(-1);
            f41655n.setTextSize(org.telegram.ui.ActionBar.m6.f29344d3.getTextSize() * 0.75f);
            f41655n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f41655n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f41660f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f41657b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f41659e = this.f41657b.getLineLeft(0);
                    this.f41658c = this.f41657b.getLineWidth(0);
                    this.d = this.f41657b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.f41657b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f41661g == 0) {
            int i7 = org.telegram.ui.ActionBar.m6.Ai;
            org.telegram.ui.ActionBar.h6 h6Var = this.f41663j;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            Paint paint = f41652k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bi, h6Var));
            RectF rectF = this.f41656a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        }
        canvas.save();
        float f10 = this.f41662i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f41657b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f41658c, 2.0f, bounds.left) - this.f41659e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f41657b.draw(canvas);
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
        f41652k.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
