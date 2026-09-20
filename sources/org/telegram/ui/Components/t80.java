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
public final class t80 extends Drawable {
    public static final Paint f28338j = new Paint();
    public static TextPaint f28339k;
    public static TextPaint f28340l;
    public static TextPaint f28341m;
    public StaticLayout f28343b;
    public float f28344c;
    public float d;
    public float e;
    public final int f28346g;
    public final TextPaint h;
    public final RectF f28342a = new RectF();
    public final StringBuilder f28345f = new StringBuilder(5);
    public float f28347i = 1.0f;

    public t80(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28346g = i10;
        if (i10 == 0) {
            if (f28339k == null) {
                f28339k = new TextPaint(1);
            }
            f28339k.setTextSize(AndroidUtilities.dp(28.0f));
            f28338j.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jh, f6Var));
            f28339k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Kh, f6Var));
            this.h = f28339k;
        } else if (i10 == 1) {
            if (f28340l == null) {
                f28340l = new TextPaint(1);
            }
            f28340l.setColor(-1);
            f28340l.setTextSize(AndroidUtilities.dp(13.0f));
            f28340l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f28340l;
        } else {
            if (f28341m == null) {
                f28341m = new TextPaint(1);
            }
            f28341m.setColor(-1);
            f28341m.setTextSize(org.telegram.ui.ActionBar.j6.f19091d3.getTextSize() * 0.75f);
            f28341m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f28341m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f28345f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f28343b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f28343b.getLineLeft(0);
                    this.f28344c = this.f28343b.getLineWidth(0);
                    this.d = this.f28343b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f28343b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f28346g == 0) {
            RectF rectF = this.f28342a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f28338j);
        }
        canvas.save();
        float f7 = this.f28347i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f28343b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f28344c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f28343b.draw(canvas);
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
        f28338j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
