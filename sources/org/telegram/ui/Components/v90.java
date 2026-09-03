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
public final class v90 extends Drawable {
    public ev A;
    public org.telegram.ui.ActionBar.g5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f29419a;
    public final Paint f29420b;
    public final Paint f29421c;
    public final Paint d;
    public final Paint e;
    public final RectF f29422f;
    public PorterDuffColorFilter f29423g;
    public float h;
    public final DecelerateInterpolator f29424i;
    public boolean f29425j;
    public float f29426k;
    public int f29427l;
    public String f29428m;
    public int f29429n;
    public float f29430o;
    public int f29431p;
    public int f29432q;
    public float f29433r;
    public float f29434s;
    public long f29435t;
    public boolean f29436u;
    public float v;
    public float f29437w;
    public float f29438x;
    public float f29439y;
    public float f29440z;

    public v90() {
        TextPaint textPaint = new TextPaint(1);
        this.f29419a = textPaint;
        Paint paint = new Paint(1);
        this.f29420b = paint;
        this.f29421c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f29422f = new RectF();
        this.h = 1.0f;
        this.f29424i = new DecelerateInterpolator();
        this.f29426k = 400.0f;
        this.f29427l = -1;
        this.f29430o = 1.0f;
        this.f29433r = 1.0f;
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
            Shader shader = g5Var2.f19689a;
            Matrix matrix = g5Var2.f19696k;
            matrix.reset();
            this.B.a();
            if (z4) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f19703r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f19703r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f29436u) {
            return this.f29433r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f29420b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f29419a.setColor(i11);
        this.f29423g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z4) {
        int i11;
        int i12;
        if (this.f29431p == i10 && (i12 = this.f29432q) != i10) {
            this.f29431p = i12;
            this.f29433r = 1.0f;
        }
        if (z4) {
            int i13 = this.f29431p;
            if (i13 != i10 && (i11 = this.f29432q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f29426k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f29426k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f29426k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f29426k = 160.0f;
                } else {
                    this.f29426k = 220.0f;
                }
                if (this.f29436u) {
                    this.f29431p = i11;
                }
                this.f29436u = true;
                this.f29432q = i10;
                this.f29434s = this.f29433r;
                this.f29433r = 0.0f;
            } else {
                return;
            }
        } else if (this.f29431p == i10) {
            return;
        } else {
            this.f29436u = false;
            this.f29432q = i10;
            this.f29431p = i10;
            this.f29434s = this.f29433r;
            this.f29433r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f29438x = 0.0f;
            this.f29439y = 0.0f;
            this.f29440z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f10, boolean z4) {
        if (this.f29437w == f10) {
            return;
        }
        if (!z4) {
            this.f29438x = f10;
            this.f29439y = f10;
        } else {
            if (this.f29438x > f10) {
                this.f29438x = f10;
            }
            this.f29439y = this.f29438x;
        }
        this.f29437w = f10;
        this.f29440z = 0.0f;
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
        ev evVar = this.A;
        if (evVar != null) {
            ((View) evVar.f24700b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f29420b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29420b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f29419a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
