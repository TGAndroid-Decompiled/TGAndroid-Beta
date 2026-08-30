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
public final class u90 extends Drawable {
    public fv A;
    public org.telegram.ui.ActionBar.g5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f29149a;
    public final Paint f29150b;
    public final Paint f29151c;
    public final Paint d;
    public final Paint e;
    public final RectF f29152f;
    public PorterDuffColorFilter f29153g;
    public float h;
    public final DecelerateInterpolator f29154i;
    public boolean f29155j;
    public float f29156k;
    public int f29157l;
    public String f29158m;
    public int f29159n;
    public float f29160o;
    public int f29161p;
    public int f29162q;
    public float f29163r;
    public float f29164s;
    public long f29165t;
    public boolean f29166u;
    public float v;
    public float f29167w;
    public float f29168x;
    public float f29169y;
    public float f29170z;

    public u90() {
        TextPaint textPaint = new TextPaint(1);
        this.f29149a = textPaint;
        Paint paint = new Paint(1);
        this.f29150b = paint;
        this.f29151c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f29152f = new RectF();
        this.h = 1.0f;
        this.f29154i = new DecelerateInterpolator();
        this.f29156k = 400.0f;
        this.f29157l = -1;
        this.f29160o = 1.0f;
        this.f29163r = 1.0f;
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

    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.g5 g5Var = this.B;
        if (g5Var != null && g5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.g5 g5Var2 = this.B;
            Shader shader = g5Var2.f19714a;
            Matrix matrix = g5Var2.f19721k;
            matrix.reset();
            this.B.a();
            if (z4) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f19728r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f19728r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f29166u) {
            return this.f29163r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f29150b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f29149a.setColor(i11);
        this.f29153g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z4) {
        int i11;
        int i12;
        if (this.f29161p == i10 && (i12 = this.f29162q) != i10) {
            this.f29161p = i12;
            this.f29163r = 1.0f;
        }
        if (z4) {
            int i13 = this.f29161p;
            if (i13 != i10 && (i11 = this.f29162q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f29156k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f29156k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f29156k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f29156k = 160.0f;
                } else {
                    this.f29156k = 220.0f;
                }
                if (this.f29166u) {
                    this.f29161p = i11;
                }
                this.f29166u = true;
                this.f29162q = i10;
                this.f29164s = this.f29163r;
                this.f29163r = 0.0f;
            } else {
                return;
            }
        } else if (this.f29161p == i10) {
            return;
        } else {
            this.f29166u = false;
            this.f29162q = i10;
            this.f29161p = i10;
            this.f29164s = this.f29163r;
            this.f29163r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f29168x = 0.0f;
            this.f29169y = 0.0f;
            this.f29170z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f10, boolean z4) {
        if (this.f29167w == f10) {
            return;
        }
        if (!z4) {
            this.f29168x = f10;
            this.f29169y = f10;
        } else {
            if (this.f29168x > f10) {
                this.f29168x = f10;
            }
            this.f29169y = this.f29168x;
        }
        this.f29167w = f10;
        this.f29170z = 0.0f;
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
        fv fvVar = this.A;
        if (fvVar != null) {
            ((View) fvVar.f24962b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f29150b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29150b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f29149a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
