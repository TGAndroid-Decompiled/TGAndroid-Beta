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
public final class n80 extends Drawable {
    public static final Paint f27220j = new Paint();
    public static TextPaint f27221k;
    public static TextPaint f27222l;
    public static TextPaint f27223m;
    public StaticLayout f27225b;
    public float f27226c;
    public float d;
    public float e;
    public final int f27228g;
    public final TextPaint h;
    public final RectF f27224a = new RectF();
    public final StringBuilder f27227f = new StringBuilder(5);
    public float f27229i = 1.0f;

    public n80(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f27228g = i10;
        if (i10 == 0) {
            if (f27221k == null) {
                f27221k = new TextPaint(1);
            }
            f27221k.setTextSize(AndroidUtilities.dp(28.0f));
            f27220j.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jh, f6Var));
            f27221k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Kh, f6Var));
            this.h = f27221k;
        } else if (i10 == 1) {
            if (f27222l == null) {
                f27222l = new TextPaint(1);
            }
            f27222l.setColor(-1);
            f27222l.setTextSize(AndroidUtilities.dp(13.0f));
            f27222l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f27222l;
        } else {
            if (f27223m == null) {
                f27223m = new TextPaint(1);
            }
            f27223m.setColor(-1);
            f27223m.setTextSize(org.telegram.ui.ActionBar.j6.f19878d3.getTextSize() * 0.75f);
            f27223m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f27223m;
        }
    }

    public final void a(String str) {
        StringBuilder sb = this.f27227f;
        sb.setLength(0);
        if (str != null && str.length() > 0) {
            sb.append(str.substring(0, 1));
        }
        if (sb.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f27225b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f27225b.getLineLeft(0);
                    this.f27226c = this.f27225b.getLineWidth(0);
                    this.d = this.f27225b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f27225b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f27228g == 0) {
            RectF rectF = this.f27224a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f27220j);
        }
        canvas.save();
        float f10 = this.f27229i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f27225b != null) {
            float width = bounds.width();
            canvas.translate(e2.c.x(width, this.f27226c, 2.0f, bounds.left) - this.e, e2.c.x(width, this.d, 2.0f, bounds.top));
            this.f27225b.draw(canvas);
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
        f27220j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
