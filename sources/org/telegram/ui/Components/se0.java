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
public final class se0 extends View {
    public float E;
    public ValueAnimator F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public int K;
    public int L;
    public final org.telegram.ui.ActionBar.h6 M;
    public boolean N;
    public int f39561a;
    public int f39562b;
    public int f39563c;
    public float d;
    public int f39564e;
    public int f39565f;
    public boolean h;
    public boolean f39566n;
    public float f39567r;
    public float f39568s;
    public int f39569w;
    public int f39570x;
    public final RectF f39571y;

    public se0(Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.f39561a = -1;
        this.f39562b = 0;
        this.f39571y = new RectF();
        Paint paint = new Paint(1);
        this.I = paint;
        Paint paint2 = new Paint(1);
        this.J = paint2;
        this.K = -1;
        this.M = h6Var;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.G = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.H = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        d();
    }

    public final void a() {
        int i7;
        boolean z10;
        if (this.f39566n) {
            i7 = Math.max(this.f39564e, this.f39565f);
        } else {
            i7 = this.f39562b;
        }
        int i10 = 0;
        if (i7 > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 2;
        }
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
        this.N = z10;
    }

    public final void b(int i7) {
        if (this.f39566n) {
            this.K = i7;
            return;
        }
        if (this.h) {
            if (this.f39563c != i7) {
                ValueAnimator valueAnimator = this.F;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f10 = this.d;
                float f11 = this.E;
                this.d = (this.f39563c * f11) + ((1.0f - f11) * f10);
            } else {
                return;
            }
        } else {
            this.d = this.f39561a;
        }
        if (i7 != this.f39561a) {
            this.f39563c = i7;
            this.h = true;
            this.E = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new qe0(this, 1));
            this.F.addListener(new re0(this, 0));
            this.F.setInterpolator(nr.f37960f);
            this.F.setDuration(220L);
            this.F.start();
        }
    }

    public final void c(int i7, int i10, boolean z10) {
        int L;
        int i11;
        int i12;
        int i13 = this.f39561a;
        if (i13 < 0 || i10 == 0 || this.f39562b == 0) {
            z10 = false;
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f39561a = i7;
            this.f39562b = i10;
            invalidate();
        } else if (this.f39562b == i10 && (Math.abs(i13 - i7) <= 2 || this.h || this.f39566n)) {
            b(i7);
        } else {
            ValueAnimator valueAnimator2 = this.F;
            if (valueAnimator2 != null) {
                this.K = 0;
                valueAnimator2.cancel();
            }
            int L2 = org.telegram.messenger.g0.L(8.0f) * 2;
            this.f39569w = (getMeasuredHeight() - L2) / Math.min(this.f39562b, 3);
            this.f39570x = (getMeasuredHeight() - L2) / Math.min(i10, 3);
            float f10 = (this.f39561a - 1) * this.f39569w;
            this.f39567r = f10;
            if (f10 < 0.0f) {
                this.f39567r = 0.0f;
            } else {
                int i14 = this.f39569w;
                if (com.google.android.gms.internal.vision.e2.v(this.f39562b, 1, i11, L) - f10 < (getMeasuredHeight() - L) - i14) {
                    this.f39567r = com.google.android.gms.internal.vision.e2.v(this.f39562b, 1, i14, L) - ((getMeasuredHeight() - L) - this.f39569w);
                }
            }
            float f11 = (i7 - 1) * this.f39570x;
            this.f39568s = f11;
            if (f11 < 0.0f) {
                this.f39568s = 0.0f;
            } else {
                int i15 = i10 - 1;
                int i16 = this.f39570x;
                if (((i12 * i15) + L) - f11 < (getMeasuredHeight() - L) - i16) {
                    this.f39568s = ((i15 * i16) + L) - ((getMeasuredHeight() - L) - this.f39570x);
                }
            }
            this.d = this.f39561a;
            this.f39563c = i7;
            this.f39561a = i7;
            this.f39564e = this.f39562b;
            this.f39565f = i10;
            this.f39562b = i10;
            this.f39566n = true;
            this.h = true;
            this.E = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new qe0(this, 0));
            this.F.addListener(new re0(this, 1));
            this.F.setInterpolator(nr.f37960f);
            this.F.setDuration(220L);
            this.F.start();
        }
        a();
    }

    public final void d() {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ve, this.M);
        this.L = w02;
        this.I.setColor(i0.a.o(w02, (int) ((Color.alpha(w02) / 255.0f) * 112.0f)));
        this.J.setColor(this.L);
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
        if (this.f39561a >= 0 && this.f39562b != 0) {
            int L = org.telegram.messenger.g0.L(8.0f);
            float f12 = 1.0f;
            if (this.f39566n) {
                float f13 = this.E;
                measuredHeight = (this.f39570x * f13) + ((1.0f - f13) * this.f39569w);
            } else if (this.f39562b != 0) {
                measuredHeight = (getMeasuredHeight() - (L * 2)) / Math.min(this.f39562b, 3);
            } else {
                return;
            }
            if (measuredHeight != 0.0f) {
                float N = org.telegram.messenger.g0.N(0.7f);
                if (this.f39566n) {
                    float f14 = this.f39567r;
                    float f15 = this.E;
                    f10 = (this.f39568s * f15) + ((1.0f - f15) * f14);
                } else {
                    if (this.h) {
                        float f16 = this.E;
                        f10 = ((this.f39563c - 1) * measuredHeight * f16) + ((1.0f - f16) * (this.d - 1.0f) * measuredHeight);
                    } else {
                        f10 = (this.f39561a - 1) * measuredHeight;
                    }
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    } else {
                        float f17 = L;
                        if ((((this.f39562b - 1) * measuredHeight) + f17) - f10 < (getMeasuredHeight() - L) - measuredHeight) {
                            f10 = (((this.f39562b - 1) * measuredHeight) + f17) - ((getMeasuredHeight() - L) - measuredHeight);
                        }
                    }
                }
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float f18 = L;
                int max = Math.max(0, (int) (((f18 + f10) / measuredHeight) - 1.0f));
                int i14 = max + 6;
                if (this.f39566n) {
                    i7 = Math.max(this.f39564e, this.f39565f);
                } else {
                    i7 = this.f39562b;
                }
                int min = Math.min(i14, i7);
                while (true) {
                    rectF = this.f39571y;
                    if (max >= min) {
                        break;
                    }
                    float f19 = ((max * measuredHeight) + f18) - f10;
                    float f20 = f19 + measuredHeight;
                    if (f20 < 0.0f || f19 > getMeasuredHeight()) {
                        f11 = f12;
                    } else {
                        rectF.set(0.0f, f19 + N, getMeasuredWidth(), f20 - N);
                        boolean z10 = this.f39566n;
                        Paint paint = this.I;
                        f11 = f12;
                        if (z10 && max >= this.f39565f) {
                            paint.setColor(i0.a.o(this.L, (int) ((f11 - this.E) * (Color.alpha(i12) / 255.0f) * 76.0f)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.o(this.L, (int) ((Color.alpha(i13) / 255.0f) * 76.0f)));
                        } else if (z10 && max >= this.f39564e) {
                            paint.setColor(i0.a.o(this.L, (int) ((Color.alpha(i10) / 255.0f) * 76.0f * this.E)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.o(this.L, (int) ((Color.alpha(i11) / 255.0f) * 76.0f)));
                        } else {
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                        }
                    }
                    max++;
                    f12 = f11;
                }
                float f21 = f12;
                boolean z11 = this.h;
                Paint paint2 = this.J;
                if (z11) {
                    float f22 = this.d;
                    float f23 = this.E;
                    float f24 = ((((this.f39563c * f23) + ((f21 - f23) * f22)) * measuredHeight) + f18) - f10;
                    rectF.set(0.0f, f24 + N, getMeasuredWidth(), (f24 + measuredHeight) - N);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                } else {
                    float f25 = ((this.f39561a * measuredHeight) + f18) - f10;
                    rectF.set(0.0f, f25 + N, getMeasuredWidth(), (f25 + measuredHeight) - N);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                }
                if (this.N) {
                    Paint paint3 = this.G;
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f), paint3);
                    canvas.drawRect(0.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
                    canvas.translate(0.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f), this.H);
                }
            }
        }
    }
}
