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
public final class ma0 extends Drawable {
    public rv A;
    public org.telegram.ui.ActionBar.j5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f28550a;
    public final Paint f28551b;
    public final Paint f28552c;
    public final Paint d;
    public final Paint e;
    public final RectF f28553f;
    public PorterDuffColorFilter f28554g;
    public float h;
    public final DecelerateInterpolator f28555i;
    public boolean f28556j;
    public float f28557k;
    public int f28558l;
    public String f28559m;
    public int f28560n;
    public float f28561o;
    public int f28562p;
    public int f28563q;
    public float f28564r;
    public float f28565s;
    public long f28566t;
    public boolean f28567u;
    public float v;
    public float f28568w;
    public float f28569x;
    public float f28570y;
    public float f28571z;

    public ma0() {
        TextPaint textPaint = new TextPaint(1);
        this.f28550a = textPaint;
        Paint paint = new Paint(1);
        this.f28551b = paint;
        this.f28552c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f28553f = new RectF();
        this.h = 1.0f;
        this.f28555i = new DecelerateInterpolator();
        this.f28557k = 400.0f;
        this.f28558l = -1;
        this.f28561o = 1.0f;
        this.f28564r = 1.0f;
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
            Shader shader = j5Var2.f20998a;
            Matrix matrix = j5Var2.f21005k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f21012r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f21012r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f28567u) {
            return this.f28564r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f28551b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f28550a.setColor(i11);
        this.f28554g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f28562p == i10 && (i12 = this.f28563q) != i10) {
            this.f28562p = i12;
            this.f28564r = 1.0f;
        }
        if (z10) {
            int i13 = this.f28562p;
            if (i13 != i10 && (i11 = this.f28563q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f28557k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f28557k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f28557k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f28557k = 160.0f;
                } else {
                    this.f28557k = 220.0f;
                }
                if (this.f28567u) {
                    this.f28562p = i11;
                }
                this.f28567u = true;
                this.f28563q = i10;
                this.f28565s = this.f28564r;
                this.f28564r = 0.0f;
            } else {
                return;
            }
        } else if (this.f28562p == i10) {
            return;
        } else {
            this.f28567u = false;
            this.f28563q = i10;
            this.f28562p = i10;
            this.f28565s = this.f28564r;
            this.f28564r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f28569x = 0.0f;
            this.f28570y = 0.0f;
            this.f28571z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f28568w == f7) {
            return;
        }
        if (!z10) {
            this.f28569x = f7;
            this.f28570y = f7;
        } else {
            if (this.f28569x > f7) {
                this.f28569x = f7;
            }
            this.f28570y = this.f28569x;
        }
        this.f28568w = f7;
        this.f28571z = 0.0f;
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
        rv rvVar = this.A;
        if (rvVar != null) {
            ((View) rvVar.f30277b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f28551b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28551b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f28550a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
