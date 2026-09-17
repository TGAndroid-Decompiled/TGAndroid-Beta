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
public final class h90 extends Drawable {
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
    public final org.telegram.ui.ActionBar.f6 f26699a;
    public long f26700b;
    public long f26701c;
    public LinearGradient d;
    public LinearGradient f26702e;
    public final Matrix f26703f;
    public final Matrix f26704g;
    public int h;
    public int f26705i;
    public int f26706j;
    public int f26707k;
    public int f26708l;
    public int f26709m;
    public boolean f26710n;
    public Integer f26711o;
    public Integer f26712p;
    public Integer f26713q;
    public Integer f26714r;
    public int f26715s;
    public float f26716t;
    public float f26717u;
    public final Paint v;
    public final Paint f26718w;
    public Path f26719x;
    public final Path f26720y;
    public Rect f26721z;

    public h90(org.telegram.ui.ActionBar.f6 f6Var) {
        this();
        this.f26699a = f6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f26701c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f26701c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f26701c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f26701c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f26701c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f26721z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f26711o = Integer.valueOf(i10);
        this.f26712p = Integer.valueOf(i11);
        this.f26710n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f26711o = Integer.valueOf(i10);
        this.f26712p = Integer.valueOf(i11);
        this.f26710n = true;
        this.f26713q = Integer.valueOf(i12);
        this.f26714r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f26716t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f26719x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f26718w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f26721z != null && z10) {
            Path path = this.f26720y;
            path.rewind();
            Rect rect = this.f26721z;
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
            if (this.f26721z != null && z10) {
                Path path = this.f26720y;
                path.rewind();
                Rect rect = this.f26721z;
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
        Path path = this.f26719x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f26718w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public h90() {
        this.f26700b = -1L;
        this.f26701c = -1L;
        this.f26703f = new Matrix();
        this.f26704g = new Matrix();
        this.f26708l = org.telegram.ui.ActionBar.j6.f20762h5;
        this.f26709m = org.telegram.ui.ActionBar.j6.f20780i5;
        this.f26716t = 1.0f;
        this.f26717u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f26718w = paint;
        this.f26720y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
