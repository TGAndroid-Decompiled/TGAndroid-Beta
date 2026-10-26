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
public final class h90 extends Drawable {
    public static final Paint f28869k = new Paint();
    public static TextPaint f28870l;
    public static TextPaint f28871m;
    public static TextPaint f28872n;
    public StaticLayout f28874b;
    public float f28875c;
    public float d;
    public float e;
    public final int f28877g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.u6 f28879j;
    public final RectF f28873a = new RectF();
    public final StringBuilder f28876f = new StringBuilder(5);
    public float f28878i = 1.0f;

    public h90(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f28877g = i10;
        this.f28879j = u6Var;
        if (i10 == 0) {
            if (f28870l == null) {
                f28870l = new TextPaint(1);
            }
            f28870l.setTextSize(AndroidUtilities.dp(28.0f));
            f28869k.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Jh, u6Var));
            f28870l.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Kh, u6Var));
            this.h = f28870l;
        } else if (i10 == 1) {
            if (f28871m == null) {
                f28871m = new TextPaint(1);
            }
            f28871m.setColor(-1);
            f28871m.setTextSize(AndroidUtilities.dp(13.0f));
            f28871m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f28871m;
        } else {
            if (f28872n == null) {
                f28872n = new TextPaint(1);
            }
            f28872n.setColor(-1);
            f28872n.setTextSize(org.telegram.ui.ActionBar.y6.f23353d3.getTextSize() * 0.75f);
            f28872n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f28872n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f28876f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f28874b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f28874b.getLineLeft(0);
                    this.f28875c = this.f28874b.getLineWidth(0);
                    this.d = this.f28874b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f28874b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f28877g == 0) {
            int i10 = org.telegram.ui.ActionBar.y6.Jh;
            org.telegram.ui.ActionBar.u6 u6Var = this.f28879j;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            Paint paint = f28869k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Kh, u6Var));
            RectF rectF = this.f28873a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        }
        canvas.save();
        float f7 = this.f28878i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f28874b != null) {
            float width = bounds.width();
            canvas.translate(c3.h0.B(width, this.f28875c, 2.0f, bounds.left) - this.e, c3.h0.B(width, this.d, 2.0f, bounds.top));
            this.f28874b.draw(canvas);
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
        f28869k.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
