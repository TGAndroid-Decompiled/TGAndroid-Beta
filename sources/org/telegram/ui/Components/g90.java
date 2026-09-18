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
    public final org.telegram.ui.ActionBar.f6 f24133a;
    public long f24134b;
    public long f24135c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f24136f;
    public final Matrix f24137g;
    public int h;
    public int f24138i;
    public int f24139j;
    public int f24140k;
    public int f24141l;
    public int f24142m;
    public boolean f24143n;
    public Integer f24144o;
    public Integer f24145p;
    public Integer f24146q;
    public Integer f24147r;
    public int f24148s;
    public float f24149t;
    public float f24150u;
    public final Paint v;
    public final Paint f24151w;
    public Path f24152x;
    public final Path f24153y;
    public Rect f24154z;

    public g90(org.telegram.ui.ActionBar.f6 f6Var) {
        this();
        this.f24133a = f6Var;
    }

    public final void a() {
        if (!b() && !c()) {
            this.f24135c = SystemClock.elapsedRealtime();
        }
    }

    public final boolean b() {
        if (this.f24135c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24135c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f24135c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f24135c)) < 320.0f) {
            return true;
        }
        return false;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f24154z = null;
    }

    @Override
    public final void draw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g90.draw(android.graphics.Canvas):void");
    }

    public final void e(int i10, int i11) {
        this.f24144o = Integer.valueOf(i10);
        this.f24145p = Integer.valueOf(i11);
        this.f24143n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f24144o = Integer.valueOf(i10);
        this.f24145p = Integer.valueOf(i11);
        this.f24143n = true;
        this.f24146q = Integer.valueOf(i12);
        this.f24147r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f24149t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        boolean z10;
        if (this.f24152x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.f24151w.setPathEffect(new CornerPathEffect(f7));
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
        if (this.f24154z != null && z10) {
            Path path = this.f24153y;
            path.rewind();
            Rect rect = this.f24154z;
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
            if (this.f24154z != null && z10) {
                Path path = this.f24153y;
                path.rewind();
                Rect rect = this.f24154z;
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
        Path path = this.f24152x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f24151w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public g90() {
        this.f24134b = -1L;
        this.f24135c = -1L;
        this.f24136f = new Matrix();
        this.f24137g = new Matrix();
        this.f24141l = org.telegram.ui.ActionBar.j6.f18934h5;
        this.f24142m = org.telegram.ui.ActionBar.j6.f18952i5;
        this.f24149t = 1.0f;
        this.f24150u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f24151w = paint;
        this.f24153y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
