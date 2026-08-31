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
public final class k90 extends Drawable {
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
    public final org.telegram.ui.ActionBar.g6 f28328a;
    public long f28329b;
    public long f28330c;
    public LinearGradient d;
    public LinearGradient f28331e;
    public final Matrix f28332f;
    public final Matrix f28333g;
    public int h;
    public int f28334i;
    public int f28335j;
    public int f28336k;
    public int f28337l;
    public int f28338m;
    public boolean f28339n;
    public Integer f28340o;
    public Integer f28341p;
    public Integer f28342q;
    public Integer f28343r;
    public int f28344s;
    public float f28345t;
    public float f28346u;
    public final Paint v;
    public final Paint f28347w;
    public Path f28348x;
    public final Path f28349y;
    public Rect f28350z;

    public k90(org.telegram.ui.ActionBar.g6 g6Var) {
        this();
        this.f28328a = g6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f28330c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f28330c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28330c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f28330c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28330c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f28350z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f28340o = Integer.valueOf(i10);
        this.f28341p = Integer.valueOf(i11);
        this.f28339n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f28340o = Integer.valueOf(i10);
        this.f28341p = Integer.valueOf(i11);
        this.f28339n = true;
        this.f28342q = Integer.valueOf(i12);
        this.f28343r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f28345t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f10) {
        boolean z4;
        if (this.f28348x != null) {
            this.v.setPathEffect(new CornerPathEffect(f10));
            this.f28347w.setPathEffect(new CornerPathEffect(f10));
            return;
        }
        float[] fArr = this.A;
        if (fArr[0] == f10 && fArr[2] == f10 && fArr[4] == f10 && fArr[6] == f10) {
            z4 = false;
        } else {
            z4 = true;
        }
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[7] = f10;
        fArr[6] = f10;
        if (this.f28350z != null && z4) {
            Path path = this.f28349y;
            path.rewind();
            Rect rect = this.f28350z;
            RectF rectF = this.B;
            rectF.set(rect);
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }

    public final void i(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            boolean z4 = false;
            for (int i10 = 0; i10 < 8; i10++) {
                float[] fArr2 = this.A;
                float f10 = fArr2[i10];
                float f11 = fArr[i10];
                if (f10 != f11) {
                    fArr2[i10] = f11;
                    z4 = true;
                }
            }
            if (this.f28350z != null && z4) {
                Path path = this.f28349y;
                path.rewind();
                Rect rect = this.f28350z;
                RectF rectF = this.B;
                rectF.set(rect);
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
        }
    }

    public final void j(float f10) {
        h(AndroidUtilities.dp(f10));
    }

    public final void k() {
        Path path = this.f28348x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f28347w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public k90() {
        this.f28329b = -1L;
        this.f28330c = -1L;
        this.f28332f = new Matrix();
        this.f28333g = new Matrix();
        this.f28337l = org.telegram.ui.ActionBar.k6.f21731h5;
        this.f28338m = org.telegram.ui.ActionBar.k6.f21749i5;
        this.f28345t = 1.0f;
        this.f28346u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f28347w = paint;
        this.f28349y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
