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
public final class gh0 {
    public static DecelerateInterpolator A;
    public final View f34974i;
    public boolean f34976k;
    public boolean f34977l;
    public Drawable f34978m;
    public Drawable f34979n;
    public final Paint f34981p;
    public boolean f34986u;
    public long f34968a = 0;
    public float f34969b = 0.0f;
    public float f34970c = 0.0f;
    public float d = 0.0f;
    public long f34971e = 0;
    public float f34972f = 0.0f;
    public final RectF f34973g = new RectF();
    public final RectF h = new RectF();
    public float f34975j = 1.0f;
    public int f34980o = -1;
    public int f34982q = org.telegram.messenger.g0.L(4.0f);
    public final boolean f34983r = true;
    public final float f34984s = 1.0f;
    public Paint f34985t = null;
    public float v = 3000.0f;
    public final Path f34987w = new Path();
    public final Matrix f34988x = new Matrix();
    public final PathMeasure f34989y = new PathMeasure();
    public final Path f34990z = new Path();

    public gh0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f34981p = paint;
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
        this.f34974i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f34979n;
        RectF rectF = this.f34973g;
        float f10 = this.f34984s;
        if (drawable != null) {
            if (this.f34983r) {
                drawable.setAlpha((int) (this.f34975j * 255.0f * f10));
            } else {
                drawable.setAlpha((int) (f10 * 255.0f));
            }
            this.f34979n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f34979n.draw(canvas);
        }
        Drawable drawable2 = this.f34978m;
        if (drawable2 != null) {
            if (this.f34979n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.k5.A(1.0f, this.f34975j, 255.0f, f10));
            } else {
                drawable2.setAlpha((int) (f10 * 255.0f));
            }
            this.f34978m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f34978m.draw(canvas);
        }
        if (!this.f34976k && !this.f34977l) {
            g(false);
            return;
        }
        Paint paint2 = this.f34985t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i7 = this.f34980o;
            Paint paint3 = this.f34981p;
            paint3.setColor(i7);
            if (this.f34977l) {
                paint3.setAlpha((int) (this.f34975j * 255.0f * f10));
            } else {
                paint3.setAlpha((int) (f10 * 255.0f));
            }
            paint = paint3;
        }
        float f11 = rectF.left;
        float f12 = this.f34982q;
        RectF rectF2 = this.h;
        rectF2.set(f11 + f12, rectF.top + f12, rectF.right - f12, rectF.bottom - f12);
        b(this.f34969b - 90.0f, Math.max(4.0f, this.f34972f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f34986u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            float f14 = ((f10 + f11) - f13) / 360.0f;
            Path path = this.f34987w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f34988x;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f34989y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f34990z;
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
        RectF rectF = this.f34973g;
        int i7 = ((int) rectF.left) - L;
        int i10 = ((int) rectF.top) - L;
        int i11 = L * 2;
        this.f34974i.invalidate(i7, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f34968a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f34978m) != drawable) {
            this.f34979n = drawable2;
            this.f34977l = this.f34976k;
            this.f34975j = 1.0f;
            e(z11, 1.0f);
        } else {
            this.f34979n = null;
            this.f34977l = false;
        }
        this.f34976k = z10;
        this.f34978m = drawable;
        if (!z11) {
            this.f34974i.invalidate();
        } else {
            c();
        }
    }

    public final void e(boolean z10, float f10) {
        if (f10 != 1.0f && this.f34975j != 0.0f && this.f34979n != null) {
            this.f34975j = 0.0f;
            this.f34979n = null;
        }
        if (!z10) {
            this.f34972f = f10;
            this.d = f10;
        } else {
            if (this.f34972f > f10) {
                this.f34972f = f10;
            }
            this.d = this.f34972f;
        }
        this.f34970c = f10;
        this.f34971e = 0L;
        c();
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f34973g.set(i7, i10, i11, i12);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f34968a;
        this.f34968a = currentTimeMillis;
        if (z10) {
            if (this.f34972f != 1.0f) {
                this.f34969b = (((float) (360 * j3)) / this.v) + this.f34969b;
                float f10 = this.f34970c;
                float f11 = this.d;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.f34971e + j3;
                    this.f34971e = j10;
                    if (j10 >= 300) {
                        this.f34972f = f10;
                        this.d = f10;
                        this.f34971e = 0L;
                    } else {
                        this.f34972f = (A.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                c();
            }
            if (this.f34972f >= 1.0f && this.f34979n != null) {
                float f13 = this.f34975j - (((float) j3) / 200.0f);
                this.f34975j = f13;
                if (f13 <= 0.0f) {
                    this.f34975j = 0.0f;
                    this.f34979n = null;
                }
                c();
            }
        } else if (this.f34979n != null) {
            float f14 = this.f34975j - (((float) j3) / 200.0f);
            this.f34975j = f14;
            if (f14 <= 0.0f) {
                this.f34975j = 0.0f;
                this.f34979n = null;
            }
            c();
        }
    }
}
