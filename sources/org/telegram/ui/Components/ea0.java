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
import org.telegram.messenger.AndroidUtilities;
public class ea0 extends Drawable {
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
    public final org.telegram.ui.ActionBar.u6 f27786a;
    public long f27787b;
    public long f27788c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f27789f;
    public final Matrix f27790g;
    public int h;
    public int f27791i;
    public int f27792j;
    public int f27793k;
    public int f27794l;
    public int f27795m;
    public boolean f27796n;
    public Integer f27797o;
    public Integer f27798p;
    public Integer f27799q;
    public Integer f27800r;
    public int f27801s;
    public float f27802t;
    public float f27803u;
    public long v;
    public final Paint f27804w;
    public final Paint f27805x;
    public Path f27806y;
    public final Path f27807z;

    public ea0(org.telegram.ui.ActionBar.u6 u6Var) {
        this();
        this.f27786a = u6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f27788c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f27804w);
        if (this.f27796n) {
            canvas.drawPath(path, this.f27805x);
        }
    }

    public final boolean c() {
        if (this.f27788c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27788c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f27788c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27788c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ea0.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i10, int i11) {
        this.f27797o = Integer.valueOf(i10);
        this.f27798p = Integer.valueOf(i11);
        this.f27796n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f27797o = Integer.valueOf(i10);
        this.f27798p = Integer.valueOf(i11);
        this.f27796n = true;
        this.f27799q = Integer.valueOf(i12);
        this.f27800r = Integer.valueOf(i13);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f27802t = 2.0f;
    }

    public final void i(float f7) {
        boolean z10;
        if (this.f27806y != null) {
            this.f27804w.setPathEffect(new CornerPathEffect(f7));
            this.f27805x.setPathEffect(new CornerPathEffect(f7));
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
            Path path = this.f27807z;
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
                Path path = this.f27807z;
                path.rewind();
                Rect rect = this.A;
                RectF rectF = this.C;
                rectF.set(rect);
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
        }
    }

    public final void k(float f7) {
        i(AndroidUtilities.dp(f7));
    }

    public final void l() {
        Path path = this.f27806y;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27804w.setAlpha(i10);
        this.f27805x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27804w.setColorFilter(colorFilter);
    }

    public ea0() {
        this.f27787b = -1L;
        this.f27788c = -1L;
        this.f27789f = new Matrix();
        this.f27790g = new Matrix();
        this.f27794l = org.telegram.ui.ActionBar.y6.f23428h5;
        this.f27795m = org.telegram.ui.ActionBar.y6.f23448i5;
        this.f27802t = 1.0f;
        this.f27803u = 1.0f;
        this.f27804w = new Paint(1);
        Paint paint = new Paint(1);
        this.f27805x = paint;
        this.f27807z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
