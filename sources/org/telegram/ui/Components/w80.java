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
public final class w80 extends Drawable {
    public static final Paint f29922j = new Paint();
    public static TextPaint f29923k;
    public static TextPaint f29924l;
    public static TextPaint f29925m;
    public StaticLayout f29927b;
    public float f29928c;
    public float d;
    public float e;
    public final int f29930g;
    public final TextPaint h;
    public final RectF f29926a = new RectF();
    public final StringBuilder f29929f = new StringBuilder(5);
    public float f29931i = 1.0f;

    public w80(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f29930g = i10;
        if (i10 == 0) {
            if (f29923k == null) {
                f29923k = new TextPaint(1);
            }
            f29923k.setTextSize(AndroidUtilities.dp(28.0f));
            f29922j.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Jh, d6Var));
            f29923k.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Kh, d6Var));
            this.h = f29923k;
        } else if (i10 == 1) {
            if (f29924l == null) {
                f29924l = new TextPaint(1);
            }
            f29924l.setColor(-1);
            f29924l.setTextSize(AndroidUtilities.dp(13.0f));
            f29924l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29924l;
        } else {
            if (f29925m == null) {
                f29925m = new TextPaint(1);
            }
            f29925m.setColor(-1);
            f29925m.setTextSize(org.telegram.ui.ActionBar.h6.f19056d3.getTextSize() * 0.75f);
            f29925m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29925m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f29929f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29927b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f29927b.getLineLeft(0);
                    this.f29928c = this.f29927b.getLineWidth(0);
                    this.d = this.f29927b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f29927b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f29930g == 0) {
            RectF rectF = this.f29926a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f29922j);
        }
        canvas.save();
        float f7 = this.f29931i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f29927b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f29928c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f29927b.draw(canvas);
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
        f29922j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
