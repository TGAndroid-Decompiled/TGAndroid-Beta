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
    public final org.telegram.ui.ActionBar.g6 f28350a;
    public long f28351b;
    public long f28352c;
    public LinearGradient d;
    public LinearGradient f28353e;
    public final Matrix f28354f;
    public final Matrix f28355g;
    public int h;
    public int f28356i;
    public int f28357j;
    public int f28358k;
    public int f28359l;
    public int f28360m;
    public boolean f28361n;
    public Integer f28362o;
    public Integer f28363p;
    public Integer f28364q;
    public Integer f28365r;
    public int f28366s;
    public float f28367t;
    public float f28368u;
    public final Paint v;
    public final Paint f28369w;
    public Path f28370x;
    public final Path f28371y;
    public Rect f28372z;

    public k90(org.telegram.ui.ActionBar.g6 g6Var) {
        this();
        this.f28350a = g6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f28352c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f28352c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28352c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f28352c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28352c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f28372z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f28362o = Integer.valueOf(i10);
        this.f28363p = Integer.valueOf(i11);
        this.f28361n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f28362o = Integer.valueOf(i10);
        this.f28363p = Integer.valueOf(i11);
        this.f28361n = true;
        this.f28364q = Integer.valueOf(i12);
        this.f28365r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f28367t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f10) {
        boolean z4;
        if (this.f28370x != null) {
            this.v.setPathEffect(new CornerPathEffect(f10));
            this.f28369w.setPathEffect(new CornerPathEffect(f10));
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
        if (this.f28372z != null && z4) {
            Path path = this.f28371y;
            path.rewind();
            Rect rect = this.f28372z;
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
            if (this.f28372z != null && z4) {
                Path path = this.f28371y;
                path.rewind();
                Rect rect = this.f28372z;
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
        Path path = this.f28370x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f28369w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public k90() {
        this.f28351b = -1L;
        this.f28352c = -1L;
        this.f28354f = new Matrix();
        this.f28355g = new Matrix();
        this.f28359l = org.telegram.ui.ActionBar.k6.f21733h5;
        this.f28360m = org.telegram.ui.ActionBar.k6.f21751i5;
        this.f28367t = 1.0f;
        this.f28368u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f28369w = paint;
        this.f28371y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
