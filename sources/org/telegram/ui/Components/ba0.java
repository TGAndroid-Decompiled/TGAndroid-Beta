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
public class ba0 extends Drawable {
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
    public final org.telegram.ui.ActionBar.d6 f24897a;
    public long f24898b;
    public long f24899c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f24900f;
    public final Matrix f24901g;
    public int h;
    public int f24902i;
    public int f24903j;
    public int f24904k;
    public int f24905l;
    public int f24906m;
    public boolean f24907n;
    public Integer f24908o;
    public Integer f24909p;
    public Integer f24910q;
    public Integer f24911r;
    public int f24912s;
    public float f24913t;
    public float f24914u;
    public long v;
    public final Paint f24915w;
    public final Paint f24916x;
    public Path f24917y;
    public final Path f24918z;

    public ba0(org.telegram.ui.ActionBar.d6 d6Var) {
        this();
        this.f24897a = d6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f24899c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f24915w);
        if (this.f24907n) {
            canvas.drawPath(path, this.f24916x);
        }
    }

    public final boolean c() {
        if (this.f24899c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24899c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f24899c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24899c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ba0.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i10, int i11) {
        this.f24908o = Integer.valueOf(i10);
        this.f24909p = Integer.valueOf(i11);
        this.f24907n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f24908o = Integer.valueOf(i10);
        this.f24909p = Integer.valueOf(i11);
        this.f24907n = true;
        this.f24910q = Integer.valueOf(i12);
        this.f24911r = Integer.valueOf(i13);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f24913t = 2.0f;
    }

    public final void i(float f7) {
        boolean z10;
        if (this.f24917y != null) {
            this.f24915w.setPathEffect(new CornerPathEffect(f7));
            this.f24916x.setPathEffect(new CornerPathEffect(f7));
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
            Path path = this.f24918z;
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
                Path path = this.f24918z;
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
        Path path = this.f24917y;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24915w.setAlpha(i10);
        this.f24916x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24915w.setColorFilter(colorFilter);
    }

    public ba0() {
        this.f24898b = -1L;
        this.f24899c = -1L;
        this.f24900f = new Matrix();
        this.f24901g = new Matrix();
        this.f24905l = org.telegram.ui.ActionBar.h6.f21064h5;
        this.f24906m = org.telegram.ui.ActionBar.h6.f21081i5;
        this.f24913t = 1.0f;
        this.f24914u = 1.0f;
        this.f24915w = new Paint(1);
        Paint paint = new Paint(1);
        this.f24916x = paint;
        this.f24918z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
