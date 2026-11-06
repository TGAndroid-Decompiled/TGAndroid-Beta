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
public class a80 extends Drawable {
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
    public final org.telegram.ui.ActionBar.f6 f31722a;
    public long f31723b;
    public long f31724c;
    public LinearGradient d;
    public LinearGradient f31725e;
    public final Matrix f31726f;
    public final Matrix f31727g;
    public int h;
    public int f31728i;
    public int f31729j;
    public int f31730k;
    public int f31731l;
    public int f31732m;
    public boolean f31733n;
    public Integer f31734o;
    public Integer f31735p;
    public Integer f31736q;
    public Integer f31737r;
    public int f31738s;
    public float f31739t;
    public float f31740u;
    public long v;
    public final Paint f31741w;
    public final Paint f31742x;
    public Path f31743y;
    public final Path f31744z;

    public a80(org.telegram.ui.ActionBar.f6 f6Var) {
        this();
        this.f31722a = f6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f31724c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f31741w);
        if (this.f31733n) {
            canvas.drawPath(path, this.f31742x);
        }
    }

    public final boolean c() {
        if (this.f31724c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f31724c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f31724c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f31724c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a80.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i7, int i10) {
        this.f31734o = Integer.valueOf(i7);
        this.f31735p = Integer.valueOf(i10);
        this.f31733n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f31734o = Integer.valueOf(i7);
        this.f31735p = Integer.valueOf(i10);
        this.f31733n = true;
        this.f31736q = Integer.valueOf(i11);
        this.f31737r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f31739t = 2.0f;
    }

    public final void i(float f10) {
        boolean z9;
        if (this.f31743y != null) {
            this.f31741w.setPathEffect(new CornerPathEffect(f10));
            this.f31742x.setPathEffect(new CornerPathEffect(f10));
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
            Path path = this.f31744z;
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
                Path path = this.f31744z;
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
        Path path = this.f31743y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f31741w.setAlpha(i7);
        this.f31742x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31741w.setColorFilter(colorFilter);
    }

    public a80() {
        this.f31723b = -1L;
        this.f31724c = -1L;
        this.f31726f = new Matrix();
        this.f31727g = new Matrix();
        this.f31731l = org.telegram.ui.ActionBar.k6.f27922h5;
        this.f31732m = org.telegram.ui.ActionBar.k6.f27940i5;
        this.f31739t = 1.0f;
        this.f31740u = 1.0f;
        this.f31741w = new Paint(1);
        Paint paint = new Paint(1);
        this.f31742x = paint;
        this.f31744z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f22543p > 2.0f ? 2.0f : 1.0f);
    }
}
