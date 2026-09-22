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
public final class w80 extends Drawable {
    public static final Paint f29963j = new Paint();
    public static TextPaint f29964k;
    public static TextPaint f29965l;
    public static TextPaint f29966m;
    public StaticLayout f29968b;
    public float f29969c;
    public float d;
    public float e;
    public final int f29971g;
    public final TextPaint h;
    public final RectF f29967a = new RectF();
    public final StringBuilder f29970f = new StringBuilder(5);
    public float f29972i = 1.0f;

    public w80(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f29971g = i10;
        if (i10 == 0) {
            if (f29964k == null) {
                f29964k = new TextPaint(1);
            }
            f29964k.setTextSize(AndroidUtilities.dp(28.0f));
            f29963j.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jh, f6Var));
            f29964k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Kh, f6Var));
            this.h = f29964k;
        } else if (i10 == 1) {
            if (f29965l == null) {
                f29965l = new TextPaint(1);
            }
            f29965l.setColor(-1);
            f29965l.setTextSize(AndroidUtilities.dp(13.0f));
            f29965l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29965l;
        } else {
            if (f29966m == null) {
                f29966m = new TextPaint(1);
            }
            f29966m.setColor(-1);
            f29966m.setTextSize(org.telegram.ui.ActionBar.j6.f19106d3.getTextSize() * 0.75f);
            f29966m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29966m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f29970f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29968b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f29968b.getLineLeft(0);
                    this.f29969c = this.f29968b.getLineWidth(0);
                    this.d = this.f29968b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f29968b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f29971g == 0) {
            RectF rectF = this.f29967a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f29963j);
        }
        canvas.save();
        float f7 = this.f29972i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f29968b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f29969c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f29968b.draw(canvas);
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
        f29963j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
