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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u70 extends Drawable {
    public static final Paint f32937j = new Paint();
    public static TextPaint f32938k;
    public static TextPaint f32939l;
    public static TextPaint f32940m;
    public StaticLayout f32942b;
    public float f32943c;
    public float d;
    public float f32944e;
    public final int f32946g;
    public final TextPaint h;
    public final RectF f32941a = new RectF();
    public final StringBuilder f32945f = new StringBuilder(5);
    public float f32947i = 1.0f;

    public u70(int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f32946g = i9;
        if (i9 == 0) {
            if (f32938k == null) {
                f32938k = new TextPaint(1);
            }
            f32938k.setTextSize(AndroidUtilities.dp(28.0f));
            f32937j.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Jh, b6Var));
            f32938k.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Kh, b6Var));
            this.h = f32938k;
        } else if (i9 == 1) {
            if (f32939l == null) {
                f32939l = new TextPaint(1);
            }
            f32939l.setColor(-1);
            f32939l.setTextSize(AndroidUtilities.dp(13.0f));
            f32939l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f32939l;
        } else {
            if (f32940m == null) {
                f32940m = new TextPaint(1);
            }
            f32940m.setColor(-1);
            f32940m.setTextSize(org.telegram.ui.ActionBar.f6.f22998d3.getTextSize() * 0.75f);
            f32940m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f32940m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f32945f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f32942b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f32944e = this.f32942b.getLineLeft(0);
                    this.f32943c = this.f32942b.getLineWidth(0);
                    this.d = this.f32942b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        this.f32942b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f32946g == 0) {
            RectF rectF = this.f32941a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f32937j);
        }
        canvas.save();
        float f10 = this.f32947i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f32942b != null) {
            float width = bounds.width();
            canvas.translate(e2.c.A(width, this.f32943c, 2.0f, bounds.left) - this.f32944e, e2.c.A(width, this.d, 2.0f, bounds.top));
            this.f32942b.draw(canvas);
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
    public final void setAlpha(int i9) {
        this.h.setAlpha(i9);
        f32937j.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
