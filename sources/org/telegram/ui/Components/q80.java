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
public class q80 extends Drawable {
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
    public final org.telegram.ui.ActionBar.h6 f38766a;
    public long f38767b;
    public long f38768c;
    public LinearGradient d;
    public LinearGradient f38769e;
    public final Matrix f38770f;
    public final Matrix f38771g;
    public int h;
    public int f38772i;
    public int f38773j;
    public int f38774k;
    public int f38775l;
    public int f38776m;
    public boolean f38777n;
    public Integer f38778o;
    public Integer f38779p;
    public Integer f38780q;
    public Integer f38781r;
    public int f38782s;
    public float f38783t;
    public float f38784u;
    public long v;
    public final Paint f38785w;
    public final Paint f38786x;
    public Path f38787y;
    public final Path f38788z;

    public q80(org.telegram.ui.ActionBar.h6 h6Var) {
        this();
        this.f38766a = h6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f38768c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f38785w);
        if (this.f38777n) {
            canvas.drawPath(path, this.f38786x);
        }
    }

    public final boolean c() {
        if (this.f38768c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f38768c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f38768c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f38768c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q80.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i7, int i10) {
        this.f38778o = Integer.valueOf(i7);
        this.f38779p = Integer.valueOf(i10);
        this.f38777n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f38778o = Integer.valueOf(i7);
        this.f38779p = Integer.valueOf(i10);
        this.f38777n = true;
        this.f38780q = Integer.valueOf(i11);
        this.f38781r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f38783t = 2.0f;
    }

    public final void i(float f10) {
        boolean z10;
        if (this.f38787y != null) {
            this.f38785w.setPathEffect(new CornerPathEffect(f10));
            this.f38786x.setPathEffect(new CornerPathEffect(f10));
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
            Path path = this.f38788z;
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
                Path path = this.f38788z;
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
        Path path = this.f38787y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38785w.setAlpha(i7);
        this.f38786x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38785w.setColorFilter(colorFilter);
    }

    public q80() {
        this.f38767b = -1L;
        this.f38768c = -1L;
        this.f38770f = new Matrix();
        this.f38771g = new Matrix();
        this.f38775l = org.telegram.ui.ActionBar.m6.f29420h5;
        this.f38776m = org.telegram.ui.ActionBar.m6.f29438i5;
        this.f38783t = 1.0f;
        this.f38784u = 1.0f;
        this.f38785w = new Paint(1);
        Paint paint = new Paint(1);
        this.f38786x = paint;
        this.f38788z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f24009p > 2.0f ? 2.0f : 1.0f);
    }
}
