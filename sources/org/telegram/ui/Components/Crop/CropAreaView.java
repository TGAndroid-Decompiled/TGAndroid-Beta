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
import com.google.android.gms.internal.vision.e2;
import ki.m3;
import og.a;
import og.m;
import og.n;
import og.o;
import org.telegram.messenger.g0;
import p1.g;
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
    public int f32909a;
    public float f32910a0;
    public float f32911b;
    public boolean f32912b0;
    public float f32913c;
    public float f32914c0;
    public RectF d;
    public ObjectAnimator f32915d0;
    public RectF f32916e;
    public a f32917e0;
    public RectF f32918f;
    public boolean f32919f0;
    public boolean f32920g0;
    public RectF h;
    public Bitmap f32921h0;
    public Paint f32922i0;
    public String f32923j0;
    public StaticLayout f32924k0;
    public AnimatorSet f32925l0;
    public RectF m0;
    public RectF f32926n;
    public TextPaint f32927n0;
    public float f32928o0;
    public float f32929p0;
    public float f32930q0;
    public RectF f32931r;
    public float f32932r0;
    public RectF f32933s;
    public int f32934s0;
    public int f32935t0;
    public int f32936u0;
    public RectF f32937w;
    public float f32938x;
    public RectF f32939y;

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
        return this.f32914c0;
    }

    private void setCropBottom(float f10) {
        this.f32939y.bottom = f10;
        invalidate();
    }

    private void setCropLeft(float f10) {
        this.f32939y.left = f10;
        invalidate();
    }

    private void setCropRight(float f10) {
        this.f32939y.right = f10;
        invalidate();
    }

    private void setCropTop(float f10) {
        this.f32939y.top = f10;
        invalidate();
    }

    private void setGridProgress(float f10) {
        this.f32914c0 = f10;
        invalidate();
    }

    public final void a(RectF rectF, float f10) {
        int i7;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.W;
        if (!this.f32912b0) {
            i7 = g0.f24040m;
        } else {
            i7 = 0;
        }
        float f16 = i7;
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
        rectF.set(this.f32939y);
    }

    public final void e(int i7, int i10, boolean z10, boolean z11) {
        float f10;
        this.f32920g0 = z11;
        if (z10) {
            f10 = i10 / i7;
        } else {
            f10 = i7 / i10;
        }
        if (!z11) {
            f10 = 1.0f;
            this.f32938x = 1.0f;
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

    public final void g(int i7, boolean z10) {
        float f10;
        ObjectAnimator objectAnimator = this.f32915d0;
        if (objectAnimator != null && (!z10 || this.f32936u0 != i7)) {
            objectAnimator.cancel();
            this.f32915d0 = null;
        }
        int i10 = this.f32936u0;
        if (i10 == i7) {
            return;
        }
        this.f32935t0 = i10;
        this.f32936u0 = i7;
        if (i7 == 1) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            this.f32914c0 = f10;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.f32914c0, f10);
        this.f32915d0 = ofFloat;
        ofFloat.setDuration(200L);
        this.f32915d0.addListener(new m3(this, 4));
        if (i7 == 1) {
            this.f32915d0.setStartDelay(200L);
        }
        this.f32915d0.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.f32939y;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.f32939y.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.f32939y;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.f32939y;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.f32939y;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.f32939y.left;
    }

    public float getCropRight() {
        return this.f32939y.right;
    }

    public float getCropTop() {
        return this.f32939y.top;
    }

    public float getCropWidth() {
        RectF rectF = this.f32939y;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.V;
    }

    public float getLockAspectRatio() {
        return this.f32938x;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.m0;
        a(rectF, aspectRatio);
        return rectF;
    }

    public final void h(boolean z10) {
        int i7;
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z10) {
                i7 = systemUiVisibility | 4;
            } else {
                i7 = systemUiVisibility & (-5);
            }
            decorView.setSystemUiVisibility(i7);
        } catch (Exception unused) {
        }
    }

    public final void i() {
        if (this.f32923j0 != null) {
            if (this.f32927n0 == null) {
                TextPaint textPaint = new TextPaint();
                this.f32927n0 = textPaint;
                textPaint.setColor(i0.a.o(-1, 120));
                this.f32927n0.setTextSize(g0.L(13.0f));
                this.f32927n0.setTextAlign(Paint.Align.CENTER);
            }
            this.f32924k0 = new StaticLayout(this.f32923j0, this.f32927n0, getMeasuredWidth() - g0.L(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        this.f32924k0 = null;
    }

    public final void j() {
        int L = g0.L(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.f32939y;
        float f10 = rectF2.left;
        float f11 = L;
        float f12 = rectF2.top;
        rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        RectF rectF3 = this.f32916e;
        float f13 = rectF2.right;
        float f14 = rectF2.top;
        rectF3.set(f13 - f11, f14 - f11, f13 + f11, f14 + f11);
        RectF rectF4 = this.f32918f;
        float f15 = rectF2.left;
        float f16 = rectF2.bottom;
        rectF4.set(f15 - f11, f16 - f11, f15 + f11, f16 + f11);
        RectF rectF5 = this.h;
        float f17 = rectF2.right;
        float f18 = rectF2.bottom;
        rectF5.set(f17 - f11, f18 - f11, f17 + f11, f18 + f11);
        float f19 = rectF2.top;
        this.f32926n.set(rectF2.left + f11, f19 - f11, rectF2.right - f11, f19 + f11);
        RectF rectF6 = this.f32931r;
        float f20 = rectF2.left;
        rectF6.set(f20 - f11, rectF2.top + f11, f20 + f11, rectF2.bottom - f11);
        RectF rectF7 = this.f32937w;
        float f21 = rectF2.right;
        rectF7.set(f21 - f11, rectF2.top + f11, f21 + f11, rectF2.bottom - f11);
        float f22 = rectF2.bottom;
        this.f32933s.set(rectF2.left + f11, f22 - f11, rectF2.right - f11, f22 + f11);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Crop.CropAreaView.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f32919f0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        i();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        boolean z10;
        float f10 = this.W;
        RectF rectF = this.E;
        int x10 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y10 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        if (!this.f32912b0) {
            i7 = g0.f24040m;
        } else {
            i7 = 0;
        }
        float f11 = i7;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.f32920g0) {
                float f12 = x10;
                float f13 = y10;
                if (this.d.contains(f12, f13)) {
                    this.f32934s0 = 2;
                } else if (this.f32916e.contains(f12, f13)) {
                    this.f32934s0 = 3;
                } else if (this.f32918f.contains(f12, f13)) {
                    this.f32934s0 = 4;
                } else if (this.h.contains(f12, f13)) {
                    this.f32934s0 = 5;
                } else if (this.f32931r.contains(f12, f13)) {
                    this.f32934s0 = 7;
                } else if (this.f32926n.contains(f12, f13)) {
                    this.f32934s0 = 6;
                } else if (this.f32937w.contains(f12, f13)) {
                    this.f32934s0 = 9;
                } else if (this.f32933s.contains(f12, f13)) {
                    this.f32934s0 = 8;
                } else {
                    this.f32934s0 = 1;
                    return false;
                }
                this.F = x10;
                this.G = y10;
                g(3, false);
                this.f32919f0 = true;
                h(true);
                a aVar = this.f32917e0;
                if (aVar != null) {
                    o oVar = (o) aVar;
                    oVar.f21921a.d(oVar.f21925f);
                    oVar.f21926n = 0.0f;
                    n nVar = oVar.N;
                    if (nVar != null) {
                        nVar.D(false);
                        return true;
                    }
                }
            } else {
                this.f32934s0 = 1;
                return false;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2 && this.f32934s0 != 1) {
                rectF.set(this.f32939y);
                float f14 = x10 - this.F;
                float f15 = y10 - this.G;
                this.F = x10;
                this.G = y10;
                if (Math.abs(f14) > Math.abs(f15)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                switch (g.c(this.f32934s0)) {
                    case 1:
                        rectF.left += f14;
                        rectF.top += f15;
                        if (this.f32938x > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            if (z10) {
                                c(rectF, this.f32938x);
                            } else {
                                b(rectF, this.f32938x);
                            }
                            rectF.left -= rectF.width() - width;
                            rectF.top -= rectF.width() - height;
                            break;
                        }
                        break;
                    case 2:
                        rectF.right += f14;
                        rectF.top += f15;
                        if (this.f32938x > 0.0f) {
                            float height2 = rectF.height();
                            if (z10) {
                                c(rectF, this.f32938x);
                            } else {
                                b(rectF, this.f32938x);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f14;
                        rectF.bottom += f15;
                        if (this.f32938x > 0.0f) {
                            float width2 = rectF.width();
                            if (z10) {
                                c(rectF, this.f32938x);
                            } else {
                                b(rectF, this.f32938x);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f14;
                        rectF.bottom += f15;
                        float f16 = this.f32938x;
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
                        float f17 = this.f32938x;
                        if (f17 > 0.0f) {
                            b(rectF, f17);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f14;
                        float f18 = this.f32938x;
                        if (f18 > 0.0f) {
                            c(rectF, f18);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f15;
                        float f19 = this.f32938x;
                        if (f19 > 0.0f) {
                            b(rectF, f19);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f14;
                        float f20 = this.f32938x;
                        if (f20 > 0.0f) {
                            c(rectF, f20);
                            break;
                        }
                        break;
                }
                if (rectF.left < f10) {
                    float f21 = this.f32938x;
                    if (f21 > 0.0f) {
                        rectF.bottom = e2.A(rectF.right, f10, f21, rectF.top);
                    }
                    rectF.left = f10;
                } else if (rectF.right > getWidth() - f10) {
                    rectF.right = getWidth() - f10;
                    if (this.f32938x > 0.0f) {
                        rectF.bottom = (rectF.width() / this.f32938x) + rectF.top;
                    }
                }
                float f22 = f11 + this.I + f10;
                float f23 = this.H + f10;
                if (rectF.top < f22) {
                    float f24 = this.f32938x;
                    if (f24 > 0.0f) {
                        rectF.right = e2.z(rectF.bottom, f22, f24, rectF.left);
                    }
                    rectF.top = f22;
                } else if (rectF.bottom > getHeight() - f23) {
                    rectF.bottom = getHeight() - f23;
                    if (this.f32938x > 0.0f) {
                        rectF.right = (rectF.height() * this.f32938x) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f25 = this.f32910a0;
                if (width3 < f25) {
                    rectF.right = rectF.left + f25;
                }
                float height3 = rectF.height();
                float f26 = this.f32910a0;
                if (height3 < f26) {
                    rectF.bottom = rectF.top + f26;
                }
                float f27 = this.f32938x;
                if (f27 > 0.0f) {
                    if (f27 < 1.0f) {
                        float width4 = rectF.width();
                        float f28 = this.f32910a0;
                        if (width4 <= f28) {
                            rectF.right = rectF.left + f28;
                            rectF.bottom = (rectF.width() / this.f32938x) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f29 = this.f32910a0;
                        if (height4 <= f29) {
                            rectF.bottom = rectF.top + f29;
                            rectF.right = (rectF.height() * this.f32938x) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.f32917e0;
                if (aVar2 != null) {
                    o oVar2 = (o) aVar2;
                    CropAreaView cropAreaView = oVar2.f21921a;
                    cropAreaView.g(3, false);
                    RectF rectF2 = oVar2.f21925f;
                    float centerX = rectF2.centerX() - cropAreaView.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView.getCropCenterY();
                    m mVar = oVar2.M;
                    if (mVar != null) {
                        m.f(mVar, centerX, centerY);
                    }
                    oVar2.r(false);
                    rectF2.set(cropAreaView.f32939y);
                    oVar2.e(true, false, false, false);
                    return true;
                }
            }
            return false;
        } else {
            this.f32919f0 = false;
            h(false);
            if (this.f32934s0 != 1) {
                this.f32934s0 = 1;
                a aVar3 = this.f32917e0;
                if (aVar3 != null) {
                    o oVar3 = (o) aVar3;
                    CropAreaView cropAreaView2 = oVar3.f21921a;
                    cropAreaView2.g(1, true);
                    oVar3.d(cropAreaView2.getTargetRectToFill());
                }
            }
            return false;
        }
        return true;
    }

    public void setActualRect(float f10) {
        a(this.f32939y, f10);
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
        this.f32920g0 = z10;
    }

    public void setIsVideo(boolean z10) {
        float f10;
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 32.0f;
        }
        this.f32910a0 = g0.L(f10);
    }

    public void setListener(a aVar) {
        this.f32917e0 = aVar;
    }

    public void setLockedAspectRatio(float f10) {
        this.f32938x = f10;
    }

    public void setSubtitle(String str) {
        this.f32923j0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f10) {
        this.I = f10;
    }

    public void setActualRect(RectF rectF) {
        this.f32939y.set(rectF);
        j();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
    }
}
