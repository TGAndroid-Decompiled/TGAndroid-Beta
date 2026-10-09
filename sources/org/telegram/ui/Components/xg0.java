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
public final class xg0 extends View {
    public ValueAnimator E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.e6 L;
    public boolean M;
    public int f32850a;
    public int f32851b;
    public int f32852c;
    public float d;
    public int f32853e;
    public int f32854f;
    public boolean h;
    public boolean f32855n;
    public float f32856r;
    public float f32857s;
    public int v;
    public int f32858w;
    public final RectF f32859x;
    public float f32860y;

    public xg0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f32850a = -1;
        this.f32851b = 0;
        this.f32859x = new RectF();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.J = -1;
        this.L = e6Var;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.F = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.G = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        d();
    }

    public final void a() {
        int i10;
        boolean z10;
        if (this.f32855n) {
            i10 = Math.max(this.f32853e, this.f32854f);
        } else {
            i10 = this.f32851b;
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
        this.M = z10;
    }

    public final void b(int i10) {
        if (this.f32855n) {
            this.J = i10;
            return;
        }
        if (this.h) {
            if (this.f32852c != i10) {
                ValueAnimator valueAnimator = this.E;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f7 = this.d;
                float f10 = this.f32860y;
                this.d = (this.f32852c * f10) + ((1.0f - f10) * f7);
            } else {
                return;
            }
        } else {
            this.d = this.f32850a;
        }
        if (i10 != this.f32850a) {
            this.f32852c = i10;
            this.h = true;
            this.f32860y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new vg0(this, 1));
            this.E.addListener(new wg0(this, 0));
            this.E.setInterpolator(hs.f27118f);
            this.E.setDuration(220L);
            this.E.start();
        }
    }

    public final void c(int i10, int i11, boolean z10) {
        int dp;
        int i12;
        int i13;
        int i14 = this.f32850a;
        if (i14 < 0 || i11 == 0 || this.f32851b == 0) {
            z10 = false;
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32850a = i10;
            this.f32851b = i11;
            invalidate();
        } else if (this.f32851b == i11 && (Math.abs(i14 - i10) <= 2 || this.h || this.f32855n)) {
            b(i10);
        } else {
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                this.J = 0;
                valueAnimator2.cancel();
            }
            int dp2 = AndroidUtilities.dp(8.0f) * 2;
            this.v = (getMeasuredHeight() - dp2) / Math.min(this.f32851b, 3);
            this.f32858w = (getMeasuredHeight() - dp2) / Math.min(i11, 3);
            float f7 = (this.f32850a - 1) * this.v;
            this.f32856r = f7;
            if (f7 < 0.0f) {
                this.f32856r = 0.0f;
            } else {
                int i15 = this.v;
                if (hg.c.f(this.f32851b, 1, i12, dp) - f7 < (getMeasuredHeight() - dp) - i15) {
                    this.f32856r = hg.c.f(this.f32851b, 1, i15, dp) - ((getMeasuredHeight() - dp) - this.v);
                }
            }
            float f10 = (i10 - 1) * this.f32858w;
            this.f32857s = f10;
            if (f10 < 0.0f) {
                this.f32857s = 0.0f;
            } else {
                int i16 = i11 - 1;
                int i17 = this.f32858w;
                if (((i13 * i16) + dp) - f10 < (getMeasuredHeight() - dp) - i17) {
                    this.f32857s = ((i16 * i17) + dp) - ((getMeasuredHeight() - dp) - this.f32858w);
                }
            }
            this.d = this.f32850a;
            this.f32852c = i10;
            this.f32850a = i10;
            this.f32853e = this.f32851b;
            this.f32854f = i11;
            this.f32851b = i11;
            this.f32855n = true;
            this.h = true;
            this.f32860y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new vg0(this, 0));
            this.E.addListener(new wg0(this, 1));
            this.E.setInterpolator(hs.f27118f);
            this.E.setDuration(220L);
            this.E.start();
        }
        a();
    }

    public final void d() {
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20823ee, this.L);
        this.K = w02;
        this.H.setColor(i0.a.k(w02, (int) ((Color.alpha(w02) / 255.0f) * 112.0f)));
        this.I.setColor(this.K);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f7;
        int i10;
        RectF rectF;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        super.onDraw(canvas);
        if (this.f32850a >= 0 && this.f32851b != 0) {
            int dp = AndroidUtilities.dp(8.0f);
            float f11 = 1.0f;
            if (this.f32855n) {
                float f12 = this.f32860y;
                measuredHeight = (this.f32858w * f12) + ((1.0f - f12) * this.v);
            } else if (this.f32851b != 0) {
                measuredHeight = (getMeasuredHeight() - (dp * 2)) / Math.min(this.f32851b, 3);
            } else {
                return;
            }
            if (measuredHeight != 0.0f) {
                float dpf2 = AndroidUtilities.dpf2(0.7f);
                if (this.f32855n) {
                    float f13 = this.f32856r;
                    float f14 = this.f32860y;
                    f7 = (this.f32857s * f14) + ((1.0f - f14) * f13);
                } else {
                    if (this.h) {
                        float f15 = this.f32860y;
                        f7 = ((this.f32852c - 1) * measuredHeight * f15) + ((1.0f - f15) * (this.d - 1.0f) * measuredHeight);
                    } else {
                        f7 = (this.f32850a - 1) * measuredHeight;
                    }
                    if (f7 < 0.0f) {
                        f7 = 0.0f;
                    } else {
                        float f16 = dp;
                        if ((((this.f32851b - 1) * measuredHeight) + f16) - f7 < (getMeasuredHeight() - dp) - measuredHeight) {
                            f7 = (((this.f32851b - 1) * measuredHeight) + f16) - ((getMeasuredHeight() - dp) - measuredHeight);
                        }
                    }
                }
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float f17 = dp;
                int max = Math.max(0, (int) (((f17 + f7) / measuredHeight) - 1.0f));
                int i15 = max + 6;
                if (this.f32855n) {
                    i10 = Math.max(this.f32853e, this.f32854f);
                } else {
                    i10 = this.f32851b;
                }
                int min = Math.min(i15, i10);
                while (true) {
                    rectF = this.f32859x;
                    if (max >= min) {
                        break;
                    }
                    float f18 = ((max * measuredHeight) + f17) - f7;
                    float f19 = f18 + measuredHeight;
                    if (f19 < 0.0f || f18 > getMeasuredHeight()) {
                        f10 = f11;
                    } else {
                        rectF.set(0.0f, f18 + dpf2, getMeasuredWidth(), f19 - dpf2);
                        boolean z10 = this.f32855n;
                        Paint paint = this.H;
                        f10 = f11;
                        if (z10 && max >= this.f32854f) {
                            paint.setColor(i0.a.k(this.K, (int) ((f10 - this.f32860y) * (Color.alpha(i13) / 255.0f) * 76.0f)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.k(this.K, (int) ((Color.alpha(i14) / 255.0f) * 76.0f)));
                        } else if (z10 && max >= this.f32853e) {
                            paint.setColor(i0.a.k(this.K, (int) ((Color.alpha(i11) / 255.0f) * 76.0f * this.f32860y)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.k(this.K, (int) ((Color.alpha(i12) / 255.0f) * 76.0f)));
                        } else {
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                        }
                    }
                    max++;
                    f11 = f10;
                }
                float f20 = f11;
                boolean z11 = this.h;
                Paint paint2 = this.I;
                if (z11) {
                    float f21 = this.d;
                    float f22 = this.f32860y;
                    float f23 = ((((this.f32852c * f22) + ((f20 - f22) * f21)) * measuredHeight) + f17) - f7;
                    rectF.set(0.0f, f23 + dpf2, getMeasuredWidth(), (f23 + measuredHeight) - dpf2);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                } else {
                    float f24 = ((this.f32850a * measuredHeight) + f17) - f7;
                    rectF.set(0.0f, f24 + dpf2, getMeasuredWidth(), (f24 + measuredHeight) - dpf2);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                }
                if (this.M) {
                    Paint paint3 = this.F;
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), paint3);
                    canvas.drawRect(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
                    canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), this.G);
                }
            }
        }
    }
}
