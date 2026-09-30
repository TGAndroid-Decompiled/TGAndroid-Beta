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
public final class ga0 extends Drawable {
    public ov A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f24506a;
    public final Paint f24507b;
    public final Paint f24508c;
    public final Paint d;
    public final Paint e;
    public final RectF f24509f;
    public PorterDuffColorFilter f24510g;
    public float h;
    public final DecelerateInterpolator f24511i;
    public boolean f24512j;
    public float f24513k;
    public int f24514l;
    public String f24515m;
    public int f24516n;
    public float f24517o;
    public int f24518p;
    public int f24519q;
    public float f24520r;
    public float f24521s;
    public long f24522t;
    public boolean f24523u;
    public float v;
    public float f24524w;
    public float f24525x;
    public float f24526y;
    public float f24527z;

    public ga0() {
        TextPaint textPaint = new TextPaint(1);
        this.f24506a = textPaint;
        Paint paint = new Paint(1);
        this.f24507b = paint;
        this.f24508c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f24509f = new RectF();
        this.h = 1.0f;
        this.f24511i = new DecelerateInterpolator();
        this.f24513k = 400.0f;
        this.f24514l = -1;
        this.f24517o = 1.0f;
        this.f24520r = 1.0f;
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
            Shader shader = d5Var2.f18824a;
            Matrix matrix = d5Var2.f18831k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f18838r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f18838r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f24523u) {
            return this.f24520r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f24507b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f24506a.setColor(i11);
        this.f24510g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f24518p == i10 && (i12 = this.f24519q) != i10) {
            this.f24518p = i12;
            this.f24520r = 1.0f;
        }
        if (z10) {
            int i13 = this.f24518p;
            if (i13 != i10 && (i11 = this.f24519q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f24513k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f24513k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f24513k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f24513k = 160.0f;
                } else {
                    this.f24513k = 220.0f;
                }
                if (this.f24523u) {
                    this.f24518p = i11;
                }
                this.f24523u = true;
                this.f24519q = i10;
                this.f24521s = this.f24520r;
                this.f24520r = 0.0f;
            } else {
                return;
            }
        } else if (this.f24518p == i10) {
            return;
        } else {
            this.f24523u = false;
            this.f24519q = i10;
            this.f24518p = i10;
            this.f24521s = this.f24520r;
            this.f24520r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f24525x = 0.0f;
            this.f24526y = 0.0f;
            this.f24527z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ga0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f24524w == f7) {
            return;
        }
        if (!z10) {
            this.f24525x = f7;
            this.f24526y = f7;
        } else {
            if (this.f24525x > f7) {
                this.f24525x = f7;
            }
            this.f24526y = this.f24525x;
        }
        this.f24524w = f7;
        this.f24527z = 0.0f;
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
        ov ovVar = this.A;
        if (ovVar != null) {
            ((View) ovVar.f27180b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f24507b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24507b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f24506a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
