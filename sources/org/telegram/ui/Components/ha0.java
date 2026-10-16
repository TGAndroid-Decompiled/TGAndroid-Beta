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
public class ha0 extends Drawable {
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
    public final org.telegram.ui.ActionBar.c6 f25247a;
    public long f25248b;
    public long f25249c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f25250f;
    public final Matrix f25251g;
    public int h;
    public int f25252i;
    public int f25253j;
    public int f25254k;
    public int f25255l;
    public int f25256m;
    public boolean f25257n;
    public Integer f25258o;
    public Integer f25259p;
    public Integer f25260q;
    public Integer f25261r;
    public int f25262s;
    public float f25263t;
    public float f25264u;
    public long v;
    public final Paint f25265w;
    public final Paint f25266x;
    public Path f25267y;
    public final Path f25268z;

    public ha0(org.telegram.ui.ActionBar.c6 c6Var) {
        this();
        this.f25247a = c6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f25249c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f25265w);
        if (this.f25257n) {
            canvas.drawPath(path, this.f25266x);
        }
    }

    public final boolean c() {
        if (this.f25249c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f25249c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f25249c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f25249c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha0.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i10, int i11) {
        this.f25258o = Integer.valueOf(i10);
        this.f25259p = Integer.valueOf(i11);
        this.f25257n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f25258o = Integer.valueOf(i10);
        this.f25259p = Integer.valueOf(i11);
        this.f25257n = true;
        this.f25260q = Integer.valueOf(i12);
        this.f25261r = Integer.valueOf(i13);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f25263t = 2.0f;
    }

    public final void i(float f7) {
        boolean z10;
        if (this.f25267y != null) {
            this.f25265w.setPathEffect(new CornerPathEffect(f7));
            this.f25266x.setPathEffect(new CornerPathEffect(f7));
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
            Path path = this.f25268z;
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
                Path path = this.f25268z;
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
        Path path = this.f25267y;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25265w.setAlpha(i10);
        this.f25266x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25265w.setColorFilter(colorFilter);
    }

    public ha0() {
        this.f25248b = -1L;
        this.f25249c = -1L;
        this.f25250f = new Matrix();
        this.f25251g = new Matrix();
        this.f25255l = org.telegram.ui.ActionBar.g6.f19672h5;
        this.f25256m = org.telegram.ui.ActionBar.g6.f19689i5;
        this.f25263t = 1.0f;
        this.f25264u = 1.0f;
        this.f25265w = new Paint(1);
        Paint paint = new Paint(1);
        this.f25266x = paint;
        this.f25268z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
