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
    public final org.telegram.ui.ActionBar.f6 f31714a;
    public long f31715b;
    public long f31716c;
    public LinearGradient d;
    public LinearGradient f31717e;
    public final Matrix f31718f;
    public final Matrix f31719g;
    public int h;
    public int f31720i;
    public int f31721j;
    public int f31722k;
    public int f31723l;
    public int f31724m;
    public boolean f31725n;
    public Integer f31726o;
    public Integer f31727p;
    public Integer f31728q;
    public Integer f31729r;
    public int f31730s;
    public float f31731t;
    public float f31732u;
    public long v;
    public final Paint f31733w;
    public final Paint f31734x;
    public Path f31735y;
    public final Path f31736z;

    public a80(org.telegram.ui.ActionBar.f6 f6Var) {
        this();
        this.f31714a = f6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f31716c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f31733w);
        if (this.f31725n) {
            canvas.drawPath(path, this.f31734x);
        }
    }

    public final boolean c() {
        if (this.f31716c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f31716c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f31716c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f31716c)) < 320.0f) {
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
        this.f31726o = Integer.valueOf(i7);
        this.f31727p = Integer.valueOf(i10);
        this.f31725n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f31726o = Integer.valueOf(i7);
        this.f31727p = Integer.valueOf(i10);
        this.f31725n = true;
        this.f31728q = Integer.valueOf(i11);
        this.f31729r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f31731t = 2.0f;
    }

    public final void i(float f10) {
        boolean z9;
        if (this.f31735y != null) {
            this.f31733w.setPathEffect(new CornerPathEffect(f10));
            this.f31734x.setPathEffect(new CornerPathEffect(f10));
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
            Path path = this.f31736z;
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
                Path path = this.f31736z;
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
        Path path = this.f31735y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f31733w.setAlpha(i7);
        this.f31734x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31733w.setColorFilter(colorFilter);
    }

    public a80() {
        this.f31715b = -1L;
        this.f31716c = -1L;
        this.f31718f = new Matrix();
        this.f31719g = new Matrix();
        this.f31723l = org.telegram.ui.ActionBar.k6.f27921h5;
        this.f31724m = org.telegram.ui.ActionBar.k6.f27939i5;
        this.f31731t = 1.0f;
        this.f31732u = 1.0f;
        this.f31733w = new Paint(1);
        Paint paint = new Paint(1);
        this.f31734x = paint;
        this.f31736z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f22536p > 2.0f ? 2.0f : 1.0f);
    }
}
