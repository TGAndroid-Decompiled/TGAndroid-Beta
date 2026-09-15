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
    public static final Paint f25859j = new Paint();
    public static TextPaint f25860k;
    public static TextPaint f25861l;
    public static TextPaint f25862m;
    public StaticLayout f25864b;
    public float f25865c;
    public float d;
    public float e;
    public final int f25867g;
    public final TextPaint h;
    public final RectF f25863a = new RectF();
    public final StringBuilder f25866f = new StringBuilder(5);
    public float f25868i = 1.0f;

    public l80(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f25867g = i10;
        if (i10 == 0) {
            if (f25860k == null) {
                f25860k = new TextPaint(1);
            }
            f25860k.setTextSize(AndroidUtilities.dp(28.0f));
            f25859j.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Jh, e6Var));
            f25860k.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Kh, e6Var));
            this.h = f25860k;
        } else if (i10 == 1) {
            if (f25861l == null) {
                f25861l = new TextPaint(1);
            }
            f25861l.setColor(-1);
            f25861l.setTextSize(AndroidUtilities.dp(13.0f));
            f25861l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f25861l;
        } else {
            if (f25862m == null) {
                f25862m = new TextPaint(1);
            }
            f25862m.setColor(-1);
            f25862m.setTextSize(org.telegram.ui.ActionBar.i6.f18833d3.getTextSize() * 0.75f);
            f25862m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f25862m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f25866f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f25864b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f25864b.getLineLeft(0);
                    this.f25865c = this.f25864b.getLineWidth(0);
                    this.d = this.f25864b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f25864b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f25867g == 0) {
            RectF rectF = this.f25863a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f25859j);
        }
        canvas.save();
        float f7 = this.f25868i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f25864b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f25865c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f25864b.draw(canvas);
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
        f25859j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
