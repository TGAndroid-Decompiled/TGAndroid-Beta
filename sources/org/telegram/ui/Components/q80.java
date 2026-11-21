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
    public final org.telegram.ui.ActionBar.h6 f38819a;
    public long f38820b;
    public long f38821c;
    public LinearGradient d;
    public LinearGradient f38822e;
    public final Matrix f38823f;
    public final Matrix f38824g;
    public int h;
    public int f38825i;
    public int f38826j;
    public int f38827k;
    public int f38828l;
    public int f38829m;
    public boolean f38830n;
    public Integer f38831o;
    public Integer f38832p;
    public Integer f38833q;
    public Integer f38834r;
    public int f38835s;
    public float f38836t;
    public float f38837u;
    public long v;
    public final Paint f38838w;
    public final Paint f38839x;
    public Path f38840y;
    public final Path f38841z;

    public q80(org.telegram.ui.ActionBar.h6 h6Var) {
        this();
        this.f38819a = h6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f38821c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f38838w);
        if (this.f38830n) {
            canvas.drawPath(path, this.f38839x);
        }
    }

    public final boolean c() {
        if (this.f38821c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f38821c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f38821c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f38821c)) < 320.0f) {
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
        this.f38831o = Integer.valueOf(i7);
        this.f38832p = Integer.valueOf(i10);
        this.f38830n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f38831o = Integer.valueOf(i7);
        this.f38832p = Integer.valueOf(i10);
        this.f38830n = true;
        this.f38833q = Integer.valueOf(i11);
        this.f38834r = Integer.valueOf(i12);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f38836t = 2.0f;
    }

    public final void i(float f10) {
        boolean z10;
        if (this.f38840y != null) {
            this.f38838w.setPathEffect(new CornerPathEffect(f10));
            this.f38839x.setPathEffect(new CornerPathEffect(f10));
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
            Path path = this.f38841z;
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
                Path path = this.f38841z;
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
        Path path = this.f38840y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38838w.setAlpha(i7);
        this.f38839x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38838w.setColorFilter(colorFilter);
    }

    public q80() {
        this.f38820b = -1L;
        this.f38821c = -1L;
        this.f38823f = new Matrix();
        this.f38824g = new Matrix();
        this.f38828l = org.telegram.ui.ActionBar.m6.f29451h5;
        this.f38829m = org.telegram.ui.ActionBar.m6.f29469i5;
        this.f38836t = 1.0f;
        this.f38837u = 1.0f;
        this.f38838w = new Paint(1);
        Paint paint = new Paint(1);
        this.f38839x = paint;
        this.f38841z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.f24145p > 2.0f ? 2.0f : 1.0f);
    }
}
