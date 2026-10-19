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
public class ba0 extends Drawable {
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
    public final org.telegram.ui.ActionBar.d6 f24872a;
    public long f24873b;
    public long f24874c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f24875f;
    public final Matrix f24876g;
    public int h;
    public int f24877i;
    public int f24878j;
    public int f24879k;
    public int f24880l;
    public int f24881m;
    public boolean f24882n;
    public Integer f24883o;
    public Integer f24884p;
    public Integer f24885q;
    public Integer f24886r;
    public int f24887s;
    public float f24888t;
    public float f24889u;
    public long v;
    public final Paint f24890w;
    public final Paint f24891x;
    public Path f24892y;
    public final Path f24893z;

    public ba0(org.telegram.ui.ActionBar.d6 d6Var) {
        this();
        this.f24872a = d6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f24874c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f24890w);
        if (this.f24882n) {
            canvas.drawPath(path, this.f24891x);
        }
    }

    public final boolean c() {
        if (this.f24874c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24874c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f24874c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24874c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ba0.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i10, int i11) {
        this.f24883o = Integer.valueOf(i10);
        this.f24884p = Integer.valueOf(i11);
        this.f24882n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f24883o = Integer.valueOf(i10);
        this.f24884p = Integer.valueOf(i11);
        this.f24882n = true;
        this.f24885q = Integer.valueOf(i12);
        this.f24886r = Integer.valueOf(i13);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f24888t = 2.0f;
    }

    public final void i(float f7) {
        boolean z10;
        if (this.f24892y != null) {
            this.f24890w.setPathEffect(new CornerPathEffect(f7));
            this.f24891x.setPathEffect(new CornerPathEffect(f7));
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
            Path path = this.f24893z;
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
                Path path = this.f24893z;
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
        Path path = this.f24892y;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24890w.setAlpha(i10);
        this.f24891x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24890w.setColorFilter(colorFilter);
    }

    public ba0() {
        this.f24873b = -1L;
        this.f24874c = -1L;
        this.f24875f = new Matrix();
        this.f24876g = new Matrix();
        this.f24880l = org.telegram.ui.ActionBar.h6.f21058h5;
        this.f24881m = org.telegram.ui.ActionBar.h6.f21075i5;
        this.f24888t = 1.0f;
        this.f24889u = 1.0f;
        this.f24890w = new Paint(1);
        Paint paint = new Paint(1);
        this.f24891x = paint;
        this.f24893z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
