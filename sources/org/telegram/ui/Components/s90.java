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
public final class s90 extends Drawable {
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
    public final org.telegram.ui.ActionBar.d6 f28202a;
    public long f28203b;
    public long f28204c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f28205f;
    public final Matrix f28206g;
    public int h;
    public int f28207i;
    public int f28208j;
    public int f28209k;
    public int f28210l;
    public int f28211m;
    public boolean f28212n;
    public Integer f28213o;
    public Integer f28214p;
    public Integer f28215q;
    public Integer f28216r;
    public int f28217s;
    public float f28218t;
    public float f28219u;
    public final Paint v;
    public final Paint f28220w;
    public Path f28221x;
    public final Path f28222y;
    public Rect f28223z;

    public s90(org.telegram.ui.ActionBar.d6 d6Var) {
        this();
        this.f28202a = d6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f28204c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f28204c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28204c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f28204c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28204c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f28223z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f28213o = Integer.valueOf(i10);
        this.f28214p = Integer.valueOf(i11);
        this.f28212n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f28213o = Integer.valueOf(i10);
        this.f28214p = Integer.valueOf(i11);
        this.f28212n = true;
        this.f28215q = Integer.valueOf(i12);
        this.f28216r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f28218t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f28221x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f28220w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f28223z != null && z10) {
            Path path = this.f28222y;
            path.rewind();
            Rect rect = this.f28223z;
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
            if (this.f28223z != null && z10) {
                Path path = this.f28222y;
                path.rewind();
                Rect rect = this.f28223z;
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
        Path path = this.f28221x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f28220w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public s90() {
        this.f28203b = -1L;
        this.f28204c = -1L;
        this.f28205f = new Matrix();
        this.f28206g = new Matrix();
        this.f28210l = org.telegram.ui.ActionBar.h6.f19129h5;
        this.f28211m = org.telegram.ui.ActionBar.h6.f19147i5;
        this.f28218t = 1.0f;
        this.f28219u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f28220w = paint;
        this.f28222y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
