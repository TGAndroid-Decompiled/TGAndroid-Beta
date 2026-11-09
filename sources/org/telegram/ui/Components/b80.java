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
public class b80 extends Drawable {
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
    public final org.telegram.ui.ActionBar.g6 f32166a;
    public long f32167b;
    public long f32168c;
    public LinearGradient d;
    public LinearGradient f32169e;
    public final Matrix f32170f;
    public final Matrix f32171g;
    public int h;
    public int f32172i;
    public int f32173j;
    public int f32174k;
    public int f32175l;
    public int f32176m;
    public boolean f32177n;
    public Integer f32178o;
    public Integer f32179p;
    public Integer f32180q;
    public Integer f32181r;
    public int f32182s;
    public float f32183t;
    public float f32184u;
    public long v;
    public final Paint f32185w;
    public final Paint f32186x;
    public Path f32187y;
    public final Path f32188z;

    public b80(org.telegram.ui.ActionBar.g6 g6Var) {
        this();
        this.f32166a = g6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f32168c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f32185w);
        if (this.f32177n) {
            canvas.drawPath(path, this.f32186x);
        }
    }

    public final boolean c() {
        if (this.f32168c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f32168c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f32168c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f32168c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b80.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i7, int i10) {
        this.f32178o = Integer.valueOf(i7);
        this.f32179p = Integer.valueOf(i10);
        this.f32177n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f32178o = Integer.valueOf(i7);
        this.f32179p = Integer.valueOf(i10);
        this.f32177n = true;
        this.f32180q = Integer.valueOf(i11);
        this.f32181r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f32183t = 2.0f;
    }

    public final void i(float f10) {
        boolean z9;
        if (this.f32187y != null) {
            this.f32185w.setPathEffect(new CornerPathEffect(f10));
            this.f32186x.setPathEffect(new CornerPathEffect(f10));
            return;
        }
        float[] fArr = this.B;
        if (fArr[0] == f10 && fArr[2] == f10 && fArr[4] == f10 && fArr[6] == f10) {
            z9 = false;
        } else {
            z9 = true;
        }
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[7] = f10;
        fArr[6] = f10;
        if (this.A != null && z9) {
            Path path = this.f32188z;
            path.rewind();
            Rect rect = this.A;
            RectF rectF = this.C;
            rectF.set(rect);
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }

    public final void j(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            boolean z9 = false;
            for (int i7 = 0; i7 < 8; i7++) {
                float[] fArr2 = this.B;
                float f10 = fArr2[i7];
                float f11 = fArr[i7];
                if (f10 != f11) {
                    fArr2[i7] = f11;
                    z9 = true;
                }
            }
            if (this.A != null && z9) {
                Path path = this.f32188z;
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
        Path path = this.f32187y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f32185w.setAlpha(i7);
        this.f32186x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32185w.setColorFilter(colorFilter);
    }

    public b80() {
        this.f32167b = -1L;
        this.f32168c = -1L;
        this.f32170f = new Matrix();
        this.f32171g = new Matrix();
        this.f32175l = org.telegram.ui.ActionBar.l6.f27938h5;
        this.f32176m = org.telegram.ui.ActionBar.l6.f27956i5;
        this.f32183t = 1.0f;
        this.f32184u = 1.0f;
        this.f32185w = new Paint(1);
        Paint paint = new Paint(1);
        this.f32186x = paint;
        this.f32188z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f22562p > 2.0f ? 2.0f : 1.0f);
    }
}
