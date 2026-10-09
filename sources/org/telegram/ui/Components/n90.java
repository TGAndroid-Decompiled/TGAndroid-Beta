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
public final class n90 extends Drawable {
    public static final Paint f29083j = new Paint();
    public static TextPaint f29084k;
    public static TextPaint f29085l;
    public static TextPaint f29086m;
    public StaticLayout f29088b;
    public float f29089c;
    public float d;
    public float f29090e;
    public final int f29092g;
    public final TextPaint h;
    public final RectF f29087a = new RectF();
    public final StringBuilder f29091f = new StringBuilder(5);
    public float f29093i = 1.0f;

    public n90(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f29092g = i10;
        if (i10 == 0) {
            if (f29084k == null) {
                f29084k = new TextPaint(1);
            }
            f29084k.setTextSize(AndroidUtilities.dp(28.0f));
            f29083j.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Jh, e6Var));
            f29084k.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Kh, e6Var));
            this.h = f29084k;
        } else if (i10 == 1) {
            if (f29085l == null) {
                f29085l = new TextPaint(1);
            }
            f29085l.setColor(-1);
            f29085l.setTextSize(AndroidUtilities.dp(13.0f));
            f29085l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29085l;
        } else {
            if (f29086m == null) {
                f29086m = new TextPaint(1);
            }
            f29086m.setColor(-1);
            f29086m.setTextSize(org.telegram.ui.ActionBar.i6.f20794d3.getTextSize() * 0.75f);
            f29086m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29086m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f29091f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29088b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f29090e = this.f29088b.getLineLeft(0);
                    this.f29089c = this.f29088b.getLineWidth(0);
                    this.d = this.f29088b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        this.f29088b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f29092g == 0) {
            RectF rectF = this.f29087a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f29083j);
        }
        canvas.save();
        float f7 = this.f29093i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f29088b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.z(width, this.f29089c, 2.0f, bounds.left) - this.f29090e, com.google.android.gms.internal.vision.e2.z(width, this.d, 2.0f, bounds.top));
            this.f29088b.draw(canvas);
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
        f29083j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
