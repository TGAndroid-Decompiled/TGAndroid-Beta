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
public final class o80 extends Drawable {
    public static final Paint f29703j = new Paint();
    public static TextPaint f29704k;
    public static TextPaint f29705l;
    public static TextPaint f29706m;
    public StaticLayout f29708b;
    public float f29709c;
    public float d;
    public float f29710e;
    public final int f29712g;
    public final TextPaint h;
    public final RectF f29707a = new RectF();
    public final StringBuilder f29711f = new StringBuilder(5);
    public float f29713i = 1.0f;

    public o80(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f29712g = i10;
        if (i10 == 0) {
            if (f29704k == null) {
                f29704k = new TextPaint(1);
            }
            f29704k.setTextSize(AndroidUtilities.dp(28.0f));
            f29703j.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Jh, g6Var));
            f29704k.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Kh, g6Var));
            this.h = f29704k;
        } else if (i10 == 1) {
            if (f29705l == null) {
                f29705l = new TextPaint(1);
            }
            f29705l.setColor(-1);
            f29705l.setTextSize(AndroidUtilities.dp(13.0f));
            f29705l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29705l;
        } else {
            if (f29706m == null) {
                f29706m = new TextPaint(1);
            }
            f29706m.setColor(-1);
            f29706m.setTextSize(org.telegram.ui.ActionBar.k6.f21656d3.getTextSize() * 0.75f);
            f29706m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29706m;
        }
    }

    public final void a(String str) {
        StringBuilder sb = this.f29711f;
        sb.setLength(0);
        if (str != null && str.length() > 0) {
            sb.append(str.substring(0, 1));
        }
        if (sb.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29708b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f29710e = this.f29708b.getLineLeft(0);
                    this.f29709c = this.f29708b.getLineWidth(0);
                    this.d = this.f29708b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e6) {
                FileLog.e(e6);
                return;
            }
        }
        this.f29708b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f29712g == 0) {
            RectF rectF = this.f29707a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f29703j);
        }
        canvas.save();
        float f10 = this.f29713i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f29708b != null) {
            float width = bounds.width();
            canvas.translate(e2.c.x(width, this.f29709c, 2.0f, bounds.left) - this.f29710e, e2.c.x(width, this.d, 2.0f, bounds.top));
            this.f29708b.draw(canvas);
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
        f29703j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
