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
    public static final Paint f27215j = new Paint();
    public static TextPaint f27216k;
    public static TextPaint f27217l;
    public static TextPaint f27218m;
    public StaticLayout f27220b;
    public float f27221c;
    public float d;
    public float e;
    public final int f27223g;
    public final TextPaint h;
    public final RectF f27219a = new RectF();
    public final StringBuilder f27222f = new StringBuilder(5);
    public float f27224i = 1.0f;

    public n80(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f27223g = i10;
        if (i10 == 0) {
            if (f27216k == null) {
                f27216k = new TextPaint(1);
            }
            f27216k.setTextSize(AndroidUtilities.dp(28.0f));
            f27215j.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jh, f6Var));
            f27216k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Kh, f6Var));
            this.h = f27216k;
        } else if (i10 == 1) {
            if (f27217l == null) {
                f27217l = new TextPaint(1);
            }
            f27217l.setColor(-1);
            f27217l.setTextSize(AndroidUtilities.dp(13.0f));
            f27217l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f27217l;
        } else {
            if (f27218m == null) {
                f27218m = new TextPaint(1);
            }
            f27218m.setColor(-1);
            f27218m.setTextSize(org.telegram.ui.ActionBar.j6.f19903d3.getTextSize() * 0.75f);
            f27218m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f27218m;
        }
    }

    public final void a(String str) {
        StringBuilder sb = this.f27222f;
        sb.setLength(0);
        if (str != null && str.length() > 0) {
            sb.append(str.substring(0, 1));
        }
        if (sb.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f27220b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f27220b.getLineLeft(0);
                    this.f27221c = this.f27220b.getLineWidth(0);
                    this.d = this.f27220b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f27220b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f27223g == 0) {
            RectF rectF = this.f27219a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f27215j);
        }
        canvas.save();
        float f10 = this.f27224i;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, bounds.centerX(), bounds.centerY());
        }
        if (this.f27220b != null) {
            float width = bounds.width();
            canvas.translate(e2.c.x(width, this.f27221c, 2.0f, bounds.left) - this.e, e2.c.x(width, this.d, 2.0f, bounds.top));
            this.f27220b.draw(canvas);
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
        f27215j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
