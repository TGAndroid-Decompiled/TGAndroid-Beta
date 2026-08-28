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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.vc;
public abstract class d1 extends FrameLayout {
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
    public float f22818a;
    public Utilities.Callback2 f22819b;
    public final z0 f22820c;
    public final z0 d;
    public final org.telegram.ui.Components.y5 f22821e;
    public Bitmap f22822f;
    public BitmapShader h;
    public Matrix f22823n;
    public final int[] f22824r;
    public float f22825s;
    public boolean v;
    public boolean f22826w;
    public final b6 f22827x;
    public final Paint f22828y;

    public d1(Context context, b6 b6Var) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        this.f22818a = 0.5f;
        gr grVar = gr.h;
        this.f22821e = new org.telegram.ui.Components.y5(1.0f, this, 0L, 320L, grVar);
        this.f22824r = new int[2];
        this.f22825s = 0.0f;
        Paint paint = new Paint(1);
        this.f22828y = paint;
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
        this.f22827x = b6Var;
        setWillNotDraw(false);
        z0 z0Var = new z0(this, 0);
        this.f22820c = z0Var;
        z0Var.setCallback(this);
        z0Var.u(AndroidUtilities.bold());
        z0Var.k(0.3f, 165L, grVar);
        z0Var.t(AndroidUtilities.dpf2(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = z0Var.f29332a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        z0Var.f29333b = i9;
        z0 z0Var2 = new z0(this, 1);
        this.d = z0Var2;
        z0Var2.setCallback(this);
        z0Var2.u(AndroidUtilities.bold());
        z0Var2.k(0.3f, 165L, grVar);
        z0Var2.t(AndroidUtilities.dpf2(14.0f));
        TextPaint textPaint2 = z0Var2.f29332a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        z0Var2.f29333b = i10;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dpf2(1.33f), 0.0f, AndroidUtilities.dpf2(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.4f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint2.setColor(f6.v0(f6.G8, b6Var));
        boolean z10 = AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f;
        this.H = z10;
        if (z10) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        z0Var.r(i11);
        if (this.H) {
            i12 = -1;
        } else {
            i12 = -16777216;
        }
        z0Var2.r(i12);
        paint4.setColor(f6.l1(0.025f, -16777216));
        paint3.setColor(f6.l1(0.35f, -1));
        paint6.setColor(f6.l1(0.2f, -1));
    }

    public final void a(Canvas canvas) {
        if (this.I != null) {
            int i9 = 0;
            while (true) {
                float[] fArr = this.I;
                if (i9 < fArr.length) {
                    float f10 = fArr[i9];
                    RectF rectF = AndroidUtilities.rectTmp;
                    canvas.drawRect((rectF.width() * f10) + rectF.left, rectF.top, (rectF.width() * f10) + rectF.left + AndroidUtilities.dp(0.66f), rectF.bottom, this.G);
                    i9++;
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
            porterDuffColorFilter = this.S;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.S = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        z0 z0Var = this.f22820c;
        z0Var.setColorFilter(porterDuffColorFilter);
        z0Var.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        z0Var.draw(canvas);
        if (z10 && (porterDuffColorFilter2 = this.S) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.S = porterDuffColorFilter2;
        }
        z0 z0Var2 = this.d;
        z0Var2.setColorFilter(porterDuffColorFilter2);
        z0Var2.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        z0Var2.draw(canvas);
    }

    public final void c(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.P;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P = null;
        }
        float a2 = g7.n.a(f10, 0.0f, 1.0f);
        if (!z10) {
            this.f22818a = a2;
            invalidate();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22818a, a2);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new x0(this, 0));
            this.P.addListener(new a1(this, a2, 0));
            this.P.setInterpolator(gr.h);
            this.P.setDuration(220L);
            this.P.start();
        }
        c1 c1Var = (c1) this;
        String str2 = c1Var.f22760b0;
        if (str2 == null) {
            str2 = vc.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            z0 z0Var = this.f22820c;
            if (!TextUtils.equals(z0Var.f29337g, str2)) {
                z0Var.b();
                z0Var.q(str2, true, true);
            }
        }
        if (c1Var.f22760b0 != null) {
            str = vc.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str != null) {
            z0 z0Var2 = this.d;
            if (!TextUtils.equals(z0Var2.f29337g, str)) {
                z0Var2.b();
                z0Var2.q(str, true, true);
            }
        }
        int i9 = f6.sj;
        b6 b6Var = c1Var.f22827x;
        this.F.setColor(i0.a.d(g7.n.a((((a2 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), f6.v0(i9, b6Var), f6.v0(f6.tj, b6Var)));
    }

    public float getValue() {
        return this.f22818a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.v) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22825s), AndroidUtilities.dp(this.f22825s), this.f22828y);
        }
        boolean z10 = this.f22826w;
        Paint paint = this.F;
        if (z10) {
            if (this.f22822f != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float d = this.f22821e.d(f10, false);
            if (d < 1.0f) {
                if (this.N == null || this.O != ((int) rectF.width())) {
                    Matrix matrix = this.N;
                    if (matrix == null) {
                        this.N = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.N;
                    int width = (int) rectF.width();
                    this.O = width;
                    matrix2.postScale(width, 1.0f);
                    this.K.setLocalMatrix(this.N);
                }
                Paint paint2 = this.E;
                paint2.setAlpha((int) ((1.0f - d) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22825s), AndroidUtilities.dp(this.f22825s), paint2);
            }
            if (this.f22822f != null && this.f22818a < 1.0f && d > 0.0f) {
                Paint paint3 = this.B;
                paint3.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22825s), AndroidUtilities.dp(this.f22825s), paint3);
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22825s), AndroidUtilities.dp(this.f22825s), this.C);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22825s), AndroidUtilities.dp(this.f22825s), this.D);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22825s), AndroidUtilities.dp(this.f22825s), this.A);
        }
        a(canvas);
        if (!this.H) {
            b(canvas, false);
        }
        if (this.f22818a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.f22818a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.f22825s), AndroidUtilities.dp(this.f22825s), paint);
        a(canvas);
        if (!this.H) {
            b(canvas, true);
        }
        if (this.f22818a < 1.0f) {
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int v02;
        int i13;
        Bitmap bitmap;
        int i14;
        super.onLayout(z10, i9, i10, i11, i12);
        int[] iArr = this.f22824r;
        getLocationOnScreen(iArr);
        Matrix matrix = this.f22823n;
        if (matrix != null) {
            matrix.reset();
            this.f22823n.postScale(8.0f, 8.0f);
            this.f22823n.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.h;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f22823n);
                invalidate();
            }
        }
        boolean z11 = this.J;
        b6 b6Var = this.f22827x;
        if (z11) {
            Drawable r02 = f6.r0();
            if (r02 instanceof ColorDrawable) {
                v02 = ((ColorDrawable) r02).getColor();
            } else {
                Pair pair = null;
                if (r02 instanceof jb0) {
                    bitmap = ((jb0) r02).f29698k;
                } else if (r02 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) r02).getBitmap();
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int width = (int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth());
                    int measuredWidth = (int) (((getMeasuredWidth() + i14) / AndroidUtilities.displaySize.x) * bitmap.getWidth());
                    int currentActionBarHeight = (int) ((((iArr[1] - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight()) / AndroidUtilities.displaySize.y) * bitmap.getHeight());
                    if (width >= 0 && width < bitmap.getWidth() && measuredWidth >= 0 && measuredWidth < bitmap.getWidth() && currentActionBarHeight >= 0 && currentActionBarHeight < bitmap.getHeight()) {
                        pair = new Pair(Integer.valueOf(bitmap.getPixel(width, currentActionBarHeight)), Integer.valueOf(bitmap.getPixel(measuredWidth, currentActionBarHeight)));
                    }
                }
                if (pair != null) {
                    v02 = ((Integer) pair.first).intValue();
                    i13 = ((Integer) pair.second).intValue();
                    if (this.K == null && this.L == v02 && this.M == i13) {
                        return;
                    }
                    this.L = v02;
                    this.M = i13;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v02, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.K = linearGradient;
                    this.E.setShader(linearGradient);
                }
                v02 = f6.l1(0.25f, f6.v0(f6.f23001d6, b6Var));
            }
        } else {
            v02 = f6.v0(f6.f23001d6, b6Var);
            if (!f6.I.q()) {
                v02 = f6.v(v02, f6.l1(0.18f, -16777216));
            }
        }
        i13 = v02;
        if (this.K == null) {
        }
        this.L = v02;
        this.M = i13;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v02, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.K = linearGradient2;
        this.E.setShader(linearGradient2);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        if (this.v) {
            i9 = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i9), 1073741824);
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
        if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f22826w && this.f22822f == null && !this.Q && z10) {
            this.R.run();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.W = true;
            this.T = x10;
            this.U = this.f22818a;
            this.V = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i9 = 0;
            if (action == 1) {
                this.W = false;
                if (System.currentTimeMillis() - this.V < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x10 - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.I != null) {
                        while (true) {
                            float[] fArr = this.I;
                            if (i9 >= fArr.length) {
                                break;
                            } else if (Math.abs(paddingLeft - fArr[i9]) < 0.1f) {
                                paddingLeft = this.I[i9];
                                break;
                            } else {
                                i9++;
                            }
                        }
                    }
                    Utilities.Callback2 callback2 = this.f22819b;
                    if (callback2 != null) {
                        callback2.run(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x10 - this.T) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.U;
            if (this.I != null) {
                int i10 = 0;
                while (true) {
                    float[] fArr2 = this.I;
                    if (i10 >= fArr2.length) {
                        break;
                    } else if (Math.abs(max - fArr2[i10]) < 0.05f) {
                        max = this.I[i10];
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            boolean z10 = !this.W;
            c(max, false);
            Utilities.Callback2 callback22 = this.f22819b;
            if (callback22 != null) {
                callback22.run(Float.valueOf(this.f22818a), Boolean.valueOf(z10));
            }
        }
        return true;
    }

    @Override
    public void setBackgroundColor(int i9) {
        boolean z10;
        int i10;
        Paint paint = this.A;
        paint.setColor(i9);
        if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        int i11 = -16777216;
        if (z10) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        this.f22820c.r(i10);
        if (this.H) {
            i11 = -1;
        }
        this.d.r(i11);
    }

    public void setDrawBlur(boolean z10) {
        this.f22826w = z10;
        invalidate();
    }

    public void setDrawShadow(boolean z10) {
        int i9;
        this.v = z10;
        if (z10) {
            i9 = AndroidUtilities.dp(8.0f);
        } else {
            i9 = 0;
        }
        setPadding(i9, i9, i9, i9);
        invalidate();
    }

    public void setOnValueChange(Utilities.Callback2<Float, Boolean> callback2) {
        this.f22819b = callback2;
    }

    public void setRoundRadiusDp(float f10) {
        this.f22825s = f10;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.I = fArr;
    }

    public void setTextColor(int i9) {
        this.f22820c.r(i9);
        this.d.r(i9);
    }
}
