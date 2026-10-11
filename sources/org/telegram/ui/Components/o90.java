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
public final class o90 extends Drawable {
    public static final Paint f29345j = new Paint();
    public static TextPaint f29346k;
    public static TextPaint f29347l;
    public static TextPaint f29348m;
    public StaticLayout f29350b;
    public float f29351c;
    public float d;
    public float f29352e;
    public final int f29354g;
    public final TextPaint h;
    public final RectF f29349a = new RectF();
    public final StringBuilder f29353f = new StringBuilder(5);
    public float f29355i = 1.0f;

    public o90(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f29354g = i10;
        if (i10 == 0) {
            if (f29346k == null) {
                f29346k = new TextPaint(1);
            }
            f29346k.setTextSize(AndroidUtilities.dp(28.0f));
            f29345j.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Jh, d6Var));
            f29346k.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Kh, d6Var));
            this.h = f29346k;
        } else if (i10 == 1) {
            if (f29347l == null) {
                f29347l = new TextPaint(1);
            }
            f29347l.setColor(-1);
            f29347l.setTextSize(AndroidUtilities.dp(13.0f));
            f29347l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29347l;
        } else {
            if (f29348m == null) {
                f29348m = new TextPaint(1);
            }
            f29348m.setColor(-1);
            f29348m.setTextSize(org.telegram.ui.ActionBar.h6.f20783d3.getTextSize() * 0.75f);
            f29348m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29348m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f29353f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29350b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f29352e = this.f29350b.getLineLeft(0);
                    this.f29351c = this.f29350b.getLineWidth(0);
                    this.d = this.f29350b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        this.f29350b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f29354g == 0) {
            RectF rectF = this.f29349a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f29345j);
        }
        canvas.save();
        float f7 = this.f29355i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f29350b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.z(width, this.f29351c, 2.0f, bounds.left) - this.f29352e, com.google.android.gms.internal.vision.e2.z(width, this.d, 2.0f, bounds.top));
            this.f29350b.draw(canvas);
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
        f29345j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
