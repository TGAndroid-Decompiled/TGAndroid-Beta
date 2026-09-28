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
    public final org.telegram.ui.ActionBar.d6 f28501a;
    public long f28502b;
    public long f28503c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f28504f;
    public final Matrix f28505g;
    public int h;
    public int f28506i;
    public int f28507j;
    public int f28508k;
    public int f28509l;
    public int f28510m;
    public boolean f28511n;
    public Integer f28512o;
    public Integer f28513p;
    public Integer f28514q;
    public Integer f28515r;
    public int f28516s;
    public float f28517t;
    public float f28518u;
    public final Paint v;
    public final Paint f28519w;
    public Path f28520x;
    public final Path f28521y;
    public Rect f28522z;

    public t90(org.telegram.ui.ActionBar.d6 d6Var) {
        this();
        this.f28501a = d6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f28503c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f28503c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28503c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f28503c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28503c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f28522z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f28512o = Integer.valueOf(i10);
        this.f28513p = Integer.valueOf(i11);
        this.f28511n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f28512o = Integer.valueOf(i10);
        this.f28513p = Integer.valueOf(i11);
        this.f28511n = true;
        this.f28514q = Integer.valueOf(i12);
        this.f28515r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f28517t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f28520x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f28519w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f28522z != null && z10) {
            Path path = this.f28521y;
            path.rewind();
            Rect rect = this.f28522z;
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
            if (this.f28522z != null && z10) {
                Path path = this.f28521y;
                path.rewind();
                Rect rect = this.f28522z;
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
        Path path = this.f28520x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f28519w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public t90() {
        this.f28502b = -1L;
        this.f28503c = -1L;
        this.f28504f = new Matrix();
        this.f28505g = new Matrix();
        this.f28509l = org.telegram.ui.ActionBar.h6.f19129h5;
        this.f28510m = org.telegram.ui.ActionBar.h6.f19147i5;
        this.f28517t = 1.0f;
        this.f28518u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f28519w = paint;
        this.f28521y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
