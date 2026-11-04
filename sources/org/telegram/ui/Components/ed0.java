package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class ed0 extends FrameLayout {
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
    public dd0 M;
    public int N;
    public PointF f33360a;
    public float f33361b;
    public float f33362c;
    public lt0 d;
    public PointF f33363e;
    public float f33364f;
    public float h;
    public float f33365n;
    public RectF f33366r;
    public float f33367s;
    public float f33368w;
    public float f33369x;
    public float f33370y;

    public static float a(float f10) {
        return (f10 * 3.1415927f) / 180.0f;
    }

    public static float b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x10 = motionEvent.getX(0);
        float y9 = motionEvent.getY(0);
        float x11 = x10 - motionEvent.getX(1);
        float y10 = y9 - motionEvent.getY(1);
        return (float) Math.sqrt((y10 * y10) + (x11 * x11));
    }

    private PointF getActualCenterPoint() {
        int i3;
        lt0 lt0Var = this.d;
        float f10 = lt0Var.f35877a;
        float width = (this.f33363e.x * f10) + ((getWidth() - f10) / 2.0f);
        if (!this.L) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        float height = getHeight();
        float f11 = lt0Var.f35878b;
        float z10 = com.google.android.recaptcha.internal.a.z(height, f11, 2.0f, i3);
        float f12 = lt0Var.f35877a;
        return new PointF(width, (this.f33363e.y * f12) + org.telegram.messenger.k5.y(f12, f11, 2.0f, z10));
    }

    private float getActualInnerRadius() {
        lt0 lt0Var = this.d;
        return Math.min(lt0Var.f35877a, lt0Var.f35878b) * this.f33364f;
    }

    private float getActualOuterRadius() {
        lt0 lt0Var = this.d;
        return Math.min(lt0Var.f35877a, lt0Var.f35878b) * this.h;
    }

    public final void c(int i3, MotionEvent motionEvent) {
        float f10;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13 = this.L;
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f11 = x10 - actualCenterPoint.x;
        float f12 = y9 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
        lt0 lt0Var = this.d;
        float min = Math.min(lt0Var.f35877a, lt0Var.f35878b);
        float f13 = this.f33364f * min;
        float f14 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.f33365n) + 1.5707963267948966d) * f12) + (Math.cos(a(this.f33365n) + 1.5707963267948966d) * f11));
        float f15 = 0.0f;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    this.N = 1;
                    return;
                }
                return;
            }
            int i13 = this.I;
            if (i13 == 0) {
                int c2 = o1.g.c(this.N);
                if (c2 != 1) {
                    if (c2 != 2) {
                        if (c2 != 3) {
                            if (c2 == 5) {
                                float f16 = x10 - this.f33367s;
                                float f17 = y9 - this.f33368w;
                                if (x10 > actualCenterPoint.x) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (y9 > actualCenterPoint.y) {
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
                                this.f33365n = (((((float) Math.sqrt((f17 * f17) + (f16 * f16))) * ((i12 * 2) - 1)) / 3.1415927f) / 1.15f) + this.f33365n;
                                this.f33367s = x10;
                                this.f33368w = y9;
                            }
                        } else {
                            this.h = Math.max(this.f33364f + 0.02f, (this.f33362c + (abs - this.f33361b)) / min);
                        }
                    } else {
                        this.f33364f = Math.min(Math.max(0.1f, (this.f33362c + (abs - this.f33361b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f18 = x10 - this.f33367s;
                    float f19 = y9 - this.f33368w;
                    float width = (getWidth() - lt0Var.f35877a) / 2.0f;
                    if (!z13) {
                        i11 = org.telegram.messenger.g0.f22602m;
                    } else {
                        i11 = 0;
                    }
                    float height = getHeight();
                    float f20 = lt0Var.f35878b;
                    float z14 = com.google.android.recaptcha.internal.a.z(height, f20, 2.0f, i11);
                    PointF pointF = new PointF(org.telegram.messenger.camera.q.z(this.f33360a.x, f18, lt0Var.f35877a + width, width), org.telegram.messenger.camera.q.z(this.f33360a.y, f19, f20 + z14, z14));
                    float f21 = pointF.x - width;
                    float f22 = lt0Var.f35877a;
                    this.f33363e = new PointF(f21 / f22, (((f22 - lt0Var.f35878b) / 2.0f) + (pointF.y - z14)) / f22);
                }
            } else if (i13 == 1) {
                int c10 = o1.g.c(this.N);
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 == 3) {
                            this.h = Math.max(this.f33364f + 0.02f, (this.f33362c + (sqrt - this.f33361b)) / min);
                        }
                    } else {
                        this.f33364f = Math.min(Math.max(0.1f, (this.f33362c + (sqrt - this.f33361b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f23 = x10 - this.f33367s;
                    float f24 = y9 - this.f33368w;
                    float width2 = (getWidth() - lt0Var.f35877a) / 2.0f;
                    if (!z13) {
                        i10 = org.telegram.messenger.g0.f22602m;
                    } else {
                        i10 = 0;
                    }
                    float height2 = getHeight();
                    float f25 = lt0Var.f35878b;
                    float z15 = com.google.android.recaptcha.internal.a.z(height2, f25, 2.0f, i10);
                    PointF pointF2 = new PointF(org.telegram.messenger.camera.q.z(this.f33360a.x, f23, lt0Var.f35877a + width2, width2), org.telegram.messenger.camera.q.z(this.f33360a.y, f24, f25 + z15, z15));
                    float f26 = pointF2.x - width2;
                    float f27 = lt0Var.f35877a;
                    this.f33363e = new PointF(f26 / f27, (((f27 - lt0Var.f35878b) / 2.0f) + (pointF2.y - z15)) / f27);
                }
            }
            invalidate();
            dd0 dd0Var = this.M;
            if (dd0Var != null) {
                PointF pointF3 = this.f33363e;
                float f28 = this.f33364f;
                float f29 = this.h;
                nd0 nd0Var = ((hd0) dd0Var).f34370a;
                nd0Var.f36460b0 = f29;
                nd0Var.f36462c0 = pointF3;
                nd0Var.f36463d0 = f28;
                nd0Var.f36465e0 = a(this.f33365n) + 1.5707964f;
                py pyVar = nd0Var.m0;
                if (pyVar != null) {
                    pyVar.c(false, false, false);
                    return;
                }
                return;
            }
            return;
        }
        boolean z16 = false;
        this.f33367s = motionEvent.getX();
        this.f33368w = motionEvent.getY();
        if (Math.abs(f14 - f13) < O) {
            z16 = true;
        }
        float f30 = Q;
        if (z16) {
            f10 = 0.0f;
        } else {
            f10 = f30;
        }
        if (!z16) {
            f15 = f30;
        }
        int i14 = this.I;
        float f31 = P;
        if (i14 == 0) {
            if (sqrt < f31) {
                this.N = 2;
                this.f33360a = actualCenterPoint;
                return;
            }
            float f32 = f13 - f30;
            if (abs > f32 && abs < f10 + f13) {
                this.N = 3;
                this.f33361b = abs;
                this.f33362c = f13;
            } else if (abs > f14 - f15 && abs < f14 + f30) {
                this.N = 4;
                this.f33361b = abs;
                this.f33362c = f14;
            } else if (abs <= f32 || abs >= f14 + f30) {
                this.N = 6;
            }
        } else if (i14 == 1) {
            if (sqrt < f31) {
                this.N = 2;
                this.f33360a = actualCenterPoint;
            } else if (sqrt > f13 - f30 && sqrt < f10 + f13) {
                this.N = 3;
                this.f33361b = sqrt;
                this.f33362c = f13;
            } else if (sqrt > f14 - f15 && sqrt < f30 + f14) {
                this.N = 4;
                this.f33361b = sqrt;
                this.f33362c = f14;
            }
        }
    }

    public final void d(int i3, MotionEvent motionEvent) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    this.N = 1;
                    return;
                }
                return;
            }
        } else {
            this.f33369x = b(motionEvent);
            this.f33370y = 1.0f;
            this.N = 5;
        }
        float b10 = b(motionEvent);
        float A = a1.g.A(b10 - this.f33369x, org.telegram.messenger.g0.f22607p, 0.01f, this.f33370y);
        this.f33370y = A;
        float max = Math.max(0.1f, this.f33364f * A);
        this.f33364f = max;
        this.h = Math.max(max + 0.02f, this.h * this.f33370y);
        this.f33370y = 1.0f;
        this.f33369x = b10;
        invalidate();
        dd0 dd0Var = this.M;
        if (dd0Var != null) {
            PointF pointF = this.f33363e;
            float f10 = this.f33364f;
            float f11 = this.h;
            nd0 nd0Var = ((hd0) dd0Var).f34370a;
            nd0Var.f36460b0 = f11;
            nd0Var.f36462c0 = pointF;
            nd0Var.f36463d0 = f10;
            nd0Var.f36465e0 = a(this.f33365n) + 1.5707964f;
            py pyVar = nd0Var.m0;
            if (pyVar != null) {
                pyVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.K;
        RectF rectF = this.f33366r;
        Paint paint3 = paint2;
        Paint paint4 = this.J;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i3 = this.I;
        int i10 = 0;
        if (i3 == 0) {
            canvas2.rotate(this.f33365n);
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
            if (i3 == 1) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ed0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(dd0 dd0Var) {
        this.M = dd0Var;
    }

    public void setType(int i3) {
        this.I = i3;
        invalidate();
    }
}
