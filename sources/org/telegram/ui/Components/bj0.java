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
    public final View f27131i;
    public boolean f27133k;
    public boolean f27134l;
    public Drawable f27135m;
    public Drawable f27136n;
    public final Paint f27138p;
    public boolean f27143u;
    public long f27125a = 0;
    public float f27126b = 0.0f;
    public float f27127c = 0.0f;
    public float d = 0.0f;
    public long f27128e = 0;
    public float f27129f = 0.0f;
    public final RectF f27130g = new RectF();
    public final RectF h = new RectF();
    public float f27132j = 1.0f;
    public int f27137o = -1;
    public int f27139q = AndroidUtilities.dp(4.0f);
    public final boolean f27140r = true;
    public final float f27141s = 1.0f;
    public Paint f27142t = null;
    public float v = 3000.0f;
    public final Path f27144w = new Path();
    public final Matrix f27145x = new Matrix();
    public final PathMeasure f27146y = new PathMeasure();
    public final Path f27147z = new Path();

    public bj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f27138p = paint;
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
        this.f27131i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f27136n;
        RectF rectF = this.f27130g;
        float f9 = this.f27141s;
        if (drawable != null) {
            if (this.f27140r) {
                drawable.setAlpha((int) (this.f27132j * 255.0f * f9));
            } else {
                drawable.setAlpha((int) (f9 * 255.0f));
            }
            this.f27136n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f27136n.draw(canvas);
        }
        Drawable drawable2 = this.f27135m;
        if (drawable2 != null) {
            if (this.f27136n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.x3.y(1.0f, this.f27132j, 255.0f, f9));
            } else {
                drawable2.setAlpha((int) (f9 * 255.0f));
            }
            this.f27135m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f27135m.draw(canvas);
        }
        if (!this.f27133k && !this.f27134l) {
            g(false);
            return;
        }
        Paint paint2 = this.f27142t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f27137o;
            Paint paint3 = this.f27138p;
            paint3.setColor(i10);
            if (this.f27134l) {
                paint3.setAlpha((int) (this.f27132j * 255.0f * f9));
            } else {
                paint3.setAlpha((int) (f9 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f27139q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f27126b - 90.0f, Math.max(4.0f, this.f27129f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f9, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f27143u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f9) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f9 + f10) - f12) / 360.0f;
            Path path = this.f27144w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f27145x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f27146y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f27147z;
            path2.reset();
            pathMeasure.getSegment(((f9 - f12) / 360.0f) * length, length * f13, path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            if (f13 > 1.0f) {
                b(f9 + 90.0f, f10 - 90.0f, canvas, paint, rectF);
                return;
            }
            return;
        }
        canvas.drawArc(rectF, f9, f10, false, paint);
    }

    public final void c() {
        int dp = AndroidUtilities.dp(2.0f);
        RectF rectF = this.f27130g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f27131i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f27125a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f27135m) != drawable) {
            this.f27136n = drawable2;
            this.f27134l = this.f27133k;
            this.f27132j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f27136n = null;
            this.f27134l = false;
        }
        this.f27133k = z10;
        this.f27135m = drawable;
        if (!z11) {
            this.f27131i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f9, boolean z10) {
        if (f9 != 1.0f && this.f27132j != 0.0f && this.f27136n != null) {
            this.f27132j = 0.0f;
            this.f27136n = null;
        }
        if (!z10) {
            this.f27129f = f9;
            this.d = f9;
        } else {
            if (this.f27129f > f9) {
                this.f27129f = f9;
            }
            this.d = this.f27129f;
        }
        this.f27127c = f9;
        this.f27128e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f27130g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f27125a;
        this.f27125a = currentTimeMillis;
        if (z10) {
            if (this.f27129f != 1.0f) {
                this.f27126b = (((float) (360 * j10)) / this.v) + this.f27126b;
                float f9 = this.f27127c;
                float f10 = this.d;
                float f11 = f9 - f10;
                if (f11 > 0.0f) {
                    long j11 = this.f27128e + j10;
                    this.f27128e = j11;
                    if (j11 >= 300) {
                        this.f27129f = f9;
                        this.d = f9;
                        this.f27128e = 0L;
                    } else {
                        this.f27129f = (A.getInterpolation(((float) j11) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f27129f >= 1.0f && this.f27136n != null) {
                float f12 = this.f27132j - (((float) j10) / 200.0f);
                this.f27132j = f12;
                if (f12 <= 0.0f) {
                    this.f27132j = 0.0f;
                    this.f27136n = null;
                }
                c();
            }
        } else if (this.f27136n != null) {
            float f13 = this.f27132j - (((float) j10) / 200.0f);
            this.f27132j = f13;
            if (f13 <= 0.0f) {
                this.f27132j = 0.0f;
                this.f27136n = null;
            }
            c();
        }
    }
}
