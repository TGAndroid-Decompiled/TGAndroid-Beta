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
    public final View f23058i;
    public boolean f23060k;
    public boolean f23061l;
    public Drawable f23062m;
    public Drawable f23063n;
    public final Paint f23065p;
    public boolean f23070u;
    public long f23053a = 0;
    public float f23054b = 0.0f;
    public float f23055c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f23056f = 0.0f;
    public final RectF f23057g = new RectF();
    public final RectF h = new RectF();
    public float f23059j = 1.0f;
    public int f23064o = -1;
    public int f23066q = AndroidUtilities.dp(4.0f);
    public final boolean f23067r = true;
    public final float f23068s = 1.0f;
    public Paint f23069t = null;
    public float v = 3000.0f;
    public final Path f23071w = new Path();
    public final Matrix f23072x = new Matrix();
    public final PathMeasure f23073y = new PathMeasure();
    public final Path f23074z = new Path();

    public cj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f23065p = paint;
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
        this.f23058i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f23063n;
        RectF rectF = this.f23057g;
        float f7 = this.f23068s;
        if (drawable != null) {
            if (this.f23067r) {
                drawable.setAlpha((int) (this.f23059j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f23063n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f23063n.draw(canvas);
        }
        Drawable drawable2 = this.f23062m;
        if (drawable2 != null) {
            if (this.f23063n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.w1.A(1.0f, this.f23059j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f23062m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f23062m.draw(canvas);
        }
        if (!this.f23060k && !this.f23061l) {
            g(false);
            return;
        }
        Paint paint2 = this.f23069t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f23064o;
            Paint paint3 = this.f23065p;
            paint3.setColor(i10);
            if (this.f23061l) {
                paint3.setAlpha((int) (this.f23059j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f23066q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f23054b - 90.0f, Math.max(4.0f, this.f23056f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f23070u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f23071w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f23072x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f23073y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f23074z;
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
        RectF rectF = this.f23057g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f23058i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f23053a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f23062m) != drawable) {
            this.f23063n = drawable2;
            this.f23061l = this.f23060k;
            this.f23059j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f23063n = null;
            this.f23061l = false;
        }
        this.f23060k = z10;
        this.f23062m = drawable;
        if (!z11) {
            this.f23058i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f23059j != 0.0f && this.f23063n != null) {
            this.f23059j = 0.0f;
            this.f23063n = null;
        }
        if (!z10) {
            this.f23056f = f7;
            this.d = f7;
        } else {
            if (this.f23056f > f7) {
                this.f23056f = f7;
            }
            this.d = this.f23056f;
        }
        this.f23055c = f7;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f23057g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f23053a;
        this.f23053a = currentTimeMillis;
        if (z10) {
            if (this.f23056f != 1.0f) {
                this.f23054b = (((float) (360 * j3)) / this.v) + this.f23054b;
                float f7 = this.f23055c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j10 = this.e + j3;
                    this.e = j10;
                    if (j10 >= 300) {
                        this.f23056f = f7;
                        this.d = f7;
                        this.e = 0L;
                    } else {
                        this.f23056f = (A.getInterpolation(((float) j10) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f23056f >= 1.0f && this.f23063n != null) {
                float f12 = this.f23059j - (((float) j3) / 200.0f);
                this.f23059j = f12;
                if (f12 <= 0.0f) {
                    this.f23059j = 0.0f;
                    this.f23063n = null;
                }
                c();
            }
        } else if (this.f23063n != null) {
            float f13 = this.f23059j - (((float) j3) / 200.0f);
            this.f23059j = f13;
            if (f13 <= 0.0f) {
                this.f23059j = 0.0f;
                this.f23063n = null;
            }
            c();
        }
    }
}
