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
public final class ya0 extends Drawable {
    public ew A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f33017a;
    public final Paint f33018b;
    public final Paint f33019c;
    public final Paint d;
    public final Paint f33020e;
    public final RectF f33021f;
    public PorterDuffColorFilter f33022g;
    public float h;
    public final DecelerateInterpolator f33023i;
    public boolean f33024j;
    public float f33025k;
    public int f33026l;
    public String f33027m;
    public int f33028n;
    public float f33029o;
    public int f33030p;
    public int f33031q;
    public float f33032r;
    public float f33033s;
    public long f33034t;
    public boolean f33035u;
    public float v;
    public float f33036w;
    public float f33037x;
    public float f33038y;
    public float f33039z;

    public ya0() {
        TextPaint textPaint = new TextPaint(1);
        this.f33017a = textPaint;
        Paint paint = new Paint(1);
        this.f33018b = paint;
        this.f33019c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f33020e = paint3;
        this.f33021f = new RectF();
        this.h = 1.0f;
        this.f33023i = new DecelerateInterpolator();
        this.f33025k = 400.0f;
        this.f33026l = -1;
        this.f33029o = 1.0f;
        this.f33032r = 1.0f;
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
            Shader shader = d5Var2.f20292a;
            Matrix matrix = d5Var2.f20300k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20307r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20307r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f33035u) {
            return this.f33032r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f33018b.setColor(i11);
        this.d.setColor(i11);
        this.f33020e.setColor(i11);
        this.f33017a.setColor(i11);
        this.f33022g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f33030p == i10 && (i12 = this.f33031q) != i10) {
            this.f33030p = i12;
            this.f33032r = 1.0f;
        }
        if (z10) {
            int i13 = this.f33030p;
            if (i13 != i10 && (i11 = this.f33031q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f33025k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f33025k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f33025k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f33025k = 160.0f;
                } else {
                    this.f33025k = 220.0f;
                }
                if (this.f33035u) {
                    this.f33030p = i11;
                }
                this.f33035u = true;
                this.f33031q = i10;
                this.f33033s = this.f33032r;
                this.f33032r = 0.0f;
            } else {
                return;
            }
        } else if (this.f33030p == i10) {
            return;
        } else {
            this.f33035u = false;
            this.f33031q = i10;
            this.f33030p = i10;
            this.f33033s = this.f33032r;
            this.f33032r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f33037x = 0.0f;
            this.f33038y = 0.0f;
            this.f33039z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ya0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f33036w == f7) {
            return;
        }
        if (!z10) {
            this.f33037x = f7;
            this.f33038y = f7;
        } else {
            if (this.f33037x > f7) {
                this.f33037x = f7;
            }
            this.f33038y = this.f33037x;
        }
        this.f33036w = f7;
        this.f33039z = 0.0f;
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
        ew ewVar = this.A;
        if (ewVar != null) {
            ((View) ewVar.f25792b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f33018b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33018b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f33020e.setColorFilter(colorFilter);
        this.f33017a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
