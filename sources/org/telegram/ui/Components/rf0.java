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
import org.telegram.messenger.AndroidUtilities;
public final class rf0 extends View {
    public ValueAnimator A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.c6 H;
    public boolean I;
    public int f32282a;
    public int f32283b;
    public int f32284c;
    public float d;
    public int f32285e;
    public int f32286f;
    public boolean h;
    public boolean f32287n;
    public float f32288r;
    public float f32289s;
    public int v;
    public int f32290w;
    public final RectF f32291x;
    public float f32292y;

    public rf0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f32282a = -1;
        this.f32283b = 0;
        this.f32291x = new RectF();
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = -1;
        this.H = c6Var;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.B = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.C = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        d();
    }

    public final void a() {
        int i10;
        boolean z10;
        if (this.f32287n) {
            i10 = Math.max(this.f32285e, this.f32286f);
        } else {
            i10 = this.f32283b;
        }
        int i11 = 0;
        if (i10 > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = 2;
        }
        if (getLayerType() != i11) {
            setLayerType(i11, null);
            invalidate();
        }
        this.I = z10;
    }

    public final void b(int i10) {
        if (this.f32287n) {
            this.F = i10;
            return;
        }
        if (this.h) {
            if (this.f32284c != i10) {
                ValueAnimator valueAnimator = this.A;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f9 = this.d;
                float f10 = this.f32292y;
                this.d = (this.f32284c * f10) + ((1.0f - f10) * f9);
            } else {
                return;
            }
        } else {
            this.d = this.f32282a;
        }
        if (i10 != this.f32282a) {
            this.f32284c = i10;
            this.h = true;
            this.f32292y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A = ofFloat;
            ofFloat.addUpdateListener(new pf0(this, 1));
            this.A.addListener(new qf0(this, 0));
            this.A.setInterpolator(jr.f29800f);
            this.A.setDuration(220L);
            this.A.start();
        }
    }

    public final void c(int i10, int i11, boolean z10) {
        int dp;
        int i12;
        int i13;
        int i14 = this.f32282a;
        if (!((i14 < 0 || i11 == 0 || this.f32283b == 0) ? false : false)) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32282a = i10;
            this.f32283b = i11;
            invalidate();
        } else if (this.f32283b == i11 && (Math.abs(i14 - i10) <= 2 || this.h || this.f32287n)) {
            b(i10);
        } else {
            ValueAnimator valueAnimator2 = this.A;
            if (valueAnimator2 != null) {
                this.F = 0;
                valueAnimator2.cancel();
            }
            int dp2 = AndroidUtilities.dp(8.0f) * 2;
            this.v = (getMeasuredHeight() - dp2) / Math.min(this.f32283b, 3);
            this.f32290w = (getMeasuredHeight() - dp2) / Math.min(i11, 3);
            float f9 = (this.f32282a - 1) * this.v;
            this.f32288r = f9;
            if (f9 < 0.0f) {
                this.f32288r = 0.0f;
            } else {
                int i15 = this.v;
                if (com.google.android.recaptcha.internal.a.f(this.f32283b, 1, i12, dp) - f9 < (getMeasuredHeight() - dp) - i15) {
                    this.f32288r = com.google.android.recaptcha.internal.a.f(this.f32283b, 1, i15, dp) - ((getMeasuredHeight() - dp) - this.v);
                }
            }
            float f10 = (i10 - 1) * this.f32290w;
            this.f32289s = f10;
            if (f10 < 0.0f) {
                this.f32289s = 0.0f;
            } else {
                int i16 = i11 - 1;
                int i17 = this.f32290w;
                if (((i13 * i16) + dp) - f10 < (getMeasuredHeight() - dp) - i17) {
                    this.f32289s = ((i16 * i17) + dp) - ((getMeasuredHeight() - dp) - this.f32290w);
                }
            }
            this.d = this.f32282a;
            this.f32284c = i10;
            this.f32282a = i10;
            this.f32285e = this.f32283b;
            this.f32286f = i11;
            this.f32283b = i11;
            this.f32287n = true;
            this.h = true;
            this.f32292y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A = ofFloat;
            ofFloat.addUpdateListener(new pf0(this, 0));
            this.A.addListener(new qf0(this, 1));
            this.A.setInterpolator(jr.f29800f);
            this.A.setDuration(220L);
            this.A.start();
        }
        a();
    }

    public final void d() {
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23088ee, this.H);
        this.G = v02;
        this.D.setColor(i0.a.k(v02, (int) ((Color.alpha(v02) / 255.0f) * 112.0f)));
        this.E.setColor(this.G);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f9;
        int i10;
        RectF rectF;
        int i11;
        int i12;
        int i13;
        int i14;
        super.onDraw(canvas);
        if (this.f32282a >= 0 && this.f32283b != 0) {
            int dp = AndroidUtilities.dp(8.0f);
            if (this.f32287n) {
                float f10 = this.f32292y;
                measuredHeight = (this.f32290w * f10) + ((1.0f - f10) * this.v);
            } else if (this.f32283b != 0) {
                measuredHeight = (getMeasuredHeight() - (dp * 2)) / Math.min(this.f32283b, 3);
            } else {
                return;
            }
            if (measuredHeight != 0.0f) {
                float dpf2 = AndroidUtilities.dpf2(0.7f);
                if (this.f32287n) {
                    float f11 = this.f32288r;
                    float f12 = this.f32292y;
                    f9 = (this.f32289s * f12) + ((1.0f - f12) * f11);
                } else {
                    if (this.h) {
                        float f13 = this.f32292y;
                        f9 = ((this.f32284c - 1) * measuredHeight * f13) + ((1.0f - f13) * (this.d - 1.0f) * measuredHeight);
                    } else {
                        f9 = (this.f32282a - 1) * measuredHeight;
                    }
                    if (f9 < 0.0f) {
                        f9 = 0.0f;
                    } else {
                        float f14 = dp;
                        if ((((this.f32283b - 1) * measuredHeight) + f14) - f9 < (getMeasuredHeight() - dp) - measuredHeight) {
                            f9 = (((this.f32283b - 1) * measuredHeight) + f14) - ((getMeasuredHeight() - dp) - measuredHeight);
                        }
                    }
                }
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float f15 = dp;
                int max = Math.max(0, (int) (((f15 + f9) / measuredHeight) - 1.0f));
                int i15 = max + 6;
                if (this.f32287n) {
                    i10 = Math.max(this.f32285e, this.f32286f);
                } else {
                    i10 = this.f32283b;
                }
                int min = Math.min(i15, i10);
                while (true) {
                    rectF = this.f32291x;
                    if (max >= min) {
                        break;
                    }
                    float f16 = ((max * measuredHeight) + f15) - f9;
                    float f17 = f16 + measuredHeight;
                    if (f17 >= 0.0f && f16 <= getMeasuredHeight()) {
                        rectF.set(0.0f, f16 + dpf2, getMeasuredWidth(), f17 - dpf2);
                        boolean z10 = this.f32287n;
                        Paint paint = this.D;
                        if (z10 && max >= this.f32286f) {
                            paint.setColor(i0.a.k(this.G, (int) ((1.0f - this.f32292y) * (Color.alpha(i13) / 255.0f) * 76.0f)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.k(this.G, (int) ((Color.alpha(i14) / 255.0f) * 76.0f)));
                        } else if (z10 && max >= this.f32285e) {
                            paint.setColor(i0.a.k(this.G, (int) ((Color.alpha(i11) / 255.0f) * 76.0f * this.f32292y)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.k(this.G, (int) ((Color.alpha(i12) / 255.0f) * 76.0f)));
                        } else {
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                        }
                    }
                    max++;
                }
                boolean z11 = this.h;
                Paint paint2 = this.E;
                if (z11) {
                    float f18 = this.d;
                    float f19 = this.f32292y;
                    float f20 = ((((this.f32284c * f19) + ((1.0f - f19) * f18)) * measuredHeight) + f15) - f9;
                    rectF.set(0.0f, f20 + dpf2, getMeasuredWidth(), (f20 + measuredHeight) - dpf2);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                } else {
                    float f21 = ((this.f32282a * measuredHeight) + f15) - f9;
                    rectF.set(0.0f, f21 + dpf2, getMeasuredWidth(), (f21 + measuredHeight) - dpf2);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                }
                if (this.I) {
                    Paint paint3 = this.B;
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), paint3);
                    canvas.drawRect(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
                    canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), this.C);
                }
            }
        }
    }
}
