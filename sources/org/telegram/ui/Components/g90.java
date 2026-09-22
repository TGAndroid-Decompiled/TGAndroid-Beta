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
    public final org.telegram.ui.ActionBar.e6 f24258a;
    public long f24259b;
    public long f24260c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f24261f;
    public final Matrix f24262g;
    public int h;
    public int f24263i;
    public int f24264j;
    public int f24265k;
    public int f24266l;
    public int f24267m;
    public boolean f24268n;
    public Integer f24269o;
    public Integer f24270p;
    public Integer f24271q;
    public Integer f24272r;
    public int f24273s;
    public float f24274t;
    public float f24275u;
    public final Paint v;
    public final Paint f24276w;
    public Path f24277x;
    public final Path f24278y;
    public Rect f24279z;

    public g90(org.telegram.ui.ActionBar.e6 e6Var) {
        this();
        this.f24258a = e6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f24260c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f24260c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24260c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f24260c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24260c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f24279z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f24269o = Integer.valueOf(i10);
        this.f24270p = Integer.valueOf(i11);
        this.f24268n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f24269o = Integer.valueOf(i10);
        this.f24270p = Integer.valueOf(i11);
        this.f24268n = true;
        this.f24271q = Integer.valueOf(i12);
        this.f24272r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f24274t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f24277x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f24276w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f24279z != null && z10) {
            Path path = this.f24278y;
            path.rewind();
            Rect rect = this.f24279z;
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
            if (this.f24279z != null && z10) {
                Path path = this.f24278y;
                path.rewind();
                Rect rect = this.f24279z;
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
        Path path = this.f24277x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f24276w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public g90() {
        this.f24259b = -1L;
        this.f24260c = -1L;
        this.f24261f = new Matrix();
        this.f24262g = new Matrix();
        this.f24266l = org.telegram.ui.ActionBar.i6.f18904h5;
        this.f24267m = org.telegram.ui.ActionBar.i6.f18922i5;
        this.f24274t = 1.0f;
        this.f24275u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f24276w = paint;
        this.f24278y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
