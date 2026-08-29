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
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cc1;
import wf.a;
import wf.l;
import wf.m;
import wf.n;
public class CropAreaView extends ViewGroup {
    public int A;
    public int B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public long J;
    public Paint K;
    public Paint L;
    public Paint M;
    public Paint N;
    public Paint O;
    public Paint P;
    public AccelerateDecelerateInterpolator Q;
    public float R;
    public float S;
    public boolean T;
    public float U;
    public ObjectAnimator V;
    public a W;
    public int f26358a;
    public boolean f26359a0;
    public float f26360b;
    public boolean f26361b0;
    public float f26362c;
    public Bitmap f26363c0;
    public RectF d;
    public Paint f26364d0;
    public RectF f26365e;
    public String f26366e0;
    public RectF f26367f;
    public StaticLayout f26368f0;
    public AnimatorSet f26369g0;
    public RectF h;
    public RectF f26370h0;
    public TextPaint f26371i0;
    public float f26372j0;
    public float f26373k0;
    public float f26374l0;
    public float m0;
    public RectF f26375n;
    public int f26376n0;
    public int f26377o0;
    public int f26378p0;
    public RectF f26379r;
    public RectF f26380s;
    public RectF v;
    public float f26381w;
    public RectF f26382x;
    public RectF f26383y;

    public static void b(RectF rectF, float f9) {
        float height = rectF.height();
        rectF.right = rectF.left + (f9 * height);
        rectF.bottom = rectF.top + height;
    }

    public static void c(RectF rectF, float f9) {
        float width = rectF.width();
        rectF.right = rectF.left + width;
        rectF.bottom = rectF.top + (width / f9);
    }

    private float getGridProgress() {
        return this.U;
    }

    private void setCropBottom(float f9) {
        this.f26382x.bottom = f9;
        invalidate();
    }

    private void setCropLeft(float f9) {
        this.f26382x.left = f9;
        invalidate();
    }

    private void setCropRight(float f9) {
        this.f26382x.right = f9;
        invalidate();
    }

    private void setCropTop(float f9) {
        this.f26382x.top = f9;
        invalidate();
    }

    private void setGridProgress(float f9) {
        this.U = f9;
        invalidate();
    }

    public final void a(RectF rectF, float f9) {
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14 = this.R;
        if (!this.T) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f15 = i10;
        float measuredHeight = ((getMeasuredHeight() - this.C) - this.D) - f15;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f16 = f14 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f16;
        float measuredWidth2 = getMeasuredWidth() - f16;
        float f17 = measuredHeight - f16;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f18 = (measuredHeight / 2.0f) + f15 + this.D;
        if (Math.abs(1.0f - f9) < 1.0E-4d) {
            float f19 = min / 2.0f;
            f13 = measuredWidth3 - f19;
            f12 = f18 - f19;
            f10 = measuredWidth3 + f19;
            f11 = f18 + f19;
        } else {
            if (f9 - measuredWidth <= 1.0E-4d) {
                float f20 = f17 * f9;
                if (f20 <= measuredWidth2) {
                    float f21 = f20 / 2.0f;
                    f13 = measuredWidth3 - f21;
                    float f22 = f17 / 2.0f;
                    float f23 = f18 - f22;
                    f10 = measuredWidth3 + f21;
                    f11 = f18 + f22;
                    f12 = f23;
                }
            }
            float f24 = measuredWidth2 / 2.0f;
            float f25 = measuredWidth3 - f24;
            float f26 = (measuredWidth2 / f9) / 2.0f;
            float f27 = f18 - f26;
            f10 = measuredWidth3 + f24;
            f11 = f18 + f26;
            f12 = f27;
            f13 = f25;
        }
        rectF.set(f13, f12, f10, f11);
    }

    public final void d(RectF rectF) {
        rectF.set(this.f26382x);
    }

    public final void e(int i10, int i11, boolean z10, boolean z11) {
        float f9;
        this.f26361b0 = z11;
        if (z10) {
            f9 = i11 / i10;
        } else {
            f9 = i10 / i11;
        }
        if (!z11) {
            f9 = 1.0f;
            this.f26381w = 1.0f;
        }
        setActualRect(f9);
    }

    public final void f(boolean z10, boolean z11) {
        this.F = z10;
        float f9 = 1.0f;
        if (z10) {
            if (z11) {
                f9 = 0.0f;
            }
            this.H = f9;
            this.J = SystemClock.elapsedRealtime();
            invalidate();
            return;
        }
        this.H = 1.0f;
    }

    public final void g(int i10, boolean z10) {
        float f9;
        ObjectAnimator objectAnimator = this.V;
        if (objectAnimator != null && (!z10 || this.f26378p0 != i10)) {
            objectAnimator.cancel();
            this.V = null;
        }
        int i11 = this.f26378p0;
        if (i11 == i10) {
            return;
        }
        this.f26377o0 = i11;
        this.f26378p0 = i10;
        if (i10 == 1) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        if (!z10) {
            this.U = f9;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.U, f9);
        this.V = ofFloat;
        ofFloat.setDuration(200L);
        this.V.addListener(new cc1(this, 13));
        if (i10 == 1) {
            this.V.setStartDelay(200L);
        }
        this.V.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.f26382x;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.f26382x.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.f26382x;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.f26382x;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.f26382x;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.f26382x.left;
    }

    public float getCropRight() {
        return this.f26382x.right;
    }

    public float getCropTop() {
        return this.f26382x.top;
    }

    public float getCropWidth() {
        RectF rectF = this.f26382x;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.Q;
    }

    public float getLockAspectRatio() {
        return this.f26381w;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.f26370h0;
        a(rectF, aspectRatio);
        return rectF;
    }

    public final void h(boolean z10) {
        int i10;
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility | 4;
            } else {
                i10 = systemUiVisibility & (-5);
            }
            decorView.setSystemUiVisibility(i10);
        } catch (Exception unused) {
        }
    }

    public final void i() {
        if (this.f26366e0 != null) {
            if (this.f26371i0 == null) {
                TextPaint textPaint = new TextPaint();
                this.f26371i0 = textPaint;
                textPaint.setColor(i0.a.k(-1, 120));
                this.f26371i0.setTextSize(AndroidUtilities.dp(13.0f));
                this.f26371i0.setTextAlign(Paint.Align.CENTER);
            }
            this.f26368f0 = new StaticLayout(this.f26366e0, this.f26371i0, getMeasuredWidth() - AndroidUtilities.dp(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        this.f26368f0 = null;
    }

    public final void j() {
        int dp = AndroidUtilities.dp(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.f26382x;
        float f9 = rectF2.left;
        float f10 = dp;
        float f11 = rectF2.top;
        rectF.set(f9 - f10, f11 - f10, f9 + f10, f11 + f10);
        RectF rectF3 = this.f26365e;
        float f12 = rectF2.right;
        float f13 = rectF2.top;
        rectF3.set(f12 - f10, f13 - f10, f12 + f10, f13 + f10);
        RectF rectF4 = this.f26367f;
        float f14 = rectF2.left;
        float f15 = rectF2.bottom;
        rectF4.set(f14 - f10, f15 - f10, f14 + f10, f15 + f10);
        RectF rectF5 = this.h;
        float f16 = rectF2.right;
        float f17 = rectF2.bottom;
        rectF5.set(f16 - f10, f17 - f10, f16 + f10, f17 + f10);
        float f18 = rectF2.top;
        this.f26375n.set(rectF2.left + f10, f18 - f10, rectF2.right - f10, f18 + f10);
        RectF rectF6 = this.f26379r;
        float f19 = rectF2.left;
        rectF6.set(f19 - f10, rectF2.top + f10, f19 + f10, rectF2.bottom - f10);
        RectF rectF7 = this.v;
        float f20 = rectF2.right;
        rectF7.set(f20 - f10, rectF2.top + f10, f20 + f10, rectF2.bottom - f10);
        float f21 = rectF2.bottom;
        this.f26380s.set(rectF2.left + f10, f21 - f10, rectF2.right - f10, f21 + f10);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Crop.CropAreaView.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26359a0) {
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
        boolean z10;
        float f9 = this.R;
        RectF rectF = this.f26383y;
        int x4 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y8 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        if (!this.T) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f10 = i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.f26361b0) {
                float f11 = x4;
                float f12 = y8;
                if (this.d.contains(f11, f12)) {
                    this.f26376n0 = 2;
                } else if (this.f26365e.contains(f11, f12)) {
                    this.f26376n0 = 3;
                } else if (this.f26367f.contains(f11, f12)) {
                    this.f26376n0 = 4;
                } else if (this.h.contains(f11, f12)) {
                    this.f26376n0 = 5;
                } else if (this.f26379r.contains(f11, f12)) {
                    this.f26376n0 = 7;
                } else if (this.f26375n.contains(f11, f12)) {
                    this.f26376n0 = 6;
                } else if (this.v.contains(f11, f12)) {
                    this.f26376n0 = 9;
                } else if (this.f26380s.contains(f11, f12)) {
                    this.f26376n0 = 8;
                } else {
                    this.f26376n0 = 1;
                    return false;
                }
                this.A = x4;
                this.B = y8;
                g(3, false);
                this.f26359a0 = true;
                h(true);
                a aVar = this.W;
                if (aVar != null) {
                    n nVar = (n) aVar;
                    nVar.f49953a.d(nVar.f49957f);
                    nVar.f49958n = 0.0f;
                    m mVar = nVar.I;
                    if (mVar != null) {
                        mVar.P(false);
                        return true;
                    }
                }
            } else {
                this.f26376n0 = 1;
                return false;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2 && this.f26376n0 != 1) {
                rectF.set(this.f26382x);
                float f13 = x4 - this.A;
                float f14 = y8 - this.B;
                this.A = x4;
                this.B = y8;
                if (Math.abs(f13) > Math.abs(f14)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                switch (j.b(this.f26376n0)) {
                    case 1:
                        rectF.left += f13;
                        rectF.top += f14;
                        if (this.f26381w > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            if (z10) {
                                c(rectF, this.f26381w);
                            } else {
                                b(rectF, this.f26381w);
                            }
                            rectF.left -= rectF.width() - width;
                            rectF.top -= rectF.width() - height;
                            break;
                        }
                        break;
                    case 2:
                        rectF.right += f13;
                        rectF.top += f14;
                        if (this.f26381w > 0.0f) {
                            float height2 = rectF.height();
                            if (z10) {
                                c(rectF, this.f26381w);
                            } else {
                                b(rectF, this.f26381w);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f13;
                        rectF.bottom += f14;
                        if (this.f26381w > 0.0f) {
                            float width2 = rectF.width();
                            if (z10) {
                                c(rectF, this.f26381w);
                            } else {
                                b(rectF, this.f26381w);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f13;
                        rectF.bottom += f14;
                        float f15 = this.f26381w;
                        if (f15 > 0.0f) {
                            if (z10) {
                                c(rectF, f15);
                                break;
                            } else {
                                b(rectF, f15);
                                break;
                            }
                        }
                        break;
                    case 5:
                        rectF.top += f14;
                        float f16 = this.f26381w;
                        if (f16 > 0.0f) {
                            b(rectF, f16);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f13;
                        float f17 = this.f26381w;
                        if (f17 > 0.0f) {
                            c(rectF, f17);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f14;
                        float f18 = this.f26381w;
                        if (f18 > 0.0f) {
                            b(rectF, f18);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f13;
                        float f19 = this.f26381w;
                        if (f19 > 0.0f) {
                            c(rectF, f19);
                            break;
                        }
                        break;
                }
                if (rectF.left < f9) {
                    float f20 = this.f26381w;
                    if (f20 > 0.0f) {
                        rectF.bottom = com.google.android.recaptcha.internal.a.A(rectF.right, f9, f20, rectF.top);
                    }
                    rectF.left = f9;
                } else if (rectF.right > getWidth() - f9) {
                    rectF.right = getWidth() - f9;
                    if (this.f26381w > 0.0f) {
                        rectF.bottom = (rectF.width() / this.f26381w) + rectF.top;
                    }
                }
                float f21 = f10 + this.D + f9;
                float f22 = this.C + f9;
                if (rectF.top < f21) {
                    float f23 = this.f26381w;
                    if (f23 > 0.0f) {
                        rectF.right = com.google.android.recaptcha.internal.a.z(rectF.bottom, f21, f23, rectF.left);
                    }
                    rectF.top = f21;
                } else if (rectF.bottom > getHeight() - f22) {
                    rectF.bottom = getHeight() - f22;
                    if (this.f26381w > 0.0f) {
                        rectF.right = (rectF.height() * this.f26381w) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f24 = this.S;
                if (width3 < f24) {
                    rectF.right = rectF.left + f24;
                }
                float height3 = rectF.height();
                float f25 = this.S;
                if (height3 < f25) {
                    rectF.bottom = rectF.top + f25;
                }
                float f26 = this.f26381w;
                if (f26 > 0.0f) {
                    if (f26 < 1.0f) {
                        float width4 = rectF.width();
                        float f27 = this.S;
                        if (width4 <= f27) {
                            rectF.right = rectF.left + f27;
                            rectF.bottom = (rectF.width() / this.f26381w) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f28 = this.S;
                        if (height4 <= f28) {
                            rectF.bottom = rectF.top + f28;
                            rectF.right = (rectF.height() * this.f26381w) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.W;
                if (aVar2 != null) {
                    n nVar2 = (n) aVar2;
                    CropAreaView cropAreaView = nVar2.f49953a;
                    cropAreaView.g(3, false);
                    RectF rectF2 = nVar2.f49957f;
                    float centerX = rectF2.centerX() - cropAreaView.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView.getCropCenterY();
                    l lVar = nVar2.H;
                    if (lVar != null) {
                        l.f(lVar, centerX, centerY);
                    }
                    nVar2.r(false);
                    rectF2.set(cropAreaView.f26382x);
                    nVar2.e(true, false, false, false);
                    return true;
                }
            }
            return false;
        } else {
            this.f26359a0 = false;
            h(false);
            if (this.f26376n0 != 1) {
                this.f26376n0 = 1;
                a aVar3 = this.W;
                if (aVar3 != null) {
                    n nVar3 = (n) aVar3;
                    CropAreaView cropAreaView2 = nVar3.f49953a;
                    cropAreaView2.g(1, true);
                    nVar3.d(cropAreaView2.getTargetRectToFill());
                }
            }
            return false;
        }
        return true;
    }

    public void setActualRect(float f9) {
        a(this.f26382x, f9);
        j();
        invalidate();
    }

    public void setBottomPadding(float f9) {
        this.C = f9;
    }

    public void setDimAlpha(float f9) {
        this.G = f9;
    }

    public void setDimVisibility(boolean z10) {
        this.E = z10;
    }

    public void setFrameAlpha(float f9) {
        this.I = f9;
    }

    public void setFreeform(boolean z10) {
        this.f26361b0 = z10;
    }

    public void setIsVideo(boolean z10) {
        float f9;
        if (z10) {
            f9 = 64.0f;
        } else {
            f9 = 32.0f;
        }
        this.S = AndroidUtilities.dp(f9);
    }

    public void setListener(a aVar) {
        this.W = aVar;
    }

    public void setLockedAspectRatio(float f9) {
        this.f26381w = f9;
    }

    public void setSubtitle(String str) {
        this.f26366e0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f9) {
        this.D = f9;
    }

    public void setActualRect(RectF rectF) {
        this.f26382x.set(rectF);
        j();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
