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
public class ia0 extends Drawable {
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
    public final org.telegram.ui.ActionBar.e6 f27320a;
    public long f27321b;
    public long f27322c;
    public LinearGradient d;
    public LinearGradient f27323e;
    public final Matrix f27324f;
    public final Matrix f27325g;
    public int h;
    public int f27326i;
    public int f27327j;
    public int f27328k;
    public int f27329l;
    public int f27330m;
    public boolean f27331n;
    public Integer f27332o;
    public Integer f27333p;
    public Integer f27334q;
    public Integer f27335r;
    public int f27336s;
    public float f27337t;
    public float f27338u;
    public long v;
    public final Paint f27339w;
    public final Paint f27340x;
    public Path f27341y;
    public final Path f27342z;

    public ia0(org.telegram.ui.ActionBar.e6 e6Var) {
        this();
        this.f27320a = e6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f27322c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f27339w);
        if (this.f27331n) {
            canvas.drawPath(path, this.f27340x);
        }
    }

    public final boolean c() {
        if (this.f27322c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27322c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f27322c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27322c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ia0.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i10, int i11) {
        this.f27332o = Integer.valueOf(i10);
        this.f27333p = Integer.valueOf(i11);
        this.f27331n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f27332o = Integer.valueOf(i10);
        this.f27333p = Integer.valueOf(i11);
        this.f27331n = true;
        this.f27334q = Integer.valueOf(i12);
        this.f27335r = Integer.valueOf(i13);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f27337t = 2.0f;
    }

    public final void i(float f7) {
        boolean z10;
        if (this.f27341y != null) {
            this.f27339w.setPathEffect(new CornerPathEffect(f7));
            this.f27340x.setPathEffect(new CornerPathEffect(f7));
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
            Path path = this.f27342z;
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
                Path path = this.f27342z;
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
        Path path = this.f27341y;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27339w.setAlpha(i10);
        this.f27340x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27339w.setColorFilter(colorFilter);
    }

    public ia0() {
        this.f27321b = -1L;
        this.f27322c = -1L;
        this.f27324f = new Matrix();
        this.f27325g = new Matrix();
        this.f27329l = org.telegram.ui.ActionBar.i6.f20868h5;
        this.f27330m = org.telegram.ui.ActionBar.i6.f20887i5;
        this.f27337t = 1.0f;
        this.f27338u = 1.0f;
        this.f27339w = new Paint(1);
        Paint paint = new Paint(1);
        this.f27340x = paint;
        this.f27342z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
