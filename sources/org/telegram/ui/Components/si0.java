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

public final class si0 {
    public static DecelerateInterpolator A;

    public final View f32459i;

    public boolean f32461k;

    public boolean f32462l;

    public Drawable f32463m;

    public Drawable f32464n;

    public final Paint f32466p;

    public boolean f32471u;

    public long f32453a = 0;

    public float f32454b = 0.0f;

    public float f32455c = 0.0f;
    public float d = 0.0f;

    public long f32456e = 0;

    public float f32457f = 0.0f;

    public final RectF f32458g = new RectF();
    public final RectF h = new RectF();

    public float f32460j = 1.0f;

    public int f32465o = -1;

    public int f32467q = AndroidUtilities.dp(4.0f);

    public final boolean f32468r = true;

    public final float f32469s = 1.0f;

    public Paint f32470t = null;
    public float v = 3000.0f;

    public final Path f32472w = new Path();

    public final Matrix f32473x = new Matrix();

    public final PathMeasure f32474y = new PathMeasure();

    public final Path f32475z = new Path();

    public si0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f32466p = paint;
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
        this.f32459i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f32464n;
        RectF rectF = this.f32458g;
        float f10 = this.f32469s;
        if (drawable != null) {
            if (this.f32468r) {
                drawable.setAlpha((int) (this.f32460j * 255.0f * f10));
            } else {
                drawable.setAlpha((int) (f10 * 255.0f));
            }
            this.f32464n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f32464n.draw(canvas);
        }
        Drawable drawable2 = this.f32463m;
        if (drawable2 != null) {
            if (this.f32464n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.y1.z(1.0f, this.f32460j, 255.0f, f10));
            } else {
                drawable2.setAlpha((int) (f10 * 255.0f));
            }
            this.f32463m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f32463m.draw(canvas);
        }
        if (!this.f32461k && !this.f32462l) {
            g(false);
            return;
        }
        Paint paint2 = this.f32470t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f32465o;
            Paint paint3 = this.f32466p;
            paint3.setColor(i10);
            if (this.f32462l) {
                paint3.setAlpha((int) (this.f32460j * 255.0f * f10));
            } else {
                paint3.setAlpha((int) (f10 * 255.0f));
            }
            paint = paint3;
        }
        float f11 = rectF.left;
        float f12 = this.f32467q;
        float f13 = rectF.top + f12;
        float f14 = rectF.right - f12;
        float f15 = rectF.bottom - f12;
        RectF rectF2 = this.h;
        rectF2.set(f11 + f12, f13, f14, f15);
        b(this.f32454b - 90.0f, Math.max(4.0f, this.f32457f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (!this.f32471u) {
            canvas.drawArc(rectF, f10, f11, false, paint);
            return;
        }
        float fHeight = rectF.height() * 0.32f;
        if (Math.abs(f11) == 360.0f) {
            canvas.drawRoundRect(rectF, fHeight, fHeight, paint);
            return;
        }
        float f12 = ((((int) f10) / 90) * 90) + 90;
        float f13 = (-199.0f) + f12;
        float f14 = ((f10 + f11) - f13) / 360.0f;
        Path path = this.f32472w;
        path.rewind();
        path.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
        Matrix matrix = this.f32473x;
        matrix.reset();
        matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
        path.transform(matrix);
        PathMeasure pathMeasure = this.f32474y;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        Path path2 = this.f32475z;
        path2.reset();
        pathMeasure.getSegment(((f10 - f13) / 360.0f) * length, length * f14, path2, true);
        path2.rLineTo(0.0f, 0.0f);
        canvas.drawPath(path2, paint);
        if (f14 > 1.0f) {
            b(f10 + 90.0f, f11 - 90.0f, canvas, paint, rectF);
        }
    }

    public final void c() {
        int iDp = AndroidUtilities.dp(2.0f);
        RectF rectF = this.f32458g;
        int i10 = ((int) rectF.left) - iDp;
        int i11 = ((int) rectF.top) - iDp;
        int i12 = iDp * 2;
        this.f32459i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f32453a = System.currentTimeMillis();
        if (!z11 || (drawable2 = this.f32463m) == drawable) {
            this.f32464n = null;
            this.f32462l = false;
        } else {
            this.f32464n = drawable2;
            this.f32462l = this.f32461k;
            this.f32460j = 1.0f;
            e(1.0f, z11);
        }
        this.f32461k = z10;
        this.f32463m = drawable;
        if (z11) {
            c();
        } else {
            this.f32459i.invalidate();
        }
    }

    public final void e(float f10, boolean z10) {
        if (f10 != 1.0f && this.f32460j != 0.0f && this.f32464n != null) {
            this.f32460j = 0.0f;
            this.f32464n = null;
        }
        if (z10) {
            if (this.f32457f > f10) {
                this.f32457f = f10;
            }
            this.d = this.f32457f;
        } else {
            this.f32457f = f10;
            this.d = f10;
        }
        this.f32455c = f10;
        this.f32456e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f32458g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f32453a;
        this.f32453a = jCurrentTimeMillis;
        if (!z10) {
            if (this.f32464n != null) {
                float f10 = this.f32460j - (j10 / 200.0f);
                this.f32460j = f10;
                if (f10 <= 0.0f) {
                    this.f32460j = 0.0f;
                    this.f32464n = null;
                }
                c();
                return;
            }
            return;
        }
        if (this.f32457f != 1.0f) {
            this.f32454b = ((360 * j10) / this.v) + this.f32454b;
            float f11 = this.f32455c;
            float f12 = this.d;
            float f13 = f11 - f12;
            if (f13 > 0.0f) {
                long j11 = this.f32456e + j10;
                this.f32456e = j11;
                if (j11 >= 300) {
                    this.f32457f = f11;
                    this.d = f11;
                    this.f32456e = 0L;
                } else {
                    this.f32457f = (A.getInterpolation(j11 / 300.0f) * f13) + f12;
                }
            }
            c();
        }
        if (this.f32457f < 1.0f || this.f32464n == null) {
            return;
        }
        float f14 = this.f32460j - (j10 / 200.0f);
        this.f32460j = f14;
        if (f14 <= 0.0f) {
            this.f32460j = 0.0f;
            this.f32464n = null;
        }
        c();
    }
}
