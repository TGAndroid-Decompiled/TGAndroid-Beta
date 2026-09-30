package org.telegram.ui.Components;

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
public final class t90 extends Drawable {
    public final float[] A;
    public final RectF B;
    public boolean C;
    public int D;
    public Paint E;
    public LinearGradient F;
    public Matrix G;
    public int H;
    public Paint I;
    public LinearGradient J;
    public Matrix K;
    public final org.telegram.ui.ActionBar.d6 f28500a;
    public long f28501b;
    public long f28502c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f28503f;
    public final Matrix f28504g;
    public int h;
    public int f28505i;
    public int f28506j;
    public int f28507k;
    public int f28508l;
    public int f28509m;
    public boolean f28510n;
    public Integer f28511o;
    public Integer f28512p;
    public Integer f28513q;
    public Integer f28514r;
    public int f28515s;
    public float f28516t;
    public float f28517u;
    public final Paint v;
    public final Paint f28518w;
    public Path f28519x;
    public final Path f28520y;
    public Rect f28521z;

    public t90(org.telegram.ui.ActionBar.d6 d6Var) {
        this();
        this.f28500a = d6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f28502c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f28502c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28502c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f28502c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28502c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f28521z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f28511o = Integer.valueOf(i10);
        this.f28512p = Integer.valueOf(i11);
        this.f28510n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f28511o = Integer.valueOf(i10);
        this.f28512p = Integer.valueOf(i11);
        this.f28510n = true;
        this.f28513q = Integer.valueOf(i12);
        this.f28514r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f28516t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f28519x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f28518w.setPathEffect(new CornerPathEffect(f7));
            return;
        }
        float[] fArr = this.A;
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
        if (this.f28521z != null && z10) {
            Path path = this.f28520y;
            path.rewind();
            Rect rect = this.f28521z;
            RectF rectF = this.B;
            rectF.set(rect);
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }

    public final void i(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            boolean z10 = false;
            for (int i10 = 0; i10 < 8; i10++) {
                float[] fArr2 = this.A;
                float f7 = fArr2[i10];
                float f10 = fArr[i10];
                if (f7 != f10) {
                    fArr2[i10] = f10;
                    z10 = true;
                }
            }
            if (this.f28521z != null && z10) {
                Path path = this.f28520y;
                path.rewind();
                Rect rect = this.f28521z;
                RectF rectF = this.B;
                rectF.set(rect);
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
        }
    }

    public final void j(float f7) {
        h(AndroidUtilities.dp(f7));
    }

    public final void k() {
        Path path = this.f28519x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f28518w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public t90() {
        this.f28501b = -1L;
        this.f28502c = -1L;
        this.f28503f = new Matrix();
        this.f28504g = new Matrix();
        this.f28508l = org.telegram.ui.ActionBar.h6.f19131h5;
        this.f28509m = org.telegram.ui.ActionBar.h6.f19149i5;
        this.f28516t = 1.0f;
        this.f28517u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f28518w = paint;
        this.f28520y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
