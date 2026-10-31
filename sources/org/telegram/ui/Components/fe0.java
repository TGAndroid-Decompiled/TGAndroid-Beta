package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class fe0 extends FrameLayout {
    public static final float N = org.telegram.messenger.i0.L(20.0f);
    public static final float O = org.telegram.messenger.i0.L(30.0f);
    public static final float P = org.telegram.messenger.i0.L(30.0f);
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public Paint I;
    public Paint J;
    public boolean K;
    public ee0 L;
    public int M;
    public PointF f26037a;
    public float f26038b;
    public float f26039c;
    public pu0 d;
    public PointF e;
    public float f26040f;
    public float h;
    public float f26041n;
    public RectF f26042r;
    public float f26043s;
    public float f26044w;
    public float f26045x;
    public float f26046y;

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
        pu0 pu0Var = this.d;
        float f7 = pu0Var.f29435a;
        float width = (this.e.x * f7) + ((getWidth() - f7) / 2.0f);
        if (!this.K) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        float height = getHeight();
        float f10 = pu0Var.f29436b;
        float B = c3.i0.B(height, f10, 2.0f, i10);
        float f11 = pu0Var.f29435a;
        return new PointF(width, (this.e.y * f11) + org.telegram.messenger.m5.y(f11, f10, 2.0f, B));
    }

    private float getActualInnerRadius() {
        pu0 pu0Var = this.d;
        return Math.min(pu0Var.f29435a, pu0Var.f29436b) * this.f26040f;
    }

    private float getActualOuterRadius() {
        pu0 pu0Var = this.d;
        return Math.min(pu0Var.f29435a, pu0Var.f29436b) * this.h;
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
        pu0 pu0Var = this.d;
        float min = Math.min(pu0Var.f29435a, pu0Var.f29436b);
        float f12 = this.f26040f * min;
        float f13 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.f26041n) + 1.5707963267948966d) * f11) + (Math.cos(a(this.f26041n) + 1.5707963267948966d) * f10));
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
                                float f15 = x10 - this.f26043s;
                                float f16 = y3 - this.f26044w;
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
                                this.f26041n = (((((float) Math.sqrt((f16 * f16) + (f15 * f15))) * ((i13 * 2) - 1)) / 3.1415927f) / 1.15f) + this.f26041n;
                                this.f26043s = x10;
                                this.f26044w = y3;
                            }
                        } else {
                            this.h = Math.max(this.f26040f + 0.02f, (this.f26039c + (abs - this.f26038b)) / min);
                        }
                    } else {
                        this.f26040f = Math.min(Math.max(0.1f, (this.f26039c + (abs - this.f26038b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f17 = x10 - this.f26043s;
                    float f18 = y3 - this.f26044w;
                    float width = (getWidth() - pu0Var.f29435a) / 2.0f;
                    if (!z13) {
                        i12 = org.telegram.messenger.i0.f16020m;
                    } else {
                        i12 = 0;
                    }
                    float height = getHeight();
                    float f19 = pu0Var.f29436b;
                    float B = c3.i0.B(height, f19, 2.0f, i12);
                    PointF pointF = new PointF(org.telegram.messenger.z20.z(this.f26037a.x, f17, pu0Var.f29435a + width, width), org.telegram.messenger.z20.z(this.f26037a.y, f18, f19 + B, B));
                    float f20 = pointF.x - width;
                    float f21 = pu0Var.f29435a;
                    this.e = new PointF(f20 / f21, (((f21 - pu0Var.f29436b) / 2.0f) + (pointF.y - B)) / f21);
                }
            } else if (i14 == 1) {
                int c11 = m1.j.c(this.M);
                if (c11 != 1) {
                    if (c11 != 2) {
                        if (c11 == 3) {
                            this.h = Math.max(this.f26040f + 0.02f, (this.f26039c + (sqrt - this.f26038b)) / min);
                        }
                    } else {
                        this.f26040f = Math.min(Math.max(0.1f, (this.f26039c + (sqrt - this.f26038b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f22 = x10 - this.f26043s;
                    float f23 = y3 - this.f26044w;
                    float width2 = (getWidth() - pu0Var.f29435a) / 2.0f;
                    if (!z13) {
                        i11 = org.telegram.messenger.i0.f16020m;
                    } else {
                        i11 = 0;
                    }
                    float height2 = getHeight();
                    float f24 = pu0Var.f29436b;
                    float B2 = c3.i0.B(height2, f24, 2.0f, i11);
                    PointF pointF2 = new PointF(org.telegram.messenger.z20.z(this.f26037a.x, f22, pu0Var.f29435a + width2, width2), org.telegram.messenger.z20.z(this.f26037a.y, f23, f24 + B2, B2));
                    float f25 = pointF2.x - width2;
                    float f26 = pu0Var.f29435a;
                    this.e = new PointF(f25 / f26, (((f26 - pu0Var.f29436b) / 2.0f) + (pointF2.y - B2)) / f26);
                }
            }
            invalidate();
            ee0 ee0Var = this.L;
            if (ee0Var != null) {
                PointF pointF3 = this.e;
                float f27 = this.f26040f;
                float f28 = this.h;
                oe0 oe0Var = ((ie0) ee0Var).f26972a;
                oe0Var.f29037a0 = f28;
                oe0Var.f29039b0 = pointF3;
                oe0Var.f29041c0 = f27;
                oe0Var.f29042d0 = a(this.f26041n) + 1.5707964f;
                gz gzVar = oe0Var.f29051l0;
                if (gzVar != null) {
                    gzVar.c(false, false, false);
                    return;
                }
                return;
            }
            return;
        }
        boolean z14 = false;
        this.f26043s = motionEvent.getX();
        this.f26044w = motionEvent.getY();
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
                this.f26037a = actualCenterPoint;
                return;
            }
            float f31 = f12 - f29;
            if (abs > f31 && abs < f7 + f12) {
                this.M = 3;
                this.f26038b = abs;
                this.f26039c = f12;
            } else if (abs > f13 - f14 && abs < f13 + f29) {
                this.M = 4;
                this.f26038b = abs;
                this.f26039c = f13;
            } else if (abs <= f31 || abs >= f13 + f29) {
                this.M = 6;
            }
        } else if (i15 == 1) {
            if (sqrt < f30) {
                this.M = 2;
                this.f26037a = actualCenterPoint;
            } else if (sqrt > f12 - f29 && sqrt < f7 + f12) {
                this.M = 3;
                this.f26038b = sqrt;
                this.f26039c = f12;
            } else if (sqrt > f13 - f14 && sqrt < f29 + f13) {
                this.M = 4;
                this.f26038b = sqrt;
                this.f26039c = f13;
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
            this.f26045x = b(motionEvent);
            this.f26046y = 1.0f;
            this.M = 5;
        }
        float b10 = b(motionEvent);
        float c10 = a1.g.c(b10 - this.f26045x, org.telegram.messenger.i0.f16025p, 0.01f, this.f26046y);
        this.f26046y = c10;
        float max = Math.max(0.1f, this.f26040f * c10);
        this.f26040f = max;
        this.h = Math.max(max + 0.02f, this.h * this.f26046y);
        this.f26046y = 1.0f;
        this.f26045x = b10;
        invalidate();
        ee0 ee0Var = this.L;
        if (ee0Var != null) {
            PointF pointF = this.e;
            float f7 = this.f26040f;
            float f10 = this.h;
            oe0 oe0Var = ((ie0) ee0Var).f26972a;
            oe0Var.f29037a0 = f10;
            oe0Var.f29039b0 = pointF;
            oe0Var.f29041c0 = f7;
            oe0Var.f29042d0 = a(this.f26041n) + 1.5707964f;
            gz gzVar = oe0Var.f29051l0;
            if (gzVar != null) {
                gzVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.J;
        RectF rectF = this.f26042r;
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
            canvas2.rotate(this.f26041n);
            float L = org.telegram.messenger.i0.L(6.0f);
            float L2 = org.telegram.messenger.i0.L(12.0f);
            float L3 = org.telegram.messenger.i0.L(1.5f);
            int i12 = 0;
            while (i12 < 30) {
                float f7 = L2 + L;
                float f10 = i12 * f7;
                float f11 = -actualInnerRadius;
                float f12 = f10 + L2;
                float f13 = L3 - actualInnerRadius;
                canvas2.drawRect(f10, f11, f12, f13, paint4);
                float f14 = ((-i12) * f7) - L;
                float f15 = f14 - L2;
                canvas.drawRect(f15, f11, f14, f13, paint4);
                float f16 = L3 + actualInnerRadius;
                float f17 = actualInnerRadius;
                canvas.drawRect(f10, f17, f12, f16, paint4);
                canvas.drawRect(f15, f17, f14, f16, paint4);
                i12++;
                actualInnerRadius = f17;
                canvas2 = canvas;
            }
            float L4 = org.telegram.messenger.i0.L(6.0f);
            while (i11 < 64) {
                float f18 = L4 + L;
                float f19 = i11 * f18;
                float f20 = -actualOuterRadius;
                float f21 = L4 + f19;
                float f22 = L3 - actualOuterRadius;
                canvas.drawRect(f19, f20, f21, f22, paint4);
                float f23 = ((-i11) * f18) - L;
                float f24 = f23 - L4;
                canvas.drawRect(f24, f20, f23, f22, paint4);
                float f25 = L3 + actualOuterRadius;
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
        canvas.drawCircle(0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fe0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ee0 ee0Var) {
        this.L = ee0Var;
    }

    public void setType(int i10) {
        this.H = i10;
        invalidate();
    }
}
