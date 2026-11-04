package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;
public final class u6 extends FrameLayout {
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public ValueAnimator J;
    public q1.g K;
    public float L;
    public float M;
    public float N;
    public float O;
    public q1.g P;
    public float Q;
    public float R;
    public long S;
    public boolean T;
    public float U;
    public float V;
    public long W;
    public final int f43245a;
    public boolean f43246a0;
    public final int f43247b;
    public final q6 f43248b0;
    public View f43249c;
    public float f43250c0;
    public t6 d;
    public Runnable f43251d0;
    public s6 f43252e;
    public float f43253e0;
    public wg.f f43254f;
    public double f43255f0;
    public long f43256g0;
    public fh0 h;
    public float f43257h0;
    public float f43258i0;
    public float f43259j0;
    public final q6 f43260k0;
    public int f43261l0;
    public final r6 m0;
    public boolean f43262n;
    public boolean f43263r;
    public boolean f43264s;
    public boolean f43265w;
    public boolean f43266x;
    public boolean f43267y;

    public u6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.u6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(u6 u6Var) {
        if (u6Var.f43254f != null && u6Var.f43263r && !u6Var.f43267y) {
            u6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(u6 u6Var, boolean z10, float f10) {
        if (!z10 && f10 <= 1.001f && u6Var.f43254f != null) {
            u6Var.setRenderScale(1.0f);
        }
    }

    public static void c(u6 u6Var) {
        if (u6Var.f43254f != null) {
            u6Var.h(false);
            u6Var.f43261l0++;
            u6Var.removeCallbacks(u6Var.m0);
            Choreographer.getInstance().removeFrameCallback(u6Var.f43260k0);
            u6Var.f43256g0 = 0L;
            u6Var.f43253e0 = 0.0f;
            u6Var.m(null);
            u6Var.setIdleAnimationEnabled(false);
            u6Var.setRendererPaused(true);
            t6 t6Var = u6Var.d;
            if (t6Var != null) {
                t6Var.setPaused(true);
                t6Var.onPause();
            }
            s6 s6Var = u6Var.f43252e;
            if (s6Var != null) {
                s6Var.o();
            }
            u6Var.removeView(u6Var.f43249c);
            u6Var.d = null;
            u6Var.f43252e = null;
            u6Var.f43254f = null;
            u6Var.g();
            View view = u6Var.f43249c;
            int i3 = u6Var.f43245a;
            u6Var.addView(view, new FrameLayout.LayoutParams(i3, i3, 17));
            u6Var.f43263r = false;
            if (u6Var.f43250c0 != 0.0f) {
                u6Var.h.getAnimatedDrawable().K(1);
            }
            u6Var.j();
            Runnable runnable = u6Var.f43251d0;
            u6Var.f43251d0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.setIdleAnimationEnabled(z10);
        }
        s6 s6Var = this.f43252e;
        if (s6Var != null) {
            s6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f10) {
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.setRenderScale(f10);
        }
        if (this.f43252e != null) {
            this.f43254f.h = f10 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.setPaused(z10);
        }
        s6 s6Var = this.f43252e;
        if (s6Var != null) {
            s6Var.setPaused(z10);
        }
    }

    public final void d(float f10) {
        if (f10 > 1.0f && this.f43254f != null) {
            setRenderScale(3.5f);
        }
        if (this.K == null) {
            q1.g gVar = new q1.g(new q1.f(this.f43249c.getScaleX()));
            this.K = gVar;
            q1.h hVar = new q1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f53653m = hVar;
            this.K.f(0.001f);
            this.K.b(new o6(this, 0));
            this.K.a(new p6(this, 0));
        }
        this.K.c(f10);
    }

    public final void e() {
        wg.f fVar = this.f43254f;
        if (fVar == null) {
            return;
        }
        float f10 = this.H;
        float f11 = this.f43257h0;
        float f12 = this.f43259j0;
        fVar.d = com.google.android.recaptcha.internal.a.y(1.0f, f12, f11, f10);
        fVar.f57634i = com.google.android.recaptcha.internal.a.y(1.0f, f12, this.f43258i0, this.I);
    }

    public final void f(u6 u6Var) {
        wg.f fVar;
        if (u6Var != null && (fVar = u6Var.f43254f) != null && this.f43254f != null) {
            this.H = fVar.d;
            this.I = fVar.f57634i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        fh0 fh0Var = this.h;
        int i3 = this.f43247b;
        fh0Var.f(2131624355, i3, i3, null);
        this.h.getAnimatedDrawable().K(0);
        this.f43249c = this.h;
        setOnClickListener(new h3(this, 4));
        setClickable(!this.f43267y);
    }

    public float getConversionWobble() {
        return this.L;
    }

    public float getFlightPitch() {
        wg.f fVar = this.f43254f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.f57634i + fVar.f57635j);
    }

    public float getFlightYaw() {
        wg.f fVar = this.f43254f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.d + fVar.f57632f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.E != -1) {
            this.E = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            wg.f fVar = this.f43254f;
            if (fVar != null) {
                if (z10) {
                    this.f43257h0 = (float) Math.IEEEremainder(fVar.d - this.H, 360.0d);
                    this.f43258i0 = (float) Math.IEEEremainder(this.f43254f.f57634i - this.I, 360.0d);
                    this.f43259j0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.setDuration(350L);
                    this.J.setInterpolator(xq.h);
                    this.J.addUpdateListener(new p3(this, 4));
                    this.J.addListener(new i81(this, 9));
                    this.J.start();
                } else {
                    this.f43259j0 = 1.0f;
                    this.f43258i0 = 0.0f;
                    this.f43257h0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.J) != null) {
            valueAnimator.removeAllListeners();
            this.J.cancel();
            this.J = null;
            this.f43259j0 = 1.0f;
            this.f43258i0 = 0.0f;
            this.f43257h0 = 0.0f;
            e();
        }
        if (this.f43249c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            q1.g gVar = this.K;
            if (gVar != null) {
                gVar.d();
                this.K = null;
            }
            this.f43249c.setScaleX(1.0f);
            this.f43249c.setScaleY(1.0f);
            if (this.f43254f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f43267y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.m0);
        setClickable(false);
        if (this.f43254f != null) {
            t6 t6Var = this.d;
            if (t6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                t6Var.K = max;
                t6Var.f57617a.h = t6Var.J / max;
                t6Var.f();
            }
            setIdleAnimationEnabled(false);
            wg.f fVar = this.f43254f;
            this.H = fVar.d;
            this.I = fVar.f57634i;
            if (this.f43263r) {
                Choreographer choreographer = Choreographer.getInstance();
                q6 q6Var = this.f43260k0;
                choreographer.removeFrameCallback(q6Var);
                this.f43256g0 = 0L;
                Choreographer.getInstance().postFrameCallback(q6Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f43264s && this.f43262n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f43263r != z10) {
            this.f43263r = z10;
            if (!z10) {
                h(false);
            }
            int i3 = this.f43261l0 + 1;
            this.f43261l0 = i3;
            if (this.f43254f != null) {
                removeCallbacks(this.m0);
                setIdleAnimationEnabled(false);
                if (this.f43267y) {
                    q6 q6Var = this.f43260k0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(q6Var);
                        this.f43256g0 = 0L;
                        Choreographer.getInstance().postFrameCallback(q6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(q6Var);
                        this.f43256g0 = 0L;
                        this.f43253e0 = 0.0f;
                    }
                } else if (z10) {
                    wg.f fVar = this.f43254f;
                    fVar.d = 0.0f;
                    fVar.f57634i = 0.0f;
                    m(new f2(this, i3, 2));
                }
                setRendererPaused(!z10);
                return;
            }
            fh0 fh0Var = this.h;
            if (fh0Var != null) {
                if (z10) {
                    if (!this.f43265w || this.f43266x) {
                        fh0Var.d();
                    }
                    this.f43265w = true;
                    return;
                }
                this.f43266x = fh0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        wg.f fVar = this.f43254f;
        if (fVar != null) {
            fVar.f57632f = this.U + this.M;
            return;
        }
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.setRotationY(this.U + this.M);
        }
    }

    public final void l(Runnable runnable) {
        this.f43251d0 = runnable;
        if (this.f43254f != null) {
            m(new r6(this, 1));
        } else if (runnable != null) {
            post(new r6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.f57625w = runnable;
            if (t6Var.f57624s && runnable != null) {
                t6Var.f57625w = null;
                runnable.run();
            }
        }
        s6 s6Var = this.f43252e;
        if (s6Var != null) {
            s6Var.f57667b0 = runnable;
            if (s6Var.f57665a0 && runnable != null) {
                s6Var.f57667b0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43262n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f43262n = false;
        Choreographer.getInstance().removeFrameCallback(this.f43248b0);
        q1.g gVar = this.P;
        if (gVar != null) {
            gVar.d();
            this.P = null;
            setTranslationX(0.0f);
        }
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0L;
        this.f43246a0 = false;
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
        if ((isEnabled() && this.f43267y && this.f43254f != null && this.f43263r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int paddingLeft = getPaddingLeft();
        int i11 = this.f43245a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i11, i3);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i11, i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f43249c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f43267y && this.f43254f != null && this.f43263r) {
            int actionMasked = motionEvent.getActionMasked();
            int i3 = 0;
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
                                    i3 = 1;
                                }
                                this.E = motionEvent.getPointerId(i3);
                                this.F = motionEvent.getX(i3);
                                this.G = motionEvent.getY(i3);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.E);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f10 = 0.8f / org.telegram.messenger.g0.f22607p;
                        wg.f fVar = this.f43254f;
                        fVar.d = com.google.android.recaptcha.internal.a.y(motionEvent.getX(findPointerIndex), this.F, f10, fVar.d);
                        wg.f fVar2 = this.f43254f;
                        fVar2.f57634i = com.google.android.recaptcha.internal.a.y(motionEvent.getY(findPointerIndex), this.G, f10, fVar2.f57634i);
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
            this.f43253e0 = 0.0f;
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
    public final void onVisibilityChanged(View view, int i3) {
        super.onVisibilityChanged(view, i3);
        j();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        j();
    }

    @Override
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        j();
    }

    public void setContinuousRotation(float f10) {
        this.f43250c0 = f10;
        i();
        setEnabled(false);
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f10) {
        this.L = f10;
        wg.f fVar = this.f43254f;
        if (fVar != null) {
            fVar.f57633g = f10 + this.N;
            return;
        }
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.setRotation(f10 + this.N);
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
        wg.f fVar = this.f43254f;
        if (fVar != null) {
            fVar.f57635j = f10;
        }
    }

    public void setIntroProgress(float f10) {
        float f11 = 1.0f;
        float f12 = 1.0f - f10;
        float f13 = (2.0f * f12) + 1.0f;
        this.f43249c.setScaleX(f13);
        this.f43249c.setScaleY(f13);
        if (this.f43254f != null) {
            if (f13 > 1.0f) {
                f11 = 3.5f;
            }
            setRenderScale(f11);
        }
        this.M = f12 * (-720.0f);
        this.N = ((float) Math.sin(f10 * 3.141592653589793d)) * 35.0f;
        k();
        wg.f fVar = this.f43254f;
        if (fVar != null) {
            fVar.f57633g = this.L + this.N;
            return;
        }
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.setRotation(this.L + this.N);
        }
    }

    public void setPaused(boolean z10) {
        this.f43264s = z10;
        j();
    }

    public void setStarParticlesView(vg.t1 t1Var) {
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.setStarParticlesView(t1Var);
        }
        s6 s6Var = this.f43252e;
        if (s6Var != null) {
            s6Var.setStarParticlesView(t1Var);
        }
    }
}
