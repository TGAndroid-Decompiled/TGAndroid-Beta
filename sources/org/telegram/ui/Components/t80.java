package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

public final class t80 extends Drawable {
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

    public final org.telegram.ui.ActionBar.c6 f32691a;

    public long f32692b;

    public long f32693c;
    public LinearGradient d;

    public LinearGradient f32694e;

    public final Matrix f32695f;

    public final Matrix f32696g;
    public int h;

    public int f32697i;

    public int f32698j;

    public int f32699k;

    public int f32700l;

    public int f32701m;

    public boolean f32702n;

    public Integer f32703o;

    public Integer f32704p;

    public Integer f32705q;

    public Integer f32706r;

    public int f32707s;

    public float f32708t;

    public float f32709u;
    public final Paint v;

    public final Paint f32710w;

    public Path f32711x;

    public final Path f32712y;

    public Rect f32713z;

    public t80(org.telegram.ui.ActionBar.c6 c6Var) {
        this();
        this.f32691a = c6Var;
    }

    public final void a() {
        if (b() || c()) {
            return;
        }
        this.f32693c = SystemClock.elapsedRealtime();
    }

    public final boolean b() {
        return this.f32693c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f32693c)) >= 320.0f;
    }

    public final boolean c() {
        return this.f32693c > 0 && ((float) (SystemClock.elapsedRealtime() - this.f32693c)) < 320.0f;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f32713z = null;
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        if (b()) {
            return;
        }
        Rect bounds = getBounds();
        Paint paint = this.v;
        if (paint.getAlpha() <= 0) {
            return;
        }
        int iWidth = bounds.width();
        if (iWidth <= 0) {
            iWidth = AndroidUtilities.dp(200.0f);
        }
        int iMin = (int) (Math.min(AndroidUtilities.dp(400.0f), iWidth) * this.f32708t);
        Integer num = this.f32703o;
        org.telegram.ui.ActionBar.c6 c6Var = this.f32691a;
        int iIntValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(this.f32700l, c6Var);
        Integer num2 = this.f32704p;
        int iIntValue2 = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(this.f32701m, c6Var);
        Integer num3 = this.f32705q;
        int iIntValue3 = num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.v0(this.f32700l, c6Var);
        Integer num4 = this.f32706r;
        int iIntValue4 = num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.g6.v0(this.f32701m, c6Var);
        LinearGradient linearGradient = this.d;
        Matrix matrix = this.f32696g;
        Matrix matrix2 = this.f32695f;
        Paint paint2 = this.f32710w;
        if (linearGradient == null || iMin != this.f32707s || iIntValue != this.h || iIntValue2 != this.f32697i || iIntValue3 != this.f32698j || iIntValue4 != this.f32699k) {
            this.f32707s = iMin;
            this.h = iIntValue;
            this.f32697i = iIntValue2;
            float f10 = this.f32707s;
            int i10 = this.h;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{i10, this.f32697i, i10}, new float[]{0.0f, 0.67f, 1.0f}, tileMode);
            this.d = linearGradient2;
            linearGradient2.setLocalMatrix(matrix2);
            paint.setShader(this.d);
            this.f32698j = iIntValue3;
            this.f32699k = iIntValue4;
            float f11 = this.f32707s;
            int i11 = this.f32698j;
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, f11, 0.0f, new int[]{i11, i11, this.f32699k, i11}, new float[]{0.0f, 0.4f, 0.67f, 1.0f}, tileMode);
            this.f32694e = linearGradient3;
            linearGradient3.setLocalMatrix(matrix);
            paint2.setShader(this.f32694e);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f32692b < 0) {
            this.f32692b = jElapsedRealtime;
        }
        float fPow = ((float) Math.pow((((jElapsedRealtime - this.f32692b) / 2000.0f) * this.f32709u) / 4.0f, 0.8500000238418579d)) * 4.0f * AndroidUtilities.density;
        float f12 = this.f32707s;
        float f13 = (fPow * f12) % f12;
        float f14 = (jElapsedRealtime - this.f32692b) / 550.0f;
        long j10 = this.f32693c;
        float interpolation = j10 > 0 ? 1.0f - er.f28123g.getInterpolation(Math.min(1.0f, (jElapsedRealtime - j10) / 320.0f)) : 0.0f;
        boolean zC = c();
        boolean z11 = false;
        RectF rectF = this.B;
        if (zC) {
            int iMax = Math.max(AndroidUtilities.dp(200.0f), bounds.width() / 3);
            if (interpolation < 1.0f) {
                if (this.I == null) {
                    this.I = new Paint(1);
                    this.H = iMax;
                    this.J = new LinearGradient(0.0f, 0.0f, iMax, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix3 = new Matrix();
                    this.K = matrix3;
                    this.J.setLocalMatrix(matrix3);
                    this.I.setShader(this.J);
                    this.I.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                } else if (this.H != iMax) {
                    this.H = iMax;
                    LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, iMax, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.J = linearGradient4;
                    linearGradient4.setLocalMatrix(this.K);
                    this.I.setShader(this.J);
                }
                rectF.set(bounds);
                rectF.inset(-paint2.getStrokeWidth(), -paint2.getStrokeWidth());
                canvas.saveLayerAlpha(rectF, 255, 31);
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (this.C) {
            int iMax2 = Math.max(AndroidUtilities.dp(200.0f), bounds.width() / 3);
            if (f14 < 1.0f) {
                if (this.E == null) {
                    this.E = new Paint(1);
                    this.D = iMax2;
                    this.F = new LinearGradient(0.0f, 0.0f, iMax2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix4 = new Matrix();
                    this.G = matrix4;
                    this.F.setLocalMatrix(matrix4);
                    this.E.setShader(this.F);
                    this.E.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                } else if (this.D != iMax2) {
                    this.D = iMax2;
                    LinearGradient linearGradient5 = new LinearGradient(0.0f, 0.0f, iMax2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.F = linearGradient5;
                    linearGradient5.setLocalMatrix(this.G);
                    this.E.setShader(this.F);
                }
                rectF.set(bounds);
                rectF.inset(-paint2.getStrokeWidth(), -paint2.getStrokeWidth());
                canvas.saveLayerAlpha(rectF, 255, 31);
                z11 = true;
            }
        }
        matrix2.setTranslate(f13, 0.0f);
        this.d.setLocalMatrix(matrix2);
        matrix.setTranslate(f13, 0.0f);
        this.f32694e.setLocalMatrix(matrix);
        Path path = this.f32711x;
        if (path == null) {
            Rect rect = this.f32713z;
            Path path2 = this.f32712y;
            if (rect == null || !rect.equals(bounds)) {
                path2.rewind();
                this.f32713z = bounds;
                rectF.set(bounds);
                path2.addRoundRect(rectF, this.A, Path.Direction.CW);
            }
            path = path2;
        }
        canvas.drawPath(path, paint);
        if (this.f32702n) {
            canvas.drawPath(path, paint2);
        }
        if (z11) {
            canvas.save();
            int iWidth2 = bounds.width() + this.D;
            int i12 = this.D;
            this.G.setTranslate(bounds.left + ((f14 * (iWidth2 + i12)) - i12), 0.0f);
            this.F.setLocalMatrix(this.G);
            int strokeWidth = (int) paint2.getStrokeWidth();
            canvas.drawRect(bounds.left - strokeWidth, bounds.top - strokeWidth, bounds.right + strokeWidth, bounds.bottom + strokeWidth, this.E);
            canvas.restore();
            canvas.restore();
        }
        if (z10) {
            canvas.save();
            int iWidth3 = bounds.width() + this.H;
            int i13 = this.H;
            this.K.setTranslate(bounds.right - ((interpolation * (iWidth3 + i13)) - i13), 0.0f);
            this.J.setLocalMatrix(this.K);
            int strokeWidth2 = (int) paint2.getStrokeWidth();
            canvas.drawRect(bounds.left - strokeWidth2, bounds.top - strokeWidth2, bounds.right + strokeWidth2, bounds.bottom + strokeWidth2, this.I);
            canvas.restore();
            canvas.restore();
        }
        if (b()) {
            return;
        }
        invalidateSelf();
    }

    public final void e(int i10, int i11) {
        this.f32703o = Integer.valueOf(i10);
        this.f32704p = Integer.valueOf(i11);
        this.f32702n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f32703o = Integer.valueOf(i10);
        this.f32704p = Integer.valueOf(i11);
        this.f32702n = true;
        this.f32705q = Integer.valueOf(i12);
        this.f32706r = Integer.valueOf(i13);
    }

    public final void g() {
        this.f32708t = 2.0f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f10) {
        if (this.f32711x != null) {
            this.v.setPathEffect(new CornerPathEffect(f10));
            this.f32710w.setPathEffect(new CornerPathEffect(f10));
            return;
        }
        float[] fArr = this.A;
        boolean z10 = (fArr[0] == f10 && fArr[2] == f10 && fArr[4] == f10 && fArr[6] == f10) ? false : true;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[7] = f10;
        fArr[6] = f10;
        if (this.f32713z == null || !z10) {
            return;
        }
        Path path = this.f32712y;
        path.rewind();
        Rect rect = this.f32713z;
        RectF rectF = this.B;
        rectF.set(rect);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public final void i(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < 8; i10++) {
            float[] fArr2 = this.A;
            float f10 = fArr2[i10];
            float f11 = fArr[i10];
            if (f10 != f11) {
                fArr2[i10] = f11;
                z10 = true;
            }
        }
        if (this.f32713z == null || !z10) {
            return;
        }
        Path path = this.f32712y;
        path.rewind();
        Rect rect = this.f32713z;
        RectF rectF = this.B;
        rectF.set(rect);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public final void j(float f10) {
        h(AndroidUtilities.dp(f10));
    }

    public final void k() {
        Path path = this.f32711x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.f32710w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public t80() {
        this.f32692b = -1L;
        this.f32693c = -1L;
        this.f32695f = new Matrix();
        this.f32696g = new Matrix();
        this.f32700l = org.telegram.ui.ActionBar.g6.f23124h5;
        this.f32701m = org.telegram.ui.ActionBar.g6.f23143i5;
        this.f32708t = 1.0f;
        this.f32709u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f32710w = paint;
        this.f32712y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
