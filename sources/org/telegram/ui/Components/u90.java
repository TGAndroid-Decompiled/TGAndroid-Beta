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
public final class u90 extends Drawable {
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
    public final org.telegram.ui.ActionBar.d6 f31386a;
    public long f31387b;
    public long f31388c;
    public LinearGradient d;
    public LinearGradient f31389e;
    public final Matrix f31390f;
    public final Matrix f31391g;
    public int h;
    public int f31392i;
    public int f31393j;
    public int f31394k;
    public int f31395l;
    public int f31396m;
    public boolean f31397n;
    public Integer f31398o;
    public Integer f31399p;
    public Integer f31400q;
    public Integer f31401r;
    public int f31402s;
    public float f31403t;
    public float f31404u;
    public final Paint v;
    public final Paint f31405w;
    public Path f31406x;
    public final Path f31407y;
    public Rect f31408z;

    public u90(org.telegram.ui.ActionBar.d6 d6Var) {
        this();
        this.f31386a = d6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f31388c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f31388c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f31388c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f31388c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f31388c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f31408z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f31398o = Integer.valueOf(i10);
        this.f31399p = Integer.valueOf(i11);
        this.f31397n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f31398o = Integer.valueOf(i10);
        this.f31399p = Integer.valueOf(i11);
        this.f31397n = true;
        this.f31400q = Integer.valueOf(i12);
        this.f31401r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f31403t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f31406x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f31405w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f31408z != null && z10) {
            Path path = this.f31407y;
            path.rewind();
            Rect rect = this.f31408z;
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
            if (this.f31408z != null && z10) {
                Path path = this.f31407y;
                path.rewind();
                Rect rect = this.f31408z;
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
        Path path = this.f31406x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f31405w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public u90() {
        this.f31387b = -1L;
        this.f31388c = -1L;
        this.f31390f = new Matrix();
        this.f31391g = new Matrix();
        this.f31395l = org.telegram.ui.ActionBar.i6.f20899h5;
        this.f31396m = org.telegram.ui.ActionBar.i6.f20917i5;
        this.f31403t = 1.0f;
        this.f31404u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f31405w = paint;
        this.f31407y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
