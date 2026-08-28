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
public final class b90 extends Drawable {
    public wu A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f27097a;
    public final Paint f27098b;
    public final Paint f27099c;
    public final Paint d;
    public final Paint f27100e;
    public final RectF f27101f;
    public PorterDuffColorFilter f27102g;
    public float h;
    public final DecelerateInterpolator f27103i;
    public boolean f27104j;
    public float f27105k;
    public int f27106l;
    public String f27107m;
    public int f27108n;
    public float f27109o;
    public int f27110p;
    public int f27111q;
    public float f27112r;
    public float f27113s;
    public long f27114t;
    public boolean f27115u;
    public float v;
    public float f27116w;
    public float f27117x;
    public float f27118y;
    public float f27119z;

    public b90() {
        TextPaint textPaint = new TextPaint(1);
        this.f27097a = textPaint;
        Paint paint = new Paint(1);
        this.f27098b = paint;
        this.f27099c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f27100e = paint3;
        this.f27101f = new RectF();
        this.h = 1.0f;
        this.f27103i = new DecelerateInterpolator();
        this.f27105k = 400.0f;
        this.f27106l = -1;
        this.f27109o = 1.0f;
        this.f27112r = 1.0f;
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
            Shader shader = d5Var2.f22843a;
            Matrix matrix = d5Var2.f22851k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f22858r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f22858r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f27115u) {
            return this.f27112r;
        }
        return 1.0f;
    }

    public final void c(int i9) {
        int i10 = (-16777216) | i9;
        this.f27098b.setColor(i10);
        this.d.setColor(i10);
        this.f27100e.setColor(i10);
        this.f27097a.setColor(i10);
        this.f27102g = new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i9, boolean z10) {
        int i10;
        int i11;
        if (this.f27110p == i9 && (i11 = this.f27111q) != i9) {
            this.f27110p = i11;
            this.f27112r = 1.0f;
        }
        if (z10) {
            int i12 = this.f27110p;
            if (i12 != i9 && (i10 = this.f27111q) != i9) {
                if ((i12 == 0 && i9 == 1) || (i12 == 1 && i9 == 0)) {
                    this.f27105k = 300.0f;
                } else if (i12 == 2 && (i9 == 3 || i9 == 14)) {
                    this.f27105k = 400.0f;
                } else if (i12 != 4 && i9 == 6) {
                    this.f27105k = 360.0f;
                } else if ((i12 == 4 && i9 == 14) || (i12 == 14 && i9 == 4)) {
                    this.f27105k = 160.0f;
                } else {
                    this.f27105k = 220.0f;
                }
                if (this.f27115u) {
                    this.f27110p = i10;
                }
                this.f27115u = true;
                this.f27111q = i9;
                this.f27113s = this.f27112r;
                this.f27112r = 0.0f;
            } else {
                return;
            }
        } else if (this.f27110p == i9) {
            return;
        } else {
            this.f27115u = false;
            this.f27111q = i9;
            this.f27110p = i9;
            this.f27113s = this.f27112r;
            this.f27112r = 1.0f;
        }
        if (i9 == 3 || i9 == 14) {
            this.v = 112.0f;
            this.f27117x = 0.0f;
            this.f27118y = 0.0f;
            this.f27119z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f10, boolean z10) {
        if (this.f27116w == f10) {
            return;
        }
        if (!z10) {
            this.f27117x = f10;
            this.f27118y = f10;
        } else {
            if (this.f27117x > f10) {
                this.f27117x = f10;
            }
            this.f27118y = this.f27117x;
        }
        this.f27116w = f10;
        this.f27119z = 0.0f;
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
        wu wuVar = this.A;
        if (wuVar != null) {
            ((View) wuVar.f34373b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        float dp = (i11 - i9) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f27098b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27098b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f27100e.setColorFilter(colorFilter);
        this.f27097a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i9) {
    }
}
