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
public final class z80 extends Drawable {
    public static final Paint f30916j = new Paint();
    public static TextPaint f30917k;
    public static TextPaint f30918l;
    public static TextPaint f30919m;
    public StaticLayout f30921b;
    public float f30922c;
    public float d;
    public float e;
    public final int f30924g;
    public final TextPaint h;
    public final RectF f30920a = new RectF();
    public final StringBuilder f30923f = new StringBuilder(5);
    public float f30925i = 1.0f;

    public z80(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f30924g = i10;
        if (i10 == 0) {
            if (f30917k == null) {
                f30917k = new TextPaint(1);
            }
            f30917k.setTextSize(AndroidUtilities.dp(28.0f));
            f30916j.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Jh, d6Var));
            f30917k.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Kh, d6Var));
            this.h = f30917k;
        } else if (i10 == 1) {
            if (f30918l == null) {
                f30918l = new TextPaint(1);
            }
            f30918l.setColor(-1);
            f30918l.setTextSize(AndroidUtilities.dp(13.0f));
            f30918l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30918l;
        } else {
            if (f30919m == null) {
                f30919m = new TextPaint(1);
            }
            f30919m.setColor(-1);
            f30919m.setTextSize(org.telegram.ui.ActionBar.h6.f19073d3.getTextSize() * 0.75f);
            f30919m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30919m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f30923f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f30921b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f30921b.getLineLeft(0);
                    this.f30922c = this.f30921b.getLineWidth(0);
                    this.d = this.f30921b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f30921b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f30924g == 0) {
            RectF rectF = this.f30920a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f30916j);
        }
        canvas.save();
        float f7 = this.f30925i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f30921b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f30922c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f30921b.draw(canvas);
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
        f30916j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
