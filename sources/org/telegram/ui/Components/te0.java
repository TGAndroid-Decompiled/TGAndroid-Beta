package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class te0 extends FrameLayout {
    public static final float J = AndroidUtilities.dp(20.0f);
    public static final float K = AndroidUtilities.dp(30.0f);
    public static final float L = AndroidUtilities.dp(30.0f);
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public Paint E;
    public Paint F;
    public boolean G;
    public se0 H;
    public int I;
    public PointF f32930a;
    public float f32931b;
    public float f32932c;
    public bv0 d;
    public PointF f32933e;
    public float f32934f;
    public float h;
    public float f32935n;
    public RectF f32936r;
    public float f32937s;
    public float v;
    public float f32938w;
    public float f32939x;
    public boolean f32940y;

    public static float a(float f9) {
        return (f9 * 3.1415927f) / 180.0f;
    }

    public static float b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x4 = motionEvent.getX(0);
        float y8 = motionEvent.getY(0);
        float x10 = x4 - motionEvent.getX(1);
        float y10 = y8 - motionEvent.getY(1);
        return (float) Math.sqrt((y10 * y10) + (x10 * x10));
    }

    private PointF getActualCenterPoint() {
        int i10;
        bv0 bv0Var = this.d;
        float f9 = bv0Var.f27238a;
        float width = (this.f32933e.x * f9) + ((getWidth() - f9) / 2.0f);
        if (!this.G) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float height = getHeight();
        float f10 = bv0Var.f27239b;
        float A = com.google.android.recaptcha.internal.a.A(height, f10, 2.0f, i10);
        float f11 = bv0Var.f27238a;
        return new PointF(width, (this.f32933e.y * f11) + org.telegram.messenger.x3.a(f11, f10, 2.0f, A));
    }

    private float getActualInnerRadius() {
        bv0 bv0Var = this.d;
        return Math.min(bv0Var.f27238a, bv0Var.f27239b) * this.f32934f;
    }

    private float getActualOuterRadius() {
        bv0 bv0Var = this.d;
        return Math.min(bv0Var.f27238a, bv0Var.f27239b) * this.h;
    }

    public final void c(int i10, MotionEvent motionEvent) {
        float f9;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        boolean z13 = this.G;
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f10 = x4 - actualCenterPoint.x;
        float f11 = y8 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        bv0 bv0Var = this.d;
        float min = Math.min(bv0Var.f27238a, bv0Var.f27239b);
        float f12 = this.f32934f * min;
        float f13 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.f32935n) + 1.5707963267948966d) * f11) + (Math.cos(a(this.f32935n) + 1.5707963267948966d) * f10));
        float f14 = 0.0f;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    this.I = 1;
                    return;
                }
                return;
            }
            int i14 = this.D;
            if (i14 == 0) {
                int b10 = m1.j.b(this.I);
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 == 5) {
                                float f15 = x4 - this.f32937s;
                                float f16 = y8 - this.v;
                                if (x4 > actualCenterPoint.x) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (y8 > actualCenterPoint.y) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (Math.abs(f16) > Math.abs(f15)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z10 || z11 ? !(!z10 || z11 ? !z10 || !z11 ? !z12 ? f15 >= 0.0f : f16 >= 0.0f : !z12 ? f15 >= 0.0f : f16 <= 0.0f : !z12 ? f15 <= 0.0f : f16 <= 0.0f) : !(!z12 ? f15 <= 0.0f : f16 >= 0.0f)) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                this.f32935n = (((((float) Math.sqrt((f16 * f16) + (f15 * f15))) * ((i13 * 2) - 1)) / 3.1415927f) / 1.15f) + this.f32935n;
                                this.f32937s = x4;
                                this.v = y8;
                            }
                        } else {
                            this.h = Math.max(this.f32934f + 0.02f, (this.f32932c + (abs - this.f32931b)) / min);
                        }
                    } else {
                        this.f32934f = Math.min(Math.max(0.1f, (this.f32932c + (abs - this.f32931b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f17 = x4 - this.f32937s;
                    float f18 = y8 - this.v;
                    float width = (getWidth() - bv0Var.f27238a) / 2.0f;
                    if (!z13) {
                        i12 = AndroidUtilities.statusBarHeight;
                    } else {
                        i12 = 0;
                    }
                    float height = getHeight();
                    float f19 = bv0Var.f27239b;
                    float A = com.google.android.recaptcha.internal.a.A(height, f19, 2.0f, i12);
                    PointF pointF = new PointF(Math.max(width, Math.min(bv0Var.f27238a + width, this.f32930a.x + f17)), Math.max(A, Math.min(f19 + A, this.f32930a.y + f18)));
                    float f20 = pointF.x - width;
                    float f21 = bv0Var.f27238a;
                    this.f32933e = new PointF(f20 / f21, (((f21 - bv0Var.f27239b) / 2.0f) + (pointF.y - A)) / f21);
                }
            } else if (i14 == 1) {
                int b11 = m1.j.b(this.I);
                if (b11 != 1) {
                    if (b11 != 2) {
                        if (b11 == 3) {
                            this.h = Math.max(this.f32934f + 0.02f, (this.f32932c + (sqrt - this.f32931b)) / min);
                        }
                    } else {
                        this.f32934f = Math.min(Math.max(0.1f, (this.f32932c + (sqrt - this.f32931b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f22 = x4 - this.f32937s;
                    float f23 = y8 - this.v;
                    float width2 = (getWidth() - bv0Var.f27238a) / 2.0f;
                    if (!z13) {
                        i11 = AndroidUtilities.statusBarHeight;
                    } else {
                        i11 = 0;
                    }
                    float height2 = getHeight();
                    float f24 = bv0Var.f27239b;
                    float A2 = com.google.android.recaptcha.internal.a.A(height2, f24, 2.0f, i11);
                    PointF pointF2 = new PointF(Math.max(width2, Math.min(bv0Var.f27238a + width2, this.f32930a.x + f22)), Math.max(A2, Math.min(f24 + A2, this.f32930a.y + f23)));
                    float f25 = pointF2.x - width2;
                    float f26 = bv0Var.f27238a;
                    this.f32933e = new PointF(f25 / f26, (((f26 - bv0Var.f27239b) / 2.0f) + (pointF2.y - A2)) / f26);
                }
            }
            invalidate();
            se0 se0Var = this.H;
            if (se0Var != null) {
                PointF pointF3 = this.f32933e;
                float f27 = this.f32934f;
                float f28 = this.h;
                ef0 ef0Var = ((we0) se0Var).f34394a;
                ef0Var.T = f28;
                ef0Var.U = pointF3;
                ef0Var.V = f27;
                ef0Var.W = a(this.f32935n) + 1.5707964f;
                qz qzVar = ef0Var.f28034h0;
                if (qzVar != null) {
                    qzVar.e(false, false, false);
                    return;
                }
                return;
            }
            return;
        }
        boolean z14 = false;
        this.f32937s = motionEvent.getX();
        this.v = motionEvent.getY();
        if (Math.abs(f13 - f12) < J) {
            z14 = true;
        }
        float f29 = L;
        if (z14) {
            f9 = 0.0f;
        } else {
            f9 = f29;
        }
        if (!z14) {
            f14 = f29;
        }
        int i15 = this.D;
        float f30 = K;
        if (i15 == 0) {
            if (sqrt < f30) {
                this.I = 2;
                this.f32930a = actualCenterPoint;
                return;
            }
            float f31 = f12 - f29;
            if (abs > f31 && abs < f9 + f12) {
                this.I = 3;
                this.f32931b = abs;
                this.f32932c = f12;
            } else if (abs > f13 - f14 && abs < f13 + f29) {
                this.I = 4;
                this.f32931b = abs;
                this.f32932c = f13;
            } else if (abs <= f31 || abs >= f13 + f29) {
                this.I = 6;
            }
        } else if (i15 == 1) {
            if (sqrt < f30) {
                this.I = 2;
                this.f32930a = actualCenterPoint;
            } else if (sqrt > f12 - f29 && sqrt < f9 + f12) {
                this.I = 3;
                this.f32931b = sqrt;
                this.f32932c = f12;
            } else if (sqrt > f13 - f14 && sqrt < f29 + f13) {
                this.I = 4;
                this.f32931b = sqrt;
                this.f32932c = f13;
            }
        }
    }

    public final void d(int i10, MotionEvent motionEvent) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    this.I = 1;
                    return;
                }
                return;
            }
        } else {
            this.f32938w = b(motionEvent);
            this.f32939x = 1.0f;
            this.I = 5;
        }
        float b10 = b(motionEvent);
        float c3 = u3.c.c(b10 - this.f32938w, AndroidUtilities.density, 0.01f, this.f32939x);
        this.f32939x = c3;
        float max = Math.max(0.1f, this.f32934f * c3);
        this.f32934f = max;
        this.h = Math.max(max + 0.02f, this.h * this.f32939x);
        this.f32939x = 1.0f;
        this.f32938w = b10;
        invalidate();
        se0 se0Var = this.H;
        if (se0Var != null) {
            PointF pointF = this.f32933e;
            float f9 = this.f32934f;
            float f10 = this.h;
            ef0 ef0Var = ((we0) se0Var).f34394a;
            ef0Var.T = f10;
            ef0Var.U = pointF;
            ef0Var.V = f9;
            ef0Var.W = a(this.f32935n) + 1.5707964f;
            qz qzVar = ef0Var.f28034h0;
            if (qzVar != null) {
                qzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.F;
        RectF rectF = this.f32936r;
        Paint paint3 = paint2;
        Paint paint4 = this.E;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i10 = this.D;
        int i11 = 0;
        if (i10 == 0) {
            canvas2.rotate(this.f32935n);
            float dp = AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            float dp3 = AndroidUtilities.dp(1.5f);
            int i12 = 0;
            while (i12 < 30) {
                float f9 = dp2 + dp;
                float f10 = i12 * f9;
                float f11 = -actualInnerRadius;
                float f12 = f10 + dp2;
                float f13 = dp3 - actualInnerRadius;
                canvas2.drawRect(f10, f11, f12, f13, paint4);
                float f14 = ((-i12) * f9) - dp;
                float f15 = f14 - dp2;
                canvas.drawRect(f15, f11, f14, f13, paint4);
                float f16 = dp3 + actualInnerRadius;
                float f17 = actualInnerRadius;
                canvas.drawRect(f10, f17, f12, f16, paint4);
                canvas.drawRect(f15, f17, f14, f16, paint4);
                i12++;
                actualInnerRadius = f17;
                canvas2 = canvas;
            }
            float dp4 = AndroidUtilities.dp(6.0f);
            while (i11 < 64) {
                float f18 = dp4 + dp;
                float f19 = i11 * f18;
                float f20 = -actualOuterRadius;
                float f21 = dp4 + f19;
                float f22 = dp3 - actualOuterRadius;
                canvas.drawRect(f19, f20, f21, f22, paint4);
                float f23 = ((-i11) * f18) - dp;
                float f24 = f23 - dp4;
                canvas.drawRect(f24, f20, f23, f22, paint4);
                float f25 = dp3 + actualOuterRadius;
                float f26 = actualOuterRadius;
                canvas.drawRect(f19, f26, f21, f25, paint4);
                canvas.drawRect(f24, f26, f23, f25, paint4);
                i11++;
                actualOuterRadius = f26;
            }
            paint = paint4;
        } else {
            paint = paint4;
            if (i10 == 1) {
                float f27 = -actualInnerRadius;
                rectF.set(f27, f27, actualInnerRadius, actualInnerRadius);
                int i13 = 0;
                while (i13 < 22) {
                    Paint paint5 = paint3;
                    canvas.drawArc(rectF, i13 * 16.35f, 10.2f, false, paint5);
                    i13++;
                    paint3 = paint5;
                }
                Paint paint6 = paint3;
                float f28 = -actualOuterRadius;
                rectF.set(f28, f28, actualOuterRadius, actualOuterRadius);
                while (i11 < 64) {
                    canvas.drawArc(rectF, 5.62f * i11, 3.6f, false, paint6);
                    i11++;
                }
            }
        }
        canvas.drawCircle(0.0f, 0.0f, AndroidUtilities.dp(8.0f), paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.te0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(se0 se0Var) {
        this.H = se0Var;
    }

    public void setType(int i10) {
        this.D = i10;
        invalidate();
    }
}
