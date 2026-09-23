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
public final class cj0 {
    public static DecelerateInterpolator A;
    public final View f23050i;
    public boolean f23052k;
    public boolean f23053l;
    public Drawable f23054m;
    public Drawable f23055n;
    public final Paint f23057p;
    public boolean f23062u;
    public long f23045a = 0;
    public float f23046b = 0.0f;
    public float f23047c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f23048f = 0.0f;
    public final RectF f23049g = new RectF();
    public final RectF h = new RectF();
    public float f23051j = 1.0f;
    public int f23056o = -1;
    public int f23058q = AndroidUtilities.dp(4.0f);
    public final boolean f23059r = true;
    public final float f23060s = 1.0f;
    public Paint f23061t = null;
    public float v = 3000.0f;
    public final Path f23063w = new Path();
    public final Matrix f23064x = new Matrix();
    public final PathMeasure f23065y = new PathMeasure();
    public final Path f23066z = new Path();

    public cj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f23057p = paint;
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
        this.f23050i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f23055n;
        RectF rectF = this.f23049g;
        float f7 = this.f23060s;
        if (drawable != null) {
            if (this.f23059r) {
                drawable.setAlpha((int) (this.f23051j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f23055n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f23055n.draw(canvas);
        }
        Drawable drawable2 = this.f23054m;
        if (drawable2 != null) {
            if (this.f23055n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.z0.A(1.0f, this.f23051j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f23054m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f23054m.draw(canvas);
        }
        if (!this.f23052k && !this.f23053l) {
            g(false);
            return;
        }
        Paint paint2 = this.f23061t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f23056o;
            Paint paint3 = this.f23057p;
            paint3.setColor(i10);
            if (this.f23053l) {
                paint3.setAlpha((int) (this.f23051j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f23058q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f23046b - 90.0f, Math.max(4.0f, this.f23048f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f23062u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f23063w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f23064x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f23065y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f23066z;
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
        RectF rectF = this.f23049g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f23050i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f23045a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f23054m) != drawable) {
            this.f23055n = drawable2;
            this.f23053l = this.f23052k;
            this.f23051j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f23055n = null;
            this.f23053l = false;
        }
        this.f23052k = z10;
        this.f23054m = drawable;
        if (!z11) {
            this.f23050i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f23051j != 0.0f && this.f23055n != null) {
            this.f23051j = 0.0f;
            this.f23055n = null;
        }
        if (!z10) {
            this.f23048f = f7;
            this.d = f7;
        } else {
            if (this.f23048f > f7) {
                this.f23048f = f7;
            }
            this.d = this.f23048f;
        }
        this.f23047c = f7;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f23049g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f23045a;
        this.f23045a = currentTimeMillis;
        if (z10) {
            if (this.f23048f != 1.0f) {
                this.f23046b = (((float) (360 * j3)) / this.v) + this.f23046b;
                float f7 = this.f23047c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j10 = this.e + j3;
                    this.e = j10;
                    if (j10 >= 300) {
                        this.f23048f = f7;
                        this.d = f7;
                        this.e = 0L;
                    } else {
                        this.f23048f = (A.getInterpolation(((float) j10) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f23048f >= 1.0f && this.f23055n != null) {
                float f12 = this.f23051j - (((float) j3) / 200.0f);
                this.f23051j = f12;
                if (f12 <= 0.0f) {
                    this.f23051j = 0.0f;
                    this.f23055n = null;
                }
                c();
            }
        } else if (this.f23055n != null) {
            float f13 = this.f23051j - (((float) j3) / 200.0f);
            this.f23051j = f13;
            if (f13 <= 0.0f) {
                this.f23051j = 0.0f;
                this.f23055n = null;
            }
            c();
        }
    }
}
