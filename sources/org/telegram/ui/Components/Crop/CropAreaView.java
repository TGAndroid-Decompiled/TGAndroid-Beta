package org.telegram.ui.Components.Crop;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
public class CropAreaView extends ViewGroup {
    public RectF E;
    public int F;
    public int G;
    public float H;
    public float I;
    public boolean J;
    public boolean K;
    public float L;
    public float M;
    public float N;
    public long O;
    public Paint P;
    public Paint Q;
    public Paint R;
    public Paint S;
    public Paint T;
    public Paint U;
    public AccelerateDecelerateInterpolator V;
    public float W;
    public int a;
    public float a0;
    public float b;
    public boolean b0;
    public float c;
    public float c0;
    public RectF d;
    public ObjectAnimator d0;
    public RectF e;
    public g33 e0;
    public RectF f;
    public boolean f0;
    public boolean g0;
    public RectF h;
    public Bitmap h0;
    public Paint i0;
    public String j0;
    public StaticLayout k0;
    public AnimatorSet l0;
    public RectF m0;
    public RectF n;
    public TextPaint n0;
    public float o0;
    public float p0;
    public float q0;
    public RectF r;
    public float r0;
    public RectF s;
    public int s0;
    public int t0;
    public int u0;
    public RectF w;
    public float x;
    public RectF y;

    public static void b(RectF rectF, float f) {
        float height = rectF.height();
        rectF.right = rectF.left + (f * height);
        rectF.bottom = rectF.top + height;
    }

    public static void c(RectF rectF, float f) {
        float width = rectF.width();
        rectF.right = rectF.left + width;
        rectF.bottom = rectF.top + (width / f);
    }

    private float getGridProgress() {
        return this.c0;
    }

    private void setCropBottom(float f) {
        this.y.bottom = f;
        invalidate();
    }

    private void setCropLeft(float f) {
        this.y.left = f;
        invalidate();
    }

    private void setCropRight(float f) {
        this.y.right = f;
        invalidate();
    }

    private void setCropTop(float f) {
        this.y.top = f;
        invalidate();
    }

    private void setGridProgress(float f) {
        this.c0 = f;
        invalidate();
    }

    public final void a(RectF rectF, float f) {
        int i;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = this.W;
        if (!this.b0) {
            i = hl.m;
        } else {
            i = 0;
        }
        float f7 = i;
        float measuredHeight = ((getMeasuredHeight() - this.H) - this.I) - f7;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f8 = f6 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f8;
        float measuredWidth2 = getMeasuredWidth() - f8;
        float f9 = measuredHeight - f8;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f10 = (measuredHeight / 2.0f) + f7 + this.I;
        if (Math.abs(1.0f - f) < 1.0E-4d) {
            float f11 = min / 2.0f;
            f5 = measuredWidth3 - f11;
            f2 = f10 - f11;
            f3 = measuredWidth3 + f11;
            f4 = f10 + f11;
        } else {
            if (f - measuredWidth <= 1.0E-4d) {
                float f12 = f9 * f;
                if (f12 <= measuredWidth2) {
                    float f13 = f12 / 2.0f;
                    float f14 = measuredWidth3 - f13;
                    float f15 = f9 / 2.0f;
                    float f16 = f10 - f15;
                    f3 = measuredWidth3 + f13;
                    f4 = f10 + f15;
                    f5 = f14;
                    f2 = f16;
                }
            }
            float f17 = measuredWidth2 / 2.0f;
            float f18 = measuredWidth3 - f17;
            float f19 = (measuredWidth2 / f) / 2.0f;
            f2 = f10 - f19;
            f3 = measuredWidth3 + f17;
            f4 = f10 + f19;
            f5 = f18;
        }
        rectF.set(f5, f2, f3, f4);
    }

    public final void d(RectF rectF) {
        rectF.set(this.y);
    }

    public final void e(int i, int i2, boolean z, boolean z2) {
        float f;
        this.g0 = z2;
        if (z) {
            f = i2 / i;
        } else {
            f = i / i2;
        }
        if (!z2) {
            f = 1.0f;
            this.x = 1.0f;
        }
        setActualRect(f);
    }

    public final void f(boolean z, boolean z2) {
        this.K = z;
        float f = 1.0f;
        if (z) {
            if (z2) {
                f = 0.0f;
            }
            this.M = f;
            this.O = SystemClock.elapsedRealtime();
            invalidate();
            return;
        }
        this.M = 1.0f;
    }

    public final void g(int i, boolean z) {
        float f;
        ObjectAnimator objectAnimator = this.d0;
        if (objectAnimator != null && (!z || this.u0 != i)) {
            objectAnimator.cancel();
            this.d0 = null;
        }
        int i2 = this.u0;
        if (i2 == i) {
            return;
        }
        this.t0 = i2;
        this.u0 = i;
        if (i == 1) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (!z) {
            this.c0 = f;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.c0, f);
        this.d0 = ofFloat;
        ofFloat.setDuration(200L);
        this.d0.addListener(new cn2(this, (byte) 2));
        if (i == 1) {
            this.d0.setStartDelay(200L);
        }
        this.d0.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.y;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.y.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.y;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.y;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.y;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.y.left;
    }

    public float getCropRight() {
        return this.y.right;
    }

    public float getCropTop() {
        return this.y.top;
    }

    public float getCropWidth() {
        RectF rectF = this.y;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.V;
    }

    public float getLockAspectRatio() {
        return this.x;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.m0;
        a(rectF, aspectRatio);
        return rectF;
    }

    public final void h(boolean z) {
        int i;
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | 4;
            } else {
                i = systemUiVisibility & (-5);
            }
            decorView.setSystemUiVisibility(i);
        } catch (Exception unused) {
        }
    }

    public final void i() {
        if (this.j0 != null) {
            if (this.n0 == null) {
                TextPaint textPaint = new TextPaint();
                this.n0 = textPaint;
                textPaint.setColor(vm2.o(-1, 120));
                this.n0.setTextSize(hl.L(13.0f));
                this.n0.setTextAlign(Paint.Align.CENTER);
            }
            this.k0 = new StaticLayout(this.j0, this.n0, getMeasuredWidth() - hl.L(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        this.k0 = null;
    }

    public final void j() {
        int L = hl.L(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.y;
        float f = rectF2.left;
        float f2 = L;
        float f3 = rectF2.top;
        rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
        RectF rectF3 = this.e;
        float f4 = rectF2.right;
        float f5 = rectF2.top;
        rectF3.set(f4 - f2, f5 - f2, f4 + f2, f5 + f2);
        RectF rectF4 = this.f;
        float f6 = rectF2.left;
        float f7 = rectF2.bottom;
        rectF4.set(f6 - f2, f7 - f2, f6 + f2, f7 + f2);
        RectF rectF5 = this.h;
        float f8 = rectF2.right;
        float f9 = rectF2.bottom;
        rectF5.set(f8 - f2, f9 - f2, f8 + f2, f9 + f2);
        float f10 = rectF2.top;
        this.n.set(rectF2.left + f2, f10 - f2, rectF2.right - f2, f10 + f2);
        RectF rectF6 = this.r;
        float f11 = rectF2.left;
        rectF6.set(f11 - f2, rectF2.top + f2, f11 + f2, rectF2.bottom - f2);
        RectF rectF7 = this.w;
        float f12 = rectF2.right;
        rectF7.set(f12 - f2, rectF2.top + f2, f12 + f2, rectF2.bottom - f2);
        float f13 = rectF2.bottom;
        this.s.set(rectF2.left + f2, f13 - f2, rectF2.right - f2, f13 + f2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Crop.CropAreaView.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        float f = this.W;
        RectF rectF = this.E;
        int x = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        if (!this.b0) {
            i = hl.m;
        } else {
            i = 0;
        }
        float f2 = i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.g0) {
                float f3 = x;
                float f4 = y;
                if (this.d.contains(f3, f4)) {
                    this.s0 = 2;
                } else if (this.e.contains(f3, f4)) {
                    this.s0 = 3;
                } else if (this.f.contains(f3, f4)) {
                    this.s0 = 4;
                } else if (this.h.contains(f3, f4)) {
                    this.s0 = 5;
                } else if (this.r.contains(f3, f4)) {
                    this.s0 = 7;
                } else if (this.n.contains(f3, f4)) {
                    this.s0 = 6;
                } else if (this.w.contains(f3, f4)) {
                    this.s0 = 9;
                } else if (this.s.contains(f3, f4)) {
                    this.s0 = 8;
                } else {
                    this.s0 = 1;
                    return false;
                }
                this.F = x;
                this.G = y;
                g(3, false);
                this.f0 = true;
                h(true);
                g33 g33Var = this.e0;
                if (g33Var != null) {
                    b43 b43Var = (b43) g33Var;
                    b43Var.a.d(b43Var.f);
                    b43Var.n = 0.0f;
                    a43 a43Var = b43Var.N;
                    if (a43Var != null) {
                        a43Var.F0(false);
                        return true;
                    }
                }
            } else {
                this.s0 = 1;
                return false;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2 && this.s0 != 1) {
                rectF.set(this.y);
                float f5 = x - this.F;
                float f6 = y - this.G;
                this.F = x;
                this.G = y;
                if (Math.abs(f5) > Math.abs(f6)) {
                    z = true;
                } else {
                    z = false;
                }
                switch (ik8.F(this.s0)) {
                    case 1:
                        rectF.left += f5;
                        rectF.top += f6;
                        if (this.x > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            float f7 = this.x;
                            if (z) {
                                c(rectF, f7);
                            } else {
                                b(rectF, f7);
                            }
                            rectF.left -= rectF.width() - width;
                            rectF.top -= rectF.width() - height;
                            break;
                        }
                        break;
                    case 2:
                        rectF.right += f5;
                        rectF.top += f6;
                        if (this.x > 0.0f) {
                            float height2 = rectF.height();
                            float f8 = this.x;
                            if (z) {
                                c(rectF, f8);
                            } else {
                                b(rectF, f8);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f5;
                        rectF.bottom += f6;
                        if (this.x > 0.0f) {
                            float width2 = rectF.width();
                            float f9 = this.x;
                            if (z) {
                                c(rectF, f9);
                            } else {
                                b(rectF, f9);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f5;
                        rectF.bottom += f6;
                        float f10 = this.x;
                        if (f10 > 0.0f) {
                            if (z) {
                                c(rectF, f10);
                                break;
                            } else {
                                b(rectF, f10);
                                break;
                            }
                        }
                        break;
                    case 5:
                        rectF.top += f6;
                        float f11 = this.x;
                        if (f11 > 0.0f) {
                            b(rectF, f11);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f5;
                        float f12 = this.x;
                        if (f12 > 0.0f) {
                            c(rectF, f12);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f6;
                        float f13 = this.x;
                        if (f13 > 0.0f) {
                            b(rectF, f13);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f5;
                        float f14 = this.x;
                        if (f14 > 0.0f) {
                            c(rectF, f14);
                            break;
                        }
                        break;
                }
                if (rectF.left < f) {
                    float f15 = this.x;
                    if (f15 > 0.0f) {
                        rectF.bottom = bp1.z(rectF.right, f, f15, rectF.top);
                    }
                    rectF.left = f;
                } else if (rectF.right > getWidth() - f) {
                    rectF.right = getWidth() - f;
                    if (this.x > 0.0f) {
                        rectF.bottom = (rectF.width() / this.x) + rectF.top;
                    }
                }
                float f16 = f2 + this.I + f;
                float f17 = this.H + f;
                if (rectF.top < f16) {
                    float f18 = this.x;
                    if (f18 > 0.0f) {
                        rectF.right = qd4.A(rectF.bottom, f16, f18, rectF.left);
                    }
                    rectF.top = f16;
                } else if (rectF.bottom > getHeight() - f17) {
                    rectF.bottom = getHeight() - f17;
                    if (this.x > 0.0f) {
                        rectF.right = (rectF.height() * this.x) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f19 = this.a0;
                if (width3 < f19) {
                    rectF.right = rectF.left + f19;
                }
                float height3 = rectF.height();
                float f20 = this.a0;
                if (height3 < f20) {
                    rectF.bottom = rectF.top + f20;
                }
                float f21 = this.x;
                if (f21 > 0.0f) {
                    if (f21 < 1.0f) {
                        float width4 = rectF.width();
                        float f22 = this.a0;
                        if (width4 <= f22) {
                            rectF.right = rectF.left + f22;
                            rectF.bottom = (rectF.width() / this.x) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f23 = this.a0;
                        if (height4 <= f23) {
                            rectF.bottom = rectF.top + f23;
                            rectF.right = (rectF.height() * this.x) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                g33 g33Var2 = this.e0;
                if (g33Var2 != null) {
                    b43 b43Var2 = (b43) g33Var2;
                    CropAreaView cropAreaView = b43Var2.a;
                    cropAreaView.g(3, false);
                    RectF rectF2 = b43Var2.f;
                    float centerX = rectF2.centerX() - cropAreaView.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView.getCropCenterY();
                    z33 z33Var = b43Var2.M;
                    if (z33Var != null) {
                        z33Var.g(centerX, centerY);
                    }
                    b43Var2.r(false);
                    rectF2.set(cropAreaView.y);
                    b43Var2.d(true, false, false, false);
                    return true;
                }
            }
            return false;
        } else {
            this.f0 = false;
            h(false);
            if (this.s0 != 1) {
                this.s0 = 1;
                g33 g33Var3 = this.e0;
                if (g33Var3 != null) {
                    b43 b43Var3 = (b43) g33Var3;
                    CropAreaView cropAreaView2 = b43Var3.a;
                    cropAreaView2.g(1, true);
                    b43Var3.c(cropAreaView2.getTargetRectToFill());
                }
            }
            return false;
        }
        return true;
    }

    public void setActualRect(float f) {
        a(this.y, f);
        j();
        invalidate();
    }

    public void setBottomPadding(float f) {
        this.H = f;
    }

    public void setDimAlpha(float f) {
        this.L = f;
    }

    public void setDimVisibility(boolean z) {
        this.J = z;
    }

    public void setFrameAlpha(float f) {
        this.N = f;
    }

    public void setFreeform(boolean z) {
        this.g0 = z;
    }

    public void setIsVideo(boolean z) {
        float f;
        if (z) {
            f = 64.0f;
        } else {
            f = 32.0f;
        }
        this.a0 = hl.L(f);
    }

    public void setListener(g33 g33Var) {
        this.e0 = g33Var;
    }

    public void setLockedAspectRatio(float f) {
        this.x = f;
    }

    public void setSubtitle(String str) {
        this.j0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f) {
        this.I = f;
    }

    public void setActualRect(RectF rectF) {
        this.y.set(rectF);
        j();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
