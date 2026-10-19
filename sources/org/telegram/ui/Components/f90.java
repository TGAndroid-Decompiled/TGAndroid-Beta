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
public final class f90 extends Drawable {
    public static final Paint f26158j = new Paint();
    public static TextPaint f26159k;
    public static TextPaint f26160l;
    public static TextPaint f26161m;
    public StaticLayout f26163b;
    public float f26164c;
    public float d;
    public float e;
    public final int f26166g;
    public final TextPaint h;
    public final RectF f26162a = new RectF();
    public final StringBuilder f26165f = new StringBuilder(5);
    public float f26167i = 1.0f;

    public f90(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f26166g = i10;
        if (i10 == 0) {
            if (f26159k == null) {
                f26159k = new TextPaint(1);
            }
            f26159k.setTextSize(AndroidUtilities.dp(28.0f));
            f26158j.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Jh, d6Var));
            f26159k.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Kh, d6Var));
            this.h = f26159k;
        } else if (i10 == 1) {
            if (f26160l == null) {
                f26160l = new TextPaint(1);
            }
            f26160l.setColor(-1);
            f26160l.setTextSize(AndroidUtilities.dp(13.0f));
            f26160l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f26160l;
        } else {
            if (f26161m == null) {
                f26161m = new TextPaint(1);
            }
            f26161m.setColor(-1);
            f26161m.setTextSize(org.telegram.ui.ActionBar.h6.f20984d3.getTextSize() * 0.75f);
            f26161m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f26161m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f26165f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f26163b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f26163b.getLineLeft(0);
                    this.f26164c = this.f26163b.getLineWidth(0);
                    this.d = this.f26163b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f26163b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f26166g == 0) {
            RectF rectF = this.f26162a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f26158j);
        }
        canvas.save();
        float f7 = this.f26167i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f26163b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.play_billing.k3.z(width, this.f26164c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.play_billing.k3.z(width, this.d, 2.0f, bounds.top));
            this.f26163b.draw(canvas);
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
        f26158j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
