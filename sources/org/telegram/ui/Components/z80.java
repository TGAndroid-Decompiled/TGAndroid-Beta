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
    public static final Paint f33417j = new Paint();
    public static TextPaint f33418k;
    public static TextPaint f33419l;
    public static TextPaint f33420m;
    public StaticLayout f33422b;
    public float f33423c;
    public float d;
    public float f33424e;
    public final int f33426g;
    public final TextPaint h;
    public final RectF f33421a = new RectF();
    public final StringBuilder f33425f = new StringBuilder(5);
    public float f33427i = 1.0f;

    public z80(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f33426g = i10;
        if (i10 == 0) {
            if (f33418k == null) {
                f33418k = new TextPaint(1);
            }
            f33418k.setTextSize(AndroidUtilities.dp(28.0f));
            f33417j.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Jh, d6Var));
            f33418k.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Kh, d6Var));
            this.h = f33418k;
        } else if (i10 == 1) {
            if (f33419l == null) {
                f33419l = new TextPaint(1);
            }
            f33419l.setColor(-1);
            f33419l.setTextSize(AndroidUtilities.dp(13.0f));
            f33419l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33419l;
        } else {
            if (f33420m == null) {
                f33420m = new TextPaint(1);
            }
            f33420m.setColor(-1);
            f33420m.setTextSize(org.telegram.ui.ActionBar.i6.f20819d3.getTextSize() * 0.75f);
            f33420m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f33420m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f33425f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f33422b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f33424e = this.f33422b.getLineLeft(0);
                    this.f33423c = this.f33422b.getLineWidth(0);
                    this.d = this.f33422b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        this.f33422b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f33426g == 0) {
            RectF rectF = this.f33421a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f33417j);
        }
        canvas.save();
        float f7 = this.f33427i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f33422b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f33423c, 2.0f, bounds.left) - this.f33424e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f33422b.draw(canvas);
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
        f33417j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
