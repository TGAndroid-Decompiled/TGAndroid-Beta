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
public final class eg0 extends View {
    public ValueAnimator E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.f6 L;
    public boolean M;
    public int f22692a;
    public int f22693b;
    public int f22694c;
    public float d;
    public int e;
    public int f22695f;
    public boolean h;
    public boolean f22696n;
    public float f22697r;
    public float f22698s;
    public int v;
    public int f22699w;
    public final RectF f22700x;
    public float f22701y;

    public eg0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f22692a = -1;
        this.f22693b = 0;
        this.f22700x = new RectF();
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
        if (this.f22696n) {
            i10 = Math.max(this.e, this.f22695f);
        } else {
            i10 = this.f22693b;
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
        if (this.f22696n) {
            this.J = i10;
            return;
        }
        if (this.h) {
            if (this.f22694c != i10) {
                ValueAnimator valueAnimator = this.E;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f7 = this.d;
                float f10 = this.f22701y;
                this.d = (this.f22694c * f10) + ((1.0f - f10) * f7);
            } else {
                return;
            }
        } else {
            this.d = this.f22692a;
        }
        if (i10 != this.f22692a) {
            this.f22694c = i10;
            this.h = true;
            this.f22701y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new cg0(this, 1));
            this.E.addListener(new dg0(this, 0));
            this.E.setInterpolator(wr.f28819f);
            this.E.setDuration(220L);
            this.E.start();
        }
    }

    public final void c(int i10, int i11, boolean z10) {
        int dp;
        int i12;
        int i13;
        int i14 = this.f22692a;
        if (!((i14 < 0 || i11 == 0 || this.f22693b == 0) ? false : false)) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f22692a = i10;
            this.f22693b = i11;
            invalidate();
        } else if (this.f22693b == i11 && (Math.abs(i14 - i10) <= 2 || this.h || this.f22696n)) {
            b(i10);
        } else {
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                this.J = 0;
                valueAnimator2.cancel();
            }
            int dp2 = AndroidUtilities.dp(8.0f) * 2;
            this.v = (getMeasuredHeight() - dp2) / Math.min(this.f22693b, 3);
            this.f22699w = (getMeasuredHeight() - dp2) / Math.min(i11, 3);
            float f7 = (this.f22692a - 1) * this.v;
            this.f22697r = f7;
            if (f7 < 0.0f) {
                this.f22697r = 0.0f;
            } else {
                int i15 = this.v;
                if (hc.b.B(this.f22693b, 1, i12, dp) - f7 < (getMeasuredHeight() - dp) - i15) {
                    this.f22697r = hc.b.B(this.f22693b, 1, i15, dp) - ((getMeasuredHeight() - dp) - this.v);
                }
            }
            float f10 = (i10 - 1) * this.f22699w;
            this.f22698s = f10;
            if (f10 < 0.0f) {
                this.f22698s = 0.0f;
            } else {
                int i16 = i11 - 1;
                int i17 = this.f22699w;
                if (((i13 * i16) + dp) - f10 < (getMeasuredHeight() - dp) - i17) {
                    this.f22698s = ((i16 * i17) + dp) - ((getMeasuredHeight() - dp) - this.f22699w);
                }
            }
            this.d = this.f22692a;
            this.f22694c = i10;
            this.f22692a = i10;
            this.e = this.f22693b;
            this.f22695f = i11;
            this.f22693b = i11;
            this.f22696n = true;
            this.h = true;
            this.f22701y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new cg0(this, 0));
            this.E.addListener(new dg0(this, 1));
            this.E.setInterpolator(wr.f28819f);
            this.E.setDuration(220L);
            this.E.start();
        }
        a();
    }

    public final void d() {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17952ee, this.L);
        this.K = v02;
        this.H.setColor(i0.a.k(v02, (int) ((Color.alpha(v02) / 255.0f) * 112.0f)));
        this.I.setColor(this.K);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f7;
        int i10;
        RectF rectF;
        int i11;
        int i12;
        int i13;
        int i14;
        super.onDraw(canvas);
        if (this.f22692a >= 0 && this.f22693b != 0) {
            int dp = AndroidUtilities.dp(8.0f);
            if (this.f22696n) {
                float f10 = this.f22701y;
                measuredHeight = (this.f22699w * f10) + ((1.0f - f10) * this.v);
            } else if (this.f22693b != 0) {
                measuredHeight = (getMeasuredHeight() - (dp * 2)) / Math.min(this.f22693b, 3);
            } else {
                return;
            }
            if (measuredHeight != 0.0f) {
                float dpf2 = AndroidUtilities.dpf2(0.7f);
                if (this.f22696n) {
                    float f11 = this.f22697r;
                    float f12 = this.f22701y;
                    f7 = (this.f22698s * f12) + ((1.0f - f12) * f11);
                } else {
                    if (this.h) {
                        float f13 = this.f22701y;
                        f7 = ((this.f22694c - 1) * measuredHeight * f13) + ((1.0f - f13) * (this.d - 1.0f) * measuredHeight);
                    } else {
                        f7 = (this.f22692a - 1) * measuredHeight;
                    }
                    if (f7 < 0.0f) {
                        f7 = 0.0f;
                    } else {
                        float f14 = dp;
                        if ((((this.f22693b - 1) * measuredHeight) + f14) - f7 < (getMeasuredHeight() - dp) - measuredHeight) {
                            f7 = (((this.f22693b - 1) * measuredHeight) + f14) - ((getMeasuredHeight() - dp) - measuredHeight);
                        }
                    }
                }
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float f15 = dp;
                int max = Math.max(0, (int) (((f15 + f7) / measuredHeight) - 1.0f));
                int i15 = max + 6;
                if (this.f22696n) {
                    i10 = Math.max(this.e, this.f22695f);
                } else {
                    i10 = this.f22693b;
                }
                int min = Math.min(i15, i10);
                while (true) {
                    rectF = this.f22700x;
                    if (max >= min) {
                        break;
                    }
                    float f16 = ((max * measuredHeight) + f15) - f7;
                    float f17 = f16 + measuredHeight;
                    if (f17 >= 0.0f && f16 <= getMeasuredHeight()) {
                        rectF.set(0.0f, f16 + dpf2, getMeasuredWidth(), f17 - dpf2);
                        boolean z10 = this.f22696n;
                        Paint paint = this.H;
                        if (z10 && max >= this.f22695f) {
                            paint.setColor(i0.a.k(this.K, (int) ((1.0f - this.f22701y) * (Color.alpha(i13) / 255.0f) * 76.0f)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.k(this.K, (int) ((Color.alpha(i14) / 255.0f) * 76.0f)));
                        } else if (z10 && max >= this.e) {
                            paint.setColor(i0.a.k(this.K, (int) ((Color.alpha(i11) / 255.0f) * 76.0f * this.f22701y)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.k(this.K, (int) ((Color.alpha(i12) / 255.0f) * 76.0f)));
                        } else {
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                        }
                    }
                    max++;
                }
                boolean z11 = this.h;
                Paint paint2 = this.I;
                if (z11) {
                    float f18 = this.d;
                    float f19 = this.f22701y;
                    float f20 = ((((this.f22694c * f19) + ((1.0f - f19) * f18)) * measuredHeight) + f15) - f7;
                    rectF.set(0.0f, f20 + dpf2, getMeasuredWidth(), (f20 + measuredHeight) - dpf2);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                } else {
                    float f21 = ((this.f22692a * measuredHeight) + f15) - f7;
                    rectF.set(0.0f, f21 + dpf2, getMeasuredWidth(), (f21 + measuredHeight) - dpf2);
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
