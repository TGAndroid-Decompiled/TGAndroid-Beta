package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class ta0 extends Drawable {
    public xv A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f29010a;
    public final Paint f29011b;
    public final Paint f29012c;
    public final Paint d;
    public final Paint e;
    public final RectF f29013f;
    public PorterDuffColorFilter f29014g;
    public float h;
    public final DecelerateInterpolator f29015i;
    public boolean f29016j;
    public float f29017k;
    public int f29018l;
    public String f29019m;
    public int f29020n;
    public float f29021o;
    public int f29022p;
    public int f29023q;
    public float f29024r;
    public float f29025s;
    public long f29026t;
    public boolean f29027u;
    public float v;
    public float f29028w;
    public float f29029x;
    public float f29030y;
    public float f29031z;

    public ta0() {
        TextPaint textPaint = new TextPaint(1);
        this.f29010a = textPaint;
        Paint paint = new Paint(1);
        this.f29011b = paint;
        this.f29012c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f29013f = new RectF();
        this.h = 1.0f;
        this.f29015i = new DecelerateInterpolator();
        this.f29017k = 400.0f;
        this.f29018l = -1;
        this.f29021o = 1.0f;
        this.f29024r = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var = this.B;
        if (d5Var != null && d5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.d5 d5Var2 = this.B;
            Shader shader = d5Var2.f19391a;
            Matrix matrix = d5Var2.f19398k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f19405r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f19405r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f29027u) {
            return this.f29024r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f29011b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f29010a.setColor(i11);
        this.f29014g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f29022p == i10 && (i12 = this.f29023q) != i10) {
            this.f29022p = i12;
            this.f29024r = 1.0f;
        }
        if (z10) {
            int i13 = this.f29022p;
            if (i13 != i10 && (i11 = this.f29023q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f29017k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f29017k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f29017k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f29017k = 160.0f;
                } else {
                    this.f29017k = 220.0f;
                }
                if (this.f29027u) {
                    this.f29022p = i11;
                }
                this.f29027u = true;
                this.f29023q = i10;
                this.f29025s = this.f29024r;
                this.f29024r = 0.0f;
            } else {
                return;
            }
        } else if (this.f29022p == i10) {
            return;
        } else {
            this.f29027u = false;
            this.f29023q = i10;
            this.f29022p = i10;
            this.f29025s = this.f29024r;
            this.f29024r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f29029x = 0.0f;
            this.f29030y = 0.0f;
            this.f29031z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ta0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f29028w == f7) {
            return;
        }
        if (!z10) {
            this.f29029x = f7;
            this.f29030y = f7;
        } else {
            if (this.f29029x > f7) {
                this.f29029x = f7;
            }
            this.f29030y = this.f29029x;
        }
        this.f29028w = f7;
        this.f29031z = 0.0f;
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        xv xvVar = this.A;
        if (xvVar != null) {
            ((View) xvVar.f31016b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f29011b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29011b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f29010a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
