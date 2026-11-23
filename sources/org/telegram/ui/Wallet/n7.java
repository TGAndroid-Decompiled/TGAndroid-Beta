package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.ao0;
import org.telegram.ui.i71;
public final class n7 extends FrameLayout {
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
    public final int f44752a;
    public boolean f44753a0;
    public final int f44754b;
    public final j7 f44755b0;
    public View f44756c;
    public float f44757c0;
    public m7 d;
    public Runnable f44758d0;
    public l7 f44759e;
    public float f44760e0;
    public vg.f f44761f;
    public double f44762f0;
    public long f44763g0;
    public qh0 h;
    public float f44764h0;
    public float f44765i0;
    public float f44766j0;
    public final j7 f44767k0;
    public int f44768l0;
    public final k7 m0;
    public boolean f44769n;
    public boolean f44770r;
    public boolean f44771s;
    public boolean f44772w;
    public boolean f44773x;
    public boolean f44774y;

    public n7(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n7.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(n7 n7Var) {
        if (n7Var.f44761f != null && n7Var.f44770r && !n7Var.f44774y) {
            n7Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(n7 n7Var, boolean z10, float f10) {
        if (!z10 && f10 <= 1.001f && n7Var.f44761f != null) {
            n7Var.setRenderScale(1.0f);
        }
    }

    public static void c(n7 n7Var) {
        if (n7Var.f44761f != null) {
            n7Var.h(false);
            n7Var.f44768l0++;
            n7Var.removeCallbacks(n7Var.m0);
            Choreographer.getInstance().removeFrameCallback(n7Var.f44767k0);
            n7Var.f44763g0 = 0L;
            n7Var.f44760e0 = 0.0f;
            n7Var.m(null);
            n7Var.setIdleAnimationEnabled(false);
            n7Var.setRendererPaused(true);
            m7 m7Var = n7Var.d;
            if (m7Var != null) {
                m7Var.setPaused(true);
                m7Var.onPause();
            }
            l7 l7Var = n7Var.f44759e;
            if (l7Var != null) {
                l7Var.o();
            }
            n7Var.removeView(n7Var.f44756c);
            n7Var.d = null;
            n7Var.f44759e = null;
            n7Var.f44761f = null;
            n7Var.g();
            View view = n7Var.f44756c;
            int i7 = n7Var.f44752a;
            n7Var.addView(view, new FrameLayout.LayoutParams(i7, i7, 17));
            n7Var.f44770r = false;
            if (n7Var.f44757c0 != 0.0f) {
                n7Var.h.getAnimatedDrawable().K(1);
            }
            n7Var.j();
            Runnable runnable = n7Var.f44758d0;
            n7Var.f44758d0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.setIdleAnimationEnabled(z10);
        }
        l7 l7Var = this.f44759e;
        if (l7Var != null) {
            l7Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f10) {
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.setRenderScale(f10);
        }
        if (this.f44759e != null) {
            this.f44761f.h = f10 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.setPaused(z10);
        }
        l7 l7Var = this.f44759e;
        if (l7Var != null) {
            l7Var.setPaused(z10);
        }
    }

    public final void d(float f10) {
        if (f10 > 1.0f && this.f44761f != null) {
            setRenderScale(3.5f);
        }
        if (this.K == null) {
            r1.g gVar = new r1.g(new r1.f(this.f44756c.getScaleX()));
            this.K = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f56446m = hVar;
            this.K.f(0.001f);
            this.K.b(new h7(this, 0));
            this.K.a(new i7(this, 0));
        }
        this.K.c(f10);
    }

    public final void e() {
        vg.f fVar = this.f44761f;
        if (fVar == null) {
            return;
        }
        float f10 = this.H;
        float f11 = this.f44764h0;
        float f12 = this.f44766j0;
        fVar.d = com.google.android.gms.internal.vision.e2.z(1.0f, f12, f11, f10);
        fVar.f59558i = com.google.android.gms.internal.vision.e2.z(1.0f, f12, this.f44765i0, this.I);
    }

    public final void f(n7 n7Var) {
        vg.f fVar;
        if (n7Var != null && (fVar = n7Var.f44761f) != null && this.f44761f != null) {
            this.H = fVar.d;
            this.I = fVar.f59558i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        qh0 qh0Var = this.h;
        int i7 = this.f44754b;
        qh0Var.f(2131624356, i7, i7, null);
        this.h.getAnimatedDrawable().K(0);
        this.f44756c = this.h;
        setOnClickListener(new p3(this, 4));
        setClickable(!this.f44774y);
    }

    public float getConversionWobble() {
        return this.L;
    }

    public float getFlightPitch() {
        vg.f fVar = this.f44761f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.f59558i + fVar.f59559j);
    }

    public float getFlightYaw() {
        vg.f fVar = this.f44761f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.d + fVar.f59556f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.E != -1) {
            this.E = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            vg.f fVar = this.f44761f;
            if (fVar != null) {
                if (z10) {
                    this.f44764h0 = (float) Math.IEEEremainder(fVar.d - this.H, 360.0d);
                    this.f44765i0 = (float) Math.IEEEremainder(this.f44761f.f59558i - this.I, 360.0d);
                    this.f44766j0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.setDuration(350L);
                    this.J.setInterpolator(kr.h);
                    this.J.addUpdateListener(new a4(this, 4));
                    this.J.addListener(new i71(this, 10));
                    this.J.start();
                } else {
                    this.f44766j0 = 1.0f;
                    this.f44765i0 = 0.0f;
                    this.f44764h0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.J) != null) {
            valueAnimator.removeAllListeners();
            this.J.cancel();
            this.J = null;
            this.f44766j0 = 1.0f;
            this.f44765i0 = 0.0f;
            this.f44764h0 = 0.0f;
            e();
        }
        if (this.f44756c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            r1.g gVar = this.K;
            if (gVar != null) {
                gVar.d();
                this.K = null;
            }
            this.f44756c.setScaleX(1.0f);
            this.f44756c.setScaleY(1.0f);
            if (this.f44761f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f44774y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.m0);
        setClickable(false);
        if (this.f44761f != null) {
            m7 m7Var = this.d;
            if (m7Var != null) {
                float max = Math.max(1.0f, 3.5f);
                m7Var.K = max;
                m7Var.f59541a.h = m7Var.J / max;
                m7Var.f();
            }
            setIdleAnimationEnabled(false);
            vg.f fVar = this.f44761f;
            this.H = fVar.d;
            this.I = fVar.f59558i;
            if (this.f44770r) {
                Choreographer choreographer = Choreographer.getInstance();
                j7 j7Var = this.f44767k0;
                choreographer.removeFrameCallback(j7Var);
                this.f44763g0 = 0L;
                Choreographer.getInstance().postFrameCallback(j7Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f44771s && this.f44769n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f44770r != z10) {
            this.f44770r = z10;
            if (!z10) {
                h(false);
            }
            int i7 = this.f44768l0 + 1;
            this.f44768l0 = i7;
            if (this.f44761f != null) {
                removeCallbacks(this.m0);
                setIdleAnimationEnabled(false);
                if (this.f44774y) {
                    j7 j7Var = this.f44767k0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(j7Var);
                        this.f44763g0 = 0L;
                        Choreographer.getInstance().postFrameCallback(j7Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(j7Var);
                        this.f44763g0 = 0L;
                        this.f44760e0 = 0.0f;
                    }
                } else if (z10) {
                    vg.f fVar = this.f44761f;
                    fVar.d = 0.0f;
                    fVar.f59558i = 0.0f;
                    m(new ao0(this, i7, 10));
                }
                setRendererPaused(!z10);
                return;
            }
            qh0 qh0Var = this.h;
            if (qh0Var != null) {
                if (z10) {
                    if (!this.f44772w || this.f44773x) {
                        qh0Var.d();
                    }
                    this.f44772w = true;
                    return;
                }
                this.f44773x = qh0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        vg.f fVar = this.f44761f;
        if (fVar != null) {
            fVar.f59556f = this.U + this.M;
            return;
        }
        qh0 qh0Var = this.h;
        if (qh0Var != null) {
            qh0Var.setRotationY(this.U + this.M);
        }
    }

    public final void l(Runnable runnable) {
        this.f44758d0 = runnable;
        if (this.f44761f != null) {
            m(new k7(this, 1));
        } else if (runnable != null) {
            post(new k7(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.f59549w = runnable;
            if (m7Var.f59548s && runnable != null) {
                m7Var.f59549w = null;
                runnable.run();
            }
        }
        l7 l7Var = this.f44759e;
        if (l7Var != null) {
            l7Var.f59591b0 = runnable;
            if (l7Var.f59589a0 && runnable != null) {
                l7Var.f59591b0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44769n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f44769n = false;
        Choreographer.getInstance().removeFrameCallback(this.f44755b0);
        r1.g gVar = this.P;
        if (gVar != null) {
            gVar.d();
            this.P = null;
            setTranslationX(0.0f);
        }
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0L;
        this.f44753a0 = false;
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
        if ((isEnabled() && this.f44774y && this.f44761f != null && this.f44770r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int paddingLeft = getPaddingLeft();
        int i11 = this.f44752a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i11, i7);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i11, i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f44756c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f44774y && this.f44761f != null && this.f44770r) {
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
                        float f10 = 0.8f / org.telegram.messenger.g0.f24225p;
                        vg.f fVar = this.f44761f;
                        fVar.d = com.google.android.gms.internal.vision.e2.z(motionEvent.getX(findPointerIndex), this.F, f10, fVar.d);
                        vg.f fVar2 = this.f44761f;
                        fVar2.f59558i = com.google.android.gms.internal.vision.e2.z(motionEvent.getY(findPointerIndex), this.G, f10, fVar2.f59558i);
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
            this.f44760e0 = 0.0f;
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
        this.f44757c0 = f10;
        i();
        setEnabled(false);
        qh0 qh0Var = this.h;
        if (qh0Var != null) {
            qh0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f10) {
        this.L = f10;
        vg.f fVar = this.f44761f;
        if (fVar != null) {
            fVar.f59557g = f10 + this.N;
            return;
        }
        qh0 qh0Var = this.h;
        if (qh0Var != null) {
            qh0Var.setRotation(f10 + this.N);
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
        vg.f fVar = this.f44761f;
        if (fVar != null) {
            fVar.f59559j = f10;
        }
    }

    public void setIntroProgress(float f10) {
        float f11 = 1.0f;
        float f12 = 1.0f - f10;
        float f13 = (2.0f * f12) + 1.0f;
        this.f44756c.setScaleX(f13);
        this.f44756c.setScaleY(f13);
        if (this.f44761f != null) {
            if (f13 > 1.0f) {
                f11 = 3.5f;
            }
            setRenderScale(f11);
        }
        this.M = f12 * (-720.0f);
        this.N = ((float) Math.sin(f10 * 3.141592653589793d)) * 35.0f;
        k();
        vg.f fVar = this.f44761f;
        if (fVar != null) {
            fVar.f59557g = this.L + this.N;
            return;
        }
        qh0 qh0Var = this.h;
        if (qh0Var != null) {
            qh0Var.setRotation(this.L + this.N);
        }
    }

    public void setPaused(boolean z10) {
        this.f44771s = z10;
        j();
    }

    public void setStarParticlesView(ug.t1 t1Var) {
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.setStarParticlesView(t1Var);
        }
        l7 l7Var = this.f44759e;
        if (l7Var != null) {
            l7Var.setStarParticlesView(t1Var);
        }
    }
}
