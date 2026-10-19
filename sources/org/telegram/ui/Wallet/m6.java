package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.tf1;
public final class m6 extends FrameLayout {
    public float E;
    public float F;
    public float G;
    public float H;
    public ValueAnimator I;
    public o1.k J;
    public float K;
    public float L;
    public float M;
    public float N;
    public o1.k O;
    public float P;
    public float Q;
    public long R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public boolean W;
    public final int f34507a;
    public final i6 f34508a0;
    public final int f34509b;
    public float f34510b0;
    public View f34511c;
    public Runnable f34512c0;
    public l6 d;
    public float f34513d0;
    public k6 e;
    public double f34514e0;
    public tg.g f34515f;
    public long f34516f0;
    public float f34517g0;
    public xj0 h;
    public float f34518h0;
    public float f34519i0;
    public final i6 f34520j0;
    public int f34521k0;
    public final j6 f34522l0;
    public boolean f34523n;
    public boolean f34524r;
    public boolean f34525s;
    public boolean v;
    public boolean f34526w;
    public boolean f34527x;
    public int f34528y;

    public m6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(m6 m6Var) {
        if (m6Var.f34515f != null && m6Var.f34524r && !m6Var.f34527x) {
            m6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(m6 m6Var, boolean z10, float f7) {
        if (!z10 && f7 <= 1.001f && m6Var.f34515f != null) {
            m6Var.setRenderScale(1.0f);
        }
    }

    public static void c(m6 m6Var) {
        if (m6Var.f34515f != null) {
            m6Var.h(false);
            m6Var.f34521k0++;
            m6Var.removeCallbacks(m6Var.f34522l0);
            Choreographer.getInstance().removeFrameCallback(m6Var.f34520j0);
            m6Var.f34516f0 = 0L;
            m6Var.f34513d0 = 0.0f;
            m6Var.m(null);
            m6Var.setIdleAnimationEnabled(false);
            m6Var.setRendererPaused(true);
            l6 l6Var = m6Var.d;
            if (l6Var != null) {
                l6Var.setPaused(true);
                l6Var.onPause();
            }
            k6 k6Var = m6Var.e;
            if (k6Var != null) {
                k6Var.o();
            }
            m6Var.removeView(m6Var.f34511c);
            m6Var.d = null;
            m6Var.e = null;
            m6Var.f34515f = null;
            m6Var.g();
            View view = m6Var.f34511c;
            int i10 = m6Var.f34507a;
            m6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
            m6Var.f34524r = false;
            if (m6Var.f34510b0 != 0.0f) {
                m6Var.h.getAnimatedDrawable().K(1);
            }
            m6Var.j();
            Runnable runnable = m6Var.f34512c0;
            m6Var.f34512c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        l6 l6Var = this.d;
        if (l6Var != null) {
            l6Var.setIdleAnimationEnabled(z10);
        }
        k6 k6Var = this.e;
        if (k6Var != null) {
            k6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        l6 l6Var = this.d;
        if (l6Var != null) {
            l6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f34515f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        l6 l6Var = this.d;
        if (l6Var != null) {
            l6Var.setPaused(z10);
        }
        k6 k6Var = this.e;
        if (k6Var != null) {
            k6Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f34515f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.k kVar = new o1.k(new o1.j(this.f34511c.getScaleX()));
            this.J = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f17561u = lVar;
            this.J.e(0.001f);
            this.J.b(new g6(this, 0));
            this.J.a(new h6(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        tg.g gVar = this.f34515f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.f34517g0;
        float f11 = this.f34519i0;
        gVar.d = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, f10, f7);
        gVar.f47069i = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, this.f34518h0, this.H);
    }

    public final void f(m6 m6Var) {
        tg.g gVar;
        if (m6Var != null && (gVar = m6Var.f34515f) != null && this.f34515f != null) {
            this.G = gVar.d;
            this.H = gVar.f47069i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        xj0 xj0Var = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.f34509b;
        xj0Var.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.f34511c = this.h;
        setOnClickListener(new t2(this, 4));
        setClickable(!this.f34527x);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        tg.g gVar = this.f34515f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.f47069i + gVar.f47070j);
    }

    public float getFlightYaw() {
        tg.g gVar = this.f34515f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.d + gVar.f47067f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.f34528y != -1) {
            this.f34528y = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            tg.g gVar = this.f34515f;
            if (gVar != null) {
                if (z10) {
                    this.f34517g0 = (float) Math.IEEEremainder(gVar.d - this.G, 360.0d);
                    this.f34518h0 = (float) Math.IEEEremainder(this.f34515f.f47069i - this.H, 360.0d);
                    this.f34519i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(bs.h);
                    this.I.addUpdateListener(new b3(this, 4));
                    this.I.addListener(new tf1(this, 7));
                    this.I.start();
                } else {
                    this.f34519i0 = 1.0f;
                    this.f34518h0 = 0.0f;
                    this.f34517g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f34519i0 = 1.0f;
            this.f34518h0 = 0.0f;
            this.f34517g0 = 0.0f;
            e();
        }
        if (this.f34511c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            o1.k kVar = this.J;
            if (kVar != null) {
                kVar.c();
                this.J = null;
            }
            this.f34511c.setScaleX(1.0f);
            this.f34511c.setScaleY(1.0f);
            if (this.f34515f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f34527x = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f34522l0);
        setClickable(false);
        if (this.f34515f != null) {
            l6 l6Var = this.d;
            if (l6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                l6Var.J = max;
                l6Var.f47054a.h = l6Var.I / max;
                l6Var.f();
            }
            setIdleAnimationEnabled(false);
            tg.g gVar = this.f34515f;
            this.G = gVar.d;
            this.H = gVar.f47069i;
            if (this.f34524r) {
                Choreographer choreographer = Choreographer.getInstance();
                i6 i6Var = this.f34520j0;
                choreographer.removeFrameCallback(i6Var);
                this.f34516f0 = 0L;
                Choreographer.getInstance().postFrameCallback(i6Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f34525s && this.f34523n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f34524r != z10) {
            this.f34524r = z10;
            if (!z10) {
                h(false);
            }
            int i10 = this.f34521k0 + 1;
            this.f34521k0 = i10;
            if (this.f34515f != null) {
                removeCallbacks(this.f34522l0);
                setIdleAnimationEnabled(false);
                if (this.f34527x) {
                    i6 i6Var = this.f34520j0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(i6Var);
                        this.f34516f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(i6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(i6Var);
                        this.f34516f0 = 0L;
                        this.f34513d0 = 0.0f;
                    }
                } else if (z10) {
                    tg.g gVar = this.f34515f;
                    gVar.d = 0.0f;
                    gVar.f47069i = 0.0f;
                    m(new j(this, i10, 3));
                }
                setRendererPaused(!z10);
                return;
            }
            xj0 xj0Var = this.h;
            if (xj0Var != null) {
                if (z10) {
                    if (!this.v || this.f34526w) {
                        xj0Var.d();
                    }
                    this.v = true;
                    return;
                }
                this.f34526w = xj0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        tg.g gVar = this.f34515f;
        if (gVar != null) {
            gVar.f47067f = this.T + this.L;
            return;
        }
        xj0 xj0Var = this.h;
        if (xj0Var != null) {
            xj0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f34512c0 = runnable;
        if (this.f34515f != null) {
            m(new j6(this, 1));
        } else if (runnable != null) {
            post(new j6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        l6 l6Var = this.d;
        if (l6Var != null) {
            l6Var.v = runnable;
            if (l6Var.f47060s && runnable != null) {
                l6Var.v = null;
                runnable.run();
            }
        }
        k6 k6Var = this.e;
        if (k6Var != null) {
            k6Var.f47100a0 = runnable;
            if (k6Var.W && runnable != null) {
                k6Var.f47100a0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34523n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34523n = false;
        Choreographer.getInstance().removeFrameCallback(this.f34508a0);
        o1.k kVar = this.O;
        if (kVar != null) {
            kVar.c();
            this.O = null;
            setTranslationX(0.0f);
        }
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = 0L;
        this.W = false;
        this.S = false;
        this.V = 0L;
        this.U = 0.0f;
        this.T = 0.0f;
        k();
        j();
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((isEnabled() && this.f34527x && this.f34515f != null && this.f34524r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.f34507a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f34511c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f34527x && this.f34515f != null && this.f34524r) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.f34528y == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f34528y) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i10 = 1;
                                }
                                this.f34528y = motionEvent.getPointerId(i10);
                                this.E = motionEvent.getX(i10);
                                this.F = motionEvent.getY(i10);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f34528y);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f7 = 0.8f / AndroidUtilities.density;
                        tg.g gVar = this.f34515f;
                        gVar.d = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                        tg.g gVar2 = this.f34515f;
                        gVar2.f47069i = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.f47069i);
                        this.E = motionEvent.getX(findPointerIndex);
                        this.F = motionEvent.getY(findPointerIndex);
                        return true;
                    }
                }
                h(true);
                return true;
            }
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
                this.I = null;
            }
            this.f34513d0 = 0.0f;
            this.f34528y = motionEvent.getPointerId(0);
            this.E = motionEvent.getX();
            this.F = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            d(3.0f);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        j();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        j();
    }

    @Override
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        j();
    }

    public void setContinuousRotation(float f7) {
        this.f34510b0 = f7;
        i();
        setEnabled(false);
        xj0 xj0Var = this.h;
        if (xj0Var != null) {
            xj0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        tg.g gVar = this.f34515f;
        if (gVar != null) {
            gVar.f47068g = f7 + this.M;
            return;
        }
        xj0 xj0Var = this.h;
        if (xj0Var != null) {
            xj0Var.setRotation(f7 + this.M);
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            h(false);
        }
    }

    public void setHeaderTilt(float f7) {
        tg.g gVar = this.f34515f;
        if (gVar != null) {
            gVar.f47070j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f;
        float f11 = 1.0f - f7;
        float f12 = (2.0f * f11) + 1.0f;
        this.f34511c.setScaleX(f12);
        this.f34511c.setScaleY(f12);
        if (this.f34515f != null) {
            if (f12 > 1.0f) {
                f10 = 3.5f;
            }
            setRenderScale(f10);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        tg.g gVar = this.f34515f;
        if (gVar != null) {
            gVar.f47068g = this.K + this.M;
            return;
        }
        xj0 xj0Var = this.h;
        if (xj0Var != null) {
            xj0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.f34525s = z10;
        j();
    }

    public void setStarParticlesView(sg.x1 x1Var) {
        l6 l6Var = this.d;
        if (l6Var != null) {
            l6Var.setStarParticlesView(x1Var);
        }
        k6 k6Var = this.e;
        if (k6Var != null) {
            k6Var.setStarParticlesView(x1Var);
        }
    }
}
