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
    public final org.telegram.ui.ActionBar.d6 f24600a;
    public long f24601b;
    public long f24602c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f24603f;
    public final Matrix f24604g;
    public int h;
    public int f24605i;
    public int f24606j;
    public int f24607k;
    public int f24608l;
    public int f24609m;
    public boolean f24610n;
    public Integer f24611o;
    public Integer f24612p;
    public Integer f24613q;
    public Integer f24614r;
    public int f24615s;
    public float f24616t;
    public float f24617u;
    public final Paint v;
    public final Paint f24618w;
    public Path f24619x;
    public final Path f24620y;
    public Rect f24621z;

    public h90(org.telegram.ui.ActionBar.d6 d6Var) {
        this();
        this.f24600a = d6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f24602c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f24602c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24602c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f24602c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24602c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f24621z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f24611o = Integer.valueOf(i10);
        this.f24612p = Integer.valueOf(i11);
        this.f24610n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f24611o = Integer.valueOf(i10);
        this.f24612p = Integer.valueOf(i11);
        this.f24610n = true;
        this.f24613q = Integer.valueOf(i12);
        this.f24614r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f24616t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f24619x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f24618w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f24621z != null && z10) {
            Path path = this.f24620y;
            path.rewind();
            Rect rect = this.f24621z;
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
            if (this.f24621z != null && z10) {
                Path path = this.f24620y;
                path.rewind();
                Rect rect = this.f24621z;
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
        Path path = this.f24619x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f24618w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public h90() {
        this.f24601b = -1L;
        this.f24602c = -1L;
        this.f24603f = new Matrix();
        this.f24604g = new Matrix();
        this.f24608l = org.telegram.ui.ActionBar.h6.f18859h5;
        this.f24609m = org.telegram.ui.ActionBar.h6.f18877i5;
        this.f24616t = 1.0f;
        this.f24617u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f24618w = paint;
        this.f24620y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
