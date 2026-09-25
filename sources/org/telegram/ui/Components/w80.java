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
    public static final Paint f29923j = new Paint();
    public static TextPaint f29924k;
    public static TextPaint f29925l;
    public static TextPaint f29926m;
    public StaticLayout f29928b;
    public float f29929c;
    public float d;
    public float e;
    public final int f29931g;
    public final TextPaint h;
    public final RectF f29927a = new RectF();
    public final StringBuilder f29930f = new StringBuilder(5);
    public float f29932i = 1.0f;

    public w80(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f29931g = i10;
        if (i10 == 0) {
            if (f29924k == null) {
                f29924k = new TextPaint(1);
            }
            f29924k.setTextSize(AndroidUtilities.dp(28.0f));
            f29923j.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Jh, d6Var));
            f29924k.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Kh, d6Var));
            this.h = f29924k;
        } else if (i10 == 1) {
            if (f29925l == null) {
                f29925l = new TextPaint(1);
            }
            f29925l.setColor(-1);
            f29925l.setTextSize(AndroidUtilities.dp(13.0f));
            f29925l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29925l;
        } else {
            if (f29926m == null) {
                f29926m = new TextPaint(1);
            }
            f29926m.setColor(-1);
            f29926m.setTextSize(org.telegram.ui.ActionBar.h6.f19057d3.getTextSize() * 0.75f);
            f29926m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29926m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f29930f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29928b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f29928b.getLineLeft(0);
                    this.f29929c = this.f29928b.getLineWidth(0);
                    this.d = this.f29928b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f29928b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f29931g == 0) {
            RectF rectF = this.f29927a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f29923j);
        }
        canvas.save();
        float f7 = this.f29932i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f29928b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f29929c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f29928b.draw(canvas);
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
        f29923j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
