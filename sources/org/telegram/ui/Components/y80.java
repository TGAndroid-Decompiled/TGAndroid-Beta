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
public final class y80 extends Drawable {
    public static final Paint f30609j = new Paint();
    public static TextPaint f30610k;
    public static TextPaint f30611l;
    public static TextPaint f30612m;
    public StaticLayout f30614b;
    public float f30615c;
    public float d;
    public float e;
    public final int f30617g;
    public final TextPaint h;
    public final RectF f30613a = new RectF();
    public final StringBuilder f30616f = new StringBuilder(5);
    public float f30618i = 1.0f;

    public y80(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f30617g = i10;
        if (i10 == 0) {
            if (f30610k == null) {
                f30610k = new TextPaint(1);
            }
            f30610k.setTextSize(AndroidUtilities.dp(28.0f));
            f30609j.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Jh, e6Var));
            f30610k.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Kh, e6Var));
            this.h = f30610k;
        } else if (i10 == 1) {
            if (f30611l == null) {
                f30611l = new TextPaint(1);
            }
            f30611l.setColor(-1);
            f30611l.setTextSize(AndroidUtilities.dp(13.0f));
            f30611l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30611l;
        } else {
            if (f30612m == null) {
                f30612m = new TextPaint(1);
            }
            f30612m.setColor(-1);
            f30612m.setTextSize(org.telegram.ui.ActionBar.i6.f19054d3.getTextSize() * 0.75f);
            f30612m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f30612m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f30616f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f30614b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f30614b.getLineLeft(0);
                    this.f30615c = this.f30614b.getLineWidth(0);
                    this.d = this.f30614b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f30614b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f30617g == 0) {
            RectF rectF = this.f30613a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f30609j);
        }
        canvas.save();
        float f7 = this.f30618i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f30614b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.vision.e2.A(width, this.f30615c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, bounds.top));
            this.f30614b.draw(canvas);
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
        f30609j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
