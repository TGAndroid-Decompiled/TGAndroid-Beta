package org.telegram.ui.Components;

import android.graphics.Canvas;
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
public class ja0 extends Drawable {
    public Rect A;
    public final float[] B;
    public final RectF C;
    public boolean D;
    public int E;
    public Paint F;
    public LinearGradient G;
    public Matrix H;
    public int I;
    public Paint J;
    public LinearGradient K;
    public Matrix L;
    public final org.telegram.ui.ActionBar.d6 f27639a;
    public long f27640b;
    public long f27641c;
    public LinearGradient d;
    public LinearGradient f27642e;
    public final Matrix f27643f;
    public final Matrix f27644g;
    public int h;
    public int f27645i;
    public int f27646j;
    public int f27647k;
    public int f27648l;
    public int f27649m;
    public boolean f27650n;
    public Integer f27651o;
    public Integer f27652p;
    public Integer f27653q;
    public Integer f27654r;
    public int f27655s;
    public float f27656t;
    public float f27657u;
    public long v;
    public final Paint f27658w;
    public final Paint f27659x;
    public Path f27660y;
    public final Path f27661z;

    public ja0(org.telegram.ui.ActionBar.d6 d6Var) {
        this();
        this.f27639a = d6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f27641c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f27658w);
        if (this.f27650n) {
            canvas.drawPath(path, this.f27659x);
        }
    }

    public final boolean c() {
        if (this.f27641c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27641c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f27641c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27641c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ja0.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i10, int i11) {
        this.f27651o = Integer.valueOf(i10);
        this.f27652p = Integer.valueOf(i11);
        this.f27650n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f27651o = Integer.valueOf(i10);
        this.f27652p = Integer.valueOf(i11);
        this.f27650n = true;
        this.f27653q = Integer.valueOf(i12);
        this.f27654r = Integer.valueOf(i13);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f27656t = 2.0f;
    }

    public final void i(float f7) {
        boolean z10;
        if (this.f27660y != null) {
            this.f27658w.setPathEffect(new CornerPathEffect(f7));
            this.f27659x.setPathEffect(new CornerPathEffect(f7));
            return;
        }
        float[] fArr = this.B;
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
        if (this.A != null && z10) {
            Path path = this.f27661z;
            path.rewind();
            Rect rect = this.A;
            RectF rectF = this.C;
            rectF.set(rect);
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }

    public final void j(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            boolean z10 = false;
            for (int i10 = 0; i10 < 8; i10++) {
                float[] fArr2 = this.B;
                float f7 = fArr2[i10];
                float f10 = fArr[i10];
                if (f7 != f10) {
                    fArr2[i10] = f10;
                    z10 = true;
                }
            }
            if (this.A != null && z10) {
                Path path = this.f27661z;
                path.rewind();
                Rect rect = this.A;
                RectF rectF = this.C;
                rectF.set(rect);
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
        }
    }

    public final void k(float f7) {
        i(AndroidUtilities.dp(f7));
    }

    public final void l() {
        Path path = this.f27660y;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27658w.setAlpha(i10);
        this.f27659x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27658w.setColorFilter(colorFilter);
    }

    public ja0() {
        this.f27640b = -1L;
        this.f27641c = -1L;
        this.f27643f = new Matrix();
        this.f27644g = new Matrix();
        this.f27648l = org.telegram.ui.ActionBar.h6.f20857h5;
        this.f27649m = org.telegram.ui.ActionBar.h6.f20876i5;
        this.f27656t = 1.0f;
        this.f27657u = 1.0f;
        this.f27658w = new Paint(1);
        Paint paint = new Paint(1);
        this.f27659x = paint;
        this.f27661z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
