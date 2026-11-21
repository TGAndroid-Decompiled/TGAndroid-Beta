package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.jw0;
import org.telegram.ui.k71;
public final class m7 extends FrameLayout {
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public ValueAnimator J;
    public r1.g K;
    public float L;
    public float M;
    public float N;
    public float O;
    public r1.g P;
    public float Q;
    public float R;
    public long S;
    public boolean T;
    public float U;
    public float V;
    public long W;
    public final int f44608a;
    public boolean f44609a0;
    public final int f44610b;
    public final i7 f44611b0;
    public View f44612c;
    public float f44613c0;
    public l7 d;
    public Runnable f44614d0;
    public k7 f44615e;
    public float f44616e0;
    public vg.f f44617f;
    public double f44618f0;
    public long f44619g0;
    public rh0 h;
    public float f44620h0;
    public float f44621i0;
    public float f44622j0;
    public final i7 f44623k0;
    public int f44624l0;
    public final j7 m0;
    public boolean f44625n;
    public boolean f44626r;
    public boolean f44627s;
    public boolean f44628w;
    public boolean f44629x;
    public boolean f44630y;

    public m7(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m7.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(m7 m7Var) {
        if (m7Var.f44617f != null && m7Var.f44626r && !m7Var.f44630y) {
            m7Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(m7 m7Var, boolean z10, float f10) {
        if (!z10 && f10 <= 1.001f && m7Var.f44617f != null) {
            m7Var.setRenderScale(1.0f);
        }
    }

    public static void c(m7 m7Var) {
        if (m7Var.f44617f != null) {
            m7Var.h(false);
            m7Var.f44624l0++;
            m7Var.removeCallbacks(m7Var.m0);
            Choreographer.getInstance().removeFrameCallback(m7Var.f44623k0);
            m7Var.f44619g0 = 0L;
            m7Var.f44616e0 = 0.0f;
            m7Var.m(null);
            m7Var.setIdleAnimationEnabled(false);
            m7Var.setRendererPaused(true);
            l7 l7Var = m7Var.d;
            if (l7Var != null) {
                l7Var.setPaused(true);
                l7Var.onPause();
            }
            k7 k7Var = m7Var.f44615e;
            if (k7Var != null) {
                k7Var.o();
            }
            m7Var.removeView(m7Var.f44612c);
            m7Var.d = null;
            m7Var.f44615e = null;
            m7Var.f44617f = null;
            m7Var.g();
            View view = m7Var.f44612c;
            int i7 = m7Var.f44608a;
            m7Var.addView(view, new FrameLayout.LayoutParams(i7, i7, 17));
            m7Var.f44626r = false;
            if (m7Var.f44613c0 != 0.0f) {
                m7Var.h.getAnimatedDrawable().K(1);
            }
            m7Var.j();
            Runnable runnable = m7Var.f44614d0;
            m7Var.f44614d0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        l7 l7Var = this.d;
        if (l7Var != null) {
            l7Var.setIdleAnimationEnabled(z10);
        }
        k7 k7Var = this.f44615e;
        if (k7Var != null) {
            k7Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f10) {
        l7 l7Var = this.d;
        if (l7Var != null) {
            l7Var.setRenderScale(f10);
        }
        if (this.f44615e != null) {
            this.f44617f.h = f10 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        l7 l7Var = this.d;
        if (l7Var != null) {
            l7Var.setPaused(z10);
        }
        k7 k7Var = this.f44615e;
        if (k7Var != null) {
            k7Var.setPaused(z10);
        }
    }

    public final void d(float f10) {
        if (f10 > 1.0f && this.f44617f != null) {
            setRenderScale(3.5f);
        }
        if (this.K == null) {
            r1.g gVar = new r1.g(new r1.f(this.f44612c.getScaleX()));
            this.K = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f56364m = hVar;
            this.K.f(0.001f);
            this.K.b(new g7(this, 0));
            this.K.a(new h7(this, 0));
        }
        this.K.c(f10);
    }

    public final void e() {
        vg.f fVar = this.f44617f;
        if (fVar == null) {
            return;
        }
        float f10 = this.H;
        float f11 = this.f44620h0;
        float f12 = this.f44622j0;
        fVar.d = com.google.android.gms.internal.vision.e2.z(1.0f, f12, f11, f10);
        fVar.f59469i = com.google.android.gms.internal.vision.e2.z(1.0f, f12, this.f44621i0, this.I);
    }

    public final void f(m7 m7Var) {
        vg.f fVar;
        if (m7Var != null && (fVar = m7Var.f44617f) != null && this.f44617f != null) {
            this.H = fVar.d;
            this.I = fVar.f59469i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        rh0 rh0Var = this.h;
        int i7 = this.f44610b;
        rh0Var.f(2131624356, i7, i7, null);
        this.h.getAnimatedDrawable().K(0);
        this.f44612c = this.h;
        setOnClickListener(new o3(this, 4));
        setClickable(!this.f44630y);
    }

    public float getConversionWobble() {
        return this.L;
    }

    public float getFlightPitch() {
        vg.f fVar = this.f44617f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.f59469i + fVar.f59470j);
    }

    public float getFlightYaw() {
        vg.f fVar = this.f44617f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.d + fVar.f59467f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.E != -1) {
            this.E = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            vg.f fVar = this.f44617f;
            if (fVar != null) {
                if (z10) {
                    this.f44620h0 = (float) Math.IEEEremainder(fVar.d - this.H, 360.0d);
                    this.f44621i0 = (float) Math.IEEEremainder(this.f44617f.f59469i - this.I, 360.0d);
                    this.f44622j0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.setDuration(350L);
                    this.J.setInterpolator(nr.h);
                    this.J.addUpdateListener(new z3(this, 4));
                    this.J.addListener(new k71(this, 10));
                    this.J.start();
                } else {
                    this.f44622j0 = 1.0f;
                    this.f44621i0 = 0.0f;
                    this.f44620h0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.J) != null) {
            valueAnimator.removeAllListeners();
            this.J.cancel();
            this.J = null;
            this.f44622j0 = 1.0f;
            this.f44621i0 = 0.0f;
            this.f44620h0 = 0.0f;
            e();
        }
        if (this.f44612c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            r1.g gVar = this.K;
            if (gVar != null) {
                gVar.d();
                this.K = null;
            }
            this.f44612c.setScaleX(1.0f);
            this.f44612c.setScaleY(1.0f);
            if (this.f44617f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f44630y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.m0);
        setClickable(false);
        if (this.f44617f != null) {
            l7 l7Var = this.d;
            if (l7Var != null) {
                float max = Math.max(1.0f, 3.5f);
                l7Var.K = max;
                l7Var.f59452a.h = l7Var.J / max;
                l7Var.f();
            }
            setIdleAnimationEnabled(false);
            vg.f fVar = this.f44617f;
            this.H = fVar.d;
            this.I = fVar.f59469i;
            if (this.f44626r) {
                Choreographer choreographer = Choreographer.getInstance();
                i7 i7Var = this.f44623k0;
                choreographer.removeFrameCallback(i7Var);
                this.f44619g0 = 0L;
                Choreographer.getInstance().postFrameCallback(i7Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f44627s && this.f44625n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f44626r != z10) {
            this.f44626r = z10;
            if (!z10) {
                h(false);
            }
            int i7 = this.f44624l0 + 1;
            this.f44624l0 = i7;
            if (this.f44617f != null) {
                removeCallbacks(this.m0);
                setIdleAnimationEnabled(false);
                if (this.f44630y) {
                    i7 i7Var = this.f44623k0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(i7Var);
                        this.f44619g0 = 0L;
                        Choreographer.getInstance().postFrameCallback(i7Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(i7Var);
                        this.f44619g0 = 0L;
                        this.f44616e0 = 0.0f;
                    }
                } else if (z10) {
                    vg.f fVar = this.f44617f;
                    fVar.d = 0.0f;
                    fVar.f59469i = 0.0f;
                    m(new jw0(this, i7, 8));
                }
                setRendererPaused(!z10);
                return;
            }
            rh0 rh0Var = this.h;
            if (rh0Var != null) {
                if (z10) {
                    if (!this.f44628w || this.f44629x) {
                        rh0Var.d();
                    }
                    this.f44628w = true;
                    return;
                }
                this.f44629x = rh0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        vg.f fVar = this.f44617f;
        if (fVar != null) {
            fVar.f59467f = this.U + this.M;
            return;
        }
        rh0 rh0Var = this.h;
        if (rh0Var != null) {
            rh0Var.setRotationY(this.U + this.M);
        }
    }

    public final void l(Runnable runnable) {
        this.f44614d0 = runnable;
        if (this.f44617f != null) {
            m(new j7(this, 1));
        } else if (runnable != null) {
            post(new j7(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        l7 l7Var = this.d;
        if (l7Var != null) {
            l7Var.f59460w = runnable;
            if (l7Var.f59459s && runnable != null) {
                l7Var.f59460w = null;
                runnable.run();
            }
        }
        k7 k7Var = this.f44615e;
        if (k7Var != null) {
            k7Var.f59502b0 = runnable;
            if (k7Var.f59500a0 && runnable != null) {
                k7Var.f59502b0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44625n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f44625n = false;
        Choreographer.getInstance().removeFrameCallback(this.f44611b0);
        r1.g gVar = this.P;
        if (gVar != null) {
            gVar.d();
            this.P = null;
            setTranslationX(0.0f);
        }
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0L;
        this.f44609a0 = false;
        this.T = false;
        this.W = 0L;
        this.V = 0.0f;
        this.U = 0.0f;
        k();
        j();
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((isEnabled() && this.f44630y && this.f44617f != null && this.f44626r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int paddingLeft = getPaddingLeft();
        int i11 = this.f44608a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i11, i7);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i11, i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f44612c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f44630y && this.f44617f != null && this.f44626r) {
            int actionMasked = motionEvent.getActionMasked();
            int i7 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.E == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.E) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i7 = 1;
                                }
                                this.E = motionEvent.getPointerId(i7);
                                this.F = motionEvent.getX(i7);
                                this.G = motionEvent.getY(i7);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.E);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f10 = 0.8f / org.telegram.messenger.g0.f24145p;
                        vg.f fVar = this.f44617f;
                        fVar.d = com.google.android.gms.internal.vision.e2.z(motionEvent.getX(findPointerIndex), this.F, f10, fVar.d);
                        vg.f fVar2 = this.f44617f;
                        fVar2.f59469i = com.google.android.gms.internal.vision.e2.z(motionEvent.getY(findPointerIndex), this.G, f10, fVar2.f59469i);
                        this.F = motionEvent.getX(findPointerIndex);
                        this.G = motionEvent.getY(findPointerIndex);
                        return true;
                    }
                }
                h(true);
                return true;
            }
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
                this.J = null;
            }
            this.f44616e0 = 0.0f;
            this.E = motionEvent.getPointerId(0);
            this.F = motionEvent.getX();
            this.G = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            d(3.0f);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        j();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        j();
    }

    @Override
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        j();
    }

    public void setContinuousRotation(float f10) {
        this.f44613c0 = f10;
        i();
        setEnabled(false);
        rh0 rh0Var = this.h;
        if (rh0Var != null) {
            rh0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f10) {
        this.L = f10;
        vg.f fVar = this.f44617f;
        if (fVar != null) {
            fVar.f59468g = f10 + this.N;
            return;
        }
        rh0 rh0Var = this.h;
        if (rh0Var != null) {
            rh0Var.setRotation(f10 + this.N);
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            h(false);
        }
    }

    public void setHeaderTilt(float f10) {
        vg.f fVar = this.f44617f;
        if (fVar != null) {
            fVar.f59470j = f10;
        }
    }

    public void setIntroProgress(float f10) {
        float f11 = 1.0f;
        float f12 = 1.0f - f10;
        float f13 = (2.0f * f12) + 1.0f;
        this.f44612c.setScaleX(f13);
        this.f44612c.setScaleY(f13);
        if (this.f44617f != null) {
            if (f13 > 1.0f) {
                f11 = 3.5f;
            }
            setRenderScale(f11);
        }
        this.M = f12 * (-720.0f);
        this.N = ((float) Math.sin(f10 * 3.141592653589793d)) * 35.0f;
        k();
        vg.f fVar = this.f44617f;
        if (fVar != null) {
            fVar.f59468g = this.L + this.N;
            return;
        }
        rh0 rh0Var = this.h;
        if (rh0Var != null) {
            rh0Var.setRotation(this.L + this.N);
        }
    }

    public void setPaused(boolean z10) {
        this.f44627s = z10;
        j();
    }

    public void setStarParticlesView(ug.t1 t1Var) {
        l7 l7Var = this.d;
        if (l7Var != null) {
            l7Var.setStarParticlesView(t1Var);
        }
        k7 k7Var = this.f44615e;
        if (k7Var != null) {
            k7Var.setStarParticlesView(t1Var);
        }
    }
}
