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
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.j20;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jb0;
public abstract class y0 extends FrameLayout implements k6 {
    public final Paint D;
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
    public float f21537a;
    public final lg.s f21538a0;
    public j20 f21539b;
    public PorterDuffColorFilter f21540b0;
    public final u0 f21541c;
    public float f21542c0;
    public final u0 d;
    public float f21543d0;
    public final org.telegram.ui.Components.t5 e;
    public long f21544e0;
    public Bitmap f21545f;
    public boolean f21546f0;
    public BitmapShader h;
    public Matrix f21547n;
    public final int[] f21548r;
    public float f21549s;
    public boolean f21550w;
    public boolean f21551x;
    public final p6 f21552y;

    public y0(Context context, p6 p6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f21537a = 0.5f;
        gr grVar = gr.h;
        this.e = new org.telegram.ui.Components.t5(1.0f, this, 0L, 320L, grVar);
        this.f21548r = new int[2];
        this.f21549s = 0.0f;
        Paint paint = new Paint(1);
        this.D = paint;
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
        this.f21538a0 = new lg.s(this, 17);
        this.f21552y = p6Var;
        setWillNotDraw(false);
        u0 u0Var = new u0(this, 0);
        this.f21541c = u0Var;
        u0Var.setCallback(this);
        u0Var.x(org.telegram.messenger.i0.o());
        u0Var.n(0.3f, 165L, grVar);
        u0Var.w(org.telegram.messenger.i0.N(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = u0Var.f25693a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.i0.N(0.3f));
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        u0Var.f25695b = i10;
        u0 u0Var2 = new u0(this, 1);
        this.d = u0Var2;
        u0Var2.setCallback(this);
        u0Var2.x(org.telegram.messenger.i0.o());
        u0Var2.n(0.3f, 165L, grVar);
        u0Var2.w(org.telegram.messenger.i0.N(14.0f));
        TextPaint textPaint2 = u0Var2.f25693a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(org.telegram.messenger.i0.N(0.3f));
        if (cd.X) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        u0Var2.f25695b = i11;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.i0.N(1.33f), 0.0f, org.telegram.messenger.i0.N(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.i0.i(colorMatrix, -0.4f);
        org.telegram.messenger.i0.h(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        int w02 = t6.w0(t6.G8, p6Var);
        this.U = w02;
        paint2.setColor(w02);
        boolean z10 = org.telegram.messenger.i0.B(paint2.getColor()) <= 0.721f;
        this.L = z10;
        if (z10) {
            i12 = -1;
        } else {
            i12 = -16777216;
        }
        u0Var.u(i12);
        if (this.L) {
            i13 = -1;
        } else {
            i13 = -16777216;
        }
        u0Var2.u(i13);
        paint4.setColor(t6.r1(0.025f, -16777216));
        paint3.setColor(t6.r1(0.35f, -1));
        paint6.setColor(t6.r1(0.2f, -1));
    }

    public final void a(Canvas canvas) {
        if (this.M != null) {
            int i10 = 0;
            while (true) {
                float[] fArr = this.M;
                if (i10 < fArr.length) {
                    float f7 = fArr[i10];
                    RectF rectF = org.telegram.messenger.i0.P;
                    canvas.drawRect((rectF.width() * f7) + rectF.left, rectF.top, (rectF.width() * f7) + rectF.left + org.telegram.messenger.i0.L(0.66f), rectF.bottom, this.K);
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
            porterDuffColorFilter = this.f21540b0;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.f21540b0 = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        u0 u0Var = this.f21541c;
        u0Var.setColorFilter(porterDuffColorFilter);
        u0Var.setBounds(org.telegram.messenger.i0.L(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() / 2);
        u0Var.draw(canvas);
        if (z10 && (porterDuffColorFilter2 = this.f21540b0) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.f21540b0 = porterDuffColorFilter2;
        }
        u0 u0Var2 = this.d;
        u0Var2.setColorFilter(porterDuffColorFilter2);
        u0Var2.setBounds(org.telegram.messenger.i0.L(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() / 2);
        u0Var2.draw(canvas);
    }

    public abstract int c(float f7);

    public final void d(boolean z10, float f7) {
        ValueAnimator valueAnimator = this.T;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        float a2 = w7.u.a(f7, 0.0f, 1.0f);
        if (!z10) {
            this.f21537a = a2;
            invalidate();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21537a, a2);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new bg.k(this, 14));
            this.T.addListener(new v0(this, a2, 0));
            this.T.setInterpolator(gr.h);
            this.T.setDuration(220L);
            this.T.start();
        }
        x0 x0Var = (x0) this;
        String str2 = x0Var.f21467h0;
        if (str2 == null) {
            str2 = jh.g.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            u0 u0Var = this.f21541c;
            if (!TextUtils.equals(u0Var.f25700i, str2)) {
                u0Var.a();
                u0Var.t(str2, true, true);
            }
        }
        if (x0Var.f21467h0 != null) {
            str = jh.g.a((2.8f * a2) + 0.2f) + "x";
        }
        if (str != null) {
            u0 u0Var2 = this.d;
            if (!TextUtils.equals(u0Var2.f25700i, str)) {
                u0Var2.a();
                u0Var2.t(str, true, true);
            }
        }
        this.J.setColor(c(a2));
    }

    public float getValue() {
        return this.f21537a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.f21550w) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(this.f21549s), org.telegram.messenger.i0.L(this.f21549s), this.D);
        }
        boolean z10 = this.f21551x;
        Paint paint = this.J;
        if (z10) {
            if (this.f21545f != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float e = this.e.e(false, f7);
            if (e < 1.0f) {
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
                paint2.setAlpha((int) ((1.0f - e) * 255.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(this.f21549s), org.telegram.messenger.i0.L(this.f21549s), paint2);
            }
            if (this.f21545f != null && this.f21537a < 1.0f && e > 0.0f) {
                Paint paint3 = this.F;
                paint3.setAlpha((int) (e * 255.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(this.f21549s), org.telegram.messenger.i0.L(this.f21549s), paint3);
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(this.f21549s), org.telegram.messenger.i0.L(this.f21549s), this.G);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(this.f21549s), org.telegram.messenger.i0.L(this.f21549s), this.H);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(this.f21549s), org.telegram.messenger.i0.L(this.f21549s), this.E);
        }
        a(canvas);
        if (!this.L) {
            b(canvas, false);
        }
        if (this.f21537a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.f21537a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(this.f21549s), org.telegram.messenger.i0.L(this.f21549s), paint);
        a(canvas);
        if (!this.L) {
            b(canvas, true);
        }
        if (this.f21537a < 1.0f) {
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
        super.onLayout(z10, i10, i11, i12, i13);
        int[] iArr = this.f21548r;
        getLocationOnScreen(iArr);
        Matrix matrix = this.f21547n;
        if (matrix != null) {
            matrix.reset();
            this.f21547n.postScale(8.0f, 8.0f);
            this.f21547n.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.h;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f21547n);
                invalidate();
            }
        }
        boolean z11 = this.N;
        p6 p6Var = this.f21552y;
        if (z11) {
            Drawable s02 = t6.s0();
            if (s02 instanceof ColorDrawable) {
                w02 = ((ColorDrawable) s02).getColor();
            } else {
                Pair pair = null;
                if (s02 instanceof jb0) {
                    bitmap = ((jb0) s02).f27287k;
                } else if (s02 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) s02).getBitmap();
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int i15 = iArr[0];
                    Point point = org.telegram.messenger.i0.f16026q;
                    int width = (int) ((i15 / point.x) * bitmap.getWidth());
                    int measuredWidth = (int) (((getMeasuredWidth() + i15) / point.x) * bitmap.getWidth());
                    int currentActionBarHeight = (int) ((((iArr[1] - org.telegram.messenger.i0.f16020m) - l.getCurrentActionBarHeight()) / point.y) * bitmap.getHeight());
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
                w02 = t6.r1(0.25f, t6.w0(t6.f20929d6, p6Var));
            }
        } else {
            w02 = t6.w0(t6.f20929d6, p6Var);
            if (!t6.I.q()) {
                w02 = t6.w(w02, t6.r1(0.18f, -16777216));
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
        if (this.f21550w) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i10), 1073741824);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.i0.L(44.0f), 1073741824));
        if (tz.o() >= 2 && sc.e(256)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f21551x && this.f21545f == null && !this.W && z10) {
            this.f21538a0.run();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21546f0 = true;
            this.f21542c0 = x10;
            this.f21543d0 = this.f21537a;
            this.f21544e0 = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i10 = 0;
            if (action == 1) {
                this.f21546f0 = false;
                if (System.currentTimeMillis() - this.f21544e0 < ViewConfiguration.getTapTimeout()) {
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
                    j20 j20Var = this.f21539b;
                    if (j20Var != null) {
                        j20Var.a(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x10 - this.f21542c0) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.f21543d0;
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
            boolean z10 = !this.f21546f0;
            d(false, max);
            j20 j20Var2 = this.f21539b;
            if (j20Var2 != null) {
                j20Var2.a(Float.valueOf(this.f21537a), Boolean.valueOf(z10));
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
        if (org.telegram.messenger.i0.B(paint.getColor()) <= 0.721f) {
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
        this.f21541c.u(i11);
        if (this.L) {
            i12 = -1;
        }
        this.d.u(i12);
    }

    public void setDrawBlur(boolean z10) {
        this.f21551x = z10;
        invalidate();
    }

    public void setDrawShadow(boolean z10) {
        int i10;
        this.f21550w = z10;
        if (z10) {
            i10 = org.telegram.messenger.i0.L(8.0f);
        } else {
            i10 = 0;
        }
        setPadding(i10, i10, i10, i10);
        invalidate();
    }

    public void setOnValueChange(j20 j20Var) {
        this.f21539b = j20Var;
    }

    public void setRoundRadiusDp(float f7) {
        this.f21549s = f7;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.M = fArr;
    }

    public void setTextColor(int i10) {
        this.V = true;
        this.f21541c.u(i10);
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
                if (paint.getColor() == this.U && (w02 = t6.w0(t6.G8, this.f21552y)) != this.U) {
                    this.U = w02;
                    paint.setColor(w02);
                    if (org.telegram.messenger.i0.B(w02) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.L = z10;
                    if (!this.V) {
                        u0 u0Var = this.f21541c;
                        int i11 = -16777216;
                        if (u0Var != null) {
                            if (z10) {
                                i10 = -1;
                            } else {
                                i10 = -16777216;
                            }
                            u0Var.u(i10);
                        }
                        u0 u0Var2 = this.d;
                        if (u0Var2 != null) {
                            if (this.L) {
                                i11 = -1;
                            }
                            u0Var2.u(i11);
                        }
                    }
                }
            } catch (Exception e) {
                f8.g(e, true);
                return;
            }
        }
        Paint paint2 = this.J;
        if (paint2 != null) {
            paint2.setColor(c(this.f21537a));
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
