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
    public final TextPaint f28713a;
    public final Paint f28714b;
    public final Paint f28715c;
    public final Paint d;
    public final Paint e;
    public final RectF f28716f;
    public PorterDuffColorFilter f28717g;
    public float h;
    public final DecelerateInterpolator f28718i;
    public boolean f28719j;
    public float f28720k;
    public int f28721l;
    public String f28722m;
    public int f28723n;
    public float f28724o;
    public int f28725p;
    public int f28726q;
    public float f28727r;
    public float f28728s;
    public long f28729t;
    public boolean f28730u;
    public float v;
    public float f28731w;
    public float f28732x;
    public float f28733y;
    public float f28734z;

    public na0() {
        TextPaint textPaint = new TextPaint(1);
        this.f28713a = textPaint;
        Paint paint = new Paint(1);
        this.f28714b = paint;
        this.f28715c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f28716f = new RectF();
        this.h = 1.0f;
        this.f28718i = new DecelerateInterpolator();
        this.f28720k = 400.0f;
        this.f28721l = -1;
        this.f28724o = 1.0f;
        this.f28727r = 1.0f;
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
            Shader shader = f5Var2.f20813a;
            Matrix matrix = f5Var2.f20820k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20827r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20827r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f28730u) {
            return this.f28727r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f28714b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f28713a.setColor(i11);
        this.f28717g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f28725p == i10 && (i12 = this.f28726q) != i10) {
            this.f28725p = i12;
            this.f28727r = 1.0f;
        }
        if (z10) {
            int i13 = this.f28725p;
            if (i13 != i10 && (i11 = this.f28726q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f28720k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f28720k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f28720k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f28720k = 160.0f;
                } else {
                    this.f28720k = 220.0f;
                }
                if (this.f28730u) {
                    this.f28725p = i11;
                }
                this.f28730u = true;
                this.f28726q = i10;
                this.f28728s = this.f28727r;
                this.f28727r = 0.0f;
            } else {
                return;
            }
        } else if (this.f28725p == i10) {
            return;
        } else {
            this.f28730u = false;
            this.f28726q = i10;
            this.f28725p = i10;
            this.f28728s = this.f28727r;
            this.f28727r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f28732x = 0.0f;
            this.f28733y = 0.0f;
            this.f28734z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f28731w == f7) {
            return;
        }
        if (!z10) {
            this.f28732x = f7;
            this.f28733y = f7;
        } else {
            if (this.f28732x > f7) {
                this.f28732x = f7;
            }
            this.f28733y = this.f28732x;
        }
        this.f28731w = f7;
        this.f28734z = 0.0f;
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
            ((View) tvVar.f30724b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f28714b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28714b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f28713a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
