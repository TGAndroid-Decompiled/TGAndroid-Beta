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
    public static final Paint f30097j = new Paint();
    public static TextPaint f30098k;
    public static TextPaint f30099l;
    public static TextPaint f30100m;
    public StaticLayout f30102b;
    public float f30103c;
    public float d;
    public float f30104e;
    public final int f30106g;
    public final TextPaint h;
    public final RectF f30101a = new RectF();
    public final StringBuilder f30105f = new StringBuilder(5);
    public float f30107i = 1.0f;

    public r90(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f30106g = i10;
        if (i10 == 0) {
            if (f30098k == null) {
                f30098k = new TextPaint(1);
            }
            f30098k.setTextSize(AndroidUtilities.dp(28.0f));
            f30097j.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Jh, c6Var));
            f30098k.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Kh, c6Var));
            this.h = f30098k;
        } else if (i10 == 1) {
            if (f30099l == null) {
                f30099l = new TextPaint(1);
            }
            f30099l.setColor(-1);
            f30099l.setTextSize(AndroidUtilities.dp(13.0f));
            f30099l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30099l;
        } else {
            if (f30100m == null) {
                f30100m = new TextPaint(1);
            }
            f30100m.setColor(-1);
            f30100m.setTextSize(org.telegram.ui.ActionBar.h6.f20556d3.getTextSize() * 0.75f);
            f30100m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30100m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f30105f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f30102b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f30104e = this.f30102b.getLineLeft(0);
                    this.f30103c = this.f30102b.getLineWidth(0);
                    this.d = this.f30102b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        this.f30102b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f30106g == 0) {
            RectF rectF = this.f30101a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f30097j);
        }
        canvas.save();
        float f7 = this.f30107i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f30102b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.z(width, this.f30103c, 2.0f, bounds.left) - this.f30104e, com.google.android.gms.internal.vision.e2.z(width, this.d, 2.0f, bounds.top));
            this.f30102b.draw(canvas);
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
        f30097j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
