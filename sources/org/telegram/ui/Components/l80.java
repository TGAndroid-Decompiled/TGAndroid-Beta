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
public final class l80 extends Drawable {
    public static final Paint f28104j = new Paint();
    public static TextPaint f28105k;
    public static TextPaint f28106l;
    public static TextPaint f28107m;
    public StaticLayout f28109b;
    public float f28110c;
    public float d;
    public float f28111e;
    public final int f28113g;
    public final TextPaint h;
    public final RectF f28108a = new RectF();
    public final StringBuilder f28112f = new StringBuilder(5);
    public float f28114i = 1.0f;

    public l80(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28113g = i10;
        if (i10 == 0) {
            if (f28105k == null) {
                f28105k = new TextPaint(1);
            }
            f28105k.setTextSize(AndroidUtilities.dp(28.0f));
            f28104j.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jh, f6Var));
            f28105k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Kh, f6Var));
            this.h = f28105k;
        } else if (i10 == 1) {
            if (f28106l == null) {
                f28106l = new TextPaint(1);
            }
            f28106l.setColor(-1);
            f28106l.setTextSize(AndroidUtilities.dp(13.0f));
            f28106l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f28106l;
        } else {
            if (f28107m == null) {
                f28107m = new TextPaint(1);
            }
            f28107m.setColor(-1);
            f28107m.setTextSize(org.telegram.ui.ActionBar.j6.f20661d3.getTextSize() * 0.75f);
            f28107m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f28107m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f28112f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f28109b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f28111e = this.f28109b.getLineLeft(0);
                    this.f28110c = this.f28109b.getLineWidth(0);
                    this.d = this.f28109b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        this.f28109b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f28113g == 0) {
            RectF rectF = this.f28108a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f28104j);
        }
        canvas.save();
        float f7 = this.f28114i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f28109b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f28110c, 2.0f, bounds.left) - this.f28111e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f28109b.draw(canvas);
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
        f28104j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
