package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ef0 extends FrameLayout {
    public static final float K = AndroidUtilities.dp(20.0f);
    public static final float L = AndroidUtilities.dp(30.0f);
    public static final float M = AndroidUtilities.dp(30.0f);
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public Paint F;
    public Paint G;
    public boolean H;
    public df0 I;
    public int J;
    public PointF f26572a;
    public float f26573b;
    public float f26574c;
    public jv0 d;
    public PointF f26575e;
    public float f26576f;
    public float h;
    public float f26577n;
    public RectF f26578r;
    public float f26579s;
    public float v;
    public float f26580w;
    public float f26581x;
    public boolean f26582y;

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
        int i10;
        jv0 jv0Var = this.d;
        float f10 = jv0Var.f28201a;
        float width = (this.f26575e.x * f10) + ((getWidth() - f10) / 2.0f);
        if (!this.H) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float height = getHeight();
        float f11 = jv0Var.f28202b;
        float x10 = e2.c.x(height, f11, 2.0f, i10);
        float f12 = jv0Var.f28201a;
        return new PointF(width, (this.f26575e.y * f12) + org.telegram.messenger.y3.a(f12, f11, 2.0f, x10));
    }

    private float getActualInnerRadius() {
        jv0 jv0Var = this.d;
        return Math.min(jv0Var.f28201a, jv0Var.f28202b) * this.f26576f;
    }

    private float getActualOuterRadius() {
        jv0 jv0Var = this.d;
        return Math.min(jv0Var.f28201a, jv0Var.f28202b) * this.h;
    }

    public final void c(int i10, MotionEvent motionEvent) {
        float f10;
        int i11;
        int i12;
        boolean z4;
        boolean z10;
        boolean z11;
        int i13;
        boolean z12 = this.H;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f11 = x10 - actualCenterPoint.x;
        float f12 = y10 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
        jv0 jv0Var = this.d;
        float min = Math.min(jv0Var.f28201a, jv0Var.f28202b);
        float f13 = this.f26576f * min;
        float f14 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.f26577n) + 1.5707963267948966d) * f12) + (Math.cos(a(this.f26577n) + 1.5707963267948966d) * f11));
        float f15 = 0.0f;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    this.J = 1;
                    return;
                }
                return;
            }
            int i14 = this.E;
            if (i14 == 0) {
                int c3 = m1.j.c(this.J);
                if (c3 != 1) {
                    if (c3 != 2) {
                        if (c3 != 3) {
                            if (c3 == 5) {
                                float f16 = x10 - this.f26579s;
                                float f17 = y10 - this.v;
                                if (x10 > actualCenterPoint.x) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (y10 > actualCenterPoint.y) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (Math.abs(f17) > Math.abs(f16)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z4 || z10 ? !(!z4 || z10 ? !z4 || !z10 ? !z11 ? f16 >= 0.0f : f17 >= 0.0f : !z11 ? f16 >= 0.0f : f17 <= 0.0f : !z11 ? f16 <= 0.0f : f17 <= 0.0f) : !(!z11 ? f16 <= 0.0f : f17 >= 0.0f)) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                this.f26577n = (((((float) Math.sqrt((f17 * f17) + (f16 * f16))) * ((i13 * 2) - 1)) / 3.1415927f) / 1.15f) + this.f26577n;
                                this.f26579s = x10;
                                this.v = y10;
                            }
                        } else {
                            this.h = Math.max(this.f26576f + 0.02f, (this.f26574c + (abs - this.f26573b)) / min);
                        }
                    } else {
                        this.f26576f = Math.min(Math.max(0.1f, (this.f26574c + (abs - this.f26573b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f18 = x10 - this.f26579s;
                    float f19 = y10 - this.v;
                    float width = (getWidth() - jv0Var.f28201a) / 2.0f;
                    if (!z12) {
                        i12 = AndroidUtilities.statusBarHeight;
                    } else {
                        i12 = 0;
                    }
                    float height = getHeight();
                    float f20 = jv0Var.f28202b;
                    float x11 = e2.c.x(height, f20, 2.0f, i12);
                    PointF pointF = new PointF(Math.max(width, Math.min(jv0Var.f28201a + width, this.f26572a.x + f18)), Math.max(x11, Math.min(f20 + x11, this.f26572a.y + f19)));
                    float f21 = pointF.x - width;
                    float f22 = jv0Var.f28201a;
                    this.f26575e = new PointF(f21 / f22, (((f22 - jv0Var.f28202b) / 2.0f) + (pointF.y - x11)) / f22);
                }
            } else if (i14 == 1) {
                int c10 = m1.j.c(this.J);
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 == 3) {
                            this.h = Math.max(this.f26576f + 0.02f, (this.f26574c + (sqrt - this.f26573b)) / min);
                        }
                    } else {
                        this.f26576f = Math.min(Math.max(0.1f, (this.f26574c + (sqrt - this.f26573b)) / min), this.h - 0.02f);
                    }
                } else {
                    float f23 = x10 - this.f26579s;
                    float f24 = y10 - this.v;
                    float width2 = (getWidth() - jv0Var.f28201a) / 2.0f;
                    if (!z12) {
                        i11 = AndroidUtilities.statusBarHeight;
                    } else {
                        i11 = 0;
                    }
                    float height2 = getHeight();
                    float f25 = jv0Var.f28202b;
                    float x12 = e2.c.x(height2, f25, 2.0f, i11);
                    PointF pointF2 = new PointF(Math.max(width2, Math.min(jv0Var.f28201a + width2, this.f26572a.x + f23)), Math.max(x12, Math.min(f25 + x12, this.f26572a.y + f24)));
                    float f26 = pointF2.x - width2;
                    float f27 = jv0Var.f28201a;
                    this.f26575e = new PointF(f26 / f27, (((f27 - jv0Var.f28202b) / 2.0f) + (pointF2.y - x12)) / f27);
                }
            }
            invalidate();
            df0 df0Var = this.I;
            if (df0Var != null) {
                PointF pointF3 = this.f26575e;
                float f28 = this.f26576f;
                float f29 = this.h;
                pf0 pf0Var = ((hf0) df0Var).f27499a;
                pf0Var.U = f29;
                pf0Var.V = pointF3;
                pf0Var.W = f28;
                pf0Var.f30048a0 = a(this.f26577n) + 1.5707964f;
                xz xzVar = pf0Var.f30060i0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                    return;
                }
                return;
            }
            return;
        }
        boolean z13 = false;
        this.f26579s = motionEvent.getX();
        this.v = motionEvent.getY();
        if (Math.abs(f14 - f13) < K) {
            z13 = true;
        }
        float f30 = M;
        if (z13) {
            f10 = 0.0f;
        } else {
            f10 = f30;
        }
        if (!z13) {
            f15 = f30;
        }
        int i15 = this.E;
        float f31 = L;
        if (i15 == 0) {
            if (sqrt < f31) {
                this.J = 2;
                this.f26572a = actualCenterPoint;
                return;
            }
            float f32 = f13 - f30;
            if (abs > f32 && abs < f10 + f13) {
                this.J = 3;
                this.f26573b = abs;
                this.f26574c = f13;
            } else if (abs > f14 - f15 && abs < f14 + f30) {
                this.J = 4;
                this.f26573b = abs;
                this.f26574c = f14;
            } else if (abs <= f32 || abs >= f14 + f30) {
                this.J = 6;
            }
        } else if (i15 == 1) {
            if (sqrt < f31) {
                this.J = 2;
                this.f26572a = actualCenterPoint;
            } else if (sqrt > f13 - f30 && sqrt < f10 + f13) {
                this.J = 3;
                this.f26573b = sqrt;
                this.f26574c = f13;
            } else if (sqrt > f14 - f15 && sqrt < f30 + f14) {
                this.J = 4;
                this.f26573b = sqrt;
                this.f26574c = f14;
            }
        }
    }

    public final void d(int i10, MotionEvent motionEvent) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    this.J = 1;
                    return;
                }
                return;
            }
        } else {
            this.f26580w = b(motionEvent);
            this.f26581x = 1.0f;
            this.J = 5;
        }
        float b10 = b(motionEvent);
        float c3 = w.c.c(b10 - this.f26580w, AndroidUtilities.density, 0.01f, this.f26581x);
        this.f26581x = c3;
        float max = Math.max(0.1f, this.f26576f * c3);
        this.f26576f = max;
        this.h = Math.max(max + 0.02f, this.h * this.f26581x);
        this.f26581x = 1.0f;
        this.f26580w = b10;
        invalidate();
        df0 df0Var = this.I;
        if (df0Var != null) {
            PointF pointF = this.f26575e;
            float f10 = this.f26576f;
            float f11 = this.h;
            pf0 pf0Var = ((hf0) df0Var).f27499a;
            pf0Var.U = f11;
            pf0Var.V = pointF;
            pf0Var.W = f10;
            pf0Var.f30048a0 = a(this.f26577n) + 1.5707964f;
            xz xzVar = pf0Var.f30060i0;
            if (xzVar != null) {
                xzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.G;
        RectF rectF = this.f26578r;
        Paint paint3 = paint2;
        Paint paint4 = this.F;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i10 = this.E;
        int i11 = 0;
        if (i10 == 0) {
            canvas2.rotate(this.f26577n);
            float dp = AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            float dp3 = AndroidUtilities.dp(1.5f);
            int i12 = 0;
            while (i12 < 30) {
                float f10 = dp2 + dp;
                float f11 = i12 * f10;
                float f12 = -actualInnerRadius;
                float f13 = f11 + dp2;
                float f14 = dp3 - actualInnerRadius;
                canvas2.drawRect(f11, f12, f13, f14, paint4);
                float f15 = ((-i12) * f10) - dp;
                float f16 = f15 - dp2;
                canvas.drawRect(f16, f12, f15, f14, paint4);
                float f17 = dp3 + actualInnerRadius;
                float f18 = actualInnerRadius;
                canvas.drawRect(f11, f18, f13, f17, paint4);
                canvas.drawRect(f16, f18, f15, f17, paint4);
                i12++;
                actualInnerRadius = f18;
                canvas2 = canvas;
            }
            float dp4 = AndroidUtilities.dp(6.0f);
            while (i11 < 64) {
                float f19 = dp4 + dp;
                float f20 = i11 * f19;
                float f21 = -actualOuterRadius;
                float f22 = dp4 + f20;
                float f23 = dp3 - actualOuterRadius;
                canvas.drawRect(f20, f21, f22, f23, paint4);
                float f24 = ((-i11) * f19) - dp;
                float f25 = f24 - dp4;
                canvas.drawRect(f25, f21, f24, f23, paint4);
                float f26 = dp3 + actualOuterRadius;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ef0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(df0 df0Var) {
        this.I = df0Var;
    }

    public void setType(int i10) {
        this.E = i10;
        invalidate();
    }
}
