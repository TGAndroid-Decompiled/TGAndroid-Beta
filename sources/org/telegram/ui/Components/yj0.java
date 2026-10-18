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
public final class yj0 {
    public static DecelerateInterpolator A;
    public final View f32664i;
    public boolean f32666k;
    public boolean f32667l;
    public Drawable f32668m;
    public Drawable f32669n;
    public final Paint f32671p;
    public boolean f32676u;
    public long f32659a = 0;
    public float f32660b = 0.0f;
    public float f32661c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f32662f = 0.0f;
    public final RectF f32663g = new RectF();
    public final RectF h = new RectF();
    public float f32665j = 1.0f;
    public int f32670o = -1;
    public int f32672q = AndroidUtilities.dp(4.0f);
    public final boolean f32673r = true;
    public final float f32674s = 1.0f;
    public Paint f32675t = null;
    public float v = 3000.0f;
    public final Path f32677w = new Path();
    public final Matrix f32678x = new Matrix();
    public final PathMeasure f32679y = new PathMeasure();
    public final Path f32680z = new Path();

    public yj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f32671p = paint;
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
        this.f32664i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f32669n;
        RectF rectF = this.f32663g;
        float f7 = this.f32674s;
        if (drawable != null) {
            if (this.f32673r) {
                drawable.setAlpha((int) (this.f32665j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f32669n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f32669n.draw(canvas);
        }
        Drawable drawable2 = this.f32668m;
        if (drawable2 != null) {
            if (this.f32669n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.g0.z(1.0f, this.f32665j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f32668m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f32668m.draw(canvas);
        }
        if (!this.f32666k && !this.f32667l) {
            g(false);
            return;
        }
        Paint paint2 = this.f32675t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f32670o;
            Paint paint3 = this.f32671p;
            paint3.setColor(i10);
            if (this.f32667l) {
                paint3.setAlpha((int) (this.f32665j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f32672q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f32660b - 90.0f, Math.max(4.0f, this.f32662f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f32676u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f32677w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f32678x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f32679y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f32680z;
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
        RectF rectF = this.f32663g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f32664i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f32659a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f32668m) != drawable) {
            this.f32669n = drawable2;
            this.f32667l = this.f32666k;
            this.f32665j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f32669n = null;
            this.f32667l = false;
        }
        this.f32666k = z10;
        this.f32668m = drawable;
        if (!z11) {
            this.f32664i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f32665j != 0.0f && this.f32669n != null) {
            this.f32665j = 0.0f;
            this.f32669n = null;
        }
        if (!z10) {
            this.f32662f = f7;
            this.d = f7;
        } else {
            if (this.f32662f > f7) {
                this.f32662f = f7;
            }
            this.d = this.f32662f;
        }
        this.f32661c = f7;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f32663g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f32659a;
        this.f32659a = currentTimeMillis;
        if (z10) {
            if (this.f32662f != 1.0f) {
                this.f32660b = (((float) (360 * j10)) / this.v) + this.f32660b;
                float f7 = this.f32661c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j11 = this.e + j10;
                    this.e = j11;
                    if (j11 >= 300) {
                        this.f32662f = f7;
                        this.d = f7;
                        this.e = 0L;
                    } else {
                        this.f32662f = (A.getInterpolation(((float) j11) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f32662f >= 1.0f && this.f32669n != null) {
                float f12 = this.f32665j - (((float) j10) / 200.0f);
                this.f32665j = f12;
                if (f12 <= 0.0f) {
                    this.f32665j = 0.0f;
                    this.f32669n = null;
                }
                c();
            }
        } else if (this.f32669n != null) {
            float f13 = this.f32665j - (((float) j10) / 200.0f);
            this.f32665j = f13;
            if (f13 <= 0.0f) {
                this.f32665j = 0.0f;
                this.f32669n = null;
            }
            c();
        }
    }
}
