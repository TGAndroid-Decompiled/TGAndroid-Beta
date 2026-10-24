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
public final class bk0 {
    public static DecelerateInterpolator A;
    public final View f25028i;
    public boolean f25030k;
    public boolean f25031l;
    public Drawable f25032m;
    public Drawable f25033n;
    public final Paint f25035p;
    public boolean f25040u;
    public long f25023a = 0;
    public float f25024b = 0.0f;
    public float f25025c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f25026f = 0.0f;
    public final RectF f25027g = new RectF();
    public final RectF h = new RectF();
    public float f25029j = 1.0f;
    public int f25034o = -1;
    public int f25036q = AndroidUtilities.dp(4.0f);
    public final boolean f25037r = true;
    public final float f25038s = 1.0f;
    public Paint f25039t = null;
    public float v = 3000.0f;
    public final Path f25041w = new Path();
    public final Matrix f25042x = new Matrix();
    public final PathMeasure f25043y = new PathMeasure();
    public final Path f25044z = new Path();

    public bk0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f25035p = paint;
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
        this.f25028i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f25033n;
        RectF rectF = this.f25027g;
        float f7 = this.f25038s;
        if (drawable != null) {
            if (this.f25037r) {
                drawable.setAlpha((int) (this.f25029j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f25033n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f25033n.draw(canvas);
        }
        Drawable drawable2 = this.f25032m;
        if (drawable2 != null) {
            if (this.f25033n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.v0.A(1.0f, this.f25029j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f25032m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f25032m.draw(canvas);
        }
        if (!this.f25030k && !this.f25031l) {
            g(false);
            return;
        }
        Paint paint2 = this.f25039t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f25034o;
            Paint paint3 = this.f25035p;
            paint3.setColor(i10);
            if (this.f25031l) {
                paint3.setAlpha((int) (this.f25029j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f25036q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f25024b - 90.0f, Math.max(4.0f, this.f25026f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f25040u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f25041w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f25042x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f25043y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f25044z;
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
        RectF rectF = this.f25027g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f25028i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f25023a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f25032m) != drawable) {
            this.f25033n = drawable2;
            this.f25031l = this.f25030k;
            this.f25029j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f25033n = null;
            this.f25031l = false;
        }
        this.f25030k = z10;
        this.f25032m = drawable;
        if (!z11) {
            this.f25028i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f25029j != 0.0f && this.f25033n != null) {
            this.f25029j = 0.0f;
            this.f25033n = null;
        }
        if (!z10) {
            this.f25026f = f7;
            this.d = f7;
        } else {
            if (this.f25026f > f7) {
                this.f25026f = f7;
            }
            this.d = this.f25026f;
        }
        this.f25025c = f7;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f25027g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f25023a;
        this.f25023a = currentTimeMillis;
        if (z10) {
            if (this.f25026f != 1.0f) {
                this.f25024b = (((float) (360 * j10)) / this.v) + this.f25024b;
                float f7 = this.f25025c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j11 = this.e + j10;
                    this.e = j11;
                    if (j11 >= 300) {
                        this.f25026f = f7;
                        this.d = f7;
                        this.e = 0L;
                    } else {
                        this.f25026f = (A.getInterpolation(((float) j11) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f25026f >= 1.0f && this.f25033n != null) {
                float f12 = this.f25029j - (((float) j10) / 200.0f);
                this.f25029j = f12;
                if (f12 <= 0.0f) {
                    this.f25029j = 0.0f;
                    this.f25033n = null;
                }
                c();
            }
        } else if (this.f25033n != null) {
            float f13 = this.f25029j - (((float) j10) / 200.0f);
            this.f25029j = f13;
            if (f13 <= 0.0f) {
                this.f25029j = 0.0f;
                this.f25033n = null;
            }
            c();
        }
    }
}
