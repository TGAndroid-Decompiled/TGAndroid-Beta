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
public final class zj0 {
    public static DecelerateInterpolator A;
    public final View f32929i;
    public boolean f32931k;
    public boolean f32932l;
    public Drawable f32933m;
    public Drawable f32934n;
    public final Paint f32936p;
    public boolean f32941u;
    public long f32924a = 0;
    public float f32925b = 0.0f;
    public float f32926c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f32927f = 0.0f;
    public final RectF f32928g = new RectF();
    public final RectF h = new RectF();
    public float f32930j = 1.0f;
    public int f32935o = -1;
    public int f32937q = AndroidUtilities.dp(4.0f);
    public final boolean f32938r = true;
    public final float f32939s = 1.0f;
    public Paint f32940t = null;
    public float v = 3000.0f;
    public final Path f32942w = new Path();
    public final Matrix f32943x = new Matrix();
    public final PathMeasure f32944y = new PathMeasure();
    public final Path f32945z = new Path();

    public zj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f32936p = paint;
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
        this.f32929i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f32934n;
        RectF rectF = this.f32928g;
        float f7 = this.f32939s;
        if (drawable != null) {
            if (this.f32938r) {
                drawable.setAlpha((int) (this.f32930j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f32934n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f32934n.draw(canvas);
        }
        Drawable drawable2 = this.f32933m;
        if (drawable2 != null) {
            if (this.f32934n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.g0.z(1.0f, this.f32930j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f32933m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f32933m.draw(canvas);
        }
        if (!this.f32931k && !this.f32932l) {
            g(false);
            return;
        }
        Paint paint2 = this.f32940t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f32935o;
            Paint paint3 = this.f32936p;
            paint3.setColor(i10);
            if (this.f32932l) {
                paint3.setAlpha((int) (this.f32930j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f32937q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f32925b - 90.0f, Math.max(4.0f, this.f32927f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f32941u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f32942w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f32943x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f32944y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f32945z;
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
        RectF rectF = this.f32928g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f32929i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f32924a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f32933m) != drawable) {
            this.f32934n = drawable2;
            this.f32932l = this.f32931k;
            this.f32930j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f32934n = null;
            this.f32932l = false;
        }
        this.f32931k = z10;
        this.f32933m = drawable;
        if (!z11) {
            this.f32929i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f32930j != 0.0f && this.f32934n != null) {
            this.f32930j = 0.0f;
            this.f32934n = null;
        }
        if (!z10) {
            this.f32927f = f7;
            this.d = f7;
        } else {
            if (this.f32927f > f7) {
                this.f32927f = f7;
            }
            this.d = this.f32927f;
        }
        this.f32926c = f7;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f32928g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f32924a;
        this.f32924a = currentTimeMillis;
        if (z10) {
            if (this.f32927f != 1.0f) {
                this.f32925b = (((float) (360 * j10)) / this.v) + this.f32925b;
                float f7 = this.f32926c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j11 = this.e + j10;
                    this.e = j11;
                    if (j11 >= 300) {
                        this.f32927f = f7;
                        this.d = f7;
                        this.e = 0L;
                    } else {
                        this.f32927f = (A.getInterpolation(((float) j11) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f32927f >= 1.0f && this.f32934n != null) {
                float f12 = this.f32930j - (((float) j10) / 200.0f);
                this.f32930j = f12;
                if (f12 <= 0.0f) {
                    this.f32930j = 0.0f;
                    this.f32934n = null;
                }
                c();
            }
        } else if (this.f32934n != null) {
            float f13 = this.f32930j - (((float) j10) / 200.0f);
            this.f32930j = f13;
            if (f13 <= 0.0f) {
                this.f32930j = 0.0f;
                this.f32934n = null;
            }
            c();
        }
    }
}
