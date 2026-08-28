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
public final class qi0 {
    public static DecelerateInterpolator A;
    public final View f31960i;
    public boolean f31962k;
    public boolean f31963l;
    public Drawable f31964m;
    public Drawable f31965n;
    public final Paint f31967p;
    public boolean f31972u;
    public long f31954a = 0;
    public float f31955b = 0.0f;
    public float f31956c = 0.0f;
    public float d = 0.0f;
    public long f31957e = 0;
    public float f31958f = 0.0f;
    public final RectF f31959g = new RectF();
    public final RectF h = new RectF();
    public float f31961j = 1.0f;
    public int f31966o = -1;
    public int f31968q = AndroidUtilities.dp(4.0f);
    public final boolean f31969r = true;
    public final float f31970s = 1.0f;
    public Paint f31971t = null;
    public float v = 3000.0f;
    public final Path f31973w = new Path();
    public final Matrix f31974x = new Matrix();
    public final PathMeasure f31975y = new PathMeasure();
    public final Path f31976z = new Path();

    public qi0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f31967p = paint;
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
        this.f31960i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f31965n;
        RectF rectF = this.f31959g;
        float f10 = this.f31970s;
        if (drawable != null) {
            if (this.f31969r) {
                drawable.setAlpha((int) (this.f31961j * 255.0f * f10));
            } else {
                drawable.setAlpha((int) (f10 * 255.0f));
            }
            this.f31965n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f31965n.draw(canvas);
        }
        Drawable drawable2 = this.f31964m;
        if (drawable2 != null) {
            if (this.f31965n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.l0.y(1.0f, this.f31961j, 255.0f, f10));
            } else {
                drawable2.setAlpha((int) (f10 * 255.0f));
            }
            this.f31964m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f31964m.draw(canvas);
        }
        if (!this.f31962k && !this.f31963l) {
            g(false);
            return;
        }
        Paint paint2 = this.f31971t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i9 = this.f31966o;
            Paint paint3 = this.f31967p;
            paint3.setColor(i9);
            if (this.f31963l) {
                paint3.setAlpha((int) (this.f31961j * 255.0f * f10));
            } else {
                paint3.setAlpha((int) (f10 * 255.0f));
            }
            paint = paint3;
        }
        float f11 = rectF.left;
        float f12 = this.f31968q;
        RectF rectF2 = this.h;
        rectF2.set(f11 + f12, rectF.top + f12, rectF.right - f12, rectF.bottom - f12);
        b(this.f31955b - 90.0f, Math.max(4.0f, this.f31958f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f31972u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            float f14 = ((f10 + f11) - f13) / 360.0f;
            Path path = this.f31973w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f31974x;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f31975y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f31976z;
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
        RectF rectF = this.f31959g;
        int i9 = ((int) rectF.left) - dp;
        int i10 = ((int) rectF.top) - dp;
        int i11 = dp * 2;
        this.f31960i.invalidate(i9, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f31954a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f31964m) != drawable) {
            this.f31965n = drawable2;
            this.f31963l = this.f31962k;
            this.f31961j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f31965n = null;
            this.f31963l = false;
        }
        this.f31962k = z10;
        this.f31964m = drawable;
        if (!z11) {
            this.f31960i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f10, boolean z10) {
        if (f10 != 1.0f && this.f31961j != 0.0f && this.f31965n != null) {
            this.f31961j = 0.0f;
            this.f31965n = null;
        }
        if (!z10) {
            this.f31958f = f10;
            this.d = f10;
        } else {
            if (this.f31958f > f10) {
                this.f31958f = f10;
            }
            this.d = this.f31958f;
        }
        this.f31956c = f10;
        this.f31957e = 0L;
        c();
    }

    public final void f(int i9, int i10, int i11, int i12) {
        this.f31959g.set(i9, i10, i11, i12);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f31954a;
        this.f31954a = currentTimeMillis;
        if (z10) {
            if (this.f31958f != 1.0f) {
                this.f31955b = (((float) (360 * j10)) / this.v) + this.f31955b;
                float f10 = this.f31956c;
                float f11 = this.d;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.f31957e + j10;
                    this.f31957e = j11;
                    if (j11 >= 300) {
                        this.f31958f = f10;
                        this.d = f10;
                        this.f31957e = 0L;
                    } else {
                        this.f31958f = (A.getInterpolation(((float) j11) / 300.0f) * f12) + f11;
                    }
                }
                c();
            }
            if (this.f31958f >= 1.0f && this.f31965n != null) {
                float f13 = this.f31961j - (((float) j10) / 200.0f);
                this.f31961j = f13;
                if (f13 <= 0.0f) {
                    this.f31961j = 0.0f;
                    this.f31965n = null;
                }
                c();
            }
        } else if (this.f31965n != null) {
            float f14 = this.f31961j - (((float) j10) / 200.0f);
            this.f31961j = f14;
            if (f14 <= 0.0f) {
                this.f31961j = 0.0f;
                this.f31965n = null;
            }
            c();
        }
    }
}
