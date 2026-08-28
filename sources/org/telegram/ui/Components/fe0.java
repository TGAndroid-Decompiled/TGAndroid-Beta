package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fe0 extends FrameLayout {
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
    public ee0 H;
    public int I;
    public PointF f28395a;
    public float f28396b;
    public float f28397c;
    public qu0 d;
    public PointF f28398e;
    public float f28399f;
    public float h;
    public float f28400n;
    public RectF f28401r;
    public float f28402s;
    public float v;
    public float f28403w;
    public float f28404x;
    public boolean f28405y;

    public static float a(float f10) {
        return (f10 * 3.1415927f) / 180.0f;
    }

    public static float b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x10 = motionEvent.getX(0);
        float y10 = motionEvent.getY(0);
        float x11 = x10 - motionEvent.getX(1);
        float y11 = y10 - motionEvent.getY(1);
        return (float) Math.sqrt((y11 * y11) + (x11 * x11));
    }

    private PointF getActualCenterPoint() {
        int i9;
        qu0 qu0Var = this.d;
        float f10 = qu0Var.f32026a;
        float width = (this.f28398e.x * f10) + ((getWidth() - f10) / 2.0f);
        if (!this.G) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        float height = getHeight();
        float f11 = qu0Var.f32027b;
        float A = e2.c.A(height, f11, 2.0f, i9);
        float f12 = qu0Var.f32026a;
        return new PointF(width, (this.f28398e.y * f12) + org.telegram.messenger.l0.a(f12, f11, 2.0f, A));
    }

    private float getActualInnerRadius() {
        qu0 qu0Var = this.d;
        return Math.min(qu0Var.f32026a, qu0Var.f32027b) * this.f28399f;
    }

    private float getActualOuterRadius() {
        qu0 qu0Var = this.d;
        return Math.min(qu0Var.f32026a, qu0Var.f32027b) * this.h;
    }

    public final void c(int i9, MotionEvent motionEvent) {
        float f10;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13 = this.G;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f11 = x10 - actualCenterPoint.x;
        float f12 = y10 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
        qu0 qu0Var = this.d;
        float min = Math.min(qu0Var.f32026a, qu0Var.f32027b);
        float f13 = this.f28399f * min;
        float f14 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.f28400n) + 1.5707963267948966d) * f12) + (Math.cos(a(this.f28400n) + 1.5707963267948966d) * f11));
        float f15 = 0.0f;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3 || i9 == 4 || i9 == 5) {
                    this.I = 1;
                    return;
                }
                return;
            }
            int i13 = this.D;
            if (i13 == 0) {
                int b10 = m1.j.b(this.I);
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 == 5) {
                                float f16 = x10 - this.f28402s;
                                float f17 = y10 - this.v;
                                if (x10 > actualCenterPoint.x) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (y10 > actualCenterPoint.y) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (Math.abs(f17) > Math.abs(f16)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z10 || z11 ? !(!z10 || z11 ? !z10 || !z11 ? !z12 ? f16 >= 0.0f : f17 >= 0.0f : !z12 ? f16 >= 0.0f : f17 <= 0.0f : !z12 ? f16 <= 0.0f : f17 <= 0.0f) : !(!z12 ? f16 <= 0.0f : f17 >= 0.0f)) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                this.f28400n = (((((float) Math.sqrt((f17 * f17) + (f16 * f16))) * ((i12 * 2) - 1)) / 3.1415927f) / 1.15f) + this.f28400n;
                                this.f28402s = x10;
                                this.v = y10;
                            }
                        } else {
                            this.h = Math.max(this.f28399f + 0.02f, (this.f28397c + (abs - this.f28396b)) / min);
                        }
                    } else {
                        this.f28399f = Math.min(Math.max(0.1f, (this.f28397c + (abs - this.f28396b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f18 = x10 - this.f28402s;
                    float f19 = y10 - this.v;
                    float width = (getWidth() - qu0Var.f32026a) / 2.0f;
                    if (!z13) {
                        i11 = AndroidUtilities.statusBarHeight;
                    } else {
                        i11 = 0;
                    }
                    float height = getHeight();
                    float f20 = qu0Var.f32027b;
                    float A = e2.c.A(height, f20, 2.0f, i11);
                    PointF pointF = new PointF(Math.max(width, Math.min(qu0Var.f32026a + width, this.f28395a.x + f18)), Math.max(A, Math.min(f20 + A, this.f28395a.y + f19)));
                    float f21 = pointF.x - width;
                    float f22 = qu0Var.f32026a;
                    this.f28398e = new PointF(f21 / f22, (((f22 - qu0Var.f32027b) / 2.0f) + (pointF.y - A)) / f22);
                }
            } else if (i13 == 1) {
                int b11 = m1.j.b(this.I);
                if (b11 != 1) {
                    if (b11 != 2) {
                        if (b11 == 3) {
                            this.h = Math.max(this.f28399f + 0.02f, (this.f28397c + (sqrt - this.f28396b)) / min);
                        }
                    } else {
                        this.f28399f = Math.min(Math.max(0.1f, (this.f28397c + (sqrt - this.f28396b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f23 = x10 - this.f28402s;
                    float f24 = y10 - this.v;
                    float width2 = (getWidth() - qu0Var.f32026a) / 2.0f;
                    if (!z13) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    float height2 = getHeight();
                    float f25 = qu0Var.f32027b;
                    float A2 = e2.c.A(height2, f25, 2.0f, i10);
                    PointF pointF2 = new PointF(Math.max(width2, Math.min(qu0Var.f32026a + width2, this.f28395a.x + f23)), Math.max(A2, Math.min(f25 + A2, this.f28395a.y + f24)));
                    float f26 = pointF2.x - width2;
                    float f27 = qu0Var.f32026a;
                    this.f28398e = new PointF(f26 / f27, (((f27 - qu0Var.f32027b) / 2.0f) + (pointF2.y - A2)) / f27);
                }
            }
            invalidate();
            ee0 ee0Var = this.H;
            if (ee0Var != null) {
                PointF pointF3 = this.f28398e;
                float f28 = this.f28399f;
                float f29 = this.h;
                qe0 qe0Var = ((ie0) ee0Var).f29422a;
                qe0Var.T = f29;
                qe0Var.U = pointF3;
                qe0Var.V = f28;
                qe0Var.W = a(this.f28400n) + 1.5707964f;
                hz hzVar = qe0Var.f31902h0;
                if (hzVar != null) {
                    hzVar.e(false, false, false);
                    return;
                }
                return;
            }
            return;
        }
        boolean z14 = false;
        this.f28402s = motionEvent.getX();
        this.v = motionEvent.getY();
        if (Math.abs(f14 - f13) < J) {
            z14 = true;
        }
        float f30 = L;
        if (z14) {
            f10 = 0.0f;
        } else {
            f10 = f30;
        }
        if (!z14) {
            f15 = f30;
        }
        int i14 = this.D;
        float f31 = K;
        if (i14 == 0) {
            if (sqrt < f31) {
                this.I = 2;
                this.f28395a = actualCenterPoint;
                return;
            }
            float f32 = f13 - f30;
            if (abs > f32 && abs < f10 + f13) {
                this.I = 3;
                this.f28396b = abs;
                this.f28397c = f13;
            } else if (abs > f14 - f15 && abs < f14 + f30) {
                this.I = 4;
                this.f28396b = abs;
                this.f28397c = f14;
            } else if (abs <= f32 || abs >= f14 + f30) {
                this.I = 6;
            }
        } else if (i14 == 1) {
            if (sqrt < f31) {
                this.I = 2;
                this.f28395a = actualCenterPoint;
            } else if (sqrt > f13 - f30 && sqrt < f10 + f13) {
                this.I = 3;
                this.f28396b = sqrt;
                this.f28397c = f13;
            } else if (sqrt > f14 - f15 && sqrt < f30 + f14) {
                this.I = 4;
                this.f28396b = sqrt;
                this.f28397c = f14;
            }
        }
    }

    public final void d(int i9, MotionEvent motionEvent) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3 || i9 == 4 || i9 == 5) {
                    this.I = 1;
                    return;
                }
                return;
            }
        } else {
            this.f28403w = b(motionEvent);
            this.f28404x = 1.0f;
            this.I = 5;
        }
        float b10 = b(motionEvent);
        float b11 = org.telegram.ui.Cells.j2.b(b10 - this.f28403w, AndroidUtilities.density, 0.01f, this.f28404x);
        this.f28404x = b11;
        float max = Math.max(0.1f, this.f28399f * b11);
        this.f28399f = max;
        this.h = Math.max(max + 0.02f, this.h * this.f28404x);
        this.f28404x = 1.0f;
        this.f28403w = b10;
        invalidate();
        ee0 ee0Var = this.H;
        if (ee0Var != null) {
            PointF pointF = this.f28398e;
            float f10 = this.f28399f;
            float f11 = this.h;
            qe0 qe0Var = ((ie0) ee0Var).f29422a;
            qe0Var.T = f11;
            qe0Var.U = pointF;
            qe0Var.V = f10;
            qe0Var.W = a(this.f28400n) + 1.5707964f;
            hz hzVar = qe0Var.f31902h0;
            if (hzVar != null) {
                hzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.F;
        RectF rectF = this.f28401r;
        Paint paint3 = paint2;
        Paint paint4 = this.E;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i9 = this.D;
        int i10 = 0;
        if (i9 == 0) {
            canvas2.rotate(this.f28400n);
            float dp = AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            float dp3 = AndroidUtilities.dp(1.5f);
            int i11 = 0;
            while (i11 < 30) {
                float f10 = dp2 + dp;
                float f11 = i11 * f10;
                float f12 = -actualInnerRadius;
                float f13 = f11 + dp2;
                float f14 = dp3 - actualInnerRadius;
                canvas2.drawRect(f11, f12, f13, f14, paint4);
                float f15 = ((-i11) * f10) - dp;
                float f16 = f15 - dp2;
                canvas.drawRect(f16, f12, f15, f14, paint4);
                float f17 = dp3 + actualInnerRadius;
                float f18 = actualInnerRadius;
                canvas.drawRect(f11, f18, f13, f17, paint4);
                canvas.drawRect(f16, f18, f15, f17, paint4);
                i11++;
                actualInnerRadius = f18;
                canvas2 = canvas;
            }
            float dp4 = AndroidUtilities.dp(6.0f);
            while (i10 < 64) {
                float f19 = dp4 + dp;
                float f20 = i10 * f19;
                float f21 = -actualOuterRadius;
                float f22 = dp4 + f20;
                float f23 = dp3 - actualOuterRadius;
                canvas.drawRect(f20, f21, f22, f23, paint4);
                float f24 = ((-i10) * f19) - dp;
                float f25 = f24 - dp4;
                canvas.drawRect(f25, f21, f24, f23, paint4);
                float f26 = dp3 + actualOuterRadius;
                float f27 = actualOuterRadius;
                canvas.drawRect(f20, f27, f22, f26, paint4);
                canvas.drawRect(f25, f27, f24, f26, paint4);
                i10++;
                actualOuterRadius = f27;
            }
            paint = paint4;
        } else {
            paint = paint4;
            if (i9 == 1) {
                float f28 = -actualInnerRadius;
                rectF.set(f28, f28, actualInnerRadius, actualInnerRadius);
                int i12 = 0;
                while (i12 < 22) {
                    Paint paint5 = paint3;
                    canvas.drawArc(rectF, i12 * 16.35f, 10.2f, false, paint5);
                    i12++;
                    paint3 = paint5;
                }
                Paint paint6 = paint3;
                float f29 = -actualOuterRadius;
                rectF.set(f29, f29, actualOuterRadius, actualOuterRadius);
                while (i10 < 64) {
                    canvas.drawArc(rectF, 5.62f * i10, 3.6f, false, paint6);
                    i10++;
                }
            }
        }
        canvas.drawCircle(0.0f, 0.0f, AndroidUtilities.dp(8.0f), paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fe0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ee0 ee0Var) {
        this.H = ee0Var;
    }

    public void setType(int i9) {
        this.D = i9;
        invalidate();
    }
}
