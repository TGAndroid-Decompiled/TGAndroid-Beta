package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.u81;
public final class x6 extends FrameLayout {
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public ValueAnimator I;
    public r1.g J;
    public float K;
    public float L;
    public float M;
    public float N;
    public r1.g O;
    public float P;
    public float Q;
    public long R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public boolean W;
    public final int f43333a;
    public final t6 f43334a0;
    public final int f43335b;
    public float f43336b0;
    public View f43337c;
    public Runnable f43338c0;
    public w6 d;
    public float f43339d0;
    public v6 f43340e;
    public double f43341e0;
    public vg.f f43342f;
    public long f43343f0;
    public float f43344g0;
    public ch0 h;
    public float f43345h0;
    public float f43346i0;
    public final t6 f43347j0;
    public int f43348k0;
    public final u6 f43349l0;
    public boolean f43350n;
    public boolean f43351r;
    public boolean f43352s;
    public boolean f43353w;
    public boolean f43354x;
    public boolean f43355y;

    public x6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(x6 x6Var) {
        if (x6Var.f43342f != null && x6Var.f43351r && !x6Var.f43355y) {
            x6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(x6 x6Var, boolean z9, float f10) {
        if (!z9 && f10 <= 1.001f && x6Var.f43342f != null) {
            x6Var.setRenderScale(1.0f);
        }
    }

    public static void c(x6 x6Var) {
        if (x6Var.f43342f != null) {
            x6Var.h(false);
            x6Var.f43348k0++;
            x6Var.removeCallbacks(x6Var.f43349l0);
            Choreographer.getInstance().removeFrameCallback(x6Var.f43347j0);
            x6Var.f43343f0 = 0L;
            x6Var.f43339d0 = 0.0f;
            x6Var.m(null);
            x6Var.setIdleAnimationEnabled(false);
            x6Var.setRendererPaused(true);
            w6 w6Var = x6Var.d;
            if (w6Var != null) {
                w6Var.setPaused(true);
                w6Var.onPause();
            }
            v6 v6Var = x6Var.f43340e;
            if (v6Var != null) {
                v6Var.o();
            }
            x6Var.removeView(x6Var.f43337c);
            x6Var.d = null;
            x6Var.f43340e = null;
            x6Var.f43342f = null;
            x6Var.g();
            View view = x6Var.f43337c;
            int i7 = x6Var.f43333a;
            x6Var.addView(view, new FrameLayout.LayoutParams(i7, i7, 17));
            x6Var.f43351r = false;
            if (x6Var.f43336b0 != 0.0f) {
                x6Var.h.getAnimatedDrawable().K(1);
            }
            x6Var.j();
            Runnable runnable = x6Var.f43338c0;
            x6Var.f43338c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z9) {
        w6 w6Var = this.d;
        if (w6Var != null) {
            w6Var.setIdleAnimationEnabled(z9);
        }
        v6 v6Var = this.f43340e;
        if (v6Var != null) {
            v6Var.setIdleAnimationEnabled(z9);
        }
    }

    private void setRenderScale(float f10) {
        w6 w6Var = this.d;
        if (w6Var != null) {
            w6Var.setRenderScale(f10);
        }
        if (this.f43340e != null) {
            this.f43342f.h = f10 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z9) {
        w6 w6Var = this.d;
        if (w6Var != null) {
            w6Var.setPaused(z9);
        }
        v6 v6Var = this.f43340e;
        if (v6Var != null) {
            v6Var.setPaused(z9);
        }
    }

    public final void d(float f10) {
        if (f10 > 1.0f && this.f43342f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            r1.g gVar = new r1.g(new r1.f(this.f43337c.getScaleX()));
            this.J = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f54279m = hVar;
            this.J.f(0.001f);
            this.J.b(new r6(this, 0));
            this.J.a(new s6(this, 0));
        }
        this.J.c(f10);
    }

    public final void e() {
        vg.f fVar = this.f43342f;
        if (fVar == null) {
            return;
        }
        float f10 = this.G;
        float f11 = this.f43344g0;
        float f12 = this.f43346i0;
        fVar.d = com.google.android.recaptcha.internal.a.z(1.0f, f12, f11, f10);
        fVar.f57388i = com.google.android.recaptcha.internal.a.z(1.0f, f12, this.f43345h0, this.H);
    }

    public final void f(x6 x6Var) {
        vg.f fVar;
        if (x6Var != null && (fVar = x6Var.f43342f) != null && this.f43342f != null) {
            this.G = fVar.d;
            this.H = fVar.f57388i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ch0 ch0Var = this.h;
        int i7 = this.f43335b;
        ch0Var.f(2131624355, i7, i7, null);
        this.h.getAnimatedDrawable().K(0);
        this.f43337c = this.h;
        setOnClickListener(new h3(this, 4));
        setClickable(!this.f43355y);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        vg.f fVar = this.f43342f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.f57388i + fVar.f57389j);
    }

    public float getFlightYaw() {
        vg.f fVar = this.f43342f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.d + fVar.f57386f);
    }

    public final void h(boolean z9) {
        ValueAnimator valueAnimator;
        if (this.D != -1) {
            this.D = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            vg.f fVar = this.f43342f;
            if (fVar != null) {
                if (z9) {
                    this.f43344g0 = (float) Math.IEEEremainder(fVar.d - this.G, 360.0d);
                    this.f43345h0 = (float) Math.IEEEremainder(this.f43342f.f57388i - this.H, 360.0d);
                    this.f43346i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(wq.h);
                    this.I.addUpdateListener(new r3(this, 4));
                    this.I.addListener(new u81(this, 9));
                    this.I.start();
                } else {
                    this.f43346i0 = 1.0f;
                    this.f43345h0 = 0.0f;
                    this.f43344g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z9 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f43346i0 = 1.0f;
            this.f43345h0 = 0.0f;
            this.f43344g0 = 0.0f;
            e();
        }
        if (this.f43337c != null) {
            if (z9) {
                d(1.0f);
                return;
            }
            r1.g gVar = this.J;
            if (gVar != null) {
                gVar.d();
                this.J = null;
            }
            this.f43337c.setScaleX(1.0f);
            this.f43337c.setScaleY(1.0f);
            if (this.f43342f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f43355y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f43349l0);
        setClickable(false);
        if (this.f43342f != null) {
            w6 w6Var = this.d;
            if (w6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                w6Var.J = max;
                w6Var.f57371a.h = w6Var.I / max;
                w6Var.f();
            }
            setIdleAnimationEnabled(false);
            vg.f fVar = this.f43342f;
            this.G = fVar.d;
            this.H = fVar.f57388i;
            if (this.f43351r) {
                Choreographer choreographer = Choreographer.getInstance();
                t6 t6Var = this.f43347j0;
                choreographer.removeFrameCallback(t6Var);
                this.f43343f0 = 0L;
                Choreographer.getInstance().postFrameCallback(t6Var);
            }
        }
    }

    public final void j() {
        boolean z9;
        if (!this.f43352s && this.f43350n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f43351r != z9) {
            this.f43351r = z9;
            if (!z9) {
                h(false);
            }
            int i7 = this.f43348k0 + 1;
            this.f43348k0 = i7;
            if (this.f43342f != null) {
                removeCallbacks(this.f43349l0);
                setIdleAnimationEnabled(false);
                if (this.f43355y) {
                    t6 t6Var = this.f43347j0;
                    if (z9) {
                        Choreographer.getInstance().removeFrameCallback(t6Var);
                        this.f43343f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(t6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(t6Var);
                        this.f43343f0 = 0L;
                        this.f43339d0 = 0.0f;
                    }
                } else if (z9) {
                    vg.f fVar = this.f43342f;
                    fVar.d = 0.0f;
                    fVar.f57388i = 0.0f;
                    m(new f2(this, i7, 2));
                }
                setRendererPaused(!z9);
                return;
            }
            ch0 ch0Var = this.h;
            if (ch0Var != null) {
                if (z9) {
                    if (!this.f43353w || this.f43354x) {
                        ch0Var.d();
                    }
                    this.f43353w = true;
                    return;
                }
                this.f43354x = ch0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        vg.f fVar = this.f43342f;
        if (fVar != null) {
            fVar.f57386f = this.T + this.L;
            return;
        }
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f43338c0 = runnable;
        if (this.f43342f != null) {
            m(new u6(this, 1));
        } else if (runnable != null) {
            post(new u6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        w6 w6Var = this.d;
        if (w6Var != null) {
            w6Var.f57379w = runnable;
            if (w6Var.f57378s && runnable != null) {
                w6Var.f57379w = null;
                runnable.run();
            }
        }
        v6 v6Var = this.f43340e;
        if (v6Var != null) {
            v6Var.f57419a0 = runnable;
            if (v6Var.W && runnable != null) {
                v6Var.f57419a0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43350n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f43350n = false;
        Choreographer.getInstance().removeFrameCallback(this.f43334a0);
        r1.g gVar = this.O;
        if (gVar != null) {
            gVar.d();
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
        if ((isEnabled() && this.f43355y && this.f43342f != null && this.f43351r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int paddingLeft = getPaddingLeft();
        int i11 = this.f43333a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i11, i7);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i11, i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f43337c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f43355y && this.f43342f != null && this.f43351r) {
            int actionMasked = motionEvent.getActionMasked();
            int i7 = 0;
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
                                    i7 = 1;
                                }
                                this.D = motionEvent.getPointerId(i7);
                                this.E = motionEvent.getX(i7);
                                this.F = motionEvent.getY(i7);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.D);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f10 = 0.8f / org.telegram.messenger.g0.f22566p;
                        vg.f fVar = this.f43342f;
                        fVar.d = com.google.android.recaptcha.internal.a.z(motionEvent.getX(findPointerIndex), this.E, f10, fVar.d);
                        vg.f fVar2 = this.f43342f;
                        fVar2.f57388i = com.google.android.recaptcha.internal.a.z(motionEvent.getY(findPointerIndex), this.F, f10, fVar2.f57388i);
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
            this.f43339d0 = 0.0f;
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
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        j();
    }

    @Override
    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        j();
    }

    @Override
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        j();
    }

    public void setContinuousRotation(float f10) {
        this.f43336b0 = f10;
        i();
        setEnabled(false);
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f10) {
        this.K = f10;
        vg.f fVar = this.f43342f;
        if (fVar != null) {
            fVar.f57387g = f10 + this.M;
            return;
        }
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.setRotation(f10 + this.M);
        }
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        if (!z9) {
            h(false);
        }
    }

    public void setHeaderTilt(float f10) {
        vg.f fVar = this.f43342f;
        if (fVar != null) {
            fVar.f57389j = f10;
        }
    }

    public void setIntroProgress(float f10) {
        float f11 = 1.0f;
        float f12 = 1.0f - f10;
        float f13 = (2.0f * f12) + 1.0f;
        this.f43337c.setScaleX(f13);
        this.f43337c.setScaleY(f13);
        if (this.f43342f != null) {
            if (f13 > 1.0f) {
                f11 = 3.5f;
            }
            setRenderScale(f11);
        }
        this.L = f12 * (-720.0f);
        this.M = ((float) Math.sin(f10 * 3.141592653589793d)) * 35.0f;
        k();
        vg.f fVar = this.f43342f;
        if (fVar != null) {
            fVar.f57387g = this.K + this.M;
            return;
        }
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z9) {
        this.f43352s = z9;
        j();
    }

    public void setStarParticlesView(ug.q1 q1Var) {
        w6 w6Var = this.d;
        if (w6Var != null) {
            w6Var.setStarParticlesView(q1Var);
        }
        v6 v6Var = this.f43340e;
        if (v6Var != null) {
            v6Var.setStarParticlesView(q1Var);
        }
    }
}
