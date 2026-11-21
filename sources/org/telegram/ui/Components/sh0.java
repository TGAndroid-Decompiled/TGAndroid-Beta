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
public final class sh0 {
    public static DecelerateInterpolator A;
    public final View f39593i;
    public boolean f39595k;
    public boolean f39596l;
    public Drawable f39597m;
    public Drawable f39598n;
    public final Paint f39600p;
    public boolean f39605u;
    public long f39587a = 0;
    public float f39588b = 0.0f;
    public float f39589c = 0.0f;
    public float d = 0.0f;
    public long f39590e = 0;
    public float f39591f = 0.0f;
    public final RectF f39592g = new RectF();
    public final RectF h = new RectF();
    public float f39594j = 1.0f;
    public int f39599o = -1;
    public int f39601q = org.telegram.messenger.g0.L(4.0f);
    public final boolean f39602r = true;
    public final float f39603s = 1.0f;
    public Paint f39604t = null;
    public float v = 3000.0f;
    public final Path f39606w = new Path();
    public final Matrix f39607x = new Matrix();
    public final PathMeasure f39608y = new PathMeasure();
    public final Path f39609z = new Path();

    public sh0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f39600p = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        new Paint(1);
        this.f39593i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f39598n;
        RectF rectF = this.f39592g;
        float f10 = this.f39603s;
        if (drawable != null) {
            if (this.f39602r) {
                drawable.setAlpha((int) (this.f39594j * 255.0f * f10));
            } else {
                drawable.setAlpha((int) (f10 * 255.0f));
            }
            this.f39598n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f39598n.draw(canvas);
        }
        Drawable drawable2 = this.f39597m;
        if (drawable2 != null) {
            if (this.f39598n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.f3.A(1.0f, this.f39594j, 255.0f, f10));
            } else {
                drawable2.setAlpha((int) (f10 * 255.0f));
            }
            this.f39597m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f39597m.draw(canvas);
        }
        if (!this.f39595k && !this.f39596l) {
            g(false);
            return;
        }
        Paint paint2 = this.f39604t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i7 = this.f39599o;
            Paint paint3 = this.f39600p;
            paint3.setColor(i7);
            if (this.f39596l) {
                paint3.setAlpha((int) (this.f39594j * 255.0f * f10));
            } else {
                paint3.setAlpha((int) (f10 * 255.0f));
            }
            paint = paint3;
        }
        float f11 = rectF.left;
        float f12 = this.f39601q;
        RectF rectF2 = this.h;
        rectF2.set(f11 + f12, rectF.top + f12, rectF.right - f12, rectF.bottom - f12);
        b(this.f39588b - 90.0f, Math.max(4.0f, this.f39591f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f39605u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            float f14 = ((f10 + f11) - f13) / 360.0f;
            Path path = this.f39606w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f39607x;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f39608y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f39609z;
            path2.reset();
            pathMeasure.getSegment(((f10 - f13) / 360.0f) * length, length * f14, path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            if (f14 > 1.0f) {
                b(f10 + 90.0f, f11 - 90.0f, canvas, paint, rectF);
                return;
            }
            return;
        }
        canvas.drawArc(rectF, f10, f11, false, paint);
    }

    public final void c() {
        int L = org.telegram.messenger.g0.L(2.0f);
        RectF rectF = this.f39592g;
        int i7 = ((int) rectF.left) - L;
        int i10 = ((int) rectF.top) - L;
        int i11 = L * 2;
        this.f39593i.invalidate(i7, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f39587a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f39597m) != drawable) {
            this.f39598n = drawable2;
            this.f39596l = this.f39595k;
            this.f39594j = 1.0f;
            e(z11, 1.0f);
        } else {
            this.f39598n = null;
            this.f39596l = false;
        }
        this.f39595k = z10;
        this.f39597m = drawable;
        if (!z11) {
            this.f39593i.invalidate();
        } else {
            c();
        }
    }

    public final void e(boolean z10, float f10) {
        if (f10 != 1.0f && this.f39594j != 0.0f && this.f39598n != null) {
            this.f39594j = 0.0f;
            this.f39598n = null;
        }
        if (!z10) {
            this.f39591f = f10;
            this.d = f10;
        } else {
            if (this.f39591f > f10) {
                this.f39591f = f10;
            }
            this.d = this.f39591f;
        }
        this.f39589c = f10;
        this.f39590e = 0L;
        c();
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f39592g.set(i7, i10, i11, i12);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f39587a;
        this.f39587a = currentTimeMillis;
        if (z10) {
            if (this.f39591f != 1.0f) {
                this.f39588b = (((float) (360 * j3)) / this.v) + this.f39588b;
                float f10 = this.f39589c;
                float f11 = this.d;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.f39590e + j3;
                    this.f39590e = j10;
                    if (j10 >= 300) {
                        this.f39591f = f10;
                        this.d = f10;
                        this.f39590e = 0L;
                    } else {
                        this.f39591f = (A.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                c();
            }
            if (this.f39591f >= 1.0f && this.f39598n != null) {
                float f13 = this.f39594j - (((float) j3) / 200.0f);
                this.f39594j = f13;
                if (f13 <= 0.0f) {
                    this.f39594j = 0.0f;
                    this.f39598n = null;
                }
                c();
            }
        } else if (this.f39598n != null) {
            float f14 = this.f39594j - (((float) j3) / 200.0f);
            this.f39594j = f14;
            if (f14 <= 0.0f) {
                this.f39594j = 0.0f;
                this.f39598n = null;
            }
            c();
        }
    }
}
