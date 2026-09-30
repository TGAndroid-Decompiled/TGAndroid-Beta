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
public final class y80 extends Drawable {
    public static final Paint f30602j = new Paint();
    public static TextPaint f30603k;
    public static TextPaint f30604l;
    public static TextPaint f30605m;
    public StaticLayout f30607b;
    public float f30608c;
    public float d;
    public float e;
    public final int f30610g;
    public final TextPaint h;
    public final RectF f30606a = new RectF();
    public final StringBuilder f30609f = new StringBuilder(5);
    public float f30611i = 1.0f;

    public y80(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f30610g = i10;
        if (i10 == 0) {
            if (f30603k == null) {
                f30603k = new TextPaint(1);
            }
            f30603k.setTextSize(AndroidUtilities.dp(28.0f));
            f30602j.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Jh, d6Var));
            f30603k.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Kh, d6Var));
            this.h = f30603k;
        } else if (i10 == 1) {
            if (f30604l == null) {
                f30604l = new TextPaint(1);
            }
            f30604l.setColor(-1);
            f30604l.setTextSize(AndroidUtilities.dp(13.0f));
            f30604l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30604l;
        } else {
            if (f30605m == null) {
                f30605m = new TextPaint(1);
            }
            f30605m.setColor(-1);
            f30605m.setTextSize(org.telegram.ui.ActionBar.h6.f19058d3.getTextSize() * 0.75f);
            f30605m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30605m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f30609f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f30607b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f30607b.getLineLeft(0);
                    this.f30608c = this.f30607b.getLineWidth(0);
                    this.d = this.f30607b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f30607b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f30610g == 0) {
            RectF rectF = this.f30606a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f30602j);
        }
        canvas.save();
        float f7 = this.f30611i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f30607b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f30608c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f30607b.draw(canvas);
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
        f30602j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
