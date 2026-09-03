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
    public static final Paint f29698j = new Paint();
    public static TextPaint f29699k;
    public static TextPaint f29700l;
    public static TextPaint f29701m;
    public StaticLayout f29703b;
    public float f29704c;
    public float d;
    public float f29705e;
    public final int f29707g;
    public final TextPaint h;
    public final RectF f29702a = new RectF();
    public final StringBuilder f29706f = new StringBuilder(5);
    public float f29708i = 1.0f;

    public o80(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f29707g = i10;
        if (i10 == 0) {
            if (f29699k == null) {
                f29699k = new TextPaint(1);
            }
            f29699k.setTextSize(AndroidUtilities.dp(28.0f));
            f29698j.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Jh, g6Var));
            f29699k.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Kh, g6Var));
            this.h = f29699k;
        } else if (i10 == 1) {
            if (f29700l == null) {
                f29700l = new TextPaint(1);
            }
            f29700l.setColor(-1);
            f29700l.setTextSize(AndroidUtilities.dp(13.0f));
            f29700l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29700l;
        } else {
            if (f29701m == null) {
                f29701m = new TextPaint(1);
            }
            f29701m.setColor(-1);
            f29701m.setTextSize(org.telegram.ui.ActionBar.k6.f21658d3.getTextSize() * 0.75f);
            f29701m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29701m;
        }
    }

    public final void a(String str) {
        StringBuilder sb = this.f29706f;
        sb.setLength(0);
        if (str != null && str.length() > 0) {
            sb.append(str.substring(0, 1));
        }
        if (sb.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29703b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f29705e = this.f29703b.getLineLeft(0);
                    this.f29704c = this.f29703b.getLineWidth(0);
                    this.d = this.f29703b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e6) {
                FileLog.e(e6);
                return;
            }
        }
        this.f29703b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f29707g == 0) {
            RectF rectF = this.f29702a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f29698j);
        }
        canvas.save();
        float f10 = this.f29708i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f29703b != null) {
            float width = bounds.width();
            canvas.translate(e2.c.x(width, this.f29704c, 2.0f, bounds.left) - this.f29705e, e2.c.x(width, this.d, 2.0f, bounds.top));
            this.f29703b.draw(canvas);
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
        f29698j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
