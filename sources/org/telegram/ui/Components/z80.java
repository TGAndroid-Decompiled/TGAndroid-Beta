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
public final class z80 extends Drawable {
    public static final Paint f33410j = new Paint();
    public static TextPaint f33411k;
    public static TextPaint f33412l;
    public static TextPaint f33413m;
    public StaticLayout f33415b;
    public float f33416c;
    public float d;
    public float f33417e;
    public final int f33419g;
    public final TextPaint h;
    public final RectF f33414a = new RectF();
    public final StringBuilder f33418f = new StringBuilder(5);
    public float f33420i = 1.0f;

    public z80(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f33419g = i10;
        if (i10 == 0) {
            if (f33411k == null) {
                f33411k = new TextPaint(1);
            }
            f33411k.setTextSize(AndroidUtilities.dp(28.0f));
            f33410j.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Jh, d6Var));
            f33411k.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Kh, d6Var));
            this.h = f33411k;
        } else if (i10 == 1) {
            if (f33412l == null) {
                f33412l = new TextPaint(1);
            }
            f33412l.setColor(-1);
            f33412l.setTextSize(AndroidUtilities.dp(13.0f));
            f33412l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33412l;
        } else {
            if (f33413m == null) {
                f33413m = new TextPaint(1);
            }
            f33413m.setColor(-1);
            f33413m.setTextSize(org.telegram.ui.ActionBar.i6.f20814d3.getTextSize() * 0.75f);
            f33413m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33413m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f33418f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f33415b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f33417e = this.f33415b.getLineLeft(0);
                    this.f33416c = this.f33415b.getLineWidth(0);
                    this.d = this.f33415b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        this.f33415b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f33419g == 0) {
            RectF rectF = this.f33414a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f33410j);
        }
        canvas.save();
        float f7 = this.f33420i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f33415b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f33416c, 2.0f, bounds.left) - this.f33417e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f33415b.draw(canvas);
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
        f33410j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
