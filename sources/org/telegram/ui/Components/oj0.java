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
public final class oj0 {
    public static DecelerateInterpolator A;
    public final View f27088i;
    public boolean f27090k;
    public boolean f27091l;
    public Drawable f27092m;
    public Drawable f27093n;
    public final Paint f27095p;
    public boolean f27100u;
    public long f27083a = 0;
    public float f27084b = 0.0f;
    public float f27085c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f27086f = 0.0f;
    public final RectF f27087g = new RectF();
    public final RectF h = new RectF();
    public float f27089j = 1.0f;
    public int f27094o = -1;
    public int f27096q = AndroidUtilities.dp(4.0f);
    public final boolean f27097r = true;
    public final float f27098s = 1.0f;
    public Paint f27099t = null;
    public float v = 3000.0f;
    public final Path f27101w = new Path();
    public final Matrix f27102x = new Matrix();
    public final PathMeasure f27103y = new PathMeasure();
    public final Path f27104z = new Path();

    public oj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f27095p = paint;
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
        this.f27088i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f27093n;
        RectF rectF = this.f27087g;
        float f7 = this.f27098s;
        if (drawable != null) {
            if (this.f27097r) {
                drawable.setAlpha((int) (this.f27089j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f27093n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f27093n.draw(canvas);
        }
        Drawable drawable2 = this.f27092m;
        if (drawable2 != null) {
            if (this.f27093n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.f0.z(1.0f, this.f27089j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f27092m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f27092m.draw(canvas);
        }
        if (!this.f27090k && !this.f27091l) {
            g(false);
            return;
        }
        Paint paint2 = this.f27099t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f27094o;
            Paint paint3 = this.f27095p;
            paint3.setColor(i10);
            if (this.f27091l) {
                paint3.setAlpha((int) (this.f27089j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f27096q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f27084b - 90.0f, Math.max(4.0f, this.f27086f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f27100u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f27101w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f27102x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f27103y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f27104z;
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
        RectF rectF = this.f27087g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f27088i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f27083a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f27092m) != drawable) {
            this.f27093n = drawable2;
            this.f27091l = this.f27090k;
            this.f27089j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f27093n = null;
            this.f27091l = false;
        }
        this.f27090k = z10;
        this.f27092m = drawable;
        if (!z11) {
            this.f27088i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f27089j != 0.0f && this.f27093n != null) {
            this.f27089j = 0.0f;
            this.f27093n = null;
        }
        if (!z10) {
            this.f27086f = f7;
            this.d = f7;
        } else {
            if (this.f27086f > f7) {
                this.f27086f = f7;
            }
            this.d = this.f27086f;
        }
        this.f27085c = f7;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f27087g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f27083a;
        this.f27083a = currentTimeMillis;
        if (z10) {
            if (this.f27086f != 1.0f) {
                this.f27084b = (((float) (360 * j3)) / this.v) + this.f27084b;
                float f7 = this.f27085c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j10 = this.e + j3;
                    this.e = j10;
                    if (j10 >= 300) {
                        this.f27086f = f7;
                        this.d = f7;
                        this.e = 0L;
                    } else {
                        this.f27086f = (A.getInterpolation(((float) j10) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f27086f >= 1.0f && this.f27093n != null) {
                float f12 = this.f27089j - (((float) j3) / 200.0f);
                this.f27089j = f12;
                if (f12 <= 0.0f) {
                    this.f27089j = 0.0f;
                    this.f27093n = null;
                }
                c();
            }
        } else if (this.f27093n != null) {
            float f13 = this.f27089j - (((float) j3) / 200.0f);
            this.f27089j = f13;
            if (f13 <= 0.0f) {
                this.f27089j = 0.0f;
                this.f27093n = null;
            }
            c();
        }
    }
}
