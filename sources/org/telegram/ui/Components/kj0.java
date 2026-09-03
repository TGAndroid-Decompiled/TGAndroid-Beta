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
public final class kj0 {
    public static DecelerateInterpolator A;
    public final View f26306i;
    public boolean f26308k;
    public boolean f26309l;
    public Drawable f26310m;
    public Drawable f26311n;
    public final Paint f26313p;
    public boolean f26318u;
    public long f26301a = 0;
    public float f26302b = 0.0f;
    public float f26303c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f26304f = 0.0f;
    public final RectF f26305g = new RectF();
    public final RectF h = new RectF();
    public float f26307j = 1.0f;
    public int f26312o = -1;
    public int f26314q = AndroidUtilities.dp(4.0f);
    public final boolean f26315r = true;
    public final float f26316s = 1.0f;
    public Paint f26317t = null;
    public float v = 3000.0f;
    public final Path f26319w = new Path();
    public final Matrix f26320x = new Matrix();
    public final PathMeasure f26321y = new PathMeasure();
    public final Path f26322z = new Path();

    public kj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f26313p = paint;
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
        this.f26306i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f26311n;
        RectF rectF = this.f26305g;
        float f10 = this.f26316s;
        if (drawable != null) {
            if (this.f26315r) {
                drawable.setAlpha((int) (this.f26307j * 255.0f * f10));
            } else {
                drawable.setAlpha((int) (f10 * 255.0f));
            }
            this.f26311n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f26311n.draw(canvas);
        }
        Drawable drawable2 = this.f26310m;
        if (drawable2 != null) {
            if (this.f26311n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.y3.y(1.0f, this.f26307j, 255.0f, f10));
            } else {
                drawable2.setAlpha((int) (f10 * 255.0f));
            }
            this.f26310m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f26310m.draw(canvas);
        }
        if (!this.f26308k && !this.f26309l) {
            g(false);
            return;
        }
        Paint paint2 = this.f26317t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f26312o;
            Paint paint3 = this.f26313p;
            paint3.setColor(i10);
            if (this.f26309l) {
                paint3.setAlpha((int) (this.f26307j * 255.0f * f10));
            } else {
                paint3.setAlpha((int) (f10 * 255.0f));
            }
            paint = paint3;
        }
        float f11 = rectF.left;
        float f12 = this.f26314q;
        RectF rectF2 = this.h;
        rectF2.set(f11 + f12, rectF.top + f12, rectF.right - f12, rectF.bottom - f12);
        b(this.f26302b - 90.0f, Math.max(4.0f, this.f26304f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f26318u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            float f14 = ((f10 + f11) - f13) / 360.0f;
            Path path = this.f26319w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f26320x;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f26321y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f26322z;
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
        int dp = AndroidUtilities.dp(2.0f);
        RectF rectF = this.f26305g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f26306i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z4, boolean z10) {
        Drawable drawable2;
        this.f26301a = System.currentTimeMillis();
        if (z10 && (drawable2 = this.f26310m) != drawable) {
            this.f26311n = drawable2;
            this.f26309l = this.f26308k;
            this.f26307j = 1.0f;
            e(1.0f, z10);
        } else {
            this.f26311n = null;
            this.f26309l = false;
        }
        this.f26308k = z4;
        this.f26310m = drawable;
        if (!z10) {
            this.f26306i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f10, boolean z4) {
        if (f10 != 1.0f && this.f26307j != 0.0f && this.f26311n != null) {
            this.f26307j = 0.0f;
            this.f26311n = null;
        }
        if (!z4) {
            this.f26304f = f10;
            this.d = f10;
        } else {
            if (this.f26304f > f10) {
                this.f26304f = f10;
            }
            this.d = this.f26304f;
        }
        this.f26303c = f10;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f26305g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f26301a;
        this.f26301a = currentTimeMillis;
        if (z4) {
            if (this.f26304f != 1.0f) {
                this.f26302b = (((float) (360 * j10)) / this.v) + this.f26302b;
                float f10 = this.f26303c;
                float f11 = this.d;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.e + j10;
                    this.e = j11;
                    if (j11 >= 300) {
                        this.f26304f = f10;
                        this.d = f10;
                        this.e = 0L;
                    } else {
                        this.f26304f = (A.getInterpolation(((float) j11) / 300.0f) * f12) + f11;
                    }
                }
                c();
            }
            if (this.f26304f >= 1.0f && this.f26311n != null) {
                float f13 = this.f26307j - (((float) j10) / 200.0f);
                this.f26307j = f13;
                if (f13 <= 0.0f) {
                    this.f26307j = 0.0f;
                    this.f26311n = null;
                }
                c();
            }
        } else if (this.f26311n != null) {
            float f14 = this.f26307j - (((float) j10) / 200.0f);
            this.f26307j = f14;
            if (f14 <= 0.0f) {
                this.f26307j = 0.0f;
                this.f26311n = null;
            }
            c();
        }
    }
}
