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
public final class hk0 {
    public static DecelerateInterpolator A;
    public final View f27147i;
    public boolean f27149k;
    public boolean f27150l;
    public Drawable f27151m;
    public Drawable f27152n;
    public final Paint f27154p;
    public boolean f27159u;
    public long f27141a = 0;
    public float f27142b = 0.0f;
    public float f27143c = 0.0f;
    public float d = 0.0f;
    public long f27144e = 0;
    public float f27145f = 0.0f;
    public final RectF f27146g = new RectF();
    public final RectF h = new RectF();
    public float f27148j = 1.0f;
    public int f27153o = -1;
    public int f27155q = AndroidUtilities.dp(4.0f);
    public final boolean f27156r = true;
    public final float f27157s = 1.0f;
    public Paint f27158t = null;
    public float v = 3000.0f;
    public final Path f27160w = new Path();
    public final Matrix f27161x = new Matrix();
    public final PathMeasure f27162y = new PathMeasure();
    public final Path f27163z = new Path();

    public hk0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f27154p = paint;
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
        this.f27147i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f27152n;
        RectF rectF = this.f27146g;
        float f7 = this.f27157s;
        if (drawable != null) {
            if (this.f27156r) {
                drawable.setAlpha((int) (this.f27148j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f27152n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f27152n.draw(canvas);
        }
        Drawable drawable2 = this.f27151m;
        if (drawable2 != null) {
            if (this.f27152n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.q.z(1.0f, this.f27148j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f27151m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f27151m.draw(canvas);
        }
        if (!this.f27149k && !this.f27150l) {
            g(false);
            return;
        }
        Paint paint2 = this.f27158t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f27153o;
            Paint paint3 = this.f27154p;
            paint3.setColor(i10);
            if (this.f27150l) {
                paint3.setAlpha((int) (this.f27148j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f27155q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f27142b - 90.0f, Math.max(4.0f, this.f27145f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f27159u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f27160w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f27161x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f27162y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f27163z;
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
        RectF rectF = this.f27146g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f27147i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f27141a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f27151m) != drawable) {
            this.f27152n = drawable2;
            this.f27150l = this.f27149k;
            this.f27148j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f27152n = null;
            this.f27150l = false;
        }
        this.f27149k = z10;
        this.f27151m = drawable;
        if (!z11) {
            this.f27147i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f27148j != 0.0f && this.f27152n != null) {
            this.f27148j = 0.0f;
            this.f27152n = null;
        }
        if (!z10) {
            this.f27145f = f7;
            this.d = f7;
        } else {
            if (this.f27145f > f7) {
                this.f27145f = f7;
            }
            this.d = this.f27145f;
        }
        this.f27143c = f7;
        this.f27144e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f27146g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f27141a;
        this.f27141a = currentTimeMillis;
        if (z10) {
            if (this.f27145f != 1.0f) {
                this.f27142b = (((float) (360 * j3)) / this.v) + this.f27142b;
                float f7 = this.f27143c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j10 = this.f27144e + j3;
                    this.f27144e = j10;
                    if (j10 >= 300) {
                        this.f27145f = f7;
                        this.d = f7;
                        this.f27144e = 0L;
                    } else {
                        this.f27145f = (A.getInterpolation(((float) j10) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f27145f >= 1.0f && this.f27152n != null) {
                float f12 = this.f27148j - (((float) j3) / 200.0f);
                this.f27148j = f12;
                if (f12 <= 0.0f) {
                    this.f27148j = 0.0f;
                    this.f27152n = null;
                }
                c();
            }
        } else if (this.f27152n != null) {
            float f13 = this.f27148j - (((float) j3) / 200.0f);
            this.f27148j = f13;
            if (f13 <= 0.0f) {
                this.f27148j = 0.0f;
                this.f27152n = null;
            }
            c();
        }
    }
}
