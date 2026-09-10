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
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.wr;
public abstract class d1 extends FrameLayout {
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
    public float f17594a;
    public float f17595a0;
    public Utilities.Callback2 f17596b;
    public float f17597b0;
    public final z0 f17598c;
    public long f17599c0;
    public final z0 d;
    public boolean f17600d0;
    public final org.telegram.ui.Components.d6 e;
    public Bitmap f17601f;
    public BitmapShader h;
    public Matrix f17602n;
    public final int[] f17603r;
    public float f17604s;
    public boolean v;
    public boolean f17605w;
    public final f6 f17606x;
    public final Paint f17607y;

    public d1(Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f17594a = 0.5f;
        wr wrVar = wr.h;
        this.e = new org.telegram.ui.Components.d6(1.0f, this, 0L, 320L, wrVar);
        this.f17603r = new int[2];
        this.f17604s = 0.0f;
        Paint paint = new Paint(1);
        this.f17607y = paint;
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
        this.f17606x = f6Var;
        setWillNotDraw(false);
        z0 z0Var = new z0(this, 0);
        this.f17598c = z0Var;
        z0Var.setCallback(this);
        z0Var.u(AndroidUtilities.bold());
        z0Var.k(0.3f, 165L, wrVar);
        z0Var.t(AndroidUtilities.dpf2(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = z0Var.f25424a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        z0Var.f25425b = i10;
        z0 z0Var2 = new z0(this, 1);
        this.d = z0Var2;
        z0Var2.setCallback(this);
        z0Var2.u(AndroidUtilities.bold());
        z0Var2.k(0.3f, 165L, wrVar);
        z0Var2.t(AndroidUtilities.dpf2(14.0f));
        TextPaint textPaint2 = z0Var2.f25424a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        z0Var2.f25425b = i11;
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
        z0Var.r(i12);
        if (this.L) {
            i13 = -1;
        } else {
            i13 = -16777216;
        }
        z0Var2.r(i13);
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
        z0 z0Var = this.f17598c;
        z0Var.setColorFilter(porterDuffColorFilter);
        z0Var.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        z0Var.draw(canvas);
        if (z10 && (porterDuffColorFilter2 = this.W) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.W = porterDuffColorFilter2;
        }
        z0 z0Var2 = this.d;
        z0Var2.setColorFilter(porterDuffColorFilter2);
        z0Var2.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        z0Var2.draw(canvas);
    }

    public final void c(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.T;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        float a2 = w7.q.a(f7, 0.0f, 1.0f);
        if (!z10) {
            this.f17594a = a2;
            invalidate();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f17594a, a2);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new x0(this, 0));
            this.T.addListener(new a1(this, a2, 0));
            this.T.setInterpolator(wr.h);
            this.T.setDuration(220L);
            this.T.start();
        }
        c1 c1Var = (c1) this;
        String str2 = c1Var.f17570f0;
        if (str2 == null) {
            str2 = dd.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            z0 z0Var = this.f17598c;
            if (!TextUtils.equals(z0Var.f25428g, str2)) {
                z0Var.b();
                z0Var.q(str2, true, true);
            }
        }
        if (c1Var.f17570f0 != null) {
            str = dd.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str != null) {
            z0 z0Var2 = this.d;
            if (!TextUtils.equals(z0Var2.f25428g, str)) {
                z0Var2.b();
                z0Var2.q(str, true, true);
            }
        }
        int i10 = j6.sj;
        f6 f6Var = c1Var.f17606x;
        this.J.setColor(i0.a.d(w7.q.a((((a2 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), j6.v0(i10, f6Var), j6.v0(j6.tj, f6Var)));
    }

    public float getValue() {
        return this.f17594a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.v) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f17604s), AndroidUtilities.dp(this.f17604s), this.f17607y);
        }
        boolean z10 = this.f17605w;
        Paint paint = this.J;
        if (z10) {
            if (this.f17601f != null) {
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
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f17604s), AndroidUtilities.dp(this.f17604s), paint2);
            }
            if (this.f17601f != null && this.f17594a < 1.0f && d > 0.0f) {
                Paint paint3 = this.F;
                paint3.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f17604s), AndroidUtilities.dp(this.f17604s), paint3);
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f17604s), AndroidUtilities.dp(this.f17604s), this.G);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f17604s), AndroidUtilities.dp(this.f17604s), this.H);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f17604s), AndroidUtilities.dp(this.f17604s), this.E);
        }
        a(canvas);
        if (!this.L) {
            b(canvas, false);
        }
        if (this.f17594a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.f17594a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f17604s), AndroidUtilities.dp(this.f17604s), paint);
        a(canvas);
        if (!this.L) {
            b(canvas, true);
        }
        if (this.f17594a < 1.0f) {
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
        int[] iArr = this.f17603r;
        getLocationOnScreen(iArr);
        Matrix matrix = this.f17602n;
        if (matrix != null) {
            matrix.reset();
            this.f17602n.postScale(8.0f, 8.0f);
            this.f17602n.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.h;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f17602n);
                invalidate();
            }
        }
        boolean z11 = this.N;
        f6 f6Var = this.f17606x;
        if (z11) {
            Drawable r02 = j6.r0();
            if (r02 instanceof ColorDrawable) {
                v02 = ((ColorDrawable) r02).getColor();
            } else {
                Pair pair = null;
                if (r02 instanceof lc0) {
                    bitmap = ((lc0) r02).f24949k;
                } else if (r02 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) r02).getBitmap();
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int width = (int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth());
                    int measuredWidth = (int) (((getMeasuredWidth() + i15) / AndroidUtilities.displaySize.x) * bitmap.getWidth());
                    int currentActionBarHeight = (int) ((((iArr[1] - AndroidUtilities.statusBarHeight) - l.getCurrentActionBarHeight()) / AndroidUtilities.displaySize.y) * bitmap.getHeight());
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
                v02 = j6.l1(0.25f, j6.v0(j6.f17928d6, f6Var));
            }
        } else {
            v02 = j6.v0(j6.f17928d6, f6Var);
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
        if (this.f17605w && this.f17601f == null && !this.U && z10) {
            this.V.run();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17600d0 = true;
            this.f17595a0 = x10;
            this.f17597b0 = this.f17594a;
            this.f17599c0 = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i10 = 0;
            if (action == 1) {
                this.f17600d0 = false;
                if (System.currentTimeMillis() - this.f17599c0 < ViewConfiguration.getTapTimeout()) {
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
                    Utilities.Callback2 callback2 = this.f17596b;
                    if (callback2 != null) {
                        callback2.run(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x10 - this.f17595a0) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.f17597b0;
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
            boolean z10 = !this.f17600d0;
            c(max, false);
            Utilities.Callback2 callback22 = this.f17596b;
            if (callback22 != null) {
                callback22.run(Float.valueOf(this.f17594a), Boolean.valueOf(z10));
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
        this.f17598c.r(i11);
        if (this.L) {
            i12 = -1;
        }
        this.d.r(i12);
    }

    public void setDrawBlur(boolean z10) {
        this.f17605w = z10;
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
        this.f17596b = callback2;
    }

    public void setRoundRadiusDp(float f7) {
        this.f17604s = f7;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.M = fArr;
    }

    public void setTextColor(int i10) {
        this.f17598c.r(i10);
        this.d.r(i10);
    }
}
