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
    public final org.telegram.ui.ActionBar.h6 f38813a;
    public long f38814b;
    public long f38815c;
    public LinearGradient d;
    public LinearGradient f38816e;
    public final Matrix f38817f;
    public final Matrix f38818g;
    public int h;
    public int f38819i;
    public int f38820j;
    public int f38821k;
    public int f38822l;
    public int f38823m;
    public boolean f38824n;
    public Integer f38825o;
    public Integer f38826p;
    public Integer f38827q;
    public Integer f38828r;
    public int f38829s;
    public float f38830t;
    public float f38831u;
    public long v;
    public final Paint f38832w;
    public final Paint f38833x;
    public Path f38834y;
    public final Path f38835z;

    public q80(org.telegram.ui.ActionBar.h6 h6Var) {
        this();
        this.f38813a = h6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f38815c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f38832w);
        if (this.f38824n) {
            canvas.drawPath(path, this.f38833x);
        }
    }

    public final boolean c() {
        if (this.f38815c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f38815c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f38815c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f38815c)) < 320.0f) {
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
        this.f38825o = Integer.valueOf(i7);
        this.f38826p = Integer.valueOf(i10);
        this.f38824n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f38825o = Integer.valueOf(i7);
        this.f38826p = Integer.valueOf(i10);
        this.f38824n = true;
        this.f38827q = Integer.valueOf(i11);
        this.f38828r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f38830t = 2.0f;
    }

    public final void i(float f10) {
        boolean z10;
        if (this.f38834y != null) {
            this.f38832w.setPathEffect(new CornerPathEffect(f10));
            this.f38833x.setPathEffect(new CornerPathEffect(f10));
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
            Path path = this.f38835z;
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
                Path path = this.f38835z;
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
        Path path = this.f38834y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38832w.setAlpha(i7);
        this.f38833x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38832w.setColorFilter(colorFilter);
    }

    public q80() {
        this.f38814b = -1L;
        this.f38815c = -1L;
        this.f38817f = new Matrix();
        this.f38818g = new Matrix();
        this.f38822l = org.telegram.ui.ActionBar.m6.f29454h5;
        this.f38823m = org.telegram.ui.ActionBar.m6.f29472i5;
        this.f38830t = 1.0f;
        this.f38831u = 1.0f;
        this.f38832w = new Paint(1);
        Paint paint = new Paint(1);
        this.f38833x = paint;
        this.f38835z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f24045p > 2.0f ? 2.0f : 1.0f);
    }
}
