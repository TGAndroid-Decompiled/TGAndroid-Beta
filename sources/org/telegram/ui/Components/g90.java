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
    public final org.telegram.ui.ActionBar.e6 f24261a;
    public long f24262b;
    public long f24263c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f24264f;
    public final Matrix f24265g;
    public int h;
    public int f24266i;
    public int f24267j;
    public int f24268k;
    public int f24269l;
    public int f24270m;
    public boolean f24271n;
    public Integer f24272o;
    public Integer f24273p;
    public Integer f24274q;
    public Integer f24275r;
    public int f24276s;
    public float f24277t;
    public float f24278u;
    public final Paint v;
    public final Paint f24279w;
    public Path f24280x;
    public final Path f24281y;
    public Rect f24282z;

    public g90(org.telegram.ui.ActionBar.e6 e6Var) {
        this();
        this.f24261a = e6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f24263c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f24263c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24263c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f24263c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24263c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f24282z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f24272o = Integer.valueOf(i10);
        this.f24273p = Integer.valueOf(i11);
        this.f24271n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f24272o = Integer.valueOf(i10);
        this.f24273p = Integer.valueOf(i11);
        this.f24271n = true;
        this.f24274q = Integer.valueOf(i12);
        this.f24275r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f24277t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f24280x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f24279w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f24282z != null && z10) {
            Path path = this.f24281y;
            path.rewind();
            Rect rect = this.f24282z;
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
            if (this.f24282z != null && z10) {
                Path path = this.f24281y;
                path.rewind();
                Rect rect = this.f24282z;
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
        Path path = this.f24280x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f24279w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public g90() {
        this.f24262b = -1L;
        this.f24263c = -1L;
        this.f24264f = new Matrix();
        this.f24265g = new Matrix();
        this.f24269l = org.telegram.ui.ActionBar.i6.f18907h5;
        this.f24270m = org.telegram.ui.ActionBar.i6.f18925i5;
        this.f24277t = 1.0f;
        this.f24278u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f24279w = paint;
        this.f24281y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
