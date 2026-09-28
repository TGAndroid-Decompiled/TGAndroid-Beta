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
    public final org.telegram.ui.ActionBar.d6 f28502a;
    public long f28503b;
    public long f28504c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f28505f;
    public final Matrix f28506g;
    public int h;
    public int f28507i;
    public int f28508j;
    public int f28509k;
    public int f28510l;
    public int f28511m;
    public boolean f28512n;
    public Integer f28513o;
    public Integer f28514p;
    public Integer f28515q;
    public Integer f28516r;
    public int f28517s;
    public float f28518t;
    public float f28519u;
    public final Paint v;
    public final Paint f28520w;
    public Path f28521x;
    public final Path f28522y;
    public Rect f28523z;

    public t90(org.telegram.ui.ActionBar.d6 d6Var) {
        this();
        this.f28502a = d6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f28504c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f28504c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28504c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f28504c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28504c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f28523z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f28513o = Integer.valueOf(i10);
        this.f28514p = Integer.valueOf(i11);
        this.f28512n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f28513o = Integer.valueOf(i10);
        this.f28514p = Integer.valueOf(i11);
        this.f28512n = true;
        this.f28515q = Integer.valueOf(i12);
        this.f28516r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f28518t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f28521x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f28520w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f28523z != null && z10) {
            Path path = this.f28522y;
            path.rewind();
            Rect rect = this.f28523z;
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
            if (this.f28523z != null && z10) {
                Path path = this.f28522y;
                path.rewind();
                Rect rect = this.f28523z;
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
        Path path = this.f28521x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f28520w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public t90() {
        this.f28503b = -1L;
        this.f28504c = -1L;
        this.f28505f = new Matrix();
        this.f28506g = new Matrix();
        this.f28510l = org.telegram.ui.ActionBar.h6.f19130h5;
        this.f28511m = org.telegram.ui.ActionBar.h6.f19148i5;
        this.f28518t = 1.0f;
        this.f28519u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f28520w = paint;
        this.f28522y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
