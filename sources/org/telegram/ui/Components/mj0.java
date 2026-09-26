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
    public final View f26517i;
    public boolean f26519k;
    public boolean f26520l;
    public Drawable f26521m;
    public Drawable f26522n;
    public final Paint f26524p;
    public boolean f26529u;
    public long f26512a = 0;
    public float f26513b = 0.0f;
    public float f26514c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f26515f = 0.0f;
    public final RectF f26516g = new RectF();
    public final RectF h = new RectF();
    public float f26518j = 1.0f;
    public int f26523o = -1;
    public int f26525q = AndroidUtilities.dp(4.0f);
    public final boolean f26526r = true;
    public final float f26527s = 1.0f;
    public Paint f26528t = null;
    public float v = 3000.0f;
    public final Path f26530w = new Path();
    public final Matrix f26531x = new Matrix();
    public final PathMeasure f26532y = new PathMeasure();
    public final Path f26533z = new Path();

    public mj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f26524p = paint;
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
        this.f26517i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f26522n;
        RectF rectF = this.f26516g;
        float f7 = this.f26527s;
        if (drawable != null) {
            if (this.f26526r) {
                drawable.setAlpha((int) (this.f26518j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.f26522n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f26522n.draw(canvas);
        }
        Drawable drawable2 = this.f26521m;
        if (drawable2 != null) {
            if (this.f26522n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.f0.z(1.0f, this.f26518j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.f26521m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f26521m.draw(canvas);
        }
        if (!this.f26519k && !this.f26520l) {
            g(false);
            return;
        }
        Paint paint2 = this.f26528t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f26523o;
            Paint paint3 = this.f26524p;
            paint3.setColor(i10);
            if (this.f26520l) {
                paint3.setAlpha((int) (this.f26518j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.f26525q;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, rectF.top + f11, rectF.right - f11, rectF.bottom - f11);
        b(this.f26513b - 90.0f, Math.max(4.0f, this.f26515f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f26529u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            float f13 = ((f7 + f10) - f12) / 360.0f;
            Path path = this.f26530w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f26531x;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f26532y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f26533z;
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
        RectF rectF = this.f26516g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f26517i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.f26512a = System.currentTimeMillis();
        if (z11 && (drawable2 = this.f26521m) != drawable) {
            this.f26522n = drawable2;
            this.f26520l = this.f26519k;
            this.f26518j = 1.0f;
            e(1.0f, z11);
        } else {
            this.f26522n = null;
            this.f26520l = false;
        }
        this.f26519k = z10;
        this.f26521m = drawable;
        if (!z11) {
            this.f26517i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.f26518j != 0.0f && this.f26522n != null) {
            this.f26518j = 0.0f;
            this.f26522n = null;
        }
        if (!z10) {
            this.f26515f = f7;
            this.d = f7;
        } else {
            if (this.f26515f > f7) {
                this.f26515f = f7;
            }
            this.d = this.f26515f;
        }
        this.f26514c = f7;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f26516g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f26512a;
        this.f26512a = currentTimeMillis;
        if (z10) {
            if (this.f26515f != 1.0f) {
                this.f26513b = (((float) (360 * j3)) / this.v) + this.f26513b;
                float f7 = this.f26514c;
                float f10 = this.d;
                float f11 = f7 - f10;
                if (f11 > 0.0f) {
                    long j10 = this.e + j3;
                    this.e = j10;
                    if (j10 >= 300) {
                        this.f26515f = f7;
                        this.d = f7;
                        this.e = 0L;
                    } else {
                        this.f26515f = (A.getInterpolation(((float) j10) / 300.0f) * f11) + f10;
                    }
                }
                c();
            }
            if (this.f26515f >= 1.0f && this.f26522n != null) {
                float f12 = this.f26518j - (((float) j3) / 200.0f);
                this.f26518j = f12;
                if (f12 <= 0.0f) {
                    this.f26518j = 0.0f;
                    this.f26522n = null;
                }
                c();
            }
        } else if (this.f26522n != null) {
            float f13 = this.f26518j - (((float) j3) / 200.0f);
            this.f26518j = f13;
            if (f13 <= 0.0f) {
                this.f26518j = 0.0f;
                this.f26522n = null;
            }
            c();
        }
    }
}
