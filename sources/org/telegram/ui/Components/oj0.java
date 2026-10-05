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
    public final View f29482i;
    public boolean f29484k;
    public boolean f29485l;
    public Drawable f29486m;
    public Drawable f29487n;
    public final Paint f29489p;
    public boolean f29494u;
    public long f29476a = 0;
    public float f29477b = 0.0f;
    public float f29478c = 0.0f;
    public float d = 0.0f;
    public long f29479e = 0;
    public float f29480f = 0.0f;
    public final RectF f29481g = new RectF();
    public final RectF h = new RectF();
    public float f29483j = 1.0f;
    public int f29488o = -1;
    public int f29490q = AndroidUtilities.dp(4.0f);
    public final boolean f29491r = true;
    public final float f29492s = 1.0f;
    public Paint f29493t = null;
    public float v = 3000.0f;
    public final Path f29495w = new Path();
    public final Matrix f29496x = new Matrix();
    public final PathMeasure f29497y = new PathMeasure();
    public final Path f29498z = new Path();

    public oj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f29489p = paint;
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
        this.f29482i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f29487n;
        RectF rectF = this.f29481g;
        float f7 = this.f29492s;
        if (drawable != null) {
            if (this.f29491r) {
                drawable.setAlpha((int) (this.f29483j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f29487n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f29487n.draw(canvas);
        }
        Drawable drawable2 = this.f29486m;
        if (drawable2 != null) {
            if (this.f29487n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.q.z(1.0f, this.f29483j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f29486m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f29486m.draw(canvas);
        }
        if (!this.f29484k && !this.f29485l) {
            g(false);
            return;
        }
        Paint paint2 = this.f29493t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f29488o;
            Paint paint3 = this.f29489p;
            paint3.setColor(i10);
            if (this.f29485l) {
                paint3.setAlpha((int) (this.f29483j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f29490q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f29477b - 90.0f, Math.max(4.0f, this.f29480f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f29494u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f29495w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f29496x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f29497y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f29498z;
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
        RectF rectF = this.f29481g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f29482i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f29476a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f29486m) != drawable) {
            this.f29487n = drawable2;
            this.f29485l = this.f29484k;
            this.f29483j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f29487n = null;
            this.f29485l = false;
        }
        this.f29484k = z10;
        this.f29486m = drawable;
        if (!z11) {
            this.f29482i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f29483j != 0.0f && this.f29487n != null) {
            this.f29483j = 0.0f;
            this.f29487n = null;
        }
        if (!z10) {
            this.f29480f = f7;
            this.d = f7;
        } else {
            if (this.f29480f > f7) {
                this.f29480f = f7;
            }
            this.d = this.f29480f;
        }
        this.f29478c = f7;
        this.f29479e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f29481g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f29476a;
        this.f29476a = currentTimeMillis;
        if (z10) {
            if (this.f29480f != 1.0f) {
                this.f29477b = (((float) (360 * j3)) / this.v) + this.f29477b;
                float f7 = this.f29478c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j10 = this.f29479e + j3;
                    this.f29479e = j10;
                    if (j10 >= 300) {
                        this.f29480f = f7;
                        this.d = f7;
                        this.f29479e = 0L;
                    } else {
                        this.f29480f = (A.getInterpolation(((float) j10) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f29480f >= 1.0f && this.f29487n != null) {
                float f12 = this.f29483j - (((float) j3) / 200.0f);
                this.f29483j = f12;
                if (f12 <= 0.0f) {
                    this.f29483j = 0.0f;
                    this.f29487n = null;
                }
                c();
            }
        } else if (this.f29487n != null) {
            float f13 = this.f29483j - (((float) j3) / 200.0f);
            this.f29483j = f13;
            if (f13 <= 0.0f) {
                this.f29483j = 0.0f;
                this.f29487n = null;
            }
            c();
        }
    }
}
