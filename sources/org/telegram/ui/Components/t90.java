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
    public final TextPaint f30559a;
    public final Paint f30560b;
    public final Paint f30561c;
    public final Paint d;
    public final Paint f30562e;
    public final RectF f30563f;
    public PorterDuffColorFilter f30564g;
    public float h;
    public final DecelerateInterpolator f30565i;
    public boolean f30566j;
    public float f30567k;
    public int f30568l;
    public String f30569m;
    public int f30570n;
    public float f30571o;
    public int f30572p;
    public int f30573q;
    public float f30574r;
    public float f30575s;
    public long f30576t;
    public boolean f30577u;
    public float v;
    public float f30578w;
    public float f30579x;
    public float f30580y;
    public float f30581z;

    public t90() {
        TextPaint textPaint = new TextPaint(1);
        this.f30559a = textPaint;
        Paint paint = new Paint(1);
        this.f30560b = paint;
        this.f30561c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f30562e = paint3;
        this.f30563f = new RectF();
        this.h = 1.0f;
        this.f30565i = new DecelerateInterpolator();
        this.f30567k = 400.0f;
        this.f30568l = -1;
        this.f30571o = 1.0f;
        this.f30574r = 1.0f;
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
            Shader shader = f5Var2.f20424a;
            Matrix matrix = f5Var2.f20432k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20439r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20439r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f30577u) {
            return this.f30574r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f30560b.setColor(i11);
        this.d.setColor(i11);
        this.f30562e.setColor(i11);
        this.f30559a.setColor(i11);
        this.f30564g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f30572p == i10 && (i12 = this.f30573q) != i10) {
            this.f30572p = i12;
            this.f30574r = 1.0f;
        }
        if (z10) {
            int i13 = this.f30572p;
            if (i13 != i10 && (i11 = this.f30573q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f30567k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f30567k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f30567k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f30567k = 160.0f;
                } else {
                    this.f30567k = 220.0f;
                }
                if (this.f30577u) {
                    this.f30572p = i11;
                }
                this.f30577u = true;
                this.f30573q = i10;
                this.f30575s = this.f30574r;
                this.f30574r = 0.0f;
            } else {
                return;
            }
        } else if (this.f30572p == i10) {
            return;
        } else {
            this.f30577u = false;
            this.f30573q = i10;
            this.f30572p = i10;
            this.f30575s = this.f30574r;
            this.f30574r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f30579x = 0.0f;
            this.f30580y = 0.0f;
            this.f30581z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f30578w == f7) {
            return;
        }
        if (!z10) {
            this.f30579x = f7;
            this.f30580y = f7;
        } else {
            if (this.f30579x > f7) {
                this.f30579x = f7;
            }
            this.f30580y = this.f30579x;
        }
        this.f30578w = f7;
        this.f30581z = 0.0f;
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
            ((View) kvVar.f27908b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f30560b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30560b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f30562e.setColorFilter(colorFilter);
        this.f30559a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
