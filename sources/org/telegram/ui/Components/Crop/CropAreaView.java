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
import e2.c;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import qh.i2;
import zf.a;
import zf.l;
import zf.m;
import zf.n;
public class CropAreaView extends ViewGroup {
    public int B;
    public int C;
    public float D;
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public long K;
    public Paint L;
    public Paint M;
    public Paint N;
    public Paint O;
    public Paint P;
    public Paint Q;
    public AccelerateDecelerateInterpolator R;
    public float S;
    public float T;
    public boolean U;
    public float V;
    public ObjectAnimator W;
    public int f24845a;
    public a f24846a0;
    public float f24847b;
    public boolean f24848b0;
    public float f24849c;
    public boolean f24850c0;
    public RectF d;
    public Bitmap f24851d0;
    public RectF f24852e;
    public Paint f24853e0;
    public RectF f24854f;
    public String f24855f0;
    public StaticLayout f24856g0;
    public RectF h;
    public AnimatorSet f24857h0;
    public RectF f24858i0;
    public TextPaint f24859j0;
    public float f24860k0;
    public float f24861l0;
    public float m0;
    public RectF f24862n;
    public float f24863n0;
    public int f24864o0;
    public int f24865p0;
    public int f24866q0;
    public RectF f24867r;
    public RectF f24868s;
    public RectF v;
    public float f24869w;
    public RectF f24870x;
    public RectF f24871y;

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
        return this.V;
    }

    private void setCropBottom(float f10) {
        this.f24870x.bottom = f10;
        invalidate();
    }

    private void setCropLeft(float f10) {
        this.f24870x.left = f10;
        invalidate();
    }

    private void setCropRight(float f10) {
        this.f24870x.right = f10;
        invalidate();
    }

    private void setCropTop(float f10) {
        this.f24870x.top = f10;
        invalidate();
    }

    private void setGridProgress(float f10) {
        this.V = f10;
        invalidate();
    }

    public final void a(RectF rectF, float f10) {
        int i10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.S;
        if (!this.U) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f16 = i10;
        float measuredHeight = ((getMeasuredHeight() - this.D) - this.E) - f16;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f17 = f15 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f17;
        float measuredWidth2 = getMeasuredWidth() - f17;
        float f18 = measuredHeight - f17;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f19 = (measuredHeight / 2.0f) + f16 + this.E;
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
        rectF.set(this.f24870x);
    }

    public final void e(int i10, int i11, boolean z4, boolean z10) {
        float f10;
        this.f24850c0 = z10;
        if (z4) {
            f10 = i11 / i10;
        } else {
            f10 = i10 / i11;
        }
        if (!z10) {
            f10 = 1.0f;
            this.f24869w = 1.0f;
        }
        setActualRect(f10);
    }

    public final void f(boolean z4, boolean z10) {
        this.G = z4;
        float f10 = 1.0f;
        if (z4) {
            if (z10) {
                f10 = 0.0f;
            }
            this.I = f10;
            this.K = SystemClock.elapsedRealtime();
            invalidate();
            return;
        }
        this.I = 1.0f;
    }

    public final void g(int i10, boolean z4) {
        float f10;
        ObjectAnimator objectAnimator = this.W;
        if (objectAnimator != null && (!z4 || this.f24866q0 != i10)) {
            objectAnimator.cancel();
            this.W = null;
        }
        int i11 = this.f24866q0;
        if (i11 == i10) {
            return;
        }
        this.f24865p0 = i11;
        this.f24866q0 = i10;
        if (i10 == 1) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z4) {
            this.V = f10;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.V, f10);
        this.W = ofFloat;
        ofFloat.setDuration(200L);
        this.W.addListener(new i2(this, 13));
        if (i10 == 1) {
            this.W.setStartDelay(200L);
        }
        this.W.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.f24870x;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.f24870x.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.f24870x;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.f24870x;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.f24870x;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.f24870x.left;
    }

    public float getCropRight() {
        return this.f24870x.right;
    }

    public float getCropTop() {
        return this.f24870x.top;
    }

    public float getCropWidth() {
        RectF rectF = this.f24870x;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.R;
    }

    public float getLockAspectRatio() {
        return this.f24869w;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.f24858i0;
        a(rectF, aspectRatio);
        return rectF;
    }

    public final void h(boolean z4) {
        int i10;
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z4) {
                i10 = systemUiVisibility | 4;
            } else {
                i10 = systemUiVisibility & (-5);
            }
            decorView.setSystemUiVisibility(i10);
        } catch (Exception unused) {
        }
    }

    public final void i() {
        if (this.f24855f0 != null) {
            if (this.f24859j0 == null) {
                TextPaint textPaint = new TextPaint();
                this.f24859j0 = textPaint;
                textPaint.setColor(i0.a.k(-1, 120));
                this.f24859j0.setTextSize(AndroidUtilities.dp(13.0f));
                this.f24859j0.setTextAlign(Paint.Align.CENTER);
            }
            this.f24856g0 = new StaticLayout(this.f24855f0, this.f24859j0, getMeasuredWidth() - AndroidUtilities.dp(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        this.f24856g0 = null;
    }

    public final void j() {
        int dp = AndroidUtilities.dp(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.f24870x;
        float f10 = rectF2.left;
        float f11 = dp;
        float f12 = rectF2.top;
        rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        RectF rectF3 = this.f24852e;
        float f13 = rectF2.right;
        float f14 = rectF2.top;
        rectF3.set(f13 - f11, f14 - f11, f13 + f11, f14 + f11);
        RectF rectF4 = this.f24854f;
        float f15 = rectF2.left;
        float f16 = rectF2.bottom;
        rectF4.set(f15 - f11, f16 - f11, f15 + f11, f16 + f11);
        RectF rectF5 = this.h;
        float f17 = rectF2.right;
        float f18 = rectF2.bottom;
        rectF5.set(f17 - f11, f18 - f11, f17 + f11, f18 + f11);
        float f19 = rectF2.top;
        this.f24862n.set(rectF2.left + f11, f19 - f11, rectF2.right - f11, f19 + f11);
        RectF rectF6 = this.f24867r;
        float f20 = rectF2.left;
        rectF6.set(f20 - f11, rectF2.top + f11, f20 + f11, rectF2.bottom - f11);
        RectF rectF7 = this.v;
        float f21 = rectF2.right;
        rectF7.set(f21 - f11, rectF2.top + f11, f21 + f11, rectF2.bottom - f11);
        float f22 = rectF2.bottom;
        this.f24868s.set(rectF2.left + f11, f22 - f11, rectF2.right - f11, f22 + f11);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Crop.CropAreaView.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f24848b0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z4;
        float f10 = this.S;
        RectF rectF = this.f24871y;
        int x10 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y10 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        if (!this.U) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f11 = i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.f24850c0) {
                float f12 = x10;
                float f13 = y10;
                if (this.d.contains(f12, f13)) {
                    this.f24864o0 = 2;
                } else if (this.f24852e.contains(f12, f13)) {
                    this.f24864o0 = 3;
                } else if (this.f24854f.contains(f12, f13)) {
                    this.f24864o0 = 4;
                } else if (this.h.contains(f12, f13)) {
                    this.f24864o0 = 5;
                } else if (this.f24867r.contains(f12, f13)) {
                    this.f24864o0 = 7;
                } else if (this.f24862n.contains(f12, f13)) {
                    this.f24864o0 = 6;
                } else if (this.v.contains(f12, f13)) {
                    this.f24864o0 = 9;
                } else if (this.f24868s.contains(f12, f13)) {
                    this.f24864o0 = 8;
                } else {
                    this.f24864o0 = 1;
                    return false;
                }
                this.B = x10;
                this.C = y10;
                g(3, false);
                this.f24848b0 = true;
                h(true);
                a aVar = this.f24846a0;
                if (aVar != null) {
                    n nVar = (n) aVar;
                    nVar.f51201a.d(nVar.f51205f);
                    nVar.f51206n = 0.0f;
                    m mVar = nVar.J;
                    if (mVar != null) {
                        mVar.N(false);
                        return true;
                    }
                }
            } else {
                this.f24864o0 = 1;
                return false;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2 && this.f24864o0 != 1) {
                rectF.set(this.f24870x);
                float f14 = x10 - this.B;
                float f15 = y10 - this.C;
                this.B = x10;
                this.C = y10;
                if (Math.abs(f14) > Math.abs(f15)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                switch (j.c(this.f24864o0)) {
                    case 1:
                        rectF.left += f14;
                        rectF.top += f15;
                        if (this.f24869w > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            if (z4) {
                                c(rectF, this.f24869w);
                            } else {
                                b(rectF, this.f24869w);
                            }
                            rectF.left -= rectF.width() - width;
                            rectF.top -= rectF.width() - height;
                            break;
                        }
                        break;
                    case 2:
                        rectF.right += f14;
                        rectF.top += f15;
                        if (this.f24869w > 0.0f) {
                            float height2 = rectF.height();
                            if (z4) {
                                c(rectF, this.f24869w);
                            } else {
                                b(rectF, this.f24869w);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f14;
                        rectF.bottom += f15;
                        if (this.f24869w > 0.0f) {
                            float width2 = rectF.width();
                            if (z4) {
                                c(rectF, this.f24869w);
                            } else {
                                b(rectF, this.f24869w);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f14;
                        rectF.bottom += f15;
                        float f16 = this.f24869w;
                        if (f16 > 0.0f) {
                            if (z4) {
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
                        float f17 = this.f24869w;
                        if (f17 > 0.0f) {
                            b(rectF, f17);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f14;
                        float f18 = this.f24869w;
                        if (f18 > 0.0f) {
                            c(rectF, f18);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f15;
                        float f19 = this.f24869w;
                        if (f19 > 0.0f) {
                            b(rectF, f19);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f14;
                        float f20 = this.f24869w;
                        if (f20 > 0.0f) {
                            c(rectF, f20);
                            break;
                        }
                        break;
                }
                if (rectF.left < f10) {
                    float f21 = this.f24869w;
                    if (f21 > 0.0f) {
                        rectF.bottom = c.x(rectF.right, f10, f21, rectF.top);
                    }
                    rectF.left = f10;
                } else if (rectF.right > getWidth() - f10) {
                    rectF.right = getWidth() - f10;
                    if (this.f24869w > 0.0f) {
                        rectF.bottom = (rectF.width() / this.f24869w) + rectF.top;
                    }
                }
                float f22 = f11 + this.E + f10;
                float f23 = this.D + f10;
                if (rectF.top < f22) {
                    float f24 = this.f24869w;
                    if (f24 > 0.0f) {
                        rectF.right = c.w(rectF.bottom, f22, f24, rectF.left);
                    }
                    rectF.top = f22;
                } else if (rectF.bottom > getHeight() - f23) {
                    rectF.bottom = getHeight() - f23;
                    if (this.f24869w > 0.0f) {
                        rectF.right = (rectF.height() * this.f24869w) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f25 = this.T;
                if (width3 < f25) {
                    rectF.right = rectF.left + f25;
                }
                float height3 = rectF.height();
                float f26 = this.T;
                if (height3 < f26) {
                    rectF.bottom = rectF.top + f26;
                }
                float f27 = this.f24869w;
                if (f27 > 0.0f) {
                    if (f27 < 1.0f) {
                        float width4 = rectF.width();
                        float f28 = this.T;
                        if (width4 <= f28) {
                            rectF.right = rectF.left + f28;
                            rectF.bottom = (rectF.width() / this.f24869w) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f29 = this.T;
                        if (height4 <= f29) {
                            rectF.bottom = rectF.top + f29;
                            rectF.right = (rectF.height() * this.f24869w) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.f24846a0;
                if (aVar2 != null) {
                    n nVar2 = (n) aVar2;
                    CropAreaView cropAreaView = nVar2.f51201a;
                    cropAreaView.g(3, false);
                    RectF rectF2 = nVar2.f51205f;
                    float centerX = rectF2.centerX() - cropAreaView.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView.getCropCenterY();
                    l lVar = nVar2.I;
                    if (lVar != null) {
                        l.f(lVar, centerX, centerY);
                    }
                    nVar2.r(false);
                    rectF2.set(cropAreaView.f24870x);
                    nVar2.e(true, false, false, false);
                    return true;
                }
            }
            return false;
        } else {
            this.f24848b0 = false;
            h(false);
            if (this.f24864o0 != 1) {
                this.f24864o0 = 1;
                a aVar3 = this.f24846a0;
                if (aVar3 != null) {
                    n nVar3 = (n) aVar3;
                    CropAreaView cropAreaView2 = nVar3.f51201a;
                    cropAreaView2.g(1, true);
                    nVar3.d(cropAreaView2.getTargetRectToFill());
                }
            }
            return false;
        }
        return true;
    }

    public void setActualRect(float f10) {
        a(this.f24870x, f10);
        j();
        invalidate();
    }

    public void setBottomPadding(float f10) {
        this.D = f10;
    }

    public void setDimAlpha(float f10) {
        this.H = f10;
    }

    public void setDimVisibility(boolean z4) {
        this.F = z4;
    }

    public void setFrameAlpha(float f10) {
        this.J = f10;
    }

    public void setFreeform(boolean z4) {
        this.f24850c0 = z4;
    }

    public void setIsVideo(boolean z4) {
        float f10;
        if (z4) {
            f10 = 64.0f;
        } else {
            f10 = 32.0f;
        }
        this.T = AndroidUtilities.dp(f10);
    }

    public void setListener(a aVar) {
        this.f24846a0 = aVar;
    }

    public void setLockedAspectRatio(float f10) {
        this.f24869w = f10;
    }

    public void setSubtitle(String str) {
        this.f24855f0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f10) {
        this.E = f10;
    }

    public void setActualRect(RectF rectF) {
        this.f24870x.set(rectF);
        j();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
    }
}
