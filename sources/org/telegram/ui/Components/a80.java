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
    public final org.telegram.ui.ActionBar.h6 f31772a;
    public long f31773b;
    public long f31774c;
    public LinearGradient d;
    public LinearGradient f31775e;
    public final Matrix f31776f;
    public final Matrix f31777g;
    public int h;
    public int f31778i;
    public int f31779j;
    public int f31780k;
    public int f31781l;
    public int f31782m;
    public boolean f31783n;
    public Integer f31784o;
    public Integer f31785p;
    public Integer f31786q;
    public Integer f31787r;
    public int f31788s;
    public float f31789t;
    public float f31790u;
    public long v;
    public final Paint f31791w;
    public final Paint f31792x;
    public Path f31793y;
    public final Path f31794z;

    public a80(org.telegram.ui.ActionBar.h6 h6Var) {
        this();
        this.f31772a = h6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f31774c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f31791w);
        if (this.f31783n) {
            canvas.drawPath(path, this.f31792x);
        }
    }

    public final boolean c() {
        if (this.f31774c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f31774c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f31774c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f31774c)) < 320.0f) {
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
        this.f31784o = Integer.valueOf(i7);
        this.f31785p = Integer.valueOf(i10);
        this.f31783n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f31784o = Integer.valueOf(i7);
        this.f31785p = Integer.valueOf(i10);
        this.f31783n = true;
        this.f31786q = Integer.valueOf(i11);
        this.f31787r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f31789t = 2.0f;
    }

    public final void i(float f10) {
        boolean z9;
        if (this.f31793y != null) {
            this.f31791w.setPathEffect(new CornerPathEffect(f10));
            this.f31792x.setPathEffect(new CornerPathEffect(f10));
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
            Path path = this.f31794z;
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
                Path path = this.f31794z;
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
        Path path = this.f31793y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f31791w.setAlpha(i7);
        this.f31792x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31791w.setColorFilter(colorFilter);
    }

    public a80() {
        this.f31773b = -1L;
        this.f31774c = -1L;
        this.f31776f = new Matrix();
        this.f31777g = new Matrix();
        this.f31781l = org.telegram.ui.ActionBar.m6.f27963h5;
        this.f31782m = org.telegram.ui.ActionBar.m6.f27981i5;
        this.f31789t = 1.0f;
        this.f31790u = 1.0f;
        this.f31791w = new Paint(1);
        Paint paint = new Paint(1);
        this.f31792x = paint;
        this.f31794z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f22566p > 2.0f ? 2.0f : 1.0f);
    }
}
