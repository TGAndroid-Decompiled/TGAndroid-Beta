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
public class aa0 extends Drawable {
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
    public final org.telegram.ui.ActionBar.g6 f24684a;
    public long f24685b;
    public long f24686c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f24687f;
    public final Matrix f24688g;
    public int h;
    public int f24689i;
    public int f24690j;
    public int f24691k;
    public int f24692l;
    public int f24693m;
    public boolean f24694n;
    public Integer f24695o;
    public Integer f24696p;
    public Integer f24697q;
    public Integer f24698r;
    public int f24699s;
    public float f24700t;
    public float f24701u;
    public long v;
    public final Paint f24702w;
    public final Paint f24703x;
    public Path f24704y;
    public final Path f24705z;

    public aa0(org.telegram.ui.ActionBar.g6 g6Var) {
        this();
        this.f24684a = g6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f24686c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f24702w);
        if (this.f24694n) {
            canvas.drawPath(path, this.f24703x);
        }
    }

    public final boolean c() {
        if (this.f24686c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24686c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f24686c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24686c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aa0.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i10, int i11) {
        this.f24695o = Integer.valueOf(i10);
        this.f24696p = Integer.valueOf(i11);
        this.f24694n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f24695o = Integer.valueOf(i10);
        this.f24696p = Integer.valueOf(i11);
        this.f24694n = true;
        this.f24697q = Integer.valueOf(i12);
        this.f24698r = Integer.valueOf(i13);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f24700t = 2.0f;
    }

    public final void i(float f7) {
        boolean z10;
        if (this.f24704y != null) {
            this.f24702w.setPathEffect(new CornerPathEffect(f7));
            this.f24703x.setPathEffect(new CornerPathEffect(f7));
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
            Path path = this.f24705z;
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
                Path path = this.f24705z;
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
        Path path = this.f24704y;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24702w.setAlpha(i10);
        this.f24703x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24702w.setColorFilter(colorFilter);
    }

    public aa0() {
        this.f24685b = -1L;
        this.f24686c = -1L;
        this.f24687f = new Matrix();
        this.f24688g = new Matrix();
        this.f24692l = org.telegram.ui.ActionBar.k6.f21255h5;
        this.f24693m = org.telegram.ui.ActionBar.k6.f21272i5;
        this.f24700t = 1.0f;
        this.f24701u = 1.0f;
        this.f24702w = new Paint(1);
        Paint paint = new Paint(1);
        this.f24703x = paint;
        this.f24705z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
