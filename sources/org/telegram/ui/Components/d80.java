package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public class d80 extends Drawable {
    public Rect A;
    public final float[] B;
    public final RectF C;
    public boolean D;
    public int E;
    public Paint F;
    public LinearGradient G;
    public Matrix H;
    public int I;
    public Paint J;
    public LinearGradient K;
    public Matrix L;
    public final org.telegram.ui.ActionBar.e6 f33866a;
    public long f33867b;
    public long f33868c;
    public LinearGradient d;
    public LinearGradient f33869e;
    public final Matrix f33870f;
    public final Matrix f33871g;
    public int h;
    public int f33872i;
    public int f33873j;
    public int f33874k;
    public int f33875l;
    public int f33876m;
    public boolean f33877n;
    public Integer f33878o;
    public Integer f33879p;
    public Integer f33880q;
    public Integer f33881r;
    public int f33882s;
    public float f33883t;
    public float f33884u;
    public long v;
    public final Paint f33885w;
    public final Paint f33886x;
    public Path f33887y;
    public final Path f33888z;

    public d80(org.telegram.ui.ActionBar.e6 e6Var) {
        this();
        this.f33866a = e6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f33868c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f33885w);
        if (this.f33877n) {
            canvas.drawPath(path, this.f33886x);
        }
    }

    public final boolean c() {
        if (this.f33868c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f33868c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f33868c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f33868c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d80.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i7, int i10) {
        this.f33878o = Integer.valueOf(i7);
        this.f33879p = Integer.valueOf(i10);
        this.f33877n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f33878o = Integer.valueOf(i7);
        this.f33879p = Integer.valueOf(i10);
        this.f33877n = true;
        this.f33880q = Integer.valueOf(i11);
        this.f33881r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f33883t = 2.0f;
    }

    public final void i(float f10) {
        boolean z10;
        if (this.f33887y != null) {
            this.f33885w.setPathEffect(new CornerPathEffect(f10));
            this.f33886x.setPathEffect(new CornerPathEffect(f10));
            return;
        }
        float[] fArr = this.B;
        if (fArr[0] == f10 && fArr[2] == f10 && fArr[4] == f10 && fArr[6] == f10) {
            z10 = false;
        } else {
            z10 = true;
        }
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[7] = f10;
        fArr[6] = f10;
        if (this.A != null && z10) {
            Path path = this.f33888z;
            path.rewind();
            Rect rect = this.A;
            RectF rectF = this.C;
            rectF.set(rect);
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }

    public final void j(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            boolean z10 = false;
            for (int i7 = 0; i7 < 8; i7++) {
                float[] fArr2 = this.B;
                float f10 = fArr2[i7];
                float f11 = fArr[i7];
                if (f10 != f11) {
                    fArr2[i7] = f11;
                    z10 = true;
                }
            }
            if (this.A != null && z10) {
                Path path = this.f33888z;
                path.rewind();
                Rect rect = this.A;
                RectF rectF = this.C;
                rectF.set(rect);
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
        }
    }

    public final void k(float f10) {
        i(org.telegram.messenger.g0.L(f10));
    }

    public final void l() {
        Path path = this.f33887y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f33885w.setAlpha(i7);
        this.f33886x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33885w.setColorFilter(colorFilter);
    }

    public d80() {
        this.f33867b = -1L;
        this.f33868c = -1L;
        this.f33870f = new Matrix();
        this.f33871g = new Matrix();
        this.f33875l = org.telegram.ui.ActionBar.j6.f28922h5;
        this.f33876m = org.telegram.ui.ActionBar.j6.f28940i5;
        this.f33883t = 1.0f;
        this.f33884u = 1.0f;
        this.f33885w = new Paint(1);
        Paint paint = new Paint(1);
        this.f33886x = paint;
        this.f33888z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f23610p > 2.0f ? 2.0f : 1.0f);
    }
}
