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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nb0;

public abstract class c1 extends FrameLayout {
    public final Paint A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public boolean H;
    public float[] I;
    public boolean J;
    public LinearGradient K;
    public int L;
    public int M;
    public Matrix N;
    public int O;
    public ValueAnimator P;
    public boolean Q;
    public final p R;
    public PorterDuffColorFilter S;
    public float T;
    public float U;
    public long V;
    public boolean W;

    public float f22794a;

    public Utilities.Callback2 f22795b;

    public final y0 f22796c;
    public final y0 d;

    public final org.telegram.ui.Components.y5 f22797e;

    public Bitmap f22798f;
    public BitmapShader h;

    public Matrix f22799n;

    public final int[] f22800r;

    public float f22801s;
    public boolean v;

    public boolean f22802w;

    public final c6 f22803x;

    public final Paint f22804y;

    public c1(Context context, c6 c6Var) {
        super(context);
        this.f22794a = 0.5f;
        er erVar = er.h;
        this.f22797e = new org.telegram.ui.Components.y5(1.0f, this, 0L, 320L, erVar);
        this.f22800r = new int[2];
        this.f22801s = 0.0f;
        Paint paint = new Paint(1);
        this.f22804y = paint;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new Paint(1);
        Paint paint3 = new Paint(1);
        this.C = paint3;
        Paint paint4 = new Paint(1);
        this.D = paint4;
        Paint paint5 = new Paint(1);
        this.E = paint5;
        this.F = new Paint(1);
        Paint paint6 = new Paint(1);
        this.G = paint6;
        this.J = true;
        this.Q = false;
        this.R = new p(this, 3);
        this.f22803x = c6Var;
        setWillNotDraw(false);
        y0 y0Var = new y0(this, 0);
        this.f22796c = y0Var;
        y0Var.setCallback(this);
        y0Var.u(AndroidUtilities.bold());
        y0Var.k(0.3f, 165L, erVar);
        y0Var.t(AndroidUtilities.dpf2(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = y0Var.f29238a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        y0Var.f29239b = LocaleController.isRTL ? 5 : 3;
        y0 y0Var2 = new y0(this, 1);
        this.d = y0Var2;
        y0Var2.setCallback(this);
        y0Var2.u(AndroidUtilities.bold());
        y0Var2.k(0.3f, 165L, erVar);
        y0Var2.t(AndroidUtilities.dpf2(14.0f));
        TextPaint textPaint2 = y0Var2.f29238a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        y0Var2.f29239b = LocaleController.isRTL ? 3 : 5;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dpf2(1.33f), 0.0f, AndroidUtilities.dpf2(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.4f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint2.setColor(g6.v0(g6.G8, c6Var));
        boolean z10 = AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f;
        this.H = z10;
        y0Var.r(z10 ? -1 : -16777216);
        y0Var2.r(this.H ? -1 : -16777216);
        paint4.setColor(g6.l1(0.025f, -16777216));
        paint3.setColor(g6.l1(0.35f, -1));
        paint6.setColor(g6.l1(0.2f, -1));
    }

    public final void a(Canvas canvas) {
        if (this.I == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = this.I;
            if (i10 >= fArr.length) {
                return;
            }
            float f10 = fArr[i10];
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRect((rectF.width() * f10) + rectF.left, rectF.top, (rectF.width() * f10) + rectF.left + AndroidUtilities.dp(0.66f), rectF.bottom, this.G);
            i10++;
        }
    }

    public final void b(Canvas canvas, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = null;
        if (z10) {
            porterDuffColorFilter = this.S;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.S = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        y0 y0Var = this.f22796c;
        y0Var.setColorFilter(porterDuffColorFilter);
        y0Var.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        y0Var.draw(canvas);
        if (z10 && (porterDuffColorFilter2 = this.S) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.S = porterDuffColorFilter2;
        }
        y0 y0Var2 = this.d;
        y0Var2.setColorFilter(porterDuffColorFilter2);
        y0Var2.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        y0Var2.draw(canvas);
    }

    public final void c(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.P;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P = null;
        }
        float fA = h7.n.a(f10, 0.0f, 1.0f);
        if (z10) {
            int i10 = 0;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f22794a, fA);
            this.P = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new w0(this, i10));
            this.P.addListener(new z0(this, fA, i10));
            this.P.setInterpolator(er.h);
            this.P.setDuration(220L);
            this.P.start();
        } else {
            this.f22794a = fA;
            invalidate();
        }
        b1 b1Var = (b1) this;
        String str2 = b1Var.f22741b0;
        if (str2 == null) {
            str2 = af.g.a((fA * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            y0 y0Var = this.f22796c;
            if (!TextUtils.equals(y0Var.f29243g, str2)) {
                y0Var.b();
                y0Var.q(str2, true, true);
            }
        }
        if (b1Var.f22741b0 != null) {
            str = af.g.a((fA * 2.8f) + 0.2f) + "x";
        }
        if (str != null) {
            y0 y0Var2 = this.d;
            if (!TextUtils.equals(y0Var2.f29243g, str)) {
                y0Var2.b();
                y0Var2.q(str, true, true);
            }
        }
        int i11 = g6.sj;
        c6 c6Var = b1Var.f22803x;
        this.F.setColor(i0.b.d(h7.n.a((((fA * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), g6.v0(i11, c6Var), g6.v0(g6.tj, c6Var)));
    }

    public float getValue() {
        return this.f22794a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.v) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22801s), AndroidUtilities.dp(this.f22801s), this.f22804y);
        }
        boolean z10 = this.f22802w;
        Paint paint = this.F;
        if (z10) {
            float fD = this.f22797e.d(this.f22798f != null ? 1.0f : 0.0f, false);
            if (fD < 1.0f) {
                if (this.N == null || this.O != ((int) rectF.width())) {
                    Matrix matrix = this.N;
                    if (matrix == null) {
                        this.N = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.N;
                    int iWidth = (int) rectF.width();
                    this.O = iWidth;
                    matrix2.postScale(iWidth, 1.0f);
                    this.K.setLocalMatrix(this.N);
                }
                Paint paint2 = this.E;
                paint2.setAlpha((int) ((1.0f - fD) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22801s), AndroidUtilities.dp(this.f22801s), paint2);
            }
            if (this.f22798f != null && this.f22794a < 1.0f && fD > 0.0f) {
                Paint paint3 = this.B;
                paint3.setAlpha((int) (fD * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22801s), AndroidUtilities.dp(this.f22801s), paint3);
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22801s), AndroidUtilities.dp(this.f22801s), this.C);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22801s), AndroidUtilities.dp(this.f22801s), this.D);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22801s), AndroidUtilities.dp(this.f22801s), this.A);
        }
        a(canvas);
        if (!this.H) {
            b(canvas, false);
        }
        if (this.f22794a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.f22794a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22801s), AndroidUtilities.dp(this.f22801s), paint);
        a(canvas);
        if (!this.H) {
            b(canvas, true);
        }
        if (this.f22794a < 1.0f) {
            canvas.restore();
        }
        if (this.H) {
            b(canvas, false);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iV0;
        int iIntValue;
        Bitmap bitmap;
        super.onLayout(z10, i10, i11, i12, i13);
        int[] iArr = this.f22800r;
        getLocationOnScreen(iArr);
        Matrix matrix = this.f22799n;
        if (matrix != null) {
            matrix.reset();
            this.f22799n.postScale(8.0f, 8.0f);
            this.f22799n.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.h;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f22799n);
                invalidate();
            }
        }
        boolean z11 = this.J;
        c6 c6Var = this.f22803x;
        if (z11) {
            Drawable drawableR0 = g6.r0();
            if (!(drawableR0 instanceof ColorDrawable)) {
                Pair pair = null;
                if (drawableR0 instanceof nb0) {
                    bitmap = ((nb0) drawableR0).f30929k;
                } else {
                    bitmap = drawableR0 instanceof BitmapDrawable ? ((BitmapDrawable) drawableR0).getBitmap() : null;
                }
                if (bitmap != null) {
                    int i14 = iArr[0];
                    float f10 = i14 / AndroidUtilities.displaySize.x;
                    float measuredWidth = (getMeasuredWidth() + i14) / AndroidUtilities.displaySize.x;
                    float currentActionBarHeight = ((iArr[1] - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight()) / AndroidUtilities.displaySize.y;
                    int width = (int) (f10 * bitmap.getWidth());
                    int width2 = (int) (measuredWidth * bitmap.getWidth());
                    int height = (int) (currentActionBarHeight * bitmap.getHeight());
                    if (width >= 0 && width < bitmap.getWidth() && width2 >= 0 && width2 < bitmap.getWidth() && height >= 0 && height < bitmap.getHeight()) {
                        pair = new Pair(Integer.valueOf(bitmap.getPixel(width, height)), Integer.valueOf(bitmap.getPixel(width2, height)));
                    }
                }
                if (pair != null) {
                    iV0 = ((Integer) pair.first).intValue();
                    iIntValue = ((Integer) pair.second).intValue();
                } else {
                    iV0 = g6.l1(0.25f, g6.v0(g6.f23053d6, c6Var));
                }
                if (this.K == null && this.L == iV0 && this.M == iIntValue) {
                    return;
                }
                this.L = iV0;
                this.M = iIntValue;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{iV0, iIntValue}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.K = linearGradient;
                this.E.setShader(linearGradient);
            }
            iV0 = ((ColorDrawable) drawableR0).getColor();
        } else {
            iV0 = g6.v0(g6.f23053d6, c6Var);
            if (!g6.I.q()) {
                iV0 = g6.v(iV0, g6.l1(0.18f, -16777216));
            }
        }
        iIntValue = iV0;
        if (this.K == null) {
        }
        this.L = iV0;
        this.M = iIntValue;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{iV0, iIntValue}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.K = linearGradient2;
        this.E.setShader(linearGradient2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.v) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i10), 1073741824);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
        boolean z10 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256);
        if (this.f22802w && this.f22798f == null && !this.Q && z10) {
            this.R.run();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float fMax;
        boolean z10;
        Utilities.Callback2 callback2;
        int i10;
        float[] fArr;
        float x8 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.W = true;
            this.T = x8;
            this.U = this.f22794a;
            this.V = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i11 = 0;
            if (action == 1) {
                this.W = false;
                if (System.currentTimeMillis() - this.V < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x8 - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.I != null) {
                        while (true) {
                            float[] fArr2 = this.I;
                            if (i11 >= fArr2.length) {
                                break;
                            }
                            if (Math.abs(paddingLeft - fArr2[i11]) < 0.1f) {
                                paddingLeft = this.I[i11];
                                break;
                            }
                            i11++;
                        }
                    }
                    Utilities.Callback2 callback3 = this.f22795b;
                    if (callback3 != null) {
                        callback3.run(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                } else {
                    fMax = ((x8 - this.T) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.U;
                    if (this.I != null) {
                        i10 = 0;
                        while (true) {
                            fArr = this.I;
                            if (i10 >= fArr.length) {
                                break;
                            }
                            if (Math.abs(fMax - fArr[i10]) < 0.05f) {
                                fMax = this.I[i10];
                                break;
                            }
                            i10++;
                        }
                    }
                    z10 = !this.W;
                    c(fMax, false);
                    callback2 = this.f22795b;
                    if (callback2 != null) {
                        callback2.run(Float.valueOf(this.f22794a), Boolean.valueOf(z10));
                    }
                }
            } else {
                fMax = ((x8 - this.T) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.U;
                if (this.I != null) {
                    i10 = 0;
                    while (true) {
                        fArr = this.I;
                        if (i10 >= fArr.length) {
                            break;
                            break;
                        }
                        if (Math.abs(fMax - fArr[i10]) < 0.05f) {
                            fMax = this.I[i10];
                            break;
                        }
                        i10++;
                    }
                }
                z10 = !this.W;
                c(fMax, false);
                callback2 = this.f22795b;
                if (callback2 != null) {
                    callback2.run(Float.valueOf(this.f22794a), Boolean.valueOf(z10));
                }
            }
        }
        return true;
    }

    @Override
    public void setBackgroundColor(int i10) {
        Paint paint = this.A;
        paint.setColor(i10);
        boolean z10 = AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f;
        this.H = z10;
        this.f22796c.r(z10 ? -1 : -16777216);
        this.d.r(this.H ? -1 : -16777216);
    }

    public void setDrawBlur(boolean z10) {
        this.f22802w = z10;
        invalidate();
    }

    public void setDrawShadow(boolean z10) {
        this.v = z10;
        int iDp = z10 ? AndroidUtilities.dp(8.0f) : 0;
        setPadding(iDp, iDp, iDp, iDp);
        invalidate();
    }

    public void setOnValueChange(Utilities.Callback2<Float, Boolean> callback2) {
        this.f22795b = callback2;
    }

    public void setRoundRadiusDp(float f10) {
        this.f22801s = f10;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.I = fArr;
    }

    public void setTextColor(int i10) {
        this.f22796c.r(i10);
        this.d.r(i10);
    }
}
