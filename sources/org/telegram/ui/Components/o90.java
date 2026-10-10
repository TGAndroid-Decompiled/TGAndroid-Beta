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
    public static final Paint f29388j = new Paint();
    public static TextPaint f29389k;
    public static TextPaint f29390l;
    public static TextPaint f29391m;
    public StaticLayout f29393b;
    public float f29394c;
    public float d;
    public float f29395e;
    public final int f29397g;
    public final TextPaint h;
    public final RectF f29392a = new RectF();
    public final StringBuilder f29396f = new StringBuilder(5);
    public float f29398i = 1.0f;

    public o90(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f29397g = i10;
        if (i10 == 0) {
            if (f29389k == null) {
                f29389k = new TextPaint(1);
            }
            f29389k.setTextSize(AndroidUtilities.dp(28.0f));
            f29388j.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Jh, e6Var));
            f29389k.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Kh, e6Var));
            this.h = f29389k;
        } else if (i10 == 1) {
            if (f29390l == null) {
                f29390l = new TextPaint(1);
            }
            f29390l.setColor(-1);
            f29390l.setTextSize(AndroidUtilities.dp(13.0f));
            f29390l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29390l;
        } else {
            if (f29391m == null) {
                f29391m = new TextPaint(1);
            }
            f29391m.setColor(-1);
            f29391m.setTextSize(org.telegram.ui.ActionBar.i6.f20798d3.getTextSize() * 0.75f);
            f29391m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f29391m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f29396f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29393b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.f29395e = this.f29393b.getLineLeft(0);
                    this.f29394c = this.f29393b.getLineWidth(0);
                    this.d = this.f29393b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        this.f29393b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f29397g == 0) {
            RectF rectF = this.f29392a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f29388j);
        }
        canvas.save();
        float f7 = this.f29398i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f29393b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.z(width, this.f29394c, 2.0f, bounds.left) - this.f29395e, com.google.android.gms.internal.vision.e2.z(width, this.d, 2.0f, bounds.top));
            this.f29393b.draw(canvas);
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
        f29388j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
