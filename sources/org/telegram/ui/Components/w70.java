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
public class w70 extends Drawable {
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
    public final org.telegram.ui.ActionBar.e6 f39924a;
    public long f39925b;
    public long f39926c;
    public LinearGradient d;
    public LinearGradient f39927e;
    public final Matrix f39928f;
    public final Matrix f39929g;
    public int h;
    public int f39930i;
    public int f39931j;
    public int f39932k;
    public int f39933l;
    public int f39934m;
    public boolean f39935n;
    public Integer f39936o;
    public Integer f39937p;
    public Integer f39938q;
    public Integer f39939r;
    public int f39940s;
    public float f39941t;
    public float f39942u;
    public long v;
    public final Paint f39943w;
    public final Paint f39944x;
    public Path f39945y;
    public final Path f39946z;

    public w70(org.telegram.ui.ActionBar.e6 e6Var) {
        this();
        this.f39924a = e6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f39926c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f39943w);
        if (this.f39935n) {
            canvas.drawPath(path, this.f39944x);
        }
    }

    public final boolean c() {
        if (this.f39926c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f39926c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f39926c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f39926c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w70.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i3, int i10) {
        this.f39936o = Integer.valueOf(i3);
        this.f39937p = Integer.valueOf(i10);
        this.f39935n = false;
    }

    public final void g(int i3, int i10, int i11, int i12) {
        this.f39936o = Integer.valueOf(i3);
        this.f39937p = Integer.valueOf(i10);
        this.f39935n = true;
        this.f39938q = Integer.valueOf(i11);
        this.f39939r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f39941t = 2.0f;
    }

    public final void i(float f10) {
        boolean z10;
        if (this.f39945y != null) {
            this.f39943w.setPathEffect(new CornerPathEffect(f10));
            this.f39944x.setPathEffect(new CornerPathEffect(f10));
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
            Path path = this.f39946z;
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
            for (int i3 = 0; i3 < 8; i3++) {
                float[] fArr2 = this.B;
                float f10 = fArr2[i3];
                float f11 = fArr[i3];
                if (f10 != f11) {
                    fArr2[i3] = f11;
                    z10 = true;
                }
            }
            if (this.A != null && z10) {
                Path path = this.f39946z;
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
        Path path = this.f39945y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i3) {
        this.f39943w.setAlpha(i3);
        this.f39944x.setAlpha(i3);
        if (i3 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f39943w.setColorFilter(colorFilter);
    }

    public w70() {
        this.f39925b = -1L;
        this.f39926c = -1L;
        this.f39928f = new Matrix();
        this.f39929g = new Matrix();
        this.f39933l = org.telegram.ui.ActionBar.k6.f27954h5;
        this.f39934m = org.telegram.ui.ActionBar.k6.f27971i5;
        this.f39941t = 1.0f;
        this.f39942u = 1.0f;
        this.f39943w = new Paint(1);
        Paint paint = new Paint(1);
        this.f39944x = paint;
        this.f39946z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f22607p > 2.0f ? 2.0f : 1.0f);
    }
}
