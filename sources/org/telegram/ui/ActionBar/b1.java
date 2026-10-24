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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.zr;
public abstract class b1 extends FrameLayout implements b6 {
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public final Paint K;
    public boolean L;
    public float[] M;
    public boolean N;
    public LinearGradient O;
    public int P;
    public int Q;
    public Matrix R;
    public int S;
    public ValueAnimator T;
    public int U;
    public boolean V;
    public boolean W;
    public float f20710a;
    public final p f20711a0;
    public Utilities.Callback2 f20712b;
    public PorterDuffColorFilter f20713b0;
    public final x0 f20714c;
    public float f20715c0;
    public final x0 d;
    public float f20716d0;
    public final org.telegram.ui.Components.d6 e;
    public long f20717e0;
    public Bitmap f20718f;
    public boolean f20719f0;
    public BitmapShader h;
    public Matrix f20720n;
    public final int[] f20721r;
    public float f20722s;
    public boolean v;
    public boolean f20723w;
    public final g6 f20724x;
    public final Paint f20725y;

    public b1(Context context, g6 g6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f20710a = 0.5f;
        zr zrVar = zr.h;
        this.e = new org.telegram.ui.Components.d6(1.0f, this, 0L, 320L, zrVar);
        this.f20721r = new int[2];
        this.f20722s = 0.0f;
        Paint paint = new Paint(1);
        this.f20725y = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Paint(1);
        Paint paint3 = new Paint(1);
        this.G = paint3;
        Paint paint4 = new Paint(1);
        this.H = paint4;
        Paint paint5 = new Paint(1);
        this.I = paint5;
        this.J = new Paint(1);
        Paint paint6 = new Paint(1);
        this.K = paint6;
        this.N = true;
        this.W = false;
        this.f20711a0 = new p(this, 3);
        this.f20724x = g6Var;
        setWillNotDraw(false);
        x0 x0Var = new x0(this, 0);
        this.f20714c = x0Var;
        x0Var.setCallback(this);
        x0Var.x(AndroidUtilities.bold());
        x0Var.n(0.3f, 165L, zrVar);
        x0Var.w(AndroidUtilities.dpf2(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = x0Var.f28795a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        x0Var.f28797b = i10;
        x0 x0Var2 = new x0(this, 1);
        this.d = x0Var2;
        x0Var2.setCallback(this);
        x0Var2.x(AndroidUtilities.bold());
        x0Var2.n(0.3f, 165L, zrVar);
        x0Var2.w(AndroidUtilities.dpf2(14.0f));
        TextPaint textPaint2 = x0Var2.f28795a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        x0Var2.f28797b = i11;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dpf2(1.33f), 0.0f, AndroidUtilities.dpf2(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.4f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        int w02 = k6.w0(k6.G8, g6Var);
        this.U = w02;
        paint2.setColor(w02);
        boolean z10 = AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f;
        this.L = z10;
        if (z10) {
            i12 = -1;
        } else {
            i12 = -16777216;
        }
        x0Var.u(i12);
        if (this.L) {
            i13 = -1;
        } else {
            i13 = -16777216;
        }
        x0Var2.u(i13);
        paint4.setColor(k6.o1(0.025f, -16777216));
        paint3.setColor(k6.o1(0.35f, -1));
        paint6.setColor(k6.o1(0.2f, -1));
    }

    public final void a(Canvas canvas) {
        if (this.M != null) {
            int i10 = 0;
            while (true) {
                float[] fArr = this.M;
                if (i10 < fArr.length) {
                    float f7 = fArr[i10];
                    RectF rectF = AndroidUtilities.rectTmp;
                    canvas.drawRect((rectF.width() * f7) + rectF.left, rectF.top, (rectF.width() * f7) + rectF.left + AndroidUtilities.dp(0.66f), rectF.bottom, this.K);
                    i10++;
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
            porterDuffColorFilter = this.f20713b0;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.f20713b0 = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        x0 x0Var = this.f20714c;
        x0Var.setColorFilter(porterDuffColorFilter);
        x0Var.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        x0Var.draw(canvas);
        if (z10 && (porterDuffColorFilter2 = this.f20713b0) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.f20713b0 = porterDuffColorFilter2;
        }
        x0 x0Var2 = this.d;
        x0Var2.setColorFilter(porterDuffColorFilter2);
        x0Var2.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        x0Var2.draw(canvas);
    }

    public abstract int c(float f7);

    public final void d(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.T;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        float a2 = w7.r.a(f7, 0.0f, 1.0f);
        if (!z10) {
            this.f20710a = a2;
            invalidate();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f20710a, a2);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new v0(this, 0));
            this.T.addListener(new y0(this, a2, 0));
            this.T.setInterpolator(zr.h);
            this.T.setDuration(220L);
            this.T.start();
        }
        a1 a1Var = (a1) this;
        String str2 = a1Var.f20686h0;
        if (str2 == null) {
            str2 = cd.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            x0 x0Var = this.f20714c;
            if (!TextUtils.equals(x0Var.f28802i, str2)) {
                x0Var.a();
                x0Var.t(str2, true, true);
            }
        }
        if (a1Var.f20686h0 != null) {
            str = cd.a((2.8f * a2) + 0.2f) + "x";
        }
        if (str != null) {
            x0 x0Var2 = this.d;
            if (!TextUtils.equals(x0Var2.f28802i, str)) {
                x0Var2.a();
                x0Var2.t(str, true, true);
            }
        }
        this.J.setColor(c(a2));
    }

    public float getValue() {
        return this.f20710a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.v) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20722s), AndroidUtilities.dp(this.f20722s), this.f20725y);
        }
        boolean z10 = this.f20723w;
        Paint paint = this.J;
        if (z10) {
            if (this.f20718f != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float d = this.e.d(f7, false);
            if (d < 1.0f) {
                if (this.R == null || this.S != ((int) rectF.width())) {
                    Matrix matrix = this.R;
                    if (matrix == null) {
                        this.R = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.R;
                    int width = (int) rectF.width();
                    this.S = width;
                    matrix2.postScale(width, 1.0f);
                    this.O.setLocalMatrix(this.R);
                }
                Paint paint2 = this.I;
                paint2.setAlpha((int) ((1.0f - d) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20722s), AndroidUtilities.dp(this.f20722s), paint2);
            }
            if (this.f20718f != null && this.f20710a < 1.0f && d > 0.0f) {
                Paint paint3 = this.F;
                paint3.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20722s), AndroidUtilities.dp(this.f20722s), paint3);
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20722s), AndroidUtilities.dp(this.f20722s), this.G);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20722s), AndroidUtilities.dp(this.f20722s), this.H);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20722s), AndroidUtilities.dp(this.f20722s), this.E);
        }
        a(canvas);
        if (!this.L) {
            b(canvas, false);
        }
        if (this.f20710a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.f20710a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20722s), AndroidUtilities.dp(this.f20722s), paint);
        a(canvas);
        if (!this.L) {
            b(canvas, true);
        }
        if (this.f20710a < 1.0f) {
            canvas.restore();
        }
        if (this.L) {
            b(canvas, false);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int w02;
        int i14;
        Bitmap bitmap;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int[] iArr = this.f20721r;
        getLocationOnScreen(iArr);
        Matrix matrix = this.f20720n;
        if (matrix != null) {
            matrix.reset();
            this.f20720n.postScale(8.0f, 8.0f);
            this.f20720n.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.h;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f20720n);
                invalidate();
            }
        }
        boolean z11 = this.N;
        g6 g6Var = this.f20724x;
        if (z11) {
            Drawable s02 = k6.s0();
            if (s02 instanceof ColorDrawable) {
                w02 = ((ColorDrawable) s02).getColor();
            } else {
                Pair pair = null;
                if (s02 instanceof wc0) {
                    bitmap = ((wc0) s02).f32200k;
                } else if (s02 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) s02).getBitmap();
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int width = (int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth());
                    int measuredWidth = (int) (((getMeasuredWidth() + i15) / AndroidUtilities.displaySize.x) * bitmap.getWidth());
                    int currentActionBarHeight = (int) ((((iArr[1] - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight()) / AndroidUtilities.displaySize.y) * bitmap.getHeight());
                    if (width >= 0 && width < bitmap.getWidth() && measuredWidth >= 0 && measuredWidth < bitmap.getWidth() && currentActionBarHeight >= 0 && currentActionBarHeight < bitmap.getHeight()) {
                        pair = new Pair(Integer.valueOf(bitmap.getPixel(width, currentActionBarHeight)), Integer.valueOf(bitmap.getPixel(measuredWidth, currentActionBarHeight)));
                    }
                }
                if (pair != null) {
                    w02 = ((Integer) pair.first).intValue();
                    i14 = ((Integer) pair.second).intValue();
                    if (this.O == null && this.P == w02 && this.Q == i14) {
                        return;
                    }
                    this.P = w02;
                    this.Q = i14;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{w02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.O = linearGradient;
                    this.I.setShader(linearGradient);
                }
                w02 = k6.o1(0.25f, k6.w0(k6.f21184d6, g6Var));
            }
        } else {
            w02 = k6.w0(k6.f21184d6, g6Var);
            if (!k6.I.q()) {
                w02 = k6.v(w02, k6.o1(0.18f, -16777216));
            }
        }
        i14 = w02;
        if (this.O == null) {
        }
        this.P = w02;
        this.Q = i14;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{w02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.O = linearGradient2;
        this.I.setShader(linearGradient2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        if (this.v) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i10), 1073741824);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
        if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f20723w && this.f20718f == null && !this.W && z10) {
            this.f20711a0.run();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f20719f0 = true;
            this.f20715c0 = x10;
            this.f20716d0 = this.f20710a;
            this.f20717e0 = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i10 = 0;
            if (action == 1) {
                this.f20719f0 = false;
                if (System.currentTimeMillis() - this.f20717e0 < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x10 - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.M != null) {
                        while (true) {
                            float[] fArr = this.M;
                            if (i10 >= fArr.length) {
                                break;
                            } else if (Math.abs(paddingLeft - fArr[i10]) < 0.1f) {
                                paddingLeft = this.M[i10];
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    Utilities.Callback2 callback2 = this.f20712b;
                    if (callback2 != null) {
                        callback2.run(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x10 - this.f20715c0) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.f20716d0;
            if (this.M != null) {
                int i11 = 0;
                while (true) {
                    float[] fArr2 = this.M;
                    if (i11 >= fArr2.length) {
                        break;
                    } else if (Math.abs(max - fArr2[i11]) < 0.05f) {
                        max = this.M[i11];
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            boolean z10 = !this.f20719f0;
            d(max, false);
            Utilities.Callback2 callback22 = this.f20712b;
            if (callback22 != null) {
                callback22.run(Float.valueOf(this.f20710a), Boolean.valueOf(z10));
            }
        }
        return true;
    }

    @Override
    public void setBackgroundColor(int i10) {
        boolean z10;
        int i11;
        Paint paint = this.E;
        paint.setColor(i10);
        if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L = z10;
        int i12 = -16777216;
        if (z10) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        this.f20714c.u(i11);
        if (this.L) {
            i12 = -1;
        }
        this.d.u(i12);
    }

    public void setDrawBlur(boolean z10) {
        this.f20723w = z10;
        invalidate();
    }

    public void setDrawShadow(boolean z10) {
        int i10;
        this.v = z10;
        if (z10) {
            i10 = AndroidUtilities.dp(8.0f);
        } else {
            i10 = 0;
        }
        setPadding(i10, i10, i10, i10);
        invalidate();
    }

    public void setOnValueChange(Utilities.Callback2<Float, Boolean> callback2) {
        this.f20712b = callback2;
    }

    public void setRoundRadiusDp(float f7) {
        this.f20722s = f7;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.M = fArr;
    }

    public void setTextColor(int i10) {
        this.V = true;
        this.f20714c.u(i10);
        this.d.u(i10);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z10;
        int i10;
        Paint paint = this.E;
        if (paint != null) {
            try {
                if (paint.getColor() == this.U && (w02 = k6.w0(k6.G8, this.f20724x)) != this.U) {
                    this.U = w02;
                    paint.setColor(w02);
                    if (AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.L = z10;
                    if (!this.V) {
                        x0 x0Var = this.f20714c;
                        int i11 = -16777216;
                        if (x0Var != null) {
                            if (z10) {
                                i10 = -1;
                            } else {
                                i10 = -16777216;
                            }
                            x0Var.u(i10);
                        }
                        x0 x0Var2 = this.d;
                        if (x0Var2 != null) {
                            if (this.L) {
                                i11 = -1;
                            }
                            x0Var2.u(i11);
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        Paint paint2 = this.J;
        if (paint2 != null) {
            paint2.setColor(c(this.f20710a));
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
