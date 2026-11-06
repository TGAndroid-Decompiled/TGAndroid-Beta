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
    public final View f32878i;
    public boolean f32880k;
    public boolean f32881l;
    public Drawable f32882m;
    public Drawable f32883n;
    public final Paint f32885p;
    public boolean f32890u;
    public long f32872a = 0;
    public float f32873b = 0.0f;
    public float f32874c = 0.0f;
    public float d = 0.0f;
    public long f32875e = 0;
    public float f32876f = 0.0f;
    public final RectF f32877g = new RectF();
    public final RectF h = new RectF();
    public float f32879j = 1.0f;
    public int f32884o = -1;
    public int f32886q = org.telegram.messenger.g0.L(4.0f);
    public final boolean f32887r = true;
    public final float f32888s = 1.0f;
    public Paint f32889t = null;
    public float v = 3000.0f;
    public final Path f32891w = new Path();
    public final Matrix f32892x = new Matrix();
    public final PathMeasure f32893y = new PathMeasure();
    public final Path f32894z = new Path();

    public dh0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f32885p = paint;
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
        this.f32878i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f32883n;
        RectF rectF = this.f32877g;
        float f10 = this.f32888s;
        if (drawable != null) {
            if (this.f32887r) {
                drawable.setAlpha((int) (this.f32879j * 255.0f * f10));
            } else {
                drawable.setAlpha((int) (f10 * 255.0f));
            }
            this.f32883n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f32883n.draw(canvas);
        }
        Drawable drawable2 = this.f32882m;
        if (drawable2 != null) {
            if (this.f32883n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.k5.A(1.0f, this.f32879j, 255.0f, f10));
            } else {
                drawable2.setAlpha((int) (f10 * 255.0f));
            }
            this.f32882m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f32882m.draw(canvas);
        }
        if (!this.f32880k && !this.f32881l) {
            g(false);
            return;
        }
        Paint paint2 = this.f32889t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i7 = this.f32884o;
            Paint paint3 = this.f32885p;
            paint3.setColor(i7);
            if (this.f32881l) {
                paint3.setAlpha((int) (this.f32879j * 255.0f * f10));
            } else {
                paint3.setAlpha((int) (f10 * 255.0f));
            }
            paint = paint3;
        }
        float f11 = rectF.left;
        float f12 = this.f32886q;
        RectF rectF2 = this.h;
        rectF2.set(f11 + f12, rectF.top + f12, rectF.right - f12, rectF.bottom - f12);
        b(this.f32873b - 90.0f, Math.max(4.0f, this.f32876f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f32890u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            float f14 = ((f10 + f11) - f13) / 360.0f;
            Path path = this.f32891w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f32892x;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f32893y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f32894z;
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
        RectF rectF = this.f32877g;
        int i7 = ((int) rectF.left) - L;
        int i10 = ((int) rectF.top) - L;
        int i11 = L * 2;
        this.f32878i.invalidate(i7, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public final void d(Drawable drawable, boolean z9, boolean z10) {
        Drawable drawable2;
        this.f32872a = System.currentTimeMillis();
        if (z10 && (drawable2 = this.f32882m) != drawable) {
            this.f32883n = drawable2;
            this.f32881l = this.f32880k;
            this.f32879j = 1.0f;
            e(z10, 1.0f);
        } else {
            this.f32883n = null;
            this.f32881l = false;
        }
        this.f32880k = z9;
        this.f32882m = drawable;
        if (!z10) {
            this.f32878i.invalidate();
        } else {
            c();
        }
    }

    public final void e(boolean z9, float f10) {
        if (f10 != 1.0f && this.f32879j != 0.0f && this.f32883n != null) {
            this.f32879j = 0.0f;
            this.f32883n = null;
        }
        if (!z9) {
            this.f32876f = f10;
            this.d = f10;
        } else {
            if (this.f32876f > f10) {
                this.f32876f = f10;
            }
            this.d = this.f32876f;
        }
        this.f32874c = f10;
        this.f32875e = 0L;
        c();
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f32877g.set(i7, i10, i11, i12);
    }

    public final void g(boolean z9) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f32872a;
        this.f32872a = currentTimeMillis;
        if (z9) {
            if (this.f32876f != 1.0f) {
                this.f32873b = (((float) (360 * j3)) / this.v) + this.f32873b;
                float f10 = this.f32874c;
                float f11 = this.d;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.f32875e + j3;
                    this.f32875e = j10;
                    if (j10 >= 300) {
                        this.f32876f = f10;
                        this.d = f10;
                        this.f32875e = 0L;
                    } else {
                        this.f32876f = (A.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                c();
            }
            if (this.f32876f >= 1.0f && this.f32883n != null) {
                float f13 = this.f32879j - (((float) j3) / 200.0f);
                this.f32879j = f13;
                if (f13 <= 0.0f) {
                    this.f32879j = 0.0f;
                    this.f32883n = null;
                }
                c();
            }
        } else if (this.f32883n != null) {
            float f14 = this.f32879j - (((float) j3) / 200.0f);
            this.f32879j = f14;
            if (f14 <= 0.0f) {
                this.f32879j = 0.0f;
                this.f32883n = null;
            }
            c();
        }
    }
}
