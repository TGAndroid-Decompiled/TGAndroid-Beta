package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class de0 extends View {
    public float D;
    public ValueAnimator E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.f6 L;
    public boolean M;
    public int f32864a;
    public int f32865b;
    public int f32866c;
    public float d;
    public int f32867e;
    public int f32868f;
    public boolean h;
    public boolean f32869n;
    public float f32870r;
    public float f32871s;
    public int f32872w;
    public int f32873x;
    public final RectF f32874y;

    public de0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f32864a = -1;
        this.f32865b = 0;
        this.f32874y = new RectF();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.J = -1;
        this.L = f6Var;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.F = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.G = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        d();
    }

    public final void a() {
        int i7;
        boolean z9;
        if (this.f32869n) {
            i7 = Math.max(this.f32867e, this.f32868f);
        } else {
            i7 = this.f32865b;
        }
        int i10 = 0;
        if (i7 > 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i10 = 2;
        }
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
        this.M = z9;
    }

    public final void b(int i7) {
        if (this.f32869n) {
            this.J = i7;
            return;
        }
        if (this.h) {
            if (this.f32866c != i7) {
                ValueAnimator valueAnimator = this.E;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f10 = this.d;
                float f11 = this.D;
                this.d = (this.f32866c * f11) + ((1.0f - f11) * f10);
            } else {
                return;
            }
        } else {
            this.d = this.f32864a;
        }
        if (i7 != this.f32864a) {
            this.f32866c = i7;
            this.h = true;
            this.D = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new be0(this, 1));
            this.E.addListener(new ce0(this, 0));
            this.E.setInterpolator(xq.f40345f);
            this.E.setDuration(220L);
            this.E.start();
        }
    }

    public final void c(int i7, int i10, boolean z9) {
        int L;
        int i11;
        int i12;
        int i13 = this.f32864a;
        if (i13 < 0 || i10 == 0 || this.f32865b == 0) {
            z9 = false;
        }
        if (!z9) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32864a = i7;
            this.f32865b = i10;
            invalidate();
        } else if (this.f32865b == i10 && (Math.abs(i13 - i7) <= 2 || this.h || this.f32869n)) {
            b(i7);
        } else {
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                this.J = 0;
                valueAnimator2.cancel();
            }
            int L2 = org.telegram.messenger.g0.L(8.0f) * 2;
            this.f32872w = (getMeasuredHeight() - L2) / Math.min(this.f32865b, 3);
            this.f32873x = (getMeasuredHeight() - L2) / Math.min(i10, 3);
            float f10 = (this.f32864a - 1) * this.f32872w;
            this.f32870r = f10;
            if (f10 < 0.0f) {
                this.f32870r = 0.0f;
            } else {
                int i14 = this.f32872w;
                if (com.google.android.recaptcha.internal.a.e(this.f32865b, 1, i11, L) - f10 < (getMeasuredHeight() - L) - i14) {
                    this.f32870r = com.google.android.recaptcha.internal.a.e(this.f32865b, 1, i14, L) - ((getMeasuredHeight() - L) - this.f32872w);
                }
            }
            float f11 = (i7 - 1) * this.f32873x;
            this.f32871s = f11;
            if (f11 < 0.0f) {
                this.f32871s = 0.0f;
            } else {
                int i15 = i10 - 1;
                int i16 = this.f32873x;
                if (((i12 * i15) + L) - f11 < (getMeasuredHeight() - L) - i16) {
                    this.f32871s = ((i15 * i16) + L) - ((getMeasuredHeight() - L) - this.f32873x);
                }
            }
            this.d = this.f32864a;
            this.f32866c = i7;
            this.f32864a = i7;
            this.f32867e = this.f32865b;
            this.f32868f = i10;
            this.f32865b = i10;
            this.f32869n = true;
            this.h = true;
            this.D = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new be0(this, 0));
            this.E.addListener(new ce0(this, 1));
            this.E.setInterpolator(xq.f40345f);
            this.E.setDuration(220L);
            this.E.start();
        }
        a();
    }

    public final void d() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Se, this.L);
        this.K = w02;
        this.H.setColor(i0.a.o(w02, (int) ((Color.alpha(w02) / 255.0f) * 112.0f)));
        this.I.setColor(this.K);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f10;
        int i7;
        RectF rectF;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        super.onDraw(canvas);
        if (this.f32864a >= 0 && this.f32865b != 0) {
            int L = org.telegram.messenger.g0.L(8.0f);
            float f12 = 1.0f;
            if (this.f32869n) {
                float f13 = this.D;
                measuredHeight = (this.f32873x * f13) + ((1.0f - f13) * this.f32872w);
            } else if (this.f32865b != 0) {
                measuredHeight = (getMeasuredHeight() - (L * 2)) / Math.min(this.f32865b, 3);
            } else {
                return;
            }
            if (measuredHeight != 0.0f) {
                float N = org.telegram.messenger.g0.N(0.7f);
                if (this.f32869n) {
                    float f14 = this.f32870r;
                    float f15 = this.D;
                    f10 = (this.f32871s * f15) + ((1.0f - f15) * f14);
                } else {
                    if (this.h) {
                        float f16 = this.D;
                        f10 = ((this.f32866c - 1) * measuredHeight * f16) + ((1.0f - f16) * (this.d - 1.0f) * measuredHeight);
                    } else {
                        f10 = (this.f32864a - 1) * measuredHeight;
                    }
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    } else {
                        float f17 = L;
                        if ((((this.f32865b - 1) * measuredHeight) + f17) - f10 < (getMeasuredHeight() - L) - measuredHeight) {
                            f10 = (((this.f32865b - 1) * measuredHeight) + f17) - ((getMeasuredHeight() - L) - measuredHeight);
                        }
                    }
                }
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float f18 = L;
                int max = Math.max(0, (int) (((f18 + f10) / measuredHeight) - 1.0f));
                int i14 = max + 6;
                if (this.f32869n) {
                    i7 = Math.max(this.f32867e, this.f32868f);
                } else {
                    i7 = this.f32865b;
                }
                int min = Math.min(i14, i7);
                while (true) {
                    rectF = this.f32874y;
                    if (max >= min) {
                        break;
                    }
                    float f19 = ((max * measuredHeight) + f18) - f10;
                    float f20 = f19 + measuredHeight;
                    if (f20 < 0.0f || f19 > getMeasuredHeight()) {
                        f11 = f12;
                    } else {
                        rectF.set(0.0f, f19 + N, getMeasuredWidth(), f20 - N);
                        boolean z9 = this.f32869n;
                        Paint paint = this.H;
                        f11 = f12;
                        if (z9 && max >= this.f32868f) {
                            paint.setColor(i0.a.o(this.K, (int) ((f11 - this.D) * (Color.alpha(i12) / 255.0f) * 76.0f)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.o(this.K, (int) ((Color.alpha(i13) / 255.0f) * 76.0f)));
                        } else if (z9 && max >= this.f32867e) {
                            paint.setColor(i0.a.o(this.K, (int) ((Color.alpha(i10) / 255.0f) * 76.0f * this.D)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.o(this.K, (int) ((Color.alpha(i11) / 255.0f) * 76.0f)));
                        } else {
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                        }
                    }
                    max++;
                    f12 = f11;
                }
                float f21 = f12;
                boolean z10 = this.h;
                Paint paint2 = this.I;
                if (z10) {
                    float f22 = this.d;
                    float f23 = this.D;
                    float f24 = ((((this.f32866c * f23) + ((f21 - f23) * f22)) * measuredHeight) + f18) - f10;
                    rectF.set(0.0f, f24 + N, getMeasuredWidth(), (f24 + measuredHeight) - N);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                } else {
                    float f25 = ((this.f32864a * measuredHeight) + f18) - f10;
                    rectF.set(0.0f, f25 + N, getMeasuredWidth(), (f25 + measuredHeight) - N);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                }
                if (this.M) {
                    Paint paint3 = this.F;
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f), paint3);
                    canvas.drawRect(0.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
                    canvas.translate(0.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f), this.G);
                }
            }
        }
    }
}
