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
    public final org.telegram.ui.ActionBar.h6 f38812a;
    public long f38813b;
    public long f38814c;
    public LinearGradient d;
    public LinearGradient f38815e;
    public final Matrix f38816f;
    public final Matrix f38817g;
    public int h;
    public int f38818i;
    public int f38819j;
    public int f38820k;
    public int f38821l;
    public int f38822m;
    public boolean f38823n;
    public Integer f38824o;
    public Integer f38825p;
    public Integer f38826q;
    public Integer f38827r;
    public int f38828s;
    public float f38829t;
    public float f38830u;
    public long v;
    public final Paint f38831w;
    public final Paint f38832x;
    public Path f38833y;
    public final Path f38834z;

    public q80(org.telegram.ui.ActionBar.h6 h6Var) {
        this();
        this.f38812a = h6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f38814c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f38831w);
        if (this.f38823n) {
            canvas.drawPath(path, this.f38832x);
        }
    }

    public final boolean c() {
        if (this.f38814c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f38814c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f38814c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f38814c)) < 320.0f) {
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
        this.f38824o = Integer.valueOf(i7);
        this.f38825p = Integer.valueOf(i10);
        this.f38823n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f38824o = Integer.valueOf(i7);
        this.f38825p = Integer.valueOf(i10);
        this.f38823n = true;
        this.f38826q = Integer.valueOf(i11);
        this.f38827r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f38829t = 2.0f;
    }

    public final void i(float f10) {
        boolean z10;
        if (this.f38833y != null) {
            this.f38831w.setPathEffect(new CornerPathEffect(f10));
            this.f38832x.setPathEffect(new CornerPathEffect(f10));
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
            Path path = this.f38834z;
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
                Path path = this.f38834z;
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
        Path path = this.f38833y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38831w.setAlpha(i7);
        this.f38832x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38831w.setColorFilter(colorFilter);
    }

    public q80() {
        this.f38813b = -1L;
        this.f38814c = -1L;
        this.f38816f = new Matrix();
        this.f38817g = new Matrix();
        this.f38821l = org.telegram.ui.ActionBar.m6.f29454h5;
        this.f38822m = org.telegram.ui.ActionBar.m6.f29472i5;
        this.f38829t = 1.0f;
        this.f38830u = 1.0f;
        this.f38831w = new Paint(1);
        Paint paint = new Paint(1);
        this.f38832x = paint;
        this.f38834z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f24045p > 2.0f ? 2.0f : 1.0f);
    }
}
