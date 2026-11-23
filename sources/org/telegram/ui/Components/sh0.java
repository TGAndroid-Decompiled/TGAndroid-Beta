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
    public final View f39586i;
    public boolean f39588k;
    public boolean f39589l;
    public Drawable f39590m;
    public Drawable f39591n;
    public final Paint f39593p;
    public boolean f39598u;
    public long f39580a = 0;
    public float f39581b = 0.0f;
    public float f39582c = 0.0f;
    public float d = 0.0f;
    public long f39583e = 0;
    public float f39584f = 0.0f;
    public final RectF f39585g = new RectF();
    public final RectF h = new RectF();
    public float f39587j = 1.0f;
    public int f39592o = -1;
    public int f39594q = org.telegram.messenger.g0.L(4.0f);
    public final boolean f39595r = true;
    public final float f39596s = 1.0f;
    public Paint f39597t = null;
    public float v = 3000.0f;
    public final Path f39599w = new Path();
    public final Matrix f39600x = new Matrix();
    public final PathMeasure f39601y = new PathMeasure();
    public final Path f39602z = new Path();

    public sh0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f39593p = paint;
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
        this.f39586i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f39591n;
        RectF rectF = this.f39585g;
        float f10 = this.f39596s;
        if (drawable != null) {
            if (this.f39595r) {
                drawable.setAlpha((int) (this.f39587j * 255.0f * f10));
            } else {
                drawable.setAlpha((int) (f10 * 255.0f));
            }
            this.f39591n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f39591n.draw(canvas);
        }
        Drawable drawable2 = this.f39590m;
        if (drawable2 != null) {
            if (this.f39591n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.f3.A(1.0f, this.f39587j, 255.0f, f10));
            } else {
                drawable2.setAlpha((int) (f10 * 255.0f));
            }
            this.f39590m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f39590m.draw(canvas);
        }
        if (!this.f39588k && !this.f39589l) {
            g(false);
            return;
        }
        Paint paint2 = this.f39597t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i7 = this.f39592o;
            Paint paint3 = this.f39593p;
            paint3.setColor(i7);
            if (this.f39589l) {
                paint3.setAlpha((int) (this.f39587j * 255.0f * f10));
            } else {
                paint3.setAlpha((int) (f10 * 255.0f));
            }
            paint = paint3;
        }
        float f11 = rectF.left;
        float f12 = this.f39594q;
        RectF rectF2 = this.h;
        rectF2.set(f11 + f12, rectF.top + f12, rectF.right - f12, rectF.bottom - f12);
        b(this.f39581b - 90.0f, Math.max(4.0f, this.f39584f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f39598u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            float f14 = ((f10 + f11) - f13) / 360.0f;
            Path path = this.f39599w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f39600x;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f39601y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f39602z;
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
        RectF rectF = this.f39585g;
        int i7 = ((int) rectF.left) - L;
        int i10 = ((int) rectF.top) - L;
        int i11 = L * 2;
        this.f39586i.invalidate(i7, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f39580a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f39590m) != drawable) {
            this.f39591n = drawable2;
            this.f39589l = this.f39588k;
            this.f39587j = 1.0f;
            e(z11, 1.0f);
        } else {
            this.f39591n = null;
            this.f39589l = false;
        }
        this.f39588k = z10;
        this.f39590m = drawable;
        if (!z11) {
            this.f39586i.invalidate();
        } else {
            c();
        }
    }

    public final void e(boolean z10, float f10) {
        if (f10 != 1.0f && this.f39587j != 0.0f && this.f39591n != null) {
            this.f39587j = 0.0f;
            this.f39591n = null;
        }
        if (!z10) {
            this.f39584f = f10;
            this.d = f10;
        } else {
            if (this.f39584f > f10) {
                this.f39584f = f10;
            }
            this.d = this.f39584f;
        }
        this.f39582c = f10;
        this.f39583e = 0L;
        c();
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f39585g.set(i7, i10, i11, i12);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f39580a;
        this.f39580a = currentTimeMillis;
        if (z10) {
            if (this.f39584f != 1.0f) {
                this.f39581b = (((float) (360 * j3)) / this.v) + this.f39581b;
                float f10 = this.f39582c;
                float f11 = this.d;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.f39583e + j3;
                    this.f39583e = j10;
                    if (j10 >= 300) {
                        this.f39584f = f10;
                        this.d = f10;
                        this.f39583e = 0L;
                    } else {
                        this.f39584f = (A.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                c();
            }
            if (this.f39584f >= 1.0f && this.f39591n != null) {
                float f13 = this.f39587j - (((float) j3) / 200.0f);
                this.f39587j = f13;
                if (f13 <= 0.0f) {
                    this.f39587j = 0.0f;
                    this.f39591n = null;
                }
                c();
            }
        } else if (this.f39591n != null) {
            float f14 = this.f39587j - (((float) j3) / 200.0f);
            this.f39587j = f14;
            if (f14 <= 0.0f) {
                this.f39587j = 0.0f;
                this.f39591n = null;
            }
            c();
        }
    }
}
