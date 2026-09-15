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
    public final View f22803i;
    public boolean f22805k;
    public boolean f22806l;
    public Drawable f22807m;
    public Drawable f22808n;
    public final Paint f22810p;
    public boolean f22815u;
    public long f22798a = 0;
    public float f22799b = 0.0f;
    public float f22800c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f22801f = 0.0f;
    public final RectF f22802g = new RectF();
    public final RectF h = new RectF();
    public float f22804j = 1.0f;
    public int f22809o = -1;
    public int f22811q = AndroidUtilities.dp(4.0f);
    public final boolean f22812r = true;
    public final float f22813s = 1.0f;
    public Paint f22814t = null;
    public float v = 3000.0f;
    public final Path f22816w = new Path();
    public final Matrix f22817x = new Matrix();
    public final PathMeasure f22818y = new PathMeasure();
    public final Path f22819z = new Path();

    public bj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f22810p = paint;
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
        this.f22803i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f22808n;
        RectF rectF = this.f22802g;
        float f7 = this.f22813s;
        if (drawable != null) {
            if (this.f22812r) {
                drawable.setAlpha((int) (this.f22804j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f22808n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f22808n.draw(canvas);
        }
        Drawable drawable2 = this.f22807m;
        if (drawable2 != null) {
            if (this.f22808n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.w1.A(1.0f, this.f22804j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f22807m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f22807m.draw(canvas);
        }
        if (!this.f22805k && !this.f22806l) {
            g(false);
            return;
        }
        Paint paint2 = this.f22814t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f22809o;
            Paint paint3 = this.f22810p;
            paint3.setColor(i10);
            if (this.f22806l) {
                paint3.setAlpha((int) (this.f22804j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f22811q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f22799b - 90.0f, Math.max(4.0f, this.f22801f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f22815u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f22816w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f22817x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f22818y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f22819z;
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
        RectF rectF = this.f22802g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f22803i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f22798a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f22807m) != drawable) {
            this.f22808n = drawable2;
            this.f22806l = this.f22805k;
            this.f22804j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f22808n = null;
            this.f22806l = false;
        }
        this.f22805k = z10;
        this.f22807m = drawable;
        if (!z11) {
            this.f22803i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f22804j != 0.0f && this.f22808n != null) {
            this.f22804j = 0.0f;
            this.f22808n = null;
        }
        if (!z10) {
            this.f22801f = f7;
            this.d = f7;
        } else {
            if (this.f22801f > f7) {
                this.f22801f = f7;
            }
            this.d = this.f22801f;
        }
        this.f22800c = f7;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f22802g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f22798a;
        this.f22798a = currentTimeMillis;
        if (z10) {
            if (this.f22801f != 1.0f) {
                this.f22799b = (((float) (360 * j3)) / this.v) + this.f22799b;
                float f7 = this.f22800c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j10 = this.e + j3;
                    this.e = j10;
                    if (j10 >= 300) {
                        this.f22801f = f7;
                        this.d = f7;
                        this.e = 0L;
                    } else {
                        this.f22801f = (A.getInterpolation(((float) j10) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f22801f >= 1.0f && this.f22808n != null) {
                float f12 = this.f22804j - (((float) j3) / 200.0f);
                this.f22804j = f12;
                if (f12 <= 0.0f) {
                    this.f22804j = 0.0f;
                    this.f22808n = null;
                }
                c();
            }
        } else if (this.f22808n != null) {
            float f13 = this.f22804j - (((float) j3) / 200.0f);
            this.f22804j = f13;
            if (f13 <= 0.0f) {
                this.f22804j = 0.0f;
                this.f22808n = null;
            }
            c();
        }
    }
}
