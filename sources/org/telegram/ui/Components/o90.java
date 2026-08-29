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
public final class o90 extends Drawable {
    public cv A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f31297a;
    public final Paint f31298b;
    public final Paint f31299c;
    public final Paint d;
    public final Paint f31300e;
    public final RectF f31301f;
    public PorterDuffColorFilter f31302g;
    public float h;
    public final DecelerateInterpolator f31303i;
    public boolean f31304j;
    public float f31305k;
    public int f31306l;
    public String f31307m;
    public int f31308n;
    public float f31309o;
    public int f31310p;
    public int f31311q;
    public float f31312r;
    public float f31313s;
    public long f31314t;
    public boolean f31315u;
    public float v;
    public float f31316w;
    public float f31317x;
    public float f31318y;
    public float f31319z;

    public o90() {
        TextPaint textPaint = new TextPaint(1);
        this.f31297a = textPaint;
        Paint paint = new Paint(1);
        this.f31298b = paint;
        this.f31299c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f31300e = paint3;
        this.f31301f = new RectF();
        this.h = 1.0f;
        this.f31303i = new DecelerateInterpolator();
        this.f31305k = 400.0f;
        this.f31306l = -1;
        this.f31309o = 1.0f;
        this.f31312r = 1.0f;
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
            Shader shader = d5Var2.f22860a;
            Matrix matrix = d5Var2.f22868k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f22875r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f22875r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f31315u) {
            return this.f31312r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f31298b.setColor(i11);
        this.d.setColor(i11);
        this.f31300e.setColor(i11);
        this.f31297a.setColor(i11);
        this.f31302g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f31310p == i10 && (i12 = this.f31311q) != i10) {
            this.f31310p = i12;
            this.f31312r = 1.0f;
        }
        if (z10) {
            int i13 = this.f31310p;
            if (i13 != i10 && (i11 = this.f31311q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f31305k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f31305k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f31305k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f31305k = 160.0f;
                } else {
                    this.f31305k = 220.0f;
                }
                if (this.f31315u) {
                    this.f31310p = i11;
                }
                this.f31315u = true;
                this.f31311q = i10;
                this.f31313s = this.f31312r;
                this.f31312r = 0.0f;
            } else {
                return;
            }
        } else if (this.f31310p == i10) {
            return;
        } else {
            this.f31315u = false;
            this.f31311q = i10;
            this.f31310p = i10;
            this.f31313s = this.f31312r;
            this.f31312r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f31317x = 0.0f;
            this.f31318y = 0.0f;
            this.f31319z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f9, boolean z10) {
        if (this.f31316w == f9) {
            return;
        }
        if (!z10) {
            this.f31317x = f9;
            this.f31318y = f9;
        } else {
            if (this.f31317x > f9) {
                this.f31317x = f9;
            }
            this.f31318y = this.f31317x;
        }
        this.f31316w = f9;
        this.f31319z = 0.0f;
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
        cv cvVar = this.A;
        if (cvVar != null) {
            ((View) cvVar.f27577b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f31298b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31298b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f31300e.setColorFilter(colorFilter);
        this.f31297a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
