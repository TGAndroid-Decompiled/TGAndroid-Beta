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
import org.telegram.ui.te1;
import tf.a;
import tf.l;
import tf.m;
import tf.n;
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
    public int f26347a;
    public boolean f26348a0;
    public float f26349b;
    public boolean f26350b0;
    public float f26351c;
    public Bitmap f26352c0;
    public RectF d;
    public Paint f26353d0;
    public RectF f26354e;
    public String f26355e0;
    public RectF f26356f;
    public StaticLayout f26357f0;
    public AnimatorSet f26358g0;
    public RectF h;
    public RectF f26359h0;
    public TextPaint f26360i0;
    public float f26361j0;
    public float f26362k0;
    public float f26363l0;
    public float m0;
    public RectF f26364n;
    public int f26365n0;
    public int f26366o0;
    public int f26367p0;
    public RectF f26368r;
    public RectF f26369s;
    public RectF v;
    public float f26370w;
    public RectF f26371x;
    public RectF f26372y;

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
        return this.U;
    }

    private void setCropBottom(float f10) {
        this.f26371x.bottom = f10;
        invalidate();
    }

    private void setCropLeft(float f10) {
        this.f26371x.left = f10;
        invalidate();
    }

    private void setCropRight(float f10) {
        this.f26371x.right = f10;
        invalidate();
    }

    private void setCropTop(float f10) {
        this.f26371x.top = f10;
        invalidate();
    }

    private void setGridProgress(float f10) {
        this.U = f10;
        invalidate();
    }

    public final void a(RectF rectF, float f10) {
        int i9;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.R;
        if (!this.T) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        float f16 = i9;
        float measuredHeight = ((getMeasuredHeight() - this.C) - this.D) - f16;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f17 = f15 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f17;
        float measuredWidth2 = getMeasuredWidth() - f17;
        float f18 = measuredHeight - f17;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f19 = (measuredHeight / 2.0f) + f16 + this.D;
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
        rectF.set(this.f26371x);
    }

    public final void e(int i9, int i10, boolean z10, boolean z11) {
        float f10;
        this.f26350b0 = z11;
        if (z10) {
            f10 = i10 / i9;
        } else {
            f10 = i9 / i10;
        }
        if (!z11) {
            f10 = 1.0f;
            this.f26370w = 1.0f;
        }
        setActualRect(f10);
    }

    public final void f(boolean z10, boolean z11) {
        this.F = z10;
        float f10 = 1.0f;
        if (z10) {
            if (z11) {
                f10 = 0.0f;
            }
            this.H = f10;
            this.J = SystemClock.elapsedRealtime();
            invalidate();
            return;
        }
        this.H = 1.0f;
    }

    public final void g(int i9, boolean z10) {
        float f10;
        ObjectAnimator objectAnimator = this.V;
        if (objectAnimator != null && (!z10 || this.f26367p0 != i9)) {
            objectAnimator.cancel();
            this.V = null;
        }
        int i10 = this.f26367p0;
        if (i10 == i9) {
            return;
        }
        this.f26366o0 = i10;
        this.f26367p0 = i9;
        if (i9 == 1) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            this.U = f10;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.U, f10);
        this.V = ofFloat;
        ofFloat.setDuration(200L);
        this.V.addListener(new te1(this, 8));
        if (i9 == 1) {
            this.V.setStartDelay(200L);
        }
        this.V.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.f26371x;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.f26371x.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.f26371x;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.f26371x;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.f26371x;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.f26371x.left;
    }

    public float getCropRight() {
        return this.f26371x.right;
    }

    public float getCropTop() {
        return this.f26371x.top;
    }

    public float getCropWidth() {
        RectF rectF = this.f26371x;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.Q;
    }

    public float getLockAspectRatio() {
        return this.f26370w;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.f26359h0;
        a(rectF, aspectRatio);
        return rectF;
    }

    public final void h(boolean z10) {
        int i9;
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z10) {
                i9 = systemUiVisibility | 4;
            } else {
                i9 = systemUiVisibility & (-5);
            }
            decorView.setSystemUiVisibility(i9);
        } catch (Exception unused) {
        }
    }

    public final void i() {
        if (this.f26355e0 != null) {
            if (this.f26360i0 == null) {
                TextPaint textPaint = new TextPaint();
                this.f26360i0 = textPaint;
                textPaint.setColor(i0.a.k(-1, 120));
                this.f26360i0.setTextSize(AndroidUtilities.dp(13.0f));
                this.f26360i0.setTextAlign(Paint.Align.CENTER);
            }
            this.f26357f0 = new StaticLayout(this.f26355e0, this.f26360i0, getMeasuredWidth() - AndroidUtilities.dp(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        this.f26357f0 = null;
    }

    public final void j() {
        int dp = AndroidUtilities.dp(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.f26371x;
        float f10 = rectF2.left;
        float f11 = dp;
        float f12 = rectF2.top;
        rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        RectF rectF3 = this.f26354e;
        float f13 = rectF2.right;
        float f14 = rectF2.top;
        rectF3.set(f13 - f11, f14 - f11, f13 + f11, f14 + f11);
        RectF rectF4 = this.f26356f;
        float f15 = rectF2.left;
        float f16 = rectF2.bottom;
        rectF4.set(f15 - f11, f16 - f11, f15 + f11, f16 + f11);
        RectF rectF5 = this.h;
        float f17 = rectF2.right;
        float f18 = rectF2.bottom;
        rectF5.set(f17 - f11, f18 - f11, f17 + f11, f18 + f11);
        float f19 = rectF2.top;
        this.f26364n.set(rectF2.left + f11, f19 - f11, rectF2.right - f11, f19 + f11);
        RectF rectF6 = this.f26368r;
        float f20 = rectF2.left;
        rectF6.set(f20 - f11, rectF2.top + f11, f20 + f11, rectF2.bottom - f11);
        RectF rectF7 = this.v;
        float f21 = rectF2.right;
        rectF7.set(f21 - f11, rectF2.top + f11, f21 + f11, rectF2.bottom - f11);
        float f22 = rectF2.bottom;
        this.f26369s.set(rectF2.left + f11, f22 - f11, rectF2.right - f11, f22 + f11);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Crop.CropAreaView.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26348a0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        i();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9;
        boolean z10;
        float f10 = this.R;
        RectF rectF = this.f26372y;
        int x10 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y10 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        if (!this.T) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        float f11 = i9;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.f26350b0) {
                float f12 = x10;
                float f13 = y10;
                if (this.d.contains(f12, f13)) {
                    this.f26365n0 = 2;
                } else if (this.f26354e.contains(f12, f13)) {
                    this.f26365n0 = 3;
                } else if (this.f26356f.contains(f12, f13)) {
                    this.f26365n0 = 4;
                } else if (this.h.contains(f12, f13)) {
                    this.f26365n0 = 5;
                } else if (this.f26368r.contains(f12, f13)) {
                    this.f26365n0 = 7;
                } else if (this.f26364n.contains(f12, f13)) {
                    this.f26365n0 = 6;
                } else if (this.v.contains(f12, f13)) {
                    this.f26365n0 = 9;
                } else if (this.f26369s.contains(f12, f13)) {
                    this.f26365n0 = 8;
                } else {
                    this.f26365n0 = 1;
                    return false;
                }
                this.A = x10;
                this.B = y10;
                g(3, false);
                this.f26348a0 = true;
                h(true);
                a aVar = this.W;
                if (aVar != null) {
                    n nVar = (n) aVar;
                    nVar.f47904a.d(nVar.f47908f);
                    nVar.f47909n = 0.0f;
                    m mVar = nVar.I;
                    if (mVar != null) {
                        mVar.C(false);
                        return true;
                    }
                }
            } else {
                this.f26365n0 = 1;
                return false;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2 && this.f26365n0 != 1) {
                rectF.set(this.f26371x);
                float f14 = x10 - this.A;
                float f15 = y10 - this.B;
                this.A = x10;
                this.B = y10;
                if (Math.abs(f14) > Math.abs(f15)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                switch (j.b(this.f26365n0)) {
                    case 1:
                        rectF.left += f14;
                        rectF.top += f15;
                        if (this.f26370w > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            if (z10) {
                                c(rectF, this.f26370w);
                            } else {
                                b(rectF, this.f26370w);
                            }
                            rectF.left -= rectF.width() - width;
                            rectF.top -= rectF.width() - height;
                            break;
                        }
                        break;
                    case 2:
                        rectF.right += f14;
                        rectF.top += f15;
                        if (this.f26370w > 0.0f) {
                            float height2 = rectF.height();
                            if (z10) {
                                c(rectF, this.f26370w);
                            } else {
                                b(rectF, this.f26370w);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f14;
                        rectF.bottom += f15;
                        if (this.f26370w > 0.0f) {
                            float width2 = rectF.width();
                            if (z10) {
                                c(rectF, this.f26370w);
                            } else {
                                b(rectF, this.f26370w);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f14;
                        rectF.bottom += f15;
                        float f16 = this.f26370w;
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
                        float f17 = this.f26370w;
                        if (f17 > 0.0f) {
                            b(rectF, f17);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f14;
                        float f18 = this.f26370w;
                        if (f18 > 0.0f) {
                            c(rectF, f18);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f15;
                        float f19 = this.f26370w;
                        if (f19 > 0.0f) {
                            b(rectF, f19);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f14;
                        float f20 = this.f26370w;
                        if (f20 > 0.0f) {
                            c(rectF, f20);
                            break;
                        }
                        break;
                }
                if (rectF.left < f10) {
                    float f21 = this.f26370w;
                    if (f21 > 0.0f) {
                        rectF.bottom = c.A(rectF.right, f10, f21, rectF.top);
                    }
                    rectF.left = f10;
                } else if (rectF.right > getWidth() - f10) {
                    rectF.right = getWidth() - f10;
                    if (this.f26370w > 0.0f) {
                        rectF.bottom = (rectF.width() / this.f26370w) + rectF.top;
                    }
                }
                float f22 = f11 + this.D + f10;
                float f23 = this.C + f10;
                if (rectF.top < f22) {
                    float f24 = this.f26370w;
                    if (f24 > 0.0f) {
                        rectF.right = c.z(rectF.bottom, f22, f24, rectF.left);
                    }
                    rectF.top = f22;
                } else if (rectF.bottom > getHeight() - f23) {
                    rectF.bottom = getHeight() - f23;
                    if (this.f26370w > 0.0f) {
                        rectF.right = (rectF.height() * this.f26370w) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f25 = this.S;
                if (width3 < f25) {
                    rectF.right = rectF.left + f25;
                }
                float height3 = rectF.height();
                float f26 = this.S;
                if (height3 < f26) {
                    rectF.bottom = rectF.top + f26;
                }
                float f27 = this.f26370w;
                if (f27 > 0.0f) {
                    if (f27 < 1.0f) {
                        float width4 = rectF.width();
                        float f28 = this.S;
                        if (width4 <= f28) {
                            rectF.right = rectF.left + f28;
                            rectF.bottom = (rectF.width() / this.f26370w) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f29 = this.S;
                        if (height4 <= f29) {
                            rectF.bottom = rectF.top + f29;
                            rectF.right = (rectF.height() * this.f26370w) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.W;
                if (aVar2 != null) {
                    n nVar2 = (n) aVar2;
                    CropAreaView cropAreaView = nVar2.f47904a;
                    cropAreaView.g(3, false);
                    RectF rectF2 = nVar2.f47908f;
                    float centerX = rectF2.centerX() - cropAreaView.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView.getCropCenterY();
                    l lVar = nVar2.H;
                    if (lVar != null) {
                        l.f(lVar, centerX, centerY);
                    }
                    nVar2.r(false);
                    rectF2.set(cropAreaView.f26371x);
                    nVar2.e(true, false, false, false);
                    return true;
                }
            }
            return false;
        } else {
            this.f26348a0 = false;
            h(false);
            if (this.f26365n0 != 1) {
                this.f26365n0 = 1;
                a aVar3 = this.W;
                if (aVar3 != null) {
                    n nVar3 = (n) aVar3;
                    CropAreaView cropAreaView2 = nVar3.f47904a;
                    cropAreaView2.g(1, true);
                    nVar3.d(cropAreaView2.getTargetRectToFill());
                }
            }
            return false;
        }
        return true;
    }

    public void setActualRect(float f10) {
        a(this.f26371x, f10);
        j();
        invalidate();
    }

    public void setBottomPadding(float f10) {
        this.C = f10;
    }

    public void setDimAlpha(float f10) {
        this.G = f10;
    }

    public void setDimVisibility(boolean z10) {
        this.E = z10;
    }

    public void setFrameAlpha(float f10) {
        this.I = f10;
    }

    public void setFreeform(boolean z10) {
        this.f26350b0 = z10;
    }

    public void setIsVideo(boolean z10) {
        float f10;
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 32.0f;
        }
        this.S = AndroidUtilities.dp(f10);
    }

    public void setListener(a aVar) {
        this.W = aVar;
    }

    public void setLockedAspectRatio(float f10) {
        this.f26370w = f10;
    }

    public void setSubtitle(String str) {
        this.f26355e0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f10) {
        this.D = f10;
    }

    public void setActualRect(RectF rectF) {
        this.f26371x.set(rectF);
        j();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
    }
}
