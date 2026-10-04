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
    public final View f29382i;
    public boolean f29384k;
    public boolean f29385l;
    public Drawable f29386m;
    public Drawable f29387n;
    public final Paint f29389p;
    public boolean f29394u;
    public long f29376a = 0;
    public float f29377b = 0.0f;
    public float f29378c = 0.0f;
    public float d = 0.0f;
    public long f29379e = 0;
    public float f29380f = 0.0f;
    public final RectF f29381g = new RectF();
    public final RectF h = new RectF();
    public float f29383j = 1.0f;
    public int f29388o = -1;
    public int f29390q = AndroidUtilities.dp(4.0f);
    public final boolean f29391r = true;
    public final float f29392s = 1.0f;
    public Paint f29393t = null;
    public float v = 3000.0f;
    public final Path f29395w = new Path();
    public final Matrix f29396x = new Matrix();
    public final PathMeasure f29397y = new PathMeasure();
    public final Path f29398z = new Path();

    public oj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f29389p = paint;
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
        this.f29382i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f29387n;
        RectF rectF = this.f29381g;
        float f7 = this.f29392s;
        if (drawable != null) {
            if (this.f29391r) {
                drawable.setAlpha((int) (this.f29383j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f29387n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f29387n.draw(canvas);
        }
        Drawable drawable2 = this.f29386m;
        if (drawable2 != null) {
            if (this.f29387n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.q.z(1.0f, this.f29383j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f29386m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f29386m.draw(canvas);
        }
        if (!this.f29384k && !this.f29385l) {
            g(false);
            return;
        }
        Paint paint2 = this.f29393t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f29388o;
            Paint paint3 = this.f29389p;
            paint3.setColor(i10);
            if (this.f29385l) {
                paint3.setAlpha((int) (this.f29383j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f29390q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f29377b - 90.0f, Math.max(4.0f, this.f29380f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f29394u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f29395w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f29396x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f29397y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f29398z;
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
        RectF rectF = this.f29381g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f29382i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f29376a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f29386m) != drawable) {
            this.f29387n = drawable2;
            this.f29385l = this.f29384k;
            this.f29383j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f29387n = null;
            this.f29385l = false;
        }
        this.f29384k = z10;
        this.f29386m = drawable;
        if (!z11) {
            this.f29382i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f29383j != 0.0f && this.f29387n != null) {
            this.f29383j = 0.0f;
            this.f29387n = null;
        }
        if (!z10) {
            this.f29380f = f7;
            this.d = f7;
        } else {
            if (this.f29380f > f7) {
                this.f29380f = f7;
            }
            this.d = this.f29380f;
        }
        this.f29378c = f7;
        this.f29379e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f29381g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f29376a;
        this.f29376a = currentTimeMillis;
        if (z10) {
            if (this.f29380f != 1.0f) {
                this.f29377b = (((float) (360 * j3)) / this.v) + this.f29377b;
                float f7 = this.f29378c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j10 = this.f29379e + j3;
                    this.f29379e = j10;
                    if (j10 >= 300) {
                        this.f29380f = f7;
                        this.d = f7;
                        this.f29379e = 0L;
                    } else {
                        this.f29380f = (A.getInterpolation(((float) j10) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f29380f >= 1.0f && this.f29387n != null) {
                float f12 = this.f29383j - (((float) j3) / 200.0f);
                this.f29383j = f12;
                if (f12 <= 0.0f) {
                    this.f29383j = 0.0f;
                    this.f29387n = null;
                }
                c();
            }
        } else if (this.f29387n != null) {
            float f13 = this.f29383j - (((float) j3) / 200.0f);
            this.f29383j = f13;
            if (f13 <= 0.0f) {
                this.f29383j = 0.0f;
                this.f29387n = null;
            }
            c();
        }
    }
}
