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
public final class bj0 {
    public static DecelerateInterpolator A;
    public final View f24724i;
    public boolean f24726k;
    public boolean f24727l;
    public Drawable f24728m;
    public Drawable f24729n;
    public final Paint f24731p;
    public boolean f24736u;
    public long f24718a = 0;
    public float f24719b = 0.0f;
    public float f24720c = 0.0f;
    public float d = 0.0f;
    public long f24721e = 0;
    public float f24722f = 0.0f;
    public final RectF f24723g = new RectF();
    public final RectF h = new RectF();
    public float f24725j = 1.0f;
    public int f24730o = -1;
    public int f24732q = AndroidUtilities.dp(4.0f);
    public final boolean f24733r = true;
    public final float f24734s = 1.0f;
    public Paint f24735t = null;
    public float v = 3000.0f;
    public final Path f24737w = new Path();
    public final Matrix f24738x = new Matrix();
    public final PathMeasure f24739y = new PathMeasure();
    public final Path f24740z = new Path();

    public bj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f24731p = paint;
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
        this.f24724i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f24729n;
        RectF rectF = this.f24723g;
        float f7 = this.f24734s;
        if (drawable != null) {
            if (this.f24733r) {
                drawable.setAlpha((int) (this.f24725j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f24729n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f24729n.draw(canvas);
        }
        Drawable drawable2 = this.f24728m;
        if (drawable2 != null) {
            if (this.f24729n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.w1.A(1.0f, this.f24725j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f24728m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f24728m.draw(canvas);
        }
        if (!this.f24726k && !this.f24727l) {
            g(false);
            return;
        }
        Paint paint2 = this.f24735t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f24730o;
            Paint paint3 = this.f24731p;
            paint3.setColor(i10);
            if (this.f24727l) {
                paint3.setAlpha((int) (this.f24725j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f24732q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f24719b - 90.0f, Math.max(4.0f, this.f24722f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f24736u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f24737w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f24738x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f24739y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f24740z;
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
        RectF rectF = this.f24723g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f24724i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f24718a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f24728m) != drawable) {
            this.f24729n = drawable2;
            this.f24727l = this.f24726k;
            this.f24725j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f24729n = null;
            this.f24727l = false;
        }
        this.f24726k = z10;
        this.f24728m = drawable;
        if (!z11) {
            this.f24724i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f24725j != 0.0f && this.f24729n != null) {
            this.f24725j = 0.0f;
            this.f24729n = null;
        }
        if (!z10) {
            this.f24722f = f7;
            this.d = f7;
        } else {
            if (this.f24722f > f7) {
                this.f24722f = f7;
            }
            this.d = this.f24722f;
        }
        this.f24720c = f7;
        this.f24721e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f24723g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f24718a;
        this.f24718a = currentTimeMillis;
        if (z10) {
            if (this.f24722f != 1.0f) {
                this.f24719b = (((float) (360 * j3)) / this.v) + this.f24719b;
                float f7 = this.f24720c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j10 = this.f24721e + j3;
                    this.f24721e = j10;
                    if (j10 >= 300) {
                        this.f24722f = f7;
                        this.d = f7;
                        this.f24721e = 0L;
                    } else {
                        this.f24722f = (A.getInterpolation(((float) j10) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f24722f >= 1.0f && this.f24729n != null) {
                float f12 = this.f24725j - (((float) j3) / 200.0f);
                this.f24725j = f12;
                if (f12 <= 0.0f) {
                    this.f24725j = 0.0f;
                    this.f24729n = null;
                }
                c();
            }
        } else if (this.f24729n != null) {
            float f13 = this.f24725j - (((float) j3) / 200.0f);
            this.f24725j = f13;
            if (f13 <= 0.0f) {
                this.f24725j = 0.0f;
                this.f24729n = null;
            }
            c();
        }
    }
}
