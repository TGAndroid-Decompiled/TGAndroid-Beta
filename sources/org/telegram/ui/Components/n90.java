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
public final class n90 extends Drawable {
    public static final Paint f29123j = new Paint();
    public static TextPaint f29124k;
    public static TextPaint f29125l;
    public static TextPaint f29126m;
    public StaticLayout f29128b;
    public float f29129c;
    public float d;
    public float f29130e;
    public final int f29132g;
    public final TextPaint h;
    public final RectF f29127a = new RectF();
    public final StringBuilder f29131f = new StringBuilder(5);
    public float f29133i = 1.0f;

    public n90(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f29132g = i10;
        if (i10 == 0) {
            if (f29124k == null) {
                f29124k = new TextPaint(1);
            }
            f29124k.setTextSize(AndroidUtilities.dp(28.0f));
            f29123j.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Jh, d6Var));
            f29124k.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Kh, d6Var));
            this.h = f29124k;
        } else if (i10 == 1) {
            if (f29125l == null) {
                f29125l = new TextPaint(1);
            }
            f29125l.setColor(-1);
            f29125l.setTextSize(AndroidUtilities.dp(13.0f));
            f29125l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29125l;
        } else {
            if (f29126m == null) {
                f29126m = new TextPaint(1);
            }
            f29126m.setColor(-1);
            f29126m.setTextSize(org.telegram.ui.ActionBar.h6.f20819d3.getTextSize() * 0.75f);
            f29126m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29126m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f29131f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29128b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f29130e = this.f29128b.getLineLeft(0);
                    this.f29129c = this.f29128b.getLineWidth(0);
                    this.d = this.f29128b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        this.f29128b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f29132g == 0) {
            RectF rectF = this.f29127a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f29123j);
        }
        canvas.save();
        float f7 = this.f29133i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f29128b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.z(width, this.f29129c, 2.0f, bounds.left) - this.f29130e, com.google.android.gms.internal.vision.e2.z(width, this.d, 2.0f, bounds.top));
            this.f29128b.draw(canvas);
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
        f29123j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
