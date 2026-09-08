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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.pr;
public abstract class c1 extends FrameLayout {
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
    public boolean U;
    public final q V;
    public PorterDuffColorFilter W;
    public float f20324a;
    public float f20325a0;
    public Utilities.Callback2 f20326b;
    public float f20327b0;
    public final y0 f20328c;
    public long f20329c0;
    public final y0 d;
    public boolean f20330d0;
    public final org.telegram.ui.Components.e6 f20331e;
    public Bitmap f20332f;
    public BitmapShader h;
    public Matrix f20333n;
    public final int[] f20334r;
    public float f20335s;
    public boolean v;
    public boolean f20336w;
    public final f6 f20337x;
    public final Paint f20338y;

    public c1(Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f20324a = 0.5f;
        pr prVar = pr.h;
        this.f20331e = new org.telegram.ui.Components.e6(1.0f, this, 0L, 320L, prVar);
        this.f20334r = new int[2];
        this.f20335s = 0.0f;
        Paint paint = new Paint(1);
        this.f20338y = paint;
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
        this.U = false;
        this.V = new q(this, 3);
        this.f20337x = f6Var;
        setWillNotDraw(false);
        y0 y0Var = new y0(this, 0);
        this.f20328c = y0Var;
        y0Var.setCallback(this);
        y0Var.u(AndroidUtilities.bold());
        y0Var.k(0.3f, 165L, prVar);
        y0Var.t(AndroidUtilities.dpf2(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = y0Var.f29311a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        y0Var.f29312b = i10;
        y0 y0Var2 = new y0(this, 1);
        this.d = y0Var2;
        y0Var2.setCallback(this);
        y0Var2.u(AndroidUtilities.bold());
        y0Var2.k(0.3f, 165L, prVar);
        y0Var2.t(AndroidUtilities.dpf2(14.0f));
        TextPaint textPaint2 = y0Var2.f29311a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        y0Var2.f29312b = i11;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dpf2(1.33f), 0.0f, AndroidUtilities.dpf2(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.4f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint2.setColor(j6.v0(j6.G8, f6Var));
        boolean z10 = AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f;
        this.L = z10;
        if (z10) {
            i12 = -1;
        } else {
            i12 = -16777216;
        }
        y0Var.r(i12);
        if (this.L) {
            i13 = -1;
        } else {
            i13 = -16777216;
        }
        y0Var2.r(i13);
        paint4.setColor(j6.l1(0.025f, -16777216));
        paint3.setColor(j6.l1(0.35f, -1));
        paint6.setColor(j6.l1(0.2f, -1));
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
            porterDuffColorFilter = this.W;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.W = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        y0 y0Var = this.f20328c;
        y0Var.setColorFilter(porterDuffColorFilter);
        y0Var.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        y0Var.draw(canvas);
        if (z10 && (porterDuffColorFilter2 = this.W) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.W = porterDuffColorFilter2;
        }
        y0 y0Var2 = this.d;
        y0Var2.setColorFilter(porterDuffColorFilter2);
        y0Var2.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        y0Var2.draw(canvas);
    }

    public final void c(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.T;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        float a2 = w7.p.a(f7, 0.0f, 1.0f);
        if (!z10) {
            this.f20324a = a2;
            invalidate();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f20324a, a2);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new w0(this, 0));
            this.T.addListener(new z0(this, a2, 0));
            this.T.setInterpolator(pr.h);
            this.T.setDuration(220L);
            this.T.start();
        }
        b1 b1Var = (b1) this;
        String str2 = b1Var.f20249f0;
        if (str2 == null) {
            str2 = fd.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            y0 y0Var = this.f20328c;
            if (!TextUtils.equals(y0Var.f29316g, str2)) {
                y0Var.b();
                y0Var.q(str2, true, true);
            }
        }
        if (b1Var.f20249f0 != null) {
            str = fd.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str != null) {
            y0 y0Var2 = this.d;
            if (!TextUtils.equals(y0Var2.f29316g, str)) {
                y0Var2.b();
                y0Var2.q(str, true, true);
            }
        }
        int i10 = j6.sj;
        f6 f6Var = b1Var.f20337x;
        this.J.setColor(i0.a.d(w7.p.a((((a2 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), j6.v0(i10, f6Var), j6.v0(j6.tj, f6Var)));
    }

    public float getValue() {
        return this.f20324a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.v) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20335s), AndroidUtilities.dp(this.f20335s), this.f20338y);
        }
        boolean z10 = this.f20336w;
        Paint paint = this.J;
        if (z10) {
            if (this.f20332f != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float d = this.f20331e.d(f7, false);
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
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20335s), AndroidUtilities.dp(this.f20335s), paint2);
            }
            if (this.f20332f != null && this.f20324a < 1.0f && d > 0.0f) {
                Paint paint3 = this.F;
                paint3.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20335s), AndroidUtilities.dp(this.f20335s), paint3);
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20335s), AndroidUtilities.dp(this.f20335s), this.G);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20335s), AndroidUtilities.dp(this.f20335s), this.H);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20335s), AndroidUtilities.dp(this.f20335s), this.E);
        }
        a(canvas);
        if (!this.L) {
            b(canvas, false);
        }
        if (this.f20324a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.f20324a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f20335s), AndroidUtilities.dp(this.f20335s), paint);
        a(canvas);
        if (!this.L) {
            b(canvas, true);
        }
        if (this.f20324a < 1.0f) {
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
        int v02;
        int i14;
        Bitmap bitmap;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int[] iArr = this.f20334r;
        getLocationOnScreen(iArr);
        Matrix matrix = this.f20333n;
        if (matrix != null) {
            matrix.reset();
            this.f20333n.postScale(8.0f, 8.0f);
            this.f20333n.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.h;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f20333n);
                invalidate();
            }
        }
        boolean z11 = this.N;
        f6 f6Var = this.f20337x;
        if (z11) {
            Drawable r02 = j6.r0();
            if (r02 instanceof ColorDrawable) {
                v02 = ((ColorDrawable) r02).getColor();
            } else {
                Pair pair = null;
                if (r02 instanceof dc0) {
                    bitmap = ((dc0) r02).f25380k;
                } else if (r02 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) r02).getBitmap();
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
                    v02 = ((Integer) pair.first).intValue();
                    i14 = ((Integer) pair.second).intValue();
                    if (this.O == null && this.P == v02 && this.Q == i14) {
                        return;
                    }
                    this.P = v02;
                    this.Q = i14;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.O = linearGradient;
                    this.I.setShader(linearGradient);
                }
                v02 = j6.l1(0.25f, j6.v0(j6.f20690d6, f6Var));
            }
        } else {
            v02 = j6.v0(j6.f20690d6, f6Var);
            if (!j6.I.q()) {
                v02 = j6.v(v02, j6.l1(0.18f, -16777216));
            }
        }
        i14 = v02;
        if (this.O == null) {
        }
        this.P = v02;
        this.Q = i14;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
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
        if (this.f20336w && this.f20332f == null && !this.U && z10) {
            this.V.run();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f20330d0 = true;
            this.f20325a0 = x10;
            this.f20327b0 = this.f20324a;
            this.f20329c0 = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i10 = 0;
            if (action == 1) {
                this.f20330d0 = false;
                if (System.currentTimeMillis() - this.f20329c0 < ViewConfiguration.getTapTimeout()) {
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
                    Utilities.Callback2 callback2 = this.f20326b;
                    if (callback2 != null) {
                        callback2.run(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x10 - this.f20325a0) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.f20327b0;
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
            boolean z10 = !this.f20330d0;
            c(max, false);
            Utilities.Callback2 callback22 = this.f20326b;
            if (callback22 != null) {
                callback22.run(Float.valueOf(this.f20324a), Boolean.valueOf(z10));
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
        this.f20328c.r(i11);
        if (this.L) {
            i12 = -1;
        }
        this.d.r(i12);
    }

    public void setDrawBlur(boolean z10) {
        this.f20336w = z10;
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
        this.f20326b = callback2;
    }

    public void setRoundRadiusDp(float f7) {
        this.f20335s = f7;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.M = fArr;
    }

    public void setTextColor(int i10) {
        this.f20328c.r(i10);
        this.d.r(i10);
    }
}
