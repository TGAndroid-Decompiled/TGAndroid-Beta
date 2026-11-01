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
public final class gi0 {
    public static DecelerateInterpolator A;
    public final View f26446i;
    public boolean f26448k;
    public boolean f26449l;
    public Drawable f26450m;
    public Drawable f26451n;
    public final Paint f26453p;
    public boolean f26458u;
    public long f26441a = 0;
    public float f26442b = 0.0f;
    public float f26443c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f26444f = 0.0f;
    public final RectF f26445g = new RectF();
    public final RectF h = new RectF();
    public float f26447j = 1.0f;
    public int f26452o = -1;
    public int f26454q = org.telegram.messenger.i0.L(4.0f);
    public final boolean f26455r = true;
    public final float f26456s = 1.0f;
    public Paint f26457t = null;
    public float v = 3000.0f;
    public final Path f26459w = new Path();
    public final Matrix f26460x = new Matrix();
    public final PathMeasure f26461y = new PathMeasure();
    public final Path f26462z = new Path();

    public gi0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f26453p = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        new Paint(1);
        this.f26446i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f26451n;
        RectF rectF = this.f26445g;
        float f7 = this.f26456s;
        if (drawable != null) {
            if (this.f26455r) {
                drawable.setAlpha((int) (this.f26447j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f26451n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f26451n.draw(canvas);
        }
        Drawable drawable2 = this.f26450m;
        if (drawable2 != null) {
            if (this.f26451n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.m5.A(1.0f, this.f26447j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f26450m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f26450m.draw(canvas);
        }
        if (!this.f26448k && !this.f26449l) {
            g(false);
            return;
        }
        Paint paint2 = this.f26457t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f26452o;
            Paint paint3 = this.f26453p;
            paint3.setColor(i10);
            if (this.f26449l) {
                paint3.setAlpha((int) (this.f26447j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f26454q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f26442b - 90.0f, Math.max(4.0f, this.f26444f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f26458u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f26459w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f26460x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f26461y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f26462z;
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
        int L = org.telegram.messenger.i0.L(2.0f);
        RectF rectF = this.f26445g;
        int i10 = ((int) rectF.left) - L;
        int i11 = ((int) rectF.top) - L;
        int i12 = L * 2;
        this.f26446i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f26441a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f26450m) != drawable) {
            this.f26451n = drawable2;
            this.f26449l = this.f26448k;
            this.f26447j = 1.0f;
            e(z11, 1.0f);
        } else {
            this.f26451n = null;
            this.f26449l = false;
        }
        this.f26448k = z10;
        this.f26450m = drawable;
        if (!z11) {
            this.f26446i.invalidate();
        } else {
            c();
        }
    }

    public final void e(boolean z10, float f7) {
        if (f7 != 1.0f && this.f26447j != 0.0f && this.f26451n != null) {
            this.f26447j = 0.0f;
            this.f26451n = null;
        }
        if (!z10) {
            this.f26444f = f7;
            this.d = f7;
        } else {
            if (this.f26444f > f7) {
                this.f26444f = f7;
            }
            this.d = this.f26444f;
        }
        this.f26443c = f7;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f26445g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f26441a;
        this.f26441a = currentTimeMillis;
        if (z10) {
            if (this.f26444f != 1.0f) {
                this.f26442b = (((float) (360 * j10)) / this.v) + this.f26442b;
                float f7 = this.f26443c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j11 = this.e + j10;
                    this.e = j11;
                    if (j11 >= 300) {
                        this.f26444f = f7;
                        this.d = f7;
                        this.e = 0L;
                    } else {
                        this.f26444f = (A.getInterpolation(((float) j11) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f26444f >= 1.0f && this.f26451n != null) {
                float f12 = this.f26447j - (((float) j10) / 200.0f);
                this.f26447j = f12;
                if (f12 <= 0.0f) {
                    this.f26447j = 0.0f;
                    this.f26451n = null;
                }
                c();
            }
        } else if (this.f26451n != null) {
            float f13 = this.f26447j - (((float) j10) / 200.0f);
            this.f26447j = f13;
            if (f13 <= 0.0f) {
                this.f26447j = 0.0f;
                this.f26451n = null;
            }
            c();
        }
    }
}
