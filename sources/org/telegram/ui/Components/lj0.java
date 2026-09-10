package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class lj0 {
    public static DecelerateInterpolator A;
    public final View f25004i;
    public boolean f25006k;
    public boolean f25007l;
    public Drawable f25008m;
    public Drawable f25009n;
    public final Paint f25011p;
    public boolean f25016u;
    public long f24999a = 0;
    public float f25000b = 0.0f;
    public float f25001c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f25002f = 0.0f;
    public final RectF f25003g = new RectF();
    public final RectF h = new RectF();
    public float f25005j = 1.0f;
    public int f25010o = -1;
    public int f25012q = AndroidUtilities.dp(4.0f);
    public final boolean f25013r = true;
    public final float f25014s = 1.0f;
    public Paint f25015t = null;
    public float v = 3000.0f;
    public final Path f25017w = new Path();
    public final Matrix f25018x = new Matrix();
    public final PathMeasure f25019y = new PathMeasure();
    public final Path f25020z = new Path();

    public lj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f25011p = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        new Paint(1);
        this.f25004i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f25009n;
        RectF rectF = this.f25003g;
        float f7 = this.f25014s;
        if (drawable != null) {
            if (this.f25013r) {
                drawable.setAlpha((int) (this.f25005j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f25009n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f25009n.draw(canvas);
        }
        Drawable drawable2 = this.f25008m;
        if (drawable2 != null) {
            if (this.f25009n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.a2.A(1.0f, this.f25005j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f25008m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f25008m.draw(canvas);
        }
        if (!this.f25006k && !this.f25007l) {
            g(false);
            return;
        }
        Paint paint2 = this.f25015t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f25010o;
            Paint paint3 = this.f25011p;
            paint3.setColor(i10);
            if (this.f25007l) {
                paint3.setAlpha((int) (this.f25005j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f25012q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f25000b - 90.0f, Math.max(4.0f, this.f25002f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f25016u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f25017w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f25018x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f25019y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f25020z;
            path2.reset();
            pathMeasure.getSegment(((f7 - f12) / 360.0f) * length, length * f13, path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            if (f13 > 1.0f) {
                b(f7 + 90.0f, f10 - 90.0f, canvas, paint, rectF);
                return;
            }
            return;
        }
        canvas.drawArc(rectF, f7, f10, false, paint);
    }

    public final void c() {
        int dp = AndroidUtilities.dp(2.0f);
        RectF rectF = this.f25003g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f25004i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f24999a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f25008m) != drawable) {
            this.f25009n = drawable2;
            this.f25007l = this.f25006k;
            this.f25005j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f25009n = null;
            this.f25007l = false;
        }
        this.f25006k = z10;
        this.f25008m = drawable;
        if (!z11) {
            this.f25004i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f25005j != 0.0f && this.f25009n != null) {
            this.f25005j = 0.0f;
            this.f25009n = null;
        }
        if (!z10) {
            this.f25002f = f7;
            this.d = f7;
        } else {
            if (this.f25002f > f7) {
                this.f25002f = f7;
            }
            this.d = this.f25002f;
        }
        this.f25001c = f7;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f25003g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f24999a;
        this.f24999a = currentTimeMillis;
        if (z10) {
            if (this.f25002f != 1.0f) {
                this.f25000b = (((float) (360 * j3)) / this.v) + this.f25000b;
                float f7 = this.f25001c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j10 = this.e + j3;
                    this.e = j10;
                    if (j10 >= 300) {
                        this.f25002f = f7;
                        this.d = f7;
                        this.e = 0L;
                    } else {
                        this.f25002f = (A.getInterpolation(((float) j10) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f25002f >= 1.0f && this.f25009n != null) {
                float f12 = this.f25005j - (((float) j3) / 200.0f);
                this.f25005j = f12;
                if (f12 <= 0.0f) {
                    this.f25005j = 0.0f;
                    this.f25009n = null;
                }
                c();
            }
        } else if (this.f25009n != null) {
            float f13 = this.f25005j - (((float) j3) / 200.0f);
            this.f25005j = f13;
            if (f13 <= 0.0f) {
                this.f25005j = 0.0f;
                this.f25009n = null;
            }
            c();
        }
    }
}
