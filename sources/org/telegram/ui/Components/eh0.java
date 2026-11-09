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
public final class eh0 {
    public static DecelerateInterpolator A;
    public final View f33395i;
    public boolean f33397k;
    public boolean f33398l;
    public Drawable f33399m;
    public Drawable f33400n;
    public final Paint f33402p;
    public boolean f33407u;
    public long f33389a = 0;
    public float f33390b = 0.0f;
    public float f33391c = 0.0f;
    public float d = 0.0f;
    public long f33392e = 0;
    public float f33393f = 0.0f;
    public final RectF f33394g = new RectF();
    public final RectF h = new RectF();
    public float f33396j = 1.0f;
    public int f33401o = -1;
    public int f33403q = org.telegram.messenger.g0.L(4.0f);
    public final boolean f33404r = true;
    public final float f33405s = 1.0f;
    public Paint f33406t = null;
    public float v = 3000.0f;
    public final Path f33408w = new Path();
    public final Matrix f33409x = new Matrix();
    public final PathMeasure f33410y = new PathMeasure();
    public final Path f33411z = new Path();

    public eh0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f33402p = paint;
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
        this.f33395i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f33400n;
        RectF rectF = this.f33394g;
        float f10 = this.f33405s;
        if (drawable != null) {
            if (this.f33404r) {
                drawable.setAlpha((int) (this.f33396j * 255.0f * f10));
            } else {
                drawable.setAlpha((int) (f10 * 255.0f));
            }
            this.f33400n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f33400n.draw(canvas);
        }
        Drawable drawable2 = this.f33399m;
        if (drawable2 != null) {
            if (this.f33400n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.k5.A(1.0f, this.f33396j, 255.0f, f10));
            } else {
                drawable2.setAlpha((int) (f10 * 255.0f));
            }
            this.f33399m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f33399m.draw(canvas);
        }
        if (!this.f33397k && !this.f33398l) {
            g(false);
            return;
        }
        Paint paint2 = this.f33406t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i7 = this.f33401o;
            Paint paint3 = this.f33402p;
            paint3.setColor(i7);
            if (this.f33398l) {
                paint3.setAlpha((int) (this.f33396j * 255.0f * f10));
            } else {
                paint3.setAlpha((int) (f10 * 255.0f));
            }
            paint = paint3;
        }
        float f11 = rectF.left;
        float f12 = this.f33403q;
        RectF rectF2 = this.h;
        rectF2.set(f11 + f12, rectF.top + f12, rectF.right - f12, rectF.bottom - f12);
        b(this.f33390b - 90.0f, Math.max(4.0f, this.f33393f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f33407u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            float f14 = ((f10 + f11) - f13) / 360.0f;
            Path path = this.f33408w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f33409x;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f33410y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f33411z;
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
        RectF rectF = this.f33394g;
        int i7 = ((int) rectF.left) - L;
        int i10 = ((int) rectF.top) - L;
        int i11 = L * 2;
        this.f33395i.invalidate(i7, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public final void d(Drawable drawable, boolean z9, boolean z10) {
        Drawable drawable2;
        this.f33389a = System.currentTimeMillis();
        if (z10 && (drawable2 = this.f33399m) != drawable) {
            this.f33400n = drawable2;
            this.f33398l = this.f33397k;
            this.f33396j = 1.0f;
            e(z10, 1.0f);
        } else {
            this.f33400n = null;
            this.f33398l = false;
        }
        this.f33397k = z9;
        this.f33399m = drawable;
        if (!z10) {
            this.f33395i.invalidate();
        } else {
            c();
        }
    }

    public final void e(boolean z9, float f10) {
        if (f10 != 1.0f && this.f33396j != 0.0f && this.f33400n != null) {
            this.f33396j = 0.0f;
            this.f33400n = null;
        }
        if (!z9) {
            this.f33393f = f10;
            this.d = f10;
        } else {
            if (this.f33393f > f10) {
                this.f33393f = f10;
            }
            this.d = this.f33393f;
        }
        this.f33391c = f10;
        this.f33392e = 0L;
        c();
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f33394g.set(i7, i10, i11, i12);
    }

    public final void g(boolean z9) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f33389a;
        this.f33389a = currentTimeMillis;
        if (z9) {
            if (this.f33393f != 1.0f) {
                this.f33390b = (((float) (360 * j3)) / this.v) + this.f33390b;
                float f10 = this.f33391c;
                float f11 = this.d;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.f33392e + j3;
                    this.f33392e = j10;
                    if (j10 >= 300) {
                        this.f33393f = f10;
                        this.d = f10;
                        this.f33392e = 0L;
                    } else {
                        this.f33393f = (A.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                c();
            }
            if (this.f33393f >= 1.0f && this.f33400n != null) {
                float f13 = this.f33396j - (((float) j3) / 200.0f);
                this.f33396j = f13;
                if (f13 <= 0.0f) {
                    this.f33396j = 0.0f;
                    this.f33400n = null;
                }
                c();
            }
        } else if (this.f33400n != null) {
            float f14 = this.f33396j - (((float) j3) / 200.0f);
            this.f33396j = f14;
            if (f14 <= 0.0f) {
                this.f33396j = 0.0f;
                this.f33400n = null;
            }
            c();
        }
    }
}
