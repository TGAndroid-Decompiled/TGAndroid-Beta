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
public final class p80 extends Drawable {
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
    public final org.telegram.ui.ActionBar.b6 f31571a;
    public long f31572b;
    public long f31573c;
    public LinearGradient d;
    public LinearGradient f31574e;
    public final Matrix f31575f;
    public final Matrix f31576g;
    public int h;
    public int f31577i;
    public int f31578j;
    public int f31579k;
    public int f31580l;
    public int f31581m;
    public boolean f31582n;
    public Integer f31583o;
    public Integer f31584p;
    public Integer f31585q;
    public Integer f31586r;
    public int f31587s;
    public float f31588t;
    public float f31589u;
    public final Paint v;
    public final Paint f31590w;
    public Path f31591x;
    public final Path f31592y;
    public Rect f31593z;

    public p80(org.telegram.ui.ActionBar.b6 b6Var) {
        this();
        this.f31571a = b6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f31573c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f31573c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f31573c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f31573c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f31573c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f31593z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p80.draw(android.graphics.Canvas):void");
    }

    public final void e(int i9, int i10) {
        this.f31583o = Integer.valueOf(i9);
        this.f31584p = Integer.valueOf(i10);
        this.f31582n = false;
    }

    public final void f(int i9, int i10, int i11, int i12) {
        this.f31583o = Integer.valueOf(i9);
        this.f31584p = Integer.valueOf(i10);
        this.f31582n = true;
        this.f31585q = Integer.valueOf(i11);
        this.f31586r = Integer.valueOf(i12);
    }

    public final void g() {
        this.f31588t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f10) {
        boolean z10;
        if (this.f31591x != null) {
            this.v.setPathEffect(new CornerPathEffect(f10));
            this.f31590w.setPathEffect(new CornerPathEffect(f10));
            return;
        }
        float[] fArr = this.A;
        if (fArr[0] == f10 && fArr[2] == f10 && fArr[4] == f10 && fArr[6] == f10) {
            z10 = false;
        } else {
            z10 = true;
        }
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[7] = f10;
        fArr[6] = f10;
        if (this.f31593z != null && z10) {
            Path path = this.f31592y;
            path.rewind();
            Rect rect = this.f31593z;
            RectF rectF = this.B;
            rectF.set(rect);
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }

    public final void i(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            boolean z10 = false;
            for (int i9 = 0; i9 < 8; i9++) {
                float[] fArr2 = this.A;
                float f10 = fArr2[i9];
                float f11 = fArr[i9];
                if (f10 != f11) {
                    fArr2[i9] = f11;
                    z10 = true;
                }
            }
            if (this.f31593z != null && z10) {
                Path path = this.f31592y;
                path.rewind();
                Rect rect = this.f31593z;
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
        Path path = this.f31591x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i9) {
        this.v.setAlpha(i9);
        this.f31590w.setAlpha(i9);
        if (i9 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public p80() {
        this.f31572b = -1L;
        this.f31573c = -1L;
        this.f31575f = new Matrix();
        this.f31576g = new Matrix();
        this.f31580l = org.telegram.ui.ActionBar.f6.f23072h5;
        this.f31581m = org.telegram.ui.ActionBar.f6.f23091i5;
        this.f31588t = 1.0f;
        this.f31589u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f31590w = paint;
        this.f31592y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
