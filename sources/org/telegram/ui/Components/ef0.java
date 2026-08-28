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
public final class ef0 extends View {
    public ValueAnimator A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.b6 H;
    public boolean I;
    public int f28012a;
    public int f28013b;
    public int f28014c;
    public float d;
    public int f28015e;
    public int f28016f;
    public boolean h;
    public boolean f28017n;
    public float f28018r;
    public float f28019s;
    public int v;
    public int f28020w;
    public final RectF f28021x;
    public float f28022y;

    public ef0(Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.f28012a = -1;
        this.f28013b = 0;
        this.f28021x = new RectF();
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = -1;
        this.H = b6Var;
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
        int i9;
        boolean z10;
        if (this.f28017n) {
            i9 = Math.max(this.f28015e, this.f28016f);
        } else {
            i9 = this.f28013b;
        }
        int i10 = 0;
        if (i9 > 3) {
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
        this.I = z10;
    }

    public final void b(int i9) {
        if (this.f28017n) {
            this.F = i9;
            return;
        }
        if (this.h) {
            if (this.f28014c != i9) {
                ValueAnimator valueAnimator = this.A;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f10 = this.d;
                float f11 = this.f28022y;
                this.d = (this.f28014c * f11) + ((1.0f - f11) * f10);
            } else {
                return;
            }
        } else {
            this.d = this.f28012a;
        }
        if (i9 != this.f28012a) {
            this.f28014c = i9;
            this.h = true;
            this.f28022y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A = ofFloat;
            ofFloat.addUpdateListener(new cf0(this, 1));
            this.A.addListener(new df0(this, 0));
            this.A.setInterpolator(gr.f28844f);
            this.A.setDuration(220L);
            this.A.start();
        }
    }

    public final void c(int i9, int i10, boolean z10) {
        int dp;
        int i11;
        int i12;
        int i13 = this.f28012a;
        if (!((i13 < 0 || i10 == 0 || this.f28013b == 0) ? false : false)) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f28012a = i9;
            this.f28013b = i10;
            invalidate();
        } else if (this.f28013b == i10 && (Math.abs(i13 - i9) <= 2 || this.h || this.f28017n)) {
            b(i9);
        } else {
            ValueAnimator valueAnimator2 = this.A;
            if (valueAnimator2 != null) {
                this.F = 0;
                valueAnimator2.cancel();
            }
            int dp2 = AndroidUtilities.dp(8.0f) * 2;
            this.v = (getMeasuredHeight() - dp2) / Math.min(this.f28013b, 3);
            this.f28020w = (getMeasuredHeight() - dp2) / Math.min(i10, 3);
            float f10 = (this.f28012a - 1) * this.v;
            this.f28018r = f10;
            if (f10 < 0.0f) {
                this.f28018r = 0.0f;
            } else {
                int i14 = this.v;
                if (e2.c.e(this.f28013b, 1, i11, dp) - f10 < (getMeasuredHeight() - dp) - i14) {
                    this.f28018r = e2.c.e(this.f28013b, 1, i14, dp) - ((getMeasuredHeight() - dp) - this.v);
                }
            }
            float f11 = (i9 - 1) * this.f28020w;
            this.f28019s = f11;
            if (f11 < 0.0f) {
                this.f28019s = 0.0f;
            } else {
                int i15 = i10 - 1;
                int i16 = this.f28020w;
                if (((i12 * i15) + dp) - f11 < (getMeasuredHeight() - dp) - i16) {
                    this.f28019s = ((i15 * i16) + dp) - ((getMeasuredHeight() - dp) - this.f28020w);
                }
            }
            this.d = this.f28012a;
            this.f28014c = i9;
            this.f28012a = i9;
            this.f28015e = this.f28013b;
            this.f28016f = i10;
            this.f28013b = i10;
            this.f28017n = true;
            this.h = true;
            this.f28022y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A = ofFloat;
            ofFloat.addUpdateListener(new cf0(this, 0));
            this.A.addListener(new df0(this, 1));
            this.A.setInterpolator(gr.f28844f);
            this.A.setDuration(220L);
            this.A.start();
        }
        a();
    }

    public final void d() {
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23026ee, this.H);
        this.G = v02;
        this.D.setColor(i0.a.k(v02, (int) ((Color.alpha(v02) / 255.0f) * 112.0f)));
        this.E.setColor(this.G);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f10;
        int i9;
        RectF rectF;
        int i10;
        int i11;
        int i12;
        int i13;
        super.onDraw(canvas);
        if (this.f28012a >= 0 && this.f28013b != 0) {
            int dp = AndroidUtilities.dp(8.0f);
            if (this.f28017n) {
                float f11 = this.f28022y;
                measuredHeight = (this.f28020w * f11) + ((1.0f - f11) * this.v);
            } else if (this.f28013b != 0) {
                measuredHeight = (getMeasuredHeight() - (dp * 2)) / Math.min(this.f28013b, 3);
            } else {
                return;
            }
            if (measuredHeight != 0.0f) {
                float dpf2 = AndroidUtilities.dpf2(0.7f);
                if (this.f28017n) {
                    float f12 = this.f28018r;
                    float f13 = this.f28022y;
                    f10 = (this.f28019s * f13) + ((1.0f - f13) * f12);
                } else {
                    if (this.h) {
                        float f14 = this.f28022y;
                        f10 = ((this.f28014c - 1) * measuredHeight * f14) + ((1.0f - f14) * (this.d - 1.0f) * measuredHeight);
                    } else {
                        f10 = (this.f28012a - 1) * measuredHeight;
                    }
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    } else {
                        float f15 = dp;
                        if ((((this.f28013b - 1) * measuredHeight) + f15) - f10 < (getMeasuredHeight() - dp) - measuredHeight) {
                            f10 = (((this.f28013b - 1) * measuredHeight) + f15) - ((getMeasuredHeight() - dp) - measuredHeight);
                        }
                    }
                }
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float f16 = dp;
                int max = Math.max(0, (int) (((f16 + f10) / measuredHeight) - 1.0f));
                int i14 = max + 6;
                if (this.f28017n) {
                    i9 = Math.max(this.f28015e, this.f28016f);
                } else {
                    i9 = this.f28013b;
                }
                int min = Math.min(i14, i9);
                while (true) {
                    rectF = this.f28021x;
                    if (max >= min) {
                        break;
                    }
                    float f17 = ((max * measuredHeight) + f16) - f10;
                    float f18 = f17 + measuredHeight;
                    if (f18 >= 0.0f && f17 <= getMeasuredHeight()) {
                        rectF.set(0.0f, f17 + dpf2, getMeasuredWidth(), f18 - dpf2);
                        boolean z10 = this.f28017n;
                        Paint paint = this.D;
                        if (z10 && max >= this.f28016f) {
                            paint.setColor(i0.a.k(this.G, (int) ((1.0f - this.f28022y) * (Color.alpha(i12) / 255.0f) * 76.0f)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.k(this.G, (int) ((Color.alpha(i13) / 255.0f) * 76.0f)));
                        } else if (z10 && max >= this.f28015e) {
                            paint.setColor(i0.a.k(this.G, (int) ((Color.alpha(i10) / 255.0f) * 76.0f * this.f28022y)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.k(this.G, (int) ((Color.alpha(i11) / 255.0f) * 76.0f)));
                        } else {
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                        }
                    }
                    max++;
                }
                boolean z11 = this.h;
                Paint paint2 = this.E;
                if (z11) {
                    float f19 = this.d;
                    float f20 = this.f28022y;
                    float f21 = ((((this.f28014c * f20) + ((1.0f - f20) * f19)) * measuredHeight) + f16) - f10;
                    rectF.set(0.0f, f21 + dpf2, getMeasuredWidth(), (f21 + measuredHeight) - dpf2);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                } else {
                    float f22 = ((this.f28012a * measuredHeight) + f16) - f10;
                    rectF.set(0.0f, f22 + dpf2, getMeasuredWidth(), (f22 + measuredHeight) - dpf2);
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
