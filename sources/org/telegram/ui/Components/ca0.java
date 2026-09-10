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
public final class ca0 extends Drawable {
    public pv A;
    public org.telegram.ui.ActionBar.h5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f22067a;
    public final Paint f22068b;
    public final Paint f22069c;
    public final Paint d;
    public final Paint e;
    public final RectF f22070f;
    public PorterDuffColorFilter f22071g;
    public float h;
    public final DecelerateInterpolator f22072i;
    public boolean f22073j;
    public float f22074k;
    public int f22075l;
    public String f22076m;
    public int f22077n;
    public float f22078o;
    public int f22079p;
    public int f22080q;
    public float f22081r;
    public float f22082s;
    public long f22083t;
    public boolean f22084u;
    public float v;
    public float f22085w;
    public float f22086x;
    public float f22087y;
    public float f22088z;

    public ca0() {
        TextPaint textPaint = new TextPaint(1);
        this.f22067a = textPaint;
        Paint paint = new Paint(1);
        this.f22068b = paint;
        this.f22069c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f22070f = new RectF();
        this.h = 1.0f;
        this.f22072i = new DecelerateInterpolator();
        this.f22074k = 400.0f;
        this.f22075l = -1;
        this.f22078o = 1.0f;
        this.f22081r = 1.0f;
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
        org.telegram.ui.ActionBar.h5 h5Var = this.B;
        if (h5Var != null && h5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.h5 h5Var2 = this.B;
            Shader shader = h5Var2.f17770a;
            Matrix matrix = h5Var2.f17777k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f17784r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f17784r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f22084u) {
            return this.f22081r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f22068b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f22067a.setColor(i11);
        this.f22071g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f22079p == i10 && (i12 = this.f22080q) != i10) {
            this.f22079p = i12;
            this.f22081r = 1.0f;
        }
        if (z10) {
            int i13 = this.f22079p;
            if (i13 != i10 && (i11 = this.f22080q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f22074k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f22074k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f22074k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f22074k = 160.0f;
                } else {
                    this.f22074k = 220.0f;
                }
                if (this.f22084u) {
                    this.f22079p = i11;
                }
                this.f22084u = true;
                this.f22080q = i10;
                this.f22082s = this.f22081r;
                this.f22081r = 0.0f;
            } else {
                return;
            }
        } else if (this.f22079p == i10) {
            return;
        } else {
            this.f22084u = false;
            this.f22080q = i10;
            this.f22079p = i10;
            this.f22082s = this.f22081r;
            this.f22081r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f22086x = 0.0f;
            this.f22087y = 0.0f;
            this.f22088z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f22085w == f7) {
            return;
        }
        if (!z10) {
            this.f22086x = f7;
            this.f22087y = f7;
        } else {
            if (this.f22086x > f7) {
                this.f22086x = f7;
            }
            this.f22087y = this.f22086x;
        }
        this.f22085w = f7;
        this.f22088z = 0.0f;
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
        pv pvVar = this.A;
        if (pvVar != null) {
            ((View) pvVar.f26252b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f22068b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22068b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f22067a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
