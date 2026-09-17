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
public final class g90 extends Drawable {
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
    public final org.telegram.ui.ActionBar.f6 f24130a;
    public long f24131b;
    public long f24132c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f24133f;
    public final Matrix f24134g;
    public int h;
    public int f24135i;
    public int f24136j;
    public int f24137k;
    public int f24138l;
    public int f24139m;
    public boolean f24140n;
    public Integer f24141o;
    public Integer f24142p;
    public Integer f24143q;
    public Integer f24144r;
    public int f24145s;
    public float f24146t;
    public float f24147u;
    public final Paint v;
    public final Paint f24148w;
    public Path f24149x;
    public final Path f24150y;
    public Rect f24151z;

    public g90(org.telegram.ui.ActionBar.f6 f6Var) {
        this();
        this.f24130a = f6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f24132c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f24132c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24132c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f24132c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24132c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f24151z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f24141o = Integer.valueOf(i10);
        this.f24142p = Integer.valueOf(i11);
        this.f24140n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f24141o = Integer.valueOf(i10);
        this.f24142p = Integer.valueOf(i11);
        this.f24140n = true;
        this.f24143q = Integer.valueOf(i12);
        this.f24144r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f24146t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f24149x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f24148w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f24151z != null && z10) {
            Path path = this.f24150y;
            path.rewind();
            Rect rect = this.f24151z;
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
            if (this.f24151z != null && z10) {
                Path path = this.f24150y;
                path.rewind();
                Rect rect = this.f24151z;
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
        Path path = this.f24149x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f24148w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public g90() {
        this.f24131b = -1L;
        this.f24132c = -1L;
        this.f24133f = new Matrix();
        this.f24134g = new Matrix();
        this.f24138l = org.telegram.ui.ActionBar.j6.f18933h5;
        this.f24139m = org.telegram.ui.ActionBar.j6.f18951i5;
        this.f24146t = 1.0f;
        this.f24147u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f24148w = paint;
        this.f24150y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
