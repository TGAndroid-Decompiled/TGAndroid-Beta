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
    public final org.telegram.ui.ActionBar.p6 f30501a;
    public long f30502b;
    public long f30503c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f30504f;
    public final Matrix f30505g;
    public int h;
    public int f30506i;
    public int f30507j;
    public int f30508k;
    public int f30509l;
    public int f30510m;
    public boolean f30511n;
    public Integer f30512o;
    public Integer f30513p;
    public Integer f30514q;
    public Integer f30515r;
    public int f30516s;
    public float f30517t;
    public float f30518u;
    public long v;
    public final Paint f30519w;
    public final Paint f30520x;
    public Path f30521y;
    public final Path f30522z;

    public t80(org.telegram.ui.ActionBar.p6 p6Var) {
        this();
        this.f30501a = p6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f30503c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f30519w);
        if (this.f30511n) {
            canvas.drawPath(path, this.f30520x);
        }
    }

    public final boolean c() {
        if (this.f30503c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f30503c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f30503c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f30503c)) < 320.0f) {
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
        this.f30512o = Integer.valueOf(i10);
        this.f30513p = Integer.valueOf(i11);
        this.f30511n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f30512o = Integer.valueOf(i10);
        this.f30513p = Integer.valueOf(i11);
        this.f30511n = true;
        this.f30514q = Integer.valueOf(i12);
        this.f30515r = Integer.valueOf(i13);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f30517t = 2.0f;
    }

    public final void i(float f7) {
        boolean z10;
        if (this.f30521y != null) {
            this.f30519w.setPathEffect(new CornerPathEffect(f7));
            this.f30520x.setPathEffect(new CornerPathEffect(f7));
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
            Path path = this.f30522z;
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
                Path path = this.f30522z;
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
        Path path = this.f30521y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.i0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30519w.setAlpha(i10);
        this.f30520x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30519w.setColorFilter(colorFilter);
    }

    public t80() {
        this.f30502b = -1L;
        this.f30503c = -1L;
        this.f30504f = new Matrix();
        this.f30505g = new Matrix();
        this.f30509l = org.telegram.ui.ActionBar.t6.f21001h5;
        this.f30510m = org.telegram.ui.ActionBar.t6.f21019i5;
        this.f30517t = 1.0f;
        this.f30518u = 1.0f;
        this.f30519w = new Paint(1);
        Paint paint = new Paint(1);
        this.f30520x = paint;
        this.f30522z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.f16025p > 2.0f ? 2.0f : 1.0f);
    }
}
