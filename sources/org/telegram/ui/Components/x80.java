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
public final class x80 extends Drawable {
    public static final Paint f30293j = new Paint();
    public static TextPaint f30294k;
    public static TextPaint f30295l;
    public static TextPaint f30296m;
    public StaticLayout f30298b;
    public float f30299c;
    public float d;
    public float e;
    public final int f30301g;
    public final TextPaint h;
    public final RectF f30297a = new RectF();
    public final StringBuilder f30300f = new StringBuilder(5);
    public float f30302i = 1.0f;

    public x80(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f30301g = i10;
        if (i10 == 0) {
            if (f30294k == null) {
                f30294k = new TextPaint(1);
            }
            f30294k.setTextSize(AndroidUtilities.dp(28.0f));
            f30293j.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Jh, d6Var));
            f30294k.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Kh, d6Var));
            this.h = f30294k;
        } else if (i10 == 1) {
            if (f30295l == null) {
                f30295l = new TextPaint(1);
            }
            f30295l.setColor(-1);
            f30295l.setTextSize(AndroidUtilities.dp(13.0f));
            f30295l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30295l;
        } else {
            if (f30296m == null) {
                f30296m = new TextPaint(1);
            }
            f30296m.setColor(-1);
            f30296m.setTextSize(org.telegram.ui.ActionBar.h6.f19056d3.getTextSize() * 0.75f);
            f30296m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30296m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f30300f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f30298b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f30298b.getLineLeft(0);
                    this.f30299c = this.f30298b.getLineWidth(0);
                    this.d = this.f30298b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f30298b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f30301g == 0) {
            RectF rectF = this.f30297a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f30293j);
        }
        canvas.save();
        float f7 = this.f30302i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f30298b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f30299c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f30298b.draw(canvas);
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
        f30293j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
