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
public final class c90 extends Drawable {
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
    public final org.telegram.ui.ActionBar.c6 f27380a;
    public long f27381b;
    public long f27382c;
    public LinearGradient d;
    public LinearGradient f27383e;
    public final Matrix f27384f;
    public final Matrix f27385g;
    public int h;
    public int f27386i;
    public int f27387j;
    public int f27388k;
    public int f27389l;
    public int f27390m;
    public boolean f27391n;
    public Integer f27392o;
    public Integer f27393p;
    public Integer f27394q;
    public Integer f27395r;
    public int f27396s;
    public float f27397t;
    public float f27398u;
    public final Paint v;
    public final Paint f27399w;
    public Path f27400x;
    public final Path f27401y;
    public Rect f27402z;

    public c90(org.telegram.ui.ActionBar.c6 c6Var) {
        this();
        this.f27380a = c6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f27382c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f27382c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27382c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f27382c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27382c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f27402z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f27392o = Integer.valueOf(i10);
        this.f27393p = Integer.valueOf(i11);
        this.f27391n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f27392o = Integer.valueOf(i10);
        this.f27393p = Integer.valueOf(i11);
        this.f27391n = true;
        this.f27394q = Integer.valueOf(i12);
        this.f27395r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f27397t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f9) {
        boolean z10;
        if (this.f27400x != null) {
            this.v.setPathEffect(new CornerPathEffect(f9));
            this.f27399w.setPathEffect(new CornerPathEffect(f9));
            return;
        }
        float[] fArr = this.A;
        if (fArr[0] == f9 && fArr[2] == f9 && fArr[4] == f9 && fArr[6] == f9) {
            z10 = false;
        } else {
            z10 = true;
        }
        fArr[1] = f9;
        fArr[0] = f9;
        fArr[3] = f9;
        fArr[2] = f9;
        fArr[5] = f9;
        fArr[4] = f9;
        fArr[7] = f9;
        fArr[6] = f9;
        if (this.f27402z != null && z10) {
            Path path = this.f27401y;
            path.rewind();
            Rect rect = this.f27402z;
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
                float f9 = fArr2[i10];
                float f10 = fArr[i10];
                if (f9 != f10) {
                    fArr2[i10] = f10;
                    z10 = true;
                }
            }
            if (this.f27402z != null && z10) {
                Path path = this.f27401y;
                path.rewind();
                Rect rect = this.f27402z;
                RectF rectF = this.B;
                rectF.set(rect);
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
        }
    }

    public final void j(float f9) {
        h(AndroidUtilities.dp(f9));
    }

    public final void k() {
        Path path = this.f27400x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f27399w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public c90() {
        this.f27381b = -1L;
        this.f27382c = -1L;
        this.f27384f = new Matrix();
        this.f27385g = new Matrix();
        this.f27389l = org.telegram.ui.ActionBar.g6.f23133h5;
        this.f27390m = org.telegram.ui.ActionBar.g6.f23151i5;
        this.f27397t = 1.0f;
        this.f27398u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f27399w = paint;
        this.f27401y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
