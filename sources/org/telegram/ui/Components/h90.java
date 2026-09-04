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
    public final org.telegram.ui.ActionBar.f6 f26671a;
    public long f26672b;
    public long f26673c;
    public LinearGradient d;
    public LinearGradient f26674e;
    public final Matrix f26675f;
    public final Matrix f26676g;
    public int h;
    public int f26677i;
    public int f26678j;
    public int f26679k;
    public int f26680l;
    public int f26681m;
    public boolean f26682n;
    public Integer f26683o;
    public Integer f26684p;
    public Integer f26685q;
    public Integer f26686r;
    public int f26687s;
    public float f26688t;
    public float f26689u;
    public final Paint v;
    public final Paint f26690w;
    public Path f26691x;
    public final Path f26692y;
    public Rect f26693z;

    public h90(org.telegram.ui.ActionBar.f6 f6Var) {
        this();
        this.f26671a = f6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f26673c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f26673c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f26673c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f26673c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f26673c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f26693z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f26683o = Integer.valueOf(i10);
        this.f26684p = Integer.valueOf(i11);
        this.f26682n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f26683o = Integer.valueOf(i10);
        this.f26684p = Integer.valueOf(i11);
        this.f26682n = true;
        this.f26685q = Integer.valueOf(i12);
        this.f26686r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f26688t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f26691x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f26690w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f26693z != null && z10) {
            Path path = this.f26692y;
            path.rewind();
            Rect rect = this.f26693z;
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
            if (this.f26693z != null && z10) {
                Path path = this.f26692y;
                path.rewind();
                Rect rect = this.f26693z;
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
        Path path = this.f26691x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f26690w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public h90() {
        this.f26672b = -1L;
        this.f26673c = -1L;
        this.f26675f = new Matrix();
        this.f26676g = new Matrix();
        this.f26680l = org.telegram.ui.ActionBar.j6.f20734h5;
        this.f26681m = org.telegram.ui.ActionBar.j6.f20752i5;
        this.f26688t = 1.0f;
        this.f26689u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f26690w = paint;
        this.f26692y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
