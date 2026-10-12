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
public final class jk0 {
    public static DecelerateInterpolator A;
    public final View f27536i;
    public boolean f27538k;
    public boolean f27539l;
    public Drawable f27540m;
    public Drawable f27541n;
    public final Paint f27543p;
    public boolean f27548u;
    public long f27530a = 0;
    public float f27531b = 0.0f;
    public float f27532c = 0.0f;
    public float d = 0.0f;
    public long f27533e = 0;
    public float f27534f = 0.0f;
    public final RectF f27535g = new RectF();
    public final RectF h = new RectF();
    public float f27537j = 1.0f;
    public int f27542o = -1;
    public int f27544q = AndroidUtilities.dp(4.0f);
    public final boolean f27545r = true;
    public final float f27546s = 1.0f;
    public Paint f27547t = null;
    public float v = 3000.0f;
    public final Path f27549w = new Path();
    public final Matrix f27550x = new Matrix();
    public final PathMeasure f27551y = new PathMeasure();
    public final Path f27552z = new Path();

    public jk0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f27543p = paint;
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
        this.f27536i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f27541n;
        RectF rectF = this.f27535g;
        float f7 = this.f27546s;
        if (drawable != null) {
            if (this.f27545r) {
                drawable.setAlpha((int) (this.f27537j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f27541n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f27541n.draw(canvas);
        }
        Drawable drawable2 = this.f27540m;
        if (drawable2 != null) {
            if (this.f27541n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.v0.A(1.0f, this.f27537j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f27540m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f27540m.draw(canvas);
        }
        if (!this.f27538k && !this.f27539l) {
            g(false);
            return;
        }
        Paint paint2 = this.f27547t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f27542o;
            Paint paint3 = this.f27543p;
            paint3.setColor(i10);
            if (this.f27539l) {
                paint3.setAlpha((int) (this.f27537j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f27544q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f27531b - 90.0f, Math.max(4.0f, this.f27534f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f27548u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f27549w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f27550x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f27551y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f27552z;
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
        RectF rectF = this.f27535g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f27536i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f27530a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f27540m) != drawable) {
            this.f27541n = drawable2;
            this.f27539l = this.f27538k;
            this.f27537j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f27541n = null;
            this.f27539l = false;
        }
        this.f27538k = z10;
        this.f27540m = drawable;
        if (!z11) {
            this.f27536i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f27537j != 0.0f && this.f27541n != null) {
            this.f27537j = 0.0f;
            this.f27541n = null;
        }
        if (!z10) {
            this.f27534f = f7;
            this.d = f7;
        } else {
            if (this.f27534f > f7) {
                this.f27534f = f7;
            }
            this.d = this.f27534f;
        }
        this.f27532c = f7;
        this.f27533e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f27535g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f27530a;
        this.f27530a = currentTimeMillis;
        if (z10) {
            if (this.f27534f != 1.0f) {
                this.f27531b = (((float) (360 * j3)) / this.v) + this.f27531b;
                float f7 = this.f27532c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j10 = this.f27533e + j3;
                    this.f27533e = j10;
                    if (j10 >= 300) {
                        this.f27534f = f7;
                        this.d = f7;
                        this.f27533e = 0L;
                    } else {
                        this.f27534f = (A.getInterpolation(((float) j10) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f27534f >= 1.0f && this.f27541n != null) {
                float f12 = this.f27537j - (((float) j3) / 200.0f);
                this.f27537j = f12;
                if (f12 <= 0.0f) {
                    this.f27537j = 0.0f;
                    this.f27541n = null;
                }
                c();
            }
        } else if (this.f27541n != null) {
            float f13 = this.f27537j - (((float) j3) / 200.0f);
            this.f27537j = f13;
            if (f13 <= 0.0f) {
                this.f27537j = 0.0f;
                this.f27541n = null;
            }
            c();
        }
    }
}
