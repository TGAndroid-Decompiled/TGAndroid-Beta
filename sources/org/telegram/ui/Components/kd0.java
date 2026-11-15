package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class kd0 extends FrameLayout {
    public static final float O = org.telegram.messenger.g0.L(20.0f);
    public static final float P = org.telegram.messenger.g0.L(30.0f);
    public static final float Q = org.telegram.messenger.g0.L(30.0f);
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public Paint J;
    public Paint K;
    public boolean L;
    public jd0 M;
    public int N;
    public PointF f36389a;
    public float f36390b;
    public float f36391c;
    public nt0 d;
    public PointF f36392e;
    public float f36393f;
    public float h;
    public float f36394n;
    public RectF f36395r;
    public float f36396s;
    public float f36397w;
    public float f36398x;
    public float f36399y;

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
        int i7;
        nt0 nt0Var = this.d;
        float f10 = nt0Var.f37713a;
        float width = (this.f36392e.x * f10) + ((getWidth() - f10) / 2.0f);
        if (!this.L) {
            i7 = org.telegram.messenger.g0.f23603m;
        } else {
            i7 = 0;
        }
        float height = getHeight();
        float f11 = nt0Var.f37714b;
        float A = com.google.android.gms.internal.vision.e2.A(height, f11, 2.0f, i7);
        float f12 = nt0Var.f37713a;
        return new PointF(width, (this.f36392e.y * f12) + org.telegram.messenger.k5.y(f12, f11, 2.0f, A));
    }

    private float getActualInnerRadius() {
        nt0 nt0Var = this.d;
        return Math.min(nt0Var.f37713a, nt0Var.f37714b) * this.f36393f;
    }

    private float getActualOuterRadius() {
        nt0 nt0Var = this.d;
        return Math.min(nt0Var.f37713a, nt0Var.f37714b) * this.h;
    }

    public final void c(int i7, MotionEvent motionEvent) {
        float f10;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13 = this.L;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f11 = x10 - actualCenterPoint.x;
        float f12 = y10 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
        nt0 nt0Var = this.d;
        float min = Math.min(nt0Var.f37713a, nt0Var.f37714b);
        float f13 = this.f36393f * min;
        float f14 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.f36394n) + 1.5707963267948966d) * f12) + (Math.cos(a(this.f36394n) + 1.5707963267948966d) * f11));
        float f15 = 0.0f;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3 || i7 == 4 || i7 == 5) {
                    this.N = 1;
                    return;
                }
                return;
            }
            int i13 = this.I;
            if (i13 == 0) {
                int c10 = p1.g.c(this.N);
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 == 5) {
                                float f16 = x10 - this.f36396s;
                                float f17 = y10 - this.f36397w;
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
                                this.f36394n = (((((float) Math.sqrt((f17 * f17) + (f16 * f16))) * ((i12 * 2) - 1)) / 3.1415927f) / 1.15f) + this.f36394n;
                                this.f36396s = x10;
                                this.f36397w = y10;
                            }
                        } else {
                            this.h = Math.max(this.f36393f + 0.02f, (this.f36391c + (abs - this.f36390b)) / min);
                        }
                    } else {
                        this.f36393f = Math.min(Math.max(0.1f, (this.f36391c + (abs - this.f36390b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f18 = x10 - this.f36396s;
                    float f19 = y10 - this.f36397w;
                    float width = (getWidth() - nt0Var.f37713a) / 2.0f;
                    if (!z13) {
                        i11 = org.telegram.messenger.g0.f23603m;
                    } else {
                        i11 = 0;
                    }
                    float height = getHeight();
                    float f20 = nt0Var.f37714b;
                    float A = com.google.android.gms.internal.vision.e2.A(height, f20, 2.0f, i11);
                    PointF pointF = new PointF(org.telegram.messenger.i20.z(this.f36389a.x, f18, nt0Var.f37713a + width, width), org.telegram.messenger.i20.z(this.f36389a.y, f19, f20 + A, A));
                    float f21 = pointF.x - width;
                    float f22 = nt0Var.f37713a;
                    this.f36392e = new PointF(f21 / f22, (((f22 - nt0Var.f37714b) / 2.0f) + (pointF.y - A)) / f22);
                }
            } else if (i13 == 1) {
                int c11 = p1.g.c(this.N);
                if (c11 != 1) {
                    if (c11 != 2) {
                        if (c11 == 3) {
                            this.h = Math.max(this.f36393f + 0.02f, (this.f36391c + (sqrt - this.f36390b)) / min);
                        }
                    } else {
                        this.f36393f = Math.min(Math.max(0.1f, (this.f36391c + (sqrt - this.f36390b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f23 = x10 - this.f36396s;
                    float f24 = y10 - this.f36397w;
                    float width2 = (getWidth() - nt0Var.f37713a) / 2.0f;
                    if (!z13) {
                        i10 = org.telegram.messenger.g0.f23603m;
                    } else {
                        i10 = 0;
                    }
                    float height2 = getHeight();
                    float f25 = nt0Var.f37714b;
                    float A2 = com.google.android.gms.internal.vision.e2.A(height2, f25, 2.0f, i10);
                    PointF pointF2 = new PointF(org.telegram.messenger.i20.z(this.f36389a.x, f23, nt0Var.f37713a + width2, width2), org.telegram.messenger.i20.z(this.f36389a.y, f24, f25 + A2, A2));
                    float f26 = pointF2.x - width2;
                    float f27 = nt0Var.f37713a;
                    this.f36392e = new PointF(f26 / f27, (((f27 - nt0Var.f37714b) / 2.0f) + (pointF2.y - A2)) / f27);
                }
            }
            invalidate();
            jd0 jd0Var = this.M;
            if (jd0Var != null) {
                PointF pointF3 = this.f36392e;
                float f28 = this.f36393f;
                float f29 = this.h;
                td0 td0Var = ((nd0) jd0Var).f37562a;
                td0Var.f39646b0 = f29;
                td0Var.f39648c0 = pointF3;
                td0Var.f39649d0 = f28;
                td0Var.f39651e0 = a(this.f36394n) + 1.5707964f;
                wy wyVar = td0Var.m0;
                if (wyVar != null) {
                    wyVar.c(false, false, false);
                    return;
                }
                return;
            }
            return;
        }
        boolean z14 = false;
        this.f36396s = motionEvent.getX();
        this.f36397w = motionEvent.getY();
        if (Math.abs(f14 - f13) < O) {
            z14 = true;
        }
        float f30 = Q;
        if (z14) {
            f10 = 0.0f;
        } else {
            f10 = f30;
        }
        if (!z14) {
            f15 = f30;
        }
        int i14 = this.I;
        float f31 = P;
        if (i14 == 0) {
            if (sqrt < f31) {
                this.N = 2;
                this.f36389a = actualCenterPoint;
                return;
            }
            float f32 = f13 - f30;
            if (abs > f32 && abs < f10 + f13) {
                this.N = 3;
                this.f36390b = abs;
                this.f36391c = f13;
            } else if (abs > f14 - f15 && abs < f14 + f30) {
                this.N = 4;
                this.f36390b = abs;
                this.f36391c = f14;
            } else if (abs <= f32 || abs >= f14 + f30) {
                this.N = 6;
            }
        } else if (i14 == 1) {
            if (sqrt < f31) {
                this.N = 2;
                this.f36389a = actualCenterPoint;
            } else if (sqrt > f13 - f30 && sqrt < f10 + f13) {
                this.N = 3;
                this.f36390b = sqrt;
                this.f36391c = f13;
            } else if (sqrt > f14 - f15 && sqrt < f30 + f14) {
                this.N = 4;
                this.f36390b = sqrt;
                this.f36391c = f14;
            }
        }
    }

    public final void d(int i7, MotionEvent motionEvent) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3 || i7 == 4 || i7 == 5) {
                    this.N = 1;
                    return;
                }
                return;
            }
        } else {
            this.f36398x = b(motionEvent);
            this.f36399y = 1.0f;
            this.N = 5;
        }
        float b10 = b(motionEvent);
        float c10 = com.google.android.gms.internal.vision.e2.c(b10 - this.f36398x, org.telegram.messenger.g0.f23608p, 0.01f, this.f36399y);
        this.f36399y = c10;
        float max = Math.max(0.1f, this.f36393f * c10);
        this.f36393f = max;
        this.h = Math.max(max + 0.02f, this.h * this.f36399y);
        this.f36399y = 1.0f;
        this.f36398x = b10;
        invalidate();
        jd0 jd0Var = this.M;
        if (jd0Var != null) {
            PointF pointF = this.f36392e;
            float f10 = this.f36393f;
            float f11 = this.h;
            td0 td0Var = ((nd0) jd0Var).f37562a;
            td0Var.f39646b0 = f11;
            td0Var.f39648c0 = pointF;
            td0Var.f39649d0 = f10;
            td0Var.f39651e0 = a(this.f36394n) + 1.5707964f;
            wy wyVar = td0Var.m0;
            if (wyVar != null) {
                wyVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.K;
        RectF rectF = this.f36395r;
        Paint paint3 = paint2;
        Paint paint4 = this.J;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i7 = this.I;
        int i10 = 0;
        if (i7 == 0) {
            canvas2.rotate(this.f36394n);
            float L = org.telegram.messenger.g0.L(6.0f);
            float L2 = org.telegram.messenger.g0.L(12.0f);
            float L3 = org.telegram.messenger.g0.L(1.5f);
            int i11 = 0;
            while (i11 < 30) {
                float f10 = L2 + L;
                float f11 = i11 * f10;
                float f12 = -actualInnerRadius;
                float f13 = f11 + L2;
                float f14 = L3 - actualInnerRadius;
                canvas2.drawRect(f11, f12, f13, f14, paint4);
                float f15 = ((-i11) * f10) - L;
                float f16 = f15 - L2;
                canvas.drawRect(f16, f12, f15, f14, paint4);
                float f17 = L3 + actualInnerRadius;
                float f18 = actualInnerRadius;
                canvas.drawRect(f11, f18, f13, f17, paint4);
                canvas.drawRect(f16, f18, f15, f17, paint4);
                i11++;
                actualInnerRadius = f18;
                canvas2 = canvas;
            }
            float L4 = org.telegram.messenger.g0.L(6.0f);
            while (i10 < 64) {
                float f19 = L4 + L;
                float f20 = i10 * f19;
                float f21 = -actualOuterRadius;
                float f22 = L4 + f20;
                float f23 = L3 - actualOuterRadius;
                canvas.drawRect(f20, f21, f22, f23, paint4);
                float f24 = ((-i10) * f19) - L;
                float f25 = f24 - L4;
                canvas.drawRect(f25, f21, f24, f23, paint4);
                float f26 = L3 + actualOuterRadius;
                float f27 = actualOuterRadius;
                canvas.drawRect(f20, f27, f22, f26, paint4);
                canvas.drawRect(f25, f27, f24, f26, paint4);
                i10++;
                actualOuterRadius = f27;
            }
            paint = paint4;
        } else {
            paint = paint4;
            if (i7 == 1) {
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
        canvas.drawCircle(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kd0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(jd0 jd0Var) {
        this.M = jd0Var;
    }

    public void setType(int i7) {
        this.I = i7;
        invalidate();
    }
}
