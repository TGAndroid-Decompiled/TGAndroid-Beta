package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ye0 extends FrameLayout {
    public static final float N = AndroidUtilities.dp(20.0f);
    public static final float O = AndroidUtilities.dp(30.0f);
    public static final float P = AndroidUtilities.dp(30.0f);
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public Paint I;
    public Paint J;
    public boolean K;
    public xe0 L;
    public int M;
    public PointF f32890a;
    public float f32891b;
    public float f32892c;
    public iv0 d;
    public PointF f32893e;
    public float f32894f;
    public float h;
    public float f32895n;
    public RectF f32896r;
    public float f32897s;
    public float v;
    public float f32898w;
    public float f32899x;
    public boolean f32900y;

    public static float a(float f7) {
        return (f7 * 3.1415927f) / 180.0f;
    }

    public static float b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x10 = motionEvent.getX(0);
        float y3 = motionEvent.getY(0);
        float x11 = x10 - motionEvent.getX(1);
        float y10 = y3 - motionEvent.getY(1);
        return (float) Math.sqrt((y10 * y10) + (x11 * x11));
    }

    private PointF getActualCenterPoint() {
        int i10;
        iv0 iv0Var = this.d;
        float f7 = iv0Var.f27271a;
        float width = (this.f32893e.x * f7) + ((getWidth() - f7) / 2.0f);
        if (!this.K) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float height = getHeight();
        float f10 = iv0Var.f27272b;
        float A = com.google.android.gms.internal.vision.e2.A(height, f10, 2.0f, i10);
        float f11 = iv0Var.f27271a;
        return new PointF(width, (this.f32893e.y * f11) + org.telegram.messenger.w1.y(f11, f10, 2.0f, A));
    }

    private float getActualInnerRadius() {
        iv0 iv0Var = this.d;
        return Math.min(iv0Var.f27271a, iv0Var.f27272b) * this.f32894f;
    }

    private float getActualOuterRadius() {
        iv0 iv0Var = this.d;
        return Math.min(iv0Var.f27271a, iv0Var.f27272b) * this.h;
    }

    public final void c(int i10, MotionEvent motionEvent) {
        float f7;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        boolean z13 = this.K;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f10 = x10 - actualCenterPoint.x;
        float f11 = y3 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        iv0 iv0Var = this.d;
        float min = Math.min(iv0Var.f27271a, iv0Var.f27272b);
        float f12 = this.f32894f * min;
        float f13 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.f32895n) + 1.5707963267948966d) * f11) + (Math.cos(a(this.f32895n) + 1.5707963267948966d) * f10));
        float f14 = 0.0f;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    this.M = 1;
                    return;
                }
                return;
            }
            int i14 = this.H;
            if (i14 == 0) {
                int c10 = m1.j.c(this.M);
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 == 5) {
                                float f15 = x10 - this.f32897s;
                                float f16 = y3 - this.v;
                                if (x10 > actualCenterPoint.x) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (y3 > actualCenterPoint.y) {
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
                                this.f32895n = (((((float) Math.sqrt((f16 * f16) + (f15 * f15))) * ((i13 * 2) - 1)) / 3.1415927f) / 1.15f) + this.f32895n;
                                this.f32897s = x10;
                                this.v = y3;
                            }
                        } else {
                            this.h = Math.max(this.f32894f + 0.02f, (this.f32892c + (abs - this.f32891b)) / min);
                        }
                    } else {
                        this.f32894f = Math.min(Math.max(0.1f, (this.f32892c + (abs - this.f32891b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f17 = x10 - this.f32897s;
                    float f18 = y3 - this.v;
                    float width = (getWidth() - iv0Var.f27271a) / 2.0f;
                    if (!z13) {
                        i12 = AndroidUtilities.statusBarHeight;
                    } else {
                        i12 = 0;
                    }
                    float height = getHeight();
                    float f19 = iv0Var.f27272b;
                    float A = com.google.android.gms.internal.vision.e2.A(height, f19, 2.0f, i12);
                    PointF pointF = new PointF(Math.max(width, Math.min(iv0Var.f27271a + width, this.f32890a.x + f17)), Math.max(A, Math.min(f19 + A, this.f32890a.y + f18)));
                    float f20 = pointF.x - width;
                    float f21 = iv0Var.f27271a;
                    this.f32893e = new PointF(f20 / f21, (((f21 - iv0Var.f27272b) / 2.0f) + (pointF.y - A)) / f21);
                }
            } else if (i14 == 1) {
                int c11 = m1.j.c(this.M);
                if (c11 != 1) {
                    if (c11 != 2) {
                        if (c11 == 3) {
                            this.h = Math.max(this.f32894f + 0.02f, (this.f32892c + (sqrt - this.f32891b)) / min);
                        }
                    } else {
                        this.f32894f = Math.min(Math.max(0.1f, (this.f32892c + (sqrt - this.f32891b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f22 = x10 - this.f32897s;
                    float f23 = y3 - this.v;
                    float width2 = (getWidth() - iv0Var.f27271a) / 2.0f;
                    if (!z13) {
                        i11 = AndroidUtilities.statusBarHeight;
                    } else {
                        i11 = 0;
                    }
                    float height2 = getHeight();
                    float f24 = iv0Var.f27272b;
                    float A2 = com.google.android.gms.internal.vision.e2.A(height2, f24, 2.0f, i11);
                    PointF pointF2 = new PointF(Math.max(width2, Math.min(iv0Var.f27271a + width2, this.f32890a.x + f22)), Math.max(A2, Math.min(f24 + A2, this.f32890a.y + f23)));
                    float f25 = pointF2.x - width2;
                    float f26 = iv0Var.f27271a;
                    this.f32893e = new PointF(f25 / f26, (((f26 - iv0Var.f27272b) / 2.0f) + (pointF2.y - A2)) / f26);
                }
            }
            invalidate();
            xe0 xe0Var = this.L;
            if (xe0Var != null) {
                PointF pointF3 = this.f32893e;
                float f27 = this.f32894f;
                float f28 = this.h;
                jf0 jf0Var = ((bf0) xe0Var).f24693a;
                jf0Var.f27468a0 = f28;
                jf0Var.f27470b0 = pointF3;
                jf0Var.f27472c0 = f27;
                jf0Var.f27473d0 = a(this.f32895n) + 1.5707964f;
                vz vzVar = jf0Var.f27483l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                    return;
                }
                return;
            }
            return;
        }
        boolean z14 = false;
        this.f32897s = motionEvent.getX();
        this.v = motionEvent.getY();
        if (Math.abs(f13 - f12) < N) {
            z14 = true;
        }
        float f29 = P;
        if (z14) {
            f7 = 0.0f;
        } else {
            f7 = f29;
        }
        if (!z14) {
            f14 = f29;
        }
        int i15 = this.H;
        float f30 = O;
        if (i15 == 0) {
            if (sqrt < f30) {
                this.M = 2;
                this.f32890a = actualCenterPoint;
                return;
            }
            float f31 = f12 - f29;
            if (abs > f31 && abs < f7 + f12) {
                this.M = 3;
                this.f32891b = abs;
                this.f32892c = f12;
            } else if (abs > f13 - f14 && abs < f13 + f29) {
                this.M = 4;
                this.f32891b = abs;
                this.f32892c = f13;
            } else if (abs <= f31 || abs >= f13 + f29) {
                this.M = 6;
            }
        } else if (i15 == 1) {
            if (sqrt < f30) {
                this.M = 2;
                this.f32890a = actualCenterPoint;
            } else if (sqrt > f12 - f29 && sqrt < f7 + f12) {
                this.M = 3;
                this.f32891b = sqrt;
                this.f32892c = f12;
            } else if (sqrt > f13 - f14 && sqrt < f29 + f13) {
                this.M = 4;
                this.f32891b = sqrt;
                this.f32892c = f13;
            }
        }
    }

    public final void d(int i10, MotionEvent motionEvent) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    this.M = 1;
                    return;
                }
                return;
            }
        } else {
            this.f32898w = b(motionEvent);
            this.f32899x = 1.0f;
            this.M = 5;
        }
        float b10 = b(motionEvent);
        float e7 = a4.a.e(b10 - this.f32898w, AndroidUtilities.density, 0.01f, this.f32899x);
        this.f32899x = e7;
        float max = Math.max(0.1f, this.f32894f * e7);
        this.f32894f = max;
        this.h = Math.max(max + 0.02f, this.h * this.f32899x);
        this.f32899x = 1.0f;
        this.f32898w = b10;
        invalidate();
        xe0 xe0Var = this.L;
        if (xe0Var != null) {
            PointF pointF = this.f32893e;
            float f7 = this.f32894f;
            float f10 = this.h;
            jf0 jf0Var = ((bf0) xe0Var).f24693a;
            jf0Var.f27468a0 = f10;
            jf0Var.f27470b0 = pointF;
            jf0Var.f27472c0 = f7;
            jf0Var.f27473d0 = a(this.f32895n) + 1.5707964f;
            vz vzVar = jf0Var.f27483l0;
            if (vzVar != null) {
                vzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.J;
        RectF rectF = this.f32896r;
        Paint paint3 = paint2;
        Paint paint4 = this.I;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i10 = this.H;
        int i11 = 0;
        if (i10 == 0) {
            canvas2.rotate(this.f32895n);
            float dp = AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            float dp3 = AndroidUtilities.dp(1.5f);
            int i12 = 0;
            while (i12 < 30) {
                float f7 = dp2 + dp;
                float f10 = i12 * f7;
                float f11 = -actualInnerRadius;
                float f12 = f10 + dp2;
                float f13 = dp3 - actualInnerRadius;
                canvas2.drawRect(f10, f11, f12, f13, paint4);
                float f14 = ((-i12) * f7) - dp;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ye0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(xe0 xe0Var) {
        this.L = xe0Var;
    }

    public void setType(int i10) {
        this.H = i10;
        invalidate();
    }
}
