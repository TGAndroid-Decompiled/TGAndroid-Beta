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
public class ma0 extends Drawable {
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
    public final org.telegram.ui.ActionBar.c6 f28466a;
    public long f28467b;
    public long f28468c;
    public LinearGradient d;
    public LinearGradient f28469e;
    public final Matrix f28470f;
    public final Matrix f28471g;
    public int h;
    public int f28472i;
    public int f28473j;
    public int f28474k;
    public int f28475l;
    public int f28476m;
    public boolean f28477n;
    public Integer f28478o;
    public Integer f28479p;
    public Integer f28480q;
    public Integer f28481r;
    public int f28482s;
    public float f28483t;
    public float f28484u;
    public long v;
    public final Paint f28485w;
    public final Paint f28486x;
    public Path f28487y;
    public final Path f28488z;

    public ma0(org.telegram.ui.ActionBar.c6 c6Var) {
        this();
        this.f28466a = c6Var;
    }

    public final void a() {
        if (!c() && !d()) {
            this.f28468c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.f28485w);
        if (this.f28477n) {
            canvas.drawPath(path, this.f28486x);
        }
    }

    public final boolean c() {
        if (this.f28468c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28468c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f28468c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f28468c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma0.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i10, int i11) {
        this.f28478o = Integer.valueOf(i10);
        this.f28479p = Integer.valueOf(i11);
        this.f28477n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f28478o = Integer.valueOf(i10);
        this.f28479p = Integer.valueOf(i11);
        this.f28477n = true;
        this.f28480q = Integer.valueOf(i12);
        this.f28481r = Integer.valueOf(i13);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.f28483t = 2.0f;
    }

    public final void i(float f7) {
        boolean z10;
        if (this.f28487y != null) {
            this.f28485w.setPathEffect(new CornerPathEffect(f7));
            this.f28486x.setPathEffect(new CornerPathEffect(f7));
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
            Path path = this.f28488z;
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
                Path path = this.f28488z;
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
        Path path = this.f28487y;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28485w.setAlpha(i10);
        this.f28486x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28485w.setColorFilter(colorFilter);
    }

    public ma0() {
        this.f28467b = -1L;
        this.f28468c = -1L;
        this.f28470f = new Matrix();
        this.f28471g = new Matrix();
        this.f28475l = org.telegram.ui.ActionBar.h6.f20630h5;
        this.f28476m = org.telegram.ui.ActionBar.h6.f20649i5;
        this.f28483t = 1.0f;
        this.f28484u = 1.0f;
        this.f28485w = new Paint(1);
        Paint paint = new Paint(1);
        this.f28486x = paint;
        this.f28488z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
