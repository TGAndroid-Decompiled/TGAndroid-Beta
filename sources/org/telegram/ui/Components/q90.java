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
public final class q90 extends Drawable {
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
    public final org.telegram.ui.ActionBar.f6 f26345a;
    public long f26346b;
    public long f26347c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f26348f;
    public final Matrix f26349g;
    public int h;
    public int f26350i;
    public int f26351j;
    public int f26352k;
    public int f26353l;
    public int f26354m;
    public boolean f26355n;
    public Integer f26356o;
    public Integer f26357p;
    public Integer f26358q;
    public Integer f26359r;
    public int f26360s;
    public float f26361t;
    public float f26362u;
    public final Paint v;
    public final Paint f26363w;
    public Path f26364x;
    public final Path f26365y;
    public Rect f26366z;

    public q90(org.telegram.ui.ActionBar.f6 f6Var) {
        this();
        this.f26345a = f6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f26347c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f26347c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f26347c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f26347c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f26347c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f26366z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f26356o = Integer.valueOf(i10);
        this.f26357p = Integer.valueOf(i11);
        this.f26355n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f26356o = Integer.valueOf(i10);
        this.f26357p = Integer.valueOf(i11);
        this.f26355n = true;
        this.f26358q = Integer.valueOf(i12);
        this.f26359r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f26361t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f26364x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f26363w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f26366z != null && z10) {
            Path path = this.f26365y;
            path.rewind();
            Rect rect = this.f26366z;
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
            if (this.f26366z != null && z10) {
                Path path = this.f26365y;
                path.rewind();
                Rect rect = this.f26366z;
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
        Path path = this.f26364x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f26363w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public q90() {
        this.f26346b = -1L;
        this.f26347c = -1L;
        this.f26348f = new Matrix();
        this.f26349g = new Matrix();
        this.f26353l = org.telegram.ui.ActionBar.j6.f17998h5;
        this.f26354m = org.telegram.ui.ActionBar.j6.f18016i5;
        this.f26361t = 1.0f;
        this.f26362u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f26363w = paint;
        this.f26365y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
