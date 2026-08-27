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

public final class if0 extends View {
    public ValueAnimator A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.c6 H;
    public boolean I;

    public int f29348a;

    public int f29349b;

    public int f29350c;
    public float d;

    public int f29351e;

    public int f29352f;
    public boolean h;

    public boolean f29353n;

    public float f29354r;

    public float f29355s;
    public int v;

    public int f29356w;

    public final RectF f29357x;

    public float f29358y;

    public if0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f29348a = -1;
        this.f29349b = 0;
        this.f29357x = new RectF();
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
        boolean z10 = (this.f29353n ? Math.max(this.f29351e, this.f29352f) : this.f29349b) > 3;
        int i10 = z10 ? 2 : 0;
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
        this.I = z10;
    }

    public final void b(int i10) {
        if (this.f29353n) {
            this.F = i10;
            return;
        }
        if (!this.h) {
            this.d = this.f29348a;
        } else {
            if (this.f29350c == i10) {
                return;
            }
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.d;
            float f11 = this.f29358y;
            this.d = (this.f29350c * f11) + ((1.0f - f11) * f10);
        }
        if (i10 != this.f29348a) {
            this.f29350c = i10;
            this.h = true;
            this.f29358y = 0.0f;
            invalidate();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new gf0(this, 1));
            this.A.addListener(new hf0(this, 0));
            this.A.setInterpolator(er.f28122f);
            this.A.setDuration(220L);
            this.A.start();
        }
    }

    public final void c(int i10, int i11, boolean z10) {
        int i12 = this.f29348a;
        if (i12 < 0 || i11 == 0 || this.f29349b == 0) {
            z10 = false;
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f29348a = i10;
            this.f29349b = i11;
            invalidate();
        } else if (this.f29349b == i11 && (Math.abs(i12 - i10) <= 2 || this.h || this.f29353n)) {
            b(i10);
        } else {
            ValueAnimator valueAnimator2 = this.A;
            if (valueAnimator2 != null) {
                this.F = 0;
                valueAnimator2.cancel();
            }
            int iDp = AndroidUtilities.dp(8.0f);
            int i13 = iDp * 2;
            this.v = (getMeasuredHeight() - i13) / Math.min(this.f29349b, 3);
            this.f29356w = (getMeasuredHeight() - i13) / Math.min(i11, 3);
            int i14 = this.f29348a - 1;
            int i15 = this.v;
            float f10 = i14 * i15;
            this.f29354r = f10;
            if (f10 < 0.0f) {
                this.f29354r = 0.0f;
            } else {
                float fE = i0.a.e(this.f29349b, 1, i15, iDp) - f10;
                int measuredHeight = getMeasuredHeight() - iDp;
                int i16 = this.v;
                if (fE < measuredHeight - i16) {
                    this.f29354r = i0.a.e(this.f29349b, 1, i16, iDp) - ((getMeasuredHeight() - iDp) - this.v);
                }
            }
            int i17 = this.f29356w;
            float f11 = (i10 - 1) * i17;
            this.f29355s = f11;
            if (f11 < 0.0f) {
                this.f29355s = 0.0f;
            } else {
                int i18 = i11 - 1;
                float f12 = ((i17 * i18) + iDp) - f11;
                int measuredHeight2 = getMeasuredHeight() - iDp;
                int i19 = this.f29356w;
                if (f12 < measuredHeight2 - i19) {
                    this.f29355s = ((i18 * i19) + iDp) - ((getMeasuredHeight() - iDp) - this.f29356w);
                }
            }
            this.d = this.f29348a;
            this.f29350c = i10;
            this.f29348a = i10;
            this.f29351e = this.f29349b;
            this.f29352f = i11;
            this.f29349b = i11;
            this.f29353n = true;
            this.h = true;
            this.f29358y = 0.0f;
            invalidate();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new gf0(this, 0));
            this.A.addListener(new hf0(this, 1));
            this.A.setInterpolator(er.f28122f);
            this.A.setDuration(220L);
            this.A.start();
        }
        a();
    }

    public final void d() {
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23079ee, this.H);
        this.G = iV0;
        this.D.setColor(i0.b.k(iV0, (int) ((Color.alpha(iV0) / 255.0f) * 112.0f)));
        this.E.setColor(this.G);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float measuredHeight2;
        RectF rectF;
        super.onDraw(canvas);
        if (this.f29348a < 0 || this.f29349b == 0) {
            return;
        }
        int iDp = AndroidUtilities.dp(8.0f);
        if (this.f29353n) {
            float f10 = this.v;
            float f11 = this.f29358y;
            measuredHeight = (this.f29356w * f11) + ((1.0f - f11) * f10);
        } else if (this.f29349b == 0) {
            return;
        } else {
            measuredHeight = (getMeasuredHeight() - (iDp * 2)) / Math.min(this.f29349b, 3);
        }
        if (measuredHeight == 0.0f) {
            return;
        }
        float fDpf2 = AndroidUtilities.dpf2(0.7f);
        if (this.f29353n) {
            float f12 = this.f29354r;
            float f13 = this.f29358y;
            measuredHeight2 = (this.f29355s * f13) + ((1.0f - f13) * f12);
        } else {
            if (this.h) {
                float f14 = (this.d - 1.0f) * measuredHeight;
                float f15 = (this.f29350c - 1) * measuredHeight;
                float f16 = this.f29358y;
                measuredHeight2 = (f15 * f16) + ((1.0f - f16) * f14);
            } else {
                measuredHeight2 = (this.f29348a - 1) * measuredHeight;
            }
            if (measuredHeight2 < 0.0f) {
                measuredHeight2 = 0.0f;
            } else {
                float f17 = iDp;
                if ((((this.f29349b - 1) * measuredHeight) + f17) - measuredHeight2 < (getMeasuredHeight() - iDp) - measuredHeight) {
                    measuredHeight2 = (((this.f29349b - 1) * measuredHeight) + f17) - ((getMeasuredHeight() - iDp) - measuredHeight);
                }
            }
        }
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float f18 = iDp;
        int iMax = Math.max(0, (int) (((f18 + measuredHeight2) / measuredHeight) - 1.0f));
        int iMin = Math.min(iMax + 6, this.f29353n ? Math.max(this.f29351e, this.f29352f) : this.f29349b);
        while (true) {
            rectF = this.f29357x;
            if (iMax >= iMin) {
                break;
            }
            float f19 = ((iMax * measuredHeight) + f18) - measuredHeight2;
            float f20 = f19 + measuredHeight;
            if (f20 >= 0.0f && f19 <= getMeasuredHeight()) {
                rectF.set(0.0f, f19 + fDpf2, getMeasuredWidth(), f20 - fDpf2);
                boolean z10 = this.f29353n;
                Paint paint = this.D;
                if (z10 && iMax >= this.f29352f) {
                    int i10 = this.G;
                    paint.setColor(i0.b.k(i10, (int) ((1.0f - this.f29358y) * (Color.alpha(i10) / 255.0f) * 76.0f)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    int i11 = this.G;
                    paint.setColor(i0.b.k(i11, (int) ((Color.alpha(i11) / 255.0f) * 76.0f)));
                } else if (!z10 || iMax < this.f29351e) {
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                } else {
                    int i12 = this.G;
                    paint.setColor(i0.b.k(i12, (int) ((Color.alpha(i12) / 255.0f) * 76.0f * this.f29358y)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    int i13 = this.G;
                    paint.setColor(i0.b.k(i13, (int) ((Color.alpha(i13) / 255.0f) * 76.0f)));
                }
            }
            iMax++;
        }
        boolean z11 = this.h;
        Paint paint2 = this.E;
        if (z11) {
            float f21 = this.d;
            float f22 = this.f29358y;
            float f23 = ((((this.f29350c * f22) + ((1.0f - f22) * f21)) * measuredHeight) + f18) - measuredHeight2;
            rectF.set(0.0f, f23 + fDpf2, getMeasuredWidth(), (f23 + measuredHeight) - fDpf2);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        } else {
            float f24 = ((this.f29348a * measuredHeight) + f18) - measuredHeight2;
            rectF.set(0.0f, f24 + fDpf2, getMeasuredWidth(), (f24 + measuredHeight) - fDpf2);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        }
        if (this.I) {
            float measuredWidth2 = getMeasuredWidth();
            float fDp = AndroidUtilities.dp(6.0f);
            Paint paint3 = this.B;
            canvas.drawRect(0.0f, 0.0f, measuredWidth2, fDp, paint3);
            canvas.drawRect(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
            canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), this.C);
        }
    }
}
