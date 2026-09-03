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
public final class cg0 extends View {
    public ValueAnimator B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.ActionBar.g6 I;
    public boolean J;
    public int f25927a;
    public int f25928b;
    public int f25929c;
    public float d;
    public int f25930e;
    public int f25931f;
    public boolean h;
    public boolean f25932n;
    public float f25933r;
    public float f25934s;
    public int v;
    public int f25935w;
    public final RectF f25936x;
    public float f25937y;

    public cg0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f25927a = -1;
        this.f25928b = 0;
        this.f25936x = new RectF();
        Paint paint = new Paint(1);
        this.E = paint;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = -1;
        this.I = g6Var;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.C = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.D = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        d();
    }

    public final void a() {
        int i10;
        boolean z4;
        if (this.f25932n) {
            i10 = Math.max(this.f25930e, this.f25931f);
        } else {
            i10 = this.f25928b;
        }
        int i11 = 0;
        if (i10 > 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i11 = 2;
        }
        if (getLayerType() != i11) {
            setLayerType(i11, null);
            invalidate();
        }
        this.J = z4;
    }

    public final void b(int i10) {
        if (this.f25932n) {
            this.G = i10;
            return;
        }
        if (this.h) {
            if (this.f25929c != i10) {
                ValueAnimator valueAnimator = this.B;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f10 = this.d;
                float f11 = this.f25937y;
                this.d = (this.f25929c * f11) + ((1.0f - f11) * f10);
            } else {
                return;
            }
        } else {
            this.d = this.f25927a;
        }
        if (i10 != this.f25927a) {
            this.f25929c = i10;
            this.h = true;
            this.f25937y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new ag0(this, 1));
            this.B.addListener(new bg0(this, 0));
            this.B.setInterpolator(pr.f30168f);
            this.B.setDuration(220L);
            this.B.start();
        }
    }

    public final void c(int i10, int i11, boolean z4) {
        int dp;
        int i12;
        int i13;
        int i14 = this.f25927a;
        if (!((i14 < 0 || i11 == 0 || this.f25928b == 0) ? false : false)) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f25927a = i10;
            this.f25928b = i11;
            invalidate();
        } else if (this.f25928b == i11 && (Math.abs(i14 - i10) <= 2 || this.h || this.f25932n)) {
            b(i10);
        } else {
            ValueAnimator valueAnimator2 = this.B;
            if (valueAnimator2 != null) {
                this.G = 0;
                valueAnimator2.cancel();
            }
            int dp2 = AndroidUtilities.dp(8.0f) * 2;
            this.v = (getMeasuredHeight() - dp2) / Math.min(this.f25928b, 3);
            this.f25935w = (getMeasuredHeight() - dp2) / Math.min(i11, 3);
            float f10 = (this.f25927a - 1) * this.v;
            this.f25933r = f10;
            if (f10 < 0.0f) {
                this.f25933r = 0.0f;
            } else {
                int i15 = this.v;
                if (e2.c.e(this.f25928b, 1, i12, dp) - f10 < (getMeasuredHeight() - dp) - i15) {
                    this.f25933r = e2.c.e(this.f25928b, 1, i15, dp) - ((getMeasuredHeight() - dp) - this.v);
                }
            }
            float f11 = (i10 - 1) * this.f25935w;
            this.f25934s = f11;
            if (f11 < 0.0f) {
                this.f25934s = 0.0f;
            } else {
                int i16 = i11 - 1;
                int i17 = this.f25935w;
                if (((i13 * i16) + dp) - f11 < (getMeasuredHeight() - dp) - i17) {
                    this.f25934s = ((i16 * i17) + dp) - ((getMeasuredHeight() - dp) - this.f25935w);
                }
            }
            this.d = this.f25927a;
            this.f25929c = i10;
            this.f25927a = i10;
            this.f25930e = this.f25928b;
            this.f25931f = i11;
            this.f25928b = i11;
            this.f25932n = true;
            this.h = true;
            this.f25937y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new ag0(this, 0));
            this.B.addListener(new bg0(this, 1));
            this.B.setInterpolator(pr.f30168f);
            this.B.setDuration(220L);
            this.B.start();
        }
        a();
    }

    public final void d() {
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21687ee, this.I);
        this.H = v02;
        this.E.setColor(i0.a.k(v02, (int) ((Color.alpha(v02) / 255.0f) * 112.0f)));
        this.F.setColor(this.H);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f10;
        int i10;
        RectF rectF;
        int i11;
        int i12;
        int i13;
        int i14;
        super.onDraw(canvas);
        if (this.f25927a >= 0 && this.f25928b != 0) {
            int dp = AndroidUtilities.dp(8.0f);
            if (this.f25932n) {
                float f11 = this.f25937y;
                measuredHeight = (this.f25935w * f11) + ((1.0f - f11) * this.v);
            } else if (this.f25928b != 0) {
                measuredHeight = (getMeasuredHeight() - (dp * 2)) / Math.min(this.f25928b, 3);
            } else {
                return;
            }
            if (measuredHeight != 0.0f) {
                float dpf2 = AndroidUtilities.dpf2(0.7f);
                if (this.f25932n) {
                    float f12 = this.f25933r;
                    float f13 = this.f25937y;
                    f10 = (this.f25934s * f13) + ((1.0f - f13) * f12);
                } else {
                    if (this.h) {
                        float f14 = this.f25937y;
                        f10 = ((this.f25929c - 1) * measuredHeight * f14) + ((1.0f - f14) * (this.d - 1.0f) * measuredHeight);
                    } else {
                        f10 = (this.f25927a - 1) * measuredHeight;
                    }
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    } else {
                        float f15 = dp;
                        if ((((this.f25928b - 1) * measuredHeight) + f15) - f10 < (getMeasuredHeight() - dp) - measuredHeight) {
                            f10 = (((this.f25928b - 1) * measuredHeight) + f15) - ((getMeasuredHeight() - dp) - measuredHeight);
                        }
                    }
                }
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float f16 = dp;
                int max = Math.max(0, (int) (((f16 + f10) / measuredHeight) - 1.0f));
                int i15 = max + 6;
                if (this.f25932n) {
                    i10 = Math.max(this.f25930e, this.f25931f);
                } else {
                    i10 = this.f25928b;
                }
                int min = Math.min(i15, i10);
                while (true) {
                    rectF = this.f25936x;
                    if (max >= min) {
                        break;
                    }
                    float f17 = ((max * measuredHeight) + f16) - f10;
                    float f18 = f17 + measuredHeight;
                    if (f18 >= 0.0f && f17 <= getMeasuredHeight()) {
                        rectF.set(0.0f, f17 + dpf2, getMeasuredWidth(), f18 - dpf2);
                        boolean z4 = this.f25932n;
                        Paint paint = this.E;
                        if (z4 && max >= this.f25931f) {
                            paint.setColor(i0.a.k(this.H, (int) ((1.0f - this.f25937y) * (Color.alpha(i13) / 255.0f) * 76.0f)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.k(this.H, (int) ((Color.alpha(i14) / 255.0f) * 76.0f)));
                        } else if (z4 && max >= this.f25930e) {
                            paint.setColor(i0.a.k(this.H, (int) ((Color.alpha(i11) / 255.0f) * 76.0f * this.f25937y)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(i0.a.k(this.H, (int) ((Color.alpha(i12) / 255.0f) * 76.0f)));
                        } else {
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                        }
                    }
                    max++;
                }
                boolean z10 = this.h;
                Paint paint2 = this.F;
                if (z10) {
                    float f19 = this.d;
                    float f20 = this.f25937y;
                    float f21 = ((((this.f25929c * f20) + ((1.0f - f20) * f19)) * measuredHeight) + f16) - f10;
                    rectF.set(0.0f, f21 + dpf2, getMeasuredWidth(), (f21 + measuredHeight) - dpf2);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                } else {
                    float f22 = ((this.f25927a * measuredHeight) + f16) - f10;
                    rectF.set(0.0f, f22 + dpf2, getMeasuredWidth(), (f22 + measuredHeight) - dpf2);
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
                }
                if (this.J) {
                    Paint paint3 = this.C;
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), paint3);
                    canvas.drawRect(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
                    canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), this.D);
                }
            }
        }
    }
}
