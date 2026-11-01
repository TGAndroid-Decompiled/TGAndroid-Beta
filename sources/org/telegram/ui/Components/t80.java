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
public class t80 extends Drawable {
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
    public final org.telegram.ui.ActionBar.p6 f30573a;
    public long f30574b;
    public long f30575c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f30576f;
    public final Matrix f30577g;
    public int h;
    public int f30578i;
    public int f30579j;
    public int f30580k;
    public int f30581l;
    public int f30582m;
    public boolean f30583n;
    public Integer f30584o;
    public Integer f30585p;
    public Integer f30586q;
    public Integer f30587r;
    public int f30588s;
    public float f30589t;
    public float f30590u;
    public long v;
    public final Paint f30591w;
    public final Paint f30592x;
    public Path f30593y;
    public final Path f30594z;

    public t80(org.telegram.ui.ActionBar.p6 p6Var) {
        this();
        this.f30573a = p6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f30575c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f30591w);
        if (this.f30583n) {
            canvas.drawPath(path, this.f30592x);
        }
    }

    public final boolean c() {
        if (this.f30575c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f30575c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f30575c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f30575c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t80.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i10, int i11) {
        this.f30584o = Integer.valueOf(i10);
        this.f30585p = Integer.valueOf(i11);
        this.f30583n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f30584o = Integer.valueOf(i10);
        this.f30585p = Integer.valueOf(i11);
        this.f30583n = true;
        this.f30586q = Integer.valueOf(i12);
        this.f30587r = Integer.valueOf(i13);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f30589t = 2.0f;
    }

    public final void i(float f7) {
        boolean z10;
        if (this.f30593y != null) {
            this.f30591w.setPathEffect(new CornerPathEffect(f7));
            this.f30592x.setPathEffect(new CornerPathEffect(f7));
            return;
        }
        float[] fArr = this.B;
        if (fArr[0] == f7 && fArr[2] == f7 && fArr[4] == f7 && fArr[6] == f7) {
            z10 = false;
        } else {
            z10 = true;
        }
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[5] = f7;
        fArr[4] = f7;
        fArr[7] = f7;
        fArr[6] = f7;
        if (this.A != null && z10) {
            Path path = this.f30594z;
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
            for (int i10 = 0; i10 < 8; i10++) {
                float[] fArr2 = this.B;
                float f7 = fArr2[i10];
                float f10 = fArr[i10];
                if (f7 != f10) {
                    fArr2[i10] = f10;
                    z10 = true;
                }
            }
            if (this.A != null && z10) {
                Path path = this.f30594z;
                path.rewind();
                Rect rect = this.A;
                RectF rectF = this.C;
                rectF.set(rect);
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
        }
    }

    public final void k(float f7) {
        i(org.telegram.messenger.i0.L(f7));
    }

    public final void l() {
        Path path = this.f30593y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.i0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30591w.setAlpha(i10);
        this.f30592x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30591w.setColorFilter(colorFilter);
    }

    public t80() {
        this.f30574b = -1L;
        this.f30575c = -1L;
        this.f30576f = new Matrix();
        this.f30577g = new Matrix();
        this.f30581l = org.telegram.ui.ActionBar.t6.f21002h5;
        this.f30582m = org.telegram.ui.ActionBar.t6.f21020i5;
        this.f30589t = 1.0f;
        this.f30590u = 1.0f;
        this.f30591w = new Paint(1);
        Paint paint = new Paint(1);
        this.f30592x = paint;
        this.f30594z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.f16171p > 2.0f ? 2.0f : 1.0f);
    }
}
