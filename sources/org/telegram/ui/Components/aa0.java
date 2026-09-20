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
public final class aa0 extends Drawable {
    public mv A;
    public org.telegram.ui.ActionBar.f5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f22613a;
    public final Paint f22614b;
    public final Paint f22615c;
    public final Paint d;
    public final Paint e;
    public final RectF f22616f;
    public PorterDuffColorFilter f22617g;
    public float h;
    public final DecelerateInterpolator f22618i;
    public boolean f22619j;
    public float f22620k;
    public int f22621l;
    public String f22622m;
    public int f22623n;
    public float f22624o;
    public int f22625p;
    public int f22626q;
    public float f22627r;
    public float f22628s;
    public long f22629t;
    public boolean f22630u;
    public float v;
    public float f22631w;
    public float f22632x;
    public float f22633y;
    public float f22634z;

    public aa0() {
        TextPaint textPaint = new TextPaint(1);
        this.f22613a = textPaint;
        Paint paint = new Paint(1);
        this.f22614b = paint;
        this.f22615c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f22616f = new RectF();
        this.h = 1.0f;
        this.f22618i = new DecelerateInterpolator();
        this.f22620k = 400.0f;
        this.f22621l = -1;
        this.f22624o = 1.0f;
        this.f22627r = 1.0f;
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
        org.telegram.ui.ActionBar.f5 f5Var = this.B;
        if (f5Var != null && f5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.f5 f5Var2 = this.B;
            Shader shader = f5Var2.f18865a;
            Matrix matrix = f5Var2.f18872k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f18879r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f18879r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f22630u) {
            return this.f22627r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f22614b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f22613a.setColor(i11);
        this.f22617g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f22625p == i10 && (i12 = this.f22626q) != i10) {
            this.f22625p = i12;
            this.f22627r = 1.0f;
        }
        if (z10) {
            int i13 = this.f22625p;
            if (i13 != i10 && (i11 = this.f22626q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f22620k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f22620k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f22620k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f22620k = 160.0f;
                } else {
                    this.f22620k = 220.0f;
                }
                if (this.f22630u) {
                    this.f22625p = i11;
                }
                this.f22630u = true;
                this.f22626q = i10;
                this.f22628s = this.f22627r;
                this.f22627r = 0.0f;
            } else {
                return;
            }
        } else if (this.f22625p == i10) {
            return;
        } else {
            this.f22630u = false;
            this.f22626q = i10;
            this.f22625p = i10;
            this.f22628s = this.f22627r;
            this.f22627r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f22632x = 0.0f;
            this.f22633y = 0.0f;
            this.f22634z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aa0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f22631w == f7) {
            return;
        }
        if (!z10) {
            this.f22632x = f7;
            this.f22633y = f7;
        } else {
            if (this.f22632x > f7) {
                this.f22632x = f7;
            }
            this.f22633y = this.f22632x;
        }
        this.f22631w = f7;
        this.f22634z = 0.0f;
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
            ((View) mvVar.f26497b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f22614b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22614b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f22613a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
