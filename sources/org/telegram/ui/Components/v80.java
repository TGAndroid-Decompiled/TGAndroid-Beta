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
public final class v80 extends Drawable {
    public static final Paint f27875j = new Paint();
    public static TextPaint f27876k;
    public static TextPaint f27877l;
    public static TextPaint f27878m;
    public StaticLayout f27880b;
    public float f27881c;
    public float d;
    public float e;
    public final int f27883g;
    public final TextPaint h;
    public final RectF f27879a = new RectF();
    public final StringBuilder f27882f = new StringBuilder(5);
    public float f27884i = 1.0f;

    public v80(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f27883g = i10;
        if (i10 == 0) {
            if (f27876k == null) {
                f27876k = new TextPaint(1);
            }
            f27876k.setTextSize(AndroidUtilities.dp(28.0f));
            f27875j.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jh, f6Var));
            f27876k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Kh, f6Var));
            this.h = f27876k;
        } else if (i10 == 1) {
            if (f27877l == null) {
                f27877l = new TextPaint(1);
            }
            f27877l.setColor(-1);
            f27877l.setTextSize(AndroidUtilities.dp(13.0f));
            f27877l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f27877l;
        } else {
            if (f27878m == null) {
                f27878m = new TextPaint(1);
            }
            f27878m.setColor(-1);
            f27878m.setTextSize(org.telegram.ui.ActionBar.j6.f17925d3.getTextSize() * 0.75f);
            f27878m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f27878m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f27882f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f27880b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f27880b.getLineLeft(0);
                    this.f27881c = this.f27880b.getLineWidth(0);
                    this.d = this.f27880b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f27880b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f27883g == 0) {
            RectF rectF = this.f27879a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f27875j);
        }
        canvas.save();
        float f7 = this.f27884i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f27880b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f27881c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f27880b.draw(canvas);
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
        f27875j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
