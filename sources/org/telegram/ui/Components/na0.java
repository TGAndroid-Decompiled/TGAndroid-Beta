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
public final class na0 extends Drawable {
    public tv A;
    public org.telegram.ui.ActionBar.f5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f28706a;
    public final Paint f28707b;
    public final Paint f28708c;
    public final Paint d;
    public final Paint e;
    public final RectF f28709f;
    public PorterDuffColorFilter f28710g;
    public float h;
    public final DecelerateInterpolator f28711i;
    public boolean f28712j;
    public float f28713k;
    public int f28714l;
    public String f28715m;
    public int f28716n;
    public float f28717o;
    public int f28718p;
    public int f28719q;
    public float f28720r;
    public float f28721s;
    public long f28722t;
    public boolean f28723u;
    public float v;
    public float f28724w;
    public float f28725x;
    public float f28726y;
    public float f28727z;

    public na0() {
        TextPaint textPaint = new TextPaint(1);
        this.f28706a = textPaint;
        Paint paint = new Paint(1);
        this.f28707b = paint;
        this.f28708c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f28709f = new RectF();
        this.h = 1.0f;
        this.f28711i = new DecelerateInterpolator();
        this.f28713k = 400.0f;
        this.f28714l = -1;
        this.f28717o = 1.0f;
        this.f28720r = 1.0f;
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
            Shader shader = f5Var2.f20806a;
            Matrix matrix = f5Var2.f20813k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20820r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20820r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f28723u) {
            return this.f28720r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f28707b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f28706a.setColor(i11);
        this.f28710g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f28718p == i10 && (i12 = this.f28719q) != i10) {
            this.f28718p = i12;
            this.f28720r = 1.0f;
        }
        if (z10) {
            int i13 = this.f28718p;
            if (i13 != i10 && (i11 = this.f28719q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f28713k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f28713k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f28713k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f28713k = 160.0f;
                } else {
                    this.f28713k = 220.0f;
                }
                if (this.f28723u) {
                    this.f28718p = i11;
                }
                this.f28723u = true;
                this.f28719q = i10;
                this.f28721s = this.f28720r;
                this.f28720r = 0.0f;
            } else {
                return;
            }
        } else if (this.f28718p == i10) {
            return;
        } else {
            this.f28723u = false;
            this.f28719q = i10;
            this.f28718p = i10;
            this.f28721s = this.f28720r;
            this.f28720r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f28725x = 0.0f;
            this.f28726y = 0.0f;
            this.f28727z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f28724w == f7) {
            return;
        }
        if (!z10) {
            this.f28725x = f7;
            this.f28726y = f7;
        } else {
            if (this.f28725x > f7) {
                this.f28725x = f7;
            }
            this.f28726y = this.f28725x;
        }
        this.f28724w = f7;
        this.f28727z = 0.0f;
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
        tv tvVar = this.A;
        if (tvVar != null) {
            ((View) tvVar.f30717b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f28707b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28707b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f28706a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
