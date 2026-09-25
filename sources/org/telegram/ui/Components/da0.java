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
public final class da0 extends Drawable {
    public mv A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f23558a;
    public final Paint f23559b;
    public final Paint f23560c;
    public final Paint d;
    public final Paint e;
    public final RectF f23561f;
    public PorterDuffColorFilter f23562g;
    public float h;
    public final DecelerateInterpolator f23563i;
    public boolean f23564j;
    public float f23565k;
    public int f23566l;
    public String f23567m;
    public int f23568n;
    public float f23569o;
    public int f23570p;
    public int f23571q;
    public float f23572r;
    public float f23573s;
    public long f23574t;
    public boolean f23575u;
    public float v;
    public float f23576w;
    public float f23577x;
    public float f23578y;
    public float f23579z;

    public da0() {
        TextPaint textPaint = new TextPaint(1);
        this.f23558a = textPaint;
        Paint paint = new Paint(1);
        this.f23559b = paint;
        this.f23560c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f23561f = new RectF();
        this.h = 1.0f;
        this.f23563i = new DecelerateInterpolator();
        this.f23565k = 400.0f;
        this.f23566l = -1;
        this.f23569o = 1.0f;
        this.f23572r = 1.0f;
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
            Shader shader = d5Var2.f18808a;
            Matrix matrix = d5Var2.f18815k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f18822r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f18822r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f23575u) {
            return this.f23572r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f23559b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f23558a.setColor(i11);
        this.f23562g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f23570p == i10 && (i12 = this.f23571q) != i10) {
            this.f23570p = i12;
            this.f23572r = 1.0f;
        }
        if (z10) {
            int i13 = this.f23570p;
            if (i13 != i10 && (i11 = this.f23571q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f23565k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f23565k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f23565k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f23565k = 160.0f;
                } else {
                    this.f23565k = 220.0f;
                }
                if (this.f23575u) {
                    this.f23570p = i11;
                }
                this.f23575u = true;
                this.f23571q = i10;
                this.f23573s = this.f23572r;
                this.f23572r = 0.0f;
            } else {
                return;
            }
        } else if (this.f23570p == i10) {
            return;
        } else {
            this.f23575u = false;
            this.f23571q = i10;
            this.f23570p = i10;
            this.f23573s = this.f23572r;
            this.f23572r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f23577x = 0.0f;
            this.f23578y = 0.0f;
            this.f23579z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f23576w == f7) {
            return;
        }
        if (!z10) {
            this.f23577x = f7;
            this.f23578y = f7;
        } else {
            if (this.f23577x > f7) {
                this.f23577x = f7;
            }
            this.f23578y = this.f23577x;
        }
        this.f23576w = f7;
        this.f23579z = 0.0f;
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
        mv mvVar = this.A;
        if (mvVar != null) {
            ((View) mvVar.f26585b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f23559b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23559b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f23558a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
