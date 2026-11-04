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
import o1.g;
import org.telegram.messenger.g0;
import org.telegram.ui.i81;
import pg.a;
import pg.k;
import pg.l;
import pg.m;
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
    public int f31369a;
    public float f31370a0;
    public float f31371b;
    public boolean f31372b0;
    public float f31373c;
    public float f31374c0;
    public RectF d;
    public ObjectAnimator f31375d0;
    public RectF f31376e;
    public a f31377e0;
    public RectF f31378f;
    public boolean f31379f0;
    public boolean f31380g0;
    public RectF h;
    public Bitmap f31381h0;
    public Paint f31382i0;
    public String f31383j0;
    public StaticLayout f31384k0;
    public AnimatorSet f31385l0;
    public RectF m0;
    public RectF f31386n;
    public TextPaint f31387n0;
    public float f31388o0;
    public float f31389p0;
    public float f31390q0;
    public RectF f31391r;
    public float f31392r0;
    public RectF f31393s;
    public int f31394s0;
    public int f31395t0;
    public int f31396u0;
    public RectF f31397w;
    public float f31398x;
    public RectF f31399y;

    public static void b(RectF rectF, float f10) {
        float height = rectF.height();
        rectF.right = rectF.left + (f10 * height);
        rectF.bottom = rectF.top + height;
    }

    public static void c(RectF rectF, float f10) {
        float width = rectF.width();
        rectF.right = rectF.left + width;
        rectF.bottom = rectF.top + (width / f10);
    }

    private float getGridProgress() {
        return this.f31374c0;
    }

    private void setCropBottom(float f10) {
        this.f31399y.bottom = f10;
        invalidate();
    }

    private void setCropLeft(float f10) {
        this.f31399y.left = f10;
        invalidate();
    }

    private void setCropRight(float f10) {
        this.f31399y.right = f10;
        invalidate();
    }

    private void setCropTop(float f10) {
        this.f31399y.top = f10;
        invalidate();
    }

    private void setGridProgress(float f10) {
        this.f31374c0 = f10;
        invalidate();
    }

    public final void a(RectF rectF, float f10) {
        int i3;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.W;
        if (!this.f31372b0) {
            i3 = g0.f22602m;
        } else {
            i3 = 0;
        }
        float f16 = i3;
        float measuredHeight = ((getMeasuredHeight() - this.H) - this.I) - f16;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f17 = f15 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f17;
        float measuredWidth2 = getMeasuredWidth() - f17;
        float f18 = measuredHeight - f17;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f19 = (measuredHeight / 2.0f) + f16 + this.I;
        if (Math.abs(1.0f - f10) < 1.0E-4d) {
            float f20 = min / 2.0f;
            f14 = measuredWidth3 - f20;
            f13 = f19 - f20;
            f11 = measuredWidth3 + f20;
            f12 = f19 + f20;
        } else {
            if (f10 - measuredWidth <= 1.0E-4d) {
                float f21 = f18 * f10;
                if (f21 <= measuredWidth2) {
                    float f22 = f21 / 2.0f;
                    f14 = measuredWidth3 - f22;
                    float f23 = f18 / 2.0f;
                    float f24 = f19 - f23;
                    f11 = measuredWidth3 + f22;
                    f12 = f19 + f23;
                    f13 = f24;
                }
            }
            float f25 = measuredWidth2 / 2.0f;
            float f26 = measuredWidth3 - f25;
            float f27 = (measuredWidth2 / f10) / 2.0f;
            float f28 = f19 - f27;
            f11 = measuredWidth3 + f25;
            f12 = f19 + f27;
            f13 = f28;
            f14 = f26;
        }
        rectF.set(f14, f13, f11, f12);
    }

    public final void d(RectF rectF) {
        rectF.set(this.f31399y);
    }

    public final void e(int i3, int i10, boolean z10, boolean z11) {
        float f10;
        this.f31380g0 = z11;
        if (z10) {
            f10 = i10 / i3;
        } else {
            f10 = i3 / i10;
        }
        if (!z11) {
            f10 = 1.0f;
            this.f31398x = 1.0f;
        }
        setActualRect(f10);
    }

    public final void f(boolean z10, boolean z11) {
        this.K = z10;
        float f10 = 1.0f;
        if (z10) {
            if (z11) {
                f10 = 0.0f;
            }
            this.M = f10;
            this.O = SystemClock.elapsedRealtime();
            invalidate();
            return;
        }
        this.M = 1.0f;
    }

    public final void g(int i3, boolean z10) {
        float f10;
        ObjectAnimator objectAnimator = this.f31375d0;
        if (objectAnimator != null && (!z10 || this.f31396u0 != i3)) {
            objectAnimator.cancel();
            this.f31375d0 = null;
        }
        int i10 = this.f31396u0;
        if (i10 == i3) {
            return;
        }
        this.f31395t0 = i10;
        this.f31396u0 = i3;
        if (i3 == 1) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            this.f31374c0 = f10;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.f31374c0, f10);
        this.f31375d0 = ofFloat;
        ofFloat.setDuration(200L);
        this.f31375d0.addListener(new i81(this, 14));
        if (i3 == 1) {
            this.f31375d0.setStartDelay(200L);
        }
        this.f31375d0.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.f31399y;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.f31399y.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.f31399y;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.f31399y;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.f31399y;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.f31399y.left;
    }

    public float getCropRight() {
        return this.f31399y.right;
    }

    public float getCropTop() {
        return this.f31399y.top;
    }

    public float getCropWidth() {
        RectF rectF = this.f31399y;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.V;
    }

    public float getLockAspectRatio() {
        return this.f31398x;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.m0;
        a(rectF, aspectRatio);
        return rectF;
    }

    public final void h(boolean z10) {
        int i3;
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z10) {
                i3 = systemUiVisibility | 4;
            } else {
                i3 = systemUiVisibility & (-5);
            }
            decorView.setSystemUiVisibility(i3);
        } catch (Exception unused) {
        }
    }

    public final void i() {
        if (this.f31383j0 != null) {
            if (this.f31387n0 == null) {
                TextPaint textPaint = new TextPaint();
                this.f31387n0 = textPaint;
                textPaint.setColor(i0.a.o(-1, 120));
                this.f31387n0.setTextSize(g0.L(13.0f));
                this.f31387n0.setTextAlign(Paint.Align.CENTER);
            }
            this.f31384k0 = new StaticLayout(this.f31383j0, this.f31387n0, getMeasuredWidth() - g0.L(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        this.f31384k0 = null;
    }

    public final void j() {
        int L = g0.L(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.f31399y;
        float f10 = rectF2.left;
        float f11 = L;
        float f12 = rectF2.top;
        rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        RectF rectF3 = this.f31376e;
        float f13 = rectF2.right;
        float f14 = rectF2.top;
        rectF3.set(f13 - f11, f14 - f11, f13 + f11, f14 + f11);
        RectF rectF4 = this.f31378f;
        float f15 = rectF2.left;
        float f16 = rectF2.bottom;
        rectF4.set(f15 - f11, f16 - f11, f15 + f11, f16 + f11);
        RectF rectF5 = this.h;
        float f17 = rectF2.right;
        float f18 = rectF2.bottom;
        rectF5.set(f17 - f11, f18 - f11, f17 + f11, f18 + f11);
        float f19 = rectF2.top;
        this.f31386n.set(rectF2.left + f11, f19 - f11, rectF2.right - f11, f19 + f11);
        RectF rectF6 = this.f31391r;
        float f20 = rectF2.left;
        rectF6.set(f20 - f11, rectF2.top + f11, f20 + f11, rectF2.bottom - f11);
        RectF rectF7 = this.f31397w;
        float f21 = rectF2.right;
        rectF7.set(f21 - f11, rectF2.top + f11, f21 + f11, rectF2.bottom - f11);
        float f22 = rectF2.bottom;
        this.f31393s.set(rectF2.left + f11, f22 - f11, rectF2.right - f11, f22 + f11);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Crop.CropAreaView.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f31379f0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        i();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        boolean z10;
        float f10 = this.W;
        RectF rectF = this.E;
        int x10 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y9 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        if (!this.f31372b0) {
            i3 = g0.f22602m;
        } else {
            i3 = 0;
        }
        float f11 = i3;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.f31380g0) {
                float f12 = x10;
                float f13 = y9;
                if (this.d.contains(f12, f13)) {
                    this.f31394s0 = 2;
                } else if (this.f31376e.contains(f12, f13)) {
                    this.f31394s0 = 3;
                } else if (this.f31378f.contains(f12, f13)) {
                    this.f31394s0 = 4;
                } else if (this.h.contains(f12, f13)) {
                    this.f31394s0 = 5;
                } else if (this.f31391r.contains(f12, f13)) {
                    this.f31394s0 = 7;
                } else if (this.f31386n.contains(f12, f13)) {
                    this.f31394s0 = 6;
                } else if (this.f31397w.contains(f12, f13)) {
                    this.f31394s0 = 9;
                } else if (this.f31393s.contains(f12, f13)) {
                    this.f31394s0 = 8;
                } else {
                    this.f31394s0 = 1;
                    return false;
                }
                this.F = x10;
                this.G = y9;
                g(3, false);
                this.f31379f0 = true;
                h(true);
                a aVar = this.f31377e0;
                if (aVar != null) {
                    m mVar = (m) aVar;
                    mVar.f53511a.d(mVar.f53515f);
                    mVar.f53516n = 0.0f;
                    l lVar = mVar.N;
                    if (lVar != null) {
                        lVar.Q(false);
                        return true;
                    }
                }
            } else {
                this.f31394s0 = 1;
                return false;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2 && this.f31394s0 != 1) {
                rectF.set(this.f31399y);
                float f14 = x10 - this.F;
                float f15 = y9 - this.G;
                this.F = x10;
                this.G = y9;
                if (Math.abs(f14) > Math.abs(f15)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                switch (g.c(this.f31394s0)) {
                    case 1:
                        rectF.left += f14;
                        rectF.top += f15;
                        if (this.f31398x > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            if (z10) {
                                c(rectF, this.f31398x);
                            } else {
                                b(rectF, this.f31398x);
                            }
                            rectF.left -= rectF.width() - width;
                            rectF.top -= rectF.width() - height;
                            break;
                        }
                        break;
                    case 2:
                        rectF.right += f14;
                        rectF.top += f15;
                        if (this.f31398x > 0.0f) {
                            float height2 = rectF.height();
                            if (z10) {
                                c(rectF, this.f31398x);
                            } else {
                                b(rectF, this.f31398x);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f14;
                        rectF.bottom += f15;
                        if (this.f31398x > 0.0f) {
                            float width2 = rectF.width();
                            if (z10) {
                                c(rectF, this.f31398x);
                            } else {
                                b(rectF, this.f31398x);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f14;
                        rectF.bottom += f15;
                        float f16 = this.f31398x;
                        if (f16 > 0.0f) {
                            if (z10) {
                                c(rectF, f16);
                                break;
                            } else {
                                b(rectF, f16);
                                break;
                            }
                        }
                        break;
                    case 5:
                        rectF.top += f15;
                        float f17 = this.f31398x;
                        if (f17 > 0.0f) {
                            b(rectF, f17);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f14;
                        float f18 = this.f31398x;
                        if (f18 > 0.0f) {
                            c(rectF, f18);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f15;
                        float f19 = this.f31398x;
                        if (f19 > 0.0f) {
                            b(rectF, f19);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f14;
                        float f20 = this.f31398x;
                        if (f20 > 0.0f) {
                            c(rectF, f20);
                            break;
                        }
                        break;
                }
                if (rectF.left < f10) {
                    float f21 = this.f31398x;
                    if (f21 > 0.0f) {
                        rectF.bottom = com.google.android.recaptcha.internal.a.z(rectF.right, f10, f21, rectF.top);
                    }
                    rectF.left = f10;
                } else if (rectF.right > getWidth() - f10) {
                    rectF.right = getWidth() - f10;
                    if (this.f31398x > 0.0f) {
                        rectF.bottom = (rectF.width() / this.f31398x) + rectF.top;
                    }
                }
                float f22 = f11 + this.I + f10;
                float f23 = this.H + f10;
                if (rectF.top < f22) {
                    float f24 = this.f31398x;
                    if (f24 > 0.0f) {
                        rectF.right = com.google.android.recaptcha.internal.a.y(rectF.bottom, f22, f24, rectF.left);
                    }
                    rectF.top = f22;
                } else if (rectF.bottom > getHeight() - f23) {
                    rectF.bottom = getHeight() - f23;
                    if (this.f31398x > 0.0f) {
                        rectF.right = (rectF.height() * this.f31398x) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f25 = this.f31370a0;
                if (width3 < f25) {
                    rectF.right = rectF.left + f25;
                }
                float height3 = rectF.height();
                float f26 = this.f31370a0;
                if (height3 < f26) {
                    rectF.bottom = rectF.top + f26;
                }
                float f27 = this.f31398x;
                if (f27 > 0.0f) {
                    if (f27 < 1.0f) {
                        float width4 = rectF.width();
                        float f28 = this.f31370a0;
                        if (width4 <= f28) {
                            rectF.right = rectF.left + f28;
                            rectF.bottom = (rectF.width() / this.f31398x) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f29 = this.f31370a0;
                        if (height4 <= f29) {
                            rectF.bottom = rectF.top + f29;
                            rectF.right = (rectF.height() * this.f31398x) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.f31377e0;
                if (aVar2 != null) {
                    m mVar2 = (m) aVar2;
                    CropAreaView cropAreaView = mVar2.f53511a;
                    cropAreaView.g(3, false);
                    RectF rectF2 = mVar2.f53515f;
                    float centerX = rectF2.centerX() - cropAreaView.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView.getCropCenterY();
                    k kVar = mVar2.M;
                    if (kVar != null) {
                        k.f(kVar, centerX, centerY);
                    }
                    mVar2.r(false);
                    rectF2.set(cropAreaView.f31399y);
                    mVar2.e(true, false, false, false);
                    return true;
                }
            }
            return false;
        } else {
            this.f31379f0 = false;
            h(false);
            if (this.f31394s0 != 1) {
                this.f31394s0 = 1;
                a aVar3 = this.f31377e0;
                if (aVar3 != null) {
                    m mVar3 = (m) aVar3;
                    CropAreaView cropAreaView2 = mVar3.f53511a;
                    cropAreaView2.g(1, true);
                    mVar3.d(cropAreaView2.getTargetRectToFill());
                }
            }
            return false;
        }
        return true;
    }

    public void setActualRect(float f10) {
        a(this.f31399y, f10);
        j();
        invalidate();
    }

    public void setBottomPadding(float f10) {
        this.H = f10;
    }

    public void setDimAlpha(float f10) {
        this.L = f10;
    }

    public void setDimVisibility(boolean z10) {
        this.J = z10;
    }

    public void setFrameAlpha(float f10) {
        this.N = f10;
    }

    public void setFreeform(boolean z10) {
        this.f31380g0 = z10;
    }

    public void setIsVideo(boolean z10) {
        float f10;
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 32.0f;
        }
        this.f31370a0 = g0.L(f10);
    }

    public void setListener(a aVar) {
        this.f31377e0 = aVar;
    }

    public void setLockedAspectRatio(float f10) {
        this.f31398x = f10;
    }

    public void setSubtitle(String str) {
        this.f31383j0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f10) {
        this.I = f10;
    }

    public void setActualRect(RectF rectF) {
        this.f31399y.set(rectF);
        j();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
    }
}
