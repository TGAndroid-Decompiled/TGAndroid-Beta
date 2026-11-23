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
public class n80 extends Drawable {
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
    public final org.telegram.ui.ActionBar.i6 f37709a;
    public long f37710b;
    public long f37711c;
    public LinearGradient d;
    public LinearGradient f37712e;
    public final Matrix f37713f;
    public final Matrix f37714g;
    public int h;
    public int f37715i;
    public int f37716j;
    public int f37717k;
    public int f37718l;
    public int f37719m;
    public boolean f37720n;
    public Integer f37721o;
    public Integer f37722p;
    public Integer f37723q;
    public Integer f37724r;
    public int f37725s;
    public float f37726t;
    public float f37727u;
    public long v;
    public final Paint f37728w;
    public final Paint f37729x;
    public Path f37730y;
    public final Path f37731z;

    public n80(org.telegram.ui.ActionBar.i6 i6Var) {
        this();
        this.f37709a = i6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f37711c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f37728w);
        if (this.f37720n) {
            canvas.drawPath(path, this.f37729x);
        }
    }

    public final boolean c() {
        if (this.f37711c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f37711c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f37711c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f37711c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n80.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i7, int i10) {
        this.f37721o = Integer.valueOf(i7);
        this.f37722p = Integer.valueOf(i10);
        this.f37720n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f37721o = Integer.valueOf(i7);
        this.f37722p = Integer.valueOf(i10);
        this.f37720n = true;
        this.f37723q = Integer.valueOf(i11);
        this.f37724r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f37726t = 2.0f;
    }

    public final void i(float f10) {
        boolean z10;
        if (this.f37730y != null) {
            this.f37728w.setPathEffect(new CornerPathEffect(f10));
            this.f37729x.setPathEffect(new CornerPathEffect(f10));
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
            Path path = this.f37731z;
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
                Path path = this.f37731z;
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
        Path path = this.f37730y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f37728w.setAlpha(i7);
        this.f37729x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37728w.setColorFilter(colorFilter);
    }

    public n80() {
        this.f37710b = -1L;
        this.f37711c = -1L;
        this.f37713f = new Matrix();
        this.f37714g = new Matrix();
        this.f37718l = org.telegram.ui.ActionBar.n6.f29524h5;
        this.f37719m = org.telegram.ui.ActionBar.n6.f29542i5;
        this.f37726t = 1.0f;
        this.f37727u = 1.0f;
        this.f37728w = new Paint(1);
        Paint paint = new Paint(1);
        this.f37729x = paint;
        this.f37731z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f24225p > 2.0f ? 2.0f : 1.0f);
    }
}
