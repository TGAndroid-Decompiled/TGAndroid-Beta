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
import b8.be;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.lc;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.xq;
public abstract class v0 extends FrameLayout implements z5 {
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
    public float f28712a;
    public boolean f28713a0;
    public n10 f28714b;
    public final lg.n f28715b0;
    public final r0 f28716c;
    public PorterDuffColorFilter f28717c0;
    public final r0 d;
    public float f28718d0;
    public final org.telegram.ui.Components.u5 f28719e;
    public float f28720e0;
    public Bitmap f28721f;
    public long f28722f0;
    public boolean f28723g0;
    public BitmapShader h;
    public Matrix f28724n;
    public final int[] f28725r;
    public float f28726s;
    public boolean f28727w;
    public boolean f28728x;
    public final e6 f28729y;

    public v0(Context context, e6 e6Var) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        this.f28712a = 0.5f;
        xq xqVar = xq.h;
        this.f28719e = new org.telegram.ui.Components.u5(1.0f, this, 0L, 320L, xqVar);
        this.f28725r = new int[2];
        this.f28726s = 0.0f;
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
        this.f28713a0 = false;
        this.f28715b0 = new lg.n(this, 21);
        this.f28729y = e6Var;
        setWillNotDraw(false);
        r0 r0Var = new r0(this, 0);
        this.f28716c = r0Var;
        r0Var.setCallback(this);
        r0Var.x(org.telegram.messenger.g0.o());
        r0Var.n(0.3f, 165L, xqVar);
        r0Var.w(org.telegram.messenger.g0.N(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = r0Var.f33981a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        r0Var.f33983b = i3;
        r0 r0Var2 = new r0(this, 1);
        this.d = r0Var2;
        r0Var2.setCallback(this);
        r0Var2.x(org.telegram.messenger.g0.o());
        r0Var2.n(0.3f, 165L, xqVar);
        r0Var2.w(org.telegram.messenger.g0.N(14.0f));
        TextPaint textPaint2 = r0Var2.f33981a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        if (bd.f21784a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        r0Var2.f33983b = i10;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.N(1.33f), 0.0f, org.telegram.messenger.g0.N(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, -0.4f);
        org.telegram.messenger.g0.h(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        int w02 = k6.w0(k6.G8, e6Var);
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
        paint4.setColor(k6.r1(0.025f, -16777216));
        paint3.setColor(k6.r1(0.35f, -1));
        paint6.setColor(k6.r1(0.2f, -1));
    }

    public final void a(Canvas canvas) {
        if (this.N != null) {
            int i3 = 0;
            while (true) {
                float[] fArr = this.N;
                if (i3 < fArr.length) {
                    float f10 = fArr[i3];
                    RectF rectF = org.telegram.messenger.g0.P;
                    canvas.drawRect((rectF.width() * f10) + rectF.left, rectF.top, (rectF.width() * f10) + rectF.left + org.telegram.messenger.g0.L(0.66f), rectF.bottom, this.L);
                    i3++;
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
            porterDuffColorFilter = this.f28717c0;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.f28717c0 = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        r0 r0Var = this.f28716c;
        r0Var.setColorFilter(porterDuffColorFilter);
        r0Var.setBounds(org.telegram.messenger.g0.L(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() / 2);
        r0Var.draw(canvas);
        if (z10 && (porterDuffColorFilter2 = this.f28717c0) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.f28717c0 = porterDuffColorFilter2;
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
        float a10 = be.a(f10, 0.0f, 1.0f);
        if (!z10) {
            this.f28712a = a10;
            invalidate();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28712a, a10);
            this.U = ofFloat;
            ofFloat.addUpdateListener(new gi.j3(this, 11));
            this.U.addListener(new s0(this, a10, 0));
            this.U.setInterpolator(xq.h);
            this.U.setDuration(220L);
            this.U.start();
        }
        u0 u0Var = (u0) this;
        String str2 = u0Var.f28673i0;
        if (str2 == null) {
            str2 = cu0.a((a10 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            r0 r0Var = this.f28716c;
            if (!TextUtils.equals(r0Var.f33989i, str2)) {
                r0Var.a();
                r0Var.t(str2, true, true);
            }
        }
        if (u0Var.f28673i0 != null) {
            str = cu0.a((2.8f * a10) + 0.2f) + "x";
        }
        if (str != null) {
            r0 r0Var2 = this.d;
            if (!TextUtils.equals(r0Var2.f33989i, str)) {
                r0Var2.a();
                r0Var2.t(str, true, true);
            }
        }
        this.K.setColor(c(a10));
    }

    public float getValue() {
        return this.f28712a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.f28727w) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f28726s), org.telegram.messenger.g0.L(this.f28726s), this.E);
        }
        boolean z10 = this.f28728x;
        Paint paint = this.K;
        if (z10) {
            if (this.f28721f != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float e10 = this.f28719e.e(false, f10);
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
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f28726s), org.telegram.messenger.g0.L(this.f28726s), paint2);
            }
            if (this.f28721f != null && this.f28712a < 1.0f && e10 > 0.0f) {
                Paint paint3 = this.G;
                paint3.setAlpha((int) (e10 * 255.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f28726s), org.telegram.messenger.g0.L(this.f28726s), paint3);
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f28726s), org.telegram.messenger.g0.L(this.f28726s), this.H);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f28726s), org.telegram.messenger.g0.L(this.f28726s), this.I);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f28726s), org.telegram.messenger.g0.L(this.f28726s), this.F);
        }
        a(canvas);
        if (!this.M) {
            b(canvas, false);
        }
        if (this.f28712a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.f28712a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.f28726s), org.telegram.messenger.g0.L(this.f28726s), paint);
        a(canvas);
        if (!this.M) {
            b(canvas, true);
        }
        if (this.f28712a < 1.0f) {
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int w02;
        int i13;
        Bitmap bitmap;
        super.onLayout(z10, i3, i10, i11, i12);
        int[] iArr = this.f28725r;
        getLocationOnScreen(iArr);
        Matrix matrix = this.f28724n;
        if (matrix != null) {
            matrix.reset();
            this.f28724n.postScale(8.0f, 8.0f);
            this.f28724n.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.h;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f28724n);
                invalidate();
            }
        }
        boolean z11 = this.O;
        e6 e6Var = this.f28729y;
        if (z11) {
            Drawable s02 = k6.s0();
            if (s02 instanceof ColorDrawable) {
                w02 = ((ColorDrawable) s02).getColor();
            } else {
                Pair pair = null;
                if (s02 instanceof la0) {
                    bitmap = ((la0) s02).f35658k;
                } else if (s02 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) s02).getBitmap();
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int i14 = iArr[0];
                    Point point = org.telegram.messenger.g0.f22608q;
                    int width = (int) ((i14 / point.x) * bitmap.getWidth());
                    int measuredWidth = (int) (((getMeasuredWidth() + i14) / point.x) * bitmap.getWidth());
                    int currentActionBarHeight = (int) ((((iArr[1] - org.telegram.messenger.g0.f22602m) - k.getCurrentActionBarHeight()) / point.y) * bitmap.getHeight());
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
                w02 = k6.r1(0.25f, k6.w0(k6.f27878d6, e6Var));
            }
        } else {
            w02 = k6.w0(k6.f27878d6, e6Var);
            if (!k6.I.q()) {
                w02 = k6.w(w02, k6.r1(0.18f, -16777216));
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
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        if (this.f28727w) {
            i3 = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i3), 1073741824);
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
        if (az.o() >= 2 && lc.e(256)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f28728x && this.f28721f == null && !this.f28713a0 && z10) {
            this.f28715b0.run();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f28723g0 = true;
            this.f28718d0 = x10;
            this.f28720e0 = this.f28712a;
            this.f28722f0 = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i3 = 0;
            if (action == 1) {
                this.f28723g0 = false;
                if (System.currentTimeMillis() - this.f28722f0 < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x10 - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.N != null) {
                        while (true) {
                            float[] fArr = this.N;
                            if (i3 >= fArr.length) {
                                break;
                            } else if (Math.abs(paddingLeft - fArr[i3]) < 0.1f) {
                                paddingLeft = this.N[i3];
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    n10 n10Var = this.f28714b;
                    if (n10Var != null) {
                        n10Var.a(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x10 - this.f28718d0) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.f28720e0;
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
            boolean z10 = !this.f28723g0;
            d(false, max);
            n10 n10Var2 = this.f28714b;
            if (n10Var2 != null) {
                n10Var2.a(Float.valueOf(this.f28712a), Boolean.valueOf(z10));
            }
        }
        return true;
    }

    @Override
    public void setBackgroundColor(int i3) {
        boolean z10;
        int i10;
        Paint paint = this.F;
        paint.setColor(i3);
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
        this.f28716c.u(i10);
        if (this.M) {
            i11 = -1;
        }
        this.d.u(i11);
    }

    public void setDrawBlur(boolean z10) {
        this.f28728x = z10;
        invalidate();
    }

    public void setDrawShadow(boolean z10) {
        int i3;
        this.f28727w = z10;
        if (z10) {
            i3 = org.telegram.messenger.g0.L(8.0f);
        } else {
            i3 = 0;
        }
        setPadding(i3, i3, i3, i3);
        invalidate();
    }

    public void setOnValueChange(n10 n10Var) {
        this.f28714b = n10Var;
    }

    public void setRoundRadiusDp(float f10) {
        this.f28726s = f10;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.N = fArr;
    }

    public void setTextColor(int i3) {
        this.W = true;
        this.f28716c.u(i3);
        this.d.u(i3);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z10;
        int i3;
        Paint paint = this.F;
        if (paint != null) {
            try {
                if (paint.getColor() == this.V && (w02 = k6.w0(k6.G8, this.f28729y)) != this.V) {
                    this.V = w02;
                    paint.setColor(w02);
                    if (org.telegram.messenger.g0.B(w02) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.M = z10;
                    if (!this.W) {
                        r0 r0Var = this.f28716c;
                        int i10 = -16777216;
                        if (r0Var != null) {
                            if (z10) {
                                i3 = -1;
                            } else {
                                i3 = -16777216;
                            }
                            r0Var.u(i3);
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
            paint2.setColor(c(this.f28712a));
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
