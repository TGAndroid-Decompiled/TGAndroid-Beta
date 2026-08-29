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
public final class h80 extends Drawable {
    public static final Paint f29125j = new Paint();
    public static TextPaint f29126k;
    public static TextPaint f29127l;
    public static TextPaint f29128m;
    public StaticLayout f29130b;
    public float f29131c;
    public float d;
    public float f29132e;
    public final int f29134g;
    public final TextPaint h;
    public final RectF f29129a = new RectF();
    public final StringBuilder f29133f = new StringBuilder(5);
    public float f29135i = 1.0f;

    public h80(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f29134g = i10;
        if (i10 == 0) {
            if (f29126k == null) {
                f29126k = new TextPaint(1);
            }
            f29126k.setTextSize(AndroidUtilities.dp(28.0f));
            f29125j.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Jh, c6Var));
            f29126k.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Kh, c6Var));
            this.h = f29126k;
        } else if (i10 == 1) {
            if (f29127l == null) {
                f29127l = new TextPaint(1);
            }
            f29127l.setColor(-1);
            f29127l.setTextSize(AndroidUtilities.dp(13.0f));
            f29127l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29127l;
        } else {
            if (f29128m == null) {
                f29128m = new TextPaint(1);
            }
            f29128m.setColor(-1);
            f29128m.setTextSize(org.telegram.ui.ActionBar.g6.f23059d3.getTextSize() * 0.75f);
            f29128m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29128m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f29133f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29130b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f29132e = this.f29130b.getLineLeft(0);
                    this.f29131c = this.f29130b.getLineWidth(0);
                    this.d = this.f29130b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        this.f29130b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f29134g == 0) {
            RectF rectF = this.f29129a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f29125j);
        }
        canvas.save();
        float f9 = this.f29135i;
        if (f9 != 1.0f) {
            canvas.scale(f9, f9, bounds.centerX(), bounds.centerY());
        }
        if (this.f29130b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.recaptcha.internal.a.A(width, this.f29131c, 2.0f, bounds.left) - this.f29132e, com.google.android.recaptcha.internal.a.A(width, this.d, 2.0f, bounds.top));
            this.f29130b.draw(canvas);
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
        f29125j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
