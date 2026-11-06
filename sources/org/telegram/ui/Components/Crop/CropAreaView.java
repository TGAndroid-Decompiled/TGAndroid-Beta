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
import og.a;
import og.m;
import og.n;
import og.o;
import org.telegram.messenger.g0;
import p1.g;
public class CropAreaView extends ViewGroup {
    public RectF D;
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public boolean J;
    public float K;
    public float L;
    public float M;
    public long N;
    public Paint O;
    public Paint P;
    public Paint Q;
    public Paint R;
    public Paint S;
    public Paint T;
    public AccelerateDecelerateInterpolator U;
    public float V;
    public float W;
    public int f31294a;
    public boolean f31295a0;
    public float f31296b;
    public float f31297b0;
    public float f31298c;
    public ObjectAnimator f31299c0;
    public RectF d;
    public a f31300d0;
    public RectF f31301e;
    public boolean f31302e0;
    public RectF f31303f;
    public boolean f31304f0;
    public Bitmap f31305g0;
    public RectF h;
    public Paint f31306h0;
    public String f31307i0;
    public StaticLayout f31308j0;
    public AnimatorSet f31309k0;
    public RectF f31310l0;
    public TextPaint m0;
    public RectF f31311n;
    public float f31312n0;
    public float f31313o0;
    public float f31314p0;
    public float f31315q0;
    public RectF f31316r;
    public int f31317r0;
    public RectF f31318s;
    public int f31319s0;
    public int f31320t0;
    public RectF f31321w;
    public float f31322x;
    public RectF f31323y;

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
        return this.f31297b0;
    }

    private void setCropBottom(float f10) {
        this.f31323y.bottom = f10;
        invalidate();
    }

    private void setCropLeft(float f10) {
        this.f31323y.left = f10;
        invalidate();
    }

    private void setCropRight(float f10) {
        this.f31323y.right = f10;
        invalidate();
    }

    private void setCropTop(float f10) {
        this.f31323y.top = f10;
        invalidate();
    }

    private void setGridProgress(float f10) {
        this.f31297b0 = f10;
        invalidate();
    }

    public final void a(RectF rectF, float f10) {
        int i7;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.V;
        if (!this.f31295a0) {
            i7 = g0.f22538m;
        } else {
            i7 = 0;
        }
        float f16 = i7;
        float measuredHeight = ((getMeasuredHeight() - this.G) - this.H) - f16;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f17 = f15 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f17;
        float measuredWidth2 = getMeasuredWidth() - f17;
        float f18 = measuredHeight - f17;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f19 = (measuredHeight / 2.0f) + f16 + this.H;
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
        rectF.set(this.f31323y);
    }

    public final void e(int i7, int i10, boolean z9, boolean z10) {
        float f10;
        this.f31304f0 = z10;
        if (z9) {
            f10 = i10 / i7;
        } else {
            f10 = i7 / i10;
        }
        if (!z10) {
            f10 = 1.0f;
            this.f31322x = 1.0f;
        }
        setActualRect(f10);
    }

    public final void f(boolean z9, boolean z10) {
        this.J = z9;
        float f10 = 1.0f;
        if (z9) {
            if (z10) {
                f10 = 0.0f;
            }
            this.L = f10;
            this.N = SystemClock.elapsedRealtime();
            invalidate();
            return;
        }
        this.L = 1.0f;
    }

    public final void g(int i7, boolean z9) {
        float f10;
        ObjectAnimator objectAnimator = this.f31299c0;
        if (objectAnimator != null && (!z9 || this.f31320t0 != i7)) {
            objectAnimator.cancel();
            this.f31299c0 = null;
        }
        int i10 = this.f31320t0;
        if (i10 == i7) {
            return;
        }
        this.f31319s0 = i10;
        this.f31320t0 = i7;
        if (i7 == 1) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z9) {
            this.f31297b0 = f10;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.f31297b0, f10);
        this.f31299c0 = ofFloat;
        ofFloat.setDuration(200L);
        this.f31299c0.addListener(new m.a(this, 3));
        if (i7 == 1) {
            this.f31299c0.setStartDelay(200L);
        }
        this.f31299c0.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.f31323y;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.f31323y.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.f31323y;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.f31323y;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.f31323y;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.f31323y.left;
    }

    public float getCropRight() {
        return this.f31323y.right;
    }

    public float getCropTop() {
        return this.f31323y.top;
    }

    public float getCropWidth() {
        RectF rectF = this.f31323y;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.U;
    }

    public float getLockAspectRatio() {
        return this.f31322x;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.f31310l0;
        a(rectF, aspectRatio);
        return rectF;
    }

    public final void h(boolean z9) {
        int i7;
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z9) {
                i7 = systemUiVisibility | 4;
            } else {
                i7 = systemUiVisibility & (-5);
            }
            decorView.setSystemUiVisibility(i7);
        } catch (Exception unused) {
        }
    }

    public final void i() {
        if (this.f31307i0 != null) {
            if (this.m0 == null) {
                TextPaint textPaint = new TextPaint();
                this.m0 = textPaint;
                textPaint.setColor(i0.a.o(-1, 120));
                this.m0.setTextSize(g0.L(13.0f));
                this.m0.setTextAlign(Paint.Align.CENTER);
            }
            this.f31308j0 = new StaticLayout(this.f31307i0, this.m0, getMeasuredWidth() - g0.L(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        this.f31308j0 = null;
    }

    public final void j() {
        int L = g0.L(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.f31323y;
        float f10 = rectF2.left;
        float f11 = L;
        float f12 = rectF2.top;
        rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        RectF rectF3 = this.f31301e;
        float f13 = rectF2.right;
        float f14 = rectF2.top;
        rectF3.set(f13 - f11, f14 - f11, f13 + f11, f14 + f11);
        RectF rectF4 = this.f31303f;
        float f15 = rectF2.left;
        float f16 = rectF2.bottom;
        rectF4.set(f15 - f11, f16 - f11, f15 + f11, f16 + f11);
        RectF rectF5 = this.h;
        float f17 = rectF2.right;
        float f18 = rectF2.bottom;
        rectF5.set(f17 - f11, f18 - f11, f17 + f11, f18 + f11);
        float f19 = rectF2.top;
        this.f31311n.set(rectF2.left + f11, f19 - f11, rectF2.right - f11, f19 + f11);
        RectF rectF6 = this.f31316r;
        float f20 = rectF2.left;
        rectF6.set(f20 - f11, rectF2.top + f11, f20 + f11, rectF2.bottom - f11);
        RectF rectF7 = this.f31321w;
        float f21 = rectF2.right;
        rectF7.set(f21 - f11, rectF2.top + f11, f21 + f11, rectF2.bottom - f11);
        float f22 = rectF2.bottom;
        this.f31318s.set(rectF2.left + f11, f22 - f11, rectF2.right - f11, f22 + f11);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Crop.CropAreaView.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f31302e0) {
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
        boolean z9;
        float f10 = this.V;
        RectF rectF = this.D;
        int x10 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y10 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        if (!this.f31295a0) {
            i7 = g0.f22538m;
        } else {
            i7 = 0;
        }
        float f11 = i7;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.f31304f0) {
                float f12 = x10;
                float f13 = y10;
                if (this.d.contains(f12, f13)) {
                    this.f31317r0 = 2;
                } else if (this.f31301e.contains(f12, f13)) {
                    this.f31317r0 = 3;
                } else if (this.f31303f.contains(f12, f13)) {
                    this.f31317r0 = 4;
                } else if (this.h.contains(f12, f13)) {
                    this.f31317r0 = 5;
                } else if (this.f31316r.contains(f12, f13)) {
                    this.f31317r0 = 7;
                } else if (this.f31311n.contains(f12, f13)) {
                    this.f31317r0 = 6;
                } else if (this.f31321w.contains(f12, f13)) {
                    this.f31317r0 = 9;
                } else if (this.f31318s.contains(f12, f13)) {
                    this.f31317r0 = 8;
                } else {
                    this.f31317r0 = 1;
                    return false;
                }
                this.E = x10;
                this.F = y10;
                g(3, false);
                this.f31302e0 = true;
                h(true);
                a aVar = this.f31300d0;
                if (aVar != null) {
                    o oVar = (o) aVar;
                    oVar.f21004a.d(oVar.f21008f);
                    oVar.f21009n = 0.0f;
                    n nVar = oVar.M;
                    if (nVar != null) {
                        nVar.Z(false);
                        return true;
                    }
                }
            } else {
                this.f31317r0 = 1;
                return false;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2 && this.f31317r0 != 1) {
                rectF.set(this.f31323y);
                float f14 = x10 - this.E;
                float f15 = y10 - this.F;
                this.E = x10;
                this.F = y10;
                if (Math.abs(f14) > Math.abs(f15)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                switch (g.c(this.f31317r0)) {
                    case 1:
                        rectF.left += f14;
                        rectF.top += f15;
                        if (this.f31322x > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            if (z9) {
                                c(rectF, this.f31322x);
                            } else {
                                b(rectF, this.f31322x);
                            }
                            rectF.left -= rectF.width() - width;
                            rectF.top -= rectF.width() - height;
                            break;
                        }
                        break;
                    case 2:
                        rectF.right += f14;
                        rectF.top += f15;
                        if (this.f31322x > 0.0f) {
                            float height2 = rectF.height();
                            if (z9) {
                                c(rectF, this.f31322x);
                            } else {
                                b(rectF, this.f31322x);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f14;
                        rectF.bottom += f15;
                        if (this.f31322x > 0.0f) {
                            float width2 = rectF.width();
                            if (z9) {
                                c(rectF, this.f31322x);
                            } else {
                                b(rectF, this.f31322x);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f14;
                        rectF.bottom += f15;
                        float f16 = this.f31322x;
                        if (f16 > 0.0f) {
                            if (z9) {
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
                        float f17 = this.f31322x;
                        if (f17 > 0.0f) {
                            b(rectF, f17);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f14;
                        float f18 = this.f31322x;
                        if (f18 > 0.0f) {
                            c(rectF, f18);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f15;
                        float f19 = this.f31322x;
                        if (f19 > 0.0f) {
                            b(rectF, f19);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f14;
                        float f20 = this.f31322x;
                        if (f20 > 0.0f) {
                            c(rectF, f20);
                            break;
                        }
                        break;
                }
                if (rectF.left < f10) {
                    float f21 = this.f31322x;
                    if (f21 > 0.0f) {
                        rectF.bottom = com.google.android.recaptcha.internal.a.A(rectF.right, f10, f21, rectF.top);
                    }
                    rectF.left = f10;
                } else if (rectF.right > getWidth() - f10) {
                    rectF.right = getWidth() - f10;
                    if (this.f31322x > 0.0f) {
                        rectF.bottom = (rectF.width() / this.f31322x) + rectF.top;
                    }
                }
                float f22 = f11 + this.H + f10;
                float f23 = this.G + f10;
                if (rectF.top < f22) {
                    float f24 = this.f31322x;
                    if (f24 > 0.0f) {
                        rectF.right = com.google.android.recaptcha.internal.a.z(rectF.bottom, f22, f24, rectF.left);
                    }
                    rectF.top = f22;
                } else if (rectF.bottom > getHeight() - f23) {
                    rectF.bottom = getHeight() - f23;
                    if (this.f31322x > 0.0f) {
                        rectF.right = (rectF.height() * this.f31322x) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f25 = this.W;
                if (width3 < f25) {
                    rectF.right = rectF.left + f25;
                }
                float height3 = rectF.height();
                float f26 = this.W;
                if (height3 < f26) {
                    rectF.bottom = rectF.top + f26;
                }
                float f27 = this.f31322x;
                if (f27 > 0.0f) {
                    if (f27 < 1.0f) {
                        float width4 = rectF.width();
                        float f28 = this.W;
                        if (width4 <= f28) {
                            rectF.right = rectF.left + f28;
                            rectF.bottom = (rectF.width() / this.f31322x) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f29 = this.W;
                        if (height4 <= f29) {
                            rectF.bottom = rectF.top + f29;
                            rectF.right = (rectF.height() * this.f31322x) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.f31300d0;
                if (aVar2 != null) {
                    o oVar2 = (o) aVar2;
                    CropAreaView cropAreaView = oVar2.f21004a;
                    cropAreaView.g(3, false);
                    RectF rectF2 = oVar2.f21008f;
                    float centerX = rectF2.centerX() - cropAreaView.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView.getCropCenterY();
                    m mVar = oVar2.L;
                    if (mVar != null) {
                        m.f(mVar, centerX, centerY);
                    }
                    oVar2.r(false);
                    rectF2.set(cropAreaView.f31323y);
                    oVar2.e(true, false, false, false);
                    return true;
                }
            }
            return false;
        } else {
            this.f31302e0 = false;
            h(false);
            if (this.f31317r0 != 1) {
                this.f31317r0 = 1;
                a aVar3 = this.f31300d0;
                if (aVar3 != null) {
                    o oVar3 = (o) aVar3;
                    CropAreaView cropAreaView2 = oVar3.f21004a;
                    cropAreaView2.g(1, true);
                    oVar3.d(cropAreaView2.getTargetRectToFill());
                }
            }
            return false;
        }
        return true;
    }

    public void setActualRect(float f10) {
        a(this.f31323y, f10);
        j();
        invalidate();
    }

    public void setBottomPadding(float f10) {
        this.G = f10;
    }

    public void setDimAlpha(float f10) {
        this.K = f10;
    }

    public void setDimVisibility(boolean z9) {
        this.I = z9;
    }

    public void setFrameAlpha(float f10) {
        this.M = f10;
    }

    public void setFreeform(boolean z9) {
        this.f31304f0 = z9;
    }

    public void setIsVideo(boolean z9) {
        float f10;
        if (z9) {
            f10 = 64.0f;
        } else {
            f10 = 32.0f;
        }
        this.W = g0.L(f10);
    }

    public void setListener(a aVar) {
        this.f31300d0 = aVar;
    }

    public void setLockedAspectRatio(float f10) {
        this.f31322x = f10;
    }

    public void setSubtitle(String str) {
        this.f31307i0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f10) {
        this.H = f10;
    }

    public void setActualRect(RectF rectF) {
        this.f31323y.set(rectF);
        j();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
    }
}
