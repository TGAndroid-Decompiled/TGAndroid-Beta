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
    public final TextPaint f30560a;
    public final Paint f30561b;
    public final Paint f30562c;
    public final Paint d;
    public final Paint f30563e;
    public final RectF f30564f;
    public PorterDuffColorFilter f30565g;
    public float h;
    public final DecelerateInterpolator f30566i;
    public boolean f30567j;
    public float f30568k;
    public int f30569l;
    public String f30570m;
    public int f30571n;
    public float f30572o;
    public int f30573p;
    public int f30574q;
    public float f30575r;
    public float f30576s;
    public long f30577t;
    public boolean f30578u;
    public float v;
    public float f30579w;
    public float f30580x;
    public float f30581y;
    public float f30582z;

    public t90() {
        TextPaint textPaint = new TextPaint(1);
        this.f30560a = textPaint;
        Paint paint = new Paint(1);
        this.f30561b = paint;
        this.f30562c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f30563e = paint3;
        this.f30564f = new RectF();
        this.h = 1.0f;
        this.f30566i = new DecelerateInterpolator();
        this.f30568k = 400.0f;
        this.f30569l = -1;
        this.f30572o = 1.0f;
        this.f30575r = 1.0f;
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
            Shader shader = f5Var2.f20425a;
            Matrix matrix = f5Var2.f20433k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20440r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20440r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f30578u) {
            return this.f30575r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f30561b.setColor(i11);
        this.d.setColor(i11);
        this.f30563e.setColor(i11);
        this.f30560a.setColor(i11);
        this.f30565g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f30573p == i10 && (i12 = this.f30574q) != i10) {
            this.f30573p = i12;
            this.f30575r = 1.0f;
        }
        if (z10) {
            int i13 = this.f30573p;
            if (i13 != i10 && (i11 = this.f30574q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f30568k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f30568k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f30568k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f30568k = 160.0f;
                } else {
                    this.f30568k = 220.0f;
                }
                if (this.f30578u) {
                    this.f30573p = i11;
                }
                this.f30578u = true;
                this.f30574q = i10;
                this.f30576s = this.f30575r;
                this.f30575r = 0.0f;
            } else {
                return;
            }
        } else if (this.f30573p == i10) {
            return;
        } else {
            this.f30578u = false;
            this.f30574q = i10;
            this.f30573p = i10;
            this.f30576s = this.f30575r;
            this.f30575r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f30580x = 0.0f;
            this.f30581y = 0.0f;
            this.f30582z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f30579w == f7) {
            return;
        }
        if (!z10) {
            this.f30580x = f7;
            this.f30581y = f7;
        } else {
            if (this.f30580x > f7) {
                this.f30580x = f7;
            }
            this.f30581y = this.f30580x;
        }
        this.f30579w = f7;
        this.f30582z = 0.0f;
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
            ((View) kvVar.f27909b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f30561b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30561b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f30563e.setColorFilter(colorFilter);
        this.f30560a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
