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
public final class dh0 {
    public static DecelerateInterpolator A;
    public final View f32907i;
    public boolean f32909k;
    public boolean f32910l;
    public Drawable f32911m;
    public Drawable f32912n;
    public final Paint f32914p;
    public boolean f32919u;
    public long f32901a = 0;
    public float f32902b = 0.0f;
    public float f32903c = 0.0f;
    public float d = 0.0f;
    public long f32904e = 0;
    public float f32905f = 0.0f;
    public final RectF f32906g = new RectF();
    public final RectF h = new RectF();
    public float f32908j = 1.0f;
    public int f32913o = -1;
    public int f32915q = org.telegram.messenger.g0.L(4.0f);
    public final boolean f32916r = true;
    public final float f32917s = 1.0f;
    public Paint f32918t = null;
    public float v = 3000.0f;
    public final Path f32920w = new Path();
    public final Matrix f32921x = new Matrix();
    public final PathMeasure f32922y = new PathMeasure();
    public final Path f32923z = new Path();

    public dh0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f32914p = paint;
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
        this.f32907i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f32912n;
        RectF rectF = this.f32906g;
        float f10 = this.f32917s;
        if (drawable != null) {
            if (this.f32916r) {
                drawable.setAlpha((int) (this.f32908j * 255.0f * f10));
            } else {
                drawable.setAlpha((int) (f10 * 255.0f));
            }
            this.f32912n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f32912n.draw(canvas);
        }
        Drawable drawable2 = this.f32911m;
        if (drawable2 != null) {
            if (this.f32912n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.k5.A(1.0f, this.f32908j, 255.0f, f10));
            } else {
                drawable2.setAlpha((int) (f10 * 255.0f));
            }
            this.f32911m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f32911m.draw(canvas);
        }
        if (!this.f32909k && !this.f32910l) {
            g(false);
            return;
        }
        Paint paint2 = this.f32918t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i7 = this.f32913o;
            Paint paint3 = this.f32914p;
            paint3.setColor(i7);
            if (this.f32910l) {
                paint3.setAlpha((int) (this.f32908j * 255.0f * f10));
            } else {
                paint3.setAlpha((int) (f10 * 255.0f));
            }
            paint = paint3;
        }
        float f11 = rectF.left;
        float f12 = this.f32915q;
        RectF rectF2 = this.h;
        rectF2.set(f11 + f12, rectF.top + f12, rectF.right - f12, rectF.bottom - f12);
        b(this.f32902b - 90.0f, Math.max(4.0f, this.f32905f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f32919u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            float f14 = ((f10 + f11) - f13) / 360.0f;
            Path path = this.f32920w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f32921x;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f32922y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f32923z;
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
        RectF rectF = this.f32906g;
        int i7 = ((int) rectF.left) - L;
        int i10 = ((int) rectF.top) - L;
        int i11 = L * 2;
        this.f32907i.invalidate(i7, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public final void d(Drawable drawable, boolean z9, boolean z10) {
        Drawable drawable2;
        this.f32901a = System.currentTimeMillis();
        if (z10 && (drawable2 = this.f32911m) != drawable) {
            this.f32912n = drawable2;
            this.f32910l = this.f32909k;
            this.f32908j = 1.0f;
            e(z10, 1.0f);
        } else {
            this.f32912n = null;
            this.f32910l = false;
        }
        this.f32909k = z9;
        this.f32911m = drawable;
        if (!z10) {
            this.f32907i.invalidate();
        } else {
            c();
        }
    }

    public final void e(boolean z9, float f10) {
        if (f10 != 1.0f && this.f32908j != 0.0f && this.f32912n != null) {
            this.f32908j = 0.0f;
            this.f32912n = null;
        }
        if (!z9) {
            this.f32905f = f10;
            this.d = f10;
        } else {
            if (this.f32905f > f10) {
                this.f32905f = f10;
            }
            this.d = this.f32905f;
        }
        this.f32903c = f10;
        this.f32904e = 0L;
        c();
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f32906g.set(i7, i10, i11, i12);
    }

    public final void g(boolean z9) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f32901a;
        this.f32901a = currentTimeMillis;
        if (z9) {
            if (this.f32905f != 1.0f) {
                this.f32902b = (((float) (360 * j3)) / this.v) + this.f32902b;
                float f10 = this.f32903c;
                float f11 = this.d;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.f32904e + j3;
                    this.f32904e = j10;
                    if (j10 >= 300) {
                        this.f32905f = f10;
                        this.d = f10;
                        this.f32904e = 0L;
                    } else {
                        this.f32905f = (A.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                c();
            }
            if (this.f32905f >= 1.0f && this.f32912n != null) {
                float f13 = this.f32908j - (((float) j3) / 200.0f);
                this.f32908j = f13;
                if (f13 <= 0.0f) {
                    this.f32908j = 0.0f;
                    this.f32912n = null;
                }
                c();
            }
        } else if (this.f32912n != null) {
            float f14 = this.f32908j - (((float) j3) / 200.0f);
            this.f32908j = f14;
            if (f14 <= 0.0f) {
                this.f32908j = 0.0f;
                this.f32912n = null;
            }
            c();
        }
    }
}
