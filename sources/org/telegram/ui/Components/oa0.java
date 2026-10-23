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
public final class oa0 extends Drawable {
    public tv A;
    public org.telegram.ui.ActionBar.j5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f29128a;
    public final Paint f29129b;
    public final Paint f29130c;
    public final Paint d;
    public final Paint e;
    public final RectF f29131f;
    public PorterDuffColorFilter f29132g;
    public float h;
    public final DecelerateInterpolator f29133i;
    public boolean f29134j;
    public float f29135k;
    public int f29136l;
    public String f29137m;
    public int f29138n;
    public float f29139o;
    public int f29140p;
    public int f29141q;
    public float f29142r;
    public float f29143s;
    public long f29144t;
    public boolean f29145u;
    public float v;
    public float f29146w;
    public float f29147x;
    public float f29148y;
    public float f29149z;

    public oa0() {
        TextPaint textPaint = new TextPaint(1);
        this.f29128a = textPaint;
        Paint paint = new Paint(1);
        this.f29129b = paint;
        this.f29130c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f29131f = new RectF();
        this.h = 1.0f;
        this.f29133i = new DecelerateInterpolator();
        this.f29135k = 400.0f;
        this.f29136l = -1;
        this.f29139o = 1.0f;
        this.f29142r = 1.0f;
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
        org.telegram.ui.ActionBar.j5 j5Var = this.B;
        if (j5Var != null && j5Var.k() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.j5 j5Var2 = this.B;
            Shader shader = j5Var2.f20997a;
            Matrix matrix = j5Var2.f21004k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f21011r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f21011r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f29145u) {
            return this.f29142r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f29129b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f29128a.setColor(i11);
        this.f29132g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f29140p == i10 && (i12 = this.f29141q) != i10) {
            this.f29140p = i12;
            this.f29142r = 1.0f;
        }
        if (z10) {
            int i13 = this.f29140p;
            if (i13 != i10 && (i11 = this.f29141q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f29135k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f29135k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f29135k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f29135k = 160.0f;
                } else {
                    this.f29135k = 220.0f;
                }
                if (this.f29145u) {
                    this.f29140p = i11;
                }
                this.f29145u = true;
                this.f29141q = i10;
                this.f29143s = this.f29142r;
                this.f29142r = 0.0f;
            } else {
                return;
            }
        } else if (this.f29140p == i10) {
            return;
        } else {
            this.f29145u = false;
            this.f29141q = i10;
            this.f29140p = i10;
            this.f29143s = this.f29142r;
            this.f29142r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f29147x = 0.0f;
            this.f29148y = 0.0f;
            this.f29149z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oa0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f29146w == f7) {
            return;
        }
        if (!z10) {
            this.f29147x = f7;
            this.f29148y = f7;
        } else {
            if (this.f29147x > f7) {
                this.f29147x = f7;
            }
            this.f29148y = this.f29147x;
        }
        this.f29146w = f7;
        this.f29149z = 0.0f;
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
            ((View) tvVar.f30915b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f29129b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29129b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f29128a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
