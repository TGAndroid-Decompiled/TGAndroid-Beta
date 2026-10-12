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
public final class m90 extends Drawable {
    public static final Paint f27328j = new Paint();
    public static TextPaint f27329k;
    public static TextPaint f27330l;
    public static TextPaint f27331m;
    public StaticLayout f27333b;
    public float f27334c;
    public float d;
    public float e;
    public final int f27336g;
    public final TextPaint h;
    public final RectF f27332a = new RectF();
    public final StringBuilder f27335f = new StringBuilder(5);
    public float f27337i = 1.0f;

    public m90(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f27336g = i10;
        if (i10 == 0) {
            if (f27329k == null) {
                f27329k = new TextPaint(1);
            }
            f27329k.setTextSize(AndroidUtilities.dp(28.0f));
            f27328j.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Jh, c6Var));
            f27329k.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Kh, c6Var));
            this.h = f27329k;
        } else if (i10 == 1) {
            if (f27330l == null) {
                f27330l = new TextPaint(1);
            }
            f27330l.setColor(-1);
            f27330l.setTextSize(AndroidUtilities.dp(13.0f));
            f27330l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f27330l;
        } else {
            if (f27331m == null) {
                f27331m = new TextPaint(1);
            }
            f27331m.setColor(-1);
            f27331m.setTextSize(org.telegram.ui.ActionBar.g6.f19898d3.getTextSize() * 0.75f);
            f27331m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f27331m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f27335f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f27333b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f27333b.getLineLeft(0);
                    this.f27334c = this.f27333b.getLineWidth(0);
                    this.d = this.f27333b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f27333b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f27336g == 0) {
            RectF rectF = this.f27332a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f27328j);
        }
        canvas.save();
        float f7 = this.f27337i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f27333b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.play_billing.k3.z(width, this.f27334c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.play_billing.k3.z(width, this.d, 2.0f, bounds.top));
            this.f27333b.draw(canvas);
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
        f27328j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
