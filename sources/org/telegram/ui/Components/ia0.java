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
public class ia0 extends Drawable {
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
    public final org.telegram.ui.ActionBar.d6 f27384a;
    public long f27385b;
    public long f27386c;
    public LinearGradient d;
    public LinearGradient f27387e;
    public final Matrix f27388f;
    public final Matrix f27389g;
    public int h;
    public int f27390i;
    public int f27391j;
    public int f27392k;
    public int f27393l;
    public int f27394m;
    public boolean f27395n;
    public Integer f27396o;
    public Integer f27397p;
    public Integer f27398q;
    public Integer f27399r;
    public int f27400s;
    public float f27401t;
    public float f27402u;
    public long v;
    public final Paint f27403w;
    public final Paint f27404x;
    public Path f27405y;
    public final Path f27406z;

    public ia0(org.telegram.ui.ActionBar.d6 d6Var) {
        this();
        this.f27384a = d6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f27386c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f27403w);
        if (this.f27395n) {
            canvas.drawPath(path, this.f27404x);
        }
    }

    public final boolean c() {
        if (this.f27386c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27386c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f27386c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f27386c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ia0.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i10, int i11) {
        this.f27396o = Integer.valueOf(i10);
        this.f27397p = Integer.valueOf(i11);
        this.f27395n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f27396o = Integer.valueOf(i10);
        this.f27397p = Integer.valueOf(i11);
        this.f27395n = true;
        this.f27398q = Integer.valueOf(i12);
        this.f27399r = Integer.valueOf(i13);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f27401t = 2.0f;
    }

    public final void i(float f7) {
        boolean z10;
        if (this.f27405y != null) {
            this.f27403w.setPathEffect(new CornerPathEffect(f7));
            this.f27404x.setPathEffect(new CornerPathEffect(f7));
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
            Path path = this.f27406z;
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
                Path path = this.f27406z;
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
        Path path = this.f27405y;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27403w.setAlpha(i10);
        this.f27404x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27403w.setColorFilter(colorFilter);
    }

    public ia0() {
        this.f27385b = -1L;
        this.f27386c = -1L;
        this.f27388f = new Matrix();
        this.f27389g = new Matrix();
        this.f27393l = org.telegram.ui.ActionBar.h6.f20893h5;
        this.f27394m = org.telegram.ui.ActionBar.h6.f20912i5;
        this.f27401t = 1.0f;
        this.f27402u = 1.0f;
        this.f27403w = new Paint(1);
        Paint paint = new Paint(1);
        this.f27404x = paint;
        this.f27406z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
