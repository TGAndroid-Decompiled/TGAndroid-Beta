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
public final class l80 extends Drawable {
    public static final Paint f25849j = new Paint();
    public static TextPaint f25850k;
    public static TextPaint f25851l;
    public static TextPaint f25852m;
    public StaticLayout f25854b;
    public float f25855c;
    public float d;
    public float e;
    public final int f25857g;
    public final TextPaint h;
    public final RectF f25853a = new RectF();
    public final StringBuilder f25856f = new StringBuilder(5);
    public float f25858i = 1.0f;

    public l80(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25857g = i10;
        if (i10 == 0) {
            if (f25850k == null) {
                f25850k = new TextPaint(1);
            }
            f25850k.setTextSize(AndroidUtilities.dp(28.0f));
            f25849j.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jh, f6Var));
            f25850k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Kh, f6Var));
            this.h = f25850k;
        } else if (i10 == 1) {
            if (f25851l == null) {
                f25851l = new TextPaint(1);
            }
            f25851l.setColor(-1);
            f25851l.setTextSize(AndroidUtilities.dp(13.0f));
            f25851l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f25851l;
        } else {
            if (f25852m == null) {
                f25852m = new TextPaint(1);
            }
            f25852m.setColor(-1);
            f25852m.setTextSize(org.telegram.ui.ActionBar.j6.f18859d3.getTextSize() * 0.75f);
            f25852m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f25852m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f25856f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f25854b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f25854b.getLineLeft(0);
                    this.f25855c = this.f25854b.getLineWidth(0);
                    this.d = this.f25854b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f25854b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f25857g == 0) {
            RectF rectF = this.f25853a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f25849j);
        }
        canvas.save();
        float f7 = this.f25858i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f25854b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f25855c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f25854b.draw(canvas);
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
        f25849j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
