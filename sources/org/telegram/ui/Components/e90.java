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
public final class e90 extends Drawable {
    public static final Paint f25995k = new Paint();
    public static TextPaint f25996l;
    public static TextPaint f25997m;
    public static TextPaint f25998n;
    public StaticLayout f26000b;
    public float f26001c;
    public float d;
    public float e;
    public final int f26003g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.g6 f26005j;
    public final RectF f25999a = new RectF();
    public final StringBuilder f26002f = new StringBuilder(5);
    public float f26004i = 1.0f;

    public e90(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f26003g = i10;
        this.f26005j = g6Var;
        if (i10 == 0) {
            if (f25996l == null) {
                f25996l = new TextPaint(1);
            }
            f25996l.setTextSize(AndroidUtilities.dp(28.0f));
            f25995k.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jh, g6Var));
            f25996l.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kh, g6Var));
            this.h = f25996l;
        } else if (i10 == 1) {
            if (f25997m == null) {
                f25997m = new TextPaint(1);
            }
            f25997m.setColor(-1);
            f25997m.setTextSize(AndroidUtilities.dp(13.0f));
            f25997m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f25997m;
        } else {
            if (f25998n == null) {
                f25998n = new TextPaint(1);
            }
            f25998n.setColor(-1);
            f25998n.setTextSize(org.telegram.ui.ActionBar.k6.f21181d3.getTextSize() * 0.75f);
            f25998n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f25998n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f26002f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f26000b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f26000b.getLineLeft(0);
                    this.f26001c = this.f26000b.getLineWidth(0);
                    this.d = this.f26000b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f26000b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f26003g == 0) {
            int i10 = org.telegram.ui.ActionBar.k6.Jh;
            org.telegram.ui.ActionBar.g6 g6Var = this.f26005j;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
            Paint paint = f25995k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kh, g6Var));
            RectF rectF = this.f25999a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        }
        canvas.save();
        float f7 = this.f26004i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f26000b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.play_billing.k3.z(width, this.f26001c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.play_billing.k3.z(width, this.d, 2.0f, bounds.top));
            this.f26000b.draw(canvas);
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
        f25995k.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
