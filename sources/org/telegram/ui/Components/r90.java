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
public final class r90 extends Drawable {
    public static final Paint f30098j = new Paint();
    public static TextPaint f30099k;
    public static TextPaint f30100l;
    public static TextPaint f30101m;
    public StaticLayout f30103b;
    public float f30104c;
    public float d;
    public float f30105e;
    public final int f30107g;
    public final TextPaint h;
    public final RectF f30102a = new RectF();
    public final StringBuilder f30106f = new StringBuilder(5);
    public float f30108i = 1.0f;

    public r90(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f30107g = i10;
        if (i10 == 0) {
            if (f30099k == null) {
                f30099k = new TextPaint(1);
            }
            f30099k.setTextSize(AndroidUtilities.dp(28.0f));
            f30098j.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Jh, c6Var));
            f30099k.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Kh, c6Var));
            this.h = f30099k;
        } else if (i10 == 1) {
            if (f30100l == null) {
                f30100l = new TextPaint(1);
            }
            f30100l.setColor(-1);
            f30100l.setTextSize(AndroidUtilities.dp(13.0f));
            f30100l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30100l;
        } else {
            if (f30101m == null) {
                f30101m = new TextPaint(1);
            }
            f30101m.setColor(-1);
            f30101m.setTextSize(org.telegram.ui.ActionBar.h6.f20557d3.getTextSize() * 0.75f);
            f30101m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30101m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f30106f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f30103b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f30105e = this.f30103b.getLineLeft(0);
                    this.f30104c = this.f30103b.getLineWidth(0);
                    this.d = this.f30103b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        this.f30103b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f30107g == 0) {
            RectF rectF = this.f30102a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f30098j);
        }
        canvas.save();
        float f7 = this.f30108i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f30103b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.z(width, this.f30104c, 2.0f, bounds.left) - this.f30105e, com.google.android.gms.internal.vision.e2.z(width, this.d, 2.0f, bounds.top));
            this.f30103b.draw(canvas);
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
        f30098j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
