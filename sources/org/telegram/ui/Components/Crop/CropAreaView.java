package org.telegram.ui.Components.Crop;

import ah.b;
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
import m1.j;
import mg.a;
import mg.o;
import mg.p;
import mg.q;
import org.telegram.messenger.AndroidUtilities;
public class CropAreaView extends ViewGroup {
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
    public int f23941a;
    public boolean f23942a0;
    public float f23943b;
    public float f23944b0;
    public float f23945c;
    public ObjectAnimator f23946c0;
    public RectF d;
    public a f23947d0;
    public RectF f23948e;
    public boolean f23949e0;
    public RectF f23950f;
    public boolean f23951f0;
    public Bitmap f23952g0;
    public RectF h;
    public Paint f23953h0;
    public String f23954i0;
    public StaticLayout f23955j0;
    public AnimatorSet f23956k0;
    public RectF f23957l0;
    public TextPaint m0;
    public RectF f23958n;
    public float f23959n0;
    public float f23960o0;
    public float f23961p0;
    public float f23962q0;
    public RectF f23963r;
    public int f23964r0;
    public RectF f23965s;
    public int f23966s0;
    public int f23967t0;
    public RectF v;
    public float f23968w;
    public RectF f23969x;
    public RectF f23970y;

    public static void b(RectF rectF, float f7) {
        float height = rectF.height();
        rectF.right = rectF.left + (f7 * height);
        rectF.bottom = rectF.top + height;
    }

    public static void c(RectF rectF, float f7) {
        float width = rectF.width();
        rectF.right = rectF.left + width;
        rectF.bottom = rectF.top + (width / f7);
    }

    private float getGridProgress() {
        return this.f23944b0;
    }

    private void setCropBottom(float f7) {
        this.f23969x.bottom = f7;
        invalidate();
    }

    private void setCropLeft(float f7) {
        this.f23969x.left = f7;
        invalidate();
    }

    private void setCropRight(float f7) {
        this.f23969x.right = f7;
        invalidate();
    }

    private void setCropTop(float f7) {
        this.f23969x.top = f7;
        invalidate();
    }

    private void setGridProgress(float f7) {
        this.f23944b0 = f7;
        invalidate();
    }

    public final void a(RectF rectF, float f7) {
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14 = this.V;
        if (!this.f23942a0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f15 = i10;
        float measuredHeight = ((getMeasuredHeight() - this.G) - this.H) - f15;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f16 = f14 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f16;
        float measuredWidth2 = getMeasuredWidth() - f16;
        float f17 = measuredHeight - f16;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f18 = (measuredHeight / 2.0f) + f15 + this.H;
        if (Math.abs(1.0f - f7) < 1.0E-4d) {
            float f19 = min / 2.0f;
            f13 = measuredWidth3 - f19;
            f12 = f18 - f19;
            f10 = measuredWidth3 + f19;
            f11 = f18 + f19;
        } else {
            if (f7 - measuredWidth <= 1.0E-4d) {
                float f20 = f17 * f7;
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
            float f26 = (measuredWidth2 / f7) / 2.0f;
            float f27 = f18 - f26;
            f10 = measuredWidth3 + f24;
            f11 = f18 + f26;
            f12 = f27;
            f13 = f25;
        }
        rectF.set(f13, f12, f10, f11);
    }

    public final void d(RectF rectF) {
        rectF.set(this.f23969x);
    }

    public final void e(int i10, int i11, boolean z10, boolean z11) {
        float f7;
        this.f23951f0 = z11;
        if (z10) {
            f7 = i11 / i10;
        } else {
            f7 = i10 / i11;
        }
        if (!z11) {
            f7 = 1.0f;
            this.f23968w = 1.0f;
        }
        setActualRect(f7);
    }

    public final void f(boolean z10, boolean z11) {
        this.J = z10;
        float f7 = 1.0f;
        if (z10) {
            if (z11) {
                f7 = 0.0f;
            }
            this.L = f7;
            this.N = SystemClock.elapsedRealtime();
            invalidate();
            return;
        }
        this.L = 1.0f;
    }

    public final void g(int i10, boolean z10) {
        float f7;
        ObjectAnimator objectAnimator = this.f23946c0;
        if (objectAnimator != null && (!z10 || this.f23967t0 != i10)) {
            objectAnimator.cancel();
            this.f23946c0 = null;
        }
        int i11 = this.f23967t0;
        if (i11 == i10) {
            return;
        }
        this.f23966s0 = i11;
        this.f23967t0 = i10;
        if (i10 == 1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            this.f23944b0 = f7;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.f23944b0, f7);
        this.f23946c0 = ofFloat;
        ofFloat.setDuration(200L);
        this.f23946c0.addListener(new b(this, 29));
        if (i10 == 1) {
            this.f23946c0.setStartDelay(200L);
        }
        this.f23946c0.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.f23969x;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.f23969x.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.f23969x;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.f23969x;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.f23969x;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.f23969x.left;
    }

    public float getCropRight() {
        return this.f23969x.right;
    }

    public float getCropTop() {
        return this.f23969x.top;
    }

    public float getCropWidth() {
        RectF rectF = this.f23969x;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.U;
    }

    public float getLockAspectRatio() {
        return this.f23968w;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.f23957l0;
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
        if (this.f23954i0 != null) {
            if (this.m0 == null) {
                TextPaint textPaint = new TextPaint();
                this.m0 = textPaint;
                textPaint.setColor(i0.a.k(-1, 120));
                this.m0.setTextSize(AndroidUtilities.dp(13.0f));
                this.m0.setTextAlign(Paint.Align.CENTER);
            }
            this.f23955j0 = new StaticLayout(this.f23954i0, this.m0, getMeasuredWidth() - AndroidUtilities.dp(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        this.f23955j0 = null;
    }

    public final void j() {
        int dp = AndroidUtilities.dp(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.f23969x;
        float f7 = rectF2.left;
        float f10 = dp;
        float f11 = rectF2.top;
        rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
        RectF rectF3 = this.f23948e;
        float f12 = rectF2.right;
        float f13 = rectF2.top;
        rectF3.set(f12 - f10, f13 - f10, f12 + f10, f13 + f10);
        RectF rectF4 = this.f23950f;
        float f14 = rectF2.left;
        float f15 = rectF2.bottom;
        rectF4.set(f14 - f10, f15 - f10, f14 + f10, f15 + f10);
        RectF rectF5 = this.h;
        float f16 = rectF2.right;
        float f17 = rectF2.bottom;
        rectF5.set(f16 - f10, f17 - f10, f16 + f10, f17 + f10);
        float f18 = rectF2.top;
        this.f23958n.set(rectF2.left + f10, f18 - f10, rectF2.right - f10, f18 + f10);
        RectF rectF6 = this.f23963r;
        float f19 = rectF2.left;
        rectF6.set(f19 - f10, rectF2.top + f10, f19 + f10, rectF2.bottom - f10);
        RectF rectF7 = this.v;
        float f20 = rectF2.right;
        rectF7.set(f20 - f10, rectF2.top + f10, f20 + f10, rectF2.bottom - f10);
        float f21 = rectF2.bottom;
        this.f23965s.set(rectF2.left + f10, f21 - f10, rectF2.right - f10, f21 + f10);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Crop.CropAreaView.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f23949e0) {
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
        float f7 = this.V;
        RectF rectF = this.f23970y;
        int x10 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y3 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        if (!this.f23942a0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f10 = i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.f23951f0) {
                float f11 = x10;
                float f12 = y3;
                if (this.d.contains(f11, f12)) {
                    this.f23964r0 = 2;
                } else if (this.f23948e.contains(f11, f12)) {
                    this.f23964r0 = 3;
                } else if (this.f23950f.contains(f11, f12)) {
                    this.f23964r0 = 4;
                } else if (this.h.contains(f11, f12)) {
                    this.f23964r0 = 5;
                } else if (this.f23963r.contains(f11, f12)) {
                    this.f23964r0 = 7;
                } else if (this.f23958n.contains(f11, f12)) {
                    this.f23964r0 = 6;
                } else if (this.v.contains(f11, f12)) {
                    this.f23964r0 = 9;
                } else if (this.f23965s.contains(f11, f12)) {
                    this.f23964r0 = 8;
                } else {
                    this.f23964r0 = 1;
                    return false;
                }
                this.E = x10;
                this.F = y3;
                g(3, false);
                this.f23949e0 = true;
                h(true);
                a aVar = this.f23947d0;
                if (aVar != null) {
                    q qVar = (q) aVar;
                    qVar.f16303a.d(qVar.f16307f);
                    qVar.f16308n = 0.0f;
                    p pVar = qVar.M;
                    if (pVar != null) {
                        pVar.W(false);
                        return true;
                    }
                }
            } else {
                this.f23964r0 = 1;
                return false;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2 && this.f23964r0 != 1) {
                rectF.set(this.f23969x);
                float f13 = x10 - this.E;
                float f14 = y3 - this.F;
                this.E = x10;
                this.F = y3;
                if (Math.abs(f13) > Math.abs(f14)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                switch (j.c(this.f23964r0)) {
                    case 1:
                        rectF.left += f13;
                        rectF.top += f14;
                        if (this.f23968w > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            if (z10) {
                                c(rectF, this.f23968w);
                            } else {
                                b(rectF, this.f23968w);
                            }
                            rectF.left -= rectF.width() - width;
                            rectF.top -= rectF.width() - height;
                            break;
                        }
                        break;
                    case 2:
                        rectF.right += f13;
                        rectF.top += f14;
                        if (this.f23968w > 0.0f) {
                            float height2 = rectF.height();
                            if (z10) {
                                c(rectF, this.f23968w);
                            } else {
                                b(rectF, this.f23968w);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f13;
                        rectF.bottom += f14;
                        if (this.f23968w > 0.0f) {
                            float width2 = rectF.width();
                            if (z10) {
                                c(rectF, this.f23968w);
                            } else {
                                b(rectF, this.f23968w);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f13;
                        rectF.bottom += f14;
                        float f15 = this.f23968w;
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
                        float f16 = this.f23968w;
                        if (f16 > 0.0f) {
                            b(rectF, f16);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f13;
                        float f17 = this.f23968w;
                        if (f17 > 0.0f) {
                            c(rectF, f17);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f14;
                        float f18 = this.f23968w;
                        if (f18 > 0.0f) {
                            b(rectF, f18);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f13;
                        float f19 = this.f23968w;
                        if (f19 > 0.0f) {
                            c(rectF, f19);
                            break;
                        }
                        break;
                }
                if (rectF.left < f7) {
                    float f20 = this.f23968w;
                    if (f20 > 0.0f) {
                        rectF.bottom = e2.A(rectF.right, f7, f20, rectF.top);
                    }
                    rectF.left = f7;
                } else if (rectF.right > getWidth() - f7) {
                    rectF.right = getWidth() - f7;
                    if (this.f23968w > 0.0f) {
                        rectF.bottom = (rectF.width() / this.f23968w) + rectF.top;
                    }
                }
                float f21 = f10 + this.H + f7;
                float f22 = this.G + f7;
                if (rectF.top < f21) {
                    float f23 = this.f23968w;
                    if (f23 > 0.0f) {
                        rectF.right = e2.z(rectF.bottom, f21, f23, rectF.left);
                    }
                    rectF.top = f21;
                } else if (rectF.bottom > getHeight() - f22) {
                    rectF.bottom = getHeight() - f22;
                    if (this.f23968w > 0.0f) {
                        rectF.right = (rectF.height() * this.f23968w) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f24 = this.W;
                if (width3 < f24) {
                    rectF.right = rectF.left + f24;
                }
                float height3 = rectF.height();
                float f25 = this.W;
                if (height3 < f25) {
                    rectF.bottom = rectF.top + f25;
                }
                float f26 = this.f23968w;
                if (f26 > 0.0f) {
                    if (f26 < 1.0f) {
                        float width4 = rectF.width();
                        float f27 = this.W;
                        if (width4 <= f27) {
                            rectF.right = rectF.left + f27;
                            rectF.bottom = (rectF.width() / this.f23968w) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f28 = this.W;
                        if (height4 <= f28) {
                            rectF.bottom = rectF.top + f28;
                            rectF.right = (rectF.height() * this.f23968w) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.f23947d0;
                if (aVar2 != null) {
                    q qVar2 = (q) aVar2;
                    CropAreaView cropAreaView = qVar2.f16303a;
                    cropAreaView.g(3, false);
                    RectF rectF2 = qVar2.f16307f;
                    float centerX = rectF2.centerX() - cropAreaView.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView.getCropCenterY();
                    o oVar = qVar2.L;
                    if (oVar != null) {
                        o.f(oVar, centerX, centerY);
                    }
                    qVar2.r(false);
                    rectF2.set(cropAreaView.f23969x);
                    qVar2.e(true, false, false, false);
                    return true;
                }
            }
            return false;
        } else {
            this.f23949e0 = false;
            h(false);
            if (this.f23964r0 != 1) {
                this.f23964r0 = 1;
                a aVar3 = this.f23947d0;
                if (aVar3 != null) {
                    q qVar3 = (q) aVar3;
                    CropAreaView cropAreaView2 = qVar3.f16303a;
                    cropAreaView2.g(1, true);
                    qVar3.d(cropAreaView2.getTargetRectToFill());
                }
            }
            return false;
        }
        return true;
    }

    public void setActualRect(float f7) {
        a(this.f23969x, f7);
        j();
        invalidate();
    }

    public void setBottomPadding(float f7) {
        this.G = f7;
    }

    public void setDimAlpha(float f7) {
        this.K = f7;
    }

    public void setDimVisibility(boolean z10) {
        this.I = z10;
    }

    public void setFrameAlpha(float f7) {
        this.M = f7;
    }

    public void setFreeform(boolean z10) {
        this.f23951f0 = z10;
    }

    public void setIsVideo(boolean z10) {
        float f7;
        if (z10) {
            f7 = 64.0f;
        } else {
            f7 = 32.0f;
        }
        this.W = AndroidUtilities.dp(f7);
    }

    public void setListener(a aVar) {
        this.f23947d0 = aVar;
    }

    public void setLockedAspectRatio(float f7) {
        this.f23968w = f7;
    }

    public void setSubtitle(String str) {
        this.f23954i0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f7) {
        this.H = f7;
    }

    public void setActualRect(RectF rectF) {
        this.f23969x.set(rectF);
        j();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
