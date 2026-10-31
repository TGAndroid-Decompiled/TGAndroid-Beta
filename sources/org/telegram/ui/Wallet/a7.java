package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qq;
import org.telegram.ui.ns0;
public final class a7 extends FrameLayout {
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public ValueAnimator I;
    public o1.j J;
    public float K;
    public float L;
    public float M;
    public float N;
    public o1.j O;
    public float P;
    public float Q;
    public long R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public boolean W;
    public final int f34192a;
    public final w6 f34193a0;
    public final int f34194b;
    public float f34195b0;
    public View f34196c;
    public Runnable f34197c0;
    public z6 d;
    public float f34198d0;
    public y6 e;
    public double f34199e0;
    public lg.h f34200f;
    public long f34201f0;
    public float f34202g0;
    public ei0 h;
    public float f34203h0;
    public float f34204i0;
    public final w6 f34205j0;
    public int f34206k0;
    public final x6 f34207l0;
    public boolean f34208n;
    public boolean f34209r;
    public boolean f34210s;
    public boolean f34211w;
    public boolean f34212x;
    public boolean f34213y;

    public a7(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.a7.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(a7 a7Var) {
        if (a7Var.f34200f != null && a7Var.f34209r && !a7Var.f34213y) {
            a7Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(a7 a7Var, boolean z10, float f7) {
        if (!z10 && f7 <= 1.001f && a7Var.f34200f != null) {
            a7Var.setRenderScale(1.0f);
        }
    }

    public static void c(a7 a7Var) {
        if (a7Var.f34200f != null) {
            a7Var.h(false);
            a7Var.f34206k0++;
            a7Var.removeCallbacks(a7Var.f34207l0);
            Choreographer.getInstance().removeFrameCallback(a7Var.f34205j0);
            a7Var.f34201f0 = 0L;
            a7Var.f34198d0 = 0.0f;
            a7Var.m(null);
            a7Var.setIdleAnimationEnabled(false);
            a7Var.setRendererPaused(true);
            z6 z6Var = a7Var.d;
            if (z6Var != null) {
                z6Var.setPaused(true);
                z6Var.onPause();
            }
            y6 y6Var = a7Var.e;
            if (y6Var != null) {
                y6Var.o();
            }
            a7Var.removeView(a7Var.f34196c);
            a7Var.d = null;
            a7Var.e = null;
            a7Var.f34200f = null;
            a7Var.g();
            View view = a7Var.f34196c;
            int i10 = a7Var.f34192a;
            a7Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
            a7Var.f34209r = false;
            if (a7Var.f34195b0 != 0.0f) {
                a7Var.h.getAnimatedDrawable().K(1);
            }
            a7Var.j();
            Runnable runnable = a7Var.f34197c0;
            a7Var.f34197c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        z6 z6Var = this.d;
        if (z6Var != null) {
            z6Var.setIdleAnimationEnabled(z10);
        }
        y6 y6Var = this.e;
        if (y6Var != null) {
            y6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        z6 z6Var = this.d;
        if (z6Var != null) {
            z6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f34200f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        z6 z6Var = this.d;
        if (z6Var != null) {
            z6Var.setPaused(z10);
        }
        y6 y6Var = this.e;
        if (y6Var != null) {
            y6Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f34200f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.j jVar = new o1.j(new o1.i(this.f34196c.getScaleX()));
            this.J = jVar;
            o1.k kVar = new o1.k(f7);
            kVar.a(0.55f);
            kVar.b(280.0f);
            jVar.f13957m = kVar;
            this.J.f(0.001f);
            this.J.b(new u6(this, 0));
            this.J.a(new v6(this, 0));
        }
        this.J.c(f7);
    }

    public final void e() {
        lg.h hVar = this.f34200f;
        if (hVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.f34202g0;
        float f11 = this.f34204i0;
        hVar.d = c3.i0.z(1.0f, f11, f10, f7);
        hVar.f11881i = c3.i0.z(1.0f, f11, this.f34203h0, this.H);
    }

    public final void f(a7 a7Var) {
        lg.h hVar;
        if (a7Var != null && (hVar = a7Var.f34200f) != null && this.f34200f != null) {
            this.G = hVar.d;
            this.H = hVar.f11881i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ei0 ei0Var = this.h;
        int i10 = this.f34194b;
        ei0Var.f(2131624353, i10, i10, null);
        this.h.getAnimatedDrawable().K(0);
        this.f34196c = this.h;
        setOnClickListener(new i3(this, 4));
        setClickable(!this.f34213y);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        lg.h hVar = this.f34200f;
        if (hVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(hVar.f11881i + hVar.f11882j);
    }

    public float getFlightYaw() {
        lg.h hVar = this.f34200f;
        if (hVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(hVar.d + hVar.f11879f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.D != -1) {
            this.D = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            lg.h hVar = this.f34200f;
            if (hVar != null) {
                if (z10) {
                    this.f34202g0 = (float) Math.IEEEremainder(hVar.d - this.G, 360.0d);
                    this.f34203h0 = (float) Math.IEEEremainder(this.f34200f.f11881i - this.H, 360.0d);
                    this.f34204i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(gr.h);
                    this.I.addUpdateListener(new r3(this, 4));
                    this.I.addListener(new ns0(this, 20));
                    this.I.start();
                } else {
                    this.f34204i0 = 1.0f;
                    this.f34203h0 = 0.0f;
                    this.f34202g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f34204i0 = 1.0f;
            this.f34203h0 = 0.0f;
            this.f34202g0 = 0.0f;
            e();
        }
        if (this.f34196c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            o1.j jVar = this.J;
            if (jVar != null) {
                jVar.d();
                this.J = null;
            }
            this.f34196c.setScaleX(1.0f);
            this.f34196c.setScaleY(1.0f);
            if (this.f34200f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f34213y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f34207l0);
        setClickable(false);
        if (this.f34200f != null) {
            z6 z6Var = this.d;
            if (z6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                z6Var.J = max;
                z6Var.f11866a.h = z6Var.I / max;
                z6Var.f();
            }
            setIdleAnimationEnabled(false);
            lg.h hVar = this.f34200f;
            this.G = hVar.d;
            this.H = hVar.f11881i;
            if (this.f34209r) {
                Choreographer choreographer = Choreographer.getInstance();
                w6 w6Var = this.f34205j0;
                choreographer.removeFrameCallback(w6Var);
                this.f34201f0 = 0L;
                Choreographer.getInstance().postFrameCallback(w6Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f34210s && this.f34208n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f34209r != z10) {
            this.f34209r = z10;
            if (!z10) {
                h(false);
            }
            int i10 = this.f34206k0 + 1;
            this.f34206k0 = i10;
            if (this.f34200f != null) {
                removeCallbacks(this.f34207l0);
                setIdleAnimationEnabled(false);
                if (this.f34213y) {
                    w6 w6Var = this.f34205j0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(w6Var);
                        this.f34201f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(w6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(w6Var);
                        this.f34201f0 = 0L;
                        this.f34198d0 = 0.0f;
                    }
                } else if (z10) {
                    lg.h hVar = this.f34200f;
                    hVar.d = 0.0f;
                    hVar.f11881i = 0.0f;
                    m(new qq(this, i10, 27));
                }
                setRendererPaused(!z10);
                return;
            }
            ei0 ei0Var = this.h;
            if (ei0Var != null) {
                if (z10) {
                    if (!this.f34211w || this.f34212x) {
                        ei0Var.d();
                    }
                    this.f34211w = true;
                    return;
                }
                this.f34212x = ei0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        lg.h hVar = this.f34200f;
        if (hVar != null) {
            hVar.f11879f = this.T + this.L;
            return;
        }
        ei0 ei0Var = this.h;
        if (ei0Var != null) {
            ei0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f34197c0 = runnable;
        if (this.f34200f != null) {
            m(new x6(this, 1));
        } else if (runnable != null) {
            post(new x6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        z6 z6Var = this.d;
        if (z6Var != null) {
            z6Var.f11873w = runnable;
            if (z6Var.f11872s && runnable != null) {
                z6Var.f11873w = null;
                runnable.run();
            }
        }
        y6 y6Var = this.e;
        if (y6Var != null) {
            y6Var.f11918a0 = runnable;
            if (y6Var.W && runnable != null) {
                y6Var.f11918a0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34208n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34208n = false;
        Choreographer.getInstance().removeFrameCallback(this.f34193a0);
        o1.j jVar = this.O;
        if (jVar != null) {
            jVar.d();
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
        if ((isEnabled() && this.f34213y && this.f34200f != null && this.f34209r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.f34192a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f34196c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f34213y && this.f34200f != null && this.f34209r) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.D == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.D) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i10 = 1;
                                }
                                this.D = motionEvent.getPointerId(i10);
                                this.E = motionEvent.getX(i10);
                                this.F = motionEvent.getY(i10);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.D);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f7 = 0.8f / org.telegram.messenger.i0.f16025p;
                        lg.h hVar = this.f34200f;
                        hVar.d = c3.i0.z(motionEvent.getX(findPointerIndex), this.E, f7, hVar.d);
                        lg.h hVar2 = this.f34200f;
                        hVar2.f11881i = c3.i0.z(motionEvent.getY(findPointerIndex), this.F, f7, hVar2.f11881i);
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
            this.f34198d0 = 0.0f;
            this.D = motionEvent.getPointerId(0);
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
        this.f34195b0 = f7;
        i();
        setEnabled(false);
        ei0 ei0Var = this.h;
        if (ei0Var != null) {
            ei0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        lg.h hVar = this.f34200f;
        if (hVar != null) {
            hVar.f11880g = f7 + this.M;
            return;
        }
        ei0 ei0Var = this.h;
        if (ei0Var != null) {
            ei0Var.setRotation(f7 + this.M);
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
        lg.h hVar = this.f34200f;
        if (hVar != null) {
            hVar.f11882j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f;
        float f11 = 1.0f - f7;
        float f12 = (2.0f * f11) + 1.0f;
        this.f34196c.setScaleX(f12);
        this.f34196c.setScaleY(f12);
        if (this.f34200f != null) {
            if (f12 > 1.0f) {
                f10 = 3.5f;
            }
            setRenderScale(f10);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        lg.h hVar = this.f34200f;
        if (hVar != null) {
            hVar.f11880g = this.K + this.M;
            return;
        }
        ei0 ei0Var = this.h;
        if (ei0Var != null) {
            ei0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.f34210s = z10;
        j();
    }

    public void setStarParticlesView(kg.g2 g2Var) {
        z6 z6Var = this.d;
        if (z6Var != null) {
            z6Var.setStarParticlesView(g2Var);
        }
        y6 y6Var = this.e;
        if (y6Var != null) {
            y6Var.setStarParticlesView(g2Var);
        }
    }
}
