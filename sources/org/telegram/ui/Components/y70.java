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

public final class y70 extends Drawable {

    public static final Paint f34833j = new Paint();

    public static TextPaint f34834k;

    public static TextPaint f34835l;

    public static TextPaint f34836m;

    public StaticLayout f34838b;

    public float f34839c;
    public float d;

    public float f34840e;

    public final int f34842g;
    public final TextPaint h;

    public final RectF f34837a = new RectF();

    public final StringBuilder f34841f = new StringBuilder(5);

    public float f34843i = 1.0f;

    public y70(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f34842g = i10;
        if (i10 == 0) {
            if (f34834k == null) {
                f34834k = new TextPaint(1);
            }
            f34834k.setTextSize(AndroidUtilities.dp(28.0f));
            f34833j.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Jh, c6Var));
            f34834k.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Kh, c6Var));
            this.h = f34834k;
            return;
        }
        if (i10 == 1) {
            if (f34835l == null) {
                f34835l = new TextPaint(1);
            }
            f34835l.setColor(-1);
            f34835l.setTextSize(AndroidUtilities.dp(13.0f));
            f34835l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f34835l;
            return;
        }
        if (f34836m == null) {
            f34836m = new TextPaint(1);
        }
        f34836m.setColor(-1);
        f34836m.setTextSize(org.telegram.ui.ActionBar.g6.f23050d3.getTextSize() * 0.75f);
        f34836m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.h = f34836m;
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f34841f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() <= 0) {
            this.f34838b = null;
            return;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f34838b = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f34840e = this.f34838b.getLineLeft(0);
                this.f34839c = this.f34838b.getLineWidth(0);
                this.d = this.f34838b.getLineBottom(0);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f34842g == 0) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            float f12 = bounds.right;
            float f13 = bounds.bottom;
            RectF rectF = this.f34837a;
            rectF.set(f10, f11, f12, f13);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f34833j);
        }
        canvas.save();
        float f14 = this.f34843i;
        if (f14 != 1.0f) {
            canvas.scale(f14, f14, bounds.centerX(), bounds.centerY());
        }
        if (this.f34838b != null) {
            float fWidth = bounds.width();
            canvas.translate(com.google.android.recaptcha.internal.a.A(fWidth, this.f34839c, 2.0f, bounds.left) - this.f34840e, com.google.android.recaptcha.internal.a.A(fWidth, this.d, 2.0f, bounds.top));
            this.f34838b.draw(canvas);
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
        f34833j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
