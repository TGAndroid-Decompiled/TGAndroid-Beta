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
public class o80 extends Drawable {
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
    public final org.telegram.ui.ActionBar.i6 f38012a;
    public long f38013b;
    public long f38014c;
    public LinearGradient d;
    public LinearGradient f38015e;
    public final Matrix f38016f;
    public final Matrix f38017g;
    public int h;
    public int f38018i;
    public int f38019j;
    public int f38020k;
    public int f38021l;
    public int f38022m;
    public boolean f38023n;
    public Integer f38024o;
    public Integer f38025p;
    public Integer f38026q;
    public Integer f38027r;
    public int f38028s;
    public float f38029t;
    public float f38030u;
    public long v;
    public final Paint f38031w;
    public final Paint f38032x;
    public Path f38033y;
    public final Path f38034z;

    public o80(org.telegram.ui.ActionBar.i6 i6Var) {
        this();
        this.f38012a = i6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f38014c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f38031w);
        if (this.f38023n) {
            canvas.drawPath(path, this.f38032x);
        }
    }

    public final boolean c() {
        if (this.f38014c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f38014c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f38014c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f38014c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o80.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i7, int i10) {
        this.f38024o = Integer.valueOf(i7);
        this.f38025p = Integer.valueOf(i10);
        this.f38023n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f38024o = Integer.valueOf(i7);
        this.f38025p = Integer.valueOf(i10);
        this.f38023n = true;
        this.f38026q = Integer.valueOf(i11);
        this.f38027r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f38029t = 2.0f;
    }

    public final void i(float f10) {
        boolean z10;
        if (this.f38033y != null) {
            this.f38031w.setPathEffect(new CornerPathEffect(f10));
            this.f38032x.setPathEffect(new CornerPathEffect(f10));
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
            Path path = this.f38034z;
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
                Path path = this.f38034z;
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
        Path path = this.f38033y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38031w.setAlpha(i7);
        this.f38032x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38031w.setColorFilter(colorFilter);
    }

    public o80() {
        this.f38013b = -1L;
        this.f38014c = -1L;
        this.f38016f = new Matrix();
        this.f38017g = new Matrix();
        this.f38021l = org.telegram.ui.ActionBar.n6.f29469h5;
        this.f38022m = org.telegram.ui.ActionBar.n6.f29487i5;
        this.f38029t = 1.0f;
        this.f38030u = 1.0f;
        this.f38031w = new Paint(1);
        Paint paint = new Paint(1);
        this.f38032x = paint;
        this.f38034z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f24120p > 2.0f ? 2.0f : 1.0f);
    }
}
