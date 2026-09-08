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
public final class t90 extends Drawable {
    public kv A;
    public org.telegram.ui.ActionBar.f5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f30586a;
    public final Paint f30587b;
    public final Paint f30588c;
    public final Paint d;
    public final Paint f30589e;
    public final RectF f30590f;
    public PorterDuffColorFilter f30591g;
    public float h;
    public final DecelerateInterpolator f30592i;
    public boolean f30593j;
    public float f30594k;
    public int f30595l;
    public String f30596m;
    public int f30597n;
    public float f30598o;
    public int f30599p;
    public int f30600q;
    public float f30601r;
    public float f30602s;
    public long f30603t;
    public boolean f30604u;
    public float v;
    public float f30605w;
    public float f30606x;
    public float f30607y;
    public float f30608z;

    public t90() {
        TextPaint textPaint = new TextPaint(1);
        this.f30586a = textPaint;
        Paint paint = new Paint(1);
        this.f30587b = paint;
        this.f30588c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f30589e = paint3;
        this.f30590f = new RectF();
        this.h = 1.0f;
        this.f30592i = new DecelerateInterpolator();
        this.f30594k = 400.0f;
        this.f30595l = -1;
        this.f30598o = 1.0f;
        this.f30601r = 1.0f;
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
            Shader shader = f5Var2.f20451a;
            Matrix matrix = f5Var2.f20459k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20466r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20466r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f30604u) {
            return this.f30601r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f30587b.setColor(i11);
        this.d.setColor(i11);
        this.f30589e.setColor(i11);
        this.f30586a.setColor(i11);
        this.f30591g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f30599p == i10 && (i12 = this.f30600q) != i10) {
            this.f30599p = i12;
            this.f30601r = 1.0f;
        }
        if (z10) {
            int i13 = this.f30599p;
            if (i13 != i10 && (i11 = this.f30600q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f30594k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f30594k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f30594k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f30594k = 160.0f;
                } else {
                    this.f30594k = 220.0f;
                }
                if (this.f30604u) {
                    this.f30599p = i11;
                }
                this.f30604u = true;
                this.f30600q = i10;
                this.f30602s = this.f30601r;
                this.f30601r = 0.0f;
            } else {
                return;
            }
        } else if (this.f30599p == i10) {
            return;
        } else {
            this.f30604u = false;
            this.f30600q = i10;
            this.f30599p = i10;
            this.f30602s = this.f30601r;
            this.f30601r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f30606x = 0.0f;
            this.f30607y = 0.0f;
            this.f30608z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f30605w == f7) {
            return;
        }
        if (!z10) {
            this.f30606x = f7;
            this.f30607y = f7;
        } else {
            if (this.f30606x > f7) {
                this.f30606x = f7;
            }
            this.f30607y = this.f30606x;
        }
        this.f30605w = f7;
        this.f30608z = 0.0f;
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
        kv kvVar = this.A;
        if (kvVar != null) {
            ((View) kvVar.f27935b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f30587b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30587b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f30589e.setColorFilter(colorFilter);
        this.f30586a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
