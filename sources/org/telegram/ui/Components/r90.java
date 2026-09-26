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
public final class r90 extends Drawable {
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
    public final org.telegram.ui.ActionBar.d6 f27911a;
    public long f27912b;
    public long f27913c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f27914f;
    public final Matrix f27915g;
    public int h;
    public int f27916i;
    public int f27917j;
    public int f27918k;
    public int f27919l;
    public int f27920m;
    public boolean f27921n;
    public Integer f27922o;
    public Integer f27923p;
    public Integer f27924q;
    public Integer f27925r;
    public int f27926s;
    public float f27927t;
    public float f27928u;
    public final Paint v;
    public final Paint f27929w;
    public Path f27930x;
    public final Path f27931y;
    public Rect f27932z;

    public r90(org.telegram.ui.ActionBar.d6 d6Var) {
        this();
        this.f27911a = d6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f27913c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f27913c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27913c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f27913c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27913c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f27932z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f27922o = Integer.valueOf(i10);
        this.f27923p = Integer.valueOf(i11);
        this.f27921n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f27922o = Integer.valueOf(i10);
        this.f27923p = Integer.valueOf(i11);
        this.f27921n = true;
        this.f27924q = Integer.valueOf(i12);
        this.f27925r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f27927t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f27930x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f27929w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f27932z != null && z10) {
            Path path = this.f27931y;
            path.rewind();
            Rect rect = this.f27932z;
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
            if (this.f27932z != null && z10) {
                Path path = this.f27931y;
                path.rewind();
                Rect rect = this.f27932z;
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
        Path path = this.f27930x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f27929w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public r90() {
        this.f27912b = -1L;
        this.f27913c = -1L;
        this.f27914f = new Matrix();
        this.f27915g = new Matrix();
        this.f27919l = org.telegram.ui.ActionBar.h6.f19129h5;
        this.f27920m = org.telegram.ui.ActionBar.h6.f19147i5;
        this.f27927t = 1.0f;
        this.f27928u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f27929w = paint;
        this.f27931y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
