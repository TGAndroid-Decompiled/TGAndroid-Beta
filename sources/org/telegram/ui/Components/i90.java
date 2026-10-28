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
public final class i90 extends Drawable {
    public static final Paint f29254k = new Paint();
    public static TextPaint f29255l;
    public static TextPaint f29256m;
    public static TextPaint f29257n;
    public StaticLayout f29259b;
    public float f29260c;
    public float d;
    public float e;
    public final int f29262g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.u6 f29264j;
    public final RectF f29258a = new RectF();
    public final StringBuilder f29261f = new StringBuilder(5);
    public float f29263i = 1.0f;

    public i90(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f29262g = i10;
        this.f29264j = u6Var;
        if (i10 == 0) {
            if (f29255l == null) {
                f29255l = new TextPaint(1);
            }
            f29255l.setTextSize(AndroidUtilities.dp(28.0f));
            f29254k.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Jh, u6Var));
            f29255l.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Kh, u6Var));
            this.h = f29255l;
        } else if (i10 == 1) {
            if (f29256m == null) {
                f29256m = new TextPaint(1);
            }
            f29256m.setColor(-1);
            f29256m.setTextSize(AndroidUtilities.dp(13.0f));
            f29256m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29256m;
        } else {
            if (f29257n == null) {
                f29257n = new TextPaint(1);
            }
            f29257n.setColor(-1);
            f29257n.setTextSize(org.telegram.ui.ActionBar.y6.f23354d3.getTextSize() * 0.75f);
            f29257n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29257n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f29261f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29259b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f29259b.getLineLeft(0);
                    this.f29260c = this.f29259b.getLineWidth(0);
                    this.d = this.f29259b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f29259b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f29262g == 0) {
            int i10 = org.telegram.ui.ActionBar.y6.Jh;
            org.telegram.ui.ActionBar.u6 u6Var = this.f29264j;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            Paint paint = f29254k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Kh, u6Var));
            RectF rectF = this.f29258a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        }
        canvas.save();
        float f7 = this.f29263i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f29259b != null) {
            float width = bounds.width();
            canvas.translate(c3.h0.B(width, this.f29260c, 2.0f, bounds.left) - this.e, c3.h0.B(width, this.d, 2.0f, bounds.top));
            this.f29259b.draw(canvas);
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
        f29254k.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
