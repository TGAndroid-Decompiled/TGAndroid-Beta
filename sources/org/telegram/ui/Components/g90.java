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
public final class g90 extends Drawable {
    public static final Paint f26570k = new Paint();
    public static TextPaint f26571l;
    public static TextPaint f26572m;
    public static TextPaint f26573n;
    public StaticLayout f26575b;
    public float f26576c;
    public float d;
    public float e;
    public final int f26578g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.g6 f26580j;
    public final RectF f26574a = new RectF();
    public final StringBuilder f26577f = new StringBuilder(5);
    public float f26579i = 1.0f;

    public g90(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f26578g = i10;
        this.f26580j = g6Var;
        if (i10 == 0) {
            if (f26571l == null) {
                f26571l = new TextPaint(1);
            }
            f26571l.setTextSize(AndroidUtilities.dp(28.0f));
            f26570k.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jh, g6Var));
            f26571l.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kh, g6Var));
            this.h = f26571l;
        } else if (i10 == 1) {
            if (f26572m == null) {
                f26572m = new TextPaint(1);
            }
            f26572m.setColor(-1);
            f26572m.setTextSize(AndroidUtilities.dp(13.0f));
            f26572m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f26572m;
        } else {
            if (f26573n == null) {
                f26573n = new TextPaint(1);
            }
            f26573n.setColor(-1);
            f26573n.setTextSize(org.telegram.ui.ActionBar.k6.f21180d3.getTextSize() * 0.75f);
            f26573n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f26573n;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f26577f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f26575b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f26575b.getLineLeft(0);
                    this.f26576c = this.f26575b.getLineWidth(0);
                    this.d = this.f26575b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f26575b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f26578g == 0) {
            int i10 = org.telegram.ui.ActionBar.k6.Jh;
            org.telegram.ui.ActionBar.g6 g6Var = this.f26580j;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
            Paint paint = f26570k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kh, g6Var));
            RectF rectF = this.f26574a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        }
        canvas.save();
        float f7 = this.f26579i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f26575b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.play_billing.k3.z(width, this.f26576c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.play_billing.k3.z(width, this.d, 2.0f, bounds.top));
            this.f26575b.draw(canvas);
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
        f26570k.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
