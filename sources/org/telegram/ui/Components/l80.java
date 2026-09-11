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
    public static final Paint f28103j = new Paint();
    public static TextPaint f28104k;
    public static TextPaint f28105l;
    public static TextPaint f28106m;
    public StaticLayout f28108b;
    public float f28109c;
    public float d;
    public float f28110e;
    public final int f28112g;
    public final TextPaint h;
    public final RectF f28107a = new RectF();
    public final StringBuilder f28111f = new StringBuilder(5);
    public float f28113i = 1.0f;

    public l80(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28112g = i10;
        if (i10 == 0) {
            if (f28104k == null) {
                f28104k = new TextPaint(1);
            }
            f28104k.setTextSize(AndroidUtilities.dp(28.0f));
            f28103j.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jh, f6Var));
            f28104k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Kh, f6Var));
            this.h = f28104k;
        } else if (i10 == 1) {
            if (f28105l == null) {
                f28105l = new TextPaint(1);
            }
            f28105l.setColor(-1);
            f28105l.setTextSize(AndroidUtilities.dp(13.0f));
            f28105l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f28105l;
        } else {
            if (f28106m == null) {
                f28106m = new TextPaint(1);
            }
            f28106m.setColor(-1);
            f28106m.setTextSize(org.telegram.ui.ActionBar.j6.f20660d3.getTextSize() * 0.75f);
            f28106m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f28106m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f28111f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f28108b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f28110e = this.f28108b.getLineLeft(0);
                    this.f28109c = this.f28108b.getLineWidth(0);
                    this.d = this.f28108b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        this.f28108b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f28112g == 0) {
            RectF rectF = this.f28107a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f28103j);
        }
        canvas.save();
        float f7 = this.f28113i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f28108b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f28109c, 2.0f, bounds.left) - this.f28110e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f28108b.draw(canvas);
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
        f28103j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
