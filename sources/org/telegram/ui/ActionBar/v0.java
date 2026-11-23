package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import c8.m9;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.za0;
public abstract class v0 extends FrameLayout implements c6 {
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public float[] N;
    public boolean O;
    public LinearGradient P;
    public int Q;
    public int R;
    public Matrix S;
    public int T;
    public ValueAnimator U;
    public int V;
    public boolean W;
    public float f30169a;
    public boolean f30170a0;
    public p10 f30171b;
    public final oi.c2 f30172b0;
    public final r0 f30173c;
    public PorterDuffColorFilter f30174c0;
    public final r0 d;
    public float f30175d0;
    public final org.telegram.ui.Components.c6 f30176e;
    public float f30177e0;
    public Bitmap f30178f;
    public long f30179f0;
    public boolean f30180g0;
    public BitmapShader h;
    public Matrix f30181n;
    public final int[] f30182r;
    public float f30183s;
    public boolean f30184w;
    public boolean f30185x;
    public final i6 f30186y;

    public v0(Context context, i6 i6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        this.f30169a = 0.5f;
        kr krVar = kr.h;
        this.f30176e = new org.telegram.ui.Components.c6(1.0f, this, 0L, 320L, krVar);
        this.f30182r = new int[2];
        this.f30183s = 0.0f;
        Paint paint = new Paint(1);
        this.E = paint;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Paint(1);
        Paint paint3 = new Paint(1);
        this.H = paint3;
        Paint paint4 = new Paint(1);
        this.I = paint4;
        Paint paint5 = new Paint(1);
        this.J = paint5;
        this.K = new Paint(1);
        Paint paint6 = new Paint(1);
        this.L = paint6;
        this.O = true;
        this.f30170a0 = false;
        this.f30172b0 = new oi.c2(this, 4);
        this.f30186y = i6Var;
        setWillNotDraw(false);
        r0 r0Var = new r0(this, 0);
        this.f30173c = r0Var;
        r0Var.setCallback(this);
        r0Var.x(org.telegram.messenger.g0.o());
        r0Var.n(0.3f, 165L, krVar);
        r0Var.w(org.telegram.messenger.g0.N(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = r0Var.f37392a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        r0Var.f37394b = i7;
        r0 r0Var2 = new r0(this, 1);
        this.d = r0Var2;
        r0Var2.setCallback(this);
        r0Var2.x(org.telegram.messenger.g0.o());
        r0Var2.n(0.3f, 165L, krVar);
        r0Var2.w(org.telegram.messenger.g0.N(14.0f));
        TextPaint textPaint2 = r0Var2.f37392a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        if (gd.f24314a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        r0Var2.f37394b = i10;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.N(1.33f), 0.0f, org.telegram.messenger.g0.N(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, -0.4f);
        org.telegram.messenger.g0.h(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        int w02 = n6.w0(n6.G8, i6Var);
        this.V = w02;
        paint2.setColor(w02);
        boolean z10 = org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f;
        this.M = z10;
        if (z10) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        r0Var.u(i11);
        if (this.M) {
            i12 = -1;
        } else {
            i12 = -16777216;
        }
        r0Var2.u(i12);
        paint4.setColor(n6.r1(0.025f, -16777216));
        paint3.setColor(n6.r1(0.35f, -1));
        paint6.setColor(n6.r1(0.2f, -1));
    }

    public final void a(Canvas canvas) {
        if (this.N != null) {
            int i7 = 0;
            while (true) {
                float[] fArr = this.N;
                if (i7 < fArr.length) {
                    float f10 = fArr[i7];
                    RectF rectF = org.telegram.messenger.g0.P;
                    canvas.drawRect((rectF.width() * f10) + rectF.left, rectF.top, (rectF.width() * f10) + rectF.left + org.telegram.messenger.g0.L(0.66f), rectF.bottom, this.L);
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(Canvas canvas, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = null;
        if (z10) {
            porterDuffColorFilter = this.f30174c0;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.f30174c0 = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        r0 r0Var = this.f30173c;
        r0Var.setColorFilter(porterDuffColorFilter);
        r0Var.setBounds(org.telegram.messenger.g0.L(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() / 2);
        r0Var.draw(canvas);
        if (z10 && (porterDuffColorFilter2 = this.f30174c0) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.f30174c0 = porterDuffColorFilter2;
        }
        r0 r0Var2 = this.d;
        r0Var2.setColorFilter(porterDuffColorFilter2);
        r0Var2.setBounds(org.telegram.messenger.g0.L(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() / 2);
        r0Var2.draw(canvas);
    }

    public abstract int c(float f10);

    public final void d(boolean z10, float f10) {
        ValueAnimator valueAnimator = this.U;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        float a10 = m9.a(f10, 0.0f, 1.0f);
        if (!z10) {
            this.f30169a = a10;
            invalidate();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f30169a, a10);
            this.U = ofFloat;
            ofFloat.addUpdateListener(new hi.s3(this, 10));
            this.U.addListener(new s0(this, a10, 0));
            this.U.setInterpolator(kr.h);
            this.U.setDuration(220L);
            this.U.start();
        }
        u0 u0Var = (u0) this;
        String str2 = u0Var.f30135i0;
        if (str2 == null) {
            str2 = ou0.a((a10 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            r0 r0Var = this.f30173c;
            if (!TextUtils.equals(r0Var.f37401i, str2)) {
                r0Var.a();
                r0Var.t(str2, true, true);
            }
        }
        if (u0Var.f30135i0 != null) {
            str = ou0.a((2.8f * a10) + 0.2f) + "x";
        }
        if (str != null) {
            r0 r0Var2 = this.d;
            if (!TextUtils.equals(r0Var2.f37401i, str)) {
                r0Var2.a();
                r0Var2.t(str, true, true);
            }
        }
        this.K.setColor(c(a10));
    }

    public float getValue() {
        return this.f30169a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.f30184w) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f30183s), org.telegram.messenger.g0.L(this.f30183s), this.E);
        }
        boolean z10 = this.f30185x;
        Paint paint = this.K;
        if (z10) {
            if (this.f30178f != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float e10 = this.f30176e.e(false, f10);
            if (e10 < 1.0f) {
                if (this.S == null || this.T != ((int) rectF.width())) {
                    Matrix matrix = this.S;
                    if (matrix == null) {
                        this.S = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.S;
                    int width = (int) rectF.width();
                    this.T = width;
                    matrix2.postScale(width, 1.0f);
                    this.P.setLocalMatrix(this.S);
                }
                Paint paint2 = this.J;
                paint2.setAlpha((int) ((1.0f - e10) * 255.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f30183s), org.telegram.messenger.g0.L(this.f30183s), paint2);
            }
            if (this.f30178f != null && this.f30169a < 1.0f && e10 > 0.0f) {
                Paint paint3 = this.G;
                paint3.setAlpha((int) (e10 * 255.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f30183s), org.telegram.messenger.g0.L(this.f30183s), paint3);
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f30183s), org.telegram.messenger.g0.L(this.f30183s), this.H);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f30183s), org.telegram.messenger.g0.L(this.f30183s), this.I);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f30183s), org.telegram.messenger.g0.L(this.f30183s), this.F);
        }
        a(canvas);
        if (!this.M) {
            b(canvas, false);
        }
        if (this.f30169a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.f30169a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f30183s), org.telegram.messenger.g0.L(this.f30183s), paint);
        a(canvas);
        if (!this.M) {
            b(canvas, true);
        }
        if (this.f30169a < 1.0f) {
            canvas.restore();
        }
        if (this.M) {
            b(canvas, false);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int w02;
        int i13;
        Bitmap bitmap;
        super.onLayout(z10, i7, i10, i11, i12);
        int[] iArr = this.f30182r;
        getLocationOnScreen(iArr);
        Matrix matrix = this.f30181n;
        if (matrix != null) {
            matrix.reset();
            this.f30181n.postScale(8.0f, 8.0f);
            this.f30181n.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.h;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f30181n);
                invalidate();
            }
        }
        boolean z11 = this.O;
        i6 i6Var = this.f30186y;
        if (z11) {
            Drawable s02 = n6.s0();
            if (s02 instanceof ColorDrawable) {
                w02 = ((ColorDrawable) s02).getColor();
            } else {
                Pair pair = null;
                if (s02 instanceof za0) {
                    bitmap = ((za0) s02).f42795k;
                } else if (s02 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) s02).getBitmap();
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int i14 = iArr[0];
                    Point point = org.telegram.messenger.g0.f24226q;
                    int width = (int) ((i14 / point.x) * bitmap.getWidth());
                    int measuredWidth = (int) (((getMeasuredWidth() + i14) / point.x) * bitmap.getWidth());
                    int currentActionBarHeight = (int) ((((iArr[1] - org.telegram.messenger.g0.f24220m) - k.getCurrentActionBarHeight()) / point.y) * bitmap.getHeight());
                    if (width >= 0 && width < bitmap.getWidth() && measuredWidth >= 0 && measuredWidth < bitmap.getWidth() && currentActionBarHeight >= 0 && currentActionBarHeight < bitmap.getHeight()) {
                        pair = new Pair(Integer.valueOf(bitmap.getPixel(width, currentActionBarHeight)), Integer.valueOf(bitmap.getPixel(measuredWidth, currentActionBarHeight)));
                    }
                }
                if (pair != null) {
                    w02 = ((Integer) pair.first).intValue();
                    i13 = ((Integer) pair.second).intValue();
                    if (this.P == null && this.Q == w02 && this.R == i13) {
                        return;
                    }
                    this.Q = w02;
                    this.R = i13;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{w02, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.P = linearGradient;
                    this.J.setShader(linearGradient);
                }
                w02 = n6.r1(0.25f, n6.w0(n6.f29451d6, i6Var));
            }
        } else {
            w02 = n6.w0(n6.f29451d6, i6Var);
            if (!n6.I.q()) {
                w02 = n6.w(w02, n6.r1(0.18f, -16777216));
            }
        }
        i13 = w02;
        if (this.P == null) {
        }
        this.Q = w02;
        this.R = i13;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{w02, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.P = linearGradient2;
        this.J.setShader(linearGradient2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        if (this.f30184w) {
            i7 = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i7), 1073741824);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
        if (bz.o() >= 2 && pc.e(256)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f30185x && this.f30178f == null && !this.f30170a0 && z10) {
            this.f30172b0.run();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f30180g0 = true;
            this.f30175d0 = x10;
            this.f30177e0 = this.f30169a;
            this.f30179f0 = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i7 = 0;
            if (action == 1) {
                this.f30180g0 = false;
                if (System.currentTimeMillis() - this.f30179f0 < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x10 - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.N != null) {
                        while (true) {
                            float[] fArr = this.N;
                            if (i7 >= fArr.length) {
                                break;
                            } else if (Math.abs(paddingLeft - fArr[i7]) < 0.1f) {
                                paddingLeft = this.N[i7];
                                break;
                            } else {
                                i7++;
                            }
                        }
                    }
                    p10 p10Var = this.f30171b;
                    if (p10Var != null) {
                        p10Var.a(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x10 - this.f30175d0) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.f30177e0;
            if (this.N != null) {
                int i10 = 0;
                while (true) {
                    float[] fArr2 = this.N;
                    if (i10 >= fArr2.length) {
                        break;
                    } else if (Math.abs(max - fArr2[i10]) < 0.05f) {
                        max = this.N[i10];
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            boolean z10 = !this.f30180g0;
            d(false, max);
            p10 p10Var2 = this.f30171b;
            if (p10Var2 != null) {
                p10Var2.a(Float.valueOf(this.f30169a), Boolean.valueOf(z10));
            }
        }
        return true;
    }

    @Override
    public void setBackgroundColor(int i7) {
        boolean z10;
        int i10;
        Paint paint = this.F;
        paint.setColor(i7);
        if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.M = z10;
        int i11 = -16777216;
        if (z10) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        this.f30173c.u(i10);
        if (this.M) {
            i11 = -1;
        }
        this.d.u(i11);
    }

    public void setDrawBlur(boolean z10) {
        this.f30185x = z10;
        invalidate();
    }

    public void setDrawShadow(boolean z10) {
        int i7;
        this.f30184w = z10;
        if (z10) {
            i7 = org.telegram.messenger.g0.L(8.0f);
        } else {
            i7 = 0;
        }
        setPadding(i7, i7, i7, i7);
        invalidate();
    }

    public void setOnValueChange(p10 p10Var) {
        this.f30171b = p10Var;
    }

    public void setRoundRadiusDp(float f10) {
        this.f30183s = f10;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.N = fArr;
    }

    public void setTextColor(int i7) {
        this.W = true;
        this.f30173c.u(i7);
        this.d.u(i7);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z10;
        int i7;
        Paint paint = this.F;
        if (paint != null) {
            try {
                if (paint.getColor() == this.V && (w02 = n6.w0(n6.G8, this.f30186y)) != this.V) {
                    this.V = w02;
                    paint.setColor(w02);
                    if (org.telegram.messenger.g0.B(w02) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.M = z10;
                    if (!this.W) {
                        r0 r0Var = this.f30173c;
                        int i10 = -16777216;
                        if (r0Var != null) {
                            if (z10) {
                                i7 = -1;
                            } else {
                                i7 = -16777216;
                            }
                            r0Var.u(i7);
                        }
                        r0 r0Var2 = this.d;
                        if (r0Var2 != null) {
                            if (this.M) {
                                i10 = -1;
                            }
                            r0Var2.u(i10);
                        }
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        Paint paint2 = this.K;
        if (paint2 != null) {
            paint2.setColor(c(this.f30169a));
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
