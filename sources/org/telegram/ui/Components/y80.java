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
    public static final Paint f30603j = new Paint();
    public static TextPaint f30604k;
    public static TextPaint f30605l;
    public static TextPaint f30606m;
    public StaticLayout f30608b;
    public float f30609c;
    public float d;
    public float e;
    public final int f30611g;
    public final TextPaint h;
    public final RectF f30607a = new RectF();
    public final StringBuilder f30610f = new StringBuilder(5);
    public float f30612i = 1.0f;

    public y80(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f30611g = i10;
        if (i10 == 0) {
            if (f30604k == null) {
                f30604k = new TextPaint(1);
            }
            f30604k.setTextSize(AndroidUtilities.dp(28.0f));
            f30603j.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Jh, d6Var));
            f30604k.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Kh, d6Var));
            this.h = f30604k;
        } else if (i10 == 1) {
            if (f30605l == null) {
                f30605l = new TextPaint(1);
            }
            f30605l.setColor(-1);
            f30605l.setTextSize(AndroidUtilities.dp(13.0f));
            f30605l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30605l;
        } else {
            if (f30606m == null) {
                f30606m = new TextPaint(1);
            }
            f30606m.setColor(-1);
            f30606m.setTextSize(org.telegram.ui.ActionBar.h6.f19056d3.getTextSize() * 0.75f);
            f30606m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30606m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f30610f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f30608b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f30608b.getLineLeft(0);
                    this.f30609c = this.f30608b.getLineWidth(0);
                    this.d = this.f30608b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f30608b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f30611g == 0) {
            RectF rectF = this.f30607a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f30603j);
        }
        canvas.save();
        float f7 = this.f30612i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f30608b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f30609c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f30608b.draw(canvas);
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
        f30603j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
