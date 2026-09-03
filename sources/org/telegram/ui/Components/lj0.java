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
public final class lj0 {
    public static DecelerateInterpolator A;
    public final View f28782i;
    public boolean f28784k;
    public boolean f28785l;
    public Drawable f28786m;
    public Drawable f28787n;
    public final Paint f28789p;
    public boolean f28794u;
    public long f28776a = 0;
    public float f28777b = 0.0f;
    public float f28778c = 0.0f;
    public float d = 0.0f;
    public long f28779e = 0;
    public float f28780f = 0.0f;
    public final RectF f28781g = new RectF();
    public final RectF h = new RectF();
    public float f28783j = 1.0f;
    public int f28788o = -1;
    public int f28790q = AndroidUtilities.dp(4.0f);
    public final boolean f28791r = true;
    public final float f28792s = 1.0f;
    public Paint f28793t = null;
    public float v = 3000.0f;
    public final Path f28795w = new Path();
    public final Matrix f28796x = new Matrix();
    public final PathMeasure f28797y = new PathMeasure();
    public final Path f28798z = new Path();

    public lj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.f28789p = paint;
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
        this.f28782i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f28787n;
        RectF rectF = this.f28781g;
        float f10 = this.f28792s;
        if (drawable != null) {
            if (this.f28791r) {
                drawable.setAlpha((int) (this.f28783j * 255.0f * f10));
            } else {
                drawable.setAlpha((int) (f10 * 255.0f));
            }
            this.f28787n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f28787n.draw(canvas);
        }
        Drawable drawable2 = this.f28786m;
        if (drawable2 != null) {
            if (this.f28787n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.y3.y(1.0f, this.f28783j, 255.0f, f10));
            } else {
                drawable2.setAlpha((int) (f10 * 255.0f));
            }
            this.f28786m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f28786m.draw(canvas);
        }
        if (!this.f28784k && !this.f28785l) {
            g(false);
            return;
        }
        Paint paint2 = this.f28793t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.f28788o;
            Paint paint3 = this.f28789p;
            paint3.setColor(i10);
            if (this.f28785l) {
                paint3.setAlpha((int) (this.f28783j * 255.0f * f10));
            } else {
                paint3.setAlpha((int) (f10 * 255.0f));
            }
            paint = paint3;
        }
        float f11 = rectF.left;
        float f12 = this.f28790q;
        RectF rectF2 = this.h;
        rectF2.set(f11 + f12, rectF.top + f12, rectF.right - f12, rectF.bottom - f12);
        b(this.f28777b - 90.0f, Math.max(4.0f, this.f28780f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (this.f28794u) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            float f14 = ((f10 + f11) - f13) / 360.0f;
            Path path = this.f28795w;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f28796x;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f28797y;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f28798z;
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
        RectF rectF = this.f28781g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.f28782i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z4, boolean z10) {
        Drawable drawable2;
        this.f28776a = System.currentTimeMillis();
        if (z10 && (drawable2 = this.f28786m) != drawable) {
            this.f28787n = drawable2;
            this.f28785l = this.f28784k;
            this.f28783j = 1.0f;
            e(1.0f, z10);
        } else {
            this.f28787n = null;
            this.f28785l = false;
        }
        this.f28784k = z4;
        this.f28786m = drawable;
        if (!z10) {
            this.f28782i.invalidate();
        } else {
            c();
        }
    }

    public final void e(float f10, boolean z4) {
        if (f10 != 1.0f && this.f28783j != 0.0f && this.f28787n != null) {
            this.f28783j = 0.0f;
            this.f28787n = null;
        }
        if (!z4) {
            this.f28780f = f10;
            this.d = f10;
        } else {
            if (this.f28780f > f10) {
                this.f28780f = f10;
            }
            this.d = this.f28780f;
        }
        this.f28778c = f10;
        this.f28779e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f28781g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f28776a;
        this.f28776a = currentTimeMillis;
        if (z4) {
            if (this.f28780f != 1.0f) {
                this.f28777b = (((float) (360 * j10)) / this.v) + this.f28777b;
                float f10 = this.f28778c;
                float f11 = this.d;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.f28779e + j10;
                    this.f28779e = j11;
                    if (j11 >= 300) {
                        this.f28780f = f10;
                        this.d = f10;
                        this.f28779e = 0L;
                    } else {
                        this.f28780f = (A.getInterpolation(((float) j11) / 300.0f) * f12) + f11;
                    }
                }
                c();
            }
            if (this.f28780f >= 1.0f && this.f28787n != null) {
                float f13 = this.f28783j - (((float) j10) / 200.0f);
                this.f28783j = f13;
                if (f13 <= 0.0f) {
                    this.f28783j = 0.0f;
                    this.f28787n = null;
                }
                c();
            }
        } else if (this.f28787n != null) {
            float f14 = this.f28783j - (((float) j10) / 200.0f);
            this.f28783j = f14;
            if (f14 <= 0.0f) {
                this.f28783j = 0.0f;
                this.f28787n = null;
            }
            c();
        }
    }
}
