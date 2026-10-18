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
public final class f90 extends Drawable {
    public static final Paint f26168j = new Paint();
    public static TextPaint f26169k;
    public static TextPaint f26170l;
    public static TextPaint f26171m;
    public StaticLayout f26173b;
    public float f26174c;
    public float d;
    public float e;
    public final int f26176g;
    public final TextPaint h;
    public final RectF f26172a = new RectF();
    public final StringBuilder f26175f = new StringBuilder(5);
    public float f26177i = 1.0f;

    public f90(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f26176g = i10;
        if (i10 == 0) {
            if (f26169k == null) {
                f26169k = new TextPaint(1);
            }
            f26169k.setTextSize(AndroidUtilities.dp(28.0f));
            f26168j.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Jh, d6Var));
            f26169k.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Kh, d6Var));
            this.h = f26169k;
        } else if (i10 == 1) {
            if (f26170l == null) {
                f26170l = new TextPaint(1);
            }
            f26170l.setColor(-1);
            f26170l.setTextSize(AndroidUtilities.dp(13.0f));
            f26170l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f26170l;
        } else {
            if (f26171m == null) {
                f26171m = new TextPaint(1);
            }
            f26171m.setColor(-1);
            f26171m.setTextSize(org.telegram.ui.ActionBar.h6.f20983d3.getTextSize() * 0.75f);
            f26171m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = f26171m;
        }
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f26175f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() > 0) {
            try {
                StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f26173b = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.e = this.f26173b.getLineLeft(0);
                    this.f26174c = this.f26173b.getLineWidth(0);
                    this.d = this.f26173b.getLineBottom(0);
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.f26173b = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.f26176g == 0) {
            RectF rectF = this.f26172a;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f26168j);
        }
        canvas.save();
        float f7 = this.f26177i;
        if (f7 != 1.0f) {
            canvas.scale(f7, f7, bounds.centerX(), bounds.centerY());
        }
        if (this.f26173b != null) {
            float width = bounds.width();
            canvas.translate(com.google.android.gms.internal.play_billing.k3.z(width, this.f26174c, 2.0f, bounds.left) - this.e, com.google.android.gms.internal.play_billing.k3.z(width, this.d, 2.0f, bounds.top));
            this.f26173b.draw(canvas);
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
        f26168j.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
