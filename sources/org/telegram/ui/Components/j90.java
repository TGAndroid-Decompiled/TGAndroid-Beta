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
public final class j90 extends Drawable {
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
    public final org.telegram.ui.ActionBar.f6 f25904a;
    public long f25905b;
    public long f25906c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f25907f;
    public final Matrix f25908g;
    public int h;
    public int f25909i;
    public int f25910j;
    public int f25911k;
    public int f25912l;
    public int f25913m;
    public boolean f25914n;
    public Integer f25915o;
    public Integer f25916p;
    public Integer f25917q;
    public Integer f25918r;
    public int f25919s;
    public float f25920t;
    public float f25921u;
    public final Paint v;
    public final Paint f25922w;
    public Path f25923x;
    public final Path f25924y;
    public Rect f25925z;

    public j90(org.telegram.ui.ActionBar.f6 f6Var) {
        this();
        this.f25904a = f6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f25906c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f25906c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f25906c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f25906c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f25906c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f25925z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f25915o = Integer.valueOf(i10);
        this.f25916p = Integer.valueOf(i11);
        this.f25914n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f25915o = Integer.valueOf(i10);
        this.f25916p = Integer.valueOf(i11);
        this.f25914n = true;
        this.f25917q = Integer.valueOf(i12);
        this.f25918r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f25920t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f10) {
        boolean z4;
        if (this.f25923x != null) {
            this.v.setPathEffect(new CornerPathEffect(f10));
            this.f25922w.setPathEffect(new CornerPathEffect(f10));
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
        if (this.f25925z != null && z4) {
            Path path = this.f25924y;
            path.rewind();
            Rect rect = this.f25925z;
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
            if (this.f25925z != null && z4) {
                Path path = this.f25924y;
                path.rewind();
                Rect rect = this.f25925z;
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
        Path path = this.f25923x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f25922w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public j90() {
        this.f25905b = -1L;
        this.f25906c = -1L;
        this.f25907f = new Matrix();
        this.f25908g = new Matrix();
        this.f25912l = org.telegram.ui.ActionBar.j6.f19952h5;
        this.f25913m = org.telegram.ui.ActionBar.j6.f19970i5;
        this.f25920t = 1.0f;
        this.f25921u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f25922w = paint;
        this.f25924y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
