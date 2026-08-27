package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class ke0 extends FrameLayout {
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
    public je0 H;
    public int I;

    public PointF f30083a;

    public float f30084b;

    public float f30085c;
    public tu0 d;

    public PointF f30086e;

    public float f30087f;
    public float h;

    public float f30088n;

    public RectF f30089r;

    public float f30090s;
    public float v;

    public float f30091w;

    public float f30092x;

    public boolean f30093y;

    public static float a(float f10) {
        return (f10 * 3.1415927f) / 180.0f;
    }

    public static float b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x8 = motionEvent.getX(0);
        float y10 = motionEvent.getY(0);
        float x10 = x8 - motionEvent.getX(1);
        float y11 = y10 - motionEvent.getY(1);
        return (float) Math.sqrt((y11 * y11) + (x10 * x10));
    }

    private PointF getActualCenterPoint() {
        float width = getWidth();
        tu0 tu0Var = this.d;
        float f10 = tu0Var.f32893a;
        float f11 = (this.f30086e.x * f10) + ((width - f10) / 2.0f);
        int i10 = !this.G ? AndroidUtilities.statusBarHeight : 0;
        float height = getHeight();
        float f12 = tu0Var.f32894b;
        float fA = com.google.android.recaptcha.internal.a.A(height, f12, 2.0f, i10);
        float f13 = tu0Var.f32893a;
        return new PointF(f11, (this.f30086e.y * f13) + org.telegram.messenger.y1.a(f13, f12, 2.0f, fA));
    }

    private float getActualInnerRadius() {
        tu0 tu0Var = this.d;
        return Math.min(tu0Var.f32893a, tu0Var.f32894b) * this.f30087f;
    }

    private float getActualOuterRadius() {
        tu0 tu0Var = this.d;
        return Math.min(tu0Var.f32893a, tu0Var.f32894b) * this.h;
    }

    public final void c(int i10, MotionEvent motionEvent) {
        boolean z10 = this.G;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f10 = x8 - actualCenterPoint.x;
        float f11 = y10 - actualCenterPoint.y;
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        tu0 tu0Var = this.d;
        float fMin = Math.min(tu0Var.f32893a, tu0Var.f32894b);
        float f12 = this.f30087f * fMin;
        float f13 = this.h * fMin;
        float fAbs = (float) Math.abs((Math.sin(((double) a(this.f30088n)) + 1.5707963267948966d) * ((double) f11)) + (Math.cos(((double) a(this.f30088n)) + 1.5707963267948966d) * ((double) f10)));
        if (i10 == 1) {
            this.f30090s = motionEvent.getX();
            this.v = motionEvent.getY();
            boolean z11 = Math.abs(f13 - f12) < J;
            float f14 = L;
            float f15 = z11 ? 0.0f : f14;
            float f16 = z11 ? 0.0f : f14;
            int i11 = this.D;
            float f17 = K;
            if (i11 != 0) {
                if (i11 == 1) {
                    if (fSqrt < f17) {
                        this.I = 2;
                        this.f30083a = actualCenterPoint;
                        return;
                    }
                    if (fSqrt > f12 - f14 && fSqrt < f15 + f12) {
                        this.I = 3;
                        this.f30084b = fSqrt;
                        this.f30085c = f12;
                        return;
                    } else {
                        if (fSqrt <= f13 - f16 || fSqrt >= f14 + f13) {
                            return;
                        }
                        this.I = 4;
                        this.f30084b = fSqrt;
                        this.f30085c = f13;
                        return;
                    }
                }
                return;
            }
            if (fSqrt < f17) {
                this.I = 2;
                this.f30083a = actualCenterPoint;
                return;
            }
            float f18 = f12 - f14;
            if (fAbs > f18 && fAbs < f15 + f12) {
                this.I = 3;
                this.f30084b = fAbs;
                this.f30085c = f12;
                return;
            } else if (fAbs > f13 - f16 && fAbs < f13 + f14) {
                this.I = 4;
                this.f30084b = fAbs;
                this.f30085c = f13;
                return;
            } else {
                if (fAbs <= f18 || fAbs >= f13 + f14) {
                    this.I = 6;
                    return;
                }
                return;
            }
        }
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                this.I = 1;
                return;
            }
            return;
        }
        int i12 = this.D;
        if (i12 == 0) {
            int iB = m1.j.b(this.I);
            if (iB == 1) {
                float f19 = x8 - this.f30090s;
                float f20 = y10 - this.v;
                float width = (getWidth() - tu0Var.f32893a) / 2.0f;
                int i13 = !z10 ? AndroidUtilities.statusBarHeight : 0;
                float height = getHeight();
                float f21 = tu0Var.f32894b;
                float fA = com.google.android.recaptcha.internal.a.A(height, f21, 2.0f, i13);
                PointF pointF = new PointF(Math.max(width, Math.min(tu0Var.f32893a + width, this.f30083a.x + f19)), Math.max(fA, Math.min(f21 + fA, this.f30083a.y + f20)));
                float f22 = pointF.x - width;
                float f23 = tu0Var.f32893a;
                this.f30086e = new PointF(f22 / f23, (((f23 - tu0Var.f32894b) / 2.0f) + (pointF.y - fA)) / f23);
            } else if (iB == 2) {
                this.f30087f = Math.min(Math.max(0.1f, (this.f30085c + (fAbs - this.f30084b)) / fMin), this.h - 0.02f);
            } else if (iB == 3) {
                this.h = Math.max(this.f30087f + 0.02f, (this.f30085c + (fAbs - this.f30084b)) / fMin);
            } else if (iB == 5) {
                float f24 = x8 - this.f30090s;
                float f25 = y10 - this.v;
                boolean z12 = x8 > actualCenterPoint.x;
                boolean z13 = y10 > actualCenterPoint.y;
                boolean z14 = Math.abs(f25) > Math.abs(f24);
                this.f30088n = (((((float) Math.sqrt((f25 * f25) + (f24 * f24))) * ((((z12 || z13 ? !z12 || z13 ? !(z12 && z13) ? !(!z14 ? f24 < 0.0f : f25 < 0.0f) : !(!z14 ? f24 < 0.0f : f25 > 0.0f) : !z14 ? f24 > 0.0f : f25 > 0.0f : !z14 ? f24 > 0.0f : f25 < 0.0f) ? 0 : 1) * 2) - 1)) / 3.1415927f) / 1.15f) + this.f30088n;
                this.f30090s = x8;
                this.v = y10;
            }
        } else if (i12 == 1) {
            int iB2 = m1.j.b(this.I);
            if (iB2 == 1) {
                float f26 = x8 - this.f30090s;
                float f27 = y10 - this.v;
                float width2 = (getWidth() - tu0Var.f32893a) / 2.0f;
                int i14 = !z10 ? AndroidUtilities.statusBarHeight : 0;
                float height2 = getHeight();
                float f28 = tu0Var.f32894b;
                float fA2 = com.google.android.recaptcha.internal.a.A(height2, f28, 2.0f, i14);
                PointF pointF2 = new PointF(Math.max(width2, Math.min(tu0Var.f32893a + width2, this.f30083a.x + f26)), Math.max(fA2, Math.min(f28 + fA2, this.f30083a.y + f27)));
                float f29 = pointF2.x - width2;
                float f30 = tu0Var.f32893a;
                this.f30086e = new PointF(f29 / f30, (((f30 - tu0Var.f32894b) / 2.0f) + (pointF2.y - fA2)) / f30);
            } else if (iB2 == 2) {
                this.f30087f = Math.min(Math.max(0.1f, (this.f30085c + (fSqrt - this.f30084b)) / fMin), this.h - 0.02f);
            } else if (iB2 == 3) {
                this.h = Math.max(this.f30087f + 0.02f, (this.f30085c + (fSqrt - this.f30084b)) / fMin);
            }
        }
        invalidate();
        je0 je0Var = this.H;
        if (je0Var != null) {
            PointF pointF3 = this.f30086e;
            float f31 = this.f30087f;
            float f32 = this.h;
            float fA3 = a(this.f30088n) + 1.5707964f;
            ve0 ve0Var = ((ne0) je0Var).f30963a;
            ve0Var.T = f32;
            ve0Var.U = pointF3;
            ve0Var.V = f31;
            ve0Var.W = fA3;
            jz jzVar = ve0Var.f33390h0;
            if (jzVar != null) {
                jzVar.e(false, false, false);
            }
        }
    }

    public final void d(int i10, MotionEvent motionEvent) {
        if (i10 == 1) {
            this.f30091w = b(motionEvent);
            this.f30092x = 1.0f;
            this.I = 5;
        } else if (i10 != 2) {
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                this.I = 1;
                return;
            }
            return;
        }
        float fB = b(motionEvent);
        float fC = s3.c.c(fB - this.f30091w, AndroidUtilities.density, 0.01f, this.f30092x);
        this.f30092x = fC;
        float fMax = Math.max(0.1f, this.f30087f * fC);
        this.f30087f = fMax;
        this.h = Math.max(fMax + 0.02f, this.h * this.f30092x);
        this.f30092x = 1.0f;
        this.f30091w = fB;
        invalidate();
        je0 je0Var = this.H;
        if (je0Var != null) {
            PointF pointF = this.f30086e;
            float f10 = this.f30087f;
            float f11 = this.h;
            float fA = a(this.f30088n) + 1.5707964f;
            ve0 ve0Var = ((ne0) je0Var).f30963a;
            ve0Var.T = f11;
            ve0Var.U = pointF;
            ve0Var.V = f10;
            ve0Var.W = fA;
            jz jzVar = ve0Var.f33390h0;
            if (jzVar != null) {
                jzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.F;
        RectF rectF = this.f30089r;
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
            canvas2.rotate(this.f30088n);
            float fDp = AndroidUtilities.dp(6.0f);
            float fDp2 = AndroidUtilities.dp(12.0f);
            float fDp3 = AndroidUtilities.dp(1.5f);
            int i12 = 0;
            while (i12 < 30) {
                float f10 = fDp2 + fDp;
                float f11 = i12 * f10;
                float f12 = -actualInnerRadius;
                float f13 = f11 + fDp2;
                float f14 = fDp3 - actualInnerRadius;
                canvas2.drawRect(f11, f12, f13, f14, paint4);
                float f15 = ((-i12) * f10) - fDp;
                float f16 = f15 - fDp2;
                canvas.drawRect(f16, f12, f15, f14, paint4);
                float f17 = fDp3 + actualInnerRadius;
                float f18 = actualInnerRadius;
                canvas.drawRect(f11, f18, f13, f17, paint4);
                canvas.drawRect(f16, f18, f15, f17, paint4);
                i12++;
                actualInnerRadius = f18;
                canvas2 = canvas;
            }
            float fDp4 = AndroidUtilities.dp(6.0f);
            while (i11 < 64) {
                float f19 = fDp4 + fDp;
                float f20 = i11 * f19;
                float f21 = -actualOuterRadius;
                float f22 = fDp4 + f20;
                float f23 = fDp3 - actualOuterRadius;
                canvas.drawRect(f20, f21, f22, f23, paint4);
                float f24 = ((-i11) * f19) - fDp;
                float f25 = f24 - fDp4;
                canvas.drawRect(f25, f21, f24, f23, paint4);
                float f26 = fDp3 + actualOuterRadius;
                float f27 = actualOuterRadius;
                canvas.drawRect(f20, f27, f22, f26, paint4);
                canvas.drawRect(f25, f27, f24, f26, paint4);
                i11++;
                actualOuterRadius = f27;
            }
            paint = paint4;
        } else {
            paint = paint4;
            if (i10 == 1) {
                float f28 = -actualInnerRadius;
                rectF.set(f28, f28, actualInnerRadius, actualInnerRadius);
                int i13 = 0;
                while (i13 < 22) {
                    Paint paint5 = paint3;
                    canvas.drawArc(rectF, i13 * 16.35f, 10.2f, false, paint5);
                    i13++;
                    paint3 = paint5;
                }
                Paint paint6 = paint3;
                float f29 = -actualOuterRadius;
                rectF.set(f29, f29, actualOuterRadius, actualOuterRadius);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ke0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(je0 je0Var) {
        this.H = je0Var;
    }

    public void setType(int i10) {
        this.D = i10;
        invalidate();
    }
}
