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
public final class mj0 {
    public static DecelerateInterpolator A;
    public final View f29129i;
    public boolean f29131k;
    public boolean f29132l;
    public Drawable f29133m;
    public Drawable f29134n;
    public final Paint f29136p;
    public boolean f29141u;
    public long f29123a = 0;
    public float f29124b = 0.0f;
    public float f29125c = 0.0f;
    public float d = 0.0f;
    public long f29126e = 0;
    public float f29127f = 0.0f;
    public final RectF f29128g = new RectF();
    public final RectF h = new RectF();
    public float f29130j = 1.0f;
    public int f29135o = -1;
    public int f29137q = AndroidUtilities.dp(4.0f);
    public final boolean f29138r = true;
    public final float f29139s = 1.0f;
    public Paint f29140t = null;
    public float v = 3000.0f;
    public final Path f29142w = new Path();
    public final Matrix f29143x = new Matrix();
    public final PathMeasure f29144y = new PathMeasure();
    public final Path f29145z = new Path();

    public mj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f29136p = paint;
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
        this.f29129i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f29134n;
        RectF rectF = this.f29128g;
        float f10 = this.f29139s;
        if (drawable != null) {
            if (this.f29138r) {
                drawable.setAlpha((int) (this.f29130j * 255.0f * f10));
            } else {
                drawable.setAlpha((int) (f10 * 255.0f));
            }
            this.f29134n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f29134n.draw(canvas);
        }
        Drawable drawable2 = this.f29133m;
        if (drawable2 != null) {
            if (this.f29134n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.y3.y(1.0f, this.f29130j, 255.0f, f10));
            } else {
                drawable2.setAlpha((int) (f10 * 255.0f));
            }
            this.f29133m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f29133m.draw(canvas);
        }
        if (!this.f29131k && !this.f29132l) {
            g(false);
            return;
        }
        Paint paint2 = this.f29140t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f29135o;
            Paint paint3 = this.f29136p;
            paint3.setColor(i10);
            if (this.f29132l) {
                paint3.setAlpha((int) (this.f29130j * 255.0f * f10));
            } else {
                paint3.setAlpha((int) (f10 * 255.0f));
            }
            paint = paint3;
        }
        float f11 = rectF.left;
        float f12 = this.f29137q;
        RectF rectF2 = this.h;
        rectF2.set(f11 + f12, rectF.top + f12, rectF.right - f12, rectF.bottom - f12);
        b(this.f29124b - 90.0f, Math.max(4.0f, this.f29127f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f29141u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            float f14 = ((f10 + f11) - f13) / 360.0f;
            Path path = this.f29142w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f29143x;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f29144y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f29145z;
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
        RectF rectF = this.f29128g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f29129i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z4, boolean z10) {
        Drawable drawable2;
        this.f29123a = System.currentTimeMillis();
        if (z10 && (drawable2 = this.f29133m) != drawable) {
            this.f29134n = drawable2;
            this.f29132l = this.f29131k;
            this.f29130j = 1.0f;
            e(1.0f, z10);
        } else {
            this.f29134n = null;
            this.f29132l = false;
        }
        this.f29131k = z4;
        this.f29133m = drawable;
        if (!z10) {
            this.f29129i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f10, boolean z4) {
        if (f10 != 1.0f && this.f29130j != 0.0f && this.f29134n != null) {
            this.f29130j = 0.0f;
            this.f29134n = null;
        }
        if (!z4) {
            this.f29127f = f10;
            this.d = f10;
        } else {
            if (this.f29127f > f10) {
                this.f29127f = f10;
            }
            this.d = this.f29127f;
        }
        this.f29125c = f10;
        this.f29126e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f29128g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f29123a;
        this.f29123a = currentTimeMillis;
        if (z4) {
            if (this.f29127f != 1.0f) {
                this.f29124b = (((float) (360 * j10)) / this.v) + this.f29124b;
                float f10 = this.f29125c;
                float f11 = this.d;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.f29126e + j10;
                    this.f29126e = j11;
                    if (j11 >= 300) {
                        this.f29127f = f10;
                        this.d = f10;
                        this.f29126e = 0L;
                    } else {
                        this.f29127f = (A.getInterpolation(((float) j11) / 300.0f) * f12) + f11;
                    }
                }
                c();
            }
            if (this.f29127f >= 1.0f && this.f29134n != null) {
                float f13 = this.f29130j - (((float) j10) / 200.0f);
                this.f29130j = f13;
                if (f13 <= 0.0f) {
                    this.f29130j = 0.0f;
                    this.f29134n = null;
                }
                c();
            }
        } else if (this.f29134n != null) {
            float f14 = this.f29130j - (((float) j10) / 200.0f);
            this.f29130j = f14;
            if (f14 <= 0.0f) {
                this.f29130j = 0.0f;
                this.f29134n = null;
            }
            c();
        }
    }
}
