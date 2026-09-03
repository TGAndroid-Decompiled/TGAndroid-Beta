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
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.mr;
public abstract class d1 extends FrameLayout {
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public boolean I;
    public float[] J;
    public boolean K;
    public LinearGradient L;
    public int M;
    public int N;
    public Matrix O;
    public int P;
    public ValueAnimator Q;
    public boolean R;
    public final p S;
    public PorterDuffColorFilter T;
    public float U;
    public float V;
    public long W;
    public float f19548a;
    public boolean f19549a0;
    public Utilities.Callback2 f19550b;
    public final z0 f19551c;
    public final z0 d;
    public final org.telegram.ui.Components.z5 e;
    public Bitmap f19552f;
    public BitmapShader h;
    public Matrix f19553n;
    public final int[] f19554r;
    public float f19555s;
    public boolean v;
    public boolean f19556w;
    public final f6 f19557x;
    public final Paint f19558y;

    public d1(Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f19548a = 0.5f;
        mr mrVar = mr.h;
        this.e = new org.telegram.ui.Components.z5(1.0f, this, 0L, 320L, mrVar);
        this.f19554r = new int[2];
        this.f19555s = 0.0f;
        Paint paint = new Paint(1);
        this.f19558y = paint;
        Paint paint2 = new Paint(1);
        this.B = paint2;
        this.C = new Paint(1);
        Paint paint3 = new Paint(1);
        this.D = paint3;
        Paint paint4 = new Paint(1);
        this.E = paint4;
        Paint paint5 = new Paint(1);
        this.F = paint5;
        this.G = new Paint(1);
        Paint paint6 = new Paint(1);
        this.H = paint6;
        this.K = true;
        this.R = false;
        this.S = new p(this, 3);
        this.f19557x = f6Var;
        setWillNotDraw(false);
        z0 z0Var = new z0(this, 0);
        this.f19551c = z0Var;
        z0Var.setCallback(this);
        z0Var.u(AndroidUtilities.bold());
        z0Var.k(0.3f, 165L, mrVar);
        z0Var.t(AndroidUtilities.dpf2(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = z0Var.f25846a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        z0Var.f25847b = i10;
        z0 z0Var2 = new z0(this, 1);
        this.d = z0Var2;
        z0Var2.setCallback(this);
        z0Var2.u(AndroidUtilities.bold());
        z0Var2.k(0.3f, 165L, mrVar);
        z0Var2.t(AndroidUtilities.dpf2(14.0f));
        TextPaint textPaint2 = z0Var2.f25846a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        z0Var2.f25847b = i11;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dpf2(1.33f), 0.0f, AndroidUtilities.dpf2(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.4f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint2.setColor(j6.v0(j6.G8, f6Var));
        boolean z4 = AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f;
        this.I = z4;
        if (z4) {
            i12 = -1;
        } else {
            i12 = -16777216;
        }
        z0Var.r(i12);
        if (this.I) {
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
        if (this.J != null) {
            int i10 = 0;
            while (true) {
                float[] fArr = this.J;
                if (i10 < fArr.length) {
                    float f10 = fArr[i10];
                    RectF rectF = AndroidUtilities.rectTmp;
                    canvas.drawRect((rectF.width() * f10) + rectF.left, rectF.top, (rectF.width() * f10) + rectF.left + AndroidUtilities.dp(0.66f), rectF.bottom, this.H);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(Canvas canvas, boolean z4) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = null;
        if (z4) {
            porterDuffColorFilter = this.T;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.T = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        z0 z0Var = this.f19551c;
        z0Var.setColorFilter(porterDuffColorFilter);
        z0Var.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        z0Var.draw(canvas);
        if (z4 && (porterDuffColorFilter2 = this.T) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.T = porterDuffColorFilter2;
        }
        z0 z0Var2 = this.d;
        z0Var2.setColorFilter(porterDuffColorFilter2);
        z0Var2.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        z0Var2.draw(canvas);
    }

    public final void c(float f10, boolean z4) {
        ValueAnimator valueAnimator = this.Q;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        float a2 = k7.n.a(f10, 0.0f, 1.0f);
        if (!z4) {
            this.f19548a = a2;
            invalidate();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f19548a, a2);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new x0(this, 0));
            this.Q.addListener(new a1(this, a2, 0));
            this.Q.setInterpolator(mr.h);
            this.Q.setDuration(220L);
            this.Q.start();
        }
        c1 c1Var = (c1) this;
        String str2 = c1Var.f19518c0;
        if (str2 == null) {
            str2 = df.f.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            z0 z0Var = this.f19551c;
            if (!TextUtils.equals(z0Var.f25850g, str2)) {
                z0Var.b();
                z0Var.q(str2, true, true);
            }
        }
        if (c1Var.f19518c0 != null) {
            str = df.f.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str != null) {
            z0 z0Var2 = this.d;
            if (!TextUtils.equals(z0Var2.f25850g, str)) {
                z0Var2.b();
                z0Var2.q(str, true, true);
            }
        }
        int i10 = j6.sj;
        f6 f6Var = c1Var.f19557x;
        this.G.setColor(i0.a.d(k7.n.a((((a2 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), j6.v0(i10, f6Var), j6.v0(j6.tj, f6Var)));
    }

    public float getValue() {
        return this.f19548a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.v) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f19555s), AndroidUtilities.dp(this.f19555s), this.f19558y);
        }
        boolean z4 = this.f19556w;
        Paint paint = this.G;
        if (z4) {
            if (this.f19552f != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float d = this.e.d(f10, false);
            if (d < 1.0f) {
                if (this.O == null || this.P != ((int) rectF.width())) {
                    Matrix matrix = this.O;
                    if (matrix == null) {
                        this.O = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.O;
                    int width = (int) rectF.width();
                    this.P = width;
                    matrix2.postScale(width, 1.0f);
                    this.L.setLocalMatrix(this.O);
                }
                Paint paint2 = this.F;
                paint2.setAlpha((int) ((1.0f - d) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f19555s), AndroidUtilities.dp(this.f19555s), paint2);
            }
            if (this.f19552f != null && this.f19548a < 1.0f && d > 0.0f) {
                Paint paint3 = this.C;
                paint3.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f19555s), AndroidUtilities.dp(this.f19555s), paint3);
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f19555s), AndroidUtilities.dp(this.f19555s), this.D);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f19555s), AndroidUtilities.dp(this.f19555s), this.E);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f19555s), AndroidUtilities.dp(this.f19555s), this.B);
        }
        a(canvas);
        if (!this.I) {
            b(canvas, false);
        }
        if (this.f19548a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.f19548a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f19555s), AndroidUtilities.dp(this.f19555s), paint);
        a(canvas);
        if (!this.I) {
            b(canvas, true);
        }
        if (this.f19548a < 1.0f) {
            canvas.restore();
        }
        if (this.I) {
            b(canvas, false);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int v02;
        int i14;
        Bitmap bitmap;
        int i15;
        super.onLayout(z4, i10, i11, i12, i13);
        int[] iArr = this.f19554r;
        getLocationOnScreen(iArr);
        Matrix matrix = this.f19553n;
        if (matrix != null) {
            matrix.reset();
            this.f19553n.postScale(8.0f, 8.0f);
            this.f19553n.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.h;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f19553n);
                invalidate();
            }
        }
        boolean z10 = this.K;
        f6 f6Var = this.f19557x;
        if (z10) {
            Drawable r02 = j6.r0();
            if (r02 instanceof ColorDrawable) {
                v02 = ((ColorDrawable) r02).getColor();
            } else {
                Pair pair = null;
                if (r02 instanceof ec0) {
                    bitmap = ((ec0) r02).f24580k;
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
                    if (this.L == null && this.M == v02 && this.N == i14) {
                        return;
                    }
                    this.M = v02;
                    this.N = i14;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.L = linearGradient;
                    this.F.setShader(linearGradient);
                }
                v02 = j6.l1(0.25f, j6.v0(j6.f19881d6, f6Var));
            }
        } else {
            v02 = j6.v0(j6.f19881d6, f6Var);
            if (!j6.I.q()) {
                v02 = j6.v(v02, j6.l1(0.18f, -16777216));
            }
        }
        i14 = v02;
        if (this.L == null) {
        }
        this.M = v02;
        this.N = i14;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.L = linearGradient2;
        this.F.setShader(linearGradient2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        if (this.v) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i10), 1073741824);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
        if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f19556w && this.f19552f == null && !this.R && z4) {
            this.S.run();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f19549a0 = true;
            this.U = x10;
            this.V = this.f19548a;
            this.W = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i10 = 0;
            if (action == 1) {
                this.f19549a0 = false;
                if (System.currentTimeMillis() - this.W < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x10 - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.J != null) {
                        while (true) {
                            float[] fArr = this.J;
                            if (i10 >= fArr.length) {
                                break;
                            } else if (Math.abs(paddingLeft - fArr[i10]) < 0.1f) {
                                paddingLeft = this.J[i10];
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    Utilities.Callback2 callback2 = this.f19550b;
                    if (callback2 != null) {
                        callback2.run(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x10 - this.U) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.V;
            if (this.J != null) {
                int i11 = 0;
                while (true) {
                    float[] fArr2 = this.J;
                    if (i11 >= fArr2.length) {
                        break;
                    } else if (Math.abs(max - fArr2[i11]) < 0.05f) {
                        max = this.J[i11];
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            boolean z4 = !this.f19549a0;
            c(max, false);
            Utilities.Callback2 callback22 = this.f19550b;
            if (callback22 != null) {
                callback22.run(Float.valueOf(this.f19548a), Boolean.valueOf(z4));
            }
        }
        return true;
    }

    @Override
    public void setBackgroundColor(int i10) {
        boolean z4;
        int i11;
        Paint paint = this.B;
        paint.setColor(i10);
        if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.I = z4;
        int i12 = -16777216;
        if (z4) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        this.f19551c.r(i11);
        if (this.I) {
            i12 = -1;
        }
        this.d.r(i12);
    }

    public void setDrawBlur(boolean z4) {
        this.f19556w = z4;
        invalidate();
    }

    public void setDrawShadow(boolean z4) {
        int i10;
        this.v = z4;
        if (z4) {
            i10 = AndroidUtilities.dp(8.0f);
        } else {
            i10 = 0;
        }
        setPadding(i10, i10, i10, i10);
        invalidate();
    }

    public void setOnValueChange(Utilities.Callback2<Float, Boolean> callback2) {
        this.f19550b = callback2;
    }

    public void setRoundRadiusDp(float f10) {
        this.f19555s = f10;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.J = fArr;
    }

    public void setTextColor(int i10) {
        this.f19551c.r(i10);
        this.d.r(i10);
    }
}
